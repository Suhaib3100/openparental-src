package org.apache.log4j.varia;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import org.apache.log4j.helpers.LogLog;

/* compiled from: ExternallyRolledFileAppender.java */
/* loaded from: classes3.dex */
class HUPNode implements Runnable {
    DataInputStream dis;
    DataOutputStream dos;
    ExternallyRolledFileAppender er;
    Socket socket;

    public HUPNode(Socket socket, ExternallyRolledFileAppender externallyRolledFileAppender) {
        this.socket = socket;
        this.er = externallyRolledFileAppender;
        try {
            this.dis = new DataInputStream(socket.getInputStream());
            this.dos = new DataOutputStream(socket.getOutputStream());
        } catch (InterruptedIOException e4) {
            Thread.currentThread().interrupt();
            e4.printStackTrace();
        } catch (IOException e5) {
            e5.printStackTrace();
        } catch (RuntimeException e6) {
            e6.printStackTrace();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            String readUTF = this.dis.readUTF();
            LogLog.debug("Got external roll over signal.");
            if ("RollOver".equals(readUTF)) {
                synchronized (this.er) {
                    this.er.rollOver();
                }
                this.dos.writeUTF("OK");
            } else {
                this.dos.writeUTF("Expecting [RollOver] string.");
            }
            this.dos.close();
        } catch (InterruptedIOException e4) {
            Thread.currentThread().interrupt();
            LogLog.error("Unexpected exception. Exiting HUPNode.", e4);
        } catch (IOException e5) {
            LogLog.error("Unexpected exception. Exiting HUPNode.", e5);
        } catch (RuntimeException e6) {
            LogLog.error("Unexpected exception. Exiting HUPNode.", e6);
        }
    }
}
