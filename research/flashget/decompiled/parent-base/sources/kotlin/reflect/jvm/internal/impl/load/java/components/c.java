package kotlin.reflect.jvm.internal.impl.load.java.components;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.Map;
import kotlin.collections.z0;
import kotlin.jvm.internal.l0;
import kotlin.q0;
import kotlin.reflect.jvm.internal.impl.builtins.l;
import kotlin.reflect.jvm.internal.impl.load.java.b0;

/* compiled from: JavaAnnotationMapper.kt */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final c f76386a = new c();

    /* renamed from: b, reason: collision with root package name */
    @l
    private static final kotlin.reflect.jvm.internal.impl.name.f f76387b;

    /* renamed from: c, reason: collision with root package name */
    @l
    private static final kotlin.reflect.jvm.internal.impl.name.f f76388c;

    /* renamed from: d, reason: collision with root package name */
    @l
    private static final kotlin.reflect.jvm.internal.impl.name.f f76389d;

    /* renamed from: e, reason: collision with root package name */
    @l
    private static final Map<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.name.c> f76390e;

    static {
        kotlin.reflect.jvm.internal.impl.name.f f4 = kotlin.reflect.jvm.internal.impl.name.f.f(ProtectedSandApp.s("濯\u0001"));
        String s4 = ProtectedSandApp.s("濰\u0001");
        l0.o(f4, s4);
        f76387b = f4;
        kotlin.reflect.jvm.internal.impl.name.f f5 = kotlin.reflect.jvm.internal.impl.name.f.f(ProtectedSandApp.s("濱\u0001"));
        l0.o(f5, s4);
        f76388c = f5;
        kotlin.reflect.jvm.internal.impl.name.f f6 = kotlin.reflect.jvm.internal.impl.name.f.f(ProtectedSandApp.s("濲\u0001"));
        l0.o(f6, s4);
        f76389d = f6;
        f76390e = z0.W(new q0(l.a.H, b0.f76328d), new q0(l.a.L, b0.f76330f), new q0(l.a.P, b0.f76333i));
    }

    private c() {
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.annotations.c f(c cVar, wd.a aVar, kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, boolean z4, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            z4 = false;
        }
        return cVar.e(aVar, gVar, z4);
    }

    @m
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c a(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar, @fg.l wd.d dVar, @fg.l kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar) {
        wd.a k4;
        l0.p(cVar, ProtectedSandApp.s("濳\u0001"));
        l0.p(dVar, ProtectedSandApp.s("濴\u0001"));
        l0.p(gVar, ProtectedSandApp.s("濵\u0001"));
        if (l0.g(cVar, l.a.f75886y)) {
            kotlin.reflect.jvm.internal.impl.name.c cVar2 = b0.f76332h;
            l0.o(cVar2, ProtectedSandApp.s("濶\u0001"));
            wd.a k5 = dVar.k(cVar2);
            if (k5 != null || dVar.E()) {
                return new e(k5, gVar);
            }
        }
        kotlin.reflect.jvm.internal.impl.name.c cVar3 = f76390e.get(cVar);
        if (cVar3 == null || (k4 = dVar.k(cVar3)) == null) {
            return null;
        }
        return f(f76386a, k4, gVar, false, 4, null);
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.name.f b() {
        return f76387b;
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.name.f c() {
        return f76389d;
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.name.f d() {
        return f76388c;
    }

    @m
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c e(@fg.l wd.a aVar, @fg.l kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, boolean z4) {
        l0.p(aVar, ProtectedSandApp.s("濷\u0001"));
        l0.p(gVar, ProtectedSandApp.s("濵\u0001"));
        kotlin.reflect.jvm.internal.impl.name.b m4 = aVar.m();
        if (l0.g(m4, kotlin.reflect.jvm.internal.impl.name.b.m(b0.f76328d))) {
            return new i(aVar, gVar);
        }
        if (l0.g(m4, kotlin.reflect.jvm.internal.impl.name.b.m(b0.f76330f))) {
            return new h(aVar, gVar);
        }
        if (l0.g(m4, kotlin.reflect.jvm.internal.impl.name.b.m(b0.f76333i))) {
            return new b(gVar, aVar, l.a.P);
        }
        if (l0.g(m4, kotlin.reflect.jvm.internal.impl.name.b.m(b0.f76332h))) {
            return null;
        }
        return new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.e(gVar, aVar, z4);
    }
}
