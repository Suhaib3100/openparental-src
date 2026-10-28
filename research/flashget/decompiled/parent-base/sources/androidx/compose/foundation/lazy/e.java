package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.p0;
import androidx.compose.foundation.lazy.layout.g0;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: LazyLayoutSemanticState.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/lazy/c0;", "state", "", "isVertical", "Landroidx/compose/foundation/lazy/layout/g0;", "a", "(Landroidx/compose/foundation/lazy/c0;Z)Landroidx/compose/foundation/lazy/layout/g0;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e {

    /* compiled from: LazyLayoutSemanticState.kt */
    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"androidx/compose/foundation/lazy/e$a", "Landroidx/compose/foundation/lazy/layout/g0;", "", "delta", "Lkotlin/k2;", "f", "(FLkotlin/coroutines/d;)Ljava/lang/Object;", "", "index", "e", "(ILkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/ui/semantics/b;", "g", "()Landroidx/compose/ui/semantics/b;", "c", "()I", "firstVisibleItemScrollOffset", "d", "firstVisibleItemIndex", "", "a", "()Z", "canScrollForward", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements g0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c0 f5559a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f5560b;

        a(c0 c0Var, boolean z4) {
            this.f5559a = c0Var;
            this.f5560b = z4;
        }

        @Override // androidx.compose.foundation.lazy.layout.g0
        public boolean a() {
            return this.f5559a.a();
        }

        @Override // androidx.compose.foundation.lazy.layout.g0
        public int c() {
            return this.f5559a.v();
        }

        @Override // androidx.compose.foundation.lazy.layout.g0
        public int d() {
            return this.f5559a.u();
        }

        @Override // androidx.compose.foundation.lazy.layout.g0
        @fg.m
        public Object e(int i4, @fg.l kotlin.coroutines.d<? super k2> dVar) {
            Object S = c0.S(this.f5559a, i4, 0, dVar, 2, null);
            return S == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? S : k2.f75408a;
        }

        @Override // androidx.compose.foundation.lazy.layout.g0
        @fg.m
        public Object f(float f4, @fg.l kotlin.coroutines.d<? super k2> dVar) {
            Object b5 = p0.b(this.f5559a, f4, null, dVar, 2, null);
            return b5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? b5 : k2.f75408a;
        }

        @Override // androidx.compose.foundation.lazy.layout.g0
        @fg.l
        public androidx.compose.ui.semantics.b g() {
            return this.f5560b ? new androidx.compose.ui.semantics.b(-1, 1) : new androidx.compose.ui.semantics.b(1, -1);
        }
    }

    @fg.l
    public static final g0 a(@fg.l c0 c0Var, boolean z4) {
        return new a(c0Var, z4);
    }
}
