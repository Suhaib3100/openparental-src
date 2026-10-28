package org.apache.commons.lang3.text.translate;

import java.io.IOException;
import java.io.Writer;

/* compiled from: UnicodeEscaper.java */
@Deprecated
/* loaded from: classes6.dex */
public class j extends c {

    /* renamed from: b, reason: collision with root package name */
    private final int f86219b;

    /* renamed from: c, reason: collision with root package name */
    private final int f86220c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f86221d;

    protected j(int i4, int i5, boolean z4) {
        this.f86219b = i4;
        this.f86220c = i5;
        this.f86221d = z4;
    }

    public static j g(int i4) {
        return j(0, i4);
    }

    public static j h(int i4) {
        return j(i4, Integer.MAX_VALUE);
    }

    public static j i(int i4, int i5) {
        return new j(i4, i5, true);
    }

    public static j j(int i4, int i5) {
        return new j(i4, i5, false);
    }

    @Override // org.apache.commons.lang3.text.translate.c
    public boolean f(int i4, Writer writer) throws IOException {
        if (this.f86221d) {
            if (i4 < this.f86219b || i4 > this.f86220c) {
                return false;
            }
        } else if (i4 >= this.f86219b && i4 <= this.f86220c) {
            return false;
        }
        if (i4 > 65535) {
            writer.write(k(i4));
            return true;
        }
        writer.write("\\u");
        char[] cArr = b.f86200a;
        writer.write(cArr[(i4 >> 12) & 15]);
        writer.write(cArr[(i4 >> 8) & 15]);
        writer.write(cArr[(i4 >> 4) & 15]);
        writer.write(cArr[i4 & 15]);
        return true;
    }

    protected String k(int i4) {
        return "\\u" + b.a(i4);
    }

    public j() {
        this(0, Integer.MAX_VALUE, true);
    }
}
