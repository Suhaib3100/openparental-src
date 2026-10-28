package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.text.m0;

/* compiled from: context.kt */
/* loaded from: classes7.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final k f78244a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c f78245b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.descriptors.m f78246c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.g f78247d;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.h f78248e;

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.a f78249f;

    /* renamed from: g, reason: collision with root package name */
    @fg.m
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g f78250g;

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private final f0 f78251h;

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    private final y f78252i;

    public m(@fg.l k kVar, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.h hVar, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.a aVar, @fg.m kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g gVar2, @fg.m f0 f0Var, @fg.l List<a.s> list) {
        String a5;
        l0.p(kVar, ProtectedSandApp.s("籸\u0001"));
        l0.p(cVar, ProtectedSandApp.s("籹\u0001"));
        l0.p(mVar, ProtectedSandApp.s("籺\u0001"));
        l0.p(gVar, ProtectedSandApp.s("类\u0001"));
        l0.p(hVar, ProtectedSandApp.s("籼\u0001"));
        l0.p(aVar, ProtectedSandApp.s("籽\u0001"));
        l0.p(list, ProtectedSandApp.s("籾\u0001"));
        this.f78244a = kVar;
        this.f78245b = cVar;
        this.f78246c = mVar;
        this.f78247d = gVar;
        this.f78248e = hVar;
        this.f78249f = aVar;
        this.f78250g = gVar2;
        this.f78251h = new f0(this, f0Var, list, ProtectedSandApp.s("籿\u0001") + mVar.getName() + m0.quote, (gVar2 == null || (a5 = gVar2.a()) == null) ? ProtectedSandApp.s("粀\u0001") : a5);
        this.f78252i = new y(this);
    }

    public static /* synthetic */ m b(m mVar, kotlin.reflect.jvm.internal.impl.descriptors.m mVar2, List list, kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.h hVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.a aVar, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            cVar = mVar.f78245b;
        }
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar2 = cVar;
        if ((i4 & 8) != 0) {
            gVar = mVar.f78247d;
        }
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar2 = gVar;
        if ((i4 & 16) != 0) {
            hVar = mVar.f78248e;
        }
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.h hVar2 = hVar;
        if ((i4 & 32) != 0) {
            aVar = mVar.f78249f;
        }
        return mVar.a(mVar2, list, cVar2, gVar2, hVar2, aVar);
    }

    @fg.l
    public final m a(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @fg.l List<a.s> list, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.h hVar, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.a aVar) {
        l0.p(mVar, ProtectedSandApp.s("粁\u0001"));
        l0.p(list, ProtectedSandApp.s("粂\u0001"));
        l0.p(cVar, ProtectedSandApp.s("籹\u0001"));
        l0.p(gVar, ProtectedSandApp.s("类\u0001"));
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.h hVar2 = hVar;
        l0.p(hVar2, ProtectedSandApp.s("籼\u0001"));
        l0.p(aVar, ProtectedSandApp.s("籽\u0001"));
        k kVar = this.f78244a;
        if (!kotlin.reflect.jvm.internal.impl.metadata.deserialization.i.b(aVar)) {
            hVar2 = this.f78248e;
        }
        return new m(kVar, cVar, mVar, gVar, hVar2, aVar, this.f78250g, this.f78251h, list);
    }

    @fg.l
    public final k c() {
        return this.f78244a;
    }

    @fg.m
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g d() {
        return this.f78250g;
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.descriptors.m e() {
        return this.f78246c;
    }

    @fg.l
    public final y f() {
        return this.f78252i;
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c g() {
        return this.f78245b;
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.storage.n h() {
        return this.f78244a.u();
    }

    @fg.l
    public final f0 i() {
        return this.f78251h;
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.g j() {
        return this.f78247d;
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.h k() {
        return this.f78248e;
    }
}
