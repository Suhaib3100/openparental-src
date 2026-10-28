package androidx.compose.ui.platform;

import android.view.View;
import kotlin.Metadata;

/* compiled from: NestedScrollInteropConnection.android.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u0012H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u0012H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Landroidx/compose/ui/platform/i2;", "Landroidx/compose/ui/input/nestedscroll/a;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Lkotlin/k2;", "a", "()V", "Li0/f;", "available", "Landroidx/compose/ui/input/nestedscroll/f;", "source", "i5", "(JI)J", "consumed", "H2", "(JJI)J", "Landroidx/compose/ui/unit/c0;", "F5", "(JLkotlin/coroutines/d;)Ljava/lang/Object;", "w0", "(JJLkotlin/coroutines/d;)Ljava/lang/Object;", "b", "Landroid/view/View;", "Landroidx/core/view/y0;", "c", "Landroidx/core/view/y0;", "nestedScrollChildHelper", "", "d", "[I", "consumedScrollCache", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i2 implements androidx.compose.ui.input.nestedscroll.a {

    /* renamed from: e, reason: collision with root package name */
    public static final int f19937e = 8;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final View view;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.core.view.y0 nestedScrollChildHelper;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final int[] consumedScrollCache;

    public i2(@fg.l View view) {
        this.view = view;
        androidx.core.view.y0 y0Var = new androidx.core.view.y0(view);
        y0Var.p(true);
        this.nestedScrollChildHelper = y0Var;
        this.consumedScrollCache = new int[2];
        androidx.core.view.x1.i2(view, true);
    }

    private final void a() {
        if (this.nestedScrollChildHelper.l(0)) {
            this.nestedScrollChildHelper.u(0);
        }
        if (this.nestedScrollChildHelper.l(1)) {
            this.nestedScrollChildHelper.u(1);
        }
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    @fg.m
    public Object F5(long j4, @fg.l kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> dVar) {
        if (!this.nestedScrollChildHelper.b(androidx.compose.ui.unit.c0.l(j4) * (-1.0f), androidx.compose.ui.unit.c0.n(j4) * (-1.0f))) {
            androidx.compose.ui.unit.c0.INSTANCE.getClass();
            j4 = androidx.compose.ui.unit.c0.f21491c;
        }
        a();
        return androidx.compose.ui.unit.c0.b(j4);
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public long H2(long consumed, long available, int source) {
        int g4;
        int k4;
        int k5;
        long j4;
        androidx.core.view.y0 y0Var = this.nestedScrollChildHelper;
        g4 = j2.g(available);
        k4 = j2.k(source);
        if (!y0Var.s(g4, k4)) {
            i0.f.INSTANCE.getClass();
            return i0.f.f74147c;
        }
        kotlin.collections.l.T1(this.consumedScrollCache, 0, 0, 0, 6, null);
        androidx.core.view.y0 y0Var2 = this.nestedScrollChildHelper;
        int f4 = j2.f(i0.f.p(consumed));
        int f5 = j2.f(i0.f.r(consumed));
        int f6 = j2.f(i0.f.p(available));
        int f7 = j2.f(i0.f.r(available));
        k5 = j2.k(source);
        y0Var2.e(f4, f5, f6, f7, null, k5, this.consumedScrollCache);
        j4 = j2.j(this.consumedScrollCache, available);
        return j4;
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public long i5(long available, int source) {
        int g4;
        int k4;
        int k5;
        long j4;
        androidx.core.view.y0 y0Var = this.nestedScrollChildHelper;
        g4 = j2.g(available);
        k4 = j2.k(source);
        if (!y0Var.s(g4, k4)) {
            i0.f.INSTANCE.getClass();
            return i0.f.f74147c;
        }
        kotlin.collections.l.T1(this.consumedScrollCache, 0, 0, 0, 6, null);
        androidx.core.view.y0 y0Var2 = this.nestedScrollChildHelper;
        int f4 = j2.f(i0.f.p(available));
        int f5 = j2.f(i0.f.r(available));
        int[] iArr = this.consumedScrollCache;
        k5 = j2.k(source);
        y0Var2.d(f4, f5, iArr, null, k5);
        j4 = j2.j(this.consumedScrollCache, available);
        return j4;
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    @fg.m
    public Object w0(long j4, long j5, @fg.l kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> dVar) {
        if (!this.nestedScrollChildHelper.a(androidx.compose.ui.unit.c0.l(j5) * (-1.0f), androidx.compose.ui.unit.c0.n(j5) * (-1.0f), true)) {
            androidx.compose.ui.unit.c0.INSTANCE.getClass();
            j5 = androidx.compose.ui.unit.c0.f21491c;
        }
        a();
        return androidx.compose.ui.unit.c0.b(j5);
    }
}
