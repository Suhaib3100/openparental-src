package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: LazyStaggeredGridState.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "initialFirstVisibleItemIndex", "initialFirstVisibleItemScrollOffset", "Landroidx/compose/foundation/lazy/staggeredgrid/j0;", "a", "(IILandroidx/compose/runtime/t;II)Landroidx/compose/foundation/lazy/staggeredgrid/j0;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyStaggeredGridState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridState.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,524:1\n1116#2,6:525\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridState.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridStateKt\n*L\n69#1:525,6\n*E\n"})
/* loaded from: classes.dex */
public final class k0 {

    /* compiled from: LazyStaggeredGridState.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/j0;", "a", "()Landroidx/compose/foundation/lazy/staggeredgrid/j0;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<j0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f6411b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6412c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i4, int i5) {
            super(0);
            this.f6411b = i4;
            this.f6412c = i5;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j0 invoke() {
            return new j0(this.f6411b, this.f6412c);
        }
    }

    @fg.l
    @androidx.compose.runtime.i
    public static final j0 a(int i4, int i5, @fg.m androidx.compose.runtime.t tVar, int i6, int i7) {
        tVar.P(161145796);
        if ((i7 & 1) != 0) {
            i4 = 0;
        }
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(161145796, i6, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridState (LazyStaggeredGridState.kt:68)");
        }
        Object[] objArr = new Object[0];
        j0.INSTANCE.getClass();
        androidx.compose.runtime.saveable.l lVar = j0.B;
        tVar.P(2122269970);
        boolean f4 = tVar.f(i4) | tVar.f(i5);
        Object Q = tVar.Q();
        if (f4 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new a(i4, i5);
            tVar.E(Q);
        }
        tVar.p0();
        j0 j0Var = (j0) androidx.compose.runtime.saveable.d.d(objArr, lVar, null, (ld.a) Q, tVar, 72, 4);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return j0Var;
    }
}
