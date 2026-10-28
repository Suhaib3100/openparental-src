package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.layout.i;
import androidx.compose.foundation.layout.j1;
import androidx.compose.foundation.layout.l1;
import androidx.compose.foundation.lazy.grid.j0;
import androidx.compose.runtime.g3;
import androidx.compose.runtime.snapshots.m;
import androidx.compose.ui.layout.i1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.z0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.q0;
import kotlinx.coroutines.r0;

/* compiled from: LazyGrid.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0080\u0001\u0010\u0017\u001a\u00020\u00142\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\u0002\b\u0015H\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001ax\u0010\"\u001a\u0019\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001e¢\u0006\u0002\b\u00152\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0003¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Landroidx/compose/ui/q;", "modifier", "Landroidx/compose/foundation/lazy/grid/k0;", "state", "Landroidx/compose/foundation/lazy/grid/h0;", "slots", "Landroidx/compose/foundation/layout/l1;", "contentPadding", "", "reverseLayout", "isVertical", "Landroidx/compose/foundation/gestures/e0;", "flingBehavior", "userScrollEnabled", "Landroidx/compose/foundation/layout/i$m;", "verticalArrangement", "Landroidx/compose/foundation/layout/i$e;", "horizontalArrangement", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/c0;", "Lkotlin/k2;", "Lkotlin/u;", "content", "a", "(Landroidx/compose/ui/q;Landroidx/compose/foundation/lazy/grid/k0;Landroidx/compose/foundation/lazy/grid/h0;Landroidx/compose/foundation/layout/l1;ZZLandroidx/compose/foundation/gestures/e0;ZLandroidx/compose/foundation/layout/i$m;Landroidx/compose/foundation/layout/i$e;Lld/l;Landroidx/compose/runtime/t;III)V", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/grid/n;", "itemProviderLambda", "Lkotlinx/coroutines/r0;", "coroutineScope", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/x;", "Landroidx/compose/ui/unit/b;", "Landroidx/compose/ui/layout/n0;", "b", "(Lld/a;Landroidx/compose/foundation/lazy/grid/k0;Landroidx/compose/foundation/lazy/grid/h0;Landroidx/compose/foundation/layout/l1;ZZLandroidx/compose/foundation/layout/i$e;Landroidx/compose/foundation/layout/i$m;Lkotlinx/coroutines/r0;Landroidx/compose/runtime/t;I)Lld/p;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyGrid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,376:1\n154#2:377\n487#3,4:378\n491#3,2:386\n495#3:392\n25#4:382\n83#4,3:395\n1116#5,3:383\n1119#5,3:389\n1116#5,6:398\n487#6:388\n74#7:393\n74#7:394\n*S KotlinDebug\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt\n*L\n63#1:377\n85#1:378,4\n85#1:386,2\n85#1:392\n85#1:382\n168#1:395,3\n85#1:383,3\n85#1:389,3\n168#1:398,6\n85#1:388\n117#1:393\n125#1:394\n*E\n"})
/* loaded from: classes.dex */
public final class t {

    /* compiled from: LazyGrid.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f5799b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k0 f5800c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ h0 f5801d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ l1 f5802e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f5803f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f5804g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.gestures.e0 f5805h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f5806i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ i.m f5807j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ i.e f5808k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ ld.l<c0, k2> f5809l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f5810m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f5811n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f5812o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.ui.q qVar, k0 k0Var, h0 h0Var, l1 l1Var, boolean z4, boolean z5, androidx.compose.foundation.gestures.e0 e0Var, boolean z6, i.m mVar, i.e eVar, ld.l<? super c0, k2> lVar, int i4, int i5, int i6) {
            super(2);
            this.f5799b = qVar;
            this.f5800c = k0Var;
            this.f5801d = h0Var;
            this.f5802e = l1Var;
            this.f5803f = z4;
            this.f5804g = z5;
            this.f5805h = e0Var;
            this.f5806i = z6;
            this.f5807j = mVar;
            this.f5808k = eVar;
            this.f5809l = lVar;
            this.f5810m = i4;
            this.f5811n = i5;
            this.f5812o = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            t.a(this.f5799b, this.f5800c, this.f5801d, this.f5802e, this.f5803f, this.f5804g, this.f5805h, this.f5806i, this.f5807j, this.f5808k, this.f5809l, tVar, g3.b(this.f5810m | 1), g3.b(this.f5811n), this.f5812o);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: LazyGrid.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/layout/x;", "Landroidx/compose/ui/unit/b;", "containerConstraints", "Landroidx/compose/foundation/lazy/grid/w;", "a", "(Landroidx/compose/foundation/lazy/layout/x;J)Landroidx/compose/foundation/lazy/grid/w;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyGrid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,376:1\n495#2,4:377\n500#2:386\n129#3,5:381\n*S KotlinDebug\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1\n*L\n321#1:377,4\n321#1:386\n321#1:381,5\n*E\n"})
    static final class b extends n0 implements ld.p<androidx.compose.foundation.lazy.layout.x, androidx.compose.ui.unit.b, w> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f5813b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ l1 f5814c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f5815d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.a<n> f5816e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ h0 f5817f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ k0 f5818g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ i.m f5819h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ i.e f5820i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ r0 f5821j;

        /* compiled from: LazyGrid.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u00030\u0002j\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003`\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "line", "Ljava/util/ArrayList;", "Lkotlin/q0;", "Landroidx/compose/ui/unit/b;", "Lkotlin/collections/ArrayList;", "a", "(I)Ljava/util/ArrayList;"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nLazyGrid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,376:1\n33#2,6:377\n*S KotlinDebug\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1$1\n*L\n309#1:377,6\n*E\n"})
        static final class a extends n0 implements ld.l<Integer, ArrayList<q0<? extends Integer, ? extends androidx.compose.ui.unit.b>>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j0 f5822b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ d f5823c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j0 j0Var, d dVar) {
                super(1);
                this.f5822b = j0Var;
                this.f5823c = dVar;
            }

            @fg.l
            public final ArrayList<q0<Integer, androidx.compose.ui.unit.b>> a(int i4) {
                j0.c c5 = this.f5822b.c(i4);
                int firstItemIndex = c5.getFirstItemIndex();
                ArrayList<q0<Integer, androidx.compose.ui.unit.b>> arrayList = new ArrayList<>(c5.b().size());
                List<androidx.compose.foundation.lazy.grid.b> b5 = c5.b();
                d dVar = this.f5823c;
                int size = b5.size();
                int i5 = 0;
                for (int i6 = 0; i6 < size; i6++) {
                    int packedValue = (int) b5.get(i6).getPackedValue();
                    arrayList.add(new q0<>(Integer.valueOf(firstItemIndex), androidx.compose.ui.unit.b.b(dVar.a(i5, packedValue))));
                    firstItemIndex++;
                    i5 += packedValue;
                }
                return arrayList;
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ ArrayList<q0<? extends Integer, ? extends androidx.compose.ui.unit.b>> invoke(Integer num) {
                return a(num.intValue());
            }
        }

        /* compiled from: LazyGrid.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "width", "height", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "Lkotlin/u;", "placement", "Landroidx/compose/ui/layout/n0;", "a", "(IILld/l;)Landroidx/compose/ui/layout/n0;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.lazy.grid.t$b$b, reason: collision with other inner class name */
        static final class C0104b extends n0 implements ld.q<Integer, Integer, ld.l<? super i1.a, ? extends k2>, androidx.compose.ui.layout.n0> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.lazy.layout.x f5824b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f5825c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f5826d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f5827e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0104b(androidx.compose.foundation.lazy.layout.x xVar, long j4, int i4, int i5) {
                super(3);
                this.f5824b = xVar;
                this.f5825c = j4;
                this.f5826d = i4;
                this.f5827e = i5;
            }

            @Override // ld.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.layout.n0 R(Integer num, Integer num2, ld.l<? super i1.a, ? extends k2> lVar) {
                return a(num.intValue(), num2.intValue(), lVar);
            }

            @fg.l
            public final androidx.compose.ui.layout.n0 a(int i4, int i5, @fg.l ld.l<? super i1.a, k2> lVar) {
                return this.f5824b.U3(androidx.compose.ui.unit.c.g(this.f5825c, i4 + this.f5826d), androidx.compose.ui.unit.c.f(this.f5825c, i5 + this.f5827e), z0.z(), lVar);
            }
        }

        /* compiled from: LazyGrid.kt */
        @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JG\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"androidx/compose/foundation/lazy/grid/t$b$c", "Landroidx/compose/foundation/lazy/grid/z;", "", "index", "", "key", "contentType", "crossAxisSize", "mainAxisSpacing", "", "Landroidx/compose/ui/layout/i1;", "placeables", "Landroidx/compose/foundation/lazy/grid/x;", "a", "(ILjava/lang/Object;Ljava/lang/Object;IILjava/util/List;)Landroidx/compose/foundation/lazy/grid/x;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class c extends z {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.lazy.layout.x f5828e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ k0 f5829f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ boolean f5830g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ boolean f5831h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ int f5832i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ int f5833j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ long f5834k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(n nVar, androidx.compose.foundation.lazy.layout.x xVar, int i4, k0 k0Var, boolean z4, boolean z5, int i5, int i6, long j4) {
                super(nVar, xVar, i4);
                this.f5828e = xVar;
                this.f5829f = k0Var;
                this.f5830g = z4;
                this.f5831h = z5;
                this.f5832i = i5;
                this.f5833j = i6;
                this.f5834k = j4;
            }

            @Override // androidx.compose.foundation.lazy.grid.z
            @fg.l
            public x a(int index, @fg.l Object key, @fg.m Object contentType, int crossAxisSize, int mainAxisSpacing, @fg.l List<? extends i1> placeables) {
                return new x(index, key, this.f5830g, crossAxisSize, mainAxisSpacing, this.f5831h, this.f5828e.getLayoutDirection(), this.f5832i, this.f5833j, placeables, this.f5834k, contentType, this.f5829f.getPlacementAnimator(), null);
            }
        }

        /* compiled from: LazyGrid.kt */
        @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J;\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"androidx/compose/foundation/lazy/grid/t$b$d", "Landroidx/compose/foundation/lazy/grid/b0;", "", "index", "", "Landroidx/compose/foundation/lazy/grid/x;", "items", "", "Landroidx/compose/foundation/lazy/grid/b;", "spans", "mainAxisSpacing", "Landroidx/compose/foundation/lazy/grid/a0;", "b", "(I[Landroidx/compose/foundation/lazy/grid/x;Ljava/util/List;I)Landroidx/compose/foundation/lazy/grid/a0;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class d extends b0 {

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ boolean f5835h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ g0 f5836i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(boolean z4, g0 g0Var, int i4, int i5, c cVar, j0 j0Var) {
                super(z4, g0Var, i4, i5, cVar, j0Var);
                this.f5835h = z4;
                this.f5836i = g0Var;
            }

            @Override // androidx.compose.foundation.lazy.grid.b0
            @fg.l
            public a0 b(int index, @fg.l x[] items, @fg.l List<androidx.compose.foundation.lazy.grid.b> spans, int mainAxisSpacing) {
                return new a0(index, items, this.f5836i, spans, this.f5835h, mainAxisSpacing);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(boolean z4, l1 l1Var, boolean z5, ld.a<? extends n> aVar, h0 h0Var, k0 k0Var, i.m mVar, i.e eVar, r0 r0Var) {
            super(2);
            this.f5813b = z4;
            this.f5814c = l1Var;
            this.f5815d = z5;
            this.f5816e = aVar;
            this.f5817f = h0Var;
            this.f5818g = k0Var;
            this.f5819h = mVar;
            this.f5820i = eVar;
            this.f5821j = r0Var;
        }

        @fg.l
        public final w a(@fg.l androidx.compose.foundation.lazy.layout.x xVar, long j4) {
            float spacing;
            long a5;
            int s4;
            int i4;
            androidx.compose.foundation.f0.a(j4, this.f5813b ? androidx.compose.foundation.gestures.j0.Vertical : androidx.compose.foundation.gestures.j0.Horizontal);
            int q22 = this.f5813b ? xVar.q2(this.f5814c.b(xVar.getLayoutDirection())) : xVar.q2(j1.i(this.f5814c, xVar.getLayoutDirection()));
            int q23 = this.f5813b ? xVar.q2(this.f5814c.c(xVar.getLayoutDirection())) : xVar.q2(j1.h(this.f5814c, xVar.getLayoutDirection()));
            int q24 = xVar.q2(this.f5814c.getTop());
            int q25 = xVar.q2(this.f5814c.getBottom());
            int i5 = q24 + q25;
            int i6 = q22 + q23;
            boolean z4 = this.f5813b;
            int i7 = z4 ? i5 : i6;
            int i10 = (!z4 || this.f5815d) ? (z4 && this.f5815d) ? q25 : (z4 || this.f5815d) ? q23 : q22 : q24;
            int i11 = i7 - i10;
            long i12 = androidx.compose.ui.unit.c.i(j4, -i6, -i5);
            n invoke = this.f5816e.invoke();
            j0 j5 = invoke.j();
            g0 a6 = this.f5817f.a(xVar, j4);
            int length = a6.getSizes().length;
            j5.h(length);
            this.f5818g.S(xVar);
            this.f5818g.W(length);
            if (this.f5813b) {
                i.m mVar = this.f5819h;
                if (mVar == null) {
                    throw new IllegalArgumentException("null verticalArrangement when isVertical == true");
                }
                spacing = mVar.getSpacing();
            } else {
                i.e eVar = this.f5820i;
                if (eVar == null) {
                    throw new IllegalArgumentException("null horizontalArrangement when isVertical == false");
                }
                spacing = eVar.getSpacing();
            }
            int q26 = xVar.q2(spacing);
            int b5 = invoke.b();
            int o4 = this.f5813b ? androidx.compose.ui.unit.b.o(j4) - i5 : androidx.compose.ui.unit.b.p(j4) - i6;
            if (!this.f5815d || o4 > 0) {
                a5 = androidx.compose.ui.unit.r.a(q22, q24);
            } else {
                boolean z5 = this.f5813b;
                if (!z5) {
                    q22 += o4;
                }
                if (z5) {
                    q24 += o4;
                }
                a5 = androidx.compose.ui.unit.r.a(q22, q24);
            }
            c cVar = new c(invoke, xVar, q26, this.f5818g, this.f5813b, this.f5815d, i10, i11, a5);
            d dVar = new d(this.f5813b, a6, b5, q26, cVar, j5);
            this.f5818g.T(new a(j5, dVar));
            m.Companion companion = androidx.compose.runtime.snapshots.m.INSTANCE;
            k0 k0Var = this.f5818g;
            androidx.compose.runtime.snapshots.m c5 = companion.c();
            try {
                androidx.compose.runtime.snapshots.m r4 = c5.r();
                try {
                    int Z = k0Var.Z(invoke, k0Var.r());
                    if (Z >= b5 && b5 > 0) {
                        i4 = j5.d(b5 - 1);
                        s4 = 0;
                        k2 k2Var = k2.f75408a;
                        c5.y(r4);
                        c5.d();
                        w d5 = v.d(b5, dVar, cVar, o4, i10, i11, q26, i4, s4, this.f5818g.getScrollToBeConsumed(), i12, this.f5813b, this.f5819h, this.f5820i, this.f5815d, xVar, this.f5818g.getPlacementAnimator(), j5, androidx.compose.foundation.lazy.layout.o.a(invoke, this.f5818g.getPinnedItems(), this.f5818g.getBeyondBoundsInfo()), this.f5821j, this.f5818g.C(), new C0104b(xVar, j4, i6, i5));
                        k0.m(this.f5818g, d5, false, 2, null);
                        return d5;
                    }
                    int d6 = j5.d(Z);
                    s4 = k0Var.s();
                    i4 = d6;
                    k2 k2Var2 = k2.f75408a;
                    c5.y(r4);
                    c5.d();
                    w d52 = v.d(b5, dVar, cVar, o4, i10, i11, q26, i4, s4, this.f5818g.getScrollToBeConsumed(), i12, this.f5813b, this.f5819h, this.f5820i, this.f5815d, xVar, this.f5818g.getPlacementAnimator(), j5, androidx.compose.foundation.lazy.layout.o.a(invoke, this.f5818g.getPinnedItems(), this.f5818g.getBeyondBoundsInfo()), this.f5821j, this.f5818g.C(), new C0104b(xVar, j4, i6, i5));
                    k0.m(this.f5818g, d52, false, 2, null);
                    return d52;
                } catch (Throwable th) {
                    c5.y(r4);
                    throw th;
                }
            } catch (Throwable th2) {
                c5.d();
                throw th2;
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ w invoke(androidx.compose.foundation.lazy.layout.x xVar, androidx.compose.ui.unit.b bVar) {
            return a(xVar, bVar.getValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0136  */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@fg.m androidx.compose.ui.q r30, @fg.l androidx.compose.foundation.lazy.grid.k0 r31, @fg.l androidx.compose.foundation.lazy.grid.h0 r32, @fg.m androidx.compose.foundation.layout.l1 r33, boolean r34, boolean r35, @fg.m androidx.compose.foundation.gestures.e0 r36, boolean r37, @fg.l androidx.compose.foundation.layout.i.m r38, @fg.l androidx.compose.foundation.layout.i.e r39, @fg.l ld.l<? super androidx.compose.foundation.lazy.grid.c0, kotlin.k2> r40, @fg.m androidx.compose.runtime.t r41, int r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.t.a(androidx.compose.ui.q, androidx.compose.foundation.lazy.grid.k0, androidx.compose.foundation.lazy.grid.h0, androidx.compose.foundation.layout.l1, boolean, boolean, androidx.compose.foundation.gestures.e0, boolean, androidx.compose.foundation.layout.i$m, androidx.compose.foundation.layout.i$e, ld.l, androidx.compose.runtime.t, int, int, int):void");
    }

    @androidx.compose.runtime.i
    private static final ld.p<androidx.compose.foundation.lazy.layout.x, androidx.compose.ui.unit.b, androidx.compose.ui.layout.n0> b(ld.a<? extends n> aVar, k0 k0Var, h0 h0Var, l1 l1Var, boolean z4, boolean z5, i.e eVar, i.m mVar, r0 r0Var, androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-2068958445);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-2068958445, i4, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:167)");
        }
        Object[] objArr = {k0Var, h0Var, l1Var, Boolean.valueOf(z4), Boolean.valueOf(z5), eVar, mVar};
        tVar.P(-568225417);
        boolean z6 = false;
        for (int i5 = 0; i5 < 7; i5++) {
            z6 |= tVar.q0(objArr[i5]);
        }
        Object Q = tVar.Q();
        if (z6 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new b(z5, l1Var, z4, aVar, h0Var, k0Var, mVar, eVar, r0Var);
            tVar.E(Q);
        }
        tVar.p0();
        ld.p<androidx.compose.foundation.lazy.layout.x, androidx.compose.ui.unit.b, androidx.compose.ui.layout.n0> pVar = (ld.p) Q;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return pVar;
    }
}
