package org.apache.commons.lang3.text;

import java.util.Arrays;
import kotlin.text.m0;
import org.apache.commons.lang3.b1;

/* compiled from: StrMatcher.java */
@Deprecated
/* loaded from: classes6.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    private static final g f86165a = new a(',');

    /* renamed from: b, reason: collision with root package name */
    private static final g f86166b = new a('\t');

    /* renamed from: c, reason: collision with root package name */
    private static final g f86167c = new a(' ');

    /* renamed from: d, reason: collision with root package name */
    private static final g f86168d = new b(" \t\n\r\f".toCharArray());

    /* renamed from: e, reason: collision with root package name */
    private static final g f86169e = new e();

    /* renamed from: f, reason: collision with root package name */
    private static final g f86170f = new a('\'');

    /* renamed from: g, reason: collision with root package name */
    private static final g f86171g = new a(m0.quote);

    /* renamed from: h, reason: collision with root package name */
    private static final g f86172h = new b("'\"".toCharArray());

    /* renamed from: i, reason: collision with root package name */
    private static final g f86173i = new c();

    /* compiled from: StrMatcher.java */
    static final class a extends g {

        /* renamed from: j, reason: collision with root package name */
        private final char f86174j;

        a(char c5) {
            this.f86174j = c5;
        }

        @Override // org.apache.commons.lang3.text.g
        public int g(char[] cArr, int i4, int i5, int i6) {
            return this.f86174j == cArr[i4] ? 1 : 0;
        }
    }

    /* compiled from: StrMatcher.java */
    static final class b extends g {

        /* renamed from: j, reason: collision with root package name */
        private final char[] f86175j;

        b(char[] cArr) {
            char[] cArr2 = (char[]) cArr.clone();
            this.f86175j = cArr2;
            Arrays.sort(cArr2);
        }

        @Override // org.apache.commons.lang3.text.g
        public int g(char[] cArr, int i4, int i5, int i6) {
            return Arrays.binarySearch(this.f86175j, cArr[i4]) >= 0 ? 1 : 0;
        }
    }

    /* compiled from: StrMatcher.java */
    static final class c extends g {
        c() {
        }

        @Override // org.apache.commons.lang3.text.g
        public int g(char[] cArr, int i4, int i5, int i6) {
            return 0;
        }
    }

    /* compiled from: StrMatcher.java */
    static final class d extends g {

        /* renamed from: j, reason: collision with root package name */
        private final char[] f86176j;

        d(String str) {
            this.f86176j = str.toCharArray();
        }

        @Override // org.apache.commons.lang3.text.g
        public int g(char[] cArr, int i4, int i5, int i6) {
            int length = this.f86176j.length;
            if (i4 + length > i6) {
                return 0;
            }
            int i7 = 0;
            while (true) {
                char[] cArr2 = this.f86176j;
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
            return super.toString() + ' ' + Arrays.toString(this.f86176j);
        }
    }

    /* compiled from: StrMatcher.java */
    static final class e extends g {
        e() {
        }

        @Override // org.apache.commons.lang3.text.g
        public int g(char[] cArr, int i4, int i5, int i6) {
            return cArr[i4] <= ' ' ? 1 : 0;
        }
    }

    protected g() {
    }

    public static g a(char c5) {
        return new a(c5);
    }

    public static g b(String str) {
        return b1.G0(str) ? f86173i : str.length() == 1 ? new a(str.charAt(0)) : new b(str.toCharArray());
    }

    public static g c(char... cArr) {
        return (cArr == null || cArr.length == 0) ? f86173i : cArr.length == 1 ? new a(cArr[0]) : new b(cArr);
    }

    public static g d() {
        return f86165a;
    }

    public static g e() {
        return f86171g;
    }

    public static g h() {
        return f86173i;
    }

    public static g i() {
        return f86172h;
    }

    public static g j() {
        return f86170f;
    }

    public static g k() {
        return f86167c;
    }

    public static g l() {
        return f86168d;
    }

    public static g m(String str) {
        return b1.G0(str) ? f86173i : new d(str);
    }

    public static g n() {
        return f86166b;
    }

    public static g o() {
        return f86169e;
    }

    public int f(char[] cArr, int i4) {
        return g(cArr, i4, 0, cArr.length);
    }

    public abstract int g(char[] cArr, int i4, int i5, int i6);
}
