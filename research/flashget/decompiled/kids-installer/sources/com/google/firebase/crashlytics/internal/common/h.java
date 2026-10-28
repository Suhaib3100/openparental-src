package com.google.firebase.crashlytics.internal.common;

import android.os.Process;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: CLSUUID.java */
/* loaded from: classes2.dex */
class h {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicLong f15599a = new AtomicLong(0);

    /* renamed from: b, reason: collision with root package name */
    private static String f15600b;

    h(d0 d0Var) {
        byte[] bArr = new byte[10];
        e(bArr);
        d(bArr);
        c(bArr);
        String C = i.C(d0Var.a().c());
        String u5 = i.u(bArr);
        Locale locale = Locale.US;
        f15600b = String.format(locale, ProtectedSandApp.s("Ꮮ"), u5.substring(0, 12), u5.substring(12, 16), u5.subSequence(16, 20), C.substring(0, 12)).toUpperCase(locale);
    }

    private static byte[] a(long j5) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) j5);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    private static byte[] b(long j5) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) j5);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    private void c(byte[] bArr) {
        byte[] b6 = b(Integer.valueOf(Process.myPid()).shortValue());
        bArr[8] = b6[0];
        bArr[9] = b6[1];
    }

    private void d(byte[] bArr) {
        byte[] b6 = b(f15599a.incrementAndGet());
        bArr[6] = b6[0];
        bArr[7] = b6[1];
    }

    private void e(byte[] bArr) {
        long time = new Date().getTime();
        byte[] a6 = a(time / 1000);
        bArr[0] = a6[0];
        bArr[1] = a6[1];
        bArr[2] = a6[2];
        bArr[3] = a6[3];
        byte[] b6 = b(time % 1000);
        bArr[4] = b6[0];
        bArr[5] = b6[1];
    }

    public String toString() {
        return f15600b;
    }
}
