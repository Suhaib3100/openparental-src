package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: CountingInputStream.java */
/* loaded from: classes6.dex */
public class j extends n {

    /* renamed from: o, reason: collision with root package name */
    private long f31946o;

    public j(InputStream inputStream) {
        super(inputStream);
    }

    @Override // org.apache.commons.io.input.n
    protected synchronized void a(int i5) {
        if (i5 != -1) {
            this.f31946o += i5;
        }
    }

    public synchronized long d() {
        return this.f31946o;
    }

    public synchronized long e() {
        long j5;
        j5 = this.f31946o;
        this.f31946o = 0L;
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

    @Override // org.apache.commons.io.input.n, java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j5) throws IOException {
        long skip;
        skip = super.skip(j5);
        this.f31946o += skip;
        return skip;
    }
}
