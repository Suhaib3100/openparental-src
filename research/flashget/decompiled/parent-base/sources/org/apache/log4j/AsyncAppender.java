package org.apache.log4j;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.log4j.helpers.AppenderAttachableImpl;
import org.apache.log4j.helpers.LogLog;
import org.apache.log4j.spi.AppenderAttachable;
import org.apache.log4j.spi.LoggingEvent;

/* loaded from: classes3.dex */
public class AsyncAppender extends AppenderSkeleton implements AppenderAttachable {
    public static final int DEFAULT_BUFFER_SIZE = 128;
    AppenderAttachableImpl aai;
    private final AppenderAttachableImpl appenders;
    private boolean blocking;
    private final List buffer;
    private int bufferSize;
    private final Map discardMap;
    private final Thread dispatcher;
    private boolean locationInfo;

    private static final class DiscardSummary {
        private int count = 1;
        private LoggingEvent maxEvent;

        public DiscardSummary(LoggingEvent loggingEvent) {
            this.maxEvent = loggingEvent;
        }

        public void add(LoggingEvent loggingEvent) {
            if (loggingEvent.getLevel().toInt() > this.maxEvent.getLevel().toInt()) {
                this.maxEvent = loggingEvent;
            }
            this.count++;
        }

        public LoggingEvent createEvent() {
            return new LoggingEvent("org.apache.log4j.AsyncAppender.DONT_REPORT_LOCATION", Logger.getLogger(this.maxEvent.getLoggerName()), this.maxEvent.getLevel(), MessageFormat.format("Discarded {0} messages due to full event buffer including: {1}", new Integer(this.count), this.maxEvent.getMessage()), null);
        }
    }

    private static class Dispatcher implements Runnable {
        private final AppenderAttachableImpl appenders;
        private final List buffer;
        private final Map discardMap;
        private final AsyncAppender parent;

        public Dispatcher(AsyncAppender asyncAppender, List list, Map map, AppenderAttachableImpl appenderAttachableImpl) {
            this.parent = asyncAppender;
            this.buffer = list;
            this.appenders = appenderAttachableImpl;
            this.discardMap = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z4;
            LoggingEvent[] loggingEventArr;
            boolean z5 = true;
            while (z5) {
                try {
                    synchronized (this.buffer) {
                        try {
                            int size = this.buffer.size();
                            boolean z6 = this.parent.closed;
                            while (true) {
                                z4 = !z6;
                                if (size != 0 || !z4) {
                                    break;
                                }
                                this.buffer.wait();
                                size = this.buffer.size();
                                z6 = this.parent.closed;
                            }
                            if (size > 0) {
                                loggingEventArr = new LoggingEvent[this.discardMap.size() + size];
                                this.buffer.toArray(loggingEventArr);
                                Iterator it = this.discardMap.values().iterator();
                                while (it.hasNext()) {
                                    loggingEventArr[size] = ((DiscardSummary) it.next()).createEvent();
                                    size++;
                                }
                                this.buffer.clear();
                                this.discardMap.clear();
                                this.buffer.notifyAll();
                            } else {
                                loggingEventArr = null;
                            }
                        } finally {
                        }
                    }
                    if (loggingEventArr != null) {
                        for (LoggingEvent loggingEvent : loggingEventArr) {
                            synchronized (this.appenders) {
                                this.appenders.appendLoopOnAppenders(loggingEvent);
                            }
                        }
                    }
                    z5 = z4;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }

    public AsyncAppender() {
        ArrayList arrayList = new ArrayList();
        this.buffer = arrayList;
        HashMap hashMap = new HashMap();
        this.discardMap = hashMap;
        this.bufferSize = 128;
        this.locationInfo = false;
        this.blocking = true;
        AppenderAttachableImpl appenderAttachableImpl = new AppenderAttachableImpl();
        this.appenders = appenderAttachableImpl;
        this.aai = appenderAttachableImpl;
        Thread thread = new Thread(new Dispatcher(this, arrayList, hashMap, appenderAttachableImpl));
        this.dispatcher = thread;
        thread.setDaemon(true);
        thread.setName("AsyncAppender-Dispatcher-" + thread.getName());
        thread.start();
    }

    @Override // org.apache.log4j.spi.AppenderAttachable
    public void addAppender(Appender appender) {
        synchronized (this.appenders) {
            this.appenders.addAppender(appender);
        }
    }

    @Override // org.apache.log4j.AppenderSkeleton
    public void append(LoggingEvent loggingEvent) {
        Thread thread = this.dispatcher;
        if (thread == null || !thread.isAlive() || this.bufferSize <= 0) {
            synchronized (this.appenders) {
                this.appenders.appendLoopOnAppenders(loggingEvent);
            }
            return;
        }
        loggingEvent.getNDC();
        loggingEvent.getThreadName();
        loggingEvent.getMDCCopy();
        if (this.locationInfo) {
            loggingEvent.getLocationInformation();
        }
        loggingEvent.getRenderedMessage();
        loggingEvent.getThrowableStrRep();
        synchronized (this.buffer) {
            while (true) {
                try {
                    int size = this.buffer.size();
                    if (size >= this.bufferSize) {
                        if (!this.blocking || Thread.interrupted() || Thread.currentThread() == this.dispatcher) {
                            break;
                        }
                        try {
                            this.buffer.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    } else {
                        this.buffer.add(loggingEvent);
                        if (size == 0) {
                            this.buffer.notifyAll();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            String loggerName = loggingEvent.getLoggerName();
            DiscardSummary discardSummary = (DiscardSummary) this.discardMap.get(loggerName);
            if (discardSummary == null) {
                this.discardMap.put(loggerName, new DiscardSummary(loggingEvent));
            } else {
                discardSummary.add(loggingEvent);
            }
        }
    }

    @Override // org.apache.log4j.Appender
    public void close() {
        synchronized (this.buffer) {
            this.closed = true;
            this.buffer.notifyAll();
        }
        try {
            this.dispatcher.join();
        } catch (InterruptedException e4) {
            Thread.currentThread().interrupt();
            LogLog.error("Got an InterruptedException while waiting for the dispatcher to finish.", e4);
        }
        synchronized (this.appenders) {
            try {
                Enumeration allAppenders = this.appenders.getAllAppenders();
                if (allAppenders != null) {
                    while (allAppenders.hasMoreElements()) {
                        Object nextElement = allAppenders.nextElement();
                        if (nextElement instanceof Appender) {
                            ((Appender) nextElement).close();
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // org.apache.log4j.spi.AppenderAttachable
    public Enumeration getAllAppenders() {
        Enumeration allAppenders;
        synchronized (this.appenders) {
            allAppenders = this.appenders.getAllAppenders();
        }
        return allAppenders;
    }

    @Override // org.apache.log4j.spi.AppenderAttachable
    public Appender getAppender(String str) {
        Appender appender;
        synchronized (this.appenders) {
            appender = this.appenders.getAppender(str);
        }
        return appender;
    }

    public boolean getBlocking() {
        return this.blocking;
    }

    public int getBufferSize() {
        return this.bufferSize;
    }

    public boolean getLocationInfo() {
        return this.locationInfo;
    }

    @Override // org.apache.log4j.spi.AppenderAttachable
    public boolean isAttached(Appender appender) {
        boolean isAttached;
        synchronized (this.appenders) {
            isAttached = this.appenders.isAttached(appender);
        }
        return isAttached;
    }

    @Override // org.apache.log4j.spi.AppenderAttachable
    public void removeAllAppenders() {
        synchronized (this.appenders) {
            this.appenders.removeAllAppenders();
        }
    }

    @Override // org.apache.log4j.spi.AppenderAttachable
    public void removeAppender(Appender appender) {
        synchronized (this.appenders) {
            this.appenders.removeAppender(appender);
        }
    }

    @Override // org.apache.log4j.Appender
    public boolean requiresLayout() {
        return false;
    }

    public void setBlocking(boolean z4) {
        synchronized (this.buffer) {
            this.blocking = z4;
            this.buffer.notifyAll();
        }
    }

    public void setBufferSize(int i4) {
        if (i4 < 0) {
            throw new NegativeArraySizeException("size");
        }
        synchronized (this.buffer) {
            if (i4 < 1) {
                i4 = 1;
            }
            this.bufferSize = i4;
            this.buffer.notifyAll();
        }
    }

    public void setLocationInfo(boolean z4) {
        this.locationInfo = z4;
    }

    @Override // org.apache.log4j.spi.AppenderAttachable
    public void removeAppender(String str) {
        synchronized (this.appenders) {
            this.appenders.removeAppender(str);
        }
    }
}
