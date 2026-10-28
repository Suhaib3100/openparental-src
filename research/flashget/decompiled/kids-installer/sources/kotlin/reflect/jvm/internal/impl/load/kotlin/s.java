package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;

/* compiled from: KotlinJvmBinaryPackageSourceElement.kt */
/* loaded from: classes5.dex */
public final class s implements a1 {

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.h f25070b;

    public s(@d5.d kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.h hVar) {
        l0.p(hVar, ProtectedSandApp.s("䲭"));
        this.f25070b = hVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a1
    @d5.d
    public b1 a() {
        b1 b1Var = b1.f24130a;
        l0.o(b1Var, ProtectedSandApp.s("䲮"));
        return b1Var;
    }

    @d5.d
    public String toString() {
        return this.f25070b + ProtectedSandApp.s("䲯") + this.f25070b.T0().keySet();
    }
}
