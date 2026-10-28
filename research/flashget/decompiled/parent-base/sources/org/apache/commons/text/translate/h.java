package org.apache.commons.text.translate;

import java.io.IOException;
import java.io.Writer;
import org.apache.commons.lang3.s0;

/* compiled from: NumericEntityEscaper.java */
/* loaded from: classes3.dex */
public class h extends c {

    /* renamed from: b, reason: collision with root package name */
    private final boolean f86707b;

    /* renamed from: c, reason: collision with root package name */
    private final s0<Integer> f86708c;

    private h(int i4, int i5, boolean z4) {
        this.f86708c = s0.a(Integer.valueOf(i4), Integer.valueOf(i5));
        this.f86707b = z4;
    }

    public static h g(int i4) {
        return j(0, i4);
    }

    public static h h(int i4) {
        return j(i4, Integer.MAX_VALUE);
    }

    public static h i(int i4, int i5) {
        return new h(i4, i5, true);
    }

    public static h j(int i4, int i5) {
        return new h(i4, i5, false);
    }

    @Override // org.apache.commons.text.translate.c
    public boolean f(int i4, Writer writer) throws IOException {
        if (this.f86707b != this.f86708c.c(Integer.valueOf(i4))) {
            return false;
        }
        writer.write("&#");
        writer.write(Integer.toString(i4, 10));
        writer.write(59);
        return true;
    }

    public h() {
        this(0, Integer.MAX_VALUE, true);
    }
}
