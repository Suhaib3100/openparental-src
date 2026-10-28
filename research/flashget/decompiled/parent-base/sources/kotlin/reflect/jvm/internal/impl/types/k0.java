package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: SpecialTypes.kt */
/* loaded from: classes7.dex */
public final class k0 extends y1 {

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.n f78497c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private final ld.a<h0> f78498d;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.i<h0> f78499e;

    /* compiled from: SpecialTypes.kt */
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<h0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.checker.g f78500b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k0 f78501c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.reflect.jvm.internal.impl.types.checker.g gVar, k0 k0Var) {
            super(0);
            this.f78500b = gVar;
            this.f78501c = k0Var;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h0 invoke() {
            return this.f78500b.a((ce.i) this.f78501c.f78498d.invoke());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k0(@fg.l kotlin.reflect.jvm.internal.impl.storage.n nVar, @fg.l ld.a<? extends h0> aVar) {
        kotlin.jvm.internal.l0.p(nVar, ProtectedSandApp.s("罻\u0001"));
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("罼\u0001"));
        this.f78497c = nVar;
        this.f78498d = aVar;
        this.f78499e = nVar.h(aVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y1
    @fg.l
    protected h0 S0() {
        return this.f78499e.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y1
    public boolean T0() {
        return this.f78499e.Q();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @fg.l
    /* renamed from: V0, reason: merged with bridge method [inline-methods] */
    public k0 Y0(@fg.l kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("罽\u0001"));
        return new k0(this.f78497c, new a(gVar, this));
    }
}
