package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: StarProjectionImpl.kt */
/* loaded from: classes7.dex */
public final class u0 extends m1 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final h0 f78559a;

    public u0(@fg.l kotlin.reflect.jvm.internal.impl.builtins.h hVar) {
        kotlin.jvm.internal.l0.p(hVar, ProtectedSandApp.s("聯\u0001"));
        p0 I = hVar.I();
        kotlin.jvm.internal.l0.o(I, ProtectedSandApp.s("聰\u0001"));
        this.f78559a = I;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    @fg.l
    public l1 a(@fg.l kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("聱\u0001"));
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    public boolean b() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    @fg.l
    public x1 c() {
        return x1.OUT_VARIANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    @fg.l
    public h0 getType() {
        return this.f78559a;
    }
}
