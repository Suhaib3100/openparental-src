package com.coremedia.iso;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.ByteBuffer;

/* compiled from: IsoTypeWriter.java */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ boolean f47638a = false;

    public static void a(ByteBuffer byteBuffer, double d5) {
        int i4 = (int) (d5 * 1.073741824E9d);
        byteBuffer.put((byte) (((-16777216) & i4) >> 24));
        byteBuffer.put((byte) ((16711680 & i4) >> 16));
        byteBuffer.put((byte) ((65280 & i4) >> 8));
        byteBuffer.put((byte) (i4 & 255));
    }

    public static void b(ByteBuffer byteBuffer, double d5) {
        int i4 = (int) (d5 * 65536.0d);
        byteBuffer.put((byte) (((-16777216) & i4) >> 24));
        byteBuffer.put((byte) ((16711680 & i4) >> 16));
        byteBuffer.put((byte) ((65280 & i4) >> 8));
        byteBuffer.put((byte) (i4 & 255));
    }

    public static void c(ByteBuffer byteBuffer, double d5) {
        short s4 = (short) (d5 * 256.0d);
        byteBuffer.put((byte) ((65280 & s4) >> 8));
        byteBuffer.put((byte) (s4 & 255));
    }

    public static void d(ByteBuffer byteBuffer, String str) {
        if (str.getBytes().length != 3) {
            throw new IllegalArgumentException(android.support.v4.media.d.a(ProtectedSandApp.s("ᒴ"), str, ProtectedSandApp.s("ᒵ")));
        }
        int i4 = 0;
        for (int i5 = 0; i5 < 3; i5++) {
            i4 += (str.getBytes()[i5] - 96) << ((2 - i5) * 5);
        }
        f(byteBuffer, i4);
    }

    public static void e(ByteBuffer byteBuffer, String str) {
        byte[] b5 = l.b(str);
        m(byteBuffer, b5.length);
        byteBuffer.put(b5);
    }

    public static void f(ByteBuffer byteBuffer, int i4) {
        m(byteBuffer, (65535 & i4) >> 8);
        m(byteBuffer, i4 & 255);
    }

    public static void g(ByteBuffer byteBuffer, int i4) {
        m(byteBuffer, i4 & 255);
        m(byteBuffer, (65535 & i4) >> 8);
    }

    public static void h(ByteBuffer byteBuffer, int i4) {
        int i5 = i4 & 16777215;
        f(byteBuffer, i5 >> 8);
        m(byteBuffer, i5);
    }

    public static void i(ByteBuffer byteBuffer, long j4) {
        byteBuffer.putInt((int) j4);
    }

    public static void j(ByteBuffer byteBuffer, long j4) {
        g(byteBuffer, ((int) j4) & 65535);
        g(byteBuffer, (int) ((j4 >> 16) & okhttp3.internal.ws.g.f84969s));
    }

    public static void k(ByteBuffer byteBuffer, long j4) {
        f(byteBuffer, (int) ((281474976710655L & j4) >> 32));
        byteBuffer.putInt((int) (j4 & 4294967295L));
    }

    public static void l(ByteBuffer byteBuffer, long j4) {
        byteBuffer.putLong(j4);
    }

    public static void m(ByteBuffer byteBuffer, int i4) {
        byteBuffer.put((byte) (i4 & 255));
    }

    public static void n(ByteBuffer byteBuffer, String str) {
        byteBuffer.put(l.b(str));
        m(byteBuffer, 0);
    }

    public static void o(ByteBuffer byteBuffer, String str) {
        byteBuffer.put(l.b(str));
        m(byteBuffer, 0);
    }
}
