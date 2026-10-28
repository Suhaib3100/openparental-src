package kotlin.reflect.jvm.internal.impl.descriptors;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: DescriptorVisibility.kt */
/* loaded from: classes5.dex */
public abstract class u {
    protected u() {
    }

    @d5.e
    public final Integer a(@d5.d u uVar) {
        kotlin.jvm.internal.l0.p(uVar, ProtectedSandApp.s("䠓"));
        return b().a(uVar.b());
    }

    @d5.d
    public abstract o1 b();

    @d5.d
    public abstract String c();

    public final boolean d() {
        return b().c();
    }

    public abstract boolean e(@d5.e kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar, @d5.d q qVar, @d5.d m mVar, boolean z5);

    @d5.d
    public abstract u f();

    @d5.d
    public final String toString() {
        return b().toString();
    }
}
