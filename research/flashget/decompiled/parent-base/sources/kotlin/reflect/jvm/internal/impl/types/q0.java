package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;

/* compiled from: KotlinTypeFactory.kt */
/* loaded from: classes7.dex */
final class q0 extends p0 {

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final h1 f78527c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private final List<l1> f78528d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f78529e;

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.h f78530f;

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private final ld.l<kotlin.reflect.jvm.internal.impl.types.checker.g, p0> f78531g;

    /* JADX WARN: Multi-variable type inference failed */
    public q0(@fg.l h1 h1Var, @fg.l List<? extends l1> list, boolean z4, @fg.l kotlin.reflect.jvm.internal.impl.resolve.scopes.h hVar, @fg.l ld.l<? super kotlin.reflect.jvm.internal.impl.types.checker.g, ? extends p0> lVar) {
        kotlin.jvm.internal.l0.p(h1Var, ProtectedSandApp.s("翄\u0001"));
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("翅\u0001"));
        kotlin.jvm.internal.l0.p(hVar, ProtectedSandApp.s("翆\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("翇\u0001"));
        this.f78527c = h1Var;
        this.f78528d = list;
        this.f78529e = z4;
        this.f78530f = hVar;
        this.f78531g = lVar;
        if (!(hVar instanceof kotlin.reflect.jvm.internal.impl.types.error.f) || (hVar instanceof kotlin.reflect.jvm.internal.impl.types.error.l)) {
            return;
        }
        throw new IllegalStateException(ProtectedSandApp.s("翈\u0001") + hVar + '\n' + h1Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @fg.l
    public List<l1> M0() {
        return this.f78528d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @fg.l
    public d1 N0() {
        d1.f78389c.getClass();
        return d1.f78390d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @fg.l
    public h1 O0() {
        return this.f78527c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    public boolean P0() {
        return this.f78529e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @fg.l
    public p0 V0(boolean z4) {
        return z4 == this.f78529e ? this : z4 ? new n0(this) : new l0(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @fg.l
    /* renamed from: W0 */
    public p0 U0(@fg.l d1 d1Var) {
        kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("翉\u0001"));
        return d1Var.isEmpty() ? this : new r0(this, d1Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @fg.l
    /* renamed from: X0, reason: merged with bridge method [inline-methods] */
    public p0 Y0(@fg.l kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("翊\u0001"));
        p0 invoke = this.f78531g.invoke(gVar);
        return invoke == null ? this : invoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @fg.l
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h q() {
        return this.f78530f;
    }
}
