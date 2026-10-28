package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.z0;
import androidx.compose.runtime.b5;
import androidx.compose.runtime.o4;
import kotlin.Metadata;
import kotlin.jvm.internal.e1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: LazyGridItemProvider.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a6\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/lazy/grid/k0;", "state", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/c0;", "Lkotlin/k2;", "Lkotlin/u;", "content", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/grid/n;", "a", "(Landroidx/compose/foundation/lazy/grid/k0;Lld/l;Landroidx/compose/runtime/t;I)Lld/a;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyGridItemProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridItemProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemProviderKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,101:1\n36#2:102\n1116#3,6:103\n*S KotlinDebug\n*F\n+ 1 LazyGridItemProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemProviderKt\n*L\n43#1:102\n43#1:103,6\n*E\n"})
/* loaded from: classes.dex */
public final class p {

    /* compiled from: LazyGridItemProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/grid/j;", "a", "()Landroidx/compose/foundation/lazy/grid/j;"}, k = 3, mv = {1, 8, 0})
    static final class b extends n0 implements ld.a<j> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b5<ld.l<c0, k2>> f5794b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(b5<? extends ld.l<? super c0, k2>> b5Var) {
            super(0);
            this.f5794b = b5Var;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j invoke() {
            return new j(this.f5794b.getValue());
        }
    }

    /* compiled from: LazyGridItemProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/grid/o;", "a", "()Landroidx/compose/foundation/lazy/grid/o;"}, k = 3, mv = {1, 8, 0})
    static final class c extends n0 implements ld.a<o> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b5<j> f5795b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k0 f5796c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(b5<j> b5Var, k0 k0Var) {
            super(0);
            this.f5795b = b5Var;
            this.f5796c = k0Var;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            j value = this.f5795b.getValue();
            return new o(this.f5796c, value, new androidx.compose.foundation.lazy.layout.m0(this.f5796c.w(), value));
        }
    }

    @fg.l
    @z0
    @androidx.compose.runtime.i
    public static final ld.a<n> a(@fg.l k0 k0Var, @fg.l ld.l<? super c0, k2> lVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-1898306282);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1898306282, i4, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridItemProviderLambda (LazyGridItemProvider.kt:40)");
        }
        b5 u4 = o4.u(lVar, tVar, (i4 >> 3) & 14);
        tVar.P(1157296644);
        boolean q02 = tVar.q0(k0Var);
        Object Q = tVar.Q();
        if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new e1(o4.d(o4.t(), new c(o4.d(o4.t(), new b(u4)), k0Var))) { // from class: androidx.compose.foundation.lazy.grid.p.a
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
