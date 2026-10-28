package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.protobuf.i;

/* compiled from: Flags.java */
/* loaded from: classes7.dex */
public class b {
    public static final C1156b A;
    public static final C1156b B;
    public static final C1156b C;
    public static final C1156b D;
    public static final C1156b E;
    public static final C1156b F;
    public static final C1156b G;
    public static final C1156b H;
    public static final C1156b I;
    public static final C1156b J;
    public static final C1156b K;
    public static final C1156b L;
    public static final C1156b M;
    public static final C1156b N;
    public static final C1156b O;
    public static final C1156b P;

    /* renamed from: a, reason: collision with root package name */
    public static final C1156b f77411a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1156b f77412b;

    /* renamed from: c, reason: collision with root package name */
    public static final C1156b f77413c;

    /* renamed from: d, reason: collision with root package name */
    public static final d<a.x> f77414d;

    /* renamed from: e, reason: collision with root package name */
    public static final d<a.k> f77415e;

    /* renamed from: f, reason: collision with root package name */
    public static final d<a.c.EnumC1120c> f77416f;

    /* renamed from: g, reason: collision with root package name */
    public static final C1156b f77417g;

    /* renamed from: h, reason: collision with root package name */
    public static final C1156b f77418h;

    /* renamed from: i, reason: collision with root package name */
    public static final C1156b f77419i;

    /* renamed from: j, reason: collision with root package name */
    public static final C1156b f77420j;

    /* renamed from: k, reason: collision with root package name */
    public static final C1156b f77421k;

    /* renamed from: l, reason: collision with root package name */
    public static final C1156b f77422l;

    /* renamed from: m, reason: collision with root package name */
    public static final C1156b f77423m;

    /* renamed from: n, reason: collision with root package name */
    public static final C1156b f77424n;

    /* renamed from: o, reason: collision with root package name */
    public static final C1156b f77425o;

    /* renamed from: p, reason: collision with root package name */
    public static final d<a.j> f77426p;

    /* renamed from: q, reason: collision with root package name */
    public static final C1156b f77427q;

    /* renamed from: r, reason: collision with root package name */
    public static final C1156b f77428r;

    /* renamed from: s, reason: collision with root package name */
    public static final C1156b f77429s;

    /* renamed from: t, reason: collision with root package name */
    public static final C1156b f77430t;

    /* renamed from: u, reason: collision with root package name */
    public static final C1156b f77431u;

    /* renamed from: v, reason: collision with root package name */
    public static final C1156b f77432v;

    /* renamed from: w, reason: collision with root package name */
    public static final C1156b f77433w;

    /* renamed from: x, reason: collision with root package name */
    public static final C1156b f77434x;

    /* renamed from: y, reason: collision with root package name */
    public static final C1156b f77435y;

    /* renamed from: z, reason: collision with root package name */
    public static final C1156b f77436z;

    /* compiled from: Flags.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b, reason: collision with other inner class name */
    public static class C1156b extends d<Boolean> {
        public C1156b(int i4) {
            super(i4, 1);
        }

        private static /* synthetic */ void f(int i4) {
            throw new IllegalStateException(String.format(ProtectedSandApp.s("甔\u0001"), ProtectedSandApp.s("甒\u0001"), ProtectedSandApp.s("甓\u0001")));
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d
        @l
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Boolean d(int i4) {
            return Boolean.valueOf((i4 & (1 << this.f77438a)) != 0);
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public int e(Boolean bool) {
            if (bool.booleanValue()) {
                return 1 << this.f77438a;
            }
            return 0;
        }
    }

    /* compiled from: Flags.java */
    private static class c<E extends i.a> extends d<E> {

        /* renamed from: c, reason: collision with root package name */
        private final E[] f77437c;

        public c(int i4, E[] eArr) {
            super(i4, g(eArr));
            this.f77437c = eArr;
        }

        private static /* synthetic */ void f(int i4) {
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("甘\u0001"), ProtectedSandApp.s("甗\u0001"), ProtectedSandApp.s("甕\u0001"), ProtectedSandApp.s("甖\u0001")));
        }

        private static <E> int g(@l E[] eArr) {
            if (eArr == null) {
                f(0);
            }
            int length = eArr.length - 1;
            if (length == 0) {
                return 1;
            }
            for (int i4 = 31; i4 >= 0; i4--) {
                if (((1 << i4) & length) != 0) {
                    return i4 + 1;
                }
            }
            throw new IllegalStateException(ProtectedSandApp.s("甙\u0001") + eArr.getClass());
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d
        @m
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public E d(int i4) {
            int i5 = (1 << this.f77439b) - 1;
            int i6 = this.f77438a;
            int i7 = (i4 & (i5 << i6)) >> i6;
            for (E e4 : this.f77437c) {
                if (e4.getNumber() == i7) {
                    return e4;
                }
            }
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public int e(E e4) {
            return e4.getNumber() << this.f77438a;
        }
    }

    /* compiled from: Flags.java */
    public static abstract class d<E> {

        /* renamed from: a, reason: collision with root package name */
        public final int f77438a;

        /* renamed from: b, reason: collision with root package name */
        public final int f77439b;

        /* JADX WARN: Incorrect types in method signature: <E::Lkotlin/reflect/jvm/internal/impl/protobuf/i$a;>(Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/b$d<*>;[TE;)Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/b$d<TE;>; */
        public static d a(d dVar, i.a[] aVarArr) {
            return new c(dVar.f77438a + dVar.f77439b, aVarArr);
        }

        public static C1156b b(d<?> dVar) {
            return new C1156b(dVar.f77438a + dVar.f77439b);
        }

        public static C1156b c() {
            return new C1156b(0);
        }

        public abstract E d(int i4);

        public abstract int e(E e4);

        private d(int i4, int i5) {
            this.f77438a = i4;
            this.f77439b = i5;
        }
    }

    static {
        C1156b c5 = d.c();
        f77411a = c5;
        f77412b = d.b(c5);
        C1156b c6 = d.c();
        f77413c = c6;
        d<a.x> a5 = d.a(c6, a.x.values());
        f77414d = a5;
        d<a.k> a6 = d.a(a5, a.k.values());
        f77415e = a6;
        d<a.c.EnumC1120c> a7 = d.a(a6, a.c.EnumC1120c.values());
        f77416f = a7;
        C1156b b5 = d.b(a7);
        f77417g = b5;
        C1156b b6 = d.b(b5);
        f77418h = b6;
        C1156b b7 = d.b(b6);
        f77419i = b7;
        C1156b b10 = d.b(b7);
        f77420j = b10;
        C1156b b11 = d.b(b10);
        f77421k = b11;
        C1156b b12 = d.b(b11);
        f77422l = b12;
        f77423m = d.b(b12);
        C1156b b13 = d.b(a5);
        f77424n = b13;
        f77425o = d.b(b13);
        d<a.j> a8 = d.a(a6, a.j.values());
        f77426p = a8;
        C1156b b14 = d.b(a8);
        f77427q = b14;
        C1156b b15 = d.b(b14);
        f77428r = b15;
        C1156b b16 = d.b(b15);
        f77429s = b16;
        C1156b b17 = d.b(b16);
        f77430t = b17;
        C1156b b18 = d.b(b17);
        f77431u = b18;
        C1156b b19 = d.b(b18);
        f77432v = b19;
        C1156b b20 = d.b(b19);
        f77433w = b20;
        f77434x = d.b(b20);
        C1156b b21 = d.b(a8);
        f77435y = b21;
        C1156b b22 = d.b(b21);
        f77436z = b22;
        C1156b b23 = d.b(b22);
        A = b23;
        C1156b b24 = d.b(b23);
        B = b24;
        C1156b b25 = d.b(b24);
        C = b25;
        C1156b b26 = d.b(b25);
        D = b26;
        C1156b b27 = d.b(b26);
        E = b27;
        C1156b b28 = d.b(b27);
        F = b28;
        G = d.b(b28);
        C1156b b29 = d.b(c6);
        H = b29;
        C1156b b30 = d.b(b29);
        I = b30;
        J = d.b(b30);
        C1156b b31 = d.b(a6);
        K = b31;
        C1156b b32 = d.b(b31);
        L = b32;
        M = d.b(b32);
        C1156b c7 = d.c();
        N = c7;
        O = d.b(c7);
        P = d.c();
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
            java.lang.String r4 = "甚\u0001"
            java.lang.String r4 = com.flashget.parentalcontrol.ProtectedSandApp.s(r4)
            r0[r2] = r4
            goto L3f
        L25:
            java.lang.String r4 = "甛\u0001"
            java.lang.String r4 = com.flashget.parentalcontrol.ProtectedSandApp.s(r4)
            r0[r2] = r4
            goto L3f
        L2e:
            java.lang.String r4 = "甜\u0001"
            java.lang.String r4 = com.flashget.parentalcontrol.ProtectedSandApp.s(r4)
            r0[r2] = r4
            goto L3f
        L37:
            java.lang.String r4 = "甝\u0001"
            java.lang.String r4 = com.flashget.parentalcontrol.ProtectedSandApp.s(r4)
            r0[r2] = r4
        L3f:
            java.lang.String r2 = "甞\u0001"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
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
            java.lang.String r5 = "生\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
            r0[r3] = r5
            goto L76
        L53:
            java.lang.String r5 = "甠\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
            r0[r3] = r5
            goto L76
        L5c:
            java.lang.String r5 = "甡\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
            r0[r3] = r5
            goto L76
        L65:
            java.lang.String r5 = "產\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
            r0[r3] = r5
            goto L76
        L6e:
            java.lang.String r5 = "産\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
            r0[r3] = r5
        L76:
            java.lang.String r5 = "甤\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
            java.lang.String r5 = java.lang.String.format(r5, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.a(int):void");
    }

    public static int b(boolean z4, @l a.x xVar, @l a.k kVar, boolean z5, boolean z6, boolean z7) {
        if (xVar == null) {
            a(10);
        }
        if (kVar == null) {
            a(11);
        }
        return f77413c.e(Boolean.valueOf(z4)) | f77415e.e(kVar) | f77414d.e(xVar) | K.e(Boolean.valueOf(z5)) | L.e(Boolean.valueOf(z6)) | M.e(Boolean.valueOf(z7));
    }
}
