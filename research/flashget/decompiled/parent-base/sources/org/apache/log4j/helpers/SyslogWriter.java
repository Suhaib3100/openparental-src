package org.apache.log4j.helpers;

import java.io.IOException;
import java.io.Writer;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/* loaded from: classes3.dex */
public class SyslogWriter extends Writer {
    static String syslogHost;
    final int SYSLOG_PORT = 514;
    private InetAddress address;
    private DatagramSocket ds;
    private final int port;

    /* JADX WARN: Can't wrap try/catch for region: R(10:3|(3:24|25|(10:27|(1:31)|32|(1:9)|10|11|12|13|14|16))|7|(0)|10|11|12|13|14|16) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        org.apache.log4j.helpers.LogLog.error("Could not find " + r8 + ". All logging will FAIL.", r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0067  */
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
            if (r8 == 0) goto La7
            java.lang.String r3 = "["
            int r4 = r8.indexOf(r3)
            r5 = -1
            if (r4 != r5) goto L24
            r4 = 58
            int r6 = r8.indexOf(r4)
            int r4 = r8.lastIndexOf(r4)
            if (r6 != r4) goto L5c
        L24:
            java.net.URL r4 = new java.net.URL     // Catch: java.net.MalformedURLException -> L55
            java.lang.String r1 = r1.concat(r8)     // Catch: java.net.MalformedURLException -> L55
            r4.<init>(r1)     // Catch: java.net.MalformedURLException -> L55
            java.lang.String r1 = r4.getHost()     // Catch: java.net.MalformedURLException -> L55
            if (r1 == 0) goto L5c
            java.lang.String r8 = r4.getHost()     // Catch: java.net.MalformedURLException -> L55
            boolean r1 = r8.startsWith(r3)     // Catch: java.net.MalformedURLException -> L55
            if (r1 == 0) goto L57
            int r1 = r8.length()     // Catch: java.net.MalformedURLException -> L55
            r3 = 1
            int r1 = r1 - r3
            char r1 = r8.charAt(r1)     // Catch: java.net.MalformedURLException -> L55
            r6 = 93
            if (r1 != r6) goto L57
            int r1 = r8.length()     // Catch: java.net.MalformedURLException -> L55
            int r1 = r1 - r3
            java.lang.String r8 = r8.substring(r3, r1)     // Catch: java.net.MalformedURLException -> L55
            goto L57
        L55:
            r1 = move-exception
            goto L5e
        L57:
            int r1 = r4.getPort()     // Catch: java.net.MalformedURLException -> L55
            goto L64
        L5c:
            r1 = r5
            goto L64
        L5e:
            java.lang.String r3 = "Malformed URL: will attempt to interpret as InetAddress."
            org.apache.log4j.helpers.LogLog.error(r3, r1)
            goto L5c
        L64:
            if (r1 != r5) goto L67
            goto L68
        L67:
            r2 = r1
        L68:
            r7.port = r2
            java.net.InetAddress r1 = java.net.InetAddress.getByName(r8)     // Catch: java.net.UnknownHostException -> L71
            r7.address = r1     // Catch: java.net.UnknownHostException -> L71
            goto L86
        L71:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Could not find "
            r2.<init>(r3)
            r2.append(r8)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            org.apache.log4j.helpers.LogLog.error(r2, r1)
        L86:
            java.net.DatagramSocket r1 = new java.net.DatagramSocket     // Catch: java.net.SocketException -> L8e
            r1.<init>()     // Catch: java.net.SocketException -> L8e
            r7.ds = r1     // Catch: java.net.SocketException -> L8e
            goto La6
        L8e:
            r1 = move-exception
            r1.printStackTrace()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Could not instantiate DatagramSocket to "
            r2.<init>(r3)
            r2.append(r8)
            r2.append(r0)
            java.lang.String r8 = r2.toString()
            org.apache.log4j.helpers.LogLog.error(r8, r1)
        La6:
            return
        La7:
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
    public void write(char[] cArr, int i4, int i5) throws IOException {
        write(new String(cArr, i4, i5));
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
