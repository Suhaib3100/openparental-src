package org.apache.log4j.varia;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ServerSocket;
import java.net.Socket;
import org.apache.log4j.helpers.LogLog;

/* compiled from: ExternallyRolledFileAppender.java */
/* loaded from: classes5.dex */
class HUP extends Thread {
    ExternallyRolledFileAppender er;
    int port;

    HUP(ExternallyRolledFileAppender externallyRolledFileAppender, int i5) {
        this.er = externallyRolledFileAppender;
        this.port = i5;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (!isInterrupted()) {
            try {
                while (true) {
                    Socket accept = new ServerSocket(this.port).accept();
                    LogLog.debug("Connected to client at " + accept.getInetAddress());
                    new Thread(new HUPNode(accept, this.er), "ExternallyRolledFileAppender-HUP").start();
                }
            } catch (InterruptedIOException e6) {
                Thread.currentThread().interrupt();
                e6.printStackTrace();
            } catch (IOException e7) {
                e7.printStackTrace();
            } catch (RuntimeException e8) {
                e8.printStackTrace();
            }
        }
    }
}
