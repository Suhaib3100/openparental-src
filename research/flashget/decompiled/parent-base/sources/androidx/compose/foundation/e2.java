package androidx.compose.foundation;

import kotlin.Metadata;

/* compiled from: Overscroll.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ?\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/e2;", "Landroidx/compose/foundation/i2;", "<init>", "()V", "Li0/f;", "delta", "Landroidx/compose/ui/input/nestedscroll/f;", "source", "Lkotlin/Function1;", "performScroll", "c", "(JILld/l;)J", "Landroidx/compose/ui/unit/c0;", "velocity", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "performFling", "Lkotlin/k2;", "d", "(JLld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "a", "()Z", "isInProgress", "Landroidx/compose/ui/q;", "b", "()Landroidx/compose/ui/q;", "effectModifier", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e2 implements i2 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final e2 f3652a = new e2();

    /* renamed from: b, reason: collision with root package name */
    public static final int f3653b = 0;

    private e2() {
    }

    @Override // androidx.compose.foundation.i2
    public boolean a() {
        return false;
    }

    @Override // androidx.compose.foundation.i2
    @fg.l
    public androidx.compose.ui.q b() {
        return androidx.compose.ui.q.INSTANCE;
    }

    @Override // androidx.compose.foundation.i2
    public long c(long delta, int source, @fg.l ld.l<? super i0.f, i0.f> performScroll) {
        return performScroll.invoke(i0.f.d(delta)).getPackedValue();
    }

    @Override // androidx.compose.foundation.i2
    @fg.m
    public Object d(long j4, @fg.l ld.p<? super androidx.compose.ui.unit.c0, ? super kotlin.coroutines.d<? super androidx.compose.ui.unit.c0>, ? extends Object> pVar, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object invoke = pVar.invoke(androidx.compose.ui.unit.c0.b(j4), dVar);
        return invoke == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? invoke : kotlin.k2.f75408a;
    }
}
