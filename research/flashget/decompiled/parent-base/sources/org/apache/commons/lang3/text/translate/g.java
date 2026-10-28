package org.apache.commons.lang3.text.translate;

import java.io.IOException;
import java.io.Writer;

/* compiled from: NumericEntityEscaper.java */
@Deprecated
/* loaded from: classes6.dex */
public class g extends c {

    /* renamed from: b, reason: collision with root package name */
    private final int f86215b;

    /* renamed from: c, reason: collision with root package name */
    private final int f86216c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f86217d;

    private g(int i4, int i5, boolean z4) {
        this.f86215b = i4;
        this.f86216c = i5;
        this.f86217d = z4;
    }

    public static g g(int i4) {
        return j(0, i4);
    }

    public static g h(int i4) {
        return j(i4, Integer.MAX_VALUE);
    }

    public static g i(int i4, int i5) {
        return new g(i4, i5, true);
    }

    public static g j(int i4, int i5) {
        return new g(i4, i5, false);
    }

    @Override // org.apache.commons.lang3.text.translate.c
    public boolean f(int i4, Writer writer) throws IOException {
        if (this.f86217d) {
            if (i4 < this.f86215b || i4 > this.f86216c) {
                return false;
            }
        } else if (i4 >= this.f86215b && i4 <= this.f86216c) {
            return false;
        }
        writer.write("&#");
        writer.write(Integer.toString(i4, 10));
        writer.write(59);
        return true;
    }

    public g() {
        this(0, Integer.MAX_VALUE, true);
    }
}
