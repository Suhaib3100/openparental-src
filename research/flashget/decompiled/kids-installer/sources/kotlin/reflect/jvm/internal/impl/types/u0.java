package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: StarProjectionImpl.kt */
/* loaded from: classes6.dex */
public final class u0 extends m1 {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final h0 f26550a;

    public u0(@d5.d kotlin.reflect.jvm.internal.impl.builtins.h hVar) {
        kotlin.jvm.internal.l0.p(hVar, ProtectedSandApp.s("覤"));
        p0 I = hVar.I();
        kotlin.jvm.internal.l0.o(I, ProtectedSandApp.s("覥"));
        this.f26550a = I;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    @d5.d
    public l1 a(@d5.d kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("覦"));
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    @d5.d
    public x1 b() {
        return x1.OUT_VARIANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    public boolean c() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    @d5.d
    public h0 getType() {
        return this.f26550a;
    }
}
