package com.google.common.escape;

import java.util.HashMap;
import java.util.Map;

/* compiled from: CharEscaperBuilder.java */
@f
@d9.b
/* loaded from: classes6.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    private int f56696b = -1;

    /* renamed from: a, reason: collision with root package name */
    private final Map<Character, String> f56695a = new HashMap();

    /* compiled from: CharEscaperBuilder.java */
    private static class a extends d {

        /* renamed from: c, reason: collision with root package name */
        private final char[][] f56697c;

        /* renamed from: d, reason: collision with root package name */
        private final int f56698d;

        a(char[][] cArr) {
            this.f56697c = cArr;
            this.f56698d = cArr.length;
        }

        @Override // com.google.common.escape.d, com.google.common.escape.h
        public String b(String str) {
            int length = str.length();
            for (int i4 = 0; i4 < length; i4++) {
                char charAt = str.charAt(i4);
                char[][] cArr = this.f56697c;
                if (charAt < cArr.length && cArr[charAt] != null) {
                    return d(str, i4);
                }
            }
            return str;
        }

        @Override // com.google.common.escape.d
        @zc.a
        protected char[] c(char c5) {
            if (c5 < this.f56698d) {
                return this.f56697c[c5];
            }
            return null;
        }
    }

    @f9.a
    public e a(char c5, String str) {
        Map<Character, String> map = this.f56695a;
        Character valueOf = Character.valueOf(c5);
        str.getClass();
        map.put(valueOf, str);
        if (c5 > this.f56696b) {
            this.f56696b = c5;
        }
        return this;
    }

    @f9.a
    public e b(char[] cArr, String str) {
        str.getClass();
        for (char c5 : cArr) {
            a(c5, str);
        }
        return this;
    }

    public char[][] c() {
        char[][] cArr = new char[this.f56696b + 1][];
        for (Map.Entry<Character, String> entry : this.f56695a.entrySet()) {
            cArr[entry.getKey().charValue()] = entry.getValue().toCharArray();
        }
        return cArr;
    }

    public h d() {
        return new a(c());
    }
}
