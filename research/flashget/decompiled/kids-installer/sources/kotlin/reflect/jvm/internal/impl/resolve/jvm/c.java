package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import b4.d0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.load.java.components.g;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;

/* compiled from: JavaDescriptorResolver.kt */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.f f25938a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final g f25939b;

    public c(@d5.d kotlin.reflect.jvm.internal.impl.load.java.lazy.f fVar, @d5.d g gVar) {
        l0.p(fVar, ProtectedSandApp.s("剩"));
        l0.p(gVar, ProtectedSandApp.s("剪"));
        this.f25938a = fVar;
        this.f25939b = gVar;
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.f a() {
        return this.f25938a;
    }

    @d5.e
    public final kotlin.reflect.jvm.internal.impl.descriptors.e b(@d5.d b4.g gVar) {
        Object G2;
        l0.p(gVar, ProtectedSandApp.s("剫"));
        kotlin.reflect.jvm.internal.impl.name.c f6 = gVar.f();
        if (f6 != null && gVar.L() == d0.SOURCE) {
            return this.f25939b.a(f6);
        }
        b4.g u5 = gVar.u();
        if (u5 != null) {
            kotlin.reflect.jvm.internal.impl.descriptors.e b6 = b(u5);
            h F0 = b6 != null ? b6.F0() : null;
            kotlin.reflect.jvm.internal.impl.descriptors.h h5 = F0 != null ? F0.h(gVar.getName(), z3.d.FROM_JAVA_LOADER) : null;
            if (h5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                return (kotlin.reflect.jvm.internal.impl.descriptors.e) h5;
            }
            return null;
        }
        if (f6 == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.load.java.lazy.f fVar = this.f25938a;
        kotlin.reflect.jvm.internal.impl.name.c e6 = f6.e();
        l0.o(e6, ProtectedSandApp.s("剬"));
        G2 = j0.G2(fVar.a(e6));
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.h hVar = (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.h) G2;
        if (hVar != null) {
            return hVar.S0(gVar);
        }
        return null;
    }
}
