package org.apache.log4j.net;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.util.Vector;
import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.helpers.CyclicBuffer;
import org.apache.log4j.helpers.LogLog;
import org.apache.log4j.spi.LoggingEvent;

/* loaded from: classes3.dex */
public class SocketHubAppender extends AppenderSkeleton {
    static final int DEFAULT_PORT = 4560;
    public static final String ZONE = "_log4j_obj_tcpaccept_appender.local.";
    private boolean advertiseViaMulticastDNS;
    private String application;
    private CyclicBuffer buffer;
    private boolean locationInfo;
    private Vector oosList;
    private int port;
    private ServerMonitor serverMonitor;
    private ServerSocket serverSocket;
    private ZeroConfSupport zeroConf;

    private class ServerMonitor implements Runnable {
        private boolean keepRunning = true;
        private Thread monitorThread;
        private Vector oosList;
        private int port;

        public ServerMonitor(int i4, Vector vector) {
            this.port = i4;
            this.oosList = vector;
            Thread thread = new Thread(this);
            this.monitorThread = thread;
            thread.setDaemon(true);
            this.monitorThread.setName("SocketHubAppender-Monitor-" + this.port);
            this.monitorThread.start();
        }

        private void sendCachedEvents(ObjectOutputStream objectOutputStream) throws IOException {
            if (SocketHubAppender.this.buffer != null) {
                for (int i4 = 0; i4 < SocketHubAppender.this.buffer.length(); i4++) {
                    objectOutputStream.writeObject(SocketHubAppender.this.buffer.get(i4));
                }
                objectOutputStream.flush();
                objectOutputStream.reset();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0028 A[SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 260
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: org.apache.log4j.net.SocketHubAppender.ServerMonitor.run():void");
        }

        public synchronized void stopMonitor() {
            if (this.keepRunning) {
                LogLog.debug("server monitor thread shutting down");
                this.keepRunning = false;
                try {
                    if (SocketHubAppender.this.serverSocket != null) {
                        SocketHubAppender.this.serverSocket.close();
                        SocketHubAppender.this.serverSocket = null;
                    }
                } catch (IOException unused) {
                }
                try {
                    this.monitorThread.join();
                } catch (InterruptedException unused2) {
                    Thread.currentThread().interrupt();
                }
                this.monitorThread = null;
                LogLog.debug("server monitor thread shut down");
            }
        }
    }

    public SocketHubAppender() {
        this.port = 4560;
        this.oosList = new Vector();
        this.serverMonitor = null;
        this.locationInfo = false;
        this.buffer = null;
    }

    private void startServer() {
        this.serverMonitor = new ServerMonitor(this.port, this.oosList);
    }

    @Override // org.apache.log4j.AppenderSkeleton, org.apache.log4j.spi.OptionHandler
    public void activateOptions() {
        if (this.advertiseViaMulticastDNS) {
            ZeroConfSupport zeroConfSupport = new ZeroConfSupport("_log4j_obj_tcpaccept_appender.local.", this.port, getName());
            this.zeroConf = zeroConfSupport;
            zeroConfSupport.advertise();
        }
        startServer();
    }

    @Override // org.apache.log4j.AppenderSkeleton
    public void append(LoggingEvent loggingEvent) {
        ObjectOutputStream objectOutputStream;
        if (loggingEvent != null) {
            if (this.locationInfo) {
                loggingEvent.getLocationInformation();
            }
            String str = this.application;
            if (str != null) {
                loggingEvent.setProperty("application", str);
            }
            loggingEvent.getNDC();
            loggingEvent.getThreadName();
            loggingEvent.getMDCCopy();
            loggingEvent.getRenderedMessage();
            loggingEvent.getThrowableStrRep();
            CyclicBuffer cyclicBuffer = this.buffer;
            if (cyclicBuffer != null) {
                cyclicBuffer.add(loggingEvent);
            }
        }
        if (loggingEvent == null || this.oosList.size() == 0) {
            return;
        }
        int i4 = 0;
        while (i4 < this.oosList.size()) {
            try {
                objectOutputStream = (ObjectOutputStream) this.oosList.elementAt(i4);
            } catch (ArrayIndexOutOfBoundsException unused) {
                objectOutputStream = null;
            }
            if (objectOutputStream == null) {
                return;
            }
            try {
                objectOutputStream.writeObject(loggingEvent);
                objectOutputStream.flush();
                objectOutputStream.reset();
            } catch (IOException e4) {
                if (e4 instanceof InterruptedIOException) {
                    Thread.currentThread().interrupt();
                }
                this.oosList.removeElementAt(i4);
                LogLog.debug("dropped connection");
                i4--;
            }
            i4++;
        }
    }

    public void cleanUp() {
        LogLog.debug("stopping ServerSocket");
        this.serverMonitor.stopMonitor();
        this.serverMonitor = null;
        LogLog.debug("closing client connections");
        while (this.oosList.size() != 0) {
            ObjectOutputStream objectOutputStream = (ObjectOutputStream) this.oosList.elementAt(0);
            if (objectOutputStream != null) {
                try {
                    objectOutputStream.close();
                } catch (InterruptedIOException e4) {
                    Thread.currentThread().interrupt();
                    LogLog.error("could not close oos.", e4);
                } catch (IOException e5) {
                    LogLog.error("could not close oos.", e5);
                }
                this.oosList.removeElementAt(0);
            }
        }
    }

    @Override // org.apache.log4j.Appender
    public synchronized void close() {
        try {
            if (this.closed) {
                return;
            }
            LogLog.debug("closing SocketHubAppender " + getName());
            this.closed = true;
            if (this.advertiseViaMulticastDNS) {
                this.zeroConf.unadvertise();
            }
            cleanUp();
            LogLog.debug("SocketHubAppender " + getName() + " closed");
        } catch (Throwable th) {
            throw th;
        }
    }

    protected ServerSocket createServerSocket(int i4) throws IOException {
        return new ServerSocket(i4);
    }

    public String getApplication() {
        return this.application;
    }

    public int getBufferSize() {
        CyclicBuffer cyclicBuffer = this.buffer;
        if (cyclicBuffer == null) {
            return 0;
        }
        return cyclicBuffer.getMaxSize();
    }

    public boolean getLocationInfo() {
        return this.locationInfo;
    }

    public int getPort() {
        return this.port;
    }

    public boolean isAdvertiseViaMulticastDNS() {
        return this.advertiseViaMulticastDNS;
    }

    @Override // org.apache.log4j.Appender
    public boolean requiresLayout() {
        return false;
    }

    public void setAdvertiseViaMulticastDNS(boolean z4) {
        this.advertiseViaMulticastDNS = z4;
    }

    public void setApplication(String str) {
        this.application = str;
    }

    public void setBufferSize(int i4) {
        this.buffer = new CyclicBuffer(i4);
    }

    public void setLocationInfo(boolean z4) {
        this.locationInfo = z4;
    }

    public void setPort(int i4) {
        this.port = i4;
    }

    public SocketHubAppender(int i4) {
        this.port = 4560;
        this.oosList = new Vector();
        this.serverMonitor = null;
        this.locationInfo = false;
        this.buffer = null;
        this.port = i4;
        startServer();
    }
}
