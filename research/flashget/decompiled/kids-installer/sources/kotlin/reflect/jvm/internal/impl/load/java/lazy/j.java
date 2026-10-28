package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;

/* compiled from: ModuleClassResolver.kt */
/* loaded from: classes5.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    public kotlin.reflect.jvm.internal.impl.resolve.jvm.c f24778a;

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.i
    @d5.e
    public kotlin.reflect.jvm.internal.impl.descriptors.e a(@d5.d b4.g gVar) {
        l0.p(gVar, ProtectedSandApp.s("䩵"));
        return b().b(gVar);
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.resolve.jvm.c b() {
        kotlin.reflect.jvm.internal.impl.resolve.jvm.c cVar = this.f24778a;
        if (cVar != null) {
            return cVar;
        }
        l0.S(ProtectedSandApp.s("䩶"));
        return null;
    }

    public final void c(@d5.d kotlin.reflect.jvm.internal.impl.resolve.jvm.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("䩷"));
        this.f24778a = cVar;
    }
}
