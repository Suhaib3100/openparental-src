package com.google.common.net;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: PercentEscaper.java */
@a
@d9.b
/* loaded from: classes6.dex */
public final class k extends com.google.common.escape.l {

    /* renamed from: e, reason: collision with root package name */
    private static final char[] f57453e = {'+'};

    /* renamed from: f, reason: collision with root package name */
    private static final char[] f57454f = ProtectedSandApp.s("\uf869").toCharArray();

    /* renamed from: c, reason: collision with root package name */
    private final boolean f57455c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean[] f57456d;

    public k(String str, boolean z4) {
        str.getClass();
        if (str.matches(ProtectedSandApp.s("\uf86a"))) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\uf86e"));
        }
        String concat = str.concat(ProtectedSandApp.s("\uf86b"));
        if (z4 && concat.contains(ProtectedSandApp.s("\uf86c"))) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\uf86d"));
        }
        this.f57455c = z4;
        this.f57456d = h(concat);
    }

    private static boolean[] h(String str) {
        char[] charArray = str.toCharArray();
        int i4 = -1;
        for (char c5 : charArray) {
            i4 = Math.max((int) c5, i4);
        }
        boolean[] zArr = new boolean[i4 + 1];
        for (char c6 : charArray) {
            zArr[c6] = true;
        }
        return zArr;
    }

    @Override // com.google.common.escape.l, com.google.common.escape.h
    public String b(String str) {
        str.getClass();
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = str.charAt(i4);
            boolean[] zArr = this.f57456d;
            if (charAt >= zArr.length || !zArr[charAt]) {
                return e(str, i4);
            }
        }
        return str;
    }

    @Override // com.google.common.escape.l
    @zc.a
    protected char[] d(int i4) {
        boolean[] zArr = this.f57456d;
        if (i4 < zArr.length && zArr[i4]) {
            return null;
        }
        if (i4 == 32 && this.f57455c) {
            return f57453e;
        }
        if (i4 <= 127) {
            char[] cArr = f57454f;
            return new char[]{'%', cArr[i4 >>> 4], cArr[i4 & 15]};
        }
        if (i4 <= 2047) {
            char[] cArr2 = f57454f;
            return new char[]{'%', cArr2[(i4 >>> 10) | 12], cArr2[(i4 >>> 6) & 15], '%', cArr2[((i4 >>> 4) & 3) | 8], cArr2[i4 & 15]};
        }
        if (i4 <= 65535) {
            char[] cArr3 = f57454f;
            return new char[]{'%', 'E', cArr3[i4 >>> 12], '%', cArr3[((i4 >>> 10) & 3) | 8], cArr3[(i4 >>> 6) & 15], '%', cArr3[((i4 >>> 4) & 3) | 8], cArr3[i4 & 15]};
        }
        if (i4 > 1114111) {
            throw new IllegalArgumentException(com.google.android.gms.internal.location.a.a(43, ProtectedSandApp.s("\uf86f"), i4));
        }
        char[] cArr4 = f57454f;
        return new char[]{'%', 'F', cArr4[(i4 >>> 18) & 7], '%', cArr4[((i4 >>> 16) & 3) | 8], cArr4[(i4 >>> 12) & 15], '%', cArr4[((i4 >>> 10) & 3) | 8], cArr4[(i4 >>> 6) & 15], '%', cArr4[((i4 >>> 4) & 3) | 8], cArr4[i4 & 15]};
    }

    @Override // com.google.common.escape.l
    protected int g(CharSequence charSequence, int i4, int i5) {
        charSequence.getClass();
        while (i4 < i5) {
            char charAt = charSequence.charAt(i4);
            boolean[] zArr = this.f57456d;
            if (charAt >= zArr.length || !zArr[charAt]) {
                break;
            }
            i4++;
        }
        return i4;
    }
}
