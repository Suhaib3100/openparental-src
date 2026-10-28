package org.java_websocket_new;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;

/* compiled from: SocketChannelIOHelper.java */
/* loaded from: classes6.dex */
public class c {
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(org.java_websocket_new.g r4, java.nio.channels.ByteChannel r5) throws java.io.IOException {
        /*
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r0 = r4.f87009d
            java.lang.Object r0 = r0.peek()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r1 = 0
            if (r0 != 0) goto L1c
            boolean r0 = r5 instanceof org.java_websocket_new.i
            if (r0 == 0) goto L35
            r0 = r5
            org.java_websocket_new.i r0 = (org.java_websocket_new.i) r0
            boolean r2 = r0.u1()
            if (r2 == 0) goto L36
            r0.p1()
            goto L36
        L1c:
            r5.write(r0)
            int r0 = r0.remaining()
            if (r0 <= 0) goto L26
            return r1
        L26:
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r0 = r4.f87009d
            r0.poll()
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r0 = r4.f87009d
            java.lang.Object r0 = r0.peek()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            if (r0 != 0) goto L1c
        L35:
            r0 = 0
        L36:
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r2 = r4.f87009d
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L69
            boolean r2 = r4.k()
            if (r2 == 0) goto L69
            org.java_websocket_new.drafts.a r2 = r4.i()
            if (r2 == 0) goto L69
            org.java_websocket_new.drafts.a r2 = r4.i()
            org.java_websocket_new.d$b r2 = r2.m()
            if (r2 == 0) goto L69
            org.java_websocket_new.drafts.a r2 = r4.i()
            org.java_websocket_new.d$b r2 = r2.m()
            org.java_websocket_new.d$b r3 = org.java_websocket_new.d.b.SERVER
            if (r2 != r3) goto L69
            monitor-enter(r4)
            r4.h()     // Catch: java.lang.Throwable -> L66
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L66
            goto L69
        L66:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L66
            throw r5
        L69:
            r4 = 1
            if (r0 == 0) goto L75
            org.java_websocket_new.i r5 = (org.java_websocket_new.i) r5
            boolean r5 = r5.u1()
            if (r5 == 0) goto L75
            goto L76
        L75:
            r1 = r4
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.java_websocket_new.c.a(org.java_websocket_new.g, java.nio.channels.ByteChannel):boolean");
    }

    public static boolean b(ByteBuffer byteBuffer, g gVar, ByteChannel byteChannel) throws IOException {
        byteBuffer.clear();
        int read = byteChannel.read(byteBuffer);
        byteBuffer.flip();
        if (read != -1) {
            return read != 0;
        }
        gVar.q();
        return false;
    }

    public static boolean c(ByteBuffer byteBuffer, g gVar, i iVar) throws IOException {
        byteBuffer.clear();
        int s12 = iVar.s1(byteBuffer);
        byteBuffer.flip();
        if (s12 != -1) {
            return iVar.x1();
        }
        gVar.q();
        return false;
    }
}
