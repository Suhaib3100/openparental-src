package com.google.common.base;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Arrays;
import java.util.BitSet;

/* compiled from: CharMatcher.java */
@com.google.common.base.o
@d9.b(emulated = true)
/* loaded from: classes6.dex */
public abstract class f implements m0<Character> {

    /* renamed from: b, reason: collision with root package name */
    private static final int f54901b = 65536;

    /* compiled from: CharMatcher.java */
    class a extends x {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f54902d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f fVar, f fVar2, String str) {
            super(fVar2);
            this.f54902d = str;
        }

        @Override // com.google.common.base.f.w, com.google.common.base.f
        public String toString() {
            return this.f54902d;
        }
    }

    /* compiled from: CharMatcher.java */
    private static class a0 extends f {

        /* renamed from: c, reason: collision with root package name */
        private final String f54903c;

        /* renamed from: d, reason: collision with root package name */
        private final char[] f54904d;

        /* renamed from: e, reason: collision with root package name */
        private final char[] f54905e;

        a0(String str, char[] cArr, char[] cArr2) {
            this.f54903c = str;
            this.f54904d = cArr;
            this.f54905e = cArr2;
            l0.d(cArr.length == cArr2.length);
            int i4 = 0;
            while (i4 < cArr.length) {
                l0.d(cArr[i4] <= cArr2[i4]);
                int i5 = i4 + 1;
                if (i5 < cArr.length) {
                    l0.d(cArr2[i4] < cArr[i5]);
                }
                i4 = i5;
            }
        }

        @Override // com.google.common.base.f
        public boolean B(char c5) {
            int binarySearch = Arrays.binarySearch(this.f54904d, c5);
            if (binarySearch >= 0) {
                return true;
            }
            int i4 = (~binarySearch) - 1;
            return i4 >= 0 && c5 <= this.f54905e[i4];
        }

        @Override // com.google.common.base.f, com.google.common.base.m0
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.google.common.base.f
        public String toString() {
            return this.f54903c;
        }
    }

    /* compiled from: CharMatcher.java */
    private static final class b extends f {

        /* renamed from: c, reason: collision with root package name */
        final f f54906c;

        /* renamed from: d, reason: collision with root package name */
        final f f54907d;

        b(f fVar, f fVar2) {
            fVar.getClass();
            this.f54906c = fVar;
            fVar2.getClass();
            this.f54907d = fVar2;
        }

        @Override // com.google.common.base.f
        public boolean B(char c5) {
            return this.f54906c.B(c5) && this.f54907d.B(c5);
        }

        @Override // com.google.common.base.f
        @d9.c
        void Q(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.f54906c.Q(bitSet2);
            BitSet bitSet3 = new BitSet();
            this.f54907d.Q(bitSet3);
            bitSet2.and(bitSet3);
            bitSet.or(bitSet2);
        }

        @Override // com.google.common.base.f, com.google.common.base.m0
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return apply(ch);
        }

        @Override // com.google.common.base.f
        public String toString() {
            String valueOf = String.valueOf(this.f54906c);
            String valueOf2 = String.valueOf(this.f54907d);
            StringBuilder a5 = com.google.common.base.g.a(valueOf2.length() + valueOf.length() + 19, ProtectedSandApp.s("\uf2d6"), valueOf, ProtectedSandApp.s("\uf2d7"), valueOf2);
            a5.append(ProtectedSandApp.s("\uf2d8"));
            return a5.toString();
        }
    }

    /* compiled from: CharMatcher.java */
    private static final class b0 extends a0 {

        /* renamed from: f, reason: collision with root package name */
        static final b0 f54908f = new b0();

        private b0() {
            super(ProtectedSandApp.s("\uf2d5"), ProtectedSandApp.s("\uf2d3").toCharArray(), ProtectedSandApp.s("\uf2d4").toCharArray());
        }
    }

    /* compiled from: CharMatcher.java */
    private static final class c extends v {

        /* renamed from: d, reason: collision with root package name */
        static final c f54909d = new c();

        private c() {
            super(ProtectedSandApp.s("\uf2db"));
        }

        @Override // com.google.common.base.f
        public int A(CharSequence charSequence) {
            return charSequence.length() - 1;
        }

        @Override // com.google.common.base.f
        public boolean B(char c5) {
            return true;
        }

        @Override // com.google.common.base.f
        public boolean C(CharSequence charSequence) {
            charSequence.getClass();
            return true;
        }

        @Override // com.google.common.base.f
        public boolean E(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        @Override // com.google.common.base.f.i, com.google.common.base.f
        public f F() {
            return y.f54938d;
        }

        @Override // com.google.common.base.f
        public f I(f fVar) {
            fVar.getClass();
            return this;
        }

        @Override // com.google.common.base.f
        public String M(CharSequence charSequence) {
            charSequence.getClass();
            return "";
        }

        @Override // com.google.common.base.f
        public String N(CharSequence charSequence, char c5) {
            char[] cArr = new char[charSequence.length()];
            Arrays.fill(cArr, c5);
            return new String(cArr);
        }

        @Override // com.google.common.base.f
        public String O(CharSequence charSequence, CharSequence charSequence2) {
            StringBuilder sb = new StringBuilder(charSequence2.length() * charSequence.length());
            for (int i4 = 0; i4 < charSequence.length(); i4++) {
                sb.append(charSequence2);
            }
            return sb.toString();
        }

        @Override // com.google.common.base.f
        public String U(CharSequence charSequence) {
            charSequence.getClass();
            return "";
        }

        @Override // com.google.common.base.f
        public f b(f fVar) {
            fVar.getClass();
            return fVar;
        }

        @Override // com.google.common.base.f
        public String h(CharSequence charSequence, char c5) {
            return charSequence.length() == 0 ? "" : String.valueOf(c5);
        }

        @Override // com.google.common.base.f
        public int i(CharSequence charSequence) {
            return charSequence.length();
        }

        @Override // com.google.common.base.f
        public int n(CharSequence charSequence) {
            return charSequence.length() == 0 ? -1 : 0;
        }

        @Override // com.google.common.base.f
        public int o(CharSequence charSequence, int i4) {
            int length = charSequence.length();
            l0.d0(i4, length);
            if (i4 == length) {
                return -1;
            }
            return i4;
        }
    }

    /* compiled from: CharMatcher.java */
    @d9.d
    static final class c0 extends v {

        /* renamed from: e, reason: collision with root package name */
        static final int f54911e = 1682554634;

        /* renamed from: d, reason: collision with root package name */
        static final String f54910d = ProtectedSandApp.s("\uf2d9");

        /* renamed from: f, reason: collision with root package name */
        static final int f54912f = Integer.numberOfLeadingZeros(31);

        /* renamed from: g, reason: collision with root package name */
        static final c0 f54913g = new c0();

        c0() {
            super(ProtectedSandApp.s("\uf2da"));
        }

        @Override // com.google.common.base.f
        public boolean B(char c5) {
            return ProtectedSandApp.s("\uf2d9").charAt((f54911e * c5) >>> f54912f) == c5;
        }

        @Override // com.google.common.base.f
        @d9.c
        void Q(BitSet bitSet) {
            for (int i4 = 0; i4 < 32; i4++) {
                bitSet.set(ProtectedSandApp.s("\uf2d9").charAt(i4));
            }
        }
    }

    /* compiled from: CharMatcher.java */
    private static final class d extends f {

        /* renamed from: c, reason: collision with root package name */
        private final char[] f54914c;

        public d(CharSequence charSequence) {
            char[] charArray = charSequence.toString().toCharArray();
            this.f54914c = charArray;
            Arrays.sort(charArray);
        }

        @Override // com.google.common.base.f
        public boolean B(char c5) {
            return Arrays.binarySearch(this.f54914c, c5) >= 0;
        }

        @Override // com.google.common.base.f
        @d9.c
        void Q(BitSet bitSet) {
            for (char c5 : this.f54914c) {
                bitSet.set(c5);
            }
        }

        @Override // com.google.common.base.f, com.google.common.base.m0
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return apply(ch);
        }

        @Override // com.google.common.base.f
        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("\uf2dc"));
            for (char c5 : this.f54914c) {
                sb.append(f.R(c5));
            }
            sb.append(ProtectedSandApp.s("\uf2dd"));
            return sb.toString();
        }
    }

    /* compiled from: CharMatcher.java */
    private static final class e extends v {

        /* renamed from: d, reason: collision with root package name */
        static final e f54915d = new e();

        e() {
            super(ProtectedSandApp.s("\uf2de"));
        }

        @Override // com.google.common.base.f
        public boolean B(char c5) {
            return c5 <= 127;
        }
    }

    /* compiled from: CharMatcher.java */
    @d9.c
    /* renamed from: com.google.common.base.f$f, reason: collision with other inner class name */
    private static final class C0828f extends v {

        /* renamed from: d, reason: collision with root package name */
        private final BitSet f54916d;

        /* synthetic */ C0828f(BitSet bitSet, String str, a aVar) {
            this(bitSet, str);
        }

        @Override // com.google.common.base.f
        public boolean B(char c5) {
            return this.f54916d.get(c5);
        }

        @Override // com.google.common.base.f
        void Q(BitSet bitSet) {
            bitSet.or(this.f54916d);
        }

        private C0828f(BitSet bitSet, String str) {
            super(str);
            this.f54916d = bitSet.length() + 64 < bitSet.size() ? (BitSet) bitSet.clone() : bitSet;
        }
    }

    /* compiled from: CharMatcher.java */
    private static final class g extends f {

        /* renamed from: c, reason: collision with root package name */
        static final f f54917c = new g();

        private g() {
        }

        @Override // com.google.common.base.f
        public boolean B(char c5) {
            if (c5 != ' ' && c5 != 133 && c5 != 5760) {
                if (c5 == 8199) {
                    return false;
                }
                if (c5 != 8287 && c5 != 12288 && c5 != 8232 && c5 != 8233) {
                    switch (c5) {
                        case '\t':
                        case '\n':
                        case 11:
                        case '\f':
                        case '\r':
                            break;
                        default:
                            if (c5 < 8192 || c5 > 8202) {
                                break;
                            }
                            break;
                    }
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.base.f, com.google.common.base.m0
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return apply(ch);
        }

        @Override // com.google.common.base.f
        public String toString() {
            return ProtectedSandApp.s("\uf2df");
        }
    }

    /* compiled from: CharMatcher.java */
    private static final class h extends a0 {

        /* renamed from: f, reason: collision with root package name */
        private static final String f54918f = ProtectedSandApp.s("\uf2e0");

        /* renamed from: g, reason: collision with root package name */
        static final h f54919g = new h();

        private h() {
            super(ProtectedSandApp.s("\uf2e1"), ProtectedSandApp.s("\uf2e0").toCharArray(), Y());
        }

        private static char[] Y() {
            char[] cArr = new char[37];
            for (int i4 = 0; i4 < 37; i4++) {
                cArr[i4] = (char) (ProtectedSandApp.s("\uf2e0").charAt(i4) + '\t');
            }
            return cArr;
        }

        private static char[] Z() {
            return ProtectedSandApp.s("\uf2e0").toCharArray();
        }
    }

    /* compiled from: CharMatcher.java */
    static abstract class i extends f {
        i() {
        }

        @Override // com.google.common.base.f
        public f F() {
            return new x(this);
        }

        @Override // com.google.common.base.f
        public final f J() {
            return this;
        }

        @Override // com.google.common.base.f, com.google.common.base.m0
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }
    }

    /* compiled from: CharMatcher.java */
    private static final class j extends f {

        /* renamed from: c, reason: collision with root package name */
        private final m0<? super Character> f54920c;

        j(m0<? super Character> m0Var) {
            m0Var.getClass();
            this.f54920c = m0Var;
        }

        @Override // com.google.common.base.f
        public boolean B(char c5) {
            return this.f54920c.apply(Character.valueOf(c5));
        }

        @Override // com.google.common.base.f, com.google.common.base.m0
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean apply(Character ch) {
            m0<? super Character> m0Var = this.f54920c;
            ch.getClass();
            return m0Var.apply(ch);
        }

        @Override // com.google.common.base.f
        public String toString() {
            String valueOf = String.valueOf(this.f54920c);
            return com.google.common.base.h.a(valueOf.length() + 26, ProtectedSandApp.s("\uf2e2"), valueOf, ProtectedSandApp.s("\uf2e3"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CharMatcher.java */
    static final class k extends i {

        /* renamed from: c, reason: collision with root package name */
        private final char f54921c;

        /* renamed from: d, reason: collision with root package name */
        private final char f54922d;

        k(char c5, char c6) {
            l0.d(c6 >= c5);
            this.f54921c = c5;
            this.f54922d = c6;
        }

        @Override // com.google.common.base.f
        public boolean B(char c5) {
            return this.f54921c <= c5 && c5 <= this.f54922d;
        }

        @Override // com.google.common.base.f
        @d9.c
        void Q(BitSet bitSet) {
            bitSet.set(this.f54921c, this.f54922d + 1);
        }

        @Override // com.google.common.base.f
        public String toString() {
            String R = f.R(this.f54921c);
            String R2 = f.R(this.f54922d);
            StringBuilder a5 = com.google.common.base.g.a(com.google.android.gms.common.internal.b.a(R2, com.google.android.gms.common.internal.b.a(R, 27)), ProtectedSandApp.s("\uf2e4"), R, ProtectedSandApp.s("\uf2e5"), R2);
            a5.append(ProtectedSandApp.s("\uf2e6"));
            return a5.toString();
        }
    }

    /* compiled from: CharMatcher.java */
    private static final class l extends a0 {

        /* renamed from: f, reason: collision with root package name */
        private static final String f54923f = ProtectedSandApp.s("\uf2e7");

        /* renamed from: g, reason: collision with root package name */
        private static final String f54924g = ProtectedSandApp.s("\uf2e8");

        /* renamed from: h, reason: collision with root package name */
        static final l f54925h = new l();

        private l() {
            super(ProtectedSandApp.s("\uf2e9"), ProtectedSandApp.s("\uf2e7").toCharArray(), ProtectedSandApp.s("\uf2e8").toCharArray());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CharMatcher.java */
    static final class m extends i {

        /* renamed from: c, reason: collision with root package name */
        private final char f54926c;

        m(char c5) {
            this.f54926c = c5;
        }

        @Override // com.google.common.base.f
        public boolean B(char c5) {
            return c5 == this.f54926c;
        }

        @Override // com.google.common.base.f.i, com.google.common.base.f
        public f F() {
            return new o(this.f54926c);
        }

        @Override // com.google.common.base.f
        public f I(f fVar) {
            return fVar.B(this.f54926c) ? fVar : new z(this, fVar);
        }

        @Override // com.google.common.base.f
        public String N(CharSequence charSequence, char c5) {
            return charSequence.toString().replace(this.f54926c, c5);
        }

        @Override // com.google.common.base.f
        @d9.c
        void Q(BitSet bitSet) {
            bitSet.set(this.f54926c);
        }

        @Override // com.google.common.base.f
        public f b(f fVar) {
            return fVar.B(this.f54926c) ? this : y.f54938d;
        }

        @Override // com.google.common.base.f
        public String toString() {
            String R = f.R(this.f54926c);
            return com.google.common.base.h.a(com.google.android.gms.common.internal.b.a(R, 18), ProtectedSandApp.s("\uf2ea"), R, ProtectedSandApp.s("\uf2eb"));
        }
    }

    /* compiled from: CharMatcher.java */
    private static final class n extends i {

        /* renamed from: c, reason: collision with root package name */
        private final char f54927c;

        /* renamed from: d, reason: collision with root package name */
        private final char f54928d;

        n(char c5, char c6) {
            this.f54927c = c5;
            this.f54928d = c6;
        }

        @Override // com.google.common.base.f
        public boolean B(char c5) {
            return c5 == this.f54927c || c5 == this.f54928d;
        }

        @Override // com.google.common.base.f
        @d9.c
        void Q(BitSet bitSet) {
            bitSet.set(this.f54927c);
            bitSet.set(this.f54928d);
        }

        @Override // com.google.common.base.f
        public String toString() {
            String R = f.R(this.f54927c);
            String R2 = f.R(this.f54928d);
            return com.google.common.base.e.a(com.google.android.gms.common.internal.b.a(R2, com.google.android.gms.common.internal.b.a(R, 21)), ProtectedSandApp.s("\uf2ec"), R, R2, ProtectedSandApp.s("\uf2ed"));
        }
    }

    /* compiled from: CharMatcher.java */
    private static final class o extends i {

        /* renamed from: c, reason: collision with root package name */
        private final char f54929c;

        o(char c5) {
            this.f54929c = c5;
        }

        @Override // com.google.common.base.f
        public boolean B(char c5) {
            return c5 != this.f54929c;
        }

        @Override // com.google.common.base.f.i, com.google.common.base.f
        public f F() {
            return new m(this.f54929c);
        }

        @Override // com.google.common.base.f
        public f I(f fVar) {
            return fVar.B(this.f54929c) ? c.f54909d : this;
        }

        @Override // com.google.common.base.f
        @d9.c
        void Q(BitSet bitSet) {
            bitSet.set(0, this.f54929c);
            bitSet.set(this.f54929c + 1, 65536);
        }

        @Override // com.google.common.base.f
        public f b(f fVar) {
            return fVar.B(this.f54929c) ? new b(this, fVar) : fVar;
        }

        @Override // com.google.common.base.f
        public String toString() {
            String R = f.R(this.f54929c);
            return com.google.common.base.h.a(com.google.android.gms.common.internal.b.a(R, 21), ProtectedSandApp.s("\uf2ee"), R, ProtectedSandApp.s("\uf2ef"));
        }
    }

    /* compiled from: CharMatcher.java */
    private static final class p extends f {

        /* renamed from: c, reason: collision with root package name */
        static final p f54930c = new p();

        private p() {
        }

        @Override // com.google.common.base.f
        public boolean B(char c5) {
            return Character.isDigit(c5);
        }

        @Override // com.google.common.base.f, com.google.common.base.m0
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return apply(ch);
        }

        @Override // com.google.common.base.f
        public String toString() {
            return ProtectedSandApp.s("\uf2f0");
        }
    }

    /* compiled from: CharMatcher.java */
    private static final class q extends v {

        /* renamed from: d, reason: collision with root package name */
        static final q f54931d = new q();

        private q() {
            super(ProtectedSandApp.s("\uf2f1"));
        }

        @Override // com.google.common.base.f
        public boolean B(char c5) {
            return c5 <= 31 || (c5 >= 127 && c5 <= 159);
        }
    }

    /* compiled from: CharMatcher.java */
    private static final class r extends f {

        /* renamed from: c, reason: collision with root package name */
        static final r f54932c = new r();

        private r() {
        }

        @Override // com.google.common.base.f
        public boolean B(char c5) {
            return Character.isLetter(c5);
        }

        @Override // com.google.common.base.f, com.google.common.base.m0
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return apply(ch);
        }

        @Override // com.google.common.base.f
        public String toString() {
            return ProtectedSandApp.s("\uf2f2");
        }
    }

    /* compiled from: CharMatcher.java */
    private static final class s extends f {

        /* renamed from: c, reason: collision with root package name */
        static final s f54933c = new s();

        private s() {
        }

        @Override // com.google.common.base.f
        public boolean B(char c5) {
            return Character.isLetterOrDigit(c5);
        }

        @Override // com.google.common.base.f, com.google.common.base.m0
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return apply(ch);
        }

        @Override // com.google.common.base.f
        public String toString() {
            return ProtectedSandApp.s("\uf2f3");
        }
    }

    /* compiled from: CharMatcher.java */
    private static final class t extends f {

        /* renamed from: c, reason: collision with root package name */
        static final t f54934c = new t();

        private t() {
        }

        @Override // com.google.common.base.f
        public boolean B(char c5) {
            return Character.isLowerCase(c5);
        }

        @Override // com.google.common.base.f, com.google.common.base.m0
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return apply(ch);
        }

        @Override // com.google.common.base.f
        public String toString() {
            return ProtectedSandApp.s("\uf2f4");
        }
    }

    /* compiled from: CharMatcher.java */
    private static final class u extends f {

        /* renamed from: c, reason: collision with root package name */
        static final u f54935c = new u();

        private u() {
        }

        @Override // com.google.common.base.f
        public boolean B(char c5) {
            return Character.isUpperCase(c5);
        }

        @Override // com.google.common.base.f, com.google.common.base.m0
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return apply(ch);
        }

        @Override // com.google.common.base.f
        public String toString() {
            return ProtectedSandApp.s("\uf2f5");
        }
    }

    /* compiled from: CharMatcher.java */
    static abstract class v extends i {

        /* renamed from: c, reason: collision with root package name */
        private final String f54936c;

        v(String str) {
            str.getClass();
            this.f54936c = str;
        }

        @Override // com.google.common.base.f
        public final String toString() {
            return this.f54936c;
        }
    }

    /* compiled from: CharMatcher.java */
    private static class w extends f {

        /* renamed from: c, reason: collision with root package name */
        final f f54937c;

        w(f fVar) {
            fVar.getClass();
            this.f54937c = fVar;
        }

        @Override // com.google.common.base.f
        public boolean B(char c5) {
            return !this.f54937c.B(c5);
        }

        @Override // com.google.common.base.f
        public boolean C(CharSequence charSequence) {
            return this.f54937c.E(charSequence);
        }

        @Override // com.google.common.base.f
        public boolean E(CharSequence charSequence) {
            return this.f54937c.C(charSequence);
        }

        @Override // com.google.common.base.f
        public f F() {
            return this.f54937c;
        }

        @Override // com.google.common.base.f
        @d9.c
        void Q(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.f54937c.Q(bitSet2);
            bitSet2.flip(0, 65536);
            bitSet.or(bitSet2);
        }

        @Override // com.google.common.base.f, com.google.common.base.m0
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.google.common.base.f
        public int i(CharSequence charSequence) {
            return charSequence.length() - this.f54937c.i(charSequence);
        }

        @Override // com.google.common.base.f
        public String toString() {
            String valueOf = String.valueOf(this.f54937c);
            return com.google.common.base.i.a(valueOf.length() + 9, valueOf, ProtectedSandApp.s("\uf2d2"));
        }
    }

    /* compiled from: CharMatcher.java */
    static class x extends w {
        x(f fVar) {
            super(fVar);
        }

        @Override // com.google.common.base.f
        public final f J() {
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CharMatcher.java */
    static final class y extends v {

        /* renamed from: d, reason: collision with root package name */
        static final y f54938d = new y();

        private y() {
            super(ProtectedSandApp.s("\uf2f6"));
        }

        @Override // com.google.common.base.f
        public int A(CharSequence charSequence) {
            charSequence.getClass();
            return -1;
        }

        @Override // com.google.common.base.f
        public boolean B(char c5) {
            return false;
        }

        @Override // com.google.common.base.f
        public boolean C(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        @Override // com.google.common.base.f
        public boolean E(CharSequence charSequence) {
            charSequence.getClass();
            return true;
        }

        @Override // com.google.common.base.f.i, com.google.common.base.f
        public f F() {
            return c.f54909d;
        }

        @Override // com.google.common.base.f
        public f I(f fVar) {
            fVar.getClass();
            return fVar;
        }

        @Override // com.google.common.base.f
        public String M(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.f
        public String N(CharSequence charSequence, char c5) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.f
        public String O(CharSequence charSequence, CharSequence charSequence2) {
            charSequence2.getClass();
            return charSequence.toString();
        }

        @Override // com.google.common.base.f
        public String U(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.f
        public String V(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.f
        public String W(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.f
        public f b(f fVar) {
            fVar.getClass();
            return this;
        }

        @Override // com.google.common.base.f
        public String h(CharSequence charSequence, char c5) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.f
        public int i(CharSequence charSequence) {
            charSequence.getClass();
            return 0;
        }

        @Override // com.google.common.base.f
        public int n(CharSequence charSequence) {
            charSequence.getClass();
            return -1;
        }

        @Override // com.google.common.base.f
        public int o(CharSequence charSequence, int i4) {
            l0.d0(i4, charSequence.length());
            return -1;
        }
    }

    /* compiled from: CharMatcher.java */
    private static final class z extends f {

        /* renamed from: c, reason: collision with root package name */
        final f f54939c;

        /* renamed from: d, reason: collision with root package name */
        final f f54940d;

        z(f fVar, f fVar2) {
            fVar.getClass();
            this.f54939c = fVar;
            fVar2.getClass();
            this.f54940d = fVar2;
        }

        @Override // com.google.common.base.f
        public boolean B(char c5) {
            return this.f54939c.B(c5) || this.f54940d.B(c5);
        }

        @Override // com.google.common.base.f
        @d9.c
        void Q(BitSet bitSet) {
            this.f54939c.Q(bitSet);
            this.f54940d.Q(bitSet);
        }

        @Override // com.google.common.base.f, com.google.common.base.m0
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return apply(ch);
        }

        @Override // com.google.common.base.f
        public String toString() {
            String valueOf = String.valueOf(this.f54939c);
            String valueOf2 = String.valueOf(this.f54940d);
            StringBuilder a5 = com.google.common.base.g.a(valueOf2.length() + valueOf.length() + 18, ProtectedSandApp.s("\uf2f7"), valueOf, ProtectedSandApp.s("\uf2f8"), valueOf2);
            a5.append(ProtectedSandApp.s("\uf2f9"));
            return a5.toString();
        }
    }

    protected f() {
    }

    public static f G() {
        return y.f54938d;
    }

    public static f H(CharSequence charSequence) {
        return d(charSequence).F();
    }

    @d9.c
    private static f L(int i4, BitSet bitSet, String str) {
        if (i4 == 0) {
            return y.f54938d;
        }
        if (i4 == 1) {
            return new m((char) bitSet.nextSetBit(0));
        }
        if (i4 != 2) {
            return t(i4, bitSet.length()) ? p0.a0(bitSet, str) : new C0828f(bitSet, str, null);
        }
        char nextSetBit = (char) bitSet.nextSetBit(0);
        return new n(nextSetBit, (char) bitSet.nextSetBit(nextSetBit + 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String R(char c5) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i4 = 0; i4 < 4; i4++) {
            cArr[5 - i4] = ProtectedSandApp.s("\uf2d0").charAt(c5 & 15);
            c5 = (char) (c5 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    @Deprecated
    public static f S() {
        return b0.f54908f;
    }

    public static f X() {
        return c0.f54913g;
    }

    public static f c() {
        return c.f54909d;
    }

    public static f d(CharSequence charSequence) {
        int length = charSequence.length();
        return length != 0 ? length != 1 ? length != 2 ? new d(charSequence) : new n(charSequence.charAt(0), charSequence.charAt(1)) : new m(charSequence.charAt(0)) : y.f54938d;
    }

    public static f f() {
        return e.f54915d;
    }

    public static f g() {
        return g.f54917c;
    }

    @Deprecated
    public static f j() {
        return h.f54919g;
    }

    private String k(CharSequence charSequence, int i4, int i5, char c5, StringBuilder sb, boolean z4) {
        while (i4 < i5) {
            char charAt = charSequence.charAt(i4);
            if (!B(charAt)) {
                sb.append(charAt);
                z4 = false;
            } else if (!z4) {
                sb.append(c5);
                z4 = true;
            }
            i4++;
        }
        return sb.toString();
    }

    public static f l(m0<? super Character> m0Var) {
        return m0Var instanceof f ? (f) m0Var : new j(m0Var);
    }

    public static f m(char c5, char c6) {
        return new k(c5, c6);
    }

    @Deprecated
    public static f p() {
        return l.f54925h;
    }

    public static f q(char c5) {
        return new m(c5);
    }

    private static n r(char c5, char c6) {
        return new n(c5, c6);
    }

    public static f s(char c5) {
        return new o(c5);
    }

    @d9.c
    private static boolean t(int i4, int i5) {
        return i4 <= 1023 && i5 > i4 * 64;
    }

    @Deprecated
    public static f u() {
        return p.f54930c;
    }

    public static f v() {
        return q.f54931d;
    }

    @Deprecated
    public static f w() {
        return r.f54932c;
    }

    @Deprecated
    public static f x() {
        return s.f54933c;
    }

    @Deprecated
    public static f y() {
        return t.f54934c;
    }

    @Deprecated
    public static f z() {
        return u.f54935c;
    }

    public int A(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (B(charSequence.charAt(length))) {
                return length;
            }
        }
        return -1;
    }

    public abstract boolean B(char c5);

    public boolean C(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!B(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    public boolean D(CharSequence charSequence) {
        return !E(charSequence);
    }

    public boolean E(CharSequence charSequence) {
        return n(charSequence) == -1;
    }

    public f F() {
        return new w(this);
    }

    public f I(f fVar) {
        return new z(this, fVar);
    }

    public f J() {
        return k0.j(this);
    }

    @d9.c
    f K() {
        BitSet bitSet = new BitSet();
        Q(bitSet);
        int cardinality = bitSet.cardinality();
        if (cardinality * 2 <= 65536) {
            return L(cardinality, bitSet, toString());
        }
        bitSet.flip(0, 65536);
        int i4 = 65536 - cardinality;
        String fVar = toString();
        String s4 = ProtectedSandApp.s("\uf2d1");
        return new a(this, L(i4, bitSet, fVar.endsWith(s4) ? androidx.core.content.f.a(fVar, 9, 0) : s4.length() != 0 ? fVar.concat(s4) : new String(fVar)), fVar);
    }

    public String M(CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        int n4 = n(charSequence2);
        if (n4 == -1) {
            return charSequence2;
        }
        char[] charArray = charSequence2.toCharArray();
        int i4 = 1;
        while (true) {
            n4++;
            while (n4 != charArray.length) {
                if (B(charArray[n4])) {
                    break;
                }
                charArray[n4 - i4] = charArray[n4];
                n4++;
            }
            return new String(charArray, 0, n4 - i4);
            i4++;
        }
    }

    public String N(CharSequence charSequence, char c5) {
        String charSequence2 = charSequence.toString();
        int n4 = n(charSequence2);
        if (n4 == -1) {
            return charSequence2;
        }
        char[] charArray = charSequence2.toCharArray();
        charArray[n4] = c5;
        while (true) {
            n4++;
            if (n4 >= charArray.length) {
                return new String(charArray);
            }
            if (B(charArray[n4])) {
                charArray[n4] = c5;
            }
        }
    }

    public String O(CharSequence charSequence, CharSequence charSequence2) {
        int length = charSequence2.length();
        if (length == 0) {
            return M(charSequence);
        }
        int i4 = 0;
        if (length == 1) {
            return N(charSequence, charSequence2.charAt(0));
        }
        String charSequence3 = charSequence.toString();
        int n4 = n(charSequence3);
        if (n4 == -1) {
            return charSequence3;
        }
        int length2 = charSequence3.length();
        StringBuilder sb = new StringBuilder(androidx.content.preferences.protobuf.r.a(length2, 3, 2, 16));
        do {
            sb.append((CharSequence) charSequence3, i4, n4);
            sb.append(charSequence2);
            i4 = n4 + 1;
            n4 = o(charSequence3, i4);
        } while (n4 != -1);
        sb.append((CharSequence) charSequence3, i4, length2);
        return sb.toString();
    }

    public String P(CharSequence charSequence) {
        return F().M(charSequence);
    }

    @d9.c
    void Q(BitSet bitSet) {
        for (int i4 = 65535; i4 >= 0; i4--) {
            if (B((char) i4)) {
                bitSet.set(i4);
            }
        }
    }

    public String T(CharSequence charSequence, char c5) {
        int length = charSequence.length();
        int i4 = length - 1;
        int i5 = 0;
        while (i5 < length && B(charSequence.charAt(i5))) {
            i5++;
        }
        int i6 = i4;
        while (i6 > i5 && B(charSequence.charAt(i6))) {
            i6--;
        }
        if (i5 == 0 && i6 == i4) {
            return h(charSequence, c5);
        }
        int i7 = i6 + 1;
        return k(charSequence, i5, i7, c5, new StringBuilder(i7 - i5), false);
    }

    public String U(CharSequence charSequence) {
        int length = charSequence.length();
        int i4 = 0;
        while (i4 < length && B(charSequence.charAt(i4))) {
            i4++;
        }
        int i5 = length - 1;
        while (i5 > i4 && B(charSequence.charAt(i5))) {
            i5--;
        }
        return charSequence.subSequence(i4, i5 + 1).toString();
    }

    public String V(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (!B(charSequence.charAt(i4))) {
                return charSequence.subSequence(i4, length).toString();
            }
        }
        return "";
    }

    public String W(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!B(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1).toString();
            }
        }
        return "";
    }

    public f b(f fVar) {
        return new b(this, fVar);
    }

    @Override // com.google.common.base.m0
    @Deprecated
    /* renamed from: e */
    public boolean apply(Character ch) {
        return B(ch.charValue());
    }

    public String h(CharSequence charSequence, char c5) {
        int length = charSequence.length();
        int i4 = 0;
        while (i4 < length) {
            char charAt = charSequence.charAt(i4);
            if (B(charAt)) {
                if (charAt != c5 || (i4 != length - 1 && B(charSequence.charAt(i4 + 1)))) {
                    StringBuilder sb = new StringBuilder(length);
                    sb.append(charSequence, 0, i4);
                    sb.append(c5);
                    return k(charSequence, i4 + 1, length, c5, sb, true);
                }
                i4++;
            }
            i4++;
        }
        return charSequence.toString();
    }

    public int i(CharSequence charSequence) {
        int i4 = 0;
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            if (B(charSequence.charAt(i5))) {
                i4++;
            }
        }
        return i4;
    }

    public int n(CharSequence charSequence) {
        return o(charSequence, 0);
    }

    public int o(CharSequence charSequence, int i4) {
        int length = charSequence.length();
        l0.d0(i4, length);
        while (i4 < length) {
            if (B(charSequence.charAt(i4))) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    public String toString() {
        return super.toString();
    }
}
