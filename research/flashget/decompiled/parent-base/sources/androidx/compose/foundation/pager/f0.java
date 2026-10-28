package androidx.compose.foundation.pager;

import androidx.compose.ui.layout.n0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.j0;
import kotlin.collections.z0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: PagerState.kt */
@Metadata(d1 = {"\u0000Y\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001&\u001a1\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0014\u0010\n\u001a\u00020\t*\u00020\u0006H\u0080@¢\u0006\u0004\b\n\u0010\u000b\u001a\u0014\u0010\f\u001a\u00020\t*\u00020\u0006H\u0080@¢\u0006\u0004\b\f\u0010\u000b\u001a\u001e\u0010\u000f\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004H\u0082\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0012\u001a\u00020\u0000*\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\"\u001a\u0010\u0019\u001a\u00020\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u001c\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001e\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b\" \u0010%\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"\"\u0014\u0010(\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010'\" \u0010.\u001a\u00020)8\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\f\u0010*\u0012\u0004\b-\u0010$\u001a\u0004\b+\u0010,\"\u0014\u00101\u001a\u00020/8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u00100\"\u001e\u00107\u001a\u00020\u0000*\u0002028BX\u0082\u0004¢\u0006\f\u0012\u0004\b5\u00106\u001a\u0004\b3\u00104¨\u00068"}, d2 = {"", "initialPage", "", "initialPageOffsetFraction", "Lkotlin/Function0;", "pageCount", "Landroidx/compose/foundation/pager/c0;", "p", "(IFLld/a;Landroidx/compose/runtime/t;II)Landroidx/compose/foundation/pager/c0;", "Lkotlin/k2;", "e", "(Landroidx/compose/foundation/pager/c0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "f", "", "generateMsg", "h", "(Lld/a;)V", "Landroidx/compose/foundation/pager/u;", "g", "(Landroidx/compose/foundation/pager/u;I)I", "Landroidx/compose/ui/unit/h;", "a", "F", "i", "()F", "DefaultPositionThreshold", "b", "I", "MaxPagesForAnimateScroll", "c", "PagesToPrefetch", "d", "Landroidx/compose/foundation/pager/u;", "j", "()Landroidx/compose/foundation/pager/u;", "k", "()V", "EmptyLayoutInfo", "androidx/compose/foundation/pager/f0$b", "Landroidx/compose/foundation/pager/f0$b;", "UnitDensity", "Landroidx/compose/foundation/gestures/snapping/l;", "Landroidx/compose/foundation/gestures/snapping/l;", "n", "()Landroidx/compose/foundation/gestures/snapping/l;", "o", "SnapAlignmentStartToStart", "", "Z", "DEBUG", "Landroidx/compose/foundation/pager/n;", "l", "(Landroidx/compose/foundation/pager/n;)I", "m", "(Landroidx/compose/foundation/pager/n;)V", "singleAxisViewPort", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,787:1\n1116#2,6:788\n154#3:794\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n*L\n81#1:788,6\n729#1:794\n*E\n"})
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: b, reason: collision with root package name */
    private static final int f6773b = 3;

    /* renamed from: c, reason: collision with root package name */
    public static final int f6774c = 1;

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f6778g = false;

    /* renamed from: a, reason: collision with root package name */
    private static final float f6772a = androidx.compose.ui.unit.h.g(56);

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final u f6775d = new u(j0.f74919b, 0, 0, 0, androidx.compose.foundation.gestures.j0.Horizontal, 0, 0, false, 0, null, null, 0.0f, 0, false, new a(), false);

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final b f6776e = new b();

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.foundation.gestures.snapping.l f6777f = new e0();

    /* compiled from: PagerState.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR,\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0006\u0010\u0004\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"androidx/compose/foundation/pager/f0$a", "Landroidx/compose/ui/layout/n0;", "Lkotlin/k2;", "q", "()V", "", "a", "I", "getWidth", "()I", "width", "b", "getHeight", "height", "", "Landroidx/compose/ui/layout/a;", "c", "Ljava/util/Map;", "p", "()Ljava/util/Map;", "alignmentLines", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements n0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int width;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int height;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final Map<androidx.compose.ui.layout.a, Integer> alignmentLines = z0.z();

        a() {
        }

        public static /* synthetic */ void a() {
        }

        @Override // androidx.compose.ui.layout.n0
        public int getHeight() {
            return this.height;
        }

        @Override // androidx.compose.ui.layout.n0
        public int getWidth() {
            return this.width;
        }

        @Override // androidx.compose.ui.layout.n0
        @fg.l
        public Map<androidx.compose.ui.layout.a, Integer> p() {
            return this.alignmentLines;
        }

        @Override // androidx.compose.ui.layout.n0
        public void q() {
        }
    }

    /* compiled from: PagerState.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0005¨\u0006\n"}, d2 = {"androidx/compose/foundation/pager/f0$b", "Landroidx/compose/ui/unit/d;", "", "b", "F", "()F", "density", "c", "U", "fontScale", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements androidx.compose.ui.unit.d {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final float density = 1.0f;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final float fontScale = 1.0f;

        b() {
        }

        @Override // androidx.compose.ui.unit.n
        /* renamed from: U, reason: from getter */
        public float getFontScale() {
            return this.fontScale;
        }

        @Override // androidx.compose.ui.unit.d
        /* renamed from: b, reason: from getter */
        public float getDensity() {
            return this.density;
        }
    }

    /* compiled from: PagerState.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/pager/d0;", "a", "()Landroidx/compose/foundation/pager/d0;"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.a<d0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f6784b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f6785c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.a<Integer> f6786d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i4, float f4, ld.a<Integer> aVar) {
            super(0);
            this.f6784b = i4;
            this.f6785c = f4;
            this.f6786d = aVar;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d0 invoke() {
            return new d0(this.f6784b, this.f6785c, this.f6786d);
        }
    }

    public static int a(int i4, int i5, int i6, int i7, int i10) {
        return 0;
    }

    private static final int b(int i4, int i5, int i6, int i7, int i10) {
        return 0;
    }

    @fg.m
    public static final Object e(@fg.l c0 c0Var, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        if (c0Var.y() + 1 >= c0Var.K()) {
            return k2.f75408a;
        }
        Object q4 = c0.q(c0Var, c0Var.y() + 1, 0.0f, null, dVar, 6, null);
        return q4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? q4 : k2.f75408a;
    }

    @fg.m
    public static final Object f(@fg.l c0 c0Var, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        if (c0Var.y() - 1 < 0) {
            return k2.f75408a;
        }
        Object q4 = c0.q(c0Var, c0Var.y() - 1, 0.0f, null, dVar, 6, null);
        return q4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? q4 : k2.f75408a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(u uVar, int i4) {
        int afterContentPadding = ((uVar.getAfterContentPadding() + (((uVar.getPageSize() + uVar.getPageSpacing()) * i4) + uVar.e())) - uVar.getPageSpacing()) - l(uVar);
        if (afterContentPadding < 0) {
            return 0;
        }
        return afterContentPadding;
    }

    private static final void h(ld.a<String> aVar) {
    }

    public static final float i() {
        return f6772a;
    }

    @fg.l
    public static final u j() {
        return f6775d;
    }

    public static /* synthetic */ void k() {
    }

    private static final int l(n nVar) {
        return nVar.getOrientation() == androidx.compose.foundation.gestures.j0.Vertical ? androidx.compose.ui.unit.u.j(nVar.b()) : androidx.compose.ui.unit.u.m(nVar.b());
    }

    private static /* synthetic */ void m(n nVar) {
    }

    @fg.l
    public static final androidx.compose.foundation.gestures.snapping.l n() {
        return f6777f;
    }

    public static /* synthetic */ void o() {
    }

    @fg.l
    @androidx.compose.foundation.z0
    @androidx.compose.runtime.i
    public static final c0 p(int i4, float f4, @fg.l ld.a<Integer> aVar, @fg.m androidx.compose.runtime.t tVar, int i5, int i6) {
        tVar.P(-1210768637);
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            f4 = 0.0f;
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1210768637, i5, -1, "androidx.compose.foundation.pager.rememberPagerState (PagerState.kt:79)");
        }
        Object[] objArr = new Object[0];
        d0.INSTANCE.getClass();
        androidx.compose.runtime.saveable.l lVar = d0.L;
        tVar.P(1614659192);
        boolean f5 = tVar.f(i4) | tVar.d(f4) | tVar.S(aVar);
        Object Q = tVar.Q();
        if (f5 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new c(i4, f4, aVar);
            tVar.E(Q);
        }
        tVar.p0();
        d0 d0Var = (d0) androidx.compose.runtime.saveable.d.d(objArr, lVar, null, (ld.a) Q, tVar, 72, 4);
        d0Var.E0().setValue(aVar);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return d0Var;
    }
}
