package kotlin.reflect.jvm.internal.impl.descriptors;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Map;

/* compiled from: Visibilities.kt */
/* loaded from: classes7.dex */
public final class n1 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final n1 f76189a = new n1();

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final Map<o1, Integer> f76190b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final h f76191c;

    /* compiled from: Visibilities.kt */
    public static final class a extends o1 {

        /* renamed from: c, reason: collision with root package name */
        @fg.l
        public static final a f76192c = new a();

        private a() {
            super(ProtectedSandApp.s("渧\u0001"), false);
        }
    }

    /* compiled from: Visibilities.kt */
    public static final class b extends o1 {

        /* renamed from: c, reason: collision with root package name */
        @fg.l
        public static final b f76193c = new b();

        private b() {
            super(ProtectedSandApp.s("渨\u0001"), false);
        }
    }

    /* compiled from: Visibilities.kt */
    public static final class c extends o1 {

        /* renamed from: c, reason: collision with root package name */
        @fg.l
        public static final c f76194c = new c();

        private c() {
            super(ProtectedSandApp.s("温\u0001"), false);
        }
    }

    /* compiled from: Visibilities.kt */
    public static final class d extends o1 {

        /* renamed from: c, reason: collision with root package name */
        @fg.l
        public static final d f76195c = new d();

        private d() {
            super(ProtectedSandApp.s("渪\u0001"), false);
        }
    }

    /* compiled from: Visibilities.kt */
    public static final class e extends o1 {

        /* renamed from: c, reason: collision with root package name */
        @fg.l
        public static final e f76196c = new e();

        private e() {
            super(ProtectedSandApp.s("渫\u0001"), false);
        }
    }

    /* compiled from: Visibilities.kt */
    public static final class f extends o1 {

        /* renamed from: c, reason: collision with root package name */
        @fg.l
        public static final f f76197c = new f();

        private f() {
            super(ProtectedSandApp.s("測\u0001"), false);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.o1
        @fg.l
        public String b() {
            return ProtectedSandApp.s("渭\u0001");
        }
    }

    /* compiled from: Visibilities.kt */
    public static final class g extends o1 {

        /* renamed from: c, reason: collision with root package name */
        @fg.l
        public static final g f76198c = new g();

        private g() {
            super(ProtectedSandApp.s("渮\u0001"), true);
        }
    }

    /* compiled from: Visibilities.kt */
    public static final class h extends o1 {

        /* renamed from: c, reason: collision with root package name */
        @fg.l
        public static final h f76199c = new h();

        private h() {
            super(ProtectedSandApp.s("港\u0001"), true);
        }
    }

    /* compiled from: Visibilities.kt */
    public static final class i extends o1 {

        /* renamed from: c, reason: collision with root package name */
        @fg.l
        public static final i f76200c = new i();

        private i() {
            super(ProtectedSandApp.s("渰\u0001"), false);
        }
    }

    static {
        kotlin.collections.builders.d dVar = new kotlin.collections.builders.d();
        dVar.put(f.f76197c, 0);
        dVar.put(e.f76196c, 0);
        dVar.put(b.f76193c, 1);
        dVar.put(g.f76198c, 1);
        h hVar = h.f76199c;
        dVar.put(hVar, 2);
        f76190b = kotlin.collections.z0.d(dVar);
        f76191c = hVar;
    }

    private n1() {
    }

    @fg.m
    public final Integer a(@fg.l o1 o1Var, @fg.l o1 o1Var2) {
        kotlin.jvm.internal.l0.p(o1Var, ProtectedSandApp.s("渱\u0001"));
        kotlin.jvm.internal.l0.p(o1Var2, ProtectedSandApp.s("渲\u0001"));
        if (o1Var == o1Var2) {
            return 0;
        }
        Map<o1, Integer> map = f76190b;
        Integer num = map.get(o1Var);
        Integer num2 = map.get(o1Var2);
        if (num == null || num2 == null || kotlin.jvm.internal.l0.g(num, num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public final boolean b(@fg.l o1 o1Var) {
        kotlin.jvm.internal.l0.p(o1Var, ProtectedSandApp.s("渳\u0001"));
        return o1Var == e.f76196c || o1Var == f.f76197c;
    }
}
