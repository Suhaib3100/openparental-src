package kotlin.reflect.jvm.internal.impl.resolve;

import com.flashget.parentalcontrol.ProtectedSandApp;
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
import kotlin.collections.w;
import kotlin.k2;
import kotlin.q0;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.resolve.g;
import kotlin.reflect.jvm.internal.impl.types.checker.e;
import kotlin.reflect.jvm.internal.impl.types.checker.f;
import kotlin.reflect.jvm.internal.impl.types.checker.g;
import kotlin.reflect.jvm.internal.impl.types.g1;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.h1;
import kotlin.reflect.jvm.internal.impl.types.j0;

/* compiled from: OverridingUtil.java */
/* loaded from: classes7.dex */
public class l {

    /* renamed from: e, reason: collision with root package name */
    private static final List<kotlin.reflect.jvm.internal.impl.resolve.g> f77928e = w.V5(ServiceLoader.load(kotlin.reflect.jvm.internal.impl.resolve.g.class, kotlin.reflect.jvm.internal.impl.resolve.g.class.getClassLoader()));

    /* renamed from: f, reason: collision with root package name */
    public static final l f77929f;

    /* renamed from: g, reason: collision with root package name */
    private static final e.a f77930g;

    /* renamed from: h, reason: collision with root package name */
    static final /* synthetic */ boolean f77931h = false;

    /* renamed from: a, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.types.checker.g f77932a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.types.checker.f f77933b;

    /* renamed from: c, reason: collision with root package name */
    private final e.a f77934c;

    /* renamed from: d, reason: collision with root package name */
    private final ld.p<h0, h0, Boolean> f77935d;

    /* compiled from: OverridingUtil.java */
    static class a implements e.a {
        a() {
        }

        private static /* synthetic */ void b(int i4) {
            Object[] objArr = new Object[3];
            if (i4 != 1) {
                objArr[0] = ProtectedSandApp.s("秦\u0001");
            } else {
                objArr[0] = ProtectedSandApp.s("秧\u0001");
            }
            objArr[1] = ProtectedSandApp.s("秨\u0001");
            objArr[2] = ProtectedSandApp.s("秩\u0001");
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("秪\u0001"), objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.e.a
        public boolean a(@fg.l h1 h1Var, @fg.l h1 h1Var2) {
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
    static class b<D> implements ld.p<D, D, q0<kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.a>> {
        b() {
        }

        /* JADX WARN: Incorrect types in method signature: (TD;TD;)Lkotlin/q0<Lkotlin/reflect/jvm/internal/impl/descriptors/a;Lkotlin/reflect/jvm/internal/impl/descriptors/a;>; */
        public q0 a(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
            return new q0(aVar, aVar2);
        }

        @Override // ld.p
        public q0<kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.a> invoke(Object obj, Object obj2) {
            return new q0<>((kotlin.reflect.jvm.internal.impl.descriptors.a) obj, (kotlin.reflect.jvm.internal.impl.descriptors.a) obj2);
        }
    }

    /* compiled from: OverridingUtil.java */
    static class c implements ld.l<kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.m f77936b;

        c(kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
            this.f77936b = mVar;
        }

        @Override // ld.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            return Boolean.valueOf(bVar.c() == this.f77936b);
        }
    }

    /* compiled from: OverridingUtil.java */
    static class d implements ld.l<kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.reflect.jvm.internal.impl.descriptors.a> {
        d() {
        }

        public kotlin.reflect.jvm.internal.impl.descriptors.b a(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            return bVar;
        }

        @Override // ld.l
        public kotlin.reflect.jvm.internal.impl.descriptors.a invoke(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            return bVar;
        }
    }

    /* compiled from: OverridingUtil.java */
    static class e implements ld.l<kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.e f77937b;

        e(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
            this.f77937b = eVar;
        }

        @Override // ld.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            boolean z4 = false;
            if (!kotlin.reflect.jvm.internal.impl.descriptors.t.g(bVar.getVisibility()) && kotlin.reflect.jvm.internal.impl.descriptors.t.h(bVar, this.f77937b, false)) {
                z4 = true;
            }
            return Boolean.valueOf(z4);
        }
    }

    /* compiled from: OverridingUtil.java */
    static class f implements ld.l<kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.reflect.jvm.internal.impl.descriptors.a> {
        f() {
        }

        public kotlin.reflect.jvm.internal.impl.descriptors.a a(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            return bVar;
        }

        @Override // ld.l
        public kotlin.reflect.jvm.internal.impl.descriptors.a invoke(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            return bVar;
        }
    }

    /* compiled from: OverridingUtil.java */
    static class g implements ld.l<kotlin.reflect.jvm.internal.impl.descriptors.b, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f77938b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.b f77939c;

        g(k kVar, kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            this.f77938b = kVar;
            this.f77939c = bVar;
        }

        @Override // ld.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public k2 invoke(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            this.f77938b.b(this.f77939c, bVar);
            return k2.f75408a;
        }
    }

    /* compiled from: OverridingUtil.java */
    static /* synthetic */ class h {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f77940a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f77941b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f77942c;

        static {
            int[] iArr = new int[e0.values().length];
            f77942c = iArr;
            try {
                iArr[e0.FINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f77942c[e0.SEALED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f77942c[e0.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f77942c[e0.ABSTRACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[i.a.values().length];
            f77941b = iArr2;
            try {
                iArr2[i.a.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f77941b[i.a.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f77941b[i.a.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[g.b.values().length];
            f77940a = iArr3;
            try {
                iArr3[g.b.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f77940a[g.b.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f77940a[g.b.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f77940a[g.b.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* compiled from: OverridingUtil.java */
    public static class i {

        /* renamed from: c, reason: collision with root package name */
        private static final i f77943c = new i(a.OVERRIDABLE, ProtectedSandApp.s("秮\u0001"));

        /* renamed from: a, reason: collision with root package name */
        private final a f77944a;

        /* renamed from: b, reason: collision with root package name */
        private final String f77945b;

        /* compiled from: OverridingUtil.java */
        public enum a {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT
        }

        public i(@fg.l a aVar, @fg.l String str) {
            if (aVar == null) {
                a(3);
            }
            if (str == null) {
                a(4);
            }
            this.f77944a = aVar;
            this.f77945b = str;
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
                java.lang.String r4 = "积\u0001"
                java.lang.String r4 = com.flashget.parentalcontrol.ProtectedSandApp.s(r4)
                goto L19
            L13:
                java.lang.String r4 = "称\u0001"
                java.lang.String r4 = com.flashget.parentalcontrol.ProtectedSandApp.s(r4)
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
                java.lang.String r6 = "秱\u0001"
                java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)
                java.lang.String r7 = "秲\u0001"
                java.lang.String r7 = com.flashget.parentalcontrol.ProtectedSandApp.s(r7)
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
                java.lang.String r9 = "秳\u0001"
                java.lang.String r9 = com.flashget.parentalcontrol.ProtectedSandApp.s(r9)
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
                java.lang.String r6 = "秴\u0001"
                java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)
                r5[r3] = r6
                goto L63
            L58:
                java.lang.String r6 = "秵\u0001"
                java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)
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
                java.lang.String r6 = "秶\u0001"
                java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)
                r5[r2] = r6
                goto L86
            L75:
                java.lang.String r6 = "秷\u0001"
                java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)
                r5[r2] = r6
                goto L86
            L7e:
                java.lang.String r6 = "秸\u0001"
                java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)
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
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.l.i.a(int):void");
        }

        @fg.l
        public static i b(@fg.l String str) {
            if (str == null) {
                a(2);
            }
            return new i(a.CONFLICT, str);
        }

        @fg.l
        public static i d(@fg.l String str) {
            if (str == null) {
                a(1);
            }
            return new i(a.INCOMPATIBLE, str);
        }

        @fg.l
        public static i e() {
            i iVar = f77943c;
            if (iVar == null) {
                a(0);
            }
            return iVar;
        }

        @fg.l
        public a c() {
            a aVar = this.f77944a;
            if (aVar == null) {
                a(5);
            }
            return aVar;
        }
    }

    static {
        a aVar = new a();
        f77930g = aVar;
        f77929f = new l(aVar, g.a.f78351a, f.a.f78350a, null);
    }

    private l(@fg.l e.a aVar, @fg.l kotlin.reflect.jvm.internal.impl.types.checker.g gVar, @fg.l kotlin.reflect.jvm.internal.impl.types.checker.f fVar, @fg.m ld.p<h0, h0, Boolean> pVar) {
        if (aVar == null) {
            a(5);
        }
        if (gVar == null) {
            a(6);
        }
        if (fVar == null) {
            a(7);
        }
        this.f77934c = aVar;
        this.f77932a = gVar;
        this.f77933b = fVar;
        this.f77935d = pVar;
    }

    private static boolean A(@fg.m t0 t0Var, @fg.m t0 t0Var2) {
        if (t0Var == null || t0Var2 == null) {
            return true;
        }
        return H(t0Var, t0Var2);
    }

    public static boolean B(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
        if (aVar == null) {
            a(67);
        }
        if (aVar2 == null) {
            a(68);
        }
        h0 returnType = aVar.getReturnType();
        h0 returnType2 = aVar2.getReturnType();
        if (!H(aVar, aVar2)) {
            return false;
        }
        g1 l4 = f77929f.l(aVar.getTypeParameters(), aVar2.getTypeParameters());
        if (aVar instanceof z) {
            return G(aVar, returnType, aVar2, returnType2, l4);
        }
        if (!(aVar instanceof u0)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("秹\u0001") + aVar.getClass());
        }
        u0 u0Var = (u0) aVar;
        u0 u0Var2 = (u0) aVar2;
        if (A(u0Var.getSetter(), u0Var2.getSetter())) {
            return (u0Var.Q() && u0Var2.Q()) ? kotlin.reflect.jvm.internal.impl.types.g.f78427a.k(l4, returnType.R0(), returnType2.R0()) : (u0Var.Q() || !u0Var2.Q()) && G(aVar, returnType, aVar2, returnType2, l4);
        }
        return false;
    }

    private static boolean C(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @fg.l Collection<kotlin.reflect.jvm.internal.impl.descriptors.a> collection) {
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

    private static boolean G(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @fg.l h0 h0Var, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, @fg.l h0 h0Var2, @fg.l g1 g1Var) {
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
        return kotlin.reflect.jvm.internal.impl.types.g.f78427a.r(g1Var, h0Var.R0(), h0Var2.R0());
    }

    private static boolean H(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.q qVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.q qVar2) {
        if (qVar == null) {
            a(69);
        }
        if (qVar2 == null) {
            a(70);
        }
        Integer d5 = kotlin.reflect.jvm.internal.impl.descriptors.t.d(qVar.getVisibility(), qVar2.getVisibility());
        return d5 == null || d5.intValue() >= 0;
    }

    public static boolean I(@fg.l d0 d0Var, @fg.l d0 d0Var2, boolean z4) {
        if (d0Var == null) {
            a(57);
        }
        if (d0Var2 == null) {
            a(58);
        }
        return !kotlin.reflect.jvm.internal.impl.descriptors.t.g(d0Var2.getVisibility()) && kotlin.reflect.jvm.internal.impl.descriptors.t.h(d0Var2, d0Var, z4);
    }

    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.a> boolean J(@fg.l D d5, @fg.l D d6, boolean z4, boolean z5) {
        if (d5 == null) {
            a(13);
        }
        if (d6 == null) {
            a(14);
        }
        if (!d5.equals(d6) && kotlin.reflect.jvm.internal.impl.resolve.d.f77899a.f(d5.a(), d6.a(), z4, z5)) {
            return true;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.a a5 = d6.a();
        Iterator it = kotlin.reflect.jvm.internal.impl.resolve.f.d(d5).iterator();
        while (it.hasNext()) {
            if (kotlin.reflect.jvm.internal.impl.resolve.d.f77899a.f(a5, (kotlin.reflect.jvm.internal.impl.descriptors.a) it.next(), z4, z5)) {
                return true;
            }
        }
        return false;
    }

    public static void K(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar, @fg.m ld.l<kotlin.reflect.jvm.internal.impl.descriptors.b, k2> lVar) {
        u uVar;
        if (bVar == null) {
            a(107);
        }
        for (kotlin.reflect.jvm.internal.impl.descriptors.b bVar2 : bVar.e()) {
            if (bVar2.getVisibility() == kotlin.reflect.jvm.internal.impl.descriptors.t.f76292g) {
                K(bVar2, lVar);
            }
        }
        if (bVar.getVisibility() != kotlin.reflect.jvm.internal.impl.descriptors.t.f76292g) {
            return;
        }
        u h4 = h(bVar);
        if (h4 == null) {
            if (lVar != null) {
                lVar.invoke(bVar);
            }
            uVar = kotlin.reflect.jvm.internal.impl.descriptors.t.f76290e;
        } else {
            uVar = h4;
        }
        if (bVar instanceof c0) {
            ((c0) bVar).e1(uVar);
            Iterator<t0> it = ((u0) bVar).D().iterator();
            while (it.hasNext()) {
                K(it.next(), h4 == null ? null : lVar);
            }
            return;
        }
        if (bVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.impl.p) {
            ((kotlin.reflect.jvm.internal.impl.descriptors.impl.p) bVar).k1(uVar);
            return;
        }
        b0 b0Var = (b0) bVar;
        b0Var.P0(uVar);
        if (uVar != b0Var.Y().getVisibility()) {
            b0Var.N0(false);
        }
    }

    @fg.l
    public static <H> H L(@fg.l Collection<H> collection, @fg.l ld.l<H, kotlin.reflect.jvm.internal.impl.descriptors.a> lVar) {
        H h4;
        if (collection == null) {
            a(78);
        }
        if (lVar == null) {
            a(79);
        }
        if (collection.size() == 1) {
            H h5 = (H) w.z2(collection);
            if (h5 == null) {
                a(80);
            }
            return h5;
        }
        ArrayList arrayList = new ArrayList(2);
        List x32 = w.x3(collection, lVar);
        H h6 = (H) w.z2(collection);
        kotlin.reflect.jvm.internal.impl.descriptors.a invoke = lVar.invoke(h6);
        for (H h7 : collection) {
            kotlin.reflect.jvm.internal.impl.descriptors.a invoke2 = lVar.invoke(h7);
            if (C(invoke2, x32)) {
                arrayList.add(h7);
            }
            if (B(invoke2, invoke) && !B(invoke, invoke2)) {
                h6 = h7;
            }
        }
        if (arrayList.isEmpty()) {
            if (h6 == null) {
                a(81);
            }
            return h6;
        }
        if (arrayList.size() == 1) {
            H h10 = (H) w.z2(arrayList);
            if (h10 == null) {
                a(82);
            }
            return h10;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                h4 = null;
                break;
            }
            h4 = (H) it.next();
            if (!kotlin.reflect.jvm.internal.impl.types.e0.b(lVar.invoke(h4).getReturnType())) {
                break;
            }
        }
        if (h4 != null) {
            return h4;
        }
        H h11 = (H) w.z2(arrayList);
        if (h11 == null) {
            a(84);
        }
        return h11;
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
    /* JADX WARN: Removed duplicated region for block: B:55:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void a(int r24) {
        /*
            Method dump skipped, instructions count: 1652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.l.a(int):void");
    }

    private static boolean b(@fg.l Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> collection) {
        if (collection == null) {
            a(63);
        }
        if (collection.size() < 2) {
            return true;
        }
        return w.w1(collection, new c(collection.iterator().next().c()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        r1.remove();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean c(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.f1 r4, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.f1 r5, @fg.l kotlin.reflect.jvm.internal.impl.types.g1 r6) {
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.l.c(kotlin.reflect.jvm.internal.impl.descriptors.f1, kotlin.reflect.jvm.internal.impl.descriptors.f1, kotlin.reflect.jvm.internal.impl.types.g1):boolean");
    }

    private static boolean d(@fg.l h0 h0Var, @fg.l h0 h0Var2, @fg.l g1 g1Var) {
        if (h0Var == null) {
            a(46);
        }
        if (h0Var2 == null) {
            a(47);
        }
        if (g1Var == null) {
            a(48);
        }
        if (j0.a(h0Var) && j0.a(h0Var2)) {
            return true;
        }
        return kotlin.reflect.jvm.internal.impl.types.g.f78427a.k(g1Var, h0Var.R0(), h0Var2.R0());
    }

    @fg.m
    private static i e(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
        if ((aVar.S() == null) != (aVar2.S() == null)) {
            return i.d(ProtectedSandApp.s("穊\u0001"));
        }
        if (aVar.i().size() != aVar2.i().size()) {
            return i.d(ProtectedSandApp.s("穋\u0001"));
        }
        return null;
    }

    private static void f(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar, @fg.l Set<kotlin.reflect.jvm.internal.impl.descriptors.b> set) {
        if (bVar == null) {
            a(17);
        }
        if (set == null) {
            a(18);
        }
        if (bVar.b().isReal()) {
            set.add(bVar);
            return;
        }
        if (bVar.e().isEmpty()) {
            throw new IllegalStateException(ProtectedSandApp.s("穌\u0001") + bVar);
        }
        Iterator<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> it = bVar.e().iterator();
        while (it.hasNext()) {
            f(it.next(), set);
        }
    }

    private static List<h0> g(kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        x0 S = aVar.S();
        ArrayList arrayList = new ArrayList();
        if (S != null) {
            arrayList.add(S.getType());
        }
        Iterator<j1> it = aVar.i().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getType());
        }
        return arrayList;
    }

    @fg.m
    private static u h(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        if (bVar == null) {
            a(108);
        }
        Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> e4 = bVar.e();
        u u4 = u(e4);
        if (u4 == null) {
            return null;
        }
        if (bVar.b() != b.a.FAKE_OVERRIDE) {
            return u4.f();
        }
        for (kotlin.reflect.jvm.internal.impl.descriptors.b bVar2 : e4) {
            if (bVar2.u() != e0.ABSTRACT && !bVar2.getVisibility().equals(u4)) {
                return null;
            }
        }
        return u4;
    }

    @fg.l
    public static l i(@fg.l kotlin.reflect.jvm.internal.impl.types.checker.g gVar, @fg.l e.a aVar) {
        if (gVar == null) {
            a(3);
        }
        if (aVar == null) {
            a(4);
        }
        return new l(aVar, gVar, f.a.f78350a, null);
    }

    private static void j(@fg.l Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> collection, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @fg.l k kVar) {
        if (collection == null) {
            a(85);
        }
        if (eVar == null) {
            a(86);
        }
        if (kVar == null) {
            a(87);
        }
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> t4 = t(eVar, collection);
        boolean isEmpty = t4.isEmpty();
        if (!isEmpty) {
            collection = t4;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.b R = ((kotlin.reflect.jvm.internal.impl.descriptors.b) L(collection, new d())).R(eVar, n(collection, eVar), isEmpty ? kotlin.reflect.jvm.internal.impl.descriptors.t.f76293h : kotlin.reflect.jvm.internal.impl.descriptors.t.f76292g, b.a.FAKE_OVERRIDE, false);
        kVar.d(R, collection);
        kVar.a(R);
    }

    private static void k(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @fg.l Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> collection, @fg.l k kVar) {
        if (eVar == null) {
            a(64);
        }
        if (collection == null) {
            a(65);
        }
        if (kVar == null) {
            a(66);
        }
        if (b(collection)) {
            Iterator<kotlin.reflect.jvm.internal.impl.descriptors.b> it = collection.iterator();
            while (it.hasNext()) {
                j(Collections.singleton(it.next()), eVar, kVar);
            }
        } else {
            LinkedList linkedList = new LinkedList(collection);
            while (!linkedList.isEmpty()) {
                j(q(t.a(linkedList), linkedList, kVar), eVar, kVar);
            }
        }
    }

    @fg.l
    private g1 l(@fg.l List<f1> list, @fg.l List<f1> list2) {
        if (list == null) {
            a(42);
        }
        if (list2 == null) {
            a(43);
        }
        if (list.isEmpty()) {
            g1 I0 = new m(null, this.f77934c, this.f77932a, this.f77933b, this.f77935d).I0(true, true);
            if (I0 == null) {
                a(44);
            }
            return I0;
        }
        HashMap hashMap = new HashMap();
        for (int i4 = 0; i4 < list.size(); i4++) {
            hashMap.put(list.get(i4).j(), list2.get(i4).j());
        }
        g1 I02 = new m(hashMap, this.f77934c, this.f77932a, this.f77933b, this.f77935d).I0(true, true);
        if (I02 == null) {
            a(45);
        }
        return I02;
    }

    @fg.l
    public static l m(@fg.l kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        if (gVar == null) {
            a(0);
        }
        return new l(f77930g, gVar, f.a.f78350a, null);
    }

    @fg.l
    private static e0 n(@fg.l Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> collection, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        if (collection == null) {
            a(88);
        }
        if (eVar == null) {
            a(89);
        }
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        for (kotlin.reflect.jvm.internal.impl.descriptors.b bVar : collection) {
            int i4 = h.f77942c[bVar.u().ordinal()];
            if (i4 == 1) {
                e0 e0Var = e0.FINAL;
                if (e0Var == null) {
                    a(90);
                }
                return e0Var;
            }
            if (i4 == 2) {
                throw new IllegalStateException(ProtectedSandApp.s("積\u0001") + bVar);
            }
            if (i4 == 3) {
                z5 = true;
            } else if (i4 == 4) {
                z6 = true;
            }
        }
        if (eVar.m0() && eVar.u() != e0.ABSTRACT && eVar.u() != e0.SEALED) {
            z4 = true;
        }
        if (z5 && !z6) {
            e0 e0Var2 = e0.OPEN;
            if (e0Var2 == null) {
                a(91);
            }
            return e0Var2;
        }
        if (!z5 && z6) {
            e0 u4 = z4 ? eVar.u() : e0.ABSTRACT;
            if (u4 == null) {
                a(92);
            }
            return u4;
        }
        HashSet hashSet = new HashSet();
        Iterator<kotlin.reflect.jvm.internal.impl.descriptors.b> it = collection.iterator();
        while (it.hasNext()) {
            hashSet.addAll(z(it.next()));
        }
        return y(r(hashSet), z4, eVar.u());
    }

    private Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> o(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar, @fg.l Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> collection, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @fg.l k kVar) {
        if (bVar == null) {
            a(59);
        }
        if (collection == null) {
            a(60);
        }
        if (eVar == null) {
            a(61);
        }
        if (kVar == null) {
            a(62);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        kotlin.reflect.jvm.internal.impl.utils.g b5 = kotlin.reflect.jvm.internal.impl.utils.g.b();
        for (kotlin.reflect.jvm.internal.impl.descriptors.b bVar2 : collection) {
            i.a c5 = D(bVar2, bVar, eVar).c();
            boolean I = I(bVar, bVar2, false);
            int i4 = h.f77941b[c5.ordinal()];
            if (i4 == 1) {
                if (I) {
                    b5.add(bVar2);
                }
                arrayList.add(bVar2);
            } else if (i4 == 2) {
                if (I) {
                    kVar.c(bVar2, bVar);
                }
                arrayList.add(bVar2);
            }
        }
        kVar.d(bVar, b5);
        return arrayList;
    }

    @fg.l
    public static <H> Collection<H> p(@fg.l H h4, @fg.l Collection<H> collection, @fg.l ld.l<H, kotlin.reflect.jvm.internal.impl.descriptors.a> lVar, @fg.l ld.l<H, k2> lVar2) {
        if (h4 == null) {
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
        arrayList.add(h4);
        kotlin.reflect.jvm.internal.impl.descriptors.a invoke = lVar.invoke(h4);
        Iterator<H> it = collection.iterator();
        while (it.hasNext()) {
            H next = it.next();
            kotlin.reflect.jvm.internal.impl.descriptors.a invoke2 = lVar.invoke(next);
            if (h4 == next) {
                it.remove();
            } else {
                i.a x4 = x(invoke, invoke2);
                if (x4 == i.a.OVERRIDABLE) {
                    arrayList.add(next);
                    it.remove();
                } else if (x4 == i.a.CONFLICT) {
                    lVar2.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    @fg.l
    private static Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> q(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar, @fg.l Queue<kotlin.reflect.jvm.internal.impl.descriptors.b> queue, @fg.l k kVar) {
        if (bVar == null) {
            a(104);
        }
        if (queue == null) {
            a(105);
        }
        if (kVar == null) {
            a(106);
        }
        return p(bVar, queue, new f(), new g(kVar, bVar));
    }

    @fg.l
    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.a> Set<D> r(@fg.l Set<D> set) {
        if (set == null) {
            a(8);
        }
        return s(set, !set.isEmpty() && kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.v(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.p(set.iterator().next())), null, new b());
    }

    @fg.l
    public static <D> Set<D> s(@fg.l Set<D> set, boolean z4, @fg.m ld.a<?> aVar, @fg.l ld.p<? super D, ? super D, q0<kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.a>> pVar) {
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
                aVar.invoke();
            }
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    linkedHashSet.add(obj);
                    break;
                }
                q0<kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.a> invoke = pVar.invoke(obj, (Object) it.next());
                kotlin.reflect.jvm.internal.impl.descriptors.a a5 = invoke.a();
                kotlin.reflect.jvm.internal.impl.descriptors.a b5 = invoke.b();
                if (!J(a5, b5, z4, true)) {
                    if (J(b5, a5, z4, true)) {
                        break;
                    }
                } else {
                    it.remove();
                }
            }
        }
        return linkedHashSet;
    }

    @fg.l
    public static Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> t(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @fg.l Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> collection) {
        if (eVar == null) {
            a(96);
        }
        if (collection == null) {
            a(97);
        }
        List m22 = w.m2(collection, new e(eVar));
        if (m22 == null) {
            a(98);
        }
        return m22;
    }

    @fg.m
    public static u u(@fg.l Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> collection) {
        u uVar;
        if (collection == null) {
            a(109);
        }
        if (collection.isEmpty()) {
            return kotlin.reflect.jvm.internal.impl.descriptors.t.f76297l;
        }
        Iterator<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> it = collection.iterator();
        loop0: while (true) {
            uVar = null;
            while (it.hasNext()) {
                u visibility = it.next().getVisibility();
                if (uVar != null) {
                    Integer d5 = kotlin.reflect.jvm.internal.impl.descriptors.t.d(visibility, uVar);
                    if (d5 == null) {
                        break;
                    }
                    if (d5.intValue() > 0) {
                    }
                }
                uVar = visibility;
            }
        }
        if (uVar == null) {
            return null;
        }
        Iterator<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> it2 = collection.iterator();
        while (it2.hasNext()) {
            Integer d6 = kotlin.reflect.jvm.internal.impl.descriptors.t.d(uVar, it2.next().getVisibility());
            if (d6 == null || d6.intValue() < 0) {
                return null;
            }
        }
        return uVar;
    }

    @fg.m
    public static i w(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
        boolean z4;
        if (aVar == null) {
            a(40);
        }
        if (aVar2 == null) {
            a(41);
        }
        boolean z5 = aVar instanceof z;
        if ((z5 && !(aVar2 instanceof z)) || (((z4 = aVar instanceof u0)) && !(aVar2 instanceof u0))) {
            return i.d(ProtectedSandApp.s("穎\u0001"));
        }
        if (!z5 && !z4) {
            throw new IllegalArgumentException(ProtectedSandApp.s("穏\u0001") + aVar);
        }
        if (!aVar.getName().equals(aVar2.getName())) {
            return i.d(ProtectedSandApp.s("穐\u0001"));
        }
        i e4 = e(aVar, aVar2);
        if (e4 != null) {
            return e4;
        }
        return null;
    }

    @fg.m
    public static i.a x(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
        l lVar = f77929f;
        i.a c5 = lVar.D(aVar2, aVar, null).c();
        i.a c6 = lVar.D(aVar, aVar2, null).c();
        i.a aVar3 = i.a.OVERRIDABLE;
        if (c5 == aVar3 && c6 == aVar3) {
            return aVar3;
        }
        i.a aVar4 = i.a.CONFLICT;
        return (c5 == aVar4 || c6 == aVar4) ? aVar4 : i.a.INCOMPATIBLE;
    }

    @fg.l
    private static e0 y(@fg.l Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> collection, boolean z4, @fg.l e0 e0Var) {
        if (collection == null) {
            a(93);
        }
        if (e0Var == null) {
            a(94);
        }
        e0 e0Var2 = e0.ABSTRACT;
        for (kotlin.reflect.jvm.internal.impl.descriptors.b bVar : collection) {
            e0 u4 = (z4 && bVar.u() == e0.ABSTRACT) ? e0Var : bVar.u();
            if (u4.compareTo(e0Var2) < 0) {
                e0Var2 = u4;
            }
        }
        if (e0Var2 == null) {
            a(95);
        }
        return e0Var2;
    }

    @fg.l
    public static Set<kotlin.reflect.jvm.internal.impl.descriptors.b> z(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        if (bVar == null) {
            a(15);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        f(bVar, linkedHashSet);
        return linkedHashSet;
    }

    @fg.l
    public i D(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, @fg.m kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
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

    @fg.l
    public i E(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, @fg.m kotlin.reflect.jvm.internal.impl.descriptors.e eVar, boolean z4) {
        if (aVar == null) {
            a(22);
        }
        if (aVar2 == null) {
            a(23);
        }
        i F = F(aVar, aVar2, z4);
        boolean z5 = F.c() == i.a.OVERRIDABLE;
        Iterator<kotlin.reflect.jvm.internal.impl.resolve.g> it = f77928e.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String s4 = ProtectedSandApp.s("穑\u0001");
            String s5 = ProtectedSandApp.s("穒\u0001");
            if (!hasNext) {
                if (!z5) {
                    return F;
                }
                for (kotlin.reflect.jvm.internal.impl.resolve.g gVar : f77928e) {
                    if (gVar.a() == g.a.CONFLICTS_ONLY) {
                        int i4 = h.f77940a[gVar.b(aVar, aVar2, eVar).ordinal()];
                        if (i4 == 1) {
                            throw new IllegalStateException(ProtectedSandApp.s("穓\u0001") + gVar.getClass().getName() + ProtectedSandApp.s("穔\u0001"));
                        }
                        if (i4 == 2) {
                            i b5 = i.b(s4);
                            if (b5 == null) {
                                a(27);
                            }
                            return b5;
                        }
                        if (i4 == 3) {
                            i d5 = i.d(s5);
                            if (d5 == null) {
                                a(28);
                            }
                            return d5;
                        }
                    }
                }
                i e4 = i.e();
                if (e4 == null) {
                    a(29);
                }
                return e4;
            }
            kotlin.reflect.jvm.internal.impl.resolve.g next = it.next();
            if (next.a() != g.a.CONFLICTS_ONLY && (!z5 || next.a() != g.a.SUCCESS_ONLY)) {
                int i5 = h.f77940a[next.b(aVar, aVar2, eVar).ordinal()];
                if (i5 == 1) {
                    z5 = true;
                } else {
                    if (i5 == 2) {
                        i b6 = i.b(s4);
                        if (b6 == null) {
                            a(24);
                        }
                        return b6;
                    }
                    if (i5 == 3) {
                        i d6 = i.d(s5);
                        if (d6 == null) {
                            a(25);
                        }
                        return d6;
                    }
                }
            }
        }
    }

    @fg.l
    public i F(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, boolean z4) {
        if (aVar == null) {
            a(30);
        }
        if (aVar2 == null) {
            a(31);
        }
        i w4 = w(aVar, aVar2);
        if (w4 != null) {
            return w4;
        }
        List<h0> g4 = g(aVar);
        List<h0> g5 = g(aVar2);
        List<f1> typeParameters = aVar.getTypeParameters();
        List<f1> typeParameters2 = aVar2.getTypeParameters();
        int i4 = 0;
        if (typeParameters.size() == typeParameters2.size()) {
            g1 l4 = l(typeParameters, typeParameters2);
            for (int i5 = 0; i5 < typeParameters.size(); i5++) {
                if (!c(typeParameters.get(i5), typeParameters2.get(i5), l4)) {
                    i d5 = i.d(ProtectedSandApp.s("穖\u0001"));
                    if (d5 == null) {
                        a(35);
                    }
                    return d5;
                }
            }
            while (i4 < g4.size()) {
                if (!d(g4.get(i4), g5.get(i4), l4)) {
                    i d6 = i.d(ProtectedSandApp.s("穗\u0001"));
                    if (d6 == null) {
                        a(36);
                    }
                    return d6;
                }
                i4++;
            }
            if ((aVar instanceof z) && (aVar2 instanceof z) && ((z) aVar).isSuspend() != ((z) aVar2).isSuspend()) {
                i b5 = i.b(ProtectedSandApp.s("穘\u0001"));
                if (b5 == null) {
                    a(37);
                }
                return b5;
            }
            if (z4) {
                h0 returnType = aVar.getReturnType();
                h0 returnType2 = aVar2.getReturnType();
                if (returnType != null && returnType2 != null && ((!j0.a(returnType2) || !j0.a(returnType)) && !kotlin.reflect.jvm.internal.impl.types.g.f78427a.r(l4, returnType2.R0(), returnType.R0()))) {
                    i b6 = i.b(ProtectedSandApp.s("穙\u0001"));
                    if (b6 == null) {
                        a(38);
                    }
                    return b6;
                }
            }
            i e4 = i.e();
            if (e4 == null) {
                a(39);
            }
            return e4;
        }
        while (true) {
            int size = g4.size();
            String s4 = ProtectedSandApp.s("穕\u0001");
            if (i4 >= size) {
                i b7 = i.b(s4);
                if (b7 == null) {
                    a(34);
                }
                return b7;
            }
            if (!kotlin.reflect.jvm.internal.impl.types.checker.e.f78349a.b(g4.get(i4), g5.get(i4))) {
                i d7 = i.d(s4);
                if (d7 == null) {
                    a(33);
                }
                return d7;
            }
            i4++;
        }
    }

    public void v(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> collection, @fg.l Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> collection2, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @fg.l k kVar) {
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
        if (kVar == null) {
            a(56);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> it = collection2.iterator();
        while (it.hasNext()) {
            linkedHashSet.removeAll(o(it.next(), collection, eVar, kVar));
        }
        k(eVar, linkedHashSet, kVar);
    }
}
