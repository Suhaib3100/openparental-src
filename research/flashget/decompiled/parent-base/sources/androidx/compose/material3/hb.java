package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: Tooltip.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J:\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001d\u001a\u00020\u001a8G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010 \u001a\u00020\u00078Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\"\u001a\u00020\u00078Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0011\u0010$\u001a\u00020\u001a8G¢\u0006\u0006\u001a\u0004\b#\u0010\u001cR\u0018\u0010'\u001a\u00020\u0004*\u00020%8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010&\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Landroidx/compose/material3/hb;", "", "<init>", "()V", "Landroidx/compose/material3/e8;", "i", "(Landroidx/compose/runtime/t;I)Landroidx/compose/material3/e8;", "Landroidx/compose/ui/graphics/d2;", "containerColor", "contentColor", "titleContentColor", "actionContentColor", "j", "(JJJJLandroidx/compose/runtime/t;II)Landroidx/compose/material3/e8;", "Landroidx/compose/ui/unit/h;", "spacingBetweenTooltipAndAnchor", "Landroidx/compose/ui/window/o;", "g", "(FLandroidx/compose/runtime/t;II)Landroidx/compose/ui/window/o;", "h", "Landroidx/compose/material3/o2;", "b", "Landroidx/compose/material3/o2;", "a", "()Landroidx/compose/material3/o2;", "caretProperties", "Landroidx/compose/ui/graphics/e6;", "d", "(Landroidx/compose/runtime/t;I)Landroidx/compose/ui/graphics/e6;", "plainTooltipContainerShape", "c", "(Landroidx/compose/runtime/t;I)J", "plainTooltipContainerColor", "e", "plainTooltipContentColor", "f", "richTooltipContainerShape", "Landroidx/compose/material3/a3;", "(Landroidx/compose/material3/a3;)Landroidx/compose/material3/e8;", "defaultRichTooltipColors", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 1)
@f5
@kotlin.jvm.internal.r1({"SMAP\nTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,719:1\n74#2:720\n74#2:727\n1116#3,6:721\n1116#3,6:728\n154#4:734\n*S KotlinDebug\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipDefaults\n*L\n377#1:720\n412#1:727\n380#1:721,6\n415#1:728,6\n329#1:734\n*E\n"})
/* loaded from: classes.dex */
public final class hb {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final hb f11377a = new hb();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final o2 caretProperties = new o2(androidx.compose.ui.unit.h.g(8), 16, null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f11379c = 0;

    /* compiled from: Tooltip.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J2\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"androidx/compose/material3/hb$a", "Landroidx/compose/ui/window/o;", "Landroidx/compose/ui/unit/s;", "anchorBounds", "Landroidx/compose/ui/unit/u;", "windowSize", "Landroidx/compose/ui/unit/w;", "layoutDirection", "popupContentSize", "Landroidx/compose/ui/unit/q;", "a", "(Landroidx/compose/ui/unit/s;JLandroidx/compose/ui/unit/w;J)J", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements androidx.compose.ui.window.o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f11380a;

        a(int i4) {
            this.f11380a = i4;
        }

        @Override // androidx.compose.ui.window.o
        public long a(@fg.l androidx.compose.ui.unit.s anchorBounds, long windowSize, @fg.l androidx.compose.ui.unit.w layoutDirection, long popupContentSize) {
            int G = ((anchorBounds.G() - androidx.compose.ui.unit.u.m(popupContentSize)) / 2) + anchorBounds.t();
            int top2 = (anchorBounds.getTop() - ((int) (popupContentSize & 4294967295L))) - this.f11380a;
            if (top2 < 0) {
                top2 = this.f11380a + anchorBounds.j();
            }
            return androidx.compose.ui.unit.r.a(G, top2);
        }
    }

    /* compiled from: Tooltip.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J2\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"androidx/compose/material3/hb$b", "Landroidx/compose/ui/window/o;", "Landroidx/compose/ui/unit/s;", "anchorBounds", "Landroidx/compose/ui/unit/u;", "windowSize", "Landroidx/compose/ui/unit/w;", "layoutDirection", "popupContentSize", "Landroidx/compose/ui/unit/q;", "a", "(Landroidx/compose/ui/unit/s;JLandroidx/compose/ui/unit/w;J)J", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements androidx.compose.ui.window.o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f11381a;

        b(int i4) {
            this.f11381a = i4;
        }

        @Override // androidx.compose.ui.window.o
        public long a(@fg.l androidx.compose.ui.unit.s anchorBounds, long windowSize, @fg.l androidx.compose.ui.unit.w layoutDirection, long popupContentSize) {
            int i4;
            int x4 = anchorBounds.x();
            if (androidx.compose.ui.unit.u.m(popupContentSize) + x4 > ((int) (windowSize >> 32)) && (x4 = anchorBounds.t() - (i4 = (int) (popupContentSize >> 32))) < 0) {
                x4 = ((anchorBounds.G() - i4) / 2) + anchorBounds.t();
            }
            int top2 = (anchorBounds.getTop() - ((int) (popupContentSize & 4294967295L))) - this.f11381a;
            if (top2 < 0) {
                top2 = this.f11381a + anchorBounds.j();
            }
            return androidx.compose.ui.unit.r.a(x4, top2);
        }
    }

    private hb() {
    }

    @fg.l
    public final o2 a() {
        return caretProperties;
    }

    @fg.l
    public final e8 b(@fg.l a3 a3Var) {
        e8 defaultRichTooltipColorsCached = a3Var.getDefaultRichTooltipColorsCached();
        if (defaultRichTooltipColorsCached != null) {
            return defaultRichTooltipColorsCached;
        }
        c0.v0 v0Var = c0.v0.f38266a;
        e8 e8Var = new e8(b3.h(a3Var, v0Var.f()), b3.h(a3Var, v0Var.l()), b3.h(a3Var, v0Var.j()), b3.h(a3Var, v0Var.c()), null);
        a3Var.b1(e8Var);
        return e8Var;
    }

    @androidx.compose.runtime.i
    @kd.i(name = "getPlainTooltipContainerColor")
    public final long c(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(102696215);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(102696215, i4, -1, "androidx.compose.material3.TooltipDefaults.<get-plainTooltipContainerColor> (Tooltip.kt:310)");
        }
        long k4 = b3.k(c0.s0.f38104a.a(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return k4;
    }

    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getPlainTooltipContainerShape")
    public final androidx.compose.ui.graphics.e6 d(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(49570325);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(49570325, i4, -1, "androidx.compose.material3.TooltipDefaults.<get-plainTooltipContainerShape> (Tooltip.kt:304)");
        }
        androidx.compose.ui.graphics.e6 e4 = x8.e(c0.s0.f38104a.b(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return e4;
    }

    @androidx.compose.runtime.i
    @kd.i(name = "getPlainTooltipContentColor")
    public final long e(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-1982928937);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1982928937, i4, -1, "androidx.compose.material3.TooltipDefaults.<get-plainTooltipContentColor> (Tooltip.kt:316)");
        }
        long k4 = b3.k(c0.s0.f38104a.c(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return k4;
    }

    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getRichTooltipContainerShape")
    public final androidx.compose.ui.graphics.e6 f(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1138709783);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1138709783, i4, -1, "androidx.compose.material3.TooltipDefaults.<get-richTooltipContainerShape> (Tooltip.kt:322)");
        }
        androidx.compose.ui.graphics.e6 e4 = x8.e(c0.v0.f38266a.h(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return e4;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final androidx.compose.ui.window.o g(float f4, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(1047866909);
        if ((i5 & 1) != 0) {
            f4 = ib.q();
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1047866909, i4, -1, "androidx.compose.material3.TooltipDefaults.rememberPlainTooltipPositionProvider (Tooltip.kt:375)");
        }
        int q22 = ((androidx.compose.ui.unit.d) tVar.x(androidx.compose.ui.platform.h1.i())).q2(f4);
        tVar.P(-2013870024);
        boolean f5 = tVar.f(q22);
        Object Q = tVar.Q();
        if (f5 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new a(q22);
            tVar.E(Q);
        }
        a aVar = (a) Q;
        tVar.p0();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return aVar;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final androidx.compose.ui.window.o h(float f4, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(-1538806795);
        if ((i5 & 1) != 0) {
            f4 = ib.q();
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1538806795, i4, -1, "androidx.compose.material3.TooltipDefaults.rememberRichTooltipPositionProvider (Tooltip.kt:410)");
        }
        int q22 = ((androidx.compose.ui.unit.d) tVar.x(androidx.compose.ui.platform.h1.i())).q2(f4);
        tVar.P(1605213924);
        boolean f5 = tVar.f(q22);
        Object Q = tVar.Q();
        if (f5 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new b(q22);
            tVar.E(Q);
        }
        b bVar = (b) Q;
        tVar.p0();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return bVar;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final e8 i(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-1622312141);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1622312141, i4, -1, "androidx.compose.material3.TooltipDefaults.richTooltipColors (Tooltip.kt:335)");
        }
        e8 b5 = b(p6.f13227a.a(tVar, 6));
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return b5;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final e8 j(long j4, long j5, long j6, long j7, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        long j10;
        long j11;
        long j12;
        long j13;
        tVar.P(1498555081);
        if ((i5 & 1) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j10 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j10 = j4;
        }
        if ((i5 & 2) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j11 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j11 = j5;
        }
        if ((i5 & 4) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j12 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j12 = j6;
        }
        if ((i5 & 8) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j13 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j13 = j7;
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1498555081, i4, -1, "androidx.compose.material3.TooltipDefaults.richTooltipColors (Tooltip.kt:347)");
        }
        e8 a5 = b(p6.f13227a.a(tVar, 6)).a(j10, j11, j12, j13);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return a5;
    }
}
