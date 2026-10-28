package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;

/* compiled from: KotlinJvmBinaryPackageSourceElement.kt */
/* loaded from: classes7.dex */
public final class u implements a1 {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.h f76952b;

    public u(@fg.l kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.h hVar) {
        l0.p(hVar, ProtectedSandApp.s("璨\u0001"));
        this.f76952b = hVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a1
    @fg.l
    public b1 b() {
        b1 b1Var = b1.f75928a;
        l0.o(b1Var, ProtectedSandApp.s("璩\u0001"));
        return b1Var;
    }

    @fg.l
    public String toString() {
        return this.f76952b + ProtectedSandApp.s("璪\u0001") + this.f76952b.O0().keySet();
    }
}
