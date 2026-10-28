package kotlin.reflect.jvm.internal.impl.types.checker;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.types.checker.f;
import kotlin.reflect.jvm.internal.impl.types.g1;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.w1;

/* compiled from: NewKotlinTypeChecker.kt */
/* loaded from: classes7.dex */
public final class m implements l {

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final g f78372c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private final f f78373d;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.resolve.l f78374e;

    public m(@fg.l g gVar, @fg.l f fVar) {
        l0.p(gVar, ProtectedSandApp.s("綈\u0001"));
        l0.p(fVar, ProtectedSandApp.s("綉\u0001"));
        this.f78372c = gVar;
        this.f78373d = fVar;
        kotlin.reflect.jvm.internal.impl.resolve.l m4 = kotlin.reflect.jvm.internal.impl.resolve.l.m(gVar);
        l0.o(m4, ProtectedSandApp.s("綊\u0001"));
        this.f78374e = m4;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.l
    @fg.l
    public kotlin.reflect.jvm.internal.impl.resolve.l a() {
        return this.f78374e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.e
    public boolean b(@fg.l h0 h0Var, @fg.l h0 h0Var2) {
        l0.p(h0Var, ProtectedSandApp.s("綋\u0001"));
        l0.p(h0Var2, ProtectedSandApp.s("綌\u0001"));
        return e(a.b(false, false, null, this.f78373d, this.f78372c, 6, null), h0Var.R0(), h0Var2.R0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.l
    @fg.l
    public g c() {
        return this.f78372c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.e
    public boolean d(@fg.l h0 h0Var, @fg.l h0 h0Var2) {
        l0.p(h0Var, ProtectedSandApp.s("綍\u0001"));
        l0.p(h0Var2, ProtectedSandApp.s("綎\u0001"));
        return g(a.b(true, false, null, this.f78373d, this.f78372c, 6, null), h0Var.R0(), h0Var2.R0());
    }

    public final boolean e(@fg.l g1 g1Var, @fg.l w1 w1Var, @fg.l w1 w1Var2) {
        l0.p(g1Var, ProtectedSandApp.s("綏\u0001"));
        l0.p(w1Var, ProtectedSandApp.s("綋\u0001"));
        l0.p(w1Var2, ProtectedSandApp.s("綌\u0001"));
        return kotlin.reflect.jvm.internal.impl.types.g.f78427a.k(g1Var, w1Var, w1Var2);
    }

    @fg.l
    public f f() {
        return this.f78373d;
    }

    public final boolean g(@fg.l g1 g1Var, @fg.l w1 w1Var, @fg.l w1 w1Var2) {
        l0.p(g1Var, ProtectedSandApp.s("綏\u0001"));
        l0.p(w1Var, ProtectedSandApp.s("綐\u0001"));
        l0.p(w1Var2, ProtectedSandApp.s("綑\u0001"));
        return kotlin.reflect.jvm.internal.impl.types.g.t(kotlin.reflect.jvm.internal.impl.types.g.f78427a, g1Var, w1Var, w1Var2, false, 8, null);
    }

    public /* synthetic */ m(g gVar, f fVar, int i4, kotlin.jvm.internal.w wVar) {
        this(gVar, (i4 & 2) != 0 ? f.a.f78350a : fVar);
    }
}
