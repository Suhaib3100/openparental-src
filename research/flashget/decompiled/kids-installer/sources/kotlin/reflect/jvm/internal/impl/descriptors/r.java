package kotlin.reflect.jvm.internal.impl.descriptors;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: DescriptorVisibility.kt */
/* loaded from: classes5.dex */
public abstract class r extends u {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final o1 f24353a;

    public r(@d5.d o1 o1Var) {
        kotlin.jvm.internal.l0.p(o1Var, ProtectedSandApp.s("䠔"));
        this.f24353a = o1Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.u
    @d5.d
    public o1 b() {
        return this.f24353a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.u
    @d5.d
    public String c() {
        return b().b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.u
    @d5.d
    public u f() {
        u j5 = t.j(b().d());
        kotlin.jvm.internal.l0.o(j5, ProtectedSandApp.s("䠕"));
        return j5;
    }
}
