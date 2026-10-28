package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;

/* compiled from: KotlinType.kt */
/* loaded from: classes5.dex */
public abstract class h0 implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.a, h4.i {

    /* renamed from: o, reason: collision with root package name */
    private int f26467o;

    public /* synthetic */ h0(kotlin.jvm.internal.w wVar) {
        this();
    }

    private final int R0() {
        if (j0.a(this)) {
            return super.hashCode();
        }
        return (V0() ? 1 : 0) + ((S0().hashCode() + (U0().hashCode() * 31)) * 31);
    }

    @d5.d
    public abstract kotlin.reflect.jvm.internal.impl.resolve.scopes.h C();

    @d5.d
    public abstract List<l1> S0();

    @d5.d
    public abstract d1 T0();

    @d5.d
    public abstract h1 U0();

    public abstract boolean V0();

    @d5.d
    public abstract h0 W0(@d5.d kotlin.reflect.jvm.internal.impl.types.checker.g gVar);

    @d5.d
    public abstract w1 X0();

    public final boolean equals(@d5.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return V0() == h0Var.V0() && kotlin.reflect.jvm.internal.impl.types.checker.r.f26370a.a(X0(), h0Var.X0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        return l.a(T0());
    }

    public final int hashCode() {
        int i5 = this.f26467o;
        if (i5 != 0) {
            return i5;
        }
        int R0 = R0();
        this.f26467o = R0;
        return R0;
    }

    private h0() {
    }
}
