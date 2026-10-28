package kotlin.reflect.jvm.internal.impl.load.java;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.types.p0;

/* compiled from: specialBuiltinMembers.kt */
@p3.i(name = "SpecialBuiltinMembers")
/* loaded from: classes5.dex */
public final class h0 {

    /* compiled from: specialBuiltinMembers.kt */
    /* loaded from: classes6.dex */
    static final class a extends Lambda implements q3.l<kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean> {

        /* renamed from: p, reason: collision with root package name */
        public static final a f24576p = new a();

        a() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean N(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            l0.p(bVar, ProtectedSandApp.s("葝"));
            return Boolean.valueOf(i.f24579a.b(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.s(bVar)));
        }
    }

    /* compiled from: specialBuiltinMembers.kt */
    /* loaded from: classes6.dex */
    static final class b extends Lambda implements q3.l<kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean> {

        /* renamed from: p, reason: collision with root package name */
        public static final b f24577p = new b();

        b() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean N(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            l0.p(bVar, ProtectedSandApp.s("葞"));
            return Boolean.valueOf(e.f24562n.j((z0) bVar));
        }
    }

    /* compiled from: specialBuiltinMembers.kt */
    /* loaded from: classes6.dex */
    static final class c extends Lambda implements q3.l<kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean> {

        /* renamed from: p, reason: collision with root package name */
        public static final c f24578p = new c();

        c() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean N(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            l0.p(bVar, ProtectedSandApp.s("葟"));
            return Boolean.valueOf(kotlin.reflect.jvm.internal.impl.builtins.h.f0(bVar) && f.m(bVar) != null);
        }
    }

    public static final boolean a(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        l0.p(bVar, ProtectedSandApp.s("䧸"));
        return d(bVar) != null;
    }

    @d5.e
    public static final String b(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.b s5;
        kotlin.reflect.jvm.internal.impl.name.f i5;
        l0.p(bVar, ProtectedSandApp.s("䧹"));
        kotlin.reflect.jvm.internal.impl.descriptors.b c6 = c(bVar);
        if (c6 == null || (s5 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.s(c6)) == null) {
            return null;
        }
        if (s5 instanceof u0) {
            return i.f24579a.a(s5);
        }
        if (!(s5 instanceof z0) || (i5 = e.f24562n.i((z0) s5)) == null) {
            return null;
        }
        return i5.h();
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.b c(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        if (kotlin.reflect.jvm.internal.impl.builtins.h.f0(bVar)) {
            return d(bVar);
        }
        return null;
    }

    @d5.e
    public static final <T extends kotlin.reflect.jvm.internal.impl.descriptors.b> T d(@d5.d T t5) {
        l0.p(t5, ProtectedSandApp.s("䧺"));
        i0.f24581a.getClass();
        if (!i0.f24592l.contains(t5.getName()) && !g.f24571a.d().contains(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.s(t5).getName())) {
            return null;
        }
        if (t5 instanceof u0 ? true : t5 instanceof t0) {
            return (T) kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.f(t5, false, a.f24576p, 1, null);
        }
        if (t5 instanceof z0) {
            return (T) kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.f(t5, false, b.f24577p, 1, null);
        }
        return null;
    }

    @d5.e
    public static final <T extends kotlin.reflect.jvm.internal.impl.descriptors.b> T e(@d5.d T t5) {
        l0.p(t5, ProtectedSandApp.s("䧻"));
        T t6 = (T) d(t5);
        if (t6 != null) {
            return t6;
        }
        f fVar = f.f24568n;
        kotlin.reflect.jvm.internal.impl.name.f name = t5.getName();
        l0.o(name, ProtectedSandApp.s("䧼"));
        if (fVar.l(name)) {
            return (T) kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.f(t5, false, c.f24578p, 1, null);
        }
        return null;
    }

    public static final boolean f(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        l0.p(eVar, ProtectedSandApp.s("䧽"));
        l0.p(aVar, ProtectedSandApp.s("䧾"));
        kotlin.reflect.jvm.internal.impl.descriptors.m b6 = aVar.b();
        l0.n(b6, ProtectedSandApp.s("䧿"));
        p0 E = ((kotlin.reflect.jvm.internal.impl.descriptors.e) b6).E();
        l0.o(E, ProtectedSandApp.s("䨀"));
        kotlin.reflect.jvm.internal.impl.descriptors.e s5 = kotlin.reflect.jvm.internal.impl.resolve.e.s(eVar);
        while (true) {
            if (s5 == null) {
                return false;
            }
            if (!(s5 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.c)) {
                if (kotlin.reflect.jvm.internal.impl.types.checker.u.b(s5.E(), E) != null) {
                    return !kotlin.reflect.jvm.internal.impl.builtins.h.f0(s5);
                }
            }
            s5 = kotlin.reflect.jvm.internal.impl.resolve.e.s(s5);
        }
    }

    public static final boolean g(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        l0.p(bVar, ProtectedSandApp.s("䨁"));
        return kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.s(bVar).b() instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.c;
    }

    public static final boolean h(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        l0.p(bVar, ProtectedSandApp.s("䨂"));
        return g(bVar) || kotlin.reflect.jvm.internal.impl.builtins.h.f0(bVar);
    }
}
