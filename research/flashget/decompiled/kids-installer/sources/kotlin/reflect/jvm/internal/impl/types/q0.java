package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;

/* compiled from: KotlinTypeFactory.kt */
/* loaded from: classes6.dex */
final class q0 extends p0 {

    /* renamed from: p, reason: collision with root package name */
    @d5.d
    private final h1 f26518p;

    /* renamed from: q, reason: collision with root package name */
    @d5.d
    private final List<l1> f26519q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f26520r;

    /* renamed from: s, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.h f26521s;

    /* renamed from: t, reason: collision with root package name */
    @d5.d
    private final q3.l<kotlin.reflect.jvm.internal.impl.types.checker.g, p0> f26522t;

    /* JADX WARN: Multi-variable type inference failed */
    public q0(@d5.d h1 h1Var, @d5.d List<? extends l1> list, boolean z5, @d5.d kotlin.reflect.jvm.internal.impl.resolve.scopes.h hVar, @d5.d q3.l<? super kotlin.reflect.jvm.internal.impl.types.checker.g, ? extends p0> lVar) {
        kotlin.jvm.internal.l0.p(h1Var, ProtectedSandApp.s("襸"));
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("襹"));
        kotlin.jvm.internal.l0.p(hVar, ProtectedSandApp.s("襺"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("襻"));
        this.f26518p = h1Var;
        this.f26519q = list;
        this.f26520r = z5;
        this.f26521s = hVar;
        this.f26522t = lVar;
        if (!(hVar instanceof kotlin.reflect.jvm.internal.impl.types.error.f) || (hVar instanceof kotlin.reflect.jvm.internal.impl.types.error.l)) {
            return;
        }
        throw new IllegalStateException(ProtectedSandApp.s("襼") + hVar + '\n' + h1Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @d5.d
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h C() {
        return this.f26521s;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @d5.d
    public List<l1> S0() {
        return this.f26519q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @d5.d
    public d1 T0() {
        d1.f26381p.getClass();
        return d1.f26382q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @d5.d
    public h1 U0() {
        return this.f26518p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    public boolean V0() {
        return this.f26520r;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @d5.d
    public p0 b1(boolean z5) {
        return z5 == this.f26520r ? this : z5 ? new n0(this) : new l0(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @d5.d
    /* renamed from: c1 */
    public p0 a1(@d5.d d1 d1Var) {
        kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("襽"));
        return d1Var.isEmpty() ? this : new r0(this, d1Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @d5.d
    /* renamed from: d1, reason: merged with bridge method [inline-methods] */
    public p0 e1(@d5.d kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("襾"));
        p0 N = this.f26522t.N(gVar);
        return N == null ? this : N;
    }
}
