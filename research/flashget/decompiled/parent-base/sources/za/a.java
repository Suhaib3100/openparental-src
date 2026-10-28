package za;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: BitstreamWriter.java */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final OutputStream f93819a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f93820b = new int[8];

    /* renamed from: c, reason: collision with root package name */
    private int f93821c;

    public a(OutputStream outputStream) {
        this.f93819a = outputStream;
    }

    private void d() throws IOException {
        int[] iArr = this.f93820b;
        this.f93819a.write(iArr[7] | (iArr[0] << 7) | (iArr[1] << 6) | (iArr[2] << 5) | (iArr[3] << 4) | (iArr[4] << 3) | (iArr[5] << 2) | (iArr[6] << 1));
    }

    public void a() throws IOException {
        for (int i4 = this.f93821c; i4 < 8; i4++) {
            this.f93820b[i4] = 0;
        }
        this.f93821c = 0;
        d();
    }

    public void b(int i4) throws IOException {
        if (this.f93821c == 8) {
            this.f93821c = 0;
            d();
        }
        int[] iArr = this.f93820b;
        int i5 = this.f93821c;
        this.f93821c = i5 + 1;
        iArr[i5] = i4;
    }

    public void c(int i4) throws IOException {
        this.f93819a.write(i4);
    }

    public void e(long j4, int i4) throws IOException {
        for (int i5 = 0; i5 < i4; i5++) {
            b(((int) (j4 >> ((i4 - i5) - 1))) & 1);
        }
    }

    public void f() throws IOException {
        e(0L, 8 - this.f93821c);
    }
}
