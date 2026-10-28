package com.google.common.escape;

import java.util.Map;
import kotlin.jvm.internal.r;

/* compiled from: ArrayBasedUnicodeEscaper.java */
@f
@d9.b
/* loaded from: classes6.dex */
public abstract class c extends l {

    /* renamed from: c, reason: collision with root package name */
    private final char[][] f56688c;

    /* renamed from: d, reason: collision with root package name */
    private final int f56689d;

    /* renamed from: e, reason: collision with root package name */
    private final int f56690e;

    /* renamed from: f, reason: collision with root package name */
    private final int f56691f;

    /* renamed from: g, reason: collision with root package name */
    private final char f56692g;

    /* renamed from: h, reason: collision with root package name */
    private final char f56693h;

    protected c(Map<Character, String> map, int i4, int i5, String str) {
        this(b.a(map), i4, i5, str);
    }

    @Override // com.google.common.escape.l, com.google.common.escape.h
    public final String b(String str) {
        str.getClass();
        for (int i4 = 0; i4 < str.length(); i4++) {
            char charAt = str.charAt(i4);
            if ((charAt < this.f56689d && this.f56688c[charAt] != null) || charAt > this.f56693h || charAt < this.f56692g) {
                return e(str, i4);
            }
        }
        return str;
    }

    @Override // com.google.common.escape.l
    @zc.a
    protected final char[] d(int i4) {
        char[] cArr;
        if (i4 < this.f56689d && (cArr = this.f56688c[i4]) != null) {
            return cArr;
        }
        if (i4 < this.f56690e || i4 > this.f56691f) {
            return h(i4);
        }
        return null;
    }

    @Override // com.google.common.escape.l
    protected final int g(CharSequence charSequence, int i4, int i5) {
        while (i4 < i5) {
            char charAt = charSequence.charAt(i4);
            if ((charAt < this.f56689d && this.f56688c[charAt] != null) || charAt > this.f56693h || charAt < this.f56692g) {
                break;
            }
            i4++;
        }
        return i4;
    }

    @zc.a
    protected abstract char[] h(int i4);

    protected c(b bVar, int i4, int i5, String str) {
        bVar.getClass();
        char[][] c5 = bVar.c();
        this.f56688c = c5;
        this.f56689d = c5.length;
        if (i5 < i4) {
            i5 = -1;
            i4 = Integer.MAX_VALUE;
        }
        this.f56690e = i4;
        this.f56691f = i5;
        if (i4 >= 55296) {
            this.f56692g = r.MAX_VALUE;
            this.f56693h = (char) 0;
        } else {
            this.f56692g = (char) i4;
            this.f56693h = (char) Math.min(i5, 55295);
        }
    }
}
