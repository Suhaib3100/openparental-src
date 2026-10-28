package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.protobuf.i;

/* compiled from: Flags.java */
/* loaded from: classes5.dex */
public class b {
    public static final C0351b A;
    public static final C0351b B;
    public static final C0351b C;
    public static final C0351b D;
    public static final C0351b E;
    public static final C0351b F;
    public static final C0351b G;
    public static final C0351b H;
    public static final C0351b I;
    public static final C0351b J;
    public static final C0351b K;
    public static final C0351b L;
    public static final C0351b M;
    public static final C0351b N;
    public static final C0351b O;

    /* renamed from: a, reason: collision with root package name */
    public static final C0351b f25433a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0351b f25434b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0351b f25435c;

    /* renamed from: d, reason: collision with root package name */
    public static final d<a.x> f25436d;

    /* renamed from: e, reason: collision with root package name */
    public static final d<a.k> f25437e;

    /* renamed from: f, reason: collision with root package name */
    public static final d<a.c.EnumC0315c> f25438f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0351b f25439g;

    /* renamed from: h, reason: collision with root package name */
    public static final C0351b f25440h;

    /* renamed from: i, reason: collision with root package name */
    public static final C0351b f25441i;

    /* renamed from: j, reason: collision with root package name */
    public static final C0351b f25442j;

    /* renamed from: k, reason: collision with root package name */
    public static final C0351b f25443k;

    /* renamed from: l, reason: collision with root package name */
    public static final C0351b f25444l;

    /* renamed from: m, reason: collision with root package name */
    public static final C0351b f25445m;

    /* renamed from: n, reason: collision with root package name */
    public static final C0351b f25446n;

    /* renamed from: o, reason: collision with root package name */
    public static final d<a.j> f25447o;

    /* renamed from: p, reason: collision with root package name */
    public static final C0351b f25448p;

    /* renamed from: q, reason: collision with root package name */
    public static final C0351b f25449q;

    /* renamed from: r, reason: collision with root package name */
    public static final C0351b f25450r;

    /* renamed from: s, reason: collision with root package name */
    public static final C0351b f25451s;

    /* renamed from: t, reason: collision with root package name */
    public static final C0351b f25452t;

    /* renamed from: u, reason: collision with root package name */
    public static final C0351b f25453u;

    /* renamed from: v, reason: collision with root package name */
    public static final C0351b f25454v;

    /* renamed from: w, reason: collision with root package name */
    public static final C0351b f25455w;

    /* renamed from: x, reason: collision with root package name */
    public static final C0351b f25456x;

    /* renamed from: y, reason: collision with root package name */
    public static final C0351b f25457y;

    /* renamed from: z, reason: collision with root package name */
    public static final C0351b f25458z;

    /* compiled from: Flags.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b, reason: collision with other inner class name */
    public static class C0351b extends d<Boolean> {
        public C0351b(int i5) {
            super(i5, 1);
        }

        private static /* synthetic */ void f(int i5) {
            throw new IllegalStateException(String.format(ProtectedSandApp.s("䴥"), ProtectedSandApp.s("䴣"), ProtectedSandApp.s("䴤")));
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d
        @d5.d
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Boolean d(int i5) {
            Boolean valueOf = Boolean.valueOf((i5 & (1 << this.f25460a)) != 0);
            if (valueOf == null) {
                f(0);
            }
            return valueOf;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public int e(Boolean bool) {
            if (bool.booleanValue()) {
                return 1 << this.f25460a;
            }
            return 0;
        }
    }

    /* compiled from: Flags.java */
    private static class c<E extends i.a> extends d<E> {

        /* renamed from: c, reason: collision with root package name */
        private final E[] f25459c;

        public c(int i5, E[] eArr) {
            super(i5, g(eArr));
            this.f25459c = eArr;
        }

        private static /* synthetic */ void f(int i5) {
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("䴩"), ProtectedSandApp.s("䴦"), ProtectedSandApp.s("䴧"), ProtectedSandApp.s("䴨")));
        }

        private static <E> int g(@d5.d E[] eArr) {
            if (eArr == null) {
                f(0);
            }
            int length = eArr.length - 1;
            if (length == 0) {
                return 1;
            }
            for (int i5 = 31; i5 >= 0; i5--) {
                if (((1 << i5) & length) != 0) {
                    return i5 + 1;
                }
            }
            throw new IllegalStateException(ProtectedSandApp.s("䴪") + eArr.getClass());
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d
        @d5.e
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public E d(int i5) {
            int i6 = (1 << this.f25461b) - 1;
            int i7 = this.f25460a;
            int i8 = (i5 & (i6 << i7)) >> i7;
            for (E e6 : this.f25459c) {
                if (e6.getNumber() == i8) {
                    return e6;
                }
            }
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public int e(E e6) {
            return e6.getNumber() << this.f25460a;
        }
    }

    /* compiled from: Flags.java */
    public static abstract class d<E> {

        /* renamed from: a, reason: collision with root package name */
        public final int f25460a;

        /* renamed from: b, reason: collision with root package name */
        public final int f25461b;

        /* JADX WARN: Incorrect types in method signature: <E::Lkotlin/reflect/jvm/internal/impl/protobuf/i$a;>(Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/b$d<*>;[TE;)Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/b$d<TE;>; */
        public static d a(d dVar, i.a[] aVarArr) {
            return new c(dVar.f25460a + dVar.f25461b, aVarArr);
        }

        public static C0351b b(d<?> dVar) {
            return new C0351b(dVar.f25460a + dVar.f25461b);
        }

        public static C0351b c() {
            return new C0351b(0);
        }

        public abstract E d(int i5);

        public abstract int e(E e6);

        private d(int i5, int i6) {
            this.f25460a = i5;
            this.f25461b = i6;
        }
    }

    static {
        C0351b c6 = d.c();
        f25433a = c6;
        f25434b = d.b(c6);
        C0351b c7 = d.c();
        f25435c = c7;
        d<a.x> a6 = d.a(c7, a.x.values());
        f25436d = a6;
        d<a.k> a7 = d.a(a6, a.k.values());
        f25437e = a7;
        d<a.c.EnumC0315c> a8 = d.a(a7, a.c.EnumC0315c.values());
        f25438f = a8;
        C0351b b6 = d.b(a8);
        f25439g = b6;
        C0351b b7 = d.b(b6);
        f25440h = b7;
        C0351b b8 = d.b(b7);
        f25441i = b8;
        C0351b b9 = d.b(b8);
        f25442j = b9;
        C0351b b10 = d.b(b9);
        f25443k = b10;
        f25444l = d.b(b10);
        C0351b b11 = d.b(a6);
        f25445m = b11;
        f25446n = d.b(b11);
        d<a.j> a9 = d.a(a7, a.j.values());
        f25447o = a9;
        C0351b b12 = d.b(a9);
        f25448p = b12;
        C0351b b13 = d.b(b12);
        f25449q = b13;
        C0351b b14 = d.b(b13);
        f25450r = b14;
        C0351b b15 = d.b(b14);
        f25451s = b15;
        C0351b b16 = d.b(b15);
        f25452t = b16;
        C0351b b17 = d.b(b16);
        f25453u = b17;
        C0351b b18 = d.b(b17);
        f25454v = b18;
        f25455w = d.b(b18);
        C0351b b19 = d.b(a9);
        f25456x = b19;
        C0351b b20 = d.b(b19);
        f25457y = b20;
        C0351b b21 = d.b(b20);
        f25458z = b21;
        C0351b b22 = d.b(b21);
        A = b22;
        C0351b b23 = d.b(b22);
        B = b23;
        C0351b b24 = d.b(b23);
        C = b24;
        C0351b b25 = d.b(b24);
        D = b25;
        C0351b b26 = d.b(b25);
        E = b26;
        F = d.b(b26);
        C0351b b27 = d.b(c7);
        G = b27;
        C0351b b28 = d.b(b27);
        H = b28;
        I = d.b(b28);
        C0351b b29 = d.b(a7);
        J = b29;
        C0351b b30 = d.b(b29);
        K = b30;
        L = d.b(b30);
        C0351b c8 = d.c();
        M = c8;
        N = d.b(c8);
        O = d.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void a(int r5) {
        /*
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 1
            r2 = 0
            r3 = 2
            if (r5 == r1) goto L37
            if (r5 == r3) goto L2e
            r4 = 5
            if (r5 == r4) goto L37
            r4 = 6
            if (r5 == r4) goto L25
            r4 = 8
            if (r5 == r4) goto L37
            r4 = 9
            if (r5 == r4) goto L25
            r4 = 11
            if (r5 == r4) goto L37
            java.lang.String r4 = "䴫"
            java.lang.String r4 = com.flashget.kidsdownloader.ProtectedSandApp.s(r4)
            r0[r2] = r4
            goto L3f
        L25:
            java.lang.String r4 = "䴬"
            java.lang.String r4 = com.flashget.kidsdownloader.ProtectedSandApp.s(r4)
            r0[r2] = r4
            goto L3f
        L2e:
            java.lang.String r4 = "䴭"
            java.lang.String r4 = com.flashget.kidsdownloader.ProtectedSandApp.s(r4)
            r0[r2] = r4
            goto L3f
        L37:
            java.lang.String r4 = "䴮"
            java.lang.String r4 = com.flashget.kidsdownloader.ProtectedSandApp.s(r4)
            r0[r2] = r4
        L3f:
            java.lang.String r2 = "䴯"
            java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)
            r0[r1] = r2
            switch(r5) {
                case 3: goto L6e;
                case 4: goto L65;
                case 5: goto L65;
                case 6: goto L65;
                case 7: goto L5c;
                case 8: goto L5c;
                case 9: goto L5c;
                case 10: goto L53;
                case 11: goto L53;
                default: goto L4a;
            }
        L4a:
            java.lang.String r5 = "䴰"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
            r0[r3] = r5
            goto L76
        L53:
            java.lang.String r5 = "䴱"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
            r0[r3] = r5
            goto L76
        L5c:
            java.lang.String r5 = "䴲"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
            r0[r3] = r5
            goto L76
        L65:
            java.lang.String r5 = "䴳"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
            r0[r3] = r5
            goto L76
        L6e:
            java.lang.String r5 = "䴴"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
            r0[r3] = r5
        L76:
            java.lang.String r5 = "䴵"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
            java.lang.String r5 = java.lang.String.format(r5, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.a(int):void");
    }

    public static int b(boolean z5, @d5.d a.x xVar, @d5.d a.k kVar, boolean z6, boolean z7, boolean z8) {
        if (xVar == null) {
            a(10);
        }
        if (kVar == null) {
            a(11);
        }
        return f25435c.e(Boolean.valueOf(z5)) | f25437e.e(kVar) | f25436d.e(xVar) | J.e(Boolean.valueOf(z6)) | K.e(Boolean.valueOf(z7)) | L.e(Boolean.valueOf(z8));
    }
}
