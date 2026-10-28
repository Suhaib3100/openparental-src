package androidx.fragment.app;

import java.io.Writer;

/* compiled from: LogWriter.java */
/* loaded from: classes.dex */
final class l0 extends Writer {

    /* renamed from: o, reason: collision with root package name */
    private final String f8318o;

    /* renamed from: p, reason: collision with root package name */
    private StringBuilder f8319p = new StringBuilder(128);

    l0(String str) {
        this.f8318o = str;
    }

    private void a() {
        if (this.f8319p.length() > 0) {
            this.f8319p.toString();
            StringBuilder sb = this.f8319p;
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
    public void write(char[] cArr, int i5, int i6) {
        for (int i7 = 0; i7 < i6; i7++) {
            char c6 = cArr[i5 + i7];
            if (c6 == '\n') {
                a();
            } else {
                this.f8319p.append(c6);
            }
        }
    }
}
