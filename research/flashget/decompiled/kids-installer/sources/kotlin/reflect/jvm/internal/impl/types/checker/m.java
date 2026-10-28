package kotlin.reflect.jvm.internal.impl.types.checker;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.types.checker.f;
import kotlin.reflect.jvm.internal.impl.types.g1;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.w1;

/* compiled from: NewKotlinTypeChecker.kt */
/* loaded from: classes6.dex */
public final class m implements l {

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final g f26364c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private final f f26365d;

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.resolve.k f26366e;

    public m(@d5.d g gVar, @d5.d f fVar) {
        l0.p(gVar, ProtectedSandApp.s("袪"));
        l0.p(fVar, ProtectedSandApp.s("被"));
        this.f26364c = gVar;
        this.f26365d = fVar;
        kotlin.reflect.jvm.internal.impl.resolve.k m5 = kotlin.reflect.jvm.internal.impl.resolve.k.m(gVar);
        l0.o(m5, ProtectedSandApp.s("袬"));
        this.f26366e = m5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.l
    @d5.d
    public kotlin.reflect.jvm.internal.impl.resolve.k a() {
        return this.f26366e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.e
    public boolean b(@d5.d h0 h0Var, @d5.d h0 h0Var2) {
        l0.p(h0Var, ProtectedSandApp.s("袭"));
        l0.p(h0Var2, ProtectedSandApp.s("袮"));
        return e(a.b(false, false, null, this.f26365d, this.f26364c, 6, null), h0Var.X0(), h0Var2.X0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.l
    @d5.d
    public g c() {
        return this.f26364c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.e
    public boolean d(@d5.d h0 h0Var, @d5.d h0 h0Var2) {
        l0.p(h0Var, ProtectedSandApp.s("袯"));
        l0.p(h0Var2, ProtectedSandApp.s("袰"));
        return g(a.b(true, false, null, this.f26365d, this.f26364c, 6, null), h0Var.X0(), h0Var2.X0());
    }

    public final boolean e(@d5.d g1 g1Var, @d5.d w1 w1Var, @d5.d w1 w1Var2) {
        l0.p(g1Var, ProtectedSandApp.s("袱"));
        l0.p(w1Var, ProtectedSandApp.s("袲"));
        l0.p(w1Var2, ProtectedSandApp.s("袳"));
        return kotlin.reflect.jvm.internal.impl.types.g.f26418a.k(g1Var, w1Var, w1Var2);
    }

    @d5.d
    public f f() {
        return this.f26365d;
    }

    public final boolean g(@d5.d g1 g1Var, @d5.d w1 w1Var, @d5.d w1 w1Var2) {
        l0.p(g1Var, ProtectedSandApp.s("袴"));
        l0.p(w1Var, ProtectedSandApp.s("袵"));
        l0.p(w1Var2, ProtectedSandApp.s("袶"));
        return kotlin.reflect.jvm.internal.impl.types.g.t(kotlin.reflect.jvm.internal.impl.types.g.f26418a, g1Var, w1Var, w1Var2, false, 8, null);
    }

    public /* synthetic */ m(g gVar, f fVar, int i5, kotlin.jvm.internal.w wVar) {
        this(gVar, (i5 & 2) != 0 ? f.a.f26342a : fVar);
    }
}
