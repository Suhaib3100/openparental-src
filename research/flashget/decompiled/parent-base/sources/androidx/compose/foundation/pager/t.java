package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.j0;
import androidx.compose.foundation.layout.j1;
import androidx.compose.foundation.layout.l1;
import androidx.compose.runtime.snapshots.m;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.i1;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.z0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: PagerMeasurePolicy.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0099\u0001\u0010\u001d\u001a\u0019\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0018¢\u0006\u0002\b\u001c2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0000H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001e\u0010\"\u001a\u00020!2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0000H\u0082\b¢\u0006\u0004\b\"\u0010#\u001a\u001b\u0010%\u001a\u00020\u000b*\u00020\u00032\u0006\u0010$\u001a\u00020\u000bH\u0000¢\u0006\u0004\b%\u0010&\"\u0014\u0010(\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010'\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"Lkotlin/Function0;", "Landroidx/compose/foundation/pager/r;", "itemProviderLambda", "Landroidx/compose/foundation/pager/c0;", "state", "Landroidx/compose/foundation/layout/l1;", "contentPadding", "", "reverseLayout", "Landroidx/compose/foundation/gestures/j0;", "orientation", "", "beyondBoundsPageCount", "Landroidx/compose/ui/unit/h;", "pageSpacing", "Landroidx/compose/foundation/pager/g;", "pageSize", "Landroidx/compose/ui/c$b;", "horizontalAlignment", "Landroidx/compose/ui/c$c;", "verticalAlignment", "Landroidx/compose/foundation/gestures/snapping/l;", "snapPositionInLayout", "pageCount", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/x;", "Landroidx/compose/ui/unit/b;", "Landroidx/compose/ui/layout/n0;", "Lkotlin/u;", "c", "(Lld/a;Landroidx/compose/foundation/pager/c0;Landroidx/compose/foundation/layout/l1;ZLandroidx/compose/foundation/gestures/j0;IFLandroidx/compose/foundation/pager/g;Landroidx/compose/ui/c$b;Landroidx/compose/ui/c$c;Landroidx/compose/foundation/gestures/snapping/l;Lld/a;Landroidx/compose/runtime/t;II)Lld/p;", "", "generateMsg", "Lkotlin/k2;", "b", "(Lld/a;)V", "pageSizeWithSpacing", "a", "(Landroidx/compose/foundation/pager/c0;I)I", "Z", "DEBUG", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nPagerMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerMeasurePolicy.kt\nandroidx/compose/foundation/pager/PagerMeasurePolicyKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,221:1\n195#1,4:240\n83#2,3:222\n1116#3,6:225\n116#4,2:231\n33#4,6:233\n118#4:239\n*S KotlinDebug\n*F\n+ 1 PagerMeasurePolicy.kt\nandroidx/compose/foundation/pager/PagerMeasurePolicyKt\n*L\n213#1:240,4\n57#1:222,3\n57#1:225,6\n203#1:231,2\n203#1:233,6\n203#1:239\n*E\n"})
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f6904a = false;

    /* compiled from: PagerMeasurePolicy.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/layout/x;", "Landroidx/compose/ui/unit/b;", "containerConstraints", "Landroidx/compose/foundation/pager/u;", "a", "(Landroidx/compose/foundation/lazy/layout/x;J)Landroidx/compose/foundation/pager/u;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nPagerMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerMeasurePolicy.kt\nandroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,221:1\n1#2:222\n495#3,4:223\n500#3:232\n129#4,5:227\n*S KotlinDebug\n*F\n+ 1 PagerMeasurePolicy.kt\nandroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1\n*L\n149#1:223,4\n149#1:232\n149#1:227,5\n*E\n"})
    static final class a extends n0 implements ld.p<androidx.compose.foundation.lazy.layout.x, androidx.compose.ui.unit.b, u> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j0 f6905b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ l1 f6906c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f6907d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ c0 f6908e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f6909f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ g f6910g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.a<r> f6911h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.a<Integer> f6912i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ c.InterfaceC0326c f6913j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ c.b f6914k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f6915l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.gestures.snapping.l f6916m;

        /* compiled from: PagerMeasurePolicy.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "width", "height", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "Lkotlin/u;", "placement", "Landroidx/compose/ui/layout/n0;", "a", "(IILld/l;)Landroidx/compose/ui/layout/n0;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.pager.t$a$a, reason: collision with other inner class name */
        static final class C0119a extends n0 implements ld.q<Integer, Integer, ld.l<? super i1.a, ? extends k2>, androidx.compose.ui.layout.n0> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.lazy.layout.x f6917b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f6918c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f6919d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f6920e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0119a(androidx.compose.foundation.lazy.layout.x xVar, long j4, int i4, int i5) {
                super(3);
                this.f6917b = xVar;
                this.f6918c = j4;
                this.f6919d = i4;
                this.f6920e = i5;
            }

            @Override // ld.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.layout.n0 R(Integer num, Integer num2, ld.l<? super i1.a, ? extends k2> lVar) {
                return a(num.intValue(), num2.intValue(), lVar);
            }

            @fg.l
            public final androidx.compose.ui.layout.n0 a(int i4, int i5, @fg.l ld.l<? super i1.a, k2> lVar) {
                return this.f6917b.U3(androidx.compose.ui.unit.c.g(this.f6918c, i4 + this.f6919d), androidx.compose.ui.unit.c.f(this.f6918c, i5 + this.f6920e), z0.z(), lVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(j0 j0Var, l1 l1Var, boolean z4, c0 c0Var, float f4, g gVar, ld.a<r> aVar, ld.a<Integer> aVar2, c.InterfaceC0326c interfaceC0326c, c.b bVar, int i4, androidx.compose.foundation.gestures.snapping.l lVar) {
            super(2);
            this.f6905b = j0Var;
            this.f6906c = l1Var;
            this.f6907d = z4;
            this.f6908e = c0Var;
            this.f6909f = f4;
            this.f6910g = gVar;
            this.f6911h = aVar;
            this.f6912i = aVar2;
            this.f6913j = interfaceC0326c;
            this.f6914k = bVar;
            this.f6915l = i4;
            this.f6916m = lVar;
        }

        @fg.l
        public final u a(@fg.l androidx.compose.foundation.lazy.layout.x xVar, long j4) {
            long a5;
            j0 j0Var = this.f6905b;
            j0 j0Var2 = j0.Vertical;
            boolean z4 = j0Var == j0Var2;
            androidx.compose.foundation.f0.a(j4, z4 ? j0Var2 : j0.Horizontal);
            int q22 = z4 ? xVar.q2(this.f6906c.b(xVar.getLayoutDirection())) : xVar.q2(j1.i(this.f6906c, xVar.getLayoutDirection()));
            int q23 = z4 ? xVar.q2(this.f6906c.c(xVar.getLayoutDirection())) : xVar.q2(j1.h(this.f6906c, xVar.getLayoutDirection()));
            int q24 = xVar.q2(this.f6906c.getTop());
            int q25 = xVar.q2(this.f6906c.getBottom());
            int i4 = q24 + q25;
            int i5 = q22 + q23;
            int i6 = z4 ? i4 : i5;
            int i7 = (!z4 || this.f6907d) ? (z4 && this.f6907d) ? q25 : (z4 || this.f6907d) ? q23 : q22 : q24;
            int i10 = i6 - i7;
            long i11 = androidx.compose.ui.unit.c.i(j4, -i5, -i4);
            this.f6908e.p0(xVar);
            int q26 = xVar.q2(this.f6909f);
            int o4 = z4 ? androidx.compose.ui.unit.b.o(j4) - i4 : androidx.compose.ui.unit.b.p(j4) - i5;
            if (!this.f6907d || o4 > 0) {
                a5 = androidx.compose.ui.unit.r.a(q22, q24);
            } else {
                if (!z4) {
                    q22 += o4;
                }
                if (z4) {
                    q24 += o4;
                }
                a5 = androidx.compose.ui.unit.r.a(q22, q24);
            }
            long j5 = a5;
            int a6 = this.f6910g.a(xVar, o4, q26);
            this.f6908e.r0(androidx.compose.ui.unit.c.b(0, this.f6905b == j0Var2 ? androidx.compose.ui.unit.b.p(i11) : a6, 0, this.f6905b != j0Var2 ? androidx.compose.ui.unit.b.o(i11) : a6, 5, null));
            r invoke = this.f6911h.invoke();
            int i12 = a6 + q26;
            m.Companion companion = androidx.compose.runtime.snapshots.m.INSTANCE;
            c0 c0Var = this.f6908e;
            androidx.compose.runtime.snapshots.m c5 = companion.c();
            try {
                androidx.compose.runtime.snapshots.m r4 = c5.r();
                try {
                    int g02 = c0Var.g0(invoke, c0Var.y());
                    int a7 = t.a(c0Var, i12);
                    k2 k2Var = k2.f75408a;
                    c5.d();
                    u i13 = s.i(xVar, this.f6912i.invoke().intValue(), invoke, o4, i7, i10, q26, g02, a7, i11, this.f6905b, this.f6913j, this.f6914k, this.f6907d, j5, a6, this.f6915l, androidx.compose.foundation.lazy.layout.o.a(invoke, this.f6908e.getPinnedPages(), this.f6908e.getBeyondBoundsInfo()), this.f6916m, this.f6908e.P(), new C0119a(xVar, j4, i5, i4));
                    c0.s(this.f6908e, i13, false, 2, null);
                    return i13;
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

    public static final int a(@fg.l c0 c0Var, int i4) {
        f fVar;
        List<f> y4 = c0Var.F().y();
        int size = y4.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                fVar = null;
                break;
            }
            fVar = y4.get(i5);
            if (fVar.getIndex() == c0Var.y()) {
                break;
            }
            i5++;
        }
        f fVar2 = fVar;
        int offset = fVar2 != null ? fVar2.getOffset() : 0;
        return -kotlin.math.b.L0(((c0Var.z() - (i4 == 0 ? c0Var.z() : (-offset) / i4)) * i4) - offset);
    }

    private static final void b(ld.a<String> aVar) {
    }

    @fg.l
    @androidx.compose.runtime.i
    public static final ld.p<androidx.compose.foundation.lazy.layout.x, androidx.compose.ui.unit.b, androidx.compose.ui.layout.n0> c(@fg.l ld.a<r> aVar, @fg.l c0 c0Var, @fg.l l1 l1Var, boolean z4, @fg.l j0 j0Var, int i4, float f4, @fg.l g gVar, @fg.m c.b bVar, @fg.m c.InterfaceC0326c interfaceC0326c, @fg.l androidx.compose.foundation.gestures.snapping.l lVar, @fg.l ld.a<Integer> aVar2, @fg.m androidx.compose.runtime.t tVar, int i5, int i6) {
        tVar.P(-1615726010);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1615726010, i5, i6, "androidx.compose.foundation.pager.rememberPagerMeasurePolicy (PagerMeasurePolicy.kt:56)");
        }
        Object[] objArr = {c0Var, l1Var, Boolean.valueOf(z4), j0Var, bVar, interfaceC0326c, androidx.compose.ui.unit.h.d(f4), gVar, lVar, aVar2};
        tVar.P(-568225417);
        boolean z5 = false;
        for (int i7 = 0; i7 < 10; i7++) {
            z5 |= tVar.q0(objArr[i7]);
        }
        Object Q = tVar.Q();
        if (z5 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new a(j0Var, l1Var, z4, c0Var, f4, gVar, aVar, aVar2, interfaceC0326c, bVar, i4, lVar);
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
