package org.apache.commons.io.output;

import java.io.OutputStream;

/* compiled from: CountingOutputStream.java */
/* loaded from: classes6.dex */
public class e extends l {

    /* renamed from: o, reason: collision with root package name */
    private long f32081o;

    public e(OutputStream outputStream) {
        super(outputStream);
        this.f32081o = 0L;
    }

    @Override // org.apache.commons.io.output.l
    protected synchronized void b(int i5) {
        this.f32081o += i5;
    }

    public synchronized long d() {
        return this.f32081o;
    }

    public synchronized long e() {
        long j5;
        j5 = this.f32081o;
        this.f32081o = 0L;
        return j5;
    }

    public int g() {
        long e6 = e();
        if (e6 <= 2147483647L) {
            return (int) e6;
        }
        throw new ArithmeticException("The byte count " + e6 + " is too large to be converted to an int");
    }

    public int getCount() {
        long d6 = d();
        if (d6 <= 2147483647L) {
            return (int) d6;
        }
        throw new ArithmeticException("The byte count " + d6 + " is too large to be converted to an int");
    }
}
