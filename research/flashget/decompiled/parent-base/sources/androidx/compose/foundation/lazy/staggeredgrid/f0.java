package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.p0;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: LazyStaggeredGridSemantics.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/j0;", "state", "", "reverseScrolling", "Landroidx/compose/foundation/lazy/layout/g0;", "a", "(Landroidx/compose/foundation/lazy/staggeredgrid/j0;ZLandroidx/compose/runtime/t;I)Landroidx/compose/foundation/lazy/layout/g0;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyStaggeredGridSemantics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridSemantics.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSemanticsKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,53:1\n50#2:54\n49#2:55\n1116#3,6:56\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridSemantics.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSemanticsKt\n*L\n32#1:54\n32#1:55\n32#1:56,6\n*E\n"})
/* loaded from: classes.dex */
public final class f0 {

    /* compiled from: LazyStaggeredGridSemantics.kt */
    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"androidx/compose/foundation/lazy/staggeredgrid/f0$a", "Landroidx/compose/foundation/lazy/layout/g0;", "", "delta", "Lkotlin/k2;", "f", "(FLkotlin/coroutines/d;)Ljava/lang/Object;", "", "index", "e", "(ILkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/ui/semantics/b;", "g", "()Landroidx/compose/ui/semantics/b;", "c", "()I", "firstVisibleItemScrollOffset", "d", "firstVisibleItemIndex", "", "a", "()Z", "canScrollForward", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements androidx.compose.foundation.lazy.layout.g0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j0 f6269a;

        a(j0 j0Var) {
            this.f6269a = j0Var;
        }

        @Override // androidx.compose.foundation.lazy.layout.g0
        public boolean a() {
            return this.f6269a.a();
        }

        @Override // androidx.compose.foundation.lazy.layout.g0
        public int c() {
            return this.f6269a.x();
        }

        @Override // androidx.compose.foundation.lazy.layout.g0
        public int d() {
            return this.f6269a.w();
        }

        @Override // androidx.compose.foundation.lazy.layout.g0
        @fg.m
        public Object e(int i4, @fg.l kotlin.coroutines.d<? super k2> dVar) {
            Object X = j0.X(this.f6269a, i4, 0, dVar, 2, null);
            return X == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? X : k2.f75408a;
        }

        @Override // androidx.compose.foundation.lazy.layout.g0
        @fg.m
        public Object f(float f4, @fg.l kotlin.coroutines.d<? super k2> dVar) {
            Object b5 = p0.b(this.f6269a, f4, null, dVar, 2, null);
            return b5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? b5 : k2.f75408a;
        }

        @Override // androidx.compose.foundation.lazy.layout.g0
        @fg.l
        public androidx.compose.ui.semantics.b g() {
            return new androidx.compose.ui.semantics.b(-1, -1);
        }
    }

    @fg.l
    @androidx.compose.runtime.i
    public static final androidx.compose.foundation.lazy.layout.g0 a(@fg.l j0 j0Var, boolean z4, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1629354903);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1629354903, i4, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridSemanticState (LazyStaggeredGridSemantics.kt:31)");
        }
        Boolean valueOf = Boolean.valueOf(z4);
        tVar.P(511388516);
        boolean q02 = tVar.q0(valueOf) | tVar.q0(j0Var);
        Object Q = tVar.Q();
        if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new a(j0Var);
            tVar.E(Q);
        }
        tVar.p0();
        a aVar = (a) Q;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return aVar;
    }
}
