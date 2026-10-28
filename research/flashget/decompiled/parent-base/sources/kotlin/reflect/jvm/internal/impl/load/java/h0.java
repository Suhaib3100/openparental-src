package kotlin.reflect.jvm.internal.impl.load.java;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.types.p0;

/* compiled from: specialBuiltinMembers.kt */
@kd.i(name = "SpecialBuiltinMembers")
@r1({"SMAP\nspecialBuiltinMembers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 specialBuiltinMembers.kt\norg/jetbrains/kotlin/load/java/SpecialBuiltinMembers\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n1#2:183\n*E\n"})
/* loaded from: classes7.dex */
public final class h0 {

    /* compiled from: specialBuiltinMembers.kt */
    static final class a extends n0 implements ld.l<kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f76431b = new a(1);

        a() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            l0.p(bVar, ProtectedSandApp.s("烔\u0001"));
            return Boolean.valueOf(i.f76434a.b(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.t(bVar)));
        }
    }

    /* compiled from: specialBuiltinMembers.kt */
    static final class b extends n0 implements ld.l<kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f76432b = new b(1);

        b() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            l0.p(bVar, ProtectedSandApp.s("烕\u0001"));
            return Boolean.valueOf(e.f76416o.j((z0) bVar));
        }
    }

    /* compiled from: specialBuiltinMembers.kt */
    static final class c extends n0 implements ld.l<kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f76433b = new c(1);

        c() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            l0.p(bVar, ProtectedSandApp.s("烖\u0001"));
            return Boolean.valueOf(kotlin.reflect.jvm.internal.impl.builtins.h.g0(bVar) && f.m(bVar) != null);
        }
    }

    public static final boolean a(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        l0.p(bVar, ProtectedSandApp.s("烗\u0001"));
        return d(bVar) != null;
    }

    @fg.m
    public static final String b(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.b t4;
        kotlin.reflect.jvm.internal.impl.name.f i4;
        l0.p(bVar, ProtectedSandApp.s("烘\u0001"));
        kotlin.reflect.jvm.internal.impl.descriptors.b c5 = c(bVar);
        if (c5 == null || (t4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.t(c5)) == null) {
            return null;
        }
        if (t4 instanceof u0) {
            return i.f76434a.a(t4);
        }
        if (!(t4 instanceof z0) || (i4 = e.f76416o.i((z0) t4)) == null) {
            return null;
        }
        return i4.b();
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.b c(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        if (kotlin.reflect.jvm.internal.impl.builtins.h.g0(bVar)) {
            return d(bVar);
        }
        return null;
    }

    @fg.m
    public static final <T extends kotlin.reflect.jvm.internal.impl.descriptors.b> T d(@fg.l T t4) {
        l0.p(t4, ProtectedSandApp.s("烗\u0001"));
        i0.f76436a.getClass();
        if (!i0.f76448m.contains(t4.getName()) && !g.f76425a.d().contains(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.t(t4).getName())) {
            return null;
        }
        if (t4 instanceof u0 ? true : t4 instanceof t0) {
            return (T) kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.f(t4, false, a.f76431b, 1, null);
        }
        if (t4 instanceof z0) {
            return (T) kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.f(t4, false, b.f76432b, 1, null);
        }
        return null;
    }

    @fg.m
    public static final <T extends kotlin.reflect.jvm.internal.impl.descriptors.b> T e(@fg.l T t4) {
        l0.p(t4, ProtectedSandApp.s("烗\u0001"));
        T t5 = (T) d(t4);
        if (t5 != null) {
            return t5;
        }
        f fVar = f.f76422o;
        kotlin.reflect.jvm.internal.impl.name.f name = t4.getName();
        l0.o(name, ProtectedSandApp.s("烙\u0001"));
        if (fVar.l(name)) {
            return (T) kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.f(t4, false, c.f76433b, 1, null);
        }
        return null;
    }

    public static final boolean f(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        l0.p(eVar, ProtectedSandApp.s("烗\u0001"));
        l0.p(aVar, ProtectedSandApp.s("烚\u0001"));
        kotlin.reflect.jvm.internal.impl.descriptors.m c5 = aVar.c();
        l0.n(c5, ProtectedSandApp.s("烛\u0001"));
        p0 r4 = ((kotlin.reflect.jvm.internal.impl.descriptors.e) c5).r();
        l0.o(r4, ProtectedSandApp.s("烜\u0001"));
        for (kotlin.reflect.jvm.internal.impl.descriptors.e s4 = kotlin.reflect.jvm.internal.impl.resolve.f.s(eVar); s4 != null; s4 = kotlin.reflect.jvm.internal.impl.resolve.f.s(s4)) {
            if (!(s4 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.c) && kotlin.reflect.jvm.internal.impl.types.checker.u.b(s4.r(), r4) != null) {
                return !kotlin.reflect.jvm.internal.impl.builtins.h.g0(s4);
            }
        }
        return false;
    }

    public static final boolean g(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        l0.p(bVar, ProtectedSandApp.s("烗\u0001"));
        return kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.t(bVar).c() instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.c;
    }

    public static final boolean h(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        l0.p(bVar, ProtectedSandApp.s("烗\u0001"));
        return g(bVar) || kotlin.reflect.jvm.internal.impl.builtins.h.g0(bVar);
    }
}
