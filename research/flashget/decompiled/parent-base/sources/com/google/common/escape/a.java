package com.google.common.escape;

import java.util.Map;
import kotlin.jvm.internal.r;

/* compiled from: ArrayBasedCharEscaper.java */
@f
@d9.b
/* loaded from: classes6.dex */
public abstract class a extends d {

    /* renamed from: c, reason: collision with root package name */
    private final char[][] f56682c;

    /* renamed from: d, reason: collision with root package name */
    private final int f56683d;

    /* renamed from: e, reason: collision with root package name */
    private final char f56684e;

    /* renamed from: f, reason: collision with root package name */
    private final char f56685f;

    protected a(Map<Character, String> map, char c5, char c6) {
        this(b.a(map), c5, c6);
    }

    @Override // com.google.common.escape.d, com.google.common.escape.h
    public final String b(String str) {
        str.getClass();
        for (int i4 = 0; i4 < str.length(); i4++) {
            char charAt = str.charAt(i4);
            if ((charAt < this.f56683d && this.f56682c[charAt] != null) || charAt > this.f56685f || charAt < this.f56684e) {
                return d(str, i4);
            }
        }
        return str;
    }

    @Override // com.google.common.escape.d
    @zc.a
    protected final char[] c(char c5) {
        char[] cArr;
        if (c5 < this.f56683d && (cArr = this.f56682c[c5]) != null) {
            return cArr;
        }
        if (c5 < this.f56684e || c5 > this.f56685f) {
            return f(c5);
        }
        return null;
    }

    @zc.a
    protected abstract char[] f(char c5);

    protected a(b bVar, char c5, char c6) {
        bVar.getClass();
        char[][] c7 = bVar.c();
        this.f56682c = c7;
        this.f56683d = c7.length;
        if (c6 < c5) {
            c6 = 0;
            c5 = r.MAX_VALUE;
        }
        this.f56684e = c5;
        this.f56685f = c6;
    }
}
