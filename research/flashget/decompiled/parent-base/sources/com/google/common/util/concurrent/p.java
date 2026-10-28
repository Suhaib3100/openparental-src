package com.google.common.util.concurrent;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.primitives.k;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: AtomicDoubleArray.java */
@b0
@d9.c
/* loaded from: classes6.dex */
public class p implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    private static final long f57910c = 0;

    /* renamed from: b, reason: collision with root package name */
    private transient AtomicLongArray f57911b;

    public p(int i4) {
        this.f57911b = new AtomicLongArray(i4);
    }

    private void h(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        k.c e4 = com.google.common.primitives.k.e();
        for (int i4 = 0; i4 < readInt; i4++) {
            e4.a(Double.doubleToRawLongBits(objectInputStream.readDouble()));
        }
        this.f57911b = new AtomicLongArray(e4.f().A());
    }

    private void k(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        int length = this.f57911b.length();
        objectOutputStream.writeInt(length);
        for (int i4 = 0; i4 < length; i4++) {
            objectOutputStream.writeDouble(c(i4));
        }
    }

    @f9.a
    public double a(int i4, double d5) {
        long j4;
        double longBitsToDouble;
        do {
            j4 = this.f57911b.get(i4);
            longBitsToDouble = Double.longBitsToDouble(j4) + d5;
        } while (!this.f57911b.compareAndSet(i4, j4, Double.doubleToRawLongBits(longBitsToDouble)));
        return longBitsToDouble;
    }

    public final boolean b(int i4, double d5, double d6) {
        return this.f57911b.compareAndSet(i4, Double.doubleToRawLongBits(d5), Double.doubleToRawLongBits(d6));
    }

    public final double c(int i4) {
        return Double.longBitsToDouble(this.f57911b.get(i4));
    }

    @f9.a
    public final double d(int i4, double d5) {
        long j4;
        double longBitsToDouble;
        do {
            j4 = this.f57911b.get(i4);
            longBitsToDouble = Double.longBitsToDouble(j4);
        } while (!this.f57911b.compareAndSet(i4, j4, Double.doubleToRawLongBits(longBitsToDouble + d5)));
        return longBitsToDouble;
    }

    public final double e(int i4, double d5) {
        return Double.longBitsToDouble(this.f57911b.getAndSet(i4, Double.doubleToRawLongBits(d5)));
    }

    public final void f(int i4, double d5) {
        this.f57911b.lazySet(i4, Double.doubleToRawLongBits(d5));
    }

    public final int g() {
        return this.f57911b.length();
    }

    public final void i(int i4, double d5) {
        this.f57911b.set(i4, Double.doubleToRawLongBits(d5));
    }

    public final boolean j(int i4, double d5, double d6) {
        return this.f57911b.weakCompareAndSet(i4, Double.doubleToRawLongBits(d5), Double.doubleToRawLongBits(d6));
    }

    public String toString() {
        int length = this.f57911b.length();
        int i4 = length - 1;
        if (i4 == -1) {
            return ProtectedSandApp.s("兀");
        }
        StringBuilder sb = new StringBuilder(length * 19);
        sb.append('[');
        int i5 = 0;
        while (true) {
            sb.append(Double.longBitsToDouble(this.f57911b.get(i5)));
            if (i5 == i4) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(ProtectedSandApp.s("嗀"));
            i5++;
        }
    }

    public p(double[] dArr) {
        int length = dArr.length;
        long[] jArr = new long[length];
        for (int i4 = 0; i4 < length; i4++) {
            jArr[i4] = Double.doubleToRawLongBits(dArr[i4]);
        }
        this.f57911b = new AtomicLongArray(jArr);
    }
}
