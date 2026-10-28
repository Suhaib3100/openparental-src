package com.google.common.hash;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.l0;
import com.google.common.hash.p;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.zip.Adler32;
import java.util.zip.CRC32;
import java.util.zip.Checksum;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: Hashing.java */
@k
/* loaded from: classes6.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    static final int f57033a = (int) System.currentTimeMillis();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Hashing.java */
    @f9.j
    static abstract class b implements v<Checksum> {
        public final q hashFunction;
        public static final b CRC_32 = new a(ProtectedSandApp.s("\uf630"), 0, ProtectedSandApp.s("\uf62f"));
        public static final b ADLER_32 = new C0873b(ProtectedSandApp.s("\uf632"), 1, ProtectedSandApp.s("\uf631"));
        private static final /* synthetic */ b[] $VALUES = $values();

        /* compiled from: Hashing.java */
        enum a extends b {
            a(String str, int i4, String str2) {
                super(str, i4, str2);
            }

            @Override // com.google.common.base.u0
            public Checksum get() {
                return new CRC32();
            }
        }

        /* compiled from: Hashing.java */
        /* renamed from: com.google.common.hash.s$b$b, reason: collision with other inner class name */
        enum C0873b extends b {
            C0873b(String str, int i4, String str2) {
                super(str, i4, str2);
            }

            @Override // com.google.common.base.u0
            public Checksum get() {
                return new Adler32();
            }
        }

        private static /* synthetic */ b[] $values() {
            return new b[]{CRC_32, ADLER_32};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        private b(String str, int i4, String str2) {
            this.hashFunction = new com.google.common.hash.i(this, 32, str2);
        }
    }

    /* compiled from: Hashing.java */
    private static final class c extends com.google.common.hash.b {
        @Override // com.google.common.hash.q
        public int c() {
            int i4 = 0;
            for (q qVar : this.f56893b) {
                i4 += qVar.c();
            }
            return i4;
        }

        public boolean equals(@zc.a Object obj) {
            if (obj instanceof c) {
                return Arrays.equals(this.f56893b, ((c) obj).f56893b);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f56893b);
        }

        @Override // com.google.common.hash.b
        p m(r[] rVarArr) {
            byte[] bArr = new byte[c() / 8];
            int i4 = 0;
            for (r rVar : rVarArr) {
                p o4 = rVar.o();
                i4 += o4.n(bArr, i4, o4.d() / 8);
            }
            return p.h(bArr);
        }

        private c(q... qVarArr) {
            super(qVarArr);
            for (q qVar : qVarArr) {
                l0.o(qVar.c() % 8 == 0, ProtectedSandApp.s("\uf633"), qVar.c(), qVar);
            }
        }
    }

    /* compiled from: Hashing.java */
    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        private long f57034a;

        public d(long j4) {
            this.f57034a = j4;
        }

        public double a() {
            this.f57034a = (this.f57034a * 2862933555777941757L) + 1;
            return (((int) (r2 >>> 33)) + 1) / 2.147483648E9d;
        }
    }

    /* compiled from: Hashing.java */
    private static class e {

        /* renamed from: a, reason: collision with root package name */
        static final q f57035a = new c0(ProtectedSandApp.s("\uf634"), ProtectedSandApp.s("\uf635"));

        private e() {
        }
    }

    /* compiled from: Hashing.java */
    private static class f {

        /* renamed from: a, reason: collision with root package name */
        static final q f57036a = new c0(ProtectedSandApp.s("\uf636"), ProtectedSandApp.s("\uf637"));

        private f() {
        }
    }

    /* compiled from: Hashing.java */
    private static class g {

        /* renamed from: a, reason: collision with root package name */
        static final q f57037a = new c0(ProtectedSandApp.s("\uf638"), ProtectedSandApp.s("\uf639"));

        private g() {
        }
    }

    /* compiled from: Hashing.java */
    private static class h {

        /* renamed from: a, reason: collision with root package name */
        static final q f57038a = new c0(ProtectedSandApp.s("\uf63a"), ProtectedSandApp.s("\uf63b"));

        private h() {
        }
    }

    /* compiled from: Hashing.java */
    private static class i {

        /* renamed from: a, reason: collision with root package name */
        static final q f57039a = new c0(ProtectedSandApp.s("\uf63c"), ProtectedSandApp.s("\uf63d"));

        private i() {
        }
    }

    private s() {
    }

    @Deprecated
    public static q A(int i4) {
        return new e0(i4, false);
    }

    public static q B() {
        return e0.f56927e;
    }

    public static q C(int i4) {
        return new e0(i4, true);
    }

    @Deprecated
    public static q D() {
        return f.f57036a;
    }

    public static q E() {
        return g.f57037a;
    }

    public static q F() {
        return h.f57038a;
    }

    public static q G() {
        return i.f57039a;
    }

    public static q H() {
        return h0.f56955f;
    }

    public static q I(long j4, long j5) {
        return new h0(2, 4, j4, j5);
    }

    public static q a() {
        return b.ADLER_32.hashFunction;
    }

    static int b(int i4) {
        l0.e(i4 > 0, ProtectedSandApp.s("\uf63e"));
        return (i4 + 31) & (-32);
    }

    public static p c(Iterable<p> iterable) {
        Iterator<p> it = iterable.iterator();
        l0.e(it.hasNext(), ProtectedSandApp.s("\uf63f"));
        int d5 = it.next().d() / 8;
        byte[] bArr = new byte[d5];
        Iterator<p> it2 = iterable.iterator();
        while (it2.hasNext()) {
            byte[] a5 = it2.next().a();
            l0.e(a5.length == d5, ProtectedSandApp.s("\uf640"));
            for (int i4 = 0; i4 < a5.length; i4++) {
                bArr[i4] = (byte) ((bArr[i4] * 37) ^ a5[i4]);
            }
        }
        return new p.a(bArr);
    }

    public static p d(Iterable<p> iterable) {
        Iterator<p> it = iterable.iterator();
        l0.e(it.hasNext(), ProtectedSandApp.s("\uf63f"));
        int d5 = it.next().d() / 8;
        byte[] bArr = new byte[d5];
        Iterator<p> it2 = iterable.iterator();
        while (it2.hasNext()) {
            byte[] a5 = it2.next().a();
            l0.e(a5.length == d5, ProtectedSandApp.s("\uf640"));
            for (int i4 = 0; i4 < a5.length; i4++) {
                bArr[i4] = (byte) (bArr[i4] + a5[i4]);
            }
        }
        return new p.a(bArr);
    }

    public static q e(q qVar, q qVar2, q... qVarArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(qVar);
        arrayList.add(qVar2);
        Collections.addAll(arrayList, qVarArr);
        return new c((q[]) arrayList.toArray(new q[0]));
    }

    public static q f(Iterable<q> iterable) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<q> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        l0.k(!arrayList.isEmpty(), ProtectedSandApp.s("\uf641"), arrayList.size());
        return new c((q[]) arrayList.toArray(new q[0]));
    }

    public static int g(long j4, int i4) {
        int i5 = 0;
        l0.k(i4 > 0, ProtectedSandApp.s("\uf642"), i4);
        d dVar = new d(j4);
        while (true) {
            int a5 = (int) ((i5 + 1) / dVar.a());
            if (a5 < 0 || a5 >= i4) {
                break;
            }
            i5 = a5;
        }
        return i5;
    }

    public static int h(p pVar, int i4) {
        return g(pVar.m(), i4);
    }

    public static q i() {
        return b.CRC_32.hashFunction;
    }

    public static q j() {
        return j.f57002b;
    }

    public static q k() {
        return l.f57012b;
    }

    public static q l() {
        return m.f57016b;
    }

    public static q m(int i4) {
        int b5 = b(i4);
        if (b5 == 32) {
            return e0.f56928f;
        }
        if (b5 <= 128) {
            return d0.f56915d;
        }
        int i5 = (b5 + 127) / 128;
        q[] qVarArr = new q[i5];
        qVarArr[0] = d0.f56915d;
        int i6 = f57033a;
        for (int i7 = 1; i7 < i5; i7++) {
            i6 += 1500450271;
            qVarArr[i7] = new d0(i6);
        }
        return new c(qVarArr);
    }

    public static q n(Key key) {
        return new b0(ProtectedSandApp.s("\uf644"), key, v(ProtectedSandApp.s("\uf643"), key));
    }

    public static q o(byte[] bArr) {
        bArr.getClass();
        return n(new SecretKeySpec(bArr, ProtectedSandApp.s("\uf644")));
    }

    public static q p(Key key) {
        return new b0(ProtectedSandApp.s("\uf646"), key, v(ProtectedSandApp.s("\uf645"), key));
    }

    public static q q(byte[] bArr) {
        bArr.getClass();
        return p(new SecretKeySpec(bArr, ProtectedSandApp.s("\uf646")));
    }

    public static q r(Key key) {
        return new b0(ProtectedSandApp.s("\uf648"), key, v(ProtectedSandApp.s("\uf647"), key));
    }

    public static q s(byte[] bArr) {
        bArr.getClass();
        return r(new SecretKeySpec(bArr, ProtectedSandApp.s("\uf648")));
    }

    public static q t(Key key) {
        return new b0(ProtectedSandApp.s("\uf64a"), key, v(ProtectedSandApp.s("\uf649"), key));
    }

    public static q u(byte[] bArr) {
        bArr.getClass();
        return t(new SecretKeySpec(bArr, ProtectedSandApp.s("\uf64a")));
    }

    private static String v(String str, Key key) {
        return String.format(ProtectedSandApp.s("\uf64b"), str, key.getAlgorithm(), key.getFormat());
    }

    @Deprecated
    public static q w() {
        return e.f57035a;
    }

    public static q x() {
        return d0.f56914c;
    }

    public static q y(int i4) {
        return new d0(i4);
    }

    @Deprecated
    public static q z() {
        return e0.f56926d;
    }
}
