package org.apache.log4j.net;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.net.SocketException;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerRepository;
import org.apache.log4j.spi.LoggingEvent;

/* loaded from: classes3.dex */
public class SocketNode implements Runnable {
    static Logger logger = Logger.getLogger(SocketNode.class);
    LoggerRepository hierarchy;
    ObjectInputStream ois;
    Socket socket;

    public SocketNode(Socket socket, LoggerRepository loggerRepository) {
        this.socket = socket;
        this.hierarchy = loggerRepository;
        try {
            this.ois = new ObjectInputStream(new BufferedInputStream(socket.getInputStream()));
        } catch (InterruptedIOException e4) {
            Thread.currentThread().interrupt();
            logger.error("Could not open ObjectInputStream to " + socket, e4);
        } catch (IOException e5) {
            logger.error("Could not open ObjectInputStream to " + socket, e5);
        } catch (RuntimeException e6) {
            logger.error("Could not open ObjectInputStream to " + socket, e6);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Socket socket;
        ObjectInputStream objectInputStream;
        try {
            try {
                try {
                    try {
                        objectInputStream = this.ois;
                    } finally {
                    }
                } catch (InterruptedIOException e4) {
                    Thread.currentThread().interrupt();
                    logger.info("Caught java.io.InterruptedIOException: " + e4);
                    logger.info("Closing connection.");
                    ObjectInputStream objectInputStream2 = this.ois;
                    if (objectInputStream2 != null) {
                        try {
                            objectInputStream2.close();
                        } catch (Exception e5) {
                            logger.info("Could not close connection.", e5);
                        }
                    }
                    socket = this.socket;
                    if (socket == null) {
                        return;
                    }
                }
            } catch (SocketException unused) {
                logger.info("Caught java.net.SocketException closing conneciton.");
                ObjectInputStream objectInputStream3 = this.ois;
                if (objectInputStream3 != null) {
                    try {
                        objectInputStream3.close();
                    } catch (Exception e6) {
                        logger.info("Could not close connection.", e6);
                    }
                }
                socket = this.socket;
                if (socket == null) {
                    return;
                }
            } catch (Exception e7) {
                logger.error("Unexpected exception. Closing conneciton.", e7);
                ObjectInputStream objectInputStream4 = this.ois;
                if (objectInputStream4 != null) {
                    try {
                        objectInputStream4.close();
                    } catch (Exception e10) {
                        logger.info("Could not close connection.", e10);
                    }
                }
                socket = this.socket;
                if (socket == null) {
                    return;
                }
            }
        } catch (EOFException unused2) {
            logger.info("Caught java.io.EOFException closing conneciton.");
            ObjectInputStream objectInputStream5 = this.ois;
            if (objectInputStream5 != null) {
                try {
                    objectInputStream5.close();
                } catch (Exception e11) {
                    logger.info("Could not close connection.", e11);
                }
            }
            socket = this.socket;
            if (socket == null) {
                return;
            }
        } catch (IOException e12) {
            logger.info("Caught java.io.IOException: " + e12);
            logger.info("Closing connection.");
            ObjectInputStream objectInputStream6 = this.ois;
            if (objectInputStream6 != null) {
                try {
                    objectInputStream6.close();
                } catch (Exception e13) {
                    logger.info("Could not close connection.", e13);
                }
            }
            socket = this.socket;
            if (socket == null) {
                return;
            }
        }
        if (objectInputStream == null) {
            if (objectInputStream != null) {
                try {
                    objectInputStream.close();
                } catch (Exception e14) {
                    logger.info("Could not close connection.", e14);
                }
            }
            socket = this.socket;
            if (socket == null) {
                return;
            }
            try {
                socket.close();
                return;
            } catch (InterruptedIOException unused3) {
                Thread.currentThread().interrupt();
                return;
            } catch (IOException unused4) {
                return;
            }
        }
        while (true) {
            LoggingEvent loggingEvent = (LoggingEvent) this.ois.readObject();
            Logger logger2 = this.hierarchy.getLogger(loggingEvent.getLoggerName());
            if (loggingEvent.getLevel().isGreaterOrEqual(logger2.getEffectiveLevel())) {
                logger2.callAppenders(loggingEvent);
            }
        }
    }
}
