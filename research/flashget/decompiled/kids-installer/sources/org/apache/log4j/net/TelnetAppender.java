package org.apache.log4j.net;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.helpers.LogLog;
import org.apache.log4j.spi.LoggingEvent;

/* loaded from: classes6.dex */
public class TelnetAppender extends AppenderSkeleton {
    private int port = 23;
    private SocketHandler sh;

    /* loaded from: classes5.dex */
    protected class SocketHandler extends Thread {
        private ServerSocket serverSocket;
        private Vector writers = new Vector();
        private Vector connections = new Vector();
        private int MAX_CONNECTIONS = 20;

        public SocketHandler(int i5) throws IOException {
            this.serverSocket = new ServerSocket(i5);
            setName("TelnetAppender-" + getName() + "-" + i5);
        }

        public void close() {
            synchronized (this) {
                Enumeration elements = this.connections.elements();
                while (elements.hasMoreElements()) {
                    try {
                        ((Socket) elements.nextElement()).close();
                    } catch (InterruptedIOException unused) {
                        Thread.currentThread().interrupt();
                    } catch (IOException | RuntimeException unused2) {
                    }
                }
            }
            try {
                this.serverSocket.close();
            } catch (InterruptedIOException unused3) {
                Thread.currentThread().interrupt();
            } catch (IOException | RuntimeException unused4) {
            }
        }

        public void finalize() {
            close();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (!this.serverSocket.isClosed()) {
                try {
                    Socket accept = this.serverSocket.accept();
                    PrintWriter printWriter = new PrintWriter(accept.getOutputStream());
                    if (this.connections.size() < this.MAX_CONNECTIONS) {
                        synchronized (this) {
                            this.connections.addElement(accept);
                            this.writers.addElement(printWriter);
                            printWriter.print("TelnetAppender v1.0 (" + this.connections.size() + " active connections)\r\n\r\n");
                            printWriter.flush();
                        }
                    } else {
                        printWriter.print("Too many connections.\r\n");
                        printWriter.flush();
                        accept.close();
                    }
                } catch (Exception e6) {
                    if ((e6 instanceof InterruptedIOException) || (e6 instanceof InterruptedException)) {
                        Thread.currentThread().interrupt();
                    }
                    if (!this.serverSocket.isClosed()) {
                        LogLog.error("Encountered error while in SocketHandler loop.", e6);
                    }
                }
            }
            try {
                this.serverSocket.close();
            } catch (InterruptedIOException unused) {
                Thread.currentThread().interrupt();
            } catch (IOException unused2) {
            }
        }

        public synchronized void send(String str) {
            Iterator it = this.connections.iterator();
            Iterator it2 = this.writers.iterator();
            while (it2.hasNext()) {
                it.next();
                PrintWriter printWriter = (PrintWriter) it2.next();
                printWriter.print(str);
                if (printWriter.checkError()) {
                    it.remove();
                    it2.remove();
                }
            }
        }
    }

    @Override // org.apache.log4j.AppenderSkeleton, org.apache.log4j.spi.OptionHandler
    public void activateOptions() {
        try {
            SocketHandler socketHandler = new SocketHandler(this.port);
            this.sh = socketHandler;
            socketHandler.start();
        } catch (InterruptedIOException e6) {
            Thread.currentThread().interrupt();
            e6.printStackTrace();
        } catch (IOException e7) {
            e7.printStackTrace();
        } catch (RuntimeException e8) {
            e8.printStackTrace();
        }
        super.activateOptions();
    }

    @Override // org.apache.log4j.AppenderSkeleton
    protected void append(LoggingEvent loggingEvent) {
        String[] throwableStrRep;
        SocketHandler socketHandler = this.sh;
        if (socketHandler != null) {
            socketHandler.send(this.layout.format(loggingEvent));
            if (!this.layout.ignoresThrowable() || (throwableStrRep = loggingEvent.getThrowableStrRep()) == null) {
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            for (String str : throwableStrRep) {
                stringBuffer.append(str);
                stringBuffer.append("\r\n");
            }
            this.sh.send(stringBuffer.toString());
        }
    }

    @Override // org.apache.log4j.Appender
    public void close() {
        SocketHandler socketHandler = this.sh;
        if (socketHandler != null) {
            socketHandler.close();
            try {
                this.sh.join();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public int getPort() {
        return this.port;
    }

    @Override // org.apache.log4j.Appender
    public boolean requiresLayout() {
        return true;
    }

    public void setPort(int i5) {
        this.port = i5;
    }
}
