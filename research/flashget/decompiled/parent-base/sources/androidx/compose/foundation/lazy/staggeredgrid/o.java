package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.runtime.b5;
import androidx.compose.runtime.o4;
import kotlin.Metadata;
import kotlin.jvm.internal.e1;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: LazyStaggeredGridItemProvider.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a6\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/j0;", "state", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/staggeredgrid/b0;", "Lkotlin/k2;", "Lkotlin/u;", "content", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/staggeredgrid/m;", "a", "(Landroidx/compose/foundation/lazy/staggeredgrid/j0;Lld/l;Landroidx/compose/runtime/t;I)Lld/a;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyStaggeredGridItemProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridItemProvider.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProviderKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,100:1\n36#2:101\n1116#3,6:102\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridItemProvider.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProviderKt\n*L\n43#1:101\n43#1:102,6\n*E\n"})
/* loaded from: classes.dex */
public final class o {

    /* compiled from: LazyStaggeredGridItemProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/i;", "a", "()Landroidx/compose/foundation/lazy/staggeredgrid/i;"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.a<i> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b5<ld.l<b0, k2>> f6435b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(b5<? extends ld.l<? super b0, k2>> b5Var) {
            super(0);
            this.f6435b = b5Var;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i invoke() {
            return new i(this.f6435b.getValue());
        }
    }

    /* compiled from: LazyStaggeredGridItemProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/n;", "a", "()Landroidx/compose/foundation/lazy/staggeredgrid/n;"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.a<n> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b5<i> f6436b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ j0 f6437c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(b5<i> b5Var, j0 j0Var) {
            super(0);
            this.f6436b = b5Var;
            this.f6437c = j0Var;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n invoke() {
            i value = this.f6436b.getValue();
            return new n(this.f6437c, value, new androidx.compose.foundation.lazy.layout.m0(this.f6437c.E(), value));
        }
    }

    @fg.l
    @androidx.compose.runtime.i
    public static final ld.a<m> a(@fg.l j0 j0Var, @fg.l ld.l<? super b0, k2> lVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(690901732);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(690901732, i4, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridItemProviderLambda (LazyStaggeredGridItemProvider.kt:40)");
        }
        b5 u4 = o4.u(lVar, tVar, (i4 >> 3) & 14);
        tVar.P(1157296644);
        boolean q02 = tVar.q0(j0Var);
        Object Q = tVar.Q();
        if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new e1(o4.d(o4.t(), new c(o4.d(o4.t(), new b(u4)), j0Var))) { // from class: androidx.compose.foundation.lazy.staggeredgrid.o.a
                @Override // kotlin.jvm.internal.e1, kotlin.reflect.p
                @fg.m
                public Object get() {
                    return ((b5) this.receiver).getValue();
                }
            };
            tVar.E(Q);
        }
        tVar.p0();
        kotlin.reflect.p pVar = (kotlin.reflect.p) Q;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return pVar;
    }
}
