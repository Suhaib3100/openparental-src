package org.apache.commons.text.matcher;

import java.util.Arrays;

/* compiled from: AbstractStringMatcher.java */
/* loaded from: classes3.dex */
abstract class a implements org.apache.commons.text.matcher.b {

    /* compiled from: AbstractStringMatcher.java */
    /* renamed from: org.apache.commons.text.matcher.a$a, reason: collision with other inner class name */
    static final class C1343a extends a {

        /* renamed from: a, reason: collision with root package name */
        private final org.apache.commons.text.matcher.b[] f86556a;

        C1343a(org.apache.commons.text.matcher.b... bVarArr) {
            this.f86556a = (org.apache.commons.text.matcher.b[]) bVarArr.clone();
        }

        @Override // org.apache.commons.text.matcher.b
        public int b(char[] cArr, int i4, int i5, int i6) {
            int i7 = 0;
            for (org.apache.commons.text.matcher.b bVar : this.f86556a) {
                if (bVar != null) {
                    int b5 = bVar.b(cArr, i4, i5, i6);
                    if (b5 == 0) {
                        return 0;
                    }
                    i7 += b5;
                    i4 += b5;
                }
            }
            return i7;
        }

        @Override // org.apache.commons.text.matcher.b
        public int c(CharSequence charSequence, int i4, int i5, int i6) {
            int i7 = 0;
            for (org.apache.commons.text.matcher.b bVar : this.f86556a) {
                if (bVar != null) {
                    int c5 = bVar.c(charSequence, i4, i5, i6);
                    if (c5 == 0) {
                        return 0;
                    }
                    i7 += c5;
                    i4 += c5;
                }
            }
            return i7;
        }

        @Override // org.apache.commons.text.matcher.b
        public int size() {
            int i4 = 0;
            for (org.apache.commons.text.matcher.b bVar : this.f86556a) {
                if (bVar != null) {
                    i4 = bVar.size() + i4;
                }
            }
            return i4;
        }
    }

    /* compiled from: AbstractStringMatcher.java */
    static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        private final char[] f86557a;

        /* renamed from: b, reason: collision with root package name */
        private final String f86558b;

        b(char... cArr) {
            this.f86558b = String.valueOf(cArr);
            this.f86557a = (char[]) cArr.clone();
        }

        @Override // org.apache.commons.text.matcher.b
        public int b(char[] cArr, int i4, int i5, int i6) {
            int length = this.f86557a.length;
            if (i4 + length > i6) {
                return 0;
            }
            int i7 = 0;
            while (i7 < length) {
                if (this.f86557a[i7] != cArr[i4]) {
                    return 0;
                }
                i7++;
                i4++;
            }
            return length;
        }

        @Override // org.apache.commons.text.matcher.b
        public int c(CharSequence charSequence, int i4, int i5, int i6) {
            int length = this.f86557a.length;
            if (i4 + length > i6) {
                return 0;
            }
            int i7 = 0;
            while (i7 < length) {
                if (this.f86557a[i7] != charSequence.charAt(i4)) {
                    return 0;
                }
                i7++;
                i4++;
            }
            return length;
        }

        @Override // org.apache.commons.text.matcher.b
        public int size() {
            return this.f86557a.length;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append("[\"");
            return android.support.v4.media.c.a(sb, this.f86558b, "\"]");
        }
    }

    /* compiled from: AbstractStringMatcher.java */
    static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        private final char f86559a;

        c(char c5) {
            this.f86559a = c5;
        }

        @Override // org.apache.commons.text.matcher.b
        public int b(char[] cArr, int i4, int i5, int i6) {
            return this.f86559a == cArr[i4] ? 1 : 0;
        }

        @Override // org.apache.commons.text.matcher.b
        public int c(CharSequence charSequence, int i4, int i5, int i6) {
            return this.f86559a == charSequence.charAt(i4) ? 1 : 0;
        }

        @Override // org.apache.commons.text.matcher.b
        public int size() {
            return 1;
        }

        public String toString() {
            return super.toString() + "['" + this.f86559a + "']";
        }
    }

    /* compiled from: AbstractStringMatcher.java */
    static final class d extends a {

        /* renamed from: a, reason: collision with root package name */
        private final char[] f86560a;

        d(char[] cArr) {
            char[] cArr2 = (char[]) cArr.clone();
            this.f86560a = cArr2;
            Arrays.sort(cArr2);
        }

        @Override // org.apache.commons.text.matcher.b
        public int b(char[] cArr, int i4, int i5, int i6) {
            return Arrays.binarySearch(this.f86560a, cArr[i4]) >= 0 ? 1 : 0;
        }

        @Override // org.apache.commons.text.matcher.b
        public int c(CharSequence charSequence, int i4, int i5, int i6) {
            return Arrays.binarySearch(this.f86560a, charSequence.charAt(i4)) >= 0 ? 1 : 0;
        }

        @Override // org.apache.commons.text.matcher.b
        public int size() {
            return 1;
        }

        public String toString() {
            return super.toString() + Arrays.toString(this.f86560a);
        }
    }

    /* compiled from: AbstractStringMatcher.java */
    static final class e extends a {
        e() {
        }

        @Override // org.apache.commons.text.matcher.b
        public int b(char[] cArr, int i4, int i5, int i6) {
            return 0;
        }

        @Override // org.apache.commons.text.matcher.b
        public int c(CharSequence charSequence, int i4, int i5, int i6) {
            return 0;
        }

        @Override // org.apache.commons.text.matcher.b
        public int size() {
            return 0;
        }
    }

    /* compiled from: AbstractStringMatcher.java */
    static final class f extends a {

        /* renamed from: a, reason: collision with root package name */
        private static final int f86561a = 32;

        f() {
        }

        @Override // org.apache.commons.text.matcher.b
        public int b(char[] cArr, int i4, int i5, int i6) {
            return cArr[i4] <= ' ' ? 1 : 0;
        }

        @Override // org.apache.commons.text.matcher.b
        public int c(CharSequence charSequence, int i4, int i5, int i6) {
            return charSequence.charAt(i4) <= ' ' ? 1 : 0;
        }

        @Override // org.apache.commons.text.matcher.b
        public int size() {
            return 1;
        }
    }

    protected a() {
    }
}
