package androidx.compose.foundation.lazy.layout;

import android.view.View;
import androidx.compose.foundation.z0;
import androidx.compose.runtime.g3;
import androidx.compose.runtime.t3;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: LazyLayoutPrefetcher.android.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/lazy/layout/d0;", "prefetchState", "Landroidx/compose/foundation/lazy/layout/q;", "itemContentFactory", "Landroidx/compose/ui/layout/r1;", "subcomposeLayoutState", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/lazy/layout/d0;Landroidx/compose/foundation/lazy/layout/q;Landroidx/compose/ui/layout/r1;Landroidx/compose/runtime/t;I)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyLayoutPrefetcher.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPrefetcher.android.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,319:1\n74#2:320\n67#3,3:321\n66#3:324\n1116#4,6:325\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPrefetcher.android.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher_androidKt\n*L\n41#1:320\n42#1:321,3\n42#1:324\n42#1:325,6\n*E\n"})
/* loaded from: classes.dex */
public final class f0 {

    /* compiled from: LazyLayoutPrefetcher.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d0 f5995b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ q f5996c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.r1 f5997d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f5998e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d0 d0Var, q qVar, androidx.compose.ui.layout.r1 r1Var, int i4) {
            super(2);
            this.f5995b = d0Var;
            this.f5996c = qVar;
            this.f5997d = r1Var;
            this.f5998e = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            f0.a(this.f5995b, this.f5996c, this.f5997d, tVar, g3.b(this.f5998e | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    @z0
    @androidx.compose.runtime.i
    public static final void a(@fg.l d0 d0Var, @fg.l q qVar, @fg.l androidx.compose.ui.layout.r1 r1Var, @fg.m androidx.compose.runtime.t tVar, int i4) {
        androidx.compose.runtime.t o4 = tVar.o(1113453182);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1113453182, i4, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutPrefetcher (LazyLayoutPrefetcher.android.kt:39)");
        }
        View view = (View) o4.x(androidx.compose.ui.platform.o0.k());
        int i5 = androidx.compose.ui.layout.r1.f19092f;
        o4.P(1618982084);
        boolean q02 = o4.q0(r1Var) | o4.q0(d0Var) | o4.q0(view);
        Object Q = o4.Q();
        if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            o4.E(new e0(d0Var, r1Var, qVar, view));
        }
        o4.p0();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new a(d0Var, qVar, r1Var, i4));
        }
    }
}
