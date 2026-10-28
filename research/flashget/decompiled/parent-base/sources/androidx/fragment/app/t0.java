package androidx.fragment.app;

import java.io.Writer;

/* compiled from: LogWriter.java */
/* loaded from: classes3.dex */
final class t0 extends Writer {

    /* renamed from: b, reason: collision with root package name */
    private final String f30094b;

    /* renamed from: c, reason: collision with root package name */
    private StringBuilder f30095c = new StringBuilder(128);

    t0(String str) {
        this.f30094b = str;
    }

    private void a() {
        if (this.f30095c.length() > 0) {
            this.f30095c.toString();
            StringBuilder sb = this.f30095c;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i4, int i5) {
        for (int i6 = 0; i6 < i5; i6++) {
            char c5 = cArr[i4 + i6];
            if (c5 == '\n') {
                a();
            } else {
                this.f30095c.append(c5);
            }
        }
    }
}
