package androidx.core.util;

import androidx.annotation.c1;
import java.io.Writer;

/* compiled from: LogWriter.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
@Deprecated
/* loaded from: classes.dex */
public class i extends Writer {

    /* renamed from: o, reason: collision with root package name */
    private final String f5238o;

    /* renamed from: p, reason: collision with root package name */
    private StringBuilder f5239p = new StringBuilder(128);

    public i(String str) {
        this.f5238o = str;
    }

    private void a() {
        if (this.f5239p.length() > 0) {
            this.f5239p.toString();
            StringBuilder sb = this.f5239p;
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
                this.f5239p.append(c6);
            }
        }
    }
}
