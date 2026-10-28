package kotlin.reflect.jvm.internal.impl.descriptors;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.n1;
import kotlin.reflect.jvm.internal.impl.util.l;

/* compiled from: DescriptorVisibilities.java */
/* loaded from: classes7.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final u f76286a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    public static final u f76287b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    public static final u f76288c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    public static final u f76289d;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    public static final u f76290e;

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    public static final u f76291f;

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    public static final u f76292g;

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    public static final u f76293h;

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    public static final u f76294i;

    /* renamed from: j, reason: collision with root package name */
    public static final Set<u> f76295j;

    /* renamed from: k, reason: collision with root package name */
    private static final Map<u, Integer> f76296k;

    /* renamed from: l, reason: collision with root package name */
    public static final u f76297l;

    /* renamed from: m, reason: collision with root package name */
    private static final kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h f76298m;

    /* renamed from: n, reason: collision with root package name */
    public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h f76299n;

    /* renamed from: o, reason: collision with root package name */
    @Deprecated
    public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h f76300o;

    /* renamed from: p, reason: collision with root package name */
    @fg.l
    private static final kotlin.reflect.jvm.internal.impl.util.l f76301p;

    /* renamed from: q, reason: collision with root package name */
    @fg.l
    private static final Map<o1, u> f76302q;

    /* compiled from: DescriptorVisibilities.java */
    static class a implements kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h
        @fg.l
        public kotlin.reflect.jvm.internal.impl.types.h0 getType() {
            throw new IllegalStateException(ProtectedSandApp.s("漜\u0001"));
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    static class b implements kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h {
        b() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h
        @fg.l
        public kotlin.reflect.jvm.internal.impl.types.h0 getType() {
            throw new IllegalStateException(ProtectedSandApp.s("漝\u0001"));
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    static class c implements kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h {
        c() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h
        @fg.l
        public kotlin.reflect.jvm.internal.impl.types.h0 getType() {
            throw new IllegalStateException(ProtectedSandApp.s("漞\u0001"));
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    static class d extends r {
        d(o1 o1Var) {
            super(o1Var);
        }

        private static /* synthetic */ void g(int i4) {
            Object[] objArr = new Object[3];
            if (i4 == 1) {
                objArr[0] = ProtectedSandApp.s("漡\u0001");
            } else if (i4 != 2) {
                objArr[0] = ProtectedSandApp.s("漟\u0001");
            } else {
                objArr[0] = ProtectedSandApp.s("漠\u0001");
            }
            objArr[1] = ProtectedSandApp.s("漢\u0001");
            if (i4 == 1 || i4 == 2) {
                objArr[2] = ProtectedSandApp.s("漤\u0001");
            } else {
                objArr[2] = ProtectedSandApp.s("漣\u0001");
            }
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("漥\u0001"), objArr));
        }

        private boolean h(@fg.l m mVar) {
            if (mVar == null) {
                g(0);
            }
            return kotlin.reflect.jvm.internal.impl.resolve.f.j(mVar) != b1.f75928a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.reflect.jvm.internal.impl.descriptors.m, kotlin.reflect.jvm.internal.impl.descriptors.q] */
        /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.reflect.jvm.internal.impl.descriptors.m] */
        /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.reflect.jvm.internal.impl.descriptors.m] */
        /* JADX WARN: Type inference failed for: r4v4, types: [kotlin.reflect.jvm.internal.impl.descriptors.m] */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.u
        public boolean e(@fg.m kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar, @fg.l q qVar, @fg.l m mVar, boolean z4) {
            if (qVar == 0) {
                g(1);
            }
            if (mVar == null) {
                g(2);
            }
            if (kotlin.reflect.jvm.internal.impl.resolve.f.J(qVar) && h(mVar)) {
                return t.f(qVar, mVar);
            }
            if (qVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.l) {
                kotlin.reflect.jvm.internal.impl.descriptors.i c5 = ((kotlin.reflect.jvm.internal.impl.descriptors.l) qVar).c();
                if (z4 && kotlin.reflect.jvm.internal.impl.resolve.f.G(c5) && kotlin.reflect.jvm.internal.impl.resolve.f.J(c5) && (mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.l) && kotlin.reflect.jvm.internal.impl.resolve.f.J(mVar.c()) && t.f(qVar, mVar)) {
                    return true;
                }
            }
            while (qVar != 0) {
                qVar = qVar.c();
                if (((qVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) && !kotlin.reflect.jvm.internal.impl.resolve.f.x(qVar)) || (qVar instanceof l0)) {
                    break;
                }
            }
            if (qVar == 0) {
                return false;
            }
            while (mVar != null) {
                if (qVar == mVar) {
                    return true;
                }
                if (mVar instanceof l0) {
                    return (qVar instanceof l0) && qVar.g().equals(((l0) mVar).g()) && kotlin.reflect.jvm.internal.impl.resolve.f.b(mVar, qVar);
                }
                mVar = mVar.c();
            }
            return false;
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    static class e extends r {
        e(o1 o1Var) {
            super(o1Var);
        }

        private static /* synthetic */ void g(int i4) {
            Object[] objArr = new Object[3];
            if (i4 != 1) {
                objArr[0] = ProtectedSandApp.s("漦\u0001");
            } else {
                objArr[0] = ProtectedSandApp.s("漧\u0001");
            }
            objArr[1] = ProtectedSandApp.s("漨\u0001");
            objArr[2] = ProtectedSandApp.s("漩\u0001");
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("漪\u0001"), objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.u
        public boolean e(@fg.m kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar, @fg.l q qVar, @fg.l m mVar, boolean z4) {
            m q4;
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            if (t.f76286a.e(hVar, qVar, mVar, z4)) {
                if (hVar == t.f76299n) {
                    return true;
                }
                if (hVar != t.f76298m && (q4 = kotlin.reflect.jvm.internal.impl.resolve.f.q(qVar, kotlin.reflect.jvm.internal.impl.descriptors.e.class)) != null && (hVar instanceof kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.j)) {
                    return ((kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.j) hVar).y().a().equals(q4.a());
                }
            }
            return false;
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    static class f extends r {
        f(o1 o1Var) {
            super(o1Var);
        }

        private static /* synthetic */ void g(int i4) {
            Object[] objArr = new Object[3];
            if (i4 == 1) {
                objArr[0] = ProtectedSandApp.s("漮\u0001");
            } else if (i4 == 2) {
                objArr[0] = ProtectedSandApp.s("漭\u0001");
            } else if (i4 != 3) {
                objArr[0] = ProtectedSandApp.s("漫\u0001");
            } else {
                objArr[0] = ProtectedSandApp.s("漬\u0001");
            }
            objArr[1] = ProtectedSandApp.s("漯\u0001");
            if (i4 == 2 || i4 == 3) {
                objArr[2] = ProtectedSandApp.s("漱\u0001");
            } else {
                objArr[2] = ProtectedSandApp.s("漰\u0001");
            }
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("漲\u0001"), objArr));
        }

        private boolean h(@fg.m kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar, @fg.l q qVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
            if (qVar == null) {
                g(2);
            }
            if (eVar == null) {
                g(3);
            }
            if (hVar == t.f76300o) {
                return false;
            }
            if (!(qVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.b) || (qVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.l) || hVar == t.f76299n) {
                return true;
            }
            if (hVar == t.f76298m || hVar == null) {
                return false;
            }
            kotlin.reflect.jvm.internal.impl.types.h0 b5 = hVar instanceof kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.i ? ((kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.i) hVar).b() : hVar.getType();
            return kotlin.reflect.jvm.internal.impl.resolve.f.I(b5, eVar) || kotlin.reflect.jvm.internal.impl.types.x.a(b5);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.u
        public boolean e(@fg.m kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar, @fg.l q qVar, @fg.l m mVar, boolean z4) {
            kotlin.reflect.jvm.internal.impl.descriptors.e eVar;
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            kotlin.reflect.jvm.internal.impl.descriptors.e eVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.e) kotlin.reflect.jvm.internal.impl.resolve.f.q(qVar, kotlin.reflect.jvm.internal.impl.descriptors.e.class);
            kotlin.reflect.jvm.internal.impl.descriptors.e eVar3 = (kotlin.reflect.jvm.internal.impl.descriptors.e) kotlin.reflect.jvm.internal.impl.resolve.f.r(mVar, kotlin.reflect.jvm.internal.impl.descriptors.e.class, false);
            if (eVar3 == null) {
                return false;
            }
            if (eVar2 != null && kotlin.reflect.jvm.internal.impl.resolve.f.x(eVar2) && (eVar = (kotlin.reflect.jvm.internal.impl.descriptors.e) kotlin.reflect.jvm.internal.impl.resolve.f.q(eVar2, kotlin.reflect.jvm.internal.impl.descriptors.e.class)) != null && kotlin.reflect.jvm.internal.impl.resolve.f.H(eVar3, eVar)) {
                return true;
            }
            q M = kotlin.reflect.jvm.internal.impl.resolve.f.M(qVar);
            kotlin.reflect.jvm.internal.impl.descriptors.e eVar4 = (kotlin.reflect.jvm.internal.impl.descriptors.e) kotlin.reflect.jvm.internal.impl.resolve.f.q(M, kotlin.reflect.jvm.internal.impl.descriptors.e.class);
            if (eVar4 == null) {
                return false;
            }
            if (kotlin.reflect.jvm.internal.impl.resolve.f.H(eVar3, eVar4) && h(hVar, M, eVar3)) {
                return true;
            }
            return e(hVar, qVar, eVar3.c(), z4);
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    static class g extends r {
        g(o1 o1Var) {
            super(o1Var);
        }

        private static /* synthetic */ void g(int i4) {
            Object[] objArr = new Object[3];
            if (i4 != 1) {
                objArr[0] = ProtectedSandApp.s("漳\u0001");
            } else {
                objArr[0] = ProtectedSandApp.s("漴\u0001");
            }
            objArr[1] = ProtectedSandApp.s("漵\u0001");
            objArr[2] = ProtectedSandApp.s("漶\u0001");
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("漷\u0001"), objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.u
        public boolean e(@fg.m kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar, @fg.l q qVar, @fg.l m mVar, boolean z4) {
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            if (kotlin.reflect.jvm.internal.impl.resolve.f.g(mVar).N(kotlin.reflect.jvm.internal.impl.resolve.f.g(qVar))) {
                return t.f76301p.a(qVar, mVar);
            }
            return false;
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    static class h extends r {
        h(o1 o1Var) {
            super(o1Var);
        }

        private static /* synthetic */ void g(int i4) {
            Object[] objArr = new Object[3];
            if (i4 != 1) {
                objArr[0] = ProtectedSandApp.s("漸\u0001");
            } else {
                objArr[0] = ProtectedSandApp.s("漹\u0001");
            }
            objArr[1] = ProtectedSandApp.s("漺\u0001");
            objArr[2] = ProtectedSandApp.s("漻\u0001");
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("漼\u0001"), objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.u
        public boolean e(@fg.m kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar, @fg.l q qVar, @fg.l m mVar, boolean z4) {
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            return true;
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    static class i extends r {
        i(o1 o1Var) {
            super(o1Var);
        }

        private static /* synthetic */ void g(int i4) {
            Object[] objArr = new Object[3];
            if (i4 != 1) {
                objArr[0] = ProtectedSandApp.s("漽\u0001");
            } else {
                objArr[0] = ProtectedSandApp.s("漾\u0001");
            }
            objArr[1] = ProtectedSandApp.s("漿\u0001");
            objArr[2] = ProtectedSandApp.s("潀\u0001");
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("潁\u0001"), objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.u
        public boolean e(@fg.m kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar, @fg.l q qVar, @fg.l m mVar, boolean z4) {
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            throw new IllegalStateException(ProtectedSandApp.s("潂\u0001"));
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    static class j extends r {
        j(o1 o1Var) {
            super(o1Var);
        }

        private static /* synthetic */ void g(int i4) {
            Object[] objArr = new Object[3];
            if (i4 != 1) {
                objArr[0] = ProtectedSandApp.s("潃\u0001");
            } else {
                objArr[0] = ProtectedSandApp.s("潄\u0001");
            }
            objArr[1] = ProtectedSandApp.s("潅\u0001");
            objArr[2] = ProtectedSandApp.s("潆\u0001");
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("潇\u0001"), objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.u
        public boolean e(@fg.m kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar, @fg.l q qVar, @fg.l m mVar, boolean z4) {
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            throw new IllegalStateException(ProtectedSandApp.s("潈\u0001"));
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    static class k extends r {
        k(o1 o1Var) {
            super(o1Var);
        }

        private static /* synthetic */ void g(int i4) {
            Object[] objArr = new Object[3];
            if (i4 != 1) {
                objArr[0] = ProtectedSandApp.s("潉\u0001");
            } else {
                objArr[0] = ProtectedSandApp.s("潊\u0001");
            }
            objArr[1] = ProtectedSandApp.s("潋\u0001");
            objArr[2] = ProtectedSandApp.s("潌\u0001");
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("潍\u0001"), objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.u
        public boolean e(@fg.m kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar, @fg.l q qVar, @fg.l m mVar, boolean z4) {
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            return false;
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    static class l extends r {
        l(o1 o1Var) {
            super(o1Var);
        }

        private static /* synthetic */ void g(int i4) {
            Object[] objArr = new Object[3];
            if (i4 != 1) {
                objArr[0] = ProtectedSandApp.s("潎\u0001");
            } else {
                objArr[0] = ProtectedSandApp.s("潏\u0001");
            }
            objArr[1] = ProtectedSandApp.s("潐\u0001");
            objArr[2] = ProtectedSandApp.s("潑\u0001");
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("潒\u0001"), objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.u
        public boolean e(@fg.m kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar, @fg.l q qVar, @fg.l m mVar, boolean z4) {
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            return false;
        }
    }

    static {
        d dVar = new d(n1.e.f76196c);
        f76286a = dVar;
        e eVar = new e(n1.f.f76197c);
        f76287b = eVar;
        f fVar = new f(n1.g.f76198c);
        f76288c = fVar;
        g gVar = new g(n1.b.f76193c);
        f76289d = gVar;
        h hVar = new h(n1.h.f76199c);
        f76290e = hVar;
        i iVar = new i(n1.d.f76195c);
        f76291f = iVar;
        j jVar = new j(n1.a.f76192c);
        f76292g = jVar;
        k kVar = new k(n1.c.f76194c);
        f76293h = kVar;
        l lVar = new l(n1.i.f76200c);
        f76294i = lVar;
        f76295j = Collections.unmodifiableSet(kotlin.collections.l1.u(dVar, eVar, gVar, iVar));
        HashMap e4 = kotlin.reflect.jvm.internal.impl.utils.a.e(4);
        e4.put(eVar, 0);
        e4.put(dVar, 0);
        e4.put(gVar, 1);
        e4.put(fVar, 1);
        e4.put(hVar, 2);
        f76296k = Collections.unmodifiableMap(e4);
        f76297l = hVar;
        f76298m = new a();
        f76299n = new b();
        f76300o = new c();
        Iterator it = ServiceLoader.load(kotlin.reflect.jvm.internal.impl.util.l.class, kotlin.reflect.jvm.internal.impl.util.l.class.getClassLoader()).iterator();
        f76301p = it.hasNext() ? (kotlin.reflect.jvm.internal.impl.util.l) it.next() : l.a.f78607a;
        f76302q = new HashMap();
        i(dVar);
        i(eVar);
        i(fVar);
        i(gVar);
        i(hVar);
        i(iVar);
        i(jVar);
        i(kVar);
        i(lVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void a(int r8) {
        /*
            r0 = 16
            if (r8 == r0) goto Lb
            java.lang.String r1 = "潓\u0001"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            goto L11
        Lb:
            java.lang.String r1 = "潔\u0001"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
        L11:
            r2 = 3
            r3 = 2
            if (r8 == r0) goto L17
            r4 = r2
            goto L18
        L17:
            r4 = r3
        L18:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "潕\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
            r6 = 1
            r7 = 0
            if (r8 == r6) goto L56
            if (r8 == r2) goto L56
            r2 = 5
            if (r8 == r2) goto L56
            r2 = 7
            if (r8 == r2) goto L56
            switch(r8) {
                case 9: goto L56;
                case 10: goto L4d;
                case 11: goto L44;
                case 12: goto L4d;
                case 13: goto L44;
                case 14: goto L3b;
                case 15: goto L3b;
                case 16: goto L38;
                default: goto L2f;
            }
        L2f:
            java.lang.String r2 = "潖\u0001"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
            r4[r7] = r2
            goto L5e
        L38:
            r4[r7] = r5
            goto L5e
        L3b:
            java.lang.String r2 = "潗\u0001"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
            r4[r7] = r2
            goto L5e
        L44:
            java.lang.String r2 = "潘\u0001"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
            r4[r7] = r2
            goto L5e
        L4d:
            java.lang.String r2 = "潙\u0001"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
            r4[r7] = r2
            goto L5e
        L56:
            java.lang.String r2 = "潚\u0001"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
            r4[r7] = r2
        L5e:
            java.lang.String r2 = "潛\u0001"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
            if (r8 == r0) goto L69
            r4[r6] = r5
            goto L6b
        L69:
            r4[r6] = r2
        L6b:
            switch(r8) {
                case 2: goto Lb0;
                case 3: goto Lb0;
                case 4: goto La7;
                case 5: goto La7;
                case 6: goto L9e;
                case 7: goto L9e;
                case 8: goto L95;
                case 9: goto L95;
                case 10: goto L8c;
                case 11: goto L8c;
                case 12: goto L83;
                case 13: goto L83;
                case 14: goto L7a;
                case 15: goto L77;
                case 16: goto Lb8;
                default: goto L6e;
            }
        L6e:
            java.lang.String r2 = "潜\u0001"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
            r4[r3] = r2
            goto Lb8
        L77:
            r4[r3] = r2
            goto Lb8
        L7a:
            java.lang.String r2 = "潝\u0001"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
            r4[r3] = r2
            goto Lb8
        L83:
            java.lang.String r2 = "潞\u0001"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
            r4[r3] = r2
            goto Lb8
        L8c:
            java.lang.String r2 = "潟\u0001"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
            r4[r3] = r2
            goto Lb8
        L95:
            java.lang.String r2 = "潠\u0001"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
            r4[r3] = r2
            goto Lb8
        L9e:
            java.lang.String r2 = "潡\u0001"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
            r4[r3] = r2
            goto Lb8
        La7:
            java.lang.String r2 = "潢\u0001"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
            r4[r3] = r2
            goto Lb8
        Lb0:
            java.lang.String r2 = "潣\u0001"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
            r4[r3] = r2
        Lb8:
            java.lang.String r1 = java.lang.String.format(r1, r4)
            if (r8 == r0) goto Lc4
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r1)
            goto Lc9
        Lc4:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
        Lc9:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.t.a(int):void");
    }

    @fg.m
    public static Integer d(@fg.l u uVar, @fg.l u uVar2) {
        if (uVar == null) {
            a(12);
        }
        if (uVar2 == null) {
            a(13);
        }
        Integer a5 = uVar.a(uVar2);
        if (a5 != null) {
            return a5;
        }
        Integer a6 = uVar2.a(uVar);
        if (a6 != null) {
            return Integer.valueOf(-a6.intValue());
        }
        return null;
    }

    @fg.m
    public static q e(@fg.m kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar, @fg.l q qVar, @fg.l m mVar, boolean z4) {
        q e4;
        if (qVar == null) {
            a(8);
        }
        if (mVar == null) {
            a(9);
        }
        for (q qVar2 = (q) qVar.a(); qVar2 != null && qVar2.getVisibility() != f76291f; qVar2 = (q) kotlin.reflect.jvm.internal.impl.resolve.f.q(qVar2, q.class)) {
            if (!qVar2.getVisibility().e(hVar, qVar2, mVar, z4)) {
                return qVar2;
            }
        }
        if (!(qVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.impl.i0) || (e4 = e(hVar, ((kotlin.reflect.jvm.internal.impl.descriptors.impl.i0) qVar).V(), mVar, z4)) == null) {
            return null;
        }
        return e4;
    }

    public static boolean f(@fg.l m mVar, @fg.l m mVar2) {
        if (mVar == null) {
            a(6);
        }
        if (mVar2 == null) {
            a(7);
        }
        b1 j4 = kotlin.reflect.jvm.internal.impl.resolve.f.j(mVar2);
        if (j4 != b1.f75928a) {
            return j4.equals(kotlin.reflect.jvm.internal.impl.resolve.f.j(mVar));
        }
        return false;
    }

    public static boolean g(@fg.l u uVar) {
        if (uVar == null) {
            a(14);
        }
        return uVar == f76286a || uVar == f76287b;
    }

    public static boolean h(@fg.l q qVar, @fg.l m mVar, boolean z4) {
        if (qVar == null) {
            a(2);
        }
        if (mVar == null) {
            a(3);
        }
        return e(f76299n, qVar, mVar, z4) == null;
    }

    private static void i(u uVar) {
        f76302q.put(uVar.b(), uVar);
    }

    @fg.l
    public static u j(@fg.l o1 o1Var) {
        if (o1Var == null) {
            a(15);
        }
        u uVar = f76302q.get(o1Var);
        if (uVar != null) {
            return uVar;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("潤\u0001") + o1Var);
    }
}
