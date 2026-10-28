package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.j0;
import androidx.compose.foundation.gestures.snapping.c;
import androidx.compose.foundation.layout.l1;
import androidx.compose.runtime.g3;
import androidx.compose.ui.c;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.q0;
import kotlinx.coroutines.r0;

/* compiled from: Pager.kt */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\u001aØ\u0001\u0010\"\u001a\u00020\u001e2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102%\b\u0002\u0010\u0018\u001a\u001f\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u001921\u0010!\u001a-\u0012\u0004\u0012\u00020\u001c\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u001e0\u001b¢\u0006\u0002\b\u001f¢\u0006\u0002\b H\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001aØ\u0001\u0010&\u001a\u00020\u001e2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102%\b\u0002\u0010\u0018\u001a\u001f\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u001921\u0010!\u001a-\u0012\u0004\u0012\u00020\u001c\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u001e0\u001b¢\u0006\u0002\b\u001f¢\u0006\u0002\b H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a5\u00100\u001a\u00020/2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010.\u001a\u00020,H\u0002¢\u0006\u0004\b0\u00101\u001a#\u00103\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u0010H\u0001¢\u0006\u0004\b3\u00104\u001a\u001e\u00108\u001a\u00020\u001e2\f\u00107\u001a\b\u0012\u0004\u0012\u00020605H\u0082\b¢\u0006\u0004\b8\u00109\u001a\u0013\u0010:\u001a\u00020\u0010*\u00020\u0000H\u0002¢\u0006\u0004\b:\u0010;\u001a\u0013\u0010<\u001a\u00020,*\u00020\u0000H\u0002¢\u0006\u0004\b<\u0010=\"\u0014\u0010?\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010>\"\u0014\u0010A\u001a\u00020\u00108\u0000X\u0080T¢\u0006\u0006\n\u0004\b0\u0010@\"\u0014\u0010B\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010@\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006C"}, d2 = {"Landroidx/compose/foundation/pager/c0;", "state", "Landroidx/compose/ui/q;", "modifier", "Landroidx/compose/foundation/layout/l1;", "contentPadding", "Landroidx/compose/foundation/pager/g;", "pageSize", "", "beyondBoundsPageCount", "Landroidx/compose/ui/unit/h;", "pageSpacing", "Landroidx/compose/ui/c$c;", "verticalAlignment", "Landroidx/compose/foundation/gestures/snapping/h;", "flingBehavior", "", "userScrollEnabled", "reverseLayout", "Lkotlin/Function1;", "Lkotlin/r0;", "name", "index", "", "key", "Landroidx/compose/ui/input/nestedscroll/a;", "pageNestedScrollConnection", "Lkotlin/Function2;", "Landroidx/compose/foundation/pager/v;", "page", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "Lkotlin/u;", "pageContent", "a", "(Landroidx/compose/foundation/pager/c0;Landroidx/compose/ui/q;Landroidx/compose/foundation/layout/l1;Landroidx/compose/foundation/pager/g;IFLandroidx/compose/ui/c$c;Landroidx/compose/foundation/gestures/snapping/h;ZZLld/l;Landroidx/compose/ui/input/nestedscroll/a;Lld/r;Landroidx/compose/runtime/t;III)V", "Landroidx/compose/ui/c$b;", "horizontalAlignment", "c", "(Landroidx/compose/foundation/pager/c0;Landroidx/compose/ui/q;Landroidx/compose/foundation/layout/l1;Landroidx/compose/foundation/pager/g;IFLandroidx/compose/ui/c$b;Landroidx/compose/foundation/gestures/snapping/h;ZZLld/l;Landroidx/compose/ui/input/nestedscroll/a;Lld/r;Landroidx/compose/runtime/t;III)V", "pagerState", "Landroidx/compose/foundation/pager/a0;", "pagerSnapDistance", "Landroidx/compose/animation/core/z;", "", "decayAnimationSpec", "snapPositionalThreshold", "Landroidx/compose/foundation/gestures/snapping/j;", "b", "(Landroidx/compose/foundation/pager/c0;Landroidx/compose/foundation/pager/a0;Landroidx/compose/animation/core/z;F)Landroidx/compose/foundation/gestures/snapping/j;", "isVertical", "l", "(Landroidx/compose/ui/q;Landroidx/compose/foundation/pager/c0;ZLandroidx/compose/runtime/t;I)Landroidx/compose/ui/q;", "Lkotlin/Function0;", "", "generateMsg", "i", "(Lld/a;)V", "k", "(Landroidx/compose/foundation/pager/c0;)Z", "j", "(Landroidx/compose/foundation/pager/c0;)F", "I", "LowVelocityAnimationDefaultDuration", "Z", "PagerDebugEnable", "DEBUG", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,967:1\n154#2:968\n154#2:969\n154#2:977\n154#2:978\n36#3:970\n36#3:979\n25#3:990\n1116#4,6:971\n1116#4,6:980\n1116#4,3:991\n1119#4,3:997\n487#5,4:986\n491#5,2:994\n495#5:1000\n487#6:996\n*S KotlinDebug\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerKt\n*L\n112#1:968\n115#1:969\n192#1:977\n195#1:978\n121#1:970\n201#1:979\n913#1:990\n121#1:971,6\n201#1:980,6\n913#1:991,3\n913#1:997,3\n913#1:986,4\n913#1:994,2\n913#1:1000\n913#1:996\n*E\n"})
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private static final int f6810a = 500;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f6811b = false;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f6812c = false;

    /* compiled from: Pager.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c0 f6813b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f6814c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ l1 f6815d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ g f6816e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f6817f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f6818g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ c.InterfaceC0326c f6819h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.gestures.snapping.h f6820i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f6821j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f6822k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ ld.l<Integer, Object> f6823l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.input.nestedscroll.a f6824m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ ld.r<v, Integer, androidx.compose.runtime.t, Integer, k2> f6825n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f6826o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f6827p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f6828q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(c0 c0Var, androidx.compose.ui.q qVar, l1 l1Var, g gVar, int i4, float f4, c.InterfaceC0326c interfaceC0326c, androidx.compose.foundation.gestures.snapping.h hVar, boolean z4, boolean z5, ld.l<? super Integer, ? extends Object> lVar, androidx.compose.ui.input.nestedscroll.a aVar, ld.r<? super v, ? super Integer, ? super androidx.compose.runtime.t, ? super Integer, k2> rVar, int i5, int i6, int i7) {
            super(2);
            this.f6813b = c0Var;
            this.f6814c = qVar;
            this.f6815d = l1Var;
            this.f6816e = gVar;
            this.f6817f = i4;
            this.f6818g = f4;
            this.f6819h = interfaceC0326c;
            this.f6820i = hVar;
            this.f6821j = z4;
            this.f6822k = z5;
            this.f6823l = lVar;
            this.f6824m = aVar;
            this.f6825n = rVar;
            this.f6826o = i5;
            this.f6827p = i6;
            this.f6828q = i7;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            m.a(this.f6813b, this.f6814c, this.f6815d, this.f6816e, this.f6817f, this.f6818g, this.f6819h, this.f6820i, this.f6821j, this.f6822k, this.f6823l, this.f6824m, this.f6825n, tVar, g3.b(this.f6826o | 1), g3.b(this.f6827p), this.f6828q);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: Pager.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001b\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u00020\u0006*\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000bR\u0011\u0010\u0011\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"androidx/compose/foundation/pager/m$b", "Landroidx/compose/foundation/gestures/snapping/j;", "Lkotlin/q0;", "", "e", "()Lkotlin/q0;", "", "d", "(F)Z", "currentVelocity", "a", "(F)F", "initialVelocity", "b", "Landroidx/compose/foundation/pager/n;", "c", "()Landroidx/compose/foundation/pager/n;", "layoutInfo", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerKt$SnapLayoutInfoProvider$1\n+ 2 Pager.kt\nandroidx/compose/foundation/pager/PagerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,967:1\n953#2,4:968\n953#2,4:973\n953#2,4:977\n953#2,4:981\n953#2,4:985\n953#2,4:989\n953#2,4:993\n953#2,4:997\n953#2,4:1001\n953#2,4:1005\n953#2,4:1009\n953#2,4:1013\n953#2,4:1017\n953#2,4:1021\n953#2,4:1025\n953#2,4:1029\n953#2,4:1033\n1#3:972\n*S KotlinDebug\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerKt$SnapLayoutInfoProvider$1\n*L\n602#1:968,4\n617#1:973,4\n627#1:977,4\n635#1:981,4\n639#1:985,4\n654#1:989,4\n664#1:993,4\n677#1:997,4\n686#1:1001,4\n692#1:1005,4\n703#1:1009,4\n709#1:1013,4\n722#1:1017,4\n727#1:1021,4\n740#1:1025,4\n757#1:1029,4\n790#1:1033,4\n*E\n"})
    public static final class b implements androidx.compose.foundation.gestures.snapping.j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c0 f6829a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f6830b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.z<Float> f6831c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ a0 f6832d;

        b(c0 c0Var, float f4, androidx.compose.animation.core.z<Float> zVar, a0 a0Var) {
            this.f6829a = c0Var;
            this.f6830b = f4;
            this.f6831c = zVar;
            this.f6832d = a0Var;
        }

        private final q0<Float, Float> e() {
            int N = this.f6829a.N() + this.f6829a.L();
            int y4 = this.f6829a.y();
            int a5 = t.a(this.f6829a, N);
            int size = this.f6829a.F().y().size() / 2;
            int i4 = y4;
            int i5 = a5;
            float f4 = Float.NEGATIVE_INFINITY;
            float f5 = Float.POSITIVE_INFINITY;
            while (true) {
                int i6 = y4 - size;
                if (i6 < 0) {
                    i6 = 0;
                }
                if (i4 < i6) {
                    break;
                }
                float a6 = androidx.compose.foundation.gestures.snapping.m.a(o.a(this.f6829a.F()), this.f6829a.F().e(), this.f6829a.F().getAfterContentPadding(), this.f6829a.F().getPageSize(), i5, i4, f0.n());
                if (a6 <= 0.0f && a6 > f4) {
                    f4 = a6;
                }
                if (a6 >= 0.0f && a6 < f5) {
                    f5 = a6;
                }
                i5 -= N;
                i4--;
            }
            int i7 = y4 + 1;
            int i10 = a5 + N;
            while (true) {
                int i11 = y4 + size;
                int K = this.f6829a.K() - 1;
                if (i11 > K) {
                    i11 = K;
                }
                if (i7 > i11) {
                    break;
                }
                float a7 = androidx.compose.foundation.gestures.snapping.m.a(o.a(this.f6829a.F()), this.f6829a.F().e(), this.f6829a.F().getAfterContentPadding(), this.f6829a.F().getPageSize(), i10, i7, f0.n());
                if (a7 >= 0.0f && a7 < f5) {
                    f5 = a7;
                }
                if (a7 <= 0.0f && a7 > f4) {
                    f4 = a7;
                }
                i10 += N;
                i7++;
            }
            if (f4 == Float.NEGATIVE_INFINITY) {
                f4 = f5;
            }
            if (f5 == Float.POSITIVE_INFINITY) {
                f5 = f4;
            }
            return new q0<>(Float.valueOf(f4), Float.valueOf(f5));
        }

        @Override // androidx.compose.foundation.gestures.snapping.j
        public float a(float currentVelocity) {
            q0<Float, Float> e4 = e();
            float floatValue = e4.a().floatValue();
            float floatValue2 = e4.b().floatValue();
            boolean k4 = m.k(this.f6829a);
            float j4 = (m.j(this.f6829a) / this.f6829a.F().getPageSize()) - ((int) r3);
            int c5 = androidx.compose.foundation.gestures.snapping.f.c(this.f6829a.getDensity(), currentVelocity);
            c.Companion companion = androidx.compose.foundation.gestures.snapping.c.INSTANCE;
            companion.getClass();
            if (androidx.compose.foundation.gestures.snapping.c.g(c5, androidx.compose.foundation.gestures.snapping.c.f4252c)) {
                floatValue = Math.abs(j4) <= this.f6830b ? floatValue2 : floatValue2;
            } else {
                companion.getClass();
                if (!androidx.compose.foundation.gestures.snapping.c.g(c5, androidx.compose.foundation.gestures.snapping.c.f4253d)) {
                    companion.getClass();
                    if (!androidx.compose.foundation.gestures.snapping.c.g(c5, androidx.compose.foundation.gestures.snapping.c.f4254e)) {
                        floatValue = 0.0f;
                    }
                }
            }
            if (d(floatValue)) {
                return floatValue;
            }
            return 0.0f;
        }

        @Override // androidx.compose.foundation.gestures.snapping.j
        public float b(float initialVelocity) {
            int N = this.f6829a.N() + this.f6829a.L();
            float a5 = androidx.compose.animation.core.b0.a(this.f6831c, 0.0f, initialVelocity);
            int firstVisiblePage = initialVelocity < 0.0f ? this.f6829a.getFirstVisiblePage() + 1 : this.f6829a.getFirstVisiblePage();
            int abs = Math.abs((kotlin.ranges.s.I(this.f6832d.a(firstVisiblePage, kotlin.ranges.s.I(((int) (a5 / N)) + firstVisiblePage, 0, this.f6829a.K()), initialVelocity, this.f6829a.L(), this.f6829a.N()), 0, this.f6829a.K()) - firstVisiblePage) * N) - N;
            int i4 = abs >= 0 ? abs : 0;
            if (i4 == 0) {
                return i4;
            }
            return Math.signum(initialVelocity) * i4;
        }

        @fg.l
        public final n c() {
            return this.f6829a.F();
        }

        public final boolean d(float f4) {
            return (f4 == Float.POSITIVE_INFINITY || f4 == Float.NEGATIVE_INFINITY) ? false : true;
        }
    }

    /* compiled from: Pager.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c0 f6833b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f6834c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ l1 f6835d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ g f6836e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f6837f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f6838g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ c.b f6839h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.gestures.snapping.h f6840i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f6841j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f6842k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ ld.l<Integer, Object> f6843l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.input.nestedscroll.a f6844m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ ld.r<v, Integer, androidx.compose.runtime.t, Integer, k2> f6845n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f6846o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f6847p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f6848q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(c0 c0Var, androidx.compose.ui.q qVar, l1 l1Var, g gVar, int i4, float f4, c.b bVar, androidx.compose.foundation.gestures.snapping.h hVar, boolean z4, boolean z5, ld.l<? super Integer, ? extends Object> lVar, androidx.compose.ui.input.nestedscroll.a aVar, ld.r<? super v, ? super Integer, ? super androidx.compose.runtime.t, ? super Integer, k2> rVar, int i5, int i6, int i7) {
            super(2);
            this.f6833b = c0Var;
            this.f6834c = qVar;
            this.f6835d = l1Var;
            this.f6836e = gVar;
            this.f6837f = i4;
            this.f6838g = f4;
            this.f6839h = bVar;
            this.f6840i = hVar;
            this.f6841j = z4;
            this.f6842k = z5;
            this.f6843l = lVar;
            this.f6844m = aVar;
            this.f6845n = rVar;
            this.f6846o = i5;
            this.f6847p = i6;
            this.f6848q = i7;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            m.c(this.f6833b, this.f6834c, this.f6835d, this.f6836e, this.f6837f, this.f6838g, this.f6839h, this.f6840i, this.f6841j, this.f6842k, this.f6843l, this.f6844m, this.f6845n, tVar, g3.b(this.f6846o | 1), g3.b(this.f6847p), this.f6848q);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: Pager.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends n0 implements ld.l<androidx.compose.ui.semantics.z, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f6849b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c0 f6850c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ r0 f6851d;

        /* compiled from: Pager.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        static final class a extends n0 implements ld.a<Boolean> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c0 f6852b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ r0 f6853c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c0 c0Var, r0 r0Var) {
                super(0);
                this.f6852b = c0Var;
                this.f6853c = r0Var;
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(m.m(this.f6852b, this.f6853c));
            }
        }

        /* compiled from: Pager.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        static final class b extends n0 implements ld.a<Boolean> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c0 f6854b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ r0 f6855c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(c0 c0Var, r0 r0Var) {
                super(0);
                this.f6854b = c0Var;
                this.f6855c = r0Var;
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(m.n(this.f6854b, this.f6855c));
            }
        }

        /* compiled from: Pager.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        static final class c extends n0 implements ld.a<Boolean> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c0 f6856b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ r0 f6857c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(c0 c0Var, r0 r0Var) {
                super(0);
                this.f6856b = c0Var;
                this.f6857c = r0Var;
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(m.m(this.f6856b, this.f6857c));
            }
        }

        /* compiled from: Pager.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.pager.m$d$d, reason: collision with other inner class name */
        static final class C0118d extends n0 implements ld.a<Boolean> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c0 f6858b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ r0 f6859c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0118d(c0 c0Var, r0 r0Var) {
                super(0);
                this.f6858b = c0Var;
                this.f6859c = r0Var;
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(m.n(this.f6858b, this.f6859c));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z4, c0 c0Var, r0 r0Var) {
            super(1);
            this.f6849b = z4;
            this.f6850c = c0Var;
            this.f6851d = r0Var;
        }

        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
            if (this.f6849b) {
                androidx.compose.ui.semantics.w.J0(zVar, null, new a(this.f6850c, this.f6851d), 1, null);
                androidx.compose.ui.semantics.w.D0(zVar, null, new b(this.f6850c, this.f6851d), 1, null);
            } else {
                androidx.compose.ui.semantics.w.F0(zVar, null, new c(this.f6850c, this.f6851d), 1, null);
                androidx.compose.ui.semantics.w.H0(zVar, null, new C0118d(this.f6850c, this.f6851d), 1, null);
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.ui.semantics.z zVar) {
            a(zVar);
            return k2.f75408a;
        }
    }

    /* compiled from: Pager.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.pager.PagerKt$pagerSemantics$performBackwardPaging$1", f = "Pager.kt", i = {}, l = {ta.a.f91897b}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f6860b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c0 f6861c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(c0 c0Var, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f6861c = c0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new e(this.f6861c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f6860b;
            if (i4 == 0) {
                a1.n(obj);
                c0 c0Var = this.f6861c;
                this.f6860b = 1;
                if (f0.f(c0Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((e) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* compiled from: Pager.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.pager.PagerKt$pagerSemantics$performForwardPaging$1", f = "Pager.kt", i = {}, l = {917}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f6862b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c0 f6863c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(c0 c0Var, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f6863c = c0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new f(this.f6863c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f6862b;
            if (i4 == 0) {
                a1.n(obj);
                c0 c0Var = this.f6863c;
                this.f6862b = 1;
                if (f0.e(c0Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((f) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0271  */
    @androidx.compose.foundation.z0
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@fg.l androidx.compose.foundation.pager.c0 r36, @fg.m androidx.compose.ui.q r37, @fg.m androidx.compose.foundation.layout.l1 r38, @fg.m androidx.compose.foundation.pager.g r39, int r40, float r41, @fg.m androidx.compose.ui.c.InterfaceC0326c r42, @fg.m androidx.compose.foundation.gestures.snapping.h r43, boolean r44, boolean r45, @fg.m ld.l<? super java.lang.Integer, ? extends java.lang.Object> r46, @fg.m androidx.compose.ui.input.nestedscroll.a r47, @fg.l ld.r<? super androidx.compose.foundation.pager.v, ? super java.lang.Integer, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r48, @fg.m androidx.compose.runtime.t r49, int r50, int r51, int r52) {
        /*
            Method dump skipped, instructions count: 914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.m.a(androidx.compose.foundation.pager.c0, androidx.compose.ui.q, androidx.compose.foundation.layout.l1, androidx.compose.foundation.pager.g, int, float, androidx.compose.ui.c$c, androidx.compose.foundation.gestures.snapping.h, boolean, boolean, ld.l, androidx.compose.ui.input.nestedscroll.a, ld.r, androidx.compose.runtime.t, int, int, int):void");
    }

    private static final androidx.compose.foundation.gestures.snapping.j b(c0 c0Var, a0 a0Var, androidx.compose.animation.core.z<Float> zVar, float f4) {
        return new b(c0Var, f4, zVar, a0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0271  */
    @androidx.compose.foundation.z0
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(@fg.l androidx.compose.foundation.pager.c0 r36, @fg.m androidx.compose.ui.q r37, @fg.m androidx.compose.foundation.layout.l1 r38, @fg.m androidx.compose.foundation.pager.g r39, int r40, float r41, @fg.m androidx.compose.ui.c.b r42, @fg.m androidx.compose.foundation.gestures.snapping.h r43, boolean r44, boolean r45, @fg.m ld.l<? super java.lang.Integer, ? extends java.lang.Object> r46, @fg.m androidx.compose.ui.input.nestedscroll.a r47, @fg.l ld.r<? super androidx.compose.foundation.pager.v, ? super java.lang.Integer, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r48, @fg.m androidx.compose.runtime.t r49, int r50, int r51, int r52) {
        /*
            Method dump skipped, instructions count: 914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.m.c(androidx.compose.foundation.pager.c0, androidx.compose.ui.q, androidx.compose.foundation.layout.l1, androidx.compose.foundation.pager.g, int, float, androidx.compose.ui.c$b, androidx.compose.foundation.gestures.snapping.h, boolean, boolean, ld.l, androidx.compose.ui.input.nestedscroll.a, ld.r, androidx.compose.runtime.t, int, int, int):void");
    }

    public static final androidx.compose.foundation.gestures.snapping.j d(c0 c0Var, a0 a0Var, androidx.compose.animation.core.z zVar, float f4) {
        return new b(c0Var, f4, zVar, a0Var);
    }

    private static final void i(ld.a<String> aVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float j(c0 c0Var) {
        return c0Var.F().getOrientation() == j0.Horizontal ? i0.f.p(c0Var.c0()) : i0.f.r(c0Var.c0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(c0 c0Var) {
        return j(c0Var) < 0.0f;
    }

    @fg.l
    @androidx.compose.runtime.i
    public static final androidx.compose.ui.q l(@fg.l androidx.compose.ui.q qVar, @fg.l c0 c0Var, boolean z4, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1509835088);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1509835088, i4, -1, "androidx.compose.foundation.pager.pagerSemantics (Pager.kt:911)");
        }
        Object a5 = androidx.compose.foundation.j.a(tVar, 773894976, -492369756);
        if (a5 == androidx.compose.runtime.t.INSTANCE.a()) {
            a5 = androidx.view.compose.l.a(androidx.compose.runtime.a1.m(kotlin.coroutines.i.f75057b, tVar), tVar);
        }
        tVar.p0();
        r0 coroutineScope = ((androidx.compose.runtime.j0) a5).getCoroutineScope();
        tVar.p0();
        androidx.compose.ui.q w32 = qVar.w3(androidx.compose.ui.semantics.o.f(androidx.compose.ui.q.INSTANCE, false, new d(z4, c0Var, coroutineScope), 1, null));
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return w32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(c0 c0Var, r0 r0Var) {
        if (!c0Var.e()) {
            return false;
        }
        kotlinx.coroutines.k.f(r0Var, null, null, new e(c0Var, null), 3, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(c0 c0Var, r0 r0Var) {
        if (!c0Var.a()) {
            return false;
        }
        kotlinx.coroutines.k.f(r0Var, null, null, new f(c0Var, null), 3, null);
        return true;
    }
}
