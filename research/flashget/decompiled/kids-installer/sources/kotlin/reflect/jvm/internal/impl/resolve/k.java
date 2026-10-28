package kotlin.reflect.jvm.internal.impl.resolve;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.j0;
import kotlin.m2;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.resolve.f;
import kotlin.reflect.jvm.internal.impl.types.checker.e;
import kotlin.reflect.jvm.internal.impl.types.checker.f;
import kotlin.reflect.jvm.internal.impl.types.checker.g;
import kotlin.reflect.jvm.internal.impl.types.g1;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.h1;

/* compiled from: OverridingUtil.java */
/* loaded from: classes5.dex */
public class k {

    /* renamed from: e, reason: collision with root package name */
    private static final List<kotlin.reflect.jvm.internal.impl.resolve.f> f25945e;

    /* renamed from: f, reason: collision with root package name */
    public static final k f25946f;

    /* renamed from: g, reason: collision with root package name */
    private static final e.a f25947g;

    /* renamed from: h, reason: collision with root package name */
    static final /* synthetic */ boolean f25948h = false;

    /* renamed from: a, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.types.checker.g f25949a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.types.checker.f f25950b;

    /* renamed from: c, reason: collision with root package name */
    private final e.a f25951c;

    /* renamed from: d, reason: collision with root package name */
    private final q3.p<h0, h0, Boolean> f25952d;

    /* compiled from: OverridingUtil.java */
    static class a implements e.a {
        a() {
        }

        private static /* synthetic */ void b(int i5) {
            Object[] objArr = new Object[3];
            if (i5 != 1) {
                objArr[0] = ProtectedSandApp.s("劮");
            } else {
                objArr[0] = ProtectedSandApp.s("劯");
            }
            objArr[1] = ProtectedSandApp.s("劰");
            objArr[2] = ProtectedSandApp.s("励");
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("劲"), objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.e.a
        public boolean a(@d5.d h1 h1Var, @d5.d h1 h1Var2) {
            if (h1Var == null) {
                b(0);
            }
            if (h1Var2 == null) {
                b(1);
            }
            return h1Var.equals(h1Var2);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [D] */
    /* compiled from: OverridingUtil.java */
    /* loaded from: classes6.dex */
    static class b<D> implements q3.p<D, D, Pair<kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.a>> {
        b() {
        }

        /* JADX WARN: Incorrect types in method signature: (TD;TD;)Lkotlin/q0<Lkotlin/reflect/jvm/internal/impl/descriptors/a;Lkotlin/reflect/jvm/internal/impl/descriptors/a;>; */
        public Pair a(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
            return new Pair(aVar, aVar2);
        }

        @Override // q3.p
        public Pair<kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.a> g0(Object obj, Object obj2) {
            return new Pair<>((kotlin.reflect.jvm.internal.impl.descriptors.a) obj, (kotlin.reflect.jvm.internal.impl.descriptors.a) obj2);
        }
    }

    /* compiled from: OverridingUtil.java */
    /* loaded from: classes6.dex */
    static class c implements q3.l<kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.m f25953o;

        c(kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
            this.f25953o = mVar;
        }

        @Override // q3.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean N(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            return Boolean.valueOf(bVar.b() == this.f25953o);
        }
    }

    /* compiled from: OverridingUtil.java */
    /* loaded from: classes6.dex */
    static class d implements q3.l<kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.reflect.jvm.internal.impl.descriptors.a> {
        d() {
        }

        @Override // q3.l
        public kotlin.reflect.jvm.internal.impl.descriptors.a N(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            return bVar;
        }

        public kotlin.reflect.jvm.internal.impl.descriptors.b a(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            return bVar;
        }
    }

    /* compiled from: OverridingUtil.java */
    /* loaded from: classes6.dex */
    static class e implements q3.l<kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.e f25954o;

        e(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
            this.f25954o = eVar;
        }

        @Override // q3.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean N(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            boolean z5 = false;
            if (!t.g(bVar.c()) && t.h(bVar, this.f25954o, false)) {
                z5 = true;
            }
            return Boolean.valueOf(z5);
        }
    }

    /* compiled from: OverridingUtil.java */
    /* loaded from: classes6.dex */
    static class f implements q3.l<kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.reflect.jvm.internal.impl.descriptors.a> {
        f() {
        }

        @Override // q3.l
        public kotlin.reflect.jvm.internal.impl.descriptors.a N(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            return bVar;
        }

        public kotlin.reflect.jvm.internal.impl.descriptors.a a(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            return bVar;
        }
    }

    /* compiled from: OverridingUtil.java */
    /* loaded from: classes6.dex */
    static class g implements q3.l<kotlin.reflect.jvm.internal.impl.descriptors.b, m2> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ j f25955o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.b f25956p;

        g(j jVar, kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            this.f25955o = jVar;
            this.f25956p = bVar;
        }

        @Override // q3.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public m2 N(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            this.f25955o.b(this.f25956p, bVar);
            return m2.f23662a;
        }
    }

    /* compiled from: OverridingUtil.java */
    static /* synthetic */ class h {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f25957a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f25958b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f25959c;

        static {
            int[] iArr = new int[e0.values().length];
            f25959c = iArr;
            try {
                iArr[e0.FINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25959c[e0.SEALED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25959c[e0.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25959c[e0.ABSTRACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[i.a.values().length];
            f25958b = iArr2;
            try {
                iArr2[i.a.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f25958b[i.a.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f25958b[i.a.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[f.b.values().length];
            f25957a = iArr3;
            try {
                iArr3[f.b.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f25957a[f.b.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f25957a[f.b.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f25957a[f.b.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* compiled from: OverridingUtil.java */
    public static class i {

        /* renamed from: c, reason: collision with root package name */
        private static final i f25960c = new i(a.OVERRIDABLE, ProtectedSandApp.s("劶"));

        /* renamed from: a, reason: collision with root package name */
        private final a f25961a;

        /* renamed from: b, reason: collision with root package name */
        private final String f25962b;

        /* compiled from: OverridingUtil.java */
        public enum a {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT
        }

        public i(@d5.d a aVar, @d5.d String str) {
            if (aVar == null) {
                a(3);
            }
            if (str == null) {
                a(4);
            }
            this.f25961a = aVar;
            this.f25962b = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0061  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static /* synthetic */ void a(int r10) {
            /*
                r0 = 4
                r1 = 3
                r2 = 2
                r3 = 1
                if (r10 == r3) goto L13
                if (r10 == r2) goto L13
                if (r10 == r1) goto L13
                if (r10 == r0) goto L13
                java.lang.String r4 = "劷"
                java.lang.String r4 = com.flashget.kidsdownloader.ProtectedSandApp.s(r4)
                goto L19
            L13:
                java.lang.String r4 = "劸"
                java.lang.String r4 = com.flashget.kidsdownloader.ProtectedSandApp.s(r4)
            L19:
                if (r10 == r3) goto L23
                if (r10 == r2) goto L23
                if (r10 == r1) goto L23
                if (r10 == r0) goto L23
                r5 = r2
                goto L24
            L23:
                r5 = r1
            L24:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "効"
                java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
                java.lang.String r7 = "劺"
                java.lang.String r7 = com.flashget.kidsdownloader.ProtectedSandApp.s(r7)
                r8 = 0
                if (r10 == r3) goto L41
                if (r10 == r2) goto L41
                if (r10 == r1) goto L3e
                if (r10 == r0) goto L41
                r5[r8] = r7
                goto L49
            L3e:
                r5[r8] = r6
                goto L49
            L41:
                java.lang.String r9 = "劻"
                java.lang.String r9 = com.flashget.kidsdownloader.ProtectedSandApp.s(r9)
                r5[r8] = r9
            L49:
                switch(r10) {
                    case 1: goto L61;
                    case 2: goto L61;
                    case 3: goto L61;
                    case 4: goto L61;
                    case 5: goto L58;
                    case 6: goto L4f;
                    default: goto L4c;
                }
            L4c:
                r5[r3] = r6
                goto L63
            L4f:
                java.lang.String r6 = "劼"
                java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
                r5[r3] = r6
                goto L63
            L58:
                java.lang.String r6 = "劽"
                java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
                r5[r3] = r6
                goto L63
            L61:
                r5[r3] = r7
            L63:
                if (r10 == r3) goto L7e
                if (r10 == r2) goto L75
                if (r10 == r1) goto L6c
                if (r10 == r0) goto L6c
                goto L86
            L6c:
                java.lang.String r6 = "劾"
                java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
                r5[r2] = r6
                goto L86
            L75:
                java.lang.String r6 = "势"
                java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
                r5[r2] = r6
                goto L86
            L7e:
                java.lang.String r6 = "勀"
                java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
                r5[r2] = r6
            L86:
                java.lang.String r4 = java.lang.String.format(r4, r5)
                if (r10 == r3) goto L98
                if (r10 == r2) goto L98
                if (r10 == r1) goto L98
                if (r10 == r0) goto L98
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                r10.<init>(r4)
                goto L9d
            L98:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                r10.<init>(r4)
            L9d:
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.k.i.a(int):void");
        }

        @d5.d
        public static i b(@d5.d String str) {
            if (str == null) {
                a(2);
            }
            return new i(a.CONFLICT, str);
        }

        @d5.d
        public static i d(@d5.d String str) {
            if (str == null) {
                a(1);
            }
            return new i(a.INCOMPATIBLE, str);
        }

        @d5.d
        public static i e() {
            i iVar = f25960c;
            if (iVar == null) {
                a(0);
            }
            return iVar;
        }

        @d5.d
        public a c() {
            a aVar = this.f25961a;
            if (aVar == null) {
                a(5);
            }
            return aVar;
        }
    }

    static {
        List<kotlin.reflect.jvm.internal.impl.resolve.f> V5;
        V5 = j0.V5(ServiceLoader.load(kotlin.reflect.jvm.internal.impl.resolve.f.class, kotlin.reflect.jvm.internal.impl.resolve.f.class.getClassLoader()));
        f25945e = V5;
        a aVar = new a();
        f25947g = aVar;
        f25946f = new k(aVar, g.a.f26343a, f.a.f26342a, null);
    }

    private k(@d5.d e.a aVar, @d5.d kotlin.reflect.jvm.internal.impl.types.checker.g gVar, @d5.d kotlin.reflect.jvm.internal.impl.types.checker.f fVar, @d5.e q3.p<h0, h0, Boolean> pVar) {
        if (aVar == null) {
            a(5);
        }
        if (gVar == null) {
            a(6);
        }
        if (fVar == null) {
            a(7);
        }
        this.f25951c = aVar;
        this.f25949a = gVar;
        this.f25950b = fVar;
        this.f25952d = pVar;
    }

    private static boolean A(@d5.e t0 t0Var, @d5.e t0 t0Var2) {
        if (t0Var == null || t0Var2 == null) {
            return true;
        }
        return H(t0Var, t0Var2);
    }

    public static boolean B(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
        if (aVar == null) {
            a(67);
        }
        if (aVar2 == null) {
            a(68);
        }
        h0 i5 = aVar.i();
        h0 i6 = aVar2.i();
        if (!H(aVar, aVar2)) {
            return false;
        }
        g1 l5 = f25946f.l(aVar.getTypeParameters(), aVar2.getTypeParameters());
        if (aVar instanceof z) {
            return G(aVar, i5, aVar2, i6, l5);
        }
        if (!(aVar instanceof u0)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("勁") + aVar.getClass());
        }
        u0 u0Var = (u0) aVar;
        u0 u0Var2 = (u0) aVar2;
        if (A(u0Var.h(), u0Var2.h())) {
            return (u0Var.q0() && u0Var2.q0()) ? kotlin.reflect.jvm.internal.impl.types.g.f26418a.k(l5, i5.X0(), i6.X0()) : (u0Var.q0() || !u0Var2.q0()) && G(aVar, i5, aVar2, i6, l5);
        }
        return false;
    }

    private static boolean C(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @d5.d Collection<kotlin.reflect.jvm.internal.impl.descriptors.a> collection) {
        if (aVar == null) {
            a(71);
        }
        if (collection == null) {
            a(72);
        }
        Iterator<kotlin.reflect.jvm.internal.impl.descriptors.a> it = collection.iterator();
        while (it.hasNext()) {
            if (!B(aVar, it.next())) {
                return false;
            }
        }
        return true;
    }

    private static boolean G(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @d5.d h0 h0Var, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, @d5.d h0 h0Var2, @d5.d g1 g1Var) {
        if (aVar == null) {
            a(73);
        }
        if (h0Var == null) {
            a(74);
        }
        if (aVar2 == null) {
            a(75);
        }
        if (h0Var2 == null) {
            a(76);
        }
        if (g1Var == null) {
            a(77);
        }
        return kotlin.reflect.jvm.internal.impl.types.g.f26418a.r(g1Var, h0Var.X0(), h0Var2.X0());
    }

    private static boolean H(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.q qVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.q qVar2) {
        if (qVar == null) {
            a(69);
        }
        if (qVar2 == null) {
            a(70);
        }
        Integer d6 = t.d(qVar.c(), qVar2.c());
        return d6 == null || d6.intValue() >= 0;
    }

    public static boolean I(@d5.d d0 d0Var, @d5.d d0 d0Var2, boolean z5) {
        if (d0Var == null) {
            a(57);
        }
        if (d0Var2 == null) {
            a(58);
        }
        return !t.g(d0Var2.c()) && t.h(d0Var2, d0Var, z5);
    }

    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.a> boolean J(@d5.d D d6, @d5.d D d7, boolean z5, boolean z6) {
        if (d6 == null) {
            a(13);
        }
        if (d7 == null) {
            a(14);
        }
        if (!d6.equals(d7) && kotlin.reflect.jvm.internal.impl.resolve.c.f25882a.f(d6.a(), d7.a(), z5, z6)) {
            return true;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.a a6 = d7.a();
        Iterator it = kotlin.reflect.jvm.internal.impl.resolve.e.d(d6).iterator();
        while (it.hasNext()) {
            if (kotlin.reflect.jvm.internal.impl.resolve.c.f25882a.f(a6, (kotlin.reflect.jvm.internal.impl.descriptors.a) it.next(), z5, z6)) {
                return true;
            }
        }
        return false;
    }

    public static void K(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar, @d5.e q3.l<kotlin.reflect.jvm.internal.impl.descriptors.b, m2> lVar) {
        u uVar;
        if (bVar == null) {
            a(107);
        }
        for (kotlin.reflect.jvm.internal.impl.descriptors.b bVar2 : bVar.g()) {
            if (bVar2.c() == t.f24442g) {
                K(bVar2, lVar);
            }
        }
        if (bVar.c() != t.f24442g) {
            return;
        }
        u h5 = h(bVar);
        if (h5 == null) {
            if (lVar != null) {
                lVar.N(bVar);
            }
            uVar = t.f24440e;
        } else {
            uVar = h5;
        }
        if (bVar instanceof c0) {
            ((c0) bVar).k1(uVar);
            Iterator<t0> it = ((u0) bVar).J().iterator();
            while (it.hasNext()) {
                K(it.next(), h5 == null ? null : lVar);
            }
            return;
        }
        if (bVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.impl.p) {
            ((kotlin.reflect.jvm.internal.impl.descriptors.impl.p) bVar).q1(uVar);
            return;
        }
        b0 b0Var = (b0) bVar;
        b0Var.V0(uVar);
        if (uVar != b0Var.I0().c()) {
            b0Var.T0(false);
        }
    }

    @d5.d
    public static <H> H L(@d5.d Collection<H> collection, @d5.d q3.l<H, kotlin.reflect.jvm.internal.impl.descriptors.a> lVar) {
        List x32;
        H h5;
        Object z22;
        Object z23;
        Object z24;
        Object z25;
        if (collection == null) {
            a(78);
        }
        if (lVar == null) {
            a(79);
        }
        if (collection.size() == 1) {
            z25 = j0.z2(collection);
            H h6 = (H) z25;
            if (h6 == null) {
                a(80);
            }
            return h6;
        }
        ArrayList arrayList = new ArrayList(2);
        x32 = j0.x3(collection, lVar);
        z22 = j0.z2(collection);
        H h7 = (H) z22;
        kotlin.reflect.jvm.internal.impl.descriptors.a N = lVar.N(h7);
        for (H h8 : collection) {
            kotlin.reflect.jvm.internal.impl.descriptors.a N2 = lVar.N(h8);
            if (C(N2, x32)) {
                arrayList.add(h8);
            }
            if (B(N2, N) && !B(N, N2)) {
                h7 = h8;
            }
        }
        if (arrayList.isEmpty()) {
            if (h7 == null) {
                a(81);
            }
            return h7;
        }
        if (arrayList.size() == 1) {
            z24 = j0.z2(arrayList);
            H h9 = (H) z24;
            if (h9 == null) {
                a(82);
            }
            return h9;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                h5 = null;
                break;
            }
            h5 = (H) it.next();
            if (!kotlin.reflect.jvm.internal.impl.types.e0.b(lVar.N(h5).i())) {
                break;
            }
        }
        if (h5 != null) {
            return h5;
        }
        z23 = j0.z2(arrayList);
        H h10 = (H) z23;
        if (h10 == null) {
            a(84);
        }
        return h10;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0060 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0039 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0253 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x039f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void a(int r24) {
        /*
            Method dump skipped, instructions count: 1652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.k.a(int):void");
    }

    private static boolean b(@d5.d Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> collection) {
        boolean w12;
        if (collection == null) {
            a(63);
        }
        if (collection.size() < 2) {
            return true;
        }
        w12 = j0.w1(collection, new c(collection.iterator().next().b()));
        return w12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        r1.remove();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean c(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.f1 r4, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.f1 r5, @d5.d kotlin.reflect.jvm.internal.impl.types.g1 r6) {
        /*
            if (r4 != 0) goto L7
            r0 = 49
            a(r0)
        L7:
            if (r5 != 0) goto Le
            r0 = 50
            a(r0)
        Le:
            if (r6 != 0) goto L15
            r0 = 51
            a(r0)
        L15:
            java.util.List r4 = r4.getUpperBounds()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r5 = r5.getUpperBounds()
            r0.<init>(r5)
            int r5 = r4.size()
            int r1 = r0.size()
            r2 = 0
            if (r5 == r1) goto L2e
            return r2
        L2e:
            java.util.Iterator r4 = r4.iterator()
        L32:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L59
            java.lang.Object r5 = r4.next()
            kotlin.reflect.jvm.internal.impl.types.h0 r5 = (kotlin.reflect.jvm.internal.impl.types.h0) r5
            java.util.ListIterator r1 = r0.listIterator()
        L42:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L58
            java.lang.Object r3 = r1.next()
            kotlin.reflect.jvm.internal.impl.types.h0 r3 = (kotlin.reflect.jvm.internal.impl.types.h0) r3
            boolean r3 = d(r5, r3, r6)
            if (r3 == 0) goto L42
            r1.remove()
            goto L32
        L58:
            return r2
        L59:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.k.c(kotlin.reflect.jvm.internal.impl.descriptors.f1, kotlin.reflect.jvm.internal.impl.descriptors.f1, kotlin.reflect.jvm.internal.impl.types.g1):boolean");
    }

    private static boolean d(@d5.d h0 h0Var, @d5.d h0 h0Var2, @d5.d g1 g1Var) {
        if (h0Var == null) {
            a(46);
        }
        if (h0Var2 == null) {
            a(47);
        }
        if (g1Var == null) {
            a(48);
        }
        if (kotlin.reflect.jvm.internal.impl.types.j0.a(h0Var) && kotlin.reflect.jvm.internal.impl.types.j0.a(h0Var2)) {
            return true;
        }
        return kotlin.reflect.jvm.internal.impl.types.g.f26418a.k(g1Var, h0Var.X0(), h0Var2.X0());
    }

    @d5.e
    private static i e(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
        if ((aVar.t0() == null) != (aVar2.t0() == null)) {
            return i.d(ProtectedSandApp.s("匓"));
        }
        if (aVar.n().size() != aVar2.n().size()) {
            return i.d(ProtectedSandApp.s("匔"));
        }
        return null;
    }

    private static void f(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar, @d5.d Set<kotlin.reflect.jvm.internal.impl.descriptors.b> set) {
        if (bVar == null) {
            a(17);
        }
        if (set == null) {
            a(18);
        }
        if (bVar.j().isReal()) {
            set.add(bVar);
            return;
        }
        if (bVar.g().isEmpty()) {
            throw new IllegalStateException(ProtectedSandApp.s("匕") + bVar);
        }
        Iterator<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> it = bVar.g().iterator();
        while (it.hasNext()) {
            f(it.next(), set);
        }
    }

    private static List<h0> g(kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        x0 t02 = aVar.t0();
        ArrayList arrayList = new ArrayList();
        if (t02 != null) {
            arrayList.add(t02.getType());
        }
        Iterator<j1> it = aVar.n().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getType());
        }
        return arrayList;
    }

    @d5.e
    private static u h(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        if (bVar == null) {
            a(108);
        }
        Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> g5 = bVar.g();
        u u5 = u(g5);
        if (u5 == null) {
            return null;
        }
        if (bVar.j() != b.a.FAKE_OVERRIDE) {
            return u5.f();
        }
        for (kotlin.reflect.jvm.internal.impl.descriptors.b bVar2 : g5) {
            if (bVar2.r() != e0.ABSTRACT && !bVar2.c().equals(u5)) {
                return null;
            }
        }
        return u5;
    }

    @d5.d
    public static k i(@d5.d kotlin.reflect.jvm.internal.impl.types.checker.g gVar, @d5.d e.a aVar) {
        if (gVar == null) {
            a(3);
        }
        if (aVar == null) {
            a(4);
        }
        return new k(aVar, gVar, f.a.f26342a, null);
    }

    private static void j(@d5.d Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> collection, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @d5.d j jVar) {
        if (collection == null) {
            a(85);
        }
        if (eVar == null) {
            a(86);
        }
        if (jVar == null) {
            a(87);
        }
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> t5 = t(eVar, collection);
        boolean isEmpty = t5.isEmpty();
        if (!isEmpty) {
            collection = t5;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.b r02 = ((kotlin.reflect.jvm.internal.impl.descriptors.b) L(collection, new d())).r0(eVar, n(collection, eVar), isEmpty ? t.f24443h : t.f24442g, b.a.FAKE_OVERRIDE, false);
        jVar.d(r02, collection);
        jVar.a(r02);
    }

    private static void k(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @d5.d Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> collection, @d5.d j jVar) {
        if (eVar == null) {
            a(64);
        }
        if (collection == null) {
            a(65);
        }
        if (jVar == null) {
            a(66);
        }
        if (b(collection)) {
            Iterator<kotlin.reflect.jvm.internal.impl.descriptors.b> it = collection.iterator();
            while (it.hasNext()) {
                j(Collections.singleton(it.next()), eVar, jVar);
            }
        } else {
            LinkedList linkedList = new LinkedList(collection);
            while (!linkedList.isEmpty()) {
                j(q(q.a(linkedList), linkedList, jVar), eVar, jVar);
            }
        }
    }

    @d5.d
    private g1 l(@d5.d List<f1> list, @d5.d List<f1> list2) {
        if (list == null) {
            a(42);
        }
        if (list2 == null) {
            a(43);
        }
        if (list.isEmpty()) {
            g1 I0 = new l(null, this.f25951c, this.f25949a, this.f25950b, this.f25952d).I0(true, true);
            if (I0 == null) {
                a(44);
            }
            return I0;
        }
        HashMap hashMap = new HashMap();
        for (int i5 = 0; i5 < list.size(); i5++) {
            hashMap.put(list.get(i5).m(), list2.get(i5).m());
        }
        g1 I02 = new l(hashMap, this.f25951c, this.f25949a, this.f25950b, this.f25952d).I0(true, true);
        if (I02 == null) {
            a(45);
        }
        return I02;
    }

    @d5.d
    public static k m(@d5.d kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        if (gVar == null) {
            a(0);
        }
        return new k(f25947g, gVar, f.a.f26342a, null);
    }

    @d5.d
    private static e0 n(@d5.d Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> collection, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        if (collection == null) {
            a(88);
        }
        if (eVar == null) {
            a(89);
        }
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        for (kotlin.reflect.jvm.internal.impl.descriptors.b bVar : collection) {
            int i5 = h.f25959c[bVar.r().ordinal()];
            if (i5 == 1) {
                e0 e0Var = e0.FINAL;
                if (e0Var == null) {
                    a(90);
                }
                return e0Var;
            }
            if (i5 == 2) {
                throw new IllegalStateException(ProtectedSandApp.s("化") + bVar);
            }
            if (i5 == 3) {
                z6 = true;
            } else if (i5 == 4) {
                z7 = true;
            }
        }
        if (eVar.U() && eVar.r() != e0.ABSTRACT && eVar.r() != e0.SEALED) {
            z5 = true;
        }
        if (z6 && !z7) {
            e0 e0Var2 = e0.OPEN;
            if (e0Var2 == null) {
                a(91);
            }
            return e0Var2;
        }
        if (!z6 && z7) {
            e0 r5 = z5 ? eVar.r() : e0.ABSTRACT;
            if (r5 == null) {
                a(92);
            }
            return r5;
        }
        HashSet hashSet = new HashSet();
        Iterator<kotlin.reflect.jvm.internal.impl.descriptors.b> it = collection.iterator();
        while (it.hasNext()) {
            hashSet.addAll(z(it.next()));
        }
        return y(r(hashSet), z5, eVar.r());
    }

    private Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> o(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar, @d5.d Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> collection, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @d5.d j jVar) {
        if (bVar == null) {
            a(59);
        }
        if (collection == null) {
            a(60);
        }
        if (eVar == null) {
            a(61);
        }
        if (jVar == null) {
            a(62);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        kotlin.reflect.jvm.internal.impl.utils.f b6 = kotlin.reflect.jvm.internal.impl.utils.f.b();
        for (kotlin.reflect.jvm.internal.impl.descriptors.b bVar2 : collection) {
            i.a c6 = D(bVar2, bVar, eVar).c();
            boolean I = I(bVar, bVar2, false);
            int i5 = h.f25958b[c6.ordinal()];
            if (i5 == 1) {
                if (I) {
                    b6.add(bVar2);
                }
                arrayList.add(bVar2);
            } else if (i5 == 2) {
                if (I) {
                    jVar.c(bVar2, bVar);
                }
                arrayList.add(bVar2);
            }
        }
        jVar.d(bVar, b6);
        return arrayList;
    }

    @d5.d
    public static <H> Collection<H> p(@d5.d H h5, @d5.d Collection<H> collection, @d5.d q3.l<H, kotlin.reflect.jvm.internal.impl.descriptors.a> lVar, @d5.d q3.l<H, m2> lVar2) {
        if (h5 == null) {
            a(99);
        }
        if (collection == null) {
            a(100);
        }
        if (lVar == null) {
            a(101);
        }
        if (lVar2 == null) {
            a(102);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(h5);
        kotlin.reflect.jvm.internal.impl.descriptors.a N = lVar.N(h5);
        Iterator<H> it = collection.iterator();
        while (it.hasNext()) {
            H next = it.next();
            kotlin.reflect.jvm.internal.impl.descriptors.a N2 = lVar.N(next);
            if (h5 == next) {
                it.remove();
            } else {
                i.a x5 = x(N, N2);
                if (x5 == i.a.OVERRIDABLE) {
                    arrayList.add(next);
                    it.remove();
                } else if (x5 == i.a.CONFLICT) {
                    lVar2.N(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    @d5.d
    private static Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> q(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar, @d5.d Queue<kotlin.reflect.jvm.internal.impl.descriptors.b> queue, @d5.d j jVar) {
        if (bVar == null) {
            a(104);
        }
        if (queue == null) {
            a(105);
        }
        if (jVar == null) {
            a(106);
        }
        return p(bVar, queue, new f(), new g(jVar, bVar));
    }

    @d5.d
    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.a> Set<D> r(@d5.d Set<D> set) {
        if (set == null) {
            a(8);
        }
        return s(set, !set.isEmpty() && kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.u(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.p(set.iterator().next())), null, new b());
    }

    @d5.d
    public static <D> Set<D> s(@d5.d Set<D> set, boolean z5, @d5.e q3.a<?> aVar, @d5.d q3.p<? super D, ? super D, Pair<kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.a>> pVar) {
        if (set == null) {
            a(9);
        }
        if (pVar == null) {
            a(10);
        }
        if (set.size() <= 1) {
            return set;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : set) {
            if (aVar != null) {
                aVar.n();
            }
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    linkedHashSet.add(obj);
                    break;
                }
                Pair<kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.a> g02 = pVar.g0(obj, (Object) it.next());
                kotlin.reflect.jvm.internal.impl.descriptors.a a6 = g02.a();
                kotlin.reflect.jvm.internal.impl.descriptors.a b6 = g02.b();
                if (!J(a6, b6, z5, true)) {
                    if (J(b6, a6, z5, true)) {
                        break;
                    }
                } else {
                    it.remove();
                }
            }
        }
        return linkedHashSet;
    }

    @d5.d
    private static Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> t(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @d5.d Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> collection) {
        List m22;
        if (eVar == null) {
            a(96);
        }
        if (collection == null) {
            a(97);
        }
        m22 = j0.m2(collection, new e(eVar));
        if (m22 == null) {
            a(98);
        }
        return m22;
    }

    @d5.e
    public static u u(@d5.d Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> collection) {
        u uVar;
        if (collection == null) {
            a(109);
        }
        if (collection.isEmpty()) {
            return t.f24447l;
        }
        Iterator<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> it = collection.iterator();
        loop0: while (true) {
            uVar = null;
            while (it.hasNext()) {
                u c6 = it.next().c();
                if (uVar != null) {
                    Integer d6 = t.d(c6, uVar);
                    if (d6 == null) {
                        break;
                    }
                    if (d6.intValue() > 0) {
                    }
                }
                uVar = c6;
            }
        }
        if (uVar == null) {
            return null;
        }
        Iterator<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> it2 = collection.iterator();
        while (it2.hasNext()) {
            Integer d7 = t.d(uVar, it2.next().c());
            if (d7 == null || d7.intValue() < 0) {
                return null;
            }
        }
        return uVar;
    }

    @d5.e
    public static i w(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
        boolean z5;
        if (aVar == null) {
            a(40);
        }
        if (aVar2 == null) {
            a(41);
        }
        boolean z6 = aVar instanceof z;
        if ((z6 && !(aVar2 instanceof z)) || (((z5 = aVar instanceof u0)) && !(aVar2 instanceof u0))) {
            return i.d(ProtectedSandApp.s("北"));
        }
        if (!z6 && !z5) {
            throw new IllegalArgumentException(ProtectedSandApp.s("匘") + aVar);
        }
        if (!aVar.getName().equals(aVar2.getName())) {
            return i.d(ProtectedSandApp.s("匙"));
        }
        i e6 = e(aVar, aVar2);
        if (e6 != null) {
            return e6;
        }
        return null;
    }

    @d5.e
    public static i.a x(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
        k kVar = f25946f;
        i.a c6 = kVar.D(aVar2, aVar, null).c();
        i.a c7 = kVar.D(aVar, aVar2, null).c();
        i.a aVar3 = i.a.OVERRIDABLE;
        if (c6 == aVar3 && c7 == aVar3) {
            return aVar3;
        }
        i.a aVar4 = i.a.CONFLICT;
        return (c6 == aVar4 || c7 == aVar4) ? aVar4 : i.a.INCOMPATIBLE;
    }

    @d5.d
    private static e0 y(@d5.d Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> collection, boolean z5, @d5.d e0 e0Var) {
        if (collection == null) {
            a(93);
        }
        if (e0Var == null) {
            a(94);
        }
        e0 e0Var2 = e0.ABSTRACT;
        for (kotlin.reflect.jvm.internal.impl.descriptors.b bVar : collection) {
            e0 r5 = (z5 && bVar.r() == e0.ABSTRACT) ? e0Var : bVar.r();
            if (r5.compareTo(e0Var2) < 0) {
                e0Var2 = r5;
            }
        }
        if (e0Var2 == null) {
            a(95);
        }
        return e0Var2;
    }

    @d5.d
    public static Set<kotlin.reflect.jvm.internal.impl.descriptors.b> z(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        if (bVar == null) {
            a(15);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        f(bVar, linkedHashSet);
        return linkedHashSet;
    }

    @d5.d
    public i D(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, @d5.e kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        if (aVar == null) {
            a(19);
        }
        if (aVar2 == null) {
            a(20);
        }
        i E = E(aVar, aVar2, eVar, false);
        if (E == null) {
            a(21);
        }
        return E;
    }

    @d5.d
    public i E(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, @d5.e kotlin.reflect.jvm.internal.impl.descriptors.e eVar, boolean z5) {
        if (aVar == null) {
            a(22);
        }
        if (aVar2 == null) {
            a(23);
        }
        i F = F(aVar, aVar2, z5);
        boolean z6 = F.c() == i.a.OVERRIDABLE;
        Iterator<kotlin.reflect.jvm.internal.impl.resolve.f> it = f25945e.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String s5 = ProtectedSandApp.s("匚");
            String s6 = ProtectedSandApp.s("匛");
            if (!hasNext) {
                if (!z6) {
                    return F;
                }
                for (kotlin.reflect.jvm.internal.impl.resolve.f fVar : f25945e) {
                    if (fVar.a() == f.a.CONFLICTS_ONLY) {
                        int i5 = h.f25957a[fVar.b(aVar, aVar2, eVar).ordinal()];
                        if (i5 == 1) {
                            throw new IllegalStateException(ProtectedSandApp.s("匜") + fVar.getClass().getName() + ProtectedSandApp.s("匝"));
                        }
                        if (i5 == 2) {
                            i b6 = i.b(s6);
                            if (b6 == null) {
                                a(27);
                            }
                            return b6;
                        }
                        if (i5 == 3) {
                            i d6 = i.d(s5);
                            if (d6 == null) {
                                a(28);
                            }
                            return d6;
                        }
                    }
                }
                i e6 = i.e();
                if (e6 == null) {
                    a(29);
                }
                return e6;
            }
            kotlin.reflect.jvm.internal.impl.resolve.f next = it.next();
            if (next.a() != f.a.CONFLICTS_ONLY && (!z6 || next.a() != f.a.SUCCESS_ONLY)) {
                int i6 = h.f25957a[next.b(aVar, aVar2, eVar).ordinal()];
                if (i6 == 1) {
                    z6 = true;
                } else {
                    if (i6 == 2) {
                        i b7 = i.b(s6);
                        if (b7 == null) {
                            a(24);
                        }
                        return b7;
                    }
                    if (i6 == 3) {
                        i d7 = i.d(s5);
                        if (d7 == null) {
                            a(25);
                        }
                        return d7;
                    }
                }
            }
        }
    }

    @d5.d
    public i F(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, boolean z5) {
        if (aVar == null) {
            a(30);
        }
        if (aVar2 == null) {
            a(31);
        }
        i w5 = w(aVar, aVar2);
        if (w5 != null) {
            return w5;
        }
        List<h0> g5 = g(aVar);
        List<h0> g6 = g(aVar2);
        List<f1> typeParameters = aVar.getTypeParameters();
        List<f1> typeParameters2 = aVar2.getTypeParameters();
        int i5 = 0;
        if (typeParameters.size() == typeParameters2.size()) {
            g1 l5 = l(typeParameters, typeParameters2);
            for (int i6 = 0; i6 < typeParameters.size(); i6++) {
                if (!c(typeParameters.get(i6), typeParameters2.get(i6), l5)) {
                    i d6 = i.d(ProtectedSandApp.s("匟"));
                    if (d6 == null) {
                        a(35);
                    }
                    return d6;
                }
            }
            for (int i7 = 0; i7 < g5.size(); i7++) {
                if (!d(g5.get(i7), g6.get(i7), l5)) {
                    i d7 = i.d(ProtectedSandApp.s("匠"));
                    if (d7 == null) {
                        a(36);
                    }
                    return d7;
                }
            }
            if ((aVar instanceof z) && (aVar2 instanceof z) && ((z) aVar).o() != ((z) aVar2).o()) {
                i b6 = i.b(ProtectedSandApp.s("匡"));
                if (b6 == null) {
                    a(37);
                }
                return b6;
            }
            if (z5) {
                h0 i8 = aVar.i();
                h0 i9 = aVar2.i();
                if (i8 != null && i9 != null) {
                    if (kotlin.reflect.jvm.internal.impl.types.j0.a(i9) && kotlin.reflect.jvm.internal.impl.types.j0.a(i8)) {
                        i5 = 1;
                    }
                    if (i5 == 0 && !kotlin.reflect.jvm.internal.impl.types.g.f26418a.r(l5, i9.X0(), i8.X0())) {
                        i b7 = i.b(ProtectedSandApp.s("匢"));
                        if (b7 == null) {
                            a(38);
                        }
                        return b7;
                    }
                }
            }
            i e6 = i.e();
            if (e6 == null) {
                a(39);
            }
            return e6;
        }
        while (true) {
            int size = g5.size();
            String s5 = ProtectedSandApp.s("匞");
            if (i5 >= size) {
                i b8 = i.b(s5);
                if (b8 == null) {
                    a(34);
                }
                return b8;
            }
            if (!kotlin.reflect.jvm.internal.impl.types.checker.e.f26341a.b(g5.get(i5), g6.get(i5))) {
                i d8 = i.d(s5);
                if (d8 == null) {
                    a(33);
                }
                return d8;
            }
            i5++;
        }
    }

    public void v(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> collection, @d5.d Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> collection2, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @d5.d j jVar) {
        if (fVar == null) {
            a(52);
        }
        if (collection == null) {
            a(53);
        }
        if (collection2 == null) {
            a(54);
        }
        if (eVar == null) {
            a(55);
        }
        if (jVar == null) {
            a(56);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> it = collection2.iterator();
        while (it.hasNext()) {
            linkedHashSet.removeAll(o(it.next(), collection, eVar, jVar));
        }
        k(eVar, linkedHashSet, jVar);
    }
}
