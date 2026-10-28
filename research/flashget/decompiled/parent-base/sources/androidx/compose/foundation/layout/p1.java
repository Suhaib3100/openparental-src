package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.i1;
import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: Padding.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\r\u001a\u00020\f*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/layout/p1;", "Landroidx/compose/ui/node/c0;", "Landroidx/compose/ui/q$d;", "Landroidx/compose/foundation/layout/l1;", "paddingValues", "<init>", "(Landroidx/compose/foundation/layout/l1;)V", "Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "f", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/l0;J)Landroidx/compose/ui/layout/n0;", "p", "Landroidx/compose/foundation/layout/l1;", "y7", "()Landroidx/compose/foundation/layout/l1;", "z7", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValuesModifier\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,467:1\n154#2:468\n154#2:469\n154#2:470\n154#2:471\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValuesModifier\n*L\n443#1:468\n444#1:469\n445#1:470\n446#1:471\n*E\n"})
/* loaded from: classes.dex */
final class p1 extends q.d implements androidx.compose.ui.node.c0 {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private l1 paddingValues;

    /* compiled from: Padding.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f5240b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.o0 f5241c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ p1 f5242d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.layout.i1 i1Var, androidx.compose.ui.layout.o0 o0Var, p1 p1Var) {
            super(1);
            this.f5240b = i1Var;
            this.f5241c = o0Var;
            this.f5242d = p1Var;
        }

        public final void a(@fg.l i1.a aVar) {
            i1.a.g(aVar, this.f5240b, this.f5241c.q2(this.f5242d.getPaddingValues().b(this.f5241c.getLayoutDirection())), this.f5241c.q2(this.f5242d.getPaddingValues().getTop()), 0.0f, 4, null);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
            a(aVar);
            return kotlin.k2.f75408a;
        }
    }

    public p1(@fg.l l1 l1Var) {
        this.paddingValues = l1Var;
    }

    @Override // androidx.compose.ui.node.c0
    @fg.l
    public androidx.compose.ui.layout.n0 f(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l androidx.compose.ui.layout.l0 l0Var, long j4) {
        float f4 = 0;
        if (Float.compare(this.paddingValues.b(o0Var.getLayoutDirection()), androidx.compose.ui.unit.h.g(f4)) < 0 || Float.compare(this.paddingValues.getTop(), f4) < 0 || Float.compare(this.paddingValues.c(o0Var.getLayoutDirection()), f4) < 0 || Float.compare(this.paddingValues.getBottom(), f4) < 0) {
            throw new IllegalArgumentException("Padding must be non-negative");
        }
        int q22 = o0Var.q2(this.paddingValues.c(o0Var.getLayoutDirection())) + o0Var.q2(this.paddingValues.b(o0Var.getLayoutDirection()));
        int q23 = o0Var.q2(this.paddingValues.getBottom()) + o0Var.q2(this.paddingValues.getTop());
        androidx.compose.ui.layout.i1 m02 = l0Var.m0(androidx.compose.ui.unit.c.i(j4, -q22, -q23));
        return androidx.compose.ui.layout.o0.x2(o0Var, androidx.compose.ui.unit.c.g(j4, m02.getWidth() + q22), androidx.compose.ui.unit.c.f(j4, m02.getHeight() + q23), null, new a(m02, o0Var, this), 4, null);
    }

    @fg.l
    /* renamed from: y7, reason: from getter */
    public final l1 getPaddingValues() {
        return this.paddingValues;
    }

    public final void z7(@fg.l l1 l1Var) {
        this.paddingValues = l1Var;
    }
}
