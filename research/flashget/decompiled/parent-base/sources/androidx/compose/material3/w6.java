package androidx.compose.material3;

import androidx.compose.ui.layout.i1;
import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: InteractiveComponentSize.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\f\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"Landroidx/compose/material3/w6;", "Landroidx/compose/ui/q$d;", "Landroidx/compose/ui/node/h;", "Landroidx/compose/ui/node/c0;", "<init>", "()V", "Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "f", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/l0;J)Landroidx/compose/ui/layout/n0;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class w6 extends q.d implements androidx.compose.ui.node.h, androidx.compose.ui.node.c0 {

    /* renamed from: p, reason: collision with root package name */
    public static final int f15287p = 0;

    /* compiled from: InteractiveComponentSize.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f15288b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f15289c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f15290d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i4, androidx.compose.ui.layout.i1 i1Var, int i5) {
            super(1);
            this.f15288b = i4;
            this.f15289c = i1Var;
            this.f15290d = i5;
        }

        public final void a(@fg.l i1.a aVar) {
            i1.a.g(aVar, this.f15289c, kotlin.math.b.L0((this.f15288b - this.f15289c.getWidth()) / 2.0f), kotlin.math.b.L0((this.f15290d - this.f15289c.getHeight()) / 2.0f), 0.0f, 4, null);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
            a(aVar);
            return kotlin.k2.f75408a;
        }
    }

    @Override // androidx.compose.ui.node.c0
    @fg.l
    public androidx.compose.ui.layout.n0 f(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l androidx.compose.ui.layout.l0 l0Var, long j4) {
        long j5;
        j5 = a6.f9773c;
        androidx.compose.ui.layout.i1 m02 = l0Var.m0(j4);
        boolean z4 = getIsAttached() && ((Boolean) androidx.compose.ui.node.i.a(this, a6.b())).booleanValue();
        int max = z4 ? Math.max(m02.getWidth(), o0Var.q2(androidx.compose.ui.unit.l.p(j5))) : m02.getWidth();
        int max2 = z4 ? Math.max(m02.getHeight(), o0Var.q2(androidx.compose.ui.unit.l.m(j5))) : m02.getHeight();
        return androidx.compose.ui.layout.o0.x2(o0Var, max, max2, null, new a(max, m02, max2), 4, null);
    }
}
