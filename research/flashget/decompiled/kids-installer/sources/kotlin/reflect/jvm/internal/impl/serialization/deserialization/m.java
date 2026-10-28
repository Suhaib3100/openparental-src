package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.text.Typography;

/* compiled from: context.kt */
/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final k f26235a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c f26236b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.descriptors.m f26237c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.g f26238d;

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.h f26239e;

    /* renamed from: f, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.a f26240f;

    /* renamed from: g, reason: collision with root package name */
    @d5.e
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g f26241g;

    /* renamed from: h, reason: collision with root package name */
    @d5.d
    private final e0 f26242h;

    /* renamed from: i, reason: collision with root package name */
    @d5.d
    private final x f26243i;

    public m(@d5.d k kVar, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.h hVar, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.a aVar, @d5.e kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g gVar2, @d5.e e0 e0Var, @d5.d List<a.s> list) {
        String c6;
        l0.p(kVar, ProtectedSandApp.s("吱"));
        l0.p(cVar, ProtectedSandApp.s("吲"));
        l0.p(mVar, ProtectedSandApp.s("吳"));
        l0.p(gVar, ProtectedSandApp.s("吴"));
        l0.p(hVar, ProtectedSandApp.s("吵"));
        l0.p(aVar, ProtectedSandApp.s("吶"));
        l0.p(list, ProtectedSandApp.s("吷"));
        this.f26235a = kVar;
        this.f26236b = cVar;
        this.f26237c = mVar;
        this.f26238d = gVar;
        this.f26239e = hVar;
        this.f26240f = aVar;
        this.f26241g = gVar2;
        this.f26242h = new e0(this, e0Var, list, ProtectedSandApp.s("吸") + mVar.getName() + Typography.f27126b, (gVar2 == null || (c6 = gVar2.c()) == null) ? ProtectedSandApp.s("吹") : c6);
        this.f26243i = new x(this);
    }

    public static /* synthetic */ m b(m mVar, kotlin.reflect.jvm.internal.impl.descriptors.m mVar2, List list, kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.h hVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.a aVar, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            cVar = mVar.f26236b;
        }
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar2 = cVar;
        if ((i5 & 8) != 0) {
            gVar = mVar.f26238d;
        }
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar2 = gVar;
        if ((i5 & 16) != 0) {
            hVar = mVar.f26239e;
        }
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.h hVar2 = hVar;
        if ((i5 & 32) != 0) {
            aVar = mVar.f26240f;
        }
        return mVar.a(mVar2, list, cVar2, gVar2, hVar2, aVar);
    }

    @d5.d
    public final m a(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @d5.d List<a.s> list, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.h hVar, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.a aVar) {
        l0.p(mVar, ProtectedSandApp.s("吺"));
        l0.p(list, ProtectedSandApp.s("吻"));
        l0.p(cVar, ProtectedSandApp.s("吼"));
        l0.p(gVar, ProtectedSandApp.s("吽"));
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.h hVar2 = hVar;
        l0.p(hVar2, ProtectedSandApp.s("吾"));
        l0.p(aVar, ProtectedSandApp.s("吿"));
        k kVar = this.f26235a;
        if (!kotlin.reflect.jvm.internal.impl.metadata.deserialization.i.b(aVar)) {
            hVar2 = this.f26239e;
        }
        return new m(kVar, cVar, mVar, gVar, hVar2, aVar, this.f26241g, this.f26242h, list);
    }

    @d5.d
    public final k c() {
        return this.f26235a;
    }

    @d5.e
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g d() {
        return this.f26241g;
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.descriptors.m e() {
        return this.f26237c;
    }

    @d5.d
    public final x f() {
        return this.f26243i;
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c g() {
        return this.f26236b;
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.storage.n h() {
        return this.f26235a.u();
    }

    @d5.d
    public final e0 i() {
        return this.f26242h;
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.g j() {
        return this.f26238d;
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.h k() {
        return this.f26239e;
    }
}
