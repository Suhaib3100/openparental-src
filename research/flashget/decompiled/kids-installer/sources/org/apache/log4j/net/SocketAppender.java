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

/* loaded from: classes6.dex */
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

    /* loaded from: classes5.dex */
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
                } catch (IOException e6) {
                    if (e6 instanceof InterruptedIOException) {
                        Thread.currentThread().interrupt();
                    }
                    LogLog.debug("Could not connect to " + SocketAppender.this.address.getHostName() + ". Exception is " + e6);
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
        } catch (Exception e6) {
            if ((e6 instanceof InterruptedIOException) || (e6 instanceof InterruptedException)) {
                Thread.currentThread().interrupt();
            }
            LogLog.error("Could not find address of [" + str + "].", e6);
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
                int i5 = this.counter + 1;
                this.counter = i5;
                if (i5 >= 1) {
                    this.counter = 0;
                    this.oos.reset();
                }
            } catch (IOException e6) {
                if (e6 instanceof InterruptedIOException) {
                    Thread.currentThread().interrupt();
                }
                this.oos = null;
                LogLog.warn("Detected problem with connection: " + e6);
                if (this.reconnectionDelay > 0) {
                    fireConnector();
                } else {
                    this.errorHandler.error("Detected problem with connection, not reconnecting.", e6, 0);
                }
            }
        }
    }

    public void cleanUp() {
        ObjectOutputStream objectOutputStream = this.oos;
        if (objectOutputStream != null) {
            try {
                objectOutputStream.close();
            } catch (IOException e6) {
                if (e6 instanceof InterruptedIOException) {
                    Thread.currentThread().interrupt();
                }
                LogLog.error("Could not close oos.", e6);
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
        if (this.closed) {
            return;
        }
        this.closed = true;
        if (this.advertiseViaMulticastDNS) {
            this.zeroConf.unadvertise();
        }
        cleanUp();
    }

    void connect(InetAddress inetAddress, int i5) {
        String concat;
        if (this.address == null) {
            return;
        }
        try {
            cleanUp();
            this.oos = new ObjectOutputStream(new Socket(inetAddress, i5).getOutputStream());
        } catch (IOException e6) {
            if (e6 instanceof InterruptedIOException) {
                Thread.currentThread().interrupt();
            }
            String str = "Could not connect to remote log4j server at [" + inetAddress.getHostName() + "].";
            if (this.reconnectionDelay > 0) {
                concat = String.valueOf(str).concat(" We will try again later.");
                fireConnector();
            } else {
                concat = String.valueOf(str).concat(" We are not retrying.");
                this.errorHandler.error(concat, e6, 0);
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

    public void setAdvertiseViaMulticastDNS(boolean z5) {
        this.advertiseViaMulticastDNS = z5;
    }

    public void setApplication(String str) {
        this.application = str;
    }

    public void setLocationInfo(boolean z5) {
        this.locationInfo = z5;
    }

    public void setPort(int i5) {
        this.port = i5;
    }

    public void setReconnectionDelay(int i5) {
        this.reconnectionDelay = i5;
    }

    public void setRemoteHost(String str) {
        this.address = getAddressByName(str);
        this.remoteHost = str;
    }

    public SocketAppender(InetAddress inetAddress, int i5) {
        this.port = DEFAULT_PORT;
        this.reconnectionDelay = 30000;
        this.locationInfo = false;
        this.counter = 0;
        this.address = inetAddress;
        this.remoteHost = inetAddress.getHostName();
        this.port = i5;
        connect(inetAddress, i5);
    }

    public SocketAppender(String str, int i5) {
        this.reconnectionDelay = 30000;
        this.locationInfo = false;
        this.counter = 0;
        this.port = i5;
        InetAddress addressByName = getAddressByName(str);
        this.address = addressByName;
        this.remoteHost = str;
        connect(addressByName, i5);
    }
}
