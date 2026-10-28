package androidx.compose.foundation.lazy.layout;

import kotlin.Metadata;
import kotlin.k2;

/* compiled from: LazyLayoutSemantics.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H¦@¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/g0;", "", "Landroidx/compose/ui/semantics/b;", "g", "()Landroidx/compose/ui/semantics/b;", "", "delta", "Lkotlin/k2;", "f", "(FLkotlin/coroutines/d;)Ljava/lang/Object;", "", "index", "e", "(ILkotlin/coroutines/d;)Ljava/lang/Object;", "b", "()F", "h", "c", "()I", "firstVisibleItemScrollOffset", "d", "firstVisibleItemIndex", "", "a", "()Z", "canScrollForward", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface g0 {
    boolean a();

    default float b() {
        return (d() * 500) + c();
    }

    int c();

    int d();

    @fg.m
    Object e(int i4, @fg.l kotlin.coroutines.d<? super k2> dVar);

    @fg.m
    Object f(float f4, @fg.l kotlin.coroutines.d<? super k2> dVar);

    @fg.l
    androidx.compose.ui.semantics.b g();

    default float h() {
        return a() ? b() + 100 : b();
    }
}
