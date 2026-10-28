package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: CountingInputStream.java */
/* loaded from: classes4.dex */
public class j extends n {

    /* renamed from: b, reason: collision with root package name */
    private long f85463b;

    public j(InputStream inputStream) {
        super(inputStream);
    }

    @Override // org.apache.commons.io.input.n
    protected synchronized void a(int i4) {
        if (i4 != -1) {
            this.f85463b += i4;
        }
    }

    public synchronized long d() {
        return this.f85463b;
    }

    public synchronized long e() {
        long j4;
        j4 = this.f85463b;
        this.f85463b = 0L;
        return j4;
    }

    public int f() {
        long e4 = e();
        if (e4 <= 2147483647L) {
            return (int) e4;
        }
        throw new ArithmeticException(androidx.compose.ui.input.pointer.s.a("The byte count ", e4, " is too large to be converted to an int"));
    }

    public int getCount() {
        long d5 = d();
        if (d5 <= 2147483647L) {
            return (int) d5;
        }
        throw new ArithmeticException(androidx.compose.ui.input.pointer.s.a("The byte count ", d5, " is too large to be converted to an int"));
    }

    @Override // org.apache.commons.io.input.n, java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j4) throws IOException {
        long skip;
        skip = super.skip(j4);
        this.f85463b += skip;
        return skip;
    }
}
