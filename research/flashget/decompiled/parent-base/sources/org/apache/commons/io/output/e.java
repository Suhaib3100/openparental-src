package org.apache.commons.io.output;

import java.io.OutputStream;

/* compiled from: CountingOutputStream.java */
/* loaded from: classes4.dex */
public class e extends l {

    /* renamed from: b, reason: collision with root package name */
    private long f85593b;

    public e(OutputStream outputStream) {
        super(outputStream);
        this.f85593b = 0L;
    }

    @Override // org.apache.commons.io.output.l
    protected synchronized void b(int i4) {
        this.f85593b += i4;
    }

    public synchronized long d() {
        return this.f85593b;
    }

    public synchronized long e() {
        long j4;
        j4 = this.f85593b;
        this.f85593b = 0L;
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
}
