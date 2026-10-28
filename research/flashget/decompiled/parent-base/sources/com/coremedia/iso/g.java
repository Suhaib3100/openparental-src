package com.coremedia.iso;

import androidx.core.view.u0;
import androidx.core.view.x1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* compiled from: IsoTypeReader.java */
/* loaded from: classes3.dex */
public final class g {
    public static int a(byte b5) {
        return b5 < 0 ? b5 + 256 : b5;
    }

    public static String b(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        try {
            return new String(bArr, ProtectedSandApp.s("ᒰ"));
        } catch (UnsupportedEncodingException e4) {
            throw new RuntimeException(e4);
        }
    }

    public static double c(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[4]);
        return (((((r0[0] << com.google.common.base.c.B) & x1.f27484y) | ((r0[1] << com.google.common.base.c.f54872r) & 16711680)) | ((r0[2] << 8) & u0.f27413f)) | (r0[3] & 255)) / 1.073741824E9d;
    }

    public static double d(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[4]);
        return (((((r0[0] << com.google.common.base.c.B) & x1.f27484y) | ((r0[1] << com.google.common.base.c.f54872r) & 16711680)) | ((r0[2] << 8) & u0.f27413f)) | (r0[3] & 255)) / 65536.0d;
    }

    public static float e(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[2]);
        return ((short) (((short) ((r0[0] << 8) & u0.f27413f)) | (r0[1] & 255))) / 256.0f;
    }

    public static String f(ByteBuffer byteBuffer) {
        int i4 = i(byteBuffer);
        StringBuilder sb = new StringBuilder();
        for (int i5 = 0; i5 < 3; i5++) {
            sb.append((char) (((i4 >> ((2 - i5) * 5)) & 31) + 96));
        }
        return sb.toString();
    }

    public static String g(ByteBuffer byteBuffer) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            byte b5 = byteBuffer.get();
            if (b5 == 0) {
                return l.a(byteArrayOutputStream.toByteArray());
            }
            byteArrayOutputStream.write(b5);
        }
    }

    public static String h(ByteBuffer byteBuffer, int i4) {
        byte[] bArr = new byte[i4];
        byteBuffer.get(bArr);
        return l.a(bArr);
    }

    public static int i(ByteBuffer byteBuffer) {
        return a(byteBuffer.get()) + (a(byteBuffer.get()) << 8);
    }

    public static int j(ByteBuffer byteBuffer) {
        return a(byteBuffer.get()) + (a(byteBuffer.get()) << 8);
    }

    public static int k(ByteBuffer byteBuffer) {
        return a(byteBuffer.get()) + (i(byteBuffer) << 8);
    }

    public static long l(ByteBuffer byteBuffer) {
        long j4 = byteBuffer.getInt();
        return j4 < 0 ? j4 + 4294967296L : j4;
    }

    public static long m(ByteBuffer byteBuffer) {
        return (p(byteBuffer) << 24) + (p(byteBuffer) << 16) + (p(byteBuffer) << 8) + p(byteBuffer);
    }

    public static long n(ByteBuffer byteBuffer) {
        long i4 = i(byteBuffer) << 32;
        if (i4 >= 0) {
            return l(byteBuffer) + i4;
        }
        throw new RuntimeException(ProtectedSandApp.s("ᒱ"));
    }

    public static long o(ByteBuffer byteBuffer) {
        long l4 = l(byteBuffer) << 32;
        if (l4 >= 0) {
            return l(byteBuffer) + l4;
        }
        throw new RuntimeException(ProtectedSandApp.s("ᒱ"));
    }

    public static int p(ByteBuffer byteBuffer) {
        return a(byteBuffer.get());
    }
}
