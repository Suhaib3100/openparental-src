package org.apache.commons.text.translate;

import java.io.IOException;
import java.io.Writer;

/* compiled from: UnicodeEscaper.java */
/* loaded from: classes3.dex */
public class l extends c {

    /* renamed from: b, reason: collision with root package name */
    private final int f86710b;

    /* renamed from: c, reason: collision with root package name */
    private final int f86711c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f86712d;

    protected l(int i4, int i5, boolean z4) {
        this.f86710b = i4;
        this.f86711c = i5;
        this.f86712d = z4;
    }

    public static l g(int i4) {
        return j(0, i4);
    }

    public static l h(int i4) {
        return j(i4, Integer.MAX_VALUE);
    }

    public static l i(int i4, int i5) {
        return new l(i4, i5, true);
    }

    public static l j(int i4, int i5) {
        return new l(i4, i5, false);
    }

    @Override // org.apache.commons.text.translate.c
    public boolean f(int i4, Writer writer) throws IOException {
        if (this.f86712d) {
            if (i4 < this.f86710b || i4 > this.f86711c) {
                return false;
            }
        } else if (i4 >= this.f86710b && i4 <= this.f86711c) {
            return false;
        }
        if (i4 > 65535) {
            writer.write(k(i4));
            return true;
        }
        writer.write("\\u");
        char[] cArr = b.f86687a;
        writer.write(cArr[(i4 >> 12) & 15]);
        writer.write(cArr[(i4 >> 8) & 15]);
        writer.write(cArr[(i4 >> 4) & 15]);
        writer.write(cArr[i4 & 15]);
        return true;
    }

    protected String k(int i4) {
        return "\\u" + b.a(i4);
    }

    public l() {
        this(0, Integer.MAX_VALUE, true);
    }
}
