package kotlin.reflect.jvm.internal.impl.descriptors;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: Visibility.kt */
/* loaded from: classes7.dex */
public abstract class o1 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final String f76201a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f76202b;

    protected o1(@fg.l String str, boolean z4) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("渥\u0001"));
        this.f76201a = str;
        this.f76202b = z4;
    }

    @fg.m
    public Integer a(@fg.l o1 o1Var) {
        kotlin.jvm.internal.l0.p(o1Var, ProtectedSandApp.s("渦\u0001"));
        return n1.f76189a.a(this, o1Var);
    }

    @fg.l
    public String b() {
        return this.f76201a;
    }

    public final boolean c() {
        return this.f76202b;
    }

    @fg.l
    public o1 d() {
        return this;
    }

    @fg.l
    public final String toString() {
        return b();
    }
}
