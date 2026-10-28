package androidx.compose.foundation.lazy.grid;

import kotlin.Metadata;

/* compiled from: LazyGridDsl.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B&\u0012\u001d\u0010\u0007\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0002\b\u0006¢\u0006\u0004\b\b\u0010\tJ\"\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR+\u0010\u0007\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0002\b\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u001c\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/lazy/grid/c;", "Landroidx/compose/foundation/lazy/grid/h0;", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/d;", "Landroidx/compose/ui/unit/b;", "Landroidx/compose/foundation/lazy/grid/g0;", "Lkotlin/u;", "calculation", "<init>", "(Lld/p;)V", "density", "constraints", "a", "(Landroidx/compose/ui/unit/d;J)Landroidx/compose/foundation/lazy/grid/g0;", "Lld/p;", "b", "J", "cachedConstraints", "", "c", "F", "cachedDensity", "d", "Landroidx/compose/foundation/lazy/grid/g0;", "cachedSizes", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class c implements h0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.p<androidx.compose.ui.unit.d, androidx.compose.ui.unit.b, g0> calculation;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long cachedConstraints = androidx.compose.ui.unit.c.b(0, 0, 0, 0, 15, null);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float cachedDensity;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private g0 cachedSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@fg.l ld.p<? super androidx.compose.ui.unit.d, ? super androidx.compose.ui.unit.b, g0> pVar) {
        this.calculation = pVar;
    }

    @Override // androidx.compose.foundation.lazy.grid.h0
    @fg.l
    public g0 a(@fg.l androidx.compose.ui.unit.d density, long constraints) {
        if (this.cachedSizes != null && androidx.compose.ui.unit.b.g(this.cachedConstraints, constraints) && this.cachedDensity == density.getDensity()) {
            g0 g0Var = this.cachedSizes;
            kotlin.jvm.internal.l0.m(g0Var);
            return g0Var;
        }
        this.cachedConstraints = constraints;
        this.cachedDensity = density.getDensity();
        g0 invoke = this.calculation.invoke(density, androidx.compose.ui.unit.b.b(constraints));
        this.cachedSizes = invoke;
        return invoke;
    }
}
