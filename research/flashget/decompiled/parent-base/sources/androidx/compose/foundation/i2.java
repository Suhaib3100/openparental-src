package androidx.compose.foundation;

import androidx.compose.runtime.x4;
import kotlin.Metadata;

/* compiled from: Overscroll.kt */
@x4
@z0
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J6\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H&ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ?\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH¦@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/i2;", "", "Li0/f;", "delta", "Landroidx/compose/ui/input/nestedscroll/f;", "source", "Lkotlin/Function1;", "performScroll", "c", "(JILld/l;)J", "Landroidx/compose/ui/unit/c0;", "velocity", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "performFling", "Lkotlin/k2;", "d", "(JLld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "a", "()Z", "isInProgress", "Landroidx/compose/ui/q;", "b", "()Landroidx/compose/ui/q;", "effectModifier", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface i2 {
    boolean a();

    @fg.l
    androidx.compose.ui.q b();

    long c(long delta, int source, @fg.l ld.l<? super i0.f, i0.f> performScroll);

    @fg.m
    Object d(long j4, @fg.l ld.p<? super androidx.compose.ui.unit.c0, ? super kotlin.coroutines.d<? super androidx.compose.ui.unit.c0>, ? extends Object> pVar, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar);
}
