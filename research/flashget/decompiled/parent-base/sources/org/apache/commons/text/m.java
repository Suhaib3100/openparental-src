package org.apache.commons.text;

import java.util.Arrays;
import kotlin.text.m0;

/* compiled from: StrMatcher.java */
@Deprecated
/* loaded from: classes3.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    private static final m f86544a = new a(',');

    /* renamed from: b, reason: collision with root package name */
    private static final m f86545b = new a('\t');

    /* renamed from: c, reason: collision with root package name */
    private static final m f86546c = new a(' ');

    /* renamed from: d, reason: collision with root package name */
    private static final m f86547d = new b(" \t\n\r\f".toCharArray());

    /* renamed from: e, reason: collision with root package name */
    private static final m f86548e = new e();

    /* renamed from: f, reason: collision with root package name */
    private static final m f86549f = new a('\'');

    /* renamed from: g, reason: collision with root package name */
    private static final m f86550g = new a(m0.quote);

    /* renamed from: h, reason: collision with root package name */
    private static final m f86551h = new b("'\"".toCharArray());

    /* renamed from: i, reason: collision with root package name */
    private static final m f86552i = new c();

    /* compiled from: StrMatcher.java */
    static final class a extends m {

        /* renamed from: j, reason: collision with root package name */
        private final char f86553j;

        a(char c5) {
            this.f86553j = c5;
        }

        @Override // org.apache.commons.text.m
        public int g(char[] cArr, int i4, int i5, int i6) {
            return this.f86553j == cArr[i4] ? 1 : 0;
        }
    }

    /* compiled from: StrMatcher.java */
    static final class b extends m {

        /* renamed from: j, reason: collision with root package name */
        private final char[] f86554j;

        b(char[] cArr) {
            char[] cArr2 = (char[]) cArr.clone();
            this.f86554j = cArr2;
            Arrays.sort(cArr2);
        }

        @Override // org.apache.commons.text.m
        public int g(char[] cArr, int i4, int i5, int i6) {
            return Arrays.binarySearch(this.f86554j, cArr[i4]) >= 0 ? 1 : 0;
        }
    }

    /* compiled from: StrMatcher.java */
    static final class c extends m {
        c() {
        }

        @Override // org.apache.commons.text.m
        public int g(char[] cArr, int i4, int i5, int i6) {
            return 0;
        }
    }

    /* compiled from: StrMatcher.java */
    static final class d extends m {

        /* renamed from: j, reason: collision with root package name */
        private final char[] f86555j;

        d(String str) {
            this.f86555j = str.toCharArray();
        }

        @Override // org.apache.commons.text.m
        public int g(char[] cArr, int i4, int i5, int i6) {
            int length = this.f86555j.length;
            if (i4 + length > i6) {
                return 0;
            }
            int i7 = 0;
            while (true) {
                char[] cArr2 = this.f86555j;
                if (i7 >= cArr2.length) {
                    return length;
                }
                if (cArr2[i7] != cArr[i4]) {
                    return 0;
                }
                i7++;
                i4++;
            }
        }

        public String toString() {
            return super.toString() + ' ' + Arrays.toString(this.f86555j);
        }
    }

    /* compiled from: StrMatcher.java */
    static final class e extends m {
        e() {
        }

        @Override // org.apache.commons.text.m
        public int g(char[] cArr, int i4, int i5, int i6) {
            return cArr[i4] <= ' ' ? 1 : 0;
        }
    }

    protected m() {
    }

    public static m a(char c5) {
        return new a(c5);
    }

    public static m b(String str) {
        return (str == null || str.length() == 0) ? f86552i : str.length() == 1 ? new a(str.charAt(0)) : new b(str.toCharArray());
    }

    public static m c(char... cArr) {
        return org.apache.commons.lang3.e.i1(cArr) ? f86552i : cArr.length == 1 ? new a(cArr[0]) : new b(cArr);
    }

    public static m d() {
        return f86544a;
    }

    public static m e() {
        return f86550g;
    }

    public static m h() {
        return f86552i;
    }

    public static m i() {
        return f86551h;
    }

    public static m j() {
        return f86549f;
    }

    public static m k() {
        return f86546c;
    }

    public static m l() {
        return f86547d;
    }

    public static m m(String str) {
        return (str == null || str.length() == 0) ? f86552i : new d(str);
    }

    public static m n() {
        return f86545b;
    }

    public static m o() {
        return f86548e;
    }

    public int f(char[] cArr, int i4) {
        return g(cArr, i4, 0, cArr.length);
    }

    public abstract int g(char[] cArr, int i4, int i5, int i6);
}
