package org.apache.log4j;

import org.apache.log4j.helpers.LogLog;
import org.apache.log4j.helpers.OnlyOnceErrorHandler;
import org.apache.log4j.spi.ErrorHandler;
import org.apache.log4j.spi.Filter;
import org.apache.log4j.spi.LoggingEvent;
import org.apache.log4j.spi.OptionHandler;

/* loaded from: classes3.dex */
public abstract class AppenderSkeleton implements Appender, OptionHandler {
    protected Filter headFilter;
    protected Layout layout;
    protected String name;
    protected Filter tailFilter;
    protected Priority threshold;
    protected ErrorHandler errorHandler = new OnlyOnceErrorHandler();
    protected boolean closed = false;

    public AppenderSkeleton() {
    }

    @Override // org.apache.log4j.spi.OptionHandler
    public void activateOptions() {
    }

    @Override // org.apache.log4j.Appender
    public void addFilter(Filter filter) {
        if (this.headFilter == null) {
            this.tailFilter = filter;
            this.headFilter = filter;
        } else {
            this.tailFilter.setNext(filter);
            this.tailFilter = filter;
        }
    }

    protected abstract void append(LoggingEvent loggingEvent);

    @Override // org.apache.log4j.Appender
    public void clearFilters() {
        this.tailFilter = null;
        this.headFilter = null;
    }

    @Override // org.apache.log4j.Appender
    public synchronized void doAppend(LoggingEvent loggingEvent) {
        if (this.closed) {
            LogLog.error("Attempted to append to closed appender named [" + this.name + "].");
            return;
        }
        if (isAsSevereAsThreshold(loggingEvent.getLevel())) {
            Filter filter = this.headFilter;
            while (filter != null) {
                int decide = filter.decide(loggingEvent);
                if (decide == -1) {
                    return;
                }
                if (decide == 0) {
                    filter = filter.getNext();
                } else if (decide == 1) {
                    break;
                }
            }
            append(loggingEvent);
        }
    }

    public void finalize() {
        if (this.closed) {
            return;
        }
        LogLog.debug("Finalizing appender named [" + this.name + "].");
        close();
    }

    @Override // org.apache.log4j.Appender
    public ErrorHandler getErrorHandler() {
        return this.errorHandler;
    }

    @Override // org.apache.log4j.Appender
    public Filter getFilter() {
        return this.headFilter;
    }

    public final Filter getFirstFilter() {
        return this.headFilter;
    }

    @Override // org.apache.log4j.Appender
    public Layout getLayout() {
        return this.layout;
    }

    @Override // org.apache.log4j.Appender
    public final String getName() {
        return this.name;
    }

    public Priority getThreshold() {
        return this.threshold;
    }

    public boolean isAsSevereAsThreshold(Priority priority) {
        Priority priority2 = this.threshold;
        return priority2 == null || priority.isGreaterOrEqual(priority2);
    }

    @Override // org.apache.log4j.Appender
    public synchronized void setErrorHandler(ErrorHandler errorHandler) {
        try {
            if (errorHandler == null) {
                LogLog.warn("You have tried to set a null error-handler.");
            } else {
                this.errorHandler = errorHandler;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // org.apache.log4j.Appender
    public void setLayout(Layout layout) {
        this.layout = layout;
    }

    @Override // org.apache.log4j.Appender
    public void setName(String str) {
        this.name = str;
    }

    public void setThreshold(Priority priority) {
        this.threshold = priority;
    }

    protected AppenderSkeleton(boolean z4) {
    }
}
