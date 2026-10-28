package com.google.common.util.concurrent;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: AtomicDouble.java */
@b0
/* loaded from: classes6.dex */
public class o extends Number implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    private static final long f57898c = 0;

    /* renamed from: b, reason: collision with root package name */
    private transient AtomicLong f57899b;

    public o(double d5) {
        this.f57899b = new AtomicLong(Double.doubleToRawLongBits(d5));
    }

    private void g(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f57899b = new AtomicLong();
        h(objectInputStream.readDouble());
    }

    private void j(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeDouble(c());
    }

    @f9.a
    public final double a(double d5) {
        long j4;
        double longBitsToDouble;
        do {
            j4 = this.f57899b.get();
            longBitsToDouble = Double.longBitsToDouble(j4) + d5;
        } while (!this.f57899b.compareAndSet(j4, Double.doubleToRawLongBits(longBitsToDouble)));
        return longBitsToDouble;
    }

    public final boolean b(double d5, double d6) {
        return this.f57899b.compareAndSet(Double.doubleToRawLongBits(d5), Double.doubleToRawLongBits(d6));
    }

    public final double c() {
        return Double.longBitsToDouble(this.f57899b.get());
    }

    @f9.a
    public final double d(double d5) {
        long j4;
        double longBitsToDouble;
        do {
            j4 = this.f57899b.get();
            longBitsToDouble = Double.longBitsToDouble(j4);
        } while (!this.f57899b.compareAndSet(j4, Double.doubleToRawLongBits(longBitsToDouble + d5)));
        return longBitsToDouble;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return c();
    }

    public final double e(double d5) {
        return Double.longBitsToDouble(this.f57899b.getAndSet(Double.doubleToRawLongBits(d5)));
    }

    public final void f(double d5) {
        this.f57899b.lazySet(Double.doubleToRawLongBits(d5));
    }

    @Override // java.lang.Number
    public float floatValue() {
        return (float) c();
    }

    public final void h(double d5) {
        this.f57899b.set(Double.doubleToRawLongBits(d5));
    }

    public final boolean i(double d5, double d6) {
        return this.f57899b.weakCompareAndSet(Double.doubleToRawLongBits(d5), Double.doubleToRawLongBits(d6));
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) c();
    }

    @Override // java.lang.Number
    public long longValue() {
        return (long) c();
    }

    public String toString() {
        return Double.toString(c());
    }

    public o() {
        this(com.google.firebase.remoteconfig.p.f60679p);
    }
}
