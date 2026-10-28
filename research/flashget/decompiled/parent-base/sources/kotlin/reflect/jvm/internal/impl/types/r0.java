package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: KotlinTypeFactory.kt */
/* loaded from: classes7.dex */
final class r0 extends t {

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private final d1 f78537d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(@fg.l p0 p0Var, @fg.l d1 d1Var) {
        super(p0Var);
        kotlin.jvm.internal.l0.p(p0Var, ProtectedSandApp.s("翼\u0001"));
        kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("翽\u0001"));
        this.f78537d = d1Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.s, kotlin.reflect.jvm.internal.impl.types.h0
    @fg.l
    public d1 N0() {
        return this.f78537d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.s
    @fg.l
    /* renamed from: a1, reason: merged with bridge method [inline-methods] */
    public r0 Z0(@fg.l p0 p0Var) {
        kotlin.jvm.internal.l0.p(p0Var, ProtectedSandApp.s("翼\u0001"));
        return new r0(p0Var, this.f78537d);
    }
}
