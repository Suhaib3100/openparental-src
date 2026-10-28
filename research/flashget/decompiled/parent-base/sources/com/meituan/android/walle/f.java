package com.meituan.android.walle;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Map;

/* compiled from: PayloadReader.java */
/* loaded from: classes6.dex */
public final class f {
    private f() {
    }

    public static byte[] a(File file, int i4) {
        ByteBuffer byteBuffer;
        Map<Integer, ByteBuffer> b5 = b(file);
        if (b5 == null || (byteBuffer = b5.get(Integer.valueOf(i4))) == null) {
            return null;
        }
        return c(byteBuffer);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        if (r1 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.Map<java.lang.Integer, java.nio.ByteBuffer> b(java.io.File r3) {
        /*
            r0 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L32
            java.lang.String r2 = "ᡠ\u0001"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L32
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L32
            java.nio.channels.FileChannel r3 = r1.getChannel()     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            com.meituan.android.walle.e r2 = com.meituan.android.walle.a.b(r3)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L40
            java.lang.Object r2 = r2.a()     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L40
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L40
            java.util.Map r0 = com.meituan.android.walle.a.f(r2)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L40
            if (r3 == 0) goto L23
            r3.close()     // Catch: java.io.IOException -> L23 java.lang.Throwable -> L48
        L23:
            r1.close()     // Catch: java.lang.Throwable -> L48
            goto L48
        L27:
            r2 = move-exception
            goto L35
        L29:
            r2 = move-exception
            r3 = r0
            goto L35
        L2c:
            r3 = r0
            goto L40
        L2e:
            r2 = move-exception
            r3 = r0
            r1 = r3
            goto L35
        L32:
            r3 = r0
            r1 = r3
            goto L40
        L35:
            if (r3 == 0) goto L3a
            r3.close()     // Catch: java.io.IOException -> L3a java.lang.Throwable -> L48
        L3a:
            if (r1 == 0) goto L3f
            r1.close()     // Catch: java.io.IOException -> L3f java.lang.Throwable -> L48
        L3f:
            throw r2     // Catch: java.lang.Throwable -> L48
        L40:
            if (r3 == 0) goto L45
            r3.close()     // Catch: java.io.IOException -> L45 java.lang.Throwable -> L48
        L45:
            if (r1 == 0) goto L48
            goto L23
        L48:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.walle.f.b(java.io.File):java.util.Map");
    }

    private static byte[] c(ByteBuffer byteBuffer) {
        byte[] array = byteBuffer.array();
        int arrayOffset = byteBuffer.arrayOffset();
        return Arrays.copyOfRange(array, byteBuffer.position() + arrayOffset, byteBuffer.limit() + arrayOffset);
    }

    public static String d(File file, int i4) {
        byte[] a5 = a(file, i4);
        if (a5 == null) {
            return null;
        }
        try {
            return new String(a5, ProtectedSandApp.s("ᡡ\u0001"));
        } catch (UnsupportedEncodingException e4) {
            e4.printStackTrace();
            return null;
        }
    }
}
