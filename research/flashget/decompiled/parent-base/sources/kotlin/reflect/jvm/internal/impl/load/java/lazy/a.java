package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kotlin.b0;
import kotlin.c0;
import kotlin.f0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.jvm.internal.impl.load.java.y;
import wd.z;

/* compiled from: context.kt */
/* loaded from: classes7.dex */
public final class a {

    /* compiled from: context.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.a$a, reason: collision with other inner class name */
    static final class C1088a extends n0 implements ld.a<y> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f76458b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.g f76459c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1088a(g gVar, kotlin.reflect.jvm.internal.impl.descriptors.g gVar2) {
            super(0);
            this.f76458b = gVar;
            this.f76459c = gVar2;
        }

        @Override // ld.a
        @m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y invoke() {
            return a.g(this.f76458b, this.f76459c.getAnnotations());
        }
    }

    /* compiled from: context.kt */
    static final class b extends n0 implements ld.a<y> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f76460b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.annotations.g f76461c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(g gVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar2) {
            super(0);
            this.f76460b = gVar;
            this.f76461c = gVar2;
        }

        @Override // ld.a
        @m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y invoke() {
            return a.g(this.f76460b, this.f76461c);
        }
    }

    private static final g a(g gVar, kotlin.reflect.jvm.internal.impl.descriptors.m mVar, z zVar, int i4, b0<y> b0Var) {
        return new g(gVar.a(), zVar != null ? new h(gVar, mVar, zVar, i4) : gVar.f(), b0Var);
    }

    @l
    public static final g b(@l g gVar, @l k kVar) {
        l0.p(gVar, ProtectedSandApp.s("焏\u0001"));
        l0.p(kVar, ProtectedSandApp.s("焐\u0001"));
        return new g(gVar.a(), kVar, gVar.c());
    }

    @l
    public static final g c(@l g gVar, @l kotlin.reflect.jvm.internal.impl.descriptors.g gVar2, @m z zVar, int i4) {
        l0.p(gVar, ProtectedSandApp.s("焏\u0001"));
        l0.p(gVar2, ProtectedSandApp.s("焑\u0001"));
        return a(gVar, gVar2, zVar, i4, c0.b(f0.NONE, new C1088a(gVar, gVar2)));
    }

    public static /* synthetic */ g d(g gVar, kotlin.reflect.jvm.internal.impl.descriptors.g gVar2, z zVar, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            zVar = null;
        }
        if ((i5 & 4) != 0) {
            i4 = 0;
        }
        return c(gVar, gVar2, zVar, i4);
    }

    @l
    public static final g e(@l g gVar, @l kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @l z zVar, int i4) {
        l0.p(gVar, ProtectedSandApp.s("焏\u0001"));
        l0.p(mVar, ProtectedSandApp.s("焑\u0001"));
        l0.p(zVar, ProtectedSandApp.s("焒\u0001"));
        return a(gVar, mVar, zVar, i4, gVar.c());
    }

    public static /* synthetic */ g f(g gVar, kotlin.reflect.jvm.internal.impl.descriptors.m mVar, z zVar, int i4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            i4 = 0;
        }
        return e(gVar, mVar, zVar, i4);
    }

    @m
    public static final y g(@l g gVar, @l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar2) {
        l0.p(gVar, ProtectedSandApp.s("焏\u0001"));
        l0.p(gVar2, ProtectedSandApp.s("焓\u0001"));
        return gVar.a().a().c(gVar.b(), gVar2);
    }

    @l
    public static final g h(@l g gVar, @l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar2) {
        l0.p(gVar, ProtectedSandApp.s("焏\u0001"));
        l0.p(gVar2, ProtectedSandApp.s("焓\u0001"));
        return gVar2.isEmpty() ? gVar : new g(gVar.a(), gVar.f(), c0.b(f0.NONE, new b(gVar, gVar2)));
    }

    @l
    public static final g i(@l g gVar, @l kotlin.reflect.jvm.internal.impl.load.java.lazy.b bVar) {
        l0.p(gVar, ProtectedSandApp.s("焏\u0001"));
        l0.p(bVar, ProtectedSandApp.s("焔\u0001"));
        return new g(bVar, gVar.f(), gVar.c());
    }
}
