package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;

/* compiled from: KotlinType.kt */
/* loaded from: classes7.dex */
public abstract class h0 implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.a, ce.i {

    /* renamed from: b, reason: collision with root package name */
    private int f78476b;

    public /* synthetic */ h0(kotlin.jvm.internal.w wVar) {
        this();
    }

    private final int L0() {
        if (j0.a(this)) {
            return super.hashCode();
        }
        return (P0() ? 1 : 0) + ((M0().hashCode() + (O0().hashCode() * 31)) * 31);
    }

    @fg.l
    public abstract List<l1> M0();

    @fg.l
    public abstract d1 N0();

    @fg.l
    public abstract h1 O0();

    public abstract boolean P0();

    @fg.l
    public abstract h0 Q0(@fg.l kotlin.reflect.jvm.internal.impl.types.checker.g gVar);

    @fg.l
    public abstract w1 R0();

    public final boolean equals(@fg.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return P0() == h0Var.P0() && kotlin.reflect.jvm.internal.impl.types.checker.r.f78378a.a(R0(), h0Var.R0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        return l.a(N0());
    }

    public final int hashCode() {
        int i4 = this.f78476b;
        if (i4 != 0) {
            return i4;
        }
        int L0 = L0();
        this.f78476b = L0;
        return L0;
    }

    @fg.l
    public abstract kotlin.reflect.jvm.internal.impl.resolve.scopes.h q();

    private h0() {
    }
}
