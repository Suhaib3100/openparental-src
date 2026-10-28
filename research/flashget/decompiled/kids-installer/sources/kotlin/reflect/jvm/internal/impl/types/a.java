package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: SpecialTypes.kt */
/* loaded from: classes6.dex */
public final class a extends s {

    /* renamed from: p, reason: collision with root package name */
    @d5.d
    private final p0 f26331p;

    /* renamed from: q, reason: collision with root package name */
    @d5.d
    private final p0 f26332q;

    public a(@d5.d p0 p0Var, @d5.d p0 p0Var2) {
        kotlin.jvm.internal.l0.p(p0Var, ProtectedSandApp.s("衷"));
        kotlin.jvm.internal.l0.p(p0Var2, ProtectedSandApp.s("衸"));
        this.f26331p = p0Var;
        this.f26332q = p0Var2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @d5.d
    /* renamed from: c1, reason: merged with bridge method [inline-methods] */
    public p0 a1(@d5.d d1 d1Var) {
        kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("衹"));
        return new a(this.f26331p.a1(d1Var), this.f26332q);
    }

    @d5.d
    public final p0 d0() {
        return this.f26331p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.s
    @d5.d
    protected p0 d1() {
        return this.f26331p;
    }

    @d5.d
    public final p0 g1() {
        return this.f26332q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p0
    @d5.d
    /* renamed from: h1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public a b1(boolean z5) {
        return new a(this.f26331p.b1(z5), this.f26332q.b1(z5));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.s
    @d5.d
    /* renamed from: i1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public a e1(@d5.d kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("衺"));
        h0 a6 = gVar.a(this.f26331p);
        String s5 = ProtectedSandApp.s("衻");
        kotlin.jvm.internal.l0.n(a6, s5);
        h0 a7 = gVar.a(this.f26332q);
        kotlin.jvm.internal.l0.n(a7, s5);
        return new a((p0) a6, (p0) a7);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.s
    @d5.d
    /* renamed from: j1, reason: merged with bridge method [inline-methods] */
    public a f1(@d5.d p0 p0Var) {
        kotlin.jvm.internal.l0.p(p0Var, ProtectedSandApp.s("衼"));
        return new a(p0Var, this.f26332q);
    }
}
