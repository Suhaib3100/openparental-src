package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.types.checker.e;
import kotlin.reflect.jvm.internal.impl.types.h0;

/* compiled from: CapturedTypeApproximation.kt */
/* loaded from: classes7.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    @l
    private final f1 f78556a;

    /* renamed from: b, reason: collision with root package name */
    @l
    private final h0 f78557b;

    /* renamed from: c, reason: collision with root package name */
    @l
    private final h0 f78558c;

    public c(@l f1 f1Var, @l h0 h0Var, @l h0 h0Var2) {
        l0.p(f1Var, ProtectedSandApp.s("聬\u0001"));
        l0.p(h0Var, ProtectedSandApp.s("聭\u0001"));
        l0.p(h0Var2, ProtectedSandApp.s("聮\u0001"));
        this.f78556a = f1Var;
        this.f78557b = h0Var;
        this.f78558c = h0Var2;
    }

    @l
    public final h0 a() {
        return this.f78557b;
    }

    @l
    public final h0 b() {
        return this.f78558c;
    }

    @l
    public final f1 c() {
        return this.f78556a;
    }

    public final boolean d() {
        return e.f78349a.d(this.f78557b, this.f78558c);
    }
}
