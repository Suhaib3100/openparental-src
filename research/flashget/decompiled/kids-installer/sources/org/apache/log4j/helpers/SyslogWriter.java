package org.apache.log4j.helpers;

import java.io.IOException;
import java.io.Writer;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/* loaded from: classes5.dex */
public class SyslogWriter extends Writer {
    static String syslogHost;
    final int SYSLOG_PORT = 514;
    private InetAddress address;
    private DatagramSocket ds;
    private final int port;

    /* JADX WARN: Can't wrap try/catch for region: R(7:3|(4:(3:24|25|(10:27|(1:31)|32|(1:9)|10|11|12|14|15|17))|14|15|17)|7|(0)|10|11|12) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        org.apache.log4j.helpers.LogLog.error("Could not find " + r8 + ". All logging will FAIL.", r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SyslogWriter(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = ". All logging will FAIL."
            java.lang.String r1 = "http://"
            r7.<init>()
            r2 = 514(0x202, float:7.2E-43)
            r7.SYSLOG_PORT = r2
            org.apache.log4j.helpers.SyslogWriter.syslogHost = r8
            if (r8 == 0) goto La5
            java.lang.String r3 = "["
            int r4 = r8.indexOf(r3)
            r5 = -1
            if (r4 != r5) goto L24
            r4 = 58
            int r6 = r8.indexOf(r4)
            int r4 = r8.lastIndexOf(r4)
            if (r6 != r4) goto L59
        L24:
            java.net.URL r4 = new java.net.URL     // Catch: java.net.MalformedURLException -> L5b
            java.lang.String r1 = r1.concat(r8)     // Catch: java.net.MalformedURLException -> L5b
            r4.<init>(r1)     // Catch: java.net.MalformedURLException -> L5b
            java.lang.String r1 = r4.getHost()     // Catch: java.net.MalformedURLException -> L5b
            if (r1 == 0) goto L59
            java.lang.String r8 = r4.getHost()     // Catch: java.net.MalformedURLException -> L5b
            boolean r1 = r8.startsWith(r3)     // Catch: java.net.MalformedURLException -> L5b
            if (r1 == 0) goto L54
            int r1 = r8.length()     // Catch: java.net.MalformedURLException -> L5b
            r3 = 1
            int r1 = r1 - r3
            char r1 = r8.charAt(r1)     // Catch: java.net.MalformedURLException -> L5b
            r6 = 93
            if (r1 != r6) goto L54
            int r1 = r8.length()     // Catch: java.net.MalformedURLException -> L5b
            int r1 = r1 - r3
            java.lang.String r8 = r8.substring(r3, r1)     // Catch: java.net.MalformedURLException -> L5b
        L54:
            int r1 = r4.getPort()     // Catch: java.net.MalformedURLException -> L5b
            goto L62
        L59:
            r1 = r5
            goto L62
        L5b:
            r1 = move-exception
            java.lang.String r3 = "Malformed URL: will attempt to interpret as InetAddress."
            org.apache.log4j.helpers.LogLog.error(r3, r1)
            goto L59
        L62:
            if (r1 != r5) goto L65
            goto L66
        L65:
            r2 = r1
        L66:
            r7.port = r2
            java.net.InetAddress r1 = java.net.InetAddress.getByName(r8)     // Catch: java.net.UnknownHostException -> L6f
            r7.address = r1     // Catch: java.net.UnknownHostException -> L6f
            goto L84
        L6f:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Could not find "
            r2.<init>(r3)
            r2.append(r8)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            org.apache.log4j.helpers.LogLog.error(r2, r1)
        L84:
            java.net.DatagramSocket r1 = new java.net.DatagramSocket     // Catch: java.net.SocketException -> L8c
            r1.<init>()     // Catch: java.net.SocketException -> L8c
            r7.ds = r1     // Catch: java.net.SocketException -> L8c
            goto La4
        L8c:
            r1 = move-exception
            r1.printStackTrace()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Could not instantiate DatagramSocket to "
            r2.<init>(r3)
            r2.append(r8)
            r2.append(r0)
            java.lang.String r8 = r2.toString()
            org.apache.log4j.helpers.LogLog.error(r8, r1)
        La4:
            return
        La5:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r0 = "syslogHost"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.log4j.helpers.SyslogWriter.<init>(java.lang.String):void");
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        DatagramSocket datagramSocket = this.ds;
        if (datagramSocket != null) {
            datagramSocket.close();
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i5, int i6) throws IOException {
        write(new String(cArr, i5, i6));
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        if (this.ds == null || this.address == null) {
            return;
        }
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        if (length >= 1024) {
            length = 1024;
        }
        this.ds.send(new DatagramPacket(bytes, length, this.address, this.port));
    }
}
