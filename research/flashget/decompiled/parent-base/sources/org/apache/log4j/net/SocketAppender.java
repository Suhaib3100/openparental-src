package org.apache.log4j.net;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.ObjectOutputStream;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.Socket;
import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.helpers.LogLog;
import org.apache.log4j.spi.LoggingEvent;

/* loaded from: classes3.dex */
public class SocketAppender extends AppenderSkeleton {
    public static final int DEFAULT_PORT = 4560;
    static final int DEFAULT_RECONNECTION_DELAY = 30000;
    private static final int RESET_FREQUENCY = 1;
    public static final String ZONE = "_log4j_obj_tcpconnect_appender.local.";
    InetAddress address;
    private boolean advertiseViaMulticastDNS;
    private String application;
    private Connector connector;
    int counter;
    boolean locationInfo;
    ObjectOutputStream oos;
    int port;
    int reconnectionDelay;
    String remoteHost;
    private ZeroConfSupport zeroConf;

    class Connector extends Thread {
        boolean interrupted = false;

        Connector() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (!this.interrupted) {
                try {
                    Thread.sleep(SocketAppender.this.reconnectionDelay);
                    LogLog.debug("Attempting connection to " + SocketAppender.this.address.getHostName());
                    SocketAppender socketAppender = SocketAppender.this;
                    Socket socket = new Socket(socketAppender.address, socketAppender.port);
                    synchronized (this) {
                        SocketAppender.this.oos = new ObjectOutputStream(socket.getOutputStream());
                        SocketAppender.this.connector = null;
                        LogLog.debug("Connection established. Exiting connector thread.");
                    }
                    return;
                } catch (InterruptedException unused) {
                    LogLog.debug("Connector interrupted. Leaving loop.");
                    return;
                } catch (ConnectException unused2) {
                    LogLog.debug("Remote host " + SocketAppender.this.address.getHostName() + " refused connection.");
                } catch (IOException e4) {
                    if (e4 instanceof InterruptedIOException) {
                        Thread.currentThread().interrupt();
                    }
                    LogLog.debug("Could not connect to " + SocketAppender.this.address.getHostName() + ". Exception is " + e4);
                }
            }
        }
    }

    public SocketAppender() {
        this.port = DEFAULT_PORT;
        this.reconnectionDelay = 30000;
        this.locationInfo = false;
        this.counter = 0;
    }

    static InetAddress getAddressByName(String str) {
        try {
            return InetAddress.getByName(str);
        } catch (Exception e4) {
            if ((e4 instanceof InterruptedIOException) || (e4 instanceof InterruptedException)) {
                Thread.currentThread().interrupt();
            }
            LogLog.error("Could not find address of [" + str + "].", e4);
            return null;
        }
    }

    @Override // org.apache.log4j.AppenderSkeleton, org.apache.log4j.spi.OptionHandler
    public void activateOptions() {
        if (this.advertiseViaMulticastDNS) {
            ZeroConfSupport zeroConfSupport = new ZeroConfSupport("_log4j_obj_tcpconnect_appender.local.", this.port, getName());
            this.zeroConf = zeroConfSupport;
            zeroConfSupport.advertise();
        }
        connect(this.address, this.port);
    }

    @Override // org.apache.log4j.AppenderSkeleton
    public void append(LoggingEvent loggingEvent) {
        if (loggingEvent == null) {
            return;
        }
        if (this.address == null) {
            this.errorHandler.error("No remote host is set for SocketAppender named \"" + this.name + "\".");
            return;
        }
        if (this.oos != null) {
            try {
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
                this.oos.writeObject(loggingEvent);
                this.oos.flush();
                int i4 = this.counter + 1;
                this.counter = i4;
                if (i4 >= 1) {
                    this.counter = 0;
                    this.oos.reset();
                }
            } catch (IOException e4) {
                if (e4 instanceof InterruptedIOException) {
                    Thread.currentThread().interrupt();
                }
                this.oos = null;
                LogLog.warn("Detected problem with connection: " + e4);
                if (this.reconnectionDelay > 0) {
                    fireConnector();
                } else {
                    this.errorHandler.error("Detected problem with connection, not reconnecting.", e4, 0);
                }
            }
        }
    }

    public void cleanUp() {
        ObjectOutputStream objectOutputStream = this.oos;
        if (objectOutputStream != null) {
            try {
                objectOutputStream.close();
            } catch (IOException e4) {
                if (e4 instanceof InterruptedIOException) {
                    Thread.currentThread().interrupt();
                }
                LogLog.error("Could not close oos.", e4);
            }
            this.oos = null;
        }
        Connector connector = this.connector;
        if (connector != null) {
            connector.interrupted = true;
            this.connector = null;
        }
    }

    @Override // org.apache.log4j.Appender
    public synchronized void close() {
        try {
            if (this.closed) {
                return;
            }
            this.closed = true;
            if (this.advertiseViaMulticastDNS) {
                this.zeroConf.unadvertise();
            }
            cleanUp();
        } catch (Throwable th) {
            throw th;
        }
    }

    void connect(InetAddress inetAddress, int i4) {
        String concat;
        if (this.address == null) {
            return;
        }
        try {
            cleanUp();
            this.oos = new ObjectOutputStream(new Socket(inetAddress, i4).getOutputStream());
        } catch (IOException e4) {
            if (e4 instanceof InterruptedIOException) {
                Thread.currentThread().interrupt();
            }
            String str = "Could not connect to remote log4j server at [" + inetAddress.getHostName() + "].";
            if (this.reconnectionDelay > 0) {
                concat = String.valueOf(str).concat(" We will try again later.");
                fireConnector();
            } else {
                concat = String.valueOf(str).concat(" We are not retrying.");
                this.errorHandler.error(concat, e4, 0);
            }
            LogLog.error(concat);
        }
    }

    void fireConnector() {
        if (this.connector == null) {
            LogLog.debug("Starting a new connector thread.");
            Connector connector = new Connector();
            this.connector = connector;
            connector.setDaemon(true);
            this.connector.setPriority(1);
            this.connector.start();
        }
    }

    public String getApplication() {
        return this.application;
    }

    public boolean getLocationInfo() {
        return this.locationInfo;
    }

    public int getPort() {
        return this.port;
    }

    public int getReconnectionDelay() {
        return this.reconnectionDelay;
    }

    public String getRemoteHost() {
        return this.remoteHost;
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

    public void setLocationInfo(boolean z4) {
        this.locationInfo = z4;
    }

    public void setPort(int i4) {
        this.port = i4;
    }

    public void setReconnectionDelay(int i4) {
        this.reconnectionDelay = i4;
    }

    public void setRemoteHost(String str) {
        this.address = getAddressByName(str);
        this.remoteHost = str;
    }

    public SocketAppender(InetAddress inetAddress, int i4) {
        this.port = DEFAULT_PORT;
        this.reconnectionDelay = 30000;
        this.locationInfo = false;
        this.counter = 0;
        this.address = inetAddress;
        this.remoteHost = inetAddress.getHostName();
        this.port = i4;
        connect(inetAddress, i4);
    }

    public SocketAppender(String str, int i4) {
        this.reconnectionDelay = 30000;
        this.locationInfo = false;
        this.counter = 0;
        this.port = i4;
        InetAddress addressByName = getAddressByName(str);
        this.address = addressByName;
        this.remoteHost = str;
        connect(addressByName, i4);
    }
}
