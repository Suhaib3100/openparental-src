package kotlin.reflect.jvm.internal.impl.load.java.components;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.f1;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.builtins.l;
import kotlin.reflect.jvm.internal.impl.load.java.b0;

/* compiled from: JavaAnnotationMapper.kt */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final c f24532a = new c();

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private static final kotlin.reflect.jvm.internal.impl.name.f f24533b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private static final kotlin.reflect.jvm.internal.impl.name.f f24534c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private static final kotlin.reflect.jvm.internal.impl.name.f f24535d;

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    private static final Map<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.name.c> f24536e;

    static {
        Map<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.name.c> W;
        kotlin.reflect.jvm.internal.impl.name.f p5 = kotlin.reflect.jvm.internal.impl.name.f.p(ProtectedSandApp.s("䥐"));
        l0.o(p5, ProtectedSandApp.s("䥑"));
        f24533b = p5;
        kotlin.reflect.jvm.internal.impl.name.f p6 = kotlin.reflect.jvm.internal.impl.name.f.p(ProtectedSandApp.s("䥒"));
        l0.o(p6, ProtectedSandApp.s("䥓"));
        f24534c = p6;
        kotlin.reflect.jvm.internal.impl.name.f p7 = kotlin.reflect.jvm.internal.impl.name.f.p(ProtectedSandApp.s("䥔"));
        l0.o(p7, ProtectedSandApp.s("䥕"));
        f24535d = p7;
        W = f1.W(new Pair(l.a.H, b0.f24478d), new Pair(l.a.L, b0.f24480f), new Pair(l.a.P, b0.f24483i));
        f24536e = W;
    }

    private c() {
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.annotations.c f(c cVar, b4.a aVar, kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, boolean z5, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            z5 = false;
        }
        return cVar.e(aVar, gVar, z5);
    }

    @d5.e
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c a(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar, @d5.d b4.d dVar, @d5.d kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar) {
        b4.a e6;
        l0.p(cVar, ProtectedSandApp.s("䥖"));
        l0.p(dVar, ProtectedSandApp.s("䥗"));
        l0.p(gVar, ProtectedSandApp.s("䥘"));
        if (l0.g(cVar, l.a.f24089y)) {
            kotlin.reflect.jvm.internal.impl.name.c cVar2 = b0.f24482h;
            l0.o(cVar2, ProtectedSandApp.s("䥙"));
            b4.a e7 = dVar.e(cVar2);
            if (e7 != null || dVar.o()) {
                return new e(e7, gVar);
            }
        }
        kotlin.reflect.jvm.internal.impl.name.c cVar3 = f24536e.get(cVar);
        if (cVar3 == null || (e6 = dVar.e(cVar3)) == null) {
            return null;
        }
        return f(f24532a, e6, gVar, false, 4, null);
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.name.f b() {
        return f24533b;
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.name.f c() {
        return f24535d;
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.name.f d() {
        return f24534c;
    }

    @d5.e
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c e(@d5.d b4.a aVar, @d5.d kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, boolean z5) {
        l0.p(aVar, ProtectedSandApp.s("䥚"));
        l0.p(gVar, ProtectedSandApp.s("䥛"));
        kotlin.reflect.jvm.internal.impl.name.b h5 = aVar.h();
        if (l0.g(h5, kotlin.reflect.jvm.internal.impl.name.b.m(b0.f24478d))) {
            return new i(aVar, gVar);
        }
        if (l0.g(h5, kotlin.reflect.jvm.internal.impl.name.b.m(b0.f24480f))) {
            return new h(aVar, gVar);
        }
        if (l0.g(h5, kotlin.reflect.jvm.internal.impl.name.b.m(b0.f24483i))) {
            return new b(gVar, aVar, l.a.P);
        }
        if (l0.g(h5, kotlin.reflect.jvm.internal.impl.name.b.m(b0.f24482h))) {
            return null;
        }
        return new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.e(gVar, aVar, z5);
    }
}
