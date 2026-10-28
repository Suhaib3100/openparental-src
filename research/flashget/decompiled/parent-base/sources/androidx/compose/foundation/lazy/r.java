package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.j0;
import androidx.compose.foundation.layout.i;
import androidx.compose.foundation.layout.j1;
import androidx.compose.foundation.layout.l1;
import androidx.compose.runtime.g3;
import androidx.compose.runtime.snapshots.m;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.i1;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.z0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlinx.coroutines.r0;

/* compiled from: LazyList.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u009a\u0001\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0017\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016¢\u0006\u0002\b\u0019H\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u008c\u0001\u0010$\u001a\u0019\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0 ¢\u0006\u0002\b\u00192\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0003¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"Landroidx/compose/ui/q;", "modifier", "Landroidx/compose/foundation/lazy/c0;", "state", "Landroidx/compose/foundation/layout/l1;", "contentPadding", "", "reverseLayout", "isVertical", "Landroidx/compose/foundation/gestures/e0;", "flingBehavior", "userScrollEnabled", "", "beyondBoundsItemCount", "Landroidx/compose/ui/c$b;", "horizontalAlignment", "Landroidx/compose/foundation/layout/i$m;", "verticalArrangement", "Landroidx/compose/ui/c$c;", "verticalAlignment", "Landroidx/compose/foundation/layout/i$e;", "horizontalArrangement", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/y;", "Lkotlin/k2;", "Lkotlin/u;", "content", "a", "(Landroidx/compose/ui/q;Landroidx/compose/foundation/lazy/c0;Landroidx/compose/foundation/layout/l1;ZZLandroidx/compose/foundation/gestures/e0;ZILandroidx/compose/ui/c$b;Landroidx/compose/foundation/layout/i$m;Landroidx/compose/ui/c$c;Landroidx/compose/foundation/layout/i$e;Lld/l;Landroidx/compose/runtime/t;III)V", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/o;", "itemProviderLambda", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/x;", "Landroidx/compose/ui/unit/b;", "Landroidx/compose/ui/layout/n0;", "b", "(Lld/a;Landroidx/compose/foundation/lazy/c0;Landroidx/compose/foundation/layout/l1;ZZILandroidx/compose/ui/c$b;Landroidx/compose/ui/c$c;Landroidx/compose/foundation/layout/i$e;Landroidx/compose/foundation/layout/i$m;Landroidx/compose/runtime/t;II)Lld/p;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyList.kt\nandroidx/compose/foundation/lazy/LazyListKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,353:1\n487#2,4:354\n491#2,2:362\n495#2:368\n25#3:358\n83#3,3:371\n1116#4,3:359\n1119#4,3:365\n1116#4,6:374\n487#5:364\n74#6:369\n74#6:370\n*S KotlinDebug\n*F\n+ 1 LazyList.kt\nandroidx/compose/foundation/lazy/LazyListKt\n*L\n84#1:354,4\n84#1:362,2\n84#1:368\n84#1:358\n168#1:371,3\n84#1:359,3\n84#1:365,3\n168#1:374,6\n84#1:364\n121#1:369\n129#1:370\n*E\n"})
/* loaded from: classes.dex */
public final class r {

    /* compiled from: LazyList.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f6185b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c0 f6186c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ l1 f6187d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f6188e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f6189f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.gestures.e0 f6190g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f6191h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f6192i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ c.b f6193j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ i.m f6194k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ c.InterfaceC0326c f6195l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ i.e f6196m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ ld.l<y, k2> f6197n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f6198o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f6199p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f6200q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.ui.q qVar, c0 c0Var, l1 l1Var, boolean z4, boolean z5, androidx.compose.foundation.gestures.e0 e0Var, boolean z6, int i4, c.b bVar, i.m mVar, c.InterfaceC0326c interfaceC0326c, i.e eVar, ld.l<? super y, k2> lVar, int i5, int i6, int i7) {
            super(2);
            this.f6185b = qVar;
            this.f6186c = c0Var;
            this.f6187d = l1Var;
            this.f6188e = z4;
            this.f6189f = z5;
            this.f6190g = e0Var;
            this.f6191h = z6;
            this.f6192i = i4;
            this.f6193j = bVar;
            this.f6194k = mVar;
            this.f6195l = interfaceC0326c;
            this.f6196m = eVar;
            this.f6197n = lVar;
            this.f6198o = i5;
            this.f6199p = i6;
            this.f6200q = i7;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            r.a(this.f6185b, this.f6186c, this.f6187d, this.f6188e, this.f6189f, this.f6190g, this.f6191h, this.f6192i, this.f6193j, this.f6194k, this.f6195l, this.f6196m, this.f6197n, tVar, g3.b(this.f6198o | 1), g3.b(this.f6199p), this.f6200q);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: LazyList.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/layout/x;", "Landroidx/compose/ui/unit/b;", "containerConstraints", "Landroidx/compose/foundation/lazy/u;", "a", "(Landroidx/compose/foundation/lazy/layout/x;J)Landroidx/compose/foundation/lazy/u;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyList.kt\nandroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,353:1\n495#2,4:354\n500#2:363\n129#3,5:358\n*S KotlinDebug\n*F\n+ 1 LazyList.kt\nandroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1\n*L\n295#1:354,4\n295#1:363\n295#1:358,5\n*E\n"})
    static final class b extends n0 implements ld.p<androidx.compose.foundation.lazy.layout.x, androidx.compose.ui.unit.b, u> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c0 f6201b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f6202c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ l1 f6203d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f6204e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.a<o> f6205f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ i.m f6206g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ i.e f6207h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f6208i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ c.b f6209j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ c.InterfaceC0326c f6210k;

        /* compiled from: LazyList.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "width", "height", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "Lkotlin/u;", "placement", "Landroidx/compose/ui/layout/n0;", "a", "(IILld/l;)Landroidx/compose/ui/layout/n0;"}, k = 3, mv = {1, 8, 0})
        static final class a extends n0 implements ld.q<Integer, Integer, ld.l<? super i1.a, ? extends k2>, androidx.compose.ui.layout.n0> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.lazy.layout.x f6211b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f6212c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f6213d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f6214e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.foundation.lazy.layout.x xVar, long j4, int i4, int i5) {
                super(3);
                this.f6211b = xVar;
                this.f6212c = j4;
                this.f6213d = i4;
                this.f6214e = i5;
            }

            @Override // ld.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.layout.n0 R(Integer num, Integer num2, ld.l<? super i1.a, ? extends k2> lVar) {
                return a(num.intValue(), num2.intValue(), lVar);
            }

            @fg.l
            public final androidx.compose.ui.layout.n0 a(int i4, int i5, @fg.l ld.l<? super i1.a, k2> lVar) {
                return this.f6211b.U3(androidx.compose.ui.unit.c.g(this.f6212c, i4 + this.f6213d), androidx.compose.ui.unit.c.f(this.f6212c, i5 + this.f6214e), z0.z(), lVar);
            }
        }

        /* compiled from: LazyList.kt */
        @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J7\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"androidx/compose/foundation/lazy/r$b$b", "Landroidx/compose/foundation/lazy/x;", "", "index", "", "key", "contentType", "", "Landroidx/compose/ui/layout/i1;", "placeables", "Landroidx/compose/foundation/lazy/v;", "a", "(ILjava/lang/Object;Ljava/lang/Object;Ljava/util/List;)Landroidx/compose/foundation/lazy/v;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.lazy.r$b$b, reason: collision with other inner class name */
        public static final class C0113b extends x {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f6215e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.lazy.layout.x f6216f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ int f6217g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ int f6218h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ c.b f6219i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ c.InterfaceC0326c f6220j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ boolean f6221k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ int f6222l;

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ int f6223m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ long f6224n;

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ c0 f6225o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0113b(long j4, boolean z4, o oVar, androidx.compose.foundation.lazy.layout.x xVar, int i4, int i5, c.b bVar, c.InterfaceC0326c interfaceC0326c, boolean z5, int i6, int i7, long j5, c0 c0Var) {
                super(j4, z4, oVar, xVar, null);
                this.f6215e = z4;
                this.f6216f = xVar;
                this.f6217g = i4;
                this.f6218h = i5;
                this.f6219i = bVar;
                this.f6220j = interfaceC0326c;
                this.f6221k = z5;
                this.f6222l = i6;
                this.f6223m = i7;
                this.f6224n = j5;
                this.f6225o = c0Var;
            }

            @Override // androidx.compose.foundation.lazy.x
            @fg.l
            public v a(int index, @fg.l Object key, @fg.m Object contentType, @fg.l List<? extends i1> placeables) {
                return new v(index, placeables, this.f6215e, this.f6219i, this.f6220j, this.f6216f.getLayoutDirection(), this.f6221k, this.f6222l, this.f6223m, index == this.f6217g + (-1) ? 0 : this.f6218h, this.f6224n, key, contentType, this.f6225o.getItemAnimator(), null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(c0 c0Var, boolean z4, l1 l1Var, boolean z5, ld.a<? extends o> aVar, i.m mVar, i.e eVar, int i4, c.b bVar, c.InterfaceC0326c interfaceC0326c) {
            super(2);
            this.f6201b = c0Var;
            this.f6202c = z4;
            this.f6203d = l1Var;
            this.f6204e = z5;
            this.f6205f = aVar;
            this.f6206g = mVar;
            this.f6207h = eVar;
            this.f6208i = i4;
            this.f6209j = bVar;
            this.f6210k = interfaceC0326c;
        }

        @fg.l
        public final u a(@fg.l androidx.compose.foundation.lazy.layout.x xVar, long j4) {
            float spacing;
            long a5;
            boolean z4 = this.f6201b.getHasLookaheadPassOccurred() || xVar.E1();
            androidx.compose.foundation.f0.a(j4, this.f6202c ? j0.Vertical : j0.Horizontal);
            int q22 = this.f6202c ? xVar.q2(this.f6203d.b(xVar.getLayoutDirection())) : xVar.q2(j1.i(this.f6203d, xVar.getLayoutDirection()));
            int q23 = this.f6202c ? xVar.q2(this.f6203d.c(xVar.getLayoutDirection())) : xVar.q2(j1.h(this.f6203d, xVar.getLayoutDirection()));
            int q24 = xVar.q2(this.f6203d.getTop());
            int q25 = xVar.q2(this.f6203d.getBottom());
            int i4 = q24 + q25;
            int i5 = q22 + q23;
            boolean z5 = this.f6202c;
            int i6 = z5 ? i4 : i5;
            int i7 = (!z5 || this.f6204e) ? (z5 && this.f6204e) ? q25 : (z5 || this.f6204e) ? q23 : q22 : q24;
            int i10 = i6 - i7;
            long i11 = androidx.compose.ui.unit.c.i(j4, -i5, -i4);
            this.f6201b.W(xVar);
            o invoke = this.f6205f.invoke();
            invoke.getItemScope().i(androidx.compose.ui.unit.b.p(i11), androidx.compose.ui.unit.b.o(i11));
            if (this.f6202c) {
                i.m mVar = this.f6206g;
                if (mVar == null) {
                    throw new IllegalArgumentException("null verticalArrangement when isVertical == true");
                }
                spacing = mVar.getSpacing();
            } else {
                i.e eVar = this.f6207h;
                if (eVar == null) {
                    throw new IllegalArgumentException("null horizontalAlignment when isVertical == false");
                }
                spacing = eVar.getSpacing();
            }
            int q26 = xVar.q2(spacing);
            int b5 = invoke.b();
            int o4 = this.f6202c ? androidx.compose.ui.unit.b.o(j4) - i4 : androidx.compose.ui.unit.b.p(j4) - i5;
            if (!this.f6204e || o4 > 0) {
                a5 = androidx.compose.ui.unit.r.a(q22, q24);
            } else {
                boolean z6 = this.f6202c;
                if (!z6) {
                    q22 += o4;
                }
                if (z6) {
                    q24 += o4;
                }
                a5 = androidx.compose.ui.unit.r.a(q22, q24);
            }
            C0113b c0113b = new C0113b(i11, this.f6202c, invoke, xVar, b5, q26, this.f6209j, this.f6210k, this.f6204e, i7, i10, a5, this.f6201b);
            this.f6201b.Y(c0113b.getChildConstraints());
            m.Companion companion = androidx.compose.runtime.snapshots.m.INSTANCE;
            c0 c0Var = this.f6201b;
            androidx.compose.runtime.snapshots.m c5 = companion.c();
            try {
                androidx.compose.runtime.snapshots.m r4 = c5.r();
                try {
                    int b02 = c0Var.b0(invoke, c0Var.u());
                    int v4 = c0Var.v();
                    k2 k2Var = k2.f75408a;
                    c5.d();
                    List<Integer> a6 = androidx.compose.foundation.lazy.layout.o.a(invoke, this.f6201b.getPinnedItems(), this.f6201b.getBeyondBoundsInfo());
                    float scrollToBeConsumed = (xVar.E1() || !z4) ? this.f6201b.getScrollToBeConsumed() : this.f6201b.M();
                    boolean z7 = this.f6202c;
                    List<Integer> h4 = invoke.h();
                    i.m mVar2 = this.f6206g;
                    i.e eVar2 = this.f6207h;
                    boolean z10 = this.f6204e;
                    l itemAnimator = this.f6201b.getItemAnimator();
                    int i12 = this.f6208i;
                    boolean E1 = xVar.E1();
                    u postLookaheadLayoutInfo = this.f6201b.getPostLookaheadLayoutInfo();
                    r0 coroutineScope = this.f6201b.getCoroutineScope();
                    if (coroutineScope == null) {
                        throw new IllegalArgumentException("coroutineScope should be not null");
                    }
                    u e4 = t.e(b5, c0113b, o4, i7, i10, q26, b02, v4, scrollToBeConsumed, i11, z7, h4, mVar2, eVar2, z10, xVar, itemAnimator, i12, a6, z4, E1, postLookaheadLayoutInfo, coroutineScope, this.f6201b.F(), new a(xVar, j4, i5, i4));
                    c0.o(this.f6201b, e4, xVar.E1(), false, 4, null);
                    return e4;
                } finally {
                    c5.y(r4);
                }
            } catch (Throwable th) {
                c5.d();
                throw th;
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ u invoke(androidx.compose.foundation.lazy.layout.x xVar, androidx.compose.ui.unit.b bVar) {
            return a(xVar, bVar.getValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x015f  */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@fg.l androidx.compose.ui.q r34, @fg.l androidx.compose.foundation.lazy.c0 r35, @fg.l androidx.compose.foundation.layout.l1 r36, boolean r37, boolean r38, @fg.l androidx.compose.foundation.gestures.e0 r39, boolean r40, int r41, @fg.m androidx.compose.ui.c.b r42, @fg.m androidx.compose.foundation.layout.i.m r43, @fg.m androidx.compose.ui.c.InterfaceC0326c r44, @fg.m androidx.compose.foundation.layout.i.e r45, @fg.l ld.l<? super androidx.compose.foundation.lazy.y, kotlin.k2> r46, @fg.m androidx.compose.runtime.t r47, int r48, int r49, int r50) {
        /*
            Method dump skipped, instructions count: 848
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.r.a(androidx.compose.ui.q, androidx.compose.foundation.lazy.c0, androidx.compose.foundation.layout.l1, boolean, boolean, androidx.compose.foundation.gestures.e0, boolean, int, androidx.compose.ui.c$b, androidx.compose.foundation.layout.i$m, androidx.compose.ui.c$c, androidx.compose.foundation.layout.i$e, ld.l, androidx.compose.runtime.t, int, int, int):void");
    }

    @androidx.compose.foundation.z0
    @androidx.compose.runtime.i
    private static final ld.p<androidx.compose.foundation.lazy.layout.x, androidx.compose.ui.unit.b, androidx.compose.ui.layout.n0> b(ld.a<? extends o> aVar, c0 c0Var, l1 l1Var, boolean z4, boolean z5, int i4, c.b bVar, c.InterfaceC0326c interfaceC0326c, i.e eVar, i.m mVar, androidx.compose.runtime.t tVar, int i5, int i6) {
        tVar.P(183156450);
        c.b bVar2 = (i6 & 64) != 0 ? null : bVar;
        c.InterfaceC0326c interfaceC0326c2 = (i6 & 128) != 0 ? null : interfaceC0326c;
        i.e eVar2 = (i6 & 256) != 0 ? null : eVar;
        i.m mVar2 = (i6 & 512) == 0 ? mVar : null;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(183156450, i5, -1, "androidx.compose.foundation.lazy.rememberLazyListMeasurePolicy (LazyList.kt:167)");
        }
        Object[] objArr = {c0Var, l1Var, Boolean.valueOf(z4), Boolean.valueOf(z5), bVar2, interfaceC0326c2, eVar2, mVar2};
        tVar.P(-568225417);
        boolean z6 = false;
        for (int i7 = 0; i7 < 8; i7++) {
            z6 |= tVar.q0(objArr[i7]);
        }
        Object Q = tVar.Q();
        if (z6 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new b(c0Var, z5, l1Var, z4, aVar, mVar2, eVar2, i4, bVar2, interfaceC0326c2);
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
