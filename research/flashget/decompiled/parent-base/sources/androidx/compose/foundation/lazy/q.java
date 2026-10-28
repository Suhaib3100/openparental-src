package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.m0;
import androidx.compose.runtime.b5;
import androidx.compose.runtime.o4;
import kotlin.Metadata;
import kotlin.jvm.internal.e1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: LazyListItemProvider.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a6\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/lazy/c0;", "state", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/y;", "Lkotlin/k2;", "Lkotlin/u;", "content", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/o;", "a", "(Landroidx/compose/foundation/lazy/c0;Lld/l;Landroidx/compose/runtime/t;I)Lld/a;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyListItemProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListItemProvider.kt\nandroidx/compose/foundation/lazy/LazyListItemProviderKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,106:1\n36#2:107\n1116#3,6:108\n*S KotlinDebug\n*F\n+ 1 LazyListItemProvider.kt\nandroidx/compose/foundation/lazy/LazyListItemProviderKt\n*L\n46#1:107\n46#1:108,6\n*E\n"})
/* loaded from: classes.dex */
public final class q {

    /* compiled from: LazyListItemProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/k;", "a", "()Landroidx/compose/foundation/lazy/k;"}, k = 3, mv = {1, 8, 0})
    static final class b extends n0 implements ld.a<k> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b5<ld.l<y, k2>> f6181b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(b5<? extends ld.l<? super y, k2>> b5Var) {
            super(0);
            this.f6181b = b5Var;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k invoke() {
            return new k(this.f6181b.getValue());
        }
    }

    /* compiled from: LazyListItemProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/p;", "a", "()Landroidx/compose/foundation/lazy/p;"}, k = 3, mv = {1, 8, 0})
    static final class c extends n0 implements ld.a<p> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b5<k> f6182b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c0 f6183c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.c f6184d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(b5<k> b5Var, c0 c0Var, androidx.compose.foundation.lazy.c cVar) {
            super(0);
            this.f6182b = b5Var;
            this.f6183c = c0Var;
            this.f6184d = cVar;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p invoke() {
            k value = this.f6182b.getValue();
            return new p(this.f6183c, value, this.f6184d, new m0(this.f6183c.B(), value));
        }
    }

    @fg.l
    @androidx.compose.runtime.i
    public static final ld.a<o> a(@fg.l c0 c0Var, @fg.l ld.l<? super y, k2> lVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-343736148);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-343736148, i4, -1, "androidx.compose.foundation.lazy.rememberLazyListItemProviderLambda (LazyListItemProvider.kt:43)");
        }
        b5 u4 = o4.u(lVar, tVar, (i4 >> 3) & 14);
        tVar.P(1157296644);
        boolean q02 = tVar.q0(c0Var);
        Object Q = tVar.Q();
        if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            androidx.compose.foundation.lazy.c cVar = new androidx.compose.foundation.lazy.c();
            Q = new e1(o4.d(o4.t(), new c(o4.d(o4.t(), new b(u4)), c0Var, cVar))) { // from class: androidx.compose.foundation.lazy.q.a
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
