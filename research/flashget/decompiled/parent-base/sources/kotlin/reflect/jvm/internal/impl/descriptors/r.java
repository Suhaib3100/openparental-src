package kotlin.reflect.jvm.internal.impl.descriptors;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: DescriptorVisibility.kt */
/* loaded from: classes7.dex */
public abstract class r extends u {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final o1 f76203a;

    public r(@fg.l o1 o1Var) {
        kotlin.jvm.internal.l0.p(o1Var, ProtectedSandApp.s("游\u0001"));
        this.f76203a = o1Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.u
    @fg.l
    public o1 b() {
        return this.f76203a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.u
    @fg.l
    public String c() {
        return b().b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.u
    @fg.l
    public u f() {
        u j4 = t.j(b().d());
        kotlin.jvm.internal.l0.o(j4, ProtectedSandApp.s("渹\u0001"));
        return j4;
    }
}
