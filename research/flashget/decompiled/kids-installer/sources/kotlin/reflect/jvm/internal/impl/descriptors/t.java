package kotlin.reflect.jvm.internal.impl.descriptors;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.collections.q1;
import kotlin.reflect.jvm.internal.impl.descriptors.n1;
import kotlin.reflect.jvm.internal.impl.util.l;

/* compiled from: DescriptorVisibilities.java */
/* loaded from: classes5.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final u f24436a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    public static final u f24437b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    public static final u f24438c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    public static final u f24439d;

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    public static final u f24440e;

    /* renamed from: f, reason: collision with root package name */
    @d5.d
    public static final u f24441f;

    /* renamed from: g, reason: collision with root package name */
    @d5.d
    public static final u f24442g;

    /* renamed from: h, reason: collision with root package name */
    @d5.d
    public static final u f24443h;

    /* renamed from: i, reason: collision with root package name */
    @d5.d
    public static final u f24444i;

    /* renamed from: j, reason: collision with root package name */
    public static final Set<u> f24445j;

    /* renamed from: k, reason: collision with root package name */
    private static final Map<u, Integer> f24446k;

    /* renamed from: l, reason: collision with root package name */
    public static final u f24447l;

    /* renamed from: m, reason: collision with root package name */
    private static final kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h f24448m;

    /* renamed from: n, reason: collision with root package name */
    public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h f24449n;

    /* renamed from: o, reason: collision with root package name */
    @Deprecated
    public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h f24450o;

    /* renamed from: p, reason: collision with root package name */
    @d5.d
    private static final kotlin.reflect.jvm.internal.impl.util.l f24451p;

    /* renamed from: q, reason: collision with root package name */
    @d5.d
    private static final Map<o1, u> f24452q;

    /* compiled from: DescriptorVisibilities.java */
    static class a implements kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h
        @d5.d
        public kotlin.reflect.jvm.internal.impl.types.h0 getType() {
            throw new IllegalStateException(ProtectedSandApp.s("䢽"));
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    static class b implements kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h {
        b() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h
        @d5.d
        public kotlin.reflect.jvm.internal.impl.types.h0 getType() {
            throw new IllegalStateException(ProtectedSandApp.s("䢾"));
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    static class c implements kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h {
        c() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h
        @d5.d
        public kotlin.reflect.jvm.internal.impl.types.h0 getType() {
            throw new IllegalStateException(ProtectedSandApp.s("䢿"));
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* loaded from: classes6.dex */
    static class d extends r {
        d(o1 o1Var) {
            super(o1Var);
        }

        private static /* synthetic */ void g(int i5) {
            Object[] objArr = new Object[3];
            if (i5 == 1) {
                objArr[0] = ProtectedSandApp.s("菁");
            } else if (i5 != 2) {
                objArr[0] = ProtectedSandApp.s("莿");
            } else {
                objArr[0] = ProtectedSandApp.s("菀");
            }
            objArr[1] = ProtectedSandApp.s("菂");
            if (i5 == 1 || i5 == 2) {
                objArr[2] = ProtectedSandApp.s("菄");
            } else {
                objArr[2] = ProtectedSandApp.s("菃");
            }
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("菅"), objArr));
        }

        private boolean h(@d5.d m mVar) {
            if (mVar == null) {
                g(0);
            }
            return kotlin.reflect.jvm.internal.impl.resolve.e.j(mVar) != b1.f24130a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.reflect.jvm.internal.impl.descriptors.m, kotlin.reflect.jvm.internal.impl.descriptors.q] */
        /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.reflect.jvm.internal.impl.descriptors.m] */
        /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.reflect.jvm.internal.impl.descriptors.m] */
        /* JADX WARN: Type inference failed for: r4v4, types: [kotlin.reflect.jvm.internal.impl.descriptors.m] */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.u
        public boolean e(@d5.e kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar, @d5.d q qVar, @d5.d m mVar, boolean z5) {
            if (qVar == 0) {
                g(1);
            }
            if (mVar == null) {
                g(2);
            }
            if (kotlin.reflect.jvm.internal.impl.resolve.e.J(qVar) && h(mVar)) {
                return t.f(qVar, mVar);
            }
            if (qVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.l) {
                kotlin.reflect.jvm.internal.impl.descriptors.i b6 = ((kotlin.reflect.jvm.internal.impl.descriptors.l) qVar).b();
                if (z5 && kotlin.reflect.jvm.internal.impl.resolve.e.G(b6) && kotlin.reflect.jvm.internal.impl.resolve.e.J(b6) && (mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.l) && kotlin.reflect.jvm.internal.impl.resolve.e.J(mVar.b()) && t.f(qVar, mVar)) {
                    return true;
                }
            }
            while (qVar != 0) {
                qVar = qVar.b();
                if (((qVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) && !kotlin.reflect.jvm.internal.impl.resolve.e.x(qVar)) || (qVar instanceof l0)) {
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
                    return (qVar instanceof l0) && qVar.f().equals(((l0) mVar).f()) && kotlin.reflect.jvm.internal.impl.resolve.e.b(mVar, qVar);
                }
                mVar = mVar.b();
            }
            return false;
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* loaded from: classes6.dex */
    static class e extends r {
        e(o1 o1Var) {
            super(o1Var);
        }

        private static /* synthetic */ void g(int i5) {
            Object[] objArr = new Object[3];
            if (i5 != 1) {
                objArr[0] = ProtectedSandApp.s("菆");
            } else {
                objArr[0] = ProtectedSandApp.s("菇");
            }
            objArr[1] = ProtectedSandApp.s("菈");
            objArr[2] = ProtectedSandApp.s("菉");
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("菊"), objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.u
        public boolean e(@d5.e kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar, @d5.d q qVar, @d5.d m mVar, boolean z5) {
            m q5;
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            if (t.f24436a.e(hVar, qVar, mVar, z5)) {
                if (hVar == t.f24449n) {
                    return true;
                }
                if (hVar != t.f24448m && (q5 = kotlin.reflect.jvm.internal.impl.resolve.e.q(qVar, kotlin.reflect.jvm.internal.impl.descriptors.e.class)) != null && (hVar instanceof kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.j)) {
                    return ((kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.j) hVar).D().a().equals(q5.a());
                }
            }
            return false;
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* loaded from: classes6.dex */
    static class f extends r {
        f(o1 o1Var) {
            super(o1Var);
        }

        private static /* synthetic */ void g(int i5) {
            Object[] objArr = new Object[3];
            if (i5 == 1) {
                objArr[0] = ProtectedSandApp.s("菎");
            } else if (i5 == 2) {
                objArr[0] = ProtectedSandApp.s("菍");
            } else if (i5 != 3) {
                objArr[0] = ProtectedSandApp.s("菋");
            } else {
                objArr[0] = ProtectedSandApp.s("菌");
            }
            objArr[1] = ProtectedSandApp.s("菏");
            if (i5 == 2 || i5 == 3) {
                objArr[2] = ProtectedSandApp.s("菑");
            } else {
                objArr[2] = ProtectedSandApp.s("菐");
            }
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("菒"), objArr));
        }

        private boolean h(@d5.e kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar, @d5.d q qVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
            if (qVar == null) {
                g(2);
            }
            if (eVar == null) {
                g(3);
            }
            if (hVar == t.f24450o) {
                return false;
            }
            if (!(qVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.b) || (qVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.l) || hVar == t.f24449n) {
                return true;
            }
            if (hVar == t.f24448m || hVar == null) {
                return false;
            }
            kotlin.reflect.jvm.internal.impl.types.h0 b6 = hVar instanceof kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.i ? ((kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.i) hVar).b() : hVar.getType();
            return kotlin.reflect.jvm.internal.impl.resolve.e.I(b6, eVar) || kotlin.reflect.jvm.internal.impl.types.x.a(b6);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.u
        public boolean e(@d5.e kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar, @d5.d q qVar, @d5.d m mVar, boolean z5) {
            kotlin.reflect.jvm.internal.impl.descriptors.e eVar;
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            kotlin.reflect.jvm.internal.impl.descriptors.e eVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.e) kotlin.reflect.jvm.internal.impl.resolve.e.q(qVar, kotlin.reflect.jvm.internal.impl.descriptors.e.class);
            kotlin.reflect.jvm.internal.impl.descriptors.e eVar3 = (kotlin.reflect.jvm.internal.impl.descriptors.e) kotlin.reflect.jvm.internal.impl.resolve.e.r(mVar, kotlin.reflect.jvm.internal.impl.descriptors.e.class, false);
            if (eVar3 == null) {
                return false;
            }
            if (eVar2 != null && kotlin.reflect.jvm.internal.impl.resolve.e.x(eVar2) && (eVar = (kotlin.reflect.jvm.internal.impl.descriptors.e) kotlin.reflect.jvm.internal.impl.resolve.e.q(eVar2, kotlin.reflect.jvm.internal.impl.descriptors.e.class)) != null && kotlin.reflect.jvm.internal.impl.resolve.e.H(eVar3, eVar)) {
                return true;
            }
            q M = kotlin.reflect.jvm.internal.impl.resolve.e.M(qVar);
            kotlin.reflect.jvm.internal.impl.descriptors.e eVar4 = (kotlin.reflect.jvm.internal.impl.descriptors.e) kotlin.reflect.jvm.internal.impl.resolve.e.q(M, kotlin.reflect.jvm.internal.impl.descriptors.e.class);
            if (eVar4 == null) {
                return false;
            }
            if (kotlin.reflect.jvm.internal.impl.resolve.e.H(eVar3, eVar4) && h(hVar, M, eVar3)) {
                return true;
            }
            return e(hVar, qVar, eVar3.b(), z5);
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* loaded from: classes6.dex */
    static class g extends r {
        g(o1 o1Var) {
            super(o1Var);
        }

        private static /* synthetic */ void g(int i5) {
            Object[] objArr = new Object[3];
            if (i5 != 1) {
                objArr[0] = ProtectedSandApp.s("菓");
            } else {
                objArr[0] = ProtectedSandApp.s("菔");
            }
            objArr[1] = ProtectedSandApp.s("菕");
            objArr[2] = ProtectedSandApp.s("菖");
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("菗"), objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.u
        public boolean e(@d5.e kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar, @d5.d q qVar, @d5.d m mVar, boolean z5) {
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            if (kotlin.reflect.jvm.internal.impl.resolve.e.g(mVar).l0(kotlin.reflect.jvm.internal.impl.resolve.e.g(qVar))) {
                return t.f24451p.a(qVar, mVar);
            }
            return false;
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* loaded from: classes6.dex */
    static class h extends r {
        h(o1 o1Var) {
            super(o1Var);
        }

        private static /* synthetic */ void g(int i5) {
            Object[] objArr = new Object[3];
            if (i5 != 1) {
                objArr[0] = ProtectedSandApp.s("菘");
            } else {
                objArr[0] = ProtectedSandApp.s("菙");
            }
            objArr[1] = ProtectedSandApp.s("菚");
            objArr[2] = ProtectedSandApp.s("菛");
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("菜"), objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.u
        public boolean e(@d5.e kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar, @d5.d q qVar, @d5.d m mVar, boolean z5) {
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
    /* loaded from: classes6.dex */
    static class i extends r {
        i(o1 o1Var) {
            super(o1Var);
        }

        private static /* synthetic */ void g(int i5) {
            Object[] objArr = new Object[3];
            if (i5 != 1) {
                objArr[0] = ProtectedSandApp.s("菝");
            } else {
                objArr[0] = ProtectedSandApp.s("菞");
            }
            objArr[1] = ProtectedSandApp.s("菟");
            objArr[2] = ProtectedSandApp.s("菠");
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("菡"), objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.u
        public boolean e(@d5.e kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar, @d5.d q qVar, @d5.d m mVar, boolean z5) {
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            throw new IllegalStateException(ProtectedSandApp.s("菢"));
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* loaded from: classes6.dex */
    static class j extends r {
        j(o1 o1Var) {
            super(o1Var);
        }

        private static /* synthetic */ void g(int i5) {
            Object[] objArr = new Object[3];
            if (i5 != 1) {
                objArr[0] = ProtectedSandApp.s("菣");
            } else {
                objArr[0] = ProtectedSandApp.s("菤");
            }
            objArr[1] = ProtectedSandApp.s("菥");
            objArr[2] = ProtectedSandApp.s("菦");
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("菧"), objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.u
        public boolean e(@d5.e kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar, @d5.d q qVar, @d5.d m mVar, boolean z5) {
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            throw new IllegalStateException(ProtectedSandApp.s("菨"));
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* loaded from: classes6.dex */
    static class k extends r {
        k(o1 o1Var) {
            super(o1Var);
        }

        private static /* synthetic */ void g(int i5) {
            Object[] objArr = new Object[3];
            if (i5 != 1) {
                objArr[0] = ProtectedSandApp.s("菩");
            } else {
                objArr[0] = ProtectedSandApp.s("菪");
            }
            objArr[1] = ProtectedSandApp.s("菫");
            objArr[2] = ProtectedSandApp.s("菬");
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("菭"), objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.u
        public boolean e(@d5.e kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar, @d5.d q qVar, @d5.d m mVar, boolean z5) {
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
    /* loaded from: classes6.dex */
    static class l extends r {
        l(o1 o1Var) {
            super(o1Var);
        }

        private static /* synthetic */ void g(int i5) {
            Object[] objArr = new Object[3];
            if (i5 != 1) {
                objArr[0] = ProtectedSandApp.s("菮");
            } else {
                objArr[0] = ProtectedSandApp.s("華");
            }
            objArr[1] = ProtectedSandApp.s("菰");
            objArr[2] = ProtectedSandApp.s("菱");
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("菲"), objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.u
        public boolean e(@d5.e kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar, @d5.d q qVar, @d5.d m mVar, boolean z5) {
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
        Set u5;
        d dVar = new d(n1.e.f24346c);
        f24436a = dVar;
        e eVar = new e(n1.f.f24347c);
        f24437b = eVar;
        f fVar = new f(n1.g.f24348c);
        f24438c = fVar;
        g gVar = new g(n1.b.f24343c);
        f24439d = gVar;
        h hVar = new h(n1.h.f24349c);
        f24440e = hVar;
        i iVar = new i(n1.d.f24345c);
        f24441f = iVar;
        j jVar = new j(n1.a.f24342c);
        f24442g = jVar;
        k kVar = new k(n1.c.f24344c);
        f24443h = kVar;
        l lVar = new l(n1.i.f24350c);
        f24444i = lVar;
        u5 = q1.u(dVar, eVar, gVar, iVar);
        f24445j = Collections.unmodifiableSet(u5);
        HashMap e6 = kotlin.reflect.jvm.internal.impl.utils.a.e(4);
        e6.put(eVar, 0);
        e6.put(dVar, 0);
        e6.put(gVar, 1);
        e6.put(fVar, 1);
        e6.put(hVar, 2);
        f24446k = Collections.unmodifiableMap(e6);
        f24447l = hVar;
        f24448m = new a();
        f24449n = new b();
        f24450o = new c();
        Iterator it = ServiceLoader.load(kotlin.reflect.jvm.internal.impl.util.l.class, kotlin.reflect.jvm.internal.impl.util.l.class.getClassLoader()).iterator();
        f24451p = it.hasNext() ? (kotlin.reflect.jvm.internal.impl.util.l) it.next() : l.a.f26599a;
        f24452q = new HashMap();
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
            java.lang.String r1 = "䣀"
            java.lang.String r1 = com.flashget.kidsdownloader.ProtectedSandApp.s(r1)
            goto L11
        Lb:
            java.lang.String r1 = "䣁"
            java.lang.String r1 = com.flashget.kidsdownloader.ProtectedSandApp.s(r1)
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
            java.lang.String r5 = "䣂"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
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
            java.lang.String r2 = "䣃"
            java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)
            r4[r7] = r2
            goto L5e
        L38:
            r4[r7] = r5
            goto L5e
        L3b:
            java.lang.String r2 = "䣄"
            java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)
            r4[r7] = r2
            goto L5e
        L44:
            java.lang.String r2 = "䣅"
            java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)
            r4[r7] = r2
            goto L5e
        L4d:
            java.lang.String r2 = "䣆"
            java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)
            r4[r7] = r2
            goto L5e
        L56:
            java.lang.String r2 = "䣇"
            java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)
            r4[r7] = r2
        L5e:
            java.lang.String r2 = "䣈"
            java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)
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
            java.lang.String r2 = "䣉"
            java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)
            r4[r3] = r2
            goto Lb8
        L77:
            r4[r3] = r2
            goto Lb8
        L7a:
            java.lang.String r2 = "䣊"
            java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)
            r4[r3] = r2
            goto Lb8
        L83:
            java.lang.String r2 = "䣋"
            java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)
            r4[r3] = r2
            goto Lb8
        L8c:
            java.lang.String r2 = "䣌"
            java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)
            r4[r3] = r2
            goto Lb8
        L95:
            java.lang.String r2 = "䣍"
            java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)
            r4[r3] = r2
            goto Lb8
        L9e:
            java.lang.String r2 = "䣎"
            java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)
            r4[r3] = r2
            goto Lb8
        La7:
            java.lang.String r2 = "䣏"
            java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)
            r4[r3] = r2
            goto Lb8
        Lb0:
            java.lang.String r2 = "䣐"
            java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)
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

    @d5.e
    public static Integer d(@d5.d u uVar, @d5.d u uVar2) {
        if (uVar == null) {
            a(12);
        }
        if (uVar2 == null) {
            a(13);
        }
        Integer a6 = uVar.a(uVar2);
        if (a6 != null) {
            return a6;
        }
        Integer a7 = uVar2.a(uVar);
        if (a7 != null) {
            return Integer.valueOf(-a7.intValue());
        }
        return null;
    }

    @d5.e
    public static q e(@d5.e kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar, @d5.d q qVar, @d5.d m mVar, boolean z5) {
        q e6;
        if (qVar == null) {
            a(8);
        }
        if (mVar == null) {
            a(9);
        }
        for (q qVar2 = (q) qVar.a(); qVar2 != null && qVar2.c() != f24441f; qVar2 = (q) kotlin.reflect.jvm.internal.impl.resolve.e.q(qVar2, q.class)) {
            if (!qVar2.c().e(hVar, qVar2, mVar, z5)) {
                return qVar2;
            }
        }
        if (!(qVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.impl.i0) || (e6 = e(hVar, ((kotlin.reflect.jvm.internal.impl.descriptors.impl.i0) qVar).w0(), mVar, z5)) == null) {
            return null;
        }
        return e6;
    }

    public static boolean f(@d5.d m mVar, @d5.d m mVar2) {
        if (mVar == null) {
            a(6);
        }
        if (mVar2 == null) {
            a(7);
        }
        b1 j5 = kotlin.reflect.jvm.internal.impl.resolve.e.j(mVar2);
        if (j5 != b1.f24130a) {
            return j5.equals(kotlin.reflect.jvm.internal.impl.resolve.e.j(mVar));
        }
        return false;
    }

    public static boolean g(@d5.d u uVar) {
        if (uVar == null) {
            a(14);
        }
        return uVar == f24436a || uVar == f24437b;
    }

    public static boolean h(@d5.d q qVar, @d5.d m mVar, boolean z5) {
        if (qVar == null) {
            a(2);
        }
        if (mVar == null) {
            a(3);
        }
        return e(f24449n, qVar, mVar, z5) == null;
    }

    private static void i(u uVar) {
        f24452q.put(uVar.b(), uVar);
    }

    @d5.d
    public static u j(@d5.d o1 o1Var) {
        if (o1Var == null) {
            a(15);
        }
        u uVar = f24452q.get(o1Var);
        if (uVar != null) {
            return uVar;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("䣑") + o1Var);
    }
}
