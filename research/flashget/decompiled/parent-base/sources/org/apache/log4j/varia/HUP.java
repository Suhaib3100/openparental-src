package org.apache.log4j.varia;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ServerSocket;
import java.net.Socket;
import org.apache.log4j.helpers.LogLog;

/* compiled from: ExternallyRolledFileAppender.java */
/* loaded from: classes3.dex */
class HUP extends Thread {
    ExternallyRolledFileAppender er;
    int port;

    HUP(ExternallyRolledFileAppender externallyRolledFileAppender, int i4) {
        this.er = externallyRolledFileAppender;
        this.port = i4;
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
            } catch (InterruptedIOException e4) {
                Thread.currentThread().interrupt();
                e4.printStackTrace();
            } catch (IOException e5) {
                e5.printStackTrace();
            } catch (RuntimeException e6) {
                e6.printStackTrace();
            }
        }
    }
}
