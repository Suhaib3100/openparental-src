package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import com.flashget.kidsdownloader.ProtectedSandApp;
import d5.d;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.types.checker.e;
import kotlin.reflect.jvm.internal.impl.types.h0;

/* compiled from: CapturedTypeApproximation.kt */
/* loaded from: classes5.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    @d
    private final f1 f26547a;

    /* renamed from: b, reason: collision with root package name */
    @d
    private final h0 f26548b;

    /* renamed from: c, reason: collision with root package name */
    @d
    private final h0 f26549c;

    public c(@d f1 f1Var, @d h0 h0Var, @d h0 h0Var2) {
        l0.p(f1Var, ProtectedSandApp.s("堼"));
        l0.p(h0Var, ProtectedSandApp.s("堽"));
        l0.p(h0Var2, ProtectedSandApp.s("堾"));
        this.f26547a = f1Var;
        this.f26548b = h0Var;
        this.f26549c = h0Var2;
    }

    @d
    public final h0 a() {
        return this.f26548b;
    }

    @d
    public final h0 b() {
        return this.f26549c;
    }

    @d
    public final f1 c() {
        return this.f26547a;
    }

    public final boolean d() {
        return e.f26341a.d(this.f26548b, this.f26549c);
    }
}
