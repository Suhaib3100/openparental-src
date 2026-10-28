package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kotlin.jvm.internal.l0;

/* compiled from: ModuleClassResolver.kt */
/* loaded from: classes7.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    public kotlin.reflect.jvm.internal.impl.resolve.jvm.c f76653a;

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.i
    @m
    public kotlin.reflect.jvm.internal.impl.descriptors.e a(@l wd.g gVar) {
        l0.p(gVar, ProtectedSandApp.s("爆\u0001"));
        return b().b(gVar);
    }

    @l
    public final kotlin.reflect.jvm.internal.impl.resolve.jvm.c b() {
        kotlin.reflect.jvm.internal.impl.resolve.jvm.c cVar = this.f76653a;
        if (cVar != null) {
            return cVar;
        }
        l0.S(ProtectedSandApp.s("爇\u0001"));
        return null;
    }

    public final void c(@l kotlin.reflect.jvm.internal.impl.resolve.jvm.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("爈\u0001"));
        this.f76653a = cVar;
    }
}
