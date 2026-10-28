package androidx.core.util;

import androidx.annotation.c1;
import java.io.Writer;

/* compiled from: LogWriter.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
@Deprecated
/* loaded from: classes3.dex */
public class o extends Writer {

    /* renamed from: b, reason: collision with root package name */
    private final String f26869b;

    /* renamed from: c, reason: collision with root package name */
    private StringBuilder f26870c = new StringBuilder(128);

    public o(String str) {
        this.f26869b = str;
    }

    private void a() {
        if (this.f26870c.length() > 0) {
            this.f26870c.toString();
            StringBuilder sb = this.f26870c;
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
                this.f26870c.append(c5);
            }
        }
    }
}
