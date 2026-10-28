package kotlin.reflect.jvm.internal.impl.descriptors;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: DescriptorVisibility.kt */
/* loaded from: classes7.dex */
public abstract class u {
    protected u() {
    }

    @fg.m
    public final Integer a(@fg.l u uVar) {
        kotlin.jvm.internal.l0.p(uVar, ProtectedSandApp.s("渷\u0001"));
        return b().a(uVar.b());
    }

    @fg.l
    public abstract o1 b();

    @fg.l
    public abstract String c();

    public final boolean d() {
        return b().c();
    }

    public abstract boolean e(@fg.m kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar, @fg.l q qVar, @fg.l m mVar, boolean z4);

    @fg.l
    public abstract u f();

    @fg.l
    public final String toString() {
        return b().b();
    }
}
