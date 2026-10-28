package kotlin.reflect.jvm.internal.impl.descriptors;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;

/* compiled from: Visibilities.kt */
/* loaded from: classes5.dex */
public final class n1 {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final n1 f24339a = new n1();

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private static final Map<o1, Integer> f24340b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private static final h f24341c;

    /* compiled from: Visibilities.kt */
    public static final class a extends o1 {

        /* renamed from: c, reason: collision with root package name */
        @d5.d
        public static final a f24342c = new a();

        private a() {
            super(ProtectedSandApp.s("䟿"), false);
        }
    }

    /* compiled from: Visibilities.kt */
    public static final class b extends o1 {

        /* renamed from: c, reason: collision with root package name */
        @d5.d
        public static final b f24343c = new b();

        private b() {
            super(ProtectedSandApp.s("䠀"), false);
        }
    }

    /* compiled from: Visibilities.kt */
    public static final class c extends o1 {

        /* renamed from: c, reason: collision with root package name */
        @d5.d
        public static final c f24344c = new c();

        private c() {
            super(ProtectedSandApp.s("䠁"), false);
        }
    }

    /* compiled from: Visibilities.kt */
    public static final class d extends o1 {

        /* renamed from: c, reason: collision with root package name */
        @d5.d
        public static final d f24345c = new d();

        private d() {
            super(ProtectedSandApp.s("䠂"), false);
        }
    }

    /* compiled from: Visibilities.kt */
    public static final class e extends o1 {

        /* renamed from: c, reason: collision with root package name */
        @d5.d
        public static final e f24346c = new e();

        private e() {
            super(ProtectedSandApp.s("䠃"), false);
        }
    }

    /* compiled from: Visibilities.kt */
    public static final class f extends o1 {

        /* renamed from: c, reason: collision with root package name */
        @d5.d
        public static final f f24347c = new f();

        private f() {
            super(ProtectedSandApp.s("䠄"), false);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.o1
        @d5.d
        public String b() {
            return ProtectedSandApp.s("䠅");
        }
    }

    /* compiled from: Visibilities.kt */
    public static final class g extends o1 {

        /* renamed from: c, reason: collision with root package name */
        @d5.d
        public static final g f24348c = new g();

        private g() {
            super(ProtectedSandApp.s("䠆"), true);
        }
    }

    /* compiled from: Visibilities.kt */
    public static final class h extends o1 {

        /* renamed from: c, reason: collision with root package name */
        @d5.d
        public static final h f24349c = new h();

        private h() {
            super(ProtectedSandApp.s("䠇"), true);
        }
    }

    /* compiled from: Visibilities.kt */
    public static final class i extends o1 {

        /* renamed from: c, reason: collision with root package name */
        @d5.d
        public static final i f24350c = new i();

        private i() {
            super(ProtectedSandApp.s("䠈"), false);
        }
    }

    static {
        Map<o1, Integer> d6;
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put(f.f24347c, 0);
        mapBuilder.put(e.f24346c, 0);
        mapBuilder.put(b.f24343c, 1);
        mapBuilder.put(g.f24348c, 1);
        h hVar = h.f24349c;
        mapBuilder.put(hVar, 2);
        d6 = kotlin.collections.e1.d(mapBuilder);
        f24340b = d6;
        f24341c = hVar;
    }

    private n1() {
    }

    @d5.e
    public final Integer a(@d5.d o1 o1Var, @d5.d o1 o1Var2) {
        kotlin.jvm.internal.l0.p(o1Var, ProtectedSandApp.s("䠉"));
        kotlin.jvm.internal.l0.p(o1Var2, ProtectedSandApp.s("䠊"));
        if (o1Var == o1Var2) {
            return 0;
        }
        Map<o1, Integer> map = f24340b;
        Integer num = map.get(o1Var);
        Integer num2 = map.get(o1Var2);
        if (num == null || num2 == null || kotlin.jvm.internal.l0.g(num, num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public final boolean b(@d5.d o1 o1Var) {
        kotlin.jvm.internal.l0.p(o1Var, ProtectedSandApp.s("䠋"));
        return o1Var == e.f24346c || o1Var == f.f24347c;
    }
}
