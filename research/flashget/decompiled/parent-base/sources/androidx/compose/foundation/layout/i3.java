package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.n2;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.t;
import kotlin.Metadata;

/* compiled from: WindowInsets.android.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\bE\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\"(\u0010\u0011\u001a\u00020\u000b*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\".\u0010\u0011\u001a\u00020\u000b*\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\"\u0015\u0010\u001d\u001a\u00020\u001a*\u00020\u00198G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\"\u0015\u0010\u001f\u001a\u00020\u001a*\u00020\u00198G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001c\"\u0015\u0010!\u001a\u00020\u001a*\u00020\u00198G¢\u0006\u0006\u001a\u0004\b \u0010\u001c\"\u0015\u0010#\u001a\u00020\u001a*\u00020\u00198G¢\u0006\u0006\u001a\u0004\b\"\u0010\u001c\"\u0015\u0010%\u001a\u00020\u001a*\u00020\u00198G¢\u0006\u0006\u001a\u0004\b$\u0010\u001c\"\u0015\u0010'\u001a\u00020\u001a*\u00020\u00198G¢\u0006\u0006\u001a\u0004\b&\u0010\u001c\"\u0015\u0010)\u001a\u00020\u001a*\u00020\u00198G¢\u0006\u0006\u001a\u0004\b(\u0010\u001c\"\u0015\u0010+\u001a\u00020\u001a*\u00020\u00198G¢\u0006\u0006\u001a\u0004\b*\u0010\u001c\"\u0015\u0010-\u001a\u00020\u001a*\u00020\u00198G¢\u0006\u0006\u001a\u0004\b,\u0010\u001c\"\u0015\u0010/\u001a\u00020\u001a*\u00020\u00198G¢\u0006\u0006\u001a\u0004\b.\u0010\u001c\"\u0015\u00101\u001a\u00020\u001a*\u00020\u00198G¢\u0006\u0006\u001a\u0004\b0\u0010\u001c\"\u0015\u00103\u001a\u00020\u001a*\u00020\u00198G¢\u0006\u0006\u001a\u0004\b2\u0010\u001c\"\u0015\u00105\u001a\u00020\u001a*\u00020\u00198G¢\u0006\u0006\u001a\u0004\b4\u0010\u001c\"\u001e\u00109\u001a\u00020\u001a*\u00020\u00198GX\u0087\u0004¢\u0006\f\u0012\u0004\b7\u00108\u001a\u0004\b6\u0010\u001c\"\u001e\u0010<\u001a\u00020\u001a*\u00020\u00198GX\u0087\u0004¢\u0006\f\u0012\u0004\b;\u00108\u001a\u0004\b:\u0010\u001c\"\u001e\u0010?\u001a\u00020\u001a*\u00020\u00198GX\u0087\u0004¢\u0006\f\u0012\u0004\b>\u00108\u001a\u0004\b=\u0010\u001c\"\u001e\u0010B\u001a\u00020\u001a*\u00020\u00198GX\u0087\u0004¢\u0006\f\u0012\u0004\bA\u00108\u001a\u0004\b@\u0010\u001c\"\u001e\u0010E\u001a\u00020\u001a*\u00020\u00198GX\u0087\u0004¢\u0006\f\u0012\u0004\bD\u00108\u001a\u0004\bC\u0010\u001c\"\u001e\u0010I\u001a\u00020\u000b*\u00020\u00198GX\u0087\u0004¢\u0006\f\u0012\u0004\bH\u00108\u001a\u0004\bF\u0010G\"\u001e\u0010L\u001a\u00020\u000b*\u00020\u00198GX\u0087\u0004¢\u0006\f\u0012\u0004\bK\u00108\u001a\u0004\bJ\u0010G\"\u001e\u0010O\u001a\u00020\u000b*\u00020\u00198GX\u0087\u0004¢\u0006\f\u0012\u0004\bN\u00108\u001a\u0004\bM\u0010G\"\u001e\u0010R\u001a\u00020\u000b*\u00020\u00198GX\u0087\u0004¢\u0006\f\u0012\u0004\bQ\u00108\u001a\u0004\bP\u0010G\"\u001e\u0010U\u001a\u00020\u000b*\u00020\u00198GX\u0087\u0004¢\u0006\f\u0012\u0004\bT\u00108\u001a\u0004\bS\u0010G\"\u001e\u0010X\u001a\u00020\u000b*\u00020\u00198GX\u0087\u0004¢\u0006\f\u0012\u0004\bW\u00108\u001a\u0004\bV\u0010G\"\u001e\u0010[\u001a\u00020\u001a*\u00020\u00198GX\u0087\u0004¢\u0006\f\u0012\u0004\bZ\u00108\u001a\u0004\bY\u0010\u001c\"\u001e\u0010^\u001a\u00020\u001a*\u00020\u00198GX\u0087\u0004¢\u0006\f\u0012\u0004\b]\u00108\u001a\u0004\b\\\u0010\u001c¨\u0006_"}, d2 = {"Landroidx/core/graphics/e0;", "Landroidx/compose/foundation/layout/t0;", "T", "(Landroidx/core/graphics/e0;)Landroidx/compose/foundation/layout/t0;", "insets", "", "name", "Landroidx/compose/foundation/layout/l2;", "a", "(Landroidx/core/graphics/e0;Ljava/lang/String;)Landroidx/compose/foundation/layout/l2;", "Landroidx/compose/ui/platform/AbstractComposeView;", "", "value", "k", "(Landroidx/compose/ui/platform/AbstractComposeView;)Z", "R", "(Landroidx/compose/ui/platform/AbstractComposeView;Z)V", "consumeWindowInsets", "Landroidx/compose/ui/platform/ComposeView;", "l", "(Landroidx/compose/ui/platform/ComposeView;)Z", "S", "(Landroidx/compose/ui/platform/ComposeView;Z)V", "m", "(Landroidx/compose/ui/platform/ComposeView;)V", "Landroidx/compose/foundation/layout/n2$a;", "Landroidx/compose/foundation/layout/n2;", "h", "(Landroidx/compose/foundation/layout/n2$a;Landroidx/compose/runtime/t;I)Landroidx/compose/foundation/layout/n2;", "captionBar", "n", "displayCutout", "o", "ime", "t", "mandatorySystemGestures", "u", "navigationBars", "A", "statusBars", "D", "systemBars", "G", "systemGestures", "H", "tappableElement", "K", "waterfall", "y", "safeDrawing", "z", "safeGestures", "x", "safeContent", "i", "j", "(Landroidx/compose/foundation/layout/n2$a;)V", "captionBarIgnoringVisibility", "v", "w", "navigationBarsIgnoringVisibility", "B", "C", "statusBarsIgnoringVisibility", "E", "F", "systemBarsIgnoringVisibility", "I", "J", "tappableElementIgnoringVisibility", "L", "(Landroidx/compose/foundation/layout/n2$a;Landroidx/compose/runtime/t;I)Z", "M", "isCaptionBarVisible", "N", "O", "isImeVisible", "d", "e", "areStatusBarsVisible", "b", "c", "areNavigationBarsVisible", "f", "g", "areSystemBarsVisible", "P", "Q", "isTappableElementVisible", "p", "q", "imeAnimationSource", "r", "s", "imeAnimationTarget", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i3 {
    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getStatusBars")
    public static final n2 A(@fg.l n2.Companion companion, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-675090670);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-675090670, i4, -1, "androidx.compose.foundation.layout.<get-statusBars> (WindowInsets.android.kt:192)");
        }
        h statusBars = q2.INSTANCE.c(tVar, 8).getStatusBars();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return statusBars;
    }

    @d0
    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getStatusBarsIgnoringVisibility")
    public static final n2 B(@fg.l n2.Companion companion, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(594020756);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(594020756, i4, -1, "androidx.compose.foundation.layout.<get-statusBarsIgnoringVisibility> (WindowInsets.android.kt:292)");
        }
        l2 statusBarsIgnoringVisibility = q2.INSTANCE.c(tVar, 8).getStatusBarsIgnoringVisibility();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return statusBarsIgnoringVisibility;
    }

    @d0
    public static /* synthetic */ void C(n2.Companion companion) {
    }

    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getSystemBars")
    public static final n2 D(@fg.l n2.Companion companion, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-282936756);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-282936756, i4, -1, "androidx.compose.foundation.layout.<get-systemBars> (WindowInsets.android.kt:200)");
        }
        h systemBars = q2.INSTANCE.c(tVar, 8).getSystemBars();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return systemBars;
    }

    @d0
    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getSystemBarsIgnoringVisibility")
    public static final n2 E(@fg.l n2.Companion companion, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1564566798);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1564566798, i4, -1, "androidx.compose.foundation.layout.<get-systemBarsIgnoringVisibility> (WindowInsets.android.kt:305)");
        }
        l2 systemBarsIgnoringVisibility = q2.INSTANCE.c(tVar, 8).getSystemBarsIgnoringVisibility();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return systemBarsIgnoringVisibility;
    }

    @d0
    public static /* synthetic */ void F(n2.Companion companion) {
    }

    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getSystemGestures")
    public static final n2 G(@fg.l n2.Companion companion, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(989216224);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(989216224, i4, -1, "androidx.compose.foundation.layout.<get-systemGestures> (WindowInsets.android.kt:208)");
        }
        h systemGestures = q2.INSTANCE.c(tVar, 8).getSystemGestures();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return systemGestures;
    }

    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getTappableElement")
    public static final n2 H(@fg.l n2.Companion companion, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-1994205284);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1994205284, i4, -1, "androidx.compose.foundation.layout.<get-tappableElement> (WindowInsets.android.kt:216)");
        }
        h tappableElement = q2.INSTANCE.c(tVar, 8).getTappableElement();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return tappableElement;
    }

    @d0
    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getTappableElementIgnoringVisibility")
    public static final n2 I(@fg.l n2.Companion companion, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-1488788292);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1488788292, i4, -1, "androidx.compose.foundation.layout.<get-tappableElementIgnoringVisibility> (WindowInsets.android.kt:318)");
        }
        l2 tappableElementIgnoringVisibility = q2.INSTANCE.c(tVar, 8).getTappableElementIgnoringVisibility();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return tappableElementIgnoringVisibility;
    }

    @d0
    public static /* synthetic */ void J(n2.Companion companion) {
    }

    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getWaterfall")
    public static final n2 K(@fg.l n2.Companion companion, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1943241020);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1943241020, i4, -1, "androidx.compose.foundation.layout.<get-waterfall> (WindowInsets.android.kt:224)");
        }
        l2 waterfall = q2.INSTANCE.c(tVar, 8).getWaterfall();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return waterfall;
    }

    @d0
    @androidx.compose.runtime.i
    @kd.i(name = "isCaptionBarVisible")
    public static final boolean L(@fg.l n2.Companion companion, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-501076620);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-501076620, i4, -1, "androidx.compose.foundation.layout.<get-isCaptionBarVisible> (WindowInsets.android.kt:330)");
        }
        boolean g4 = q2.INSTANCE.c(tVar, 8).getCaptionBar().g();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return g4;
    }

    @d0
    public static /* synthetic */ void M(n2.Companion companion) {
    }

    @d0
    @androidx.compose.runtime.i
    @kd.i(name = "isImeVisible")
    public static final boolean N(@fg.l n2.Companion companion, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-1873571424);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1873571424, i4, -1, "androidx.compose.foundation.layout.<get-isImeVisible> (WindowInsets.android.kt:342)");
        }
        boolean g4 = q2.INSTANCE.c(tVar, 8).getIme().g();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return g4;
    }

    @d0
    public static /* synthetic */ void O(n2.Companion companion) {
    }

    @d0
    @androidx.compose.runtime.i
    @kd.i(name = "isTappableElementVisible")
    public static final boolean P(@fg.l n2.Companion companion, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-1737201120);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1737201120, i4, -1, "androidx.compose.foundation.layout.<get-isTappableElementVisible> (WindowInsets.android.kt:389)");
        }
        boolean g4 = q2.INSTANCE.c(tVar, 8).getTappableElement().g();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return g4;
    }

    @d0
    public static /* synthetic */ void Q(n2.Companion companion) {
    }

    public static final void R(@fg.l AbstractComposeView abstractComposeView, boolean z4) {
        abstractComposeView.setTag(t.b.I, Boolean.valueOf(z4));
    }

    @fg.l
    public static final t0 T(@fg.l androidx.core.graphics.e0 e0Var) {
        return new t0(e0Var.f26245a, e0Var.f26246b, e0Var.f26247c, e0Var.f26248d);
    }

    @fg.l
    public static final l2 a(@fg.l androidx.core.graphics.e0 e0Var, @fg.l String str) {
        return new l2(T(e0Var), str);
    }

    @d0
    @androidx.compose.runtime.i
    @kd.i(name = "getAreNavigationBarsVisible")
    public static final boolean b(@fg.l n2.Companion companion, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(710310464);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(710310464, i4, -1, "androidx.compose.foundation.layout.<get-areNavigationBarsVisible> (WindowInsets.android.kt:366)");
        }
        boolean g4 = q2.INSTANCE.c(tVar, 8).getNavigationBars().g();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return g4;
    }

    @d0
    public static /* synthetic */ void c(n2.Companion companion) {
    }

    @d0
    @androidx.compose.runtime.i
    @kd.i(name = "getAreStatusBarsVisible")
    public static final boolean d(@fg.l n2.Companion companion, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1613283456);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1613283456, i4, -1, "androidx.compose.foundation.layout.<get-areStatusBarsVisible> (WindowInsets.android.kt:354)");
        }
        boolean g4 = q2.INSTANCE.c(tVar, 8).getStatusBars().g();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return g4;
    }

    @d0
    public static /* synthetic */ void e(n2.Companion companion) {
    }

    @d0
    @androidx.compose.runtime.i
    @kd.i(name = "getAreSystemBarsVisible")
    public static final boolean f(@fg.l n2.Companion companion, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1985490720);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1985490720, i4, -1, "androidx.compose.foundation.layout.<get-areSystemBarsVisible> (WindowInsets.android.kt:378)");
        }
        boolean g4 = q2.INSTANCE.c(tVar, 8).getSystemBars().g();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return g4;
    }

    @d0
    public static /* synthetic */ void g(n2.Companion companion) {
    }

    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getCaptionBar")
    public static final n2 h(@fg.l n2.Companion companion, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-1832025528);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1832025528, i4, -1, "androidx.compose.foundation.layout.<get-captionBar> (WindowInsets.android.kt:142)");
        }
        h captionBar = q2.INSTANCE.c(tVar, 8).getCaptionBar();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return captionBar;
    }

    @d0
    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getCaptionBarIgnoringVisibility")
    public static final n2 i(@fg.l n2.Companion companion, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-1731251574);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1731251574, i4, -1, "androidx.compose.foundation.layout.<get-captionBarIgnoringVisibility> (WindowInsets.android.kt:266)");
        }
        l2 captionBarIgnoringVisibility = q2.INSTANCE.c(tVar, 8).getCaptionBarIgnoringVisibility();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return captionBarIgnoringVisibility;
    }

    @d0
    public static /* synthetic */ void j(n2.Companion companion) {
    }

    public static final boolean k(@fg.l AbstractComposeView abstractComposeView) {
        Object tag = abstractComposeView.getTag(t.b.I);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public static final /* synthetic */ boolean l(ComposeView composeView) {
        Object tag = composeView.getTag(t.b.I);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Please use AbstractComposeView.consumeWindowInsets")
    public static /* synthetic */ void m(ComposeView composeView) {
    }

    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getDisplayCutout")
    public static final n2 n(@fg.l n2.Companion companion, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1324817724);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1324817724, i4, -1, "androidx.compose.foundation.layout.<get-displayCutout> (WindowInsets.android.kt:151)");
        }
        h displayCutout = q2.INSTANCE.c(tVar, 8).getDisplayCutout();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return displayCutout;
    }

    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getIme")
    public static final n2 o(@fg.l n2.Companion companion, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-1466917860);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1466917860, i4, -1, "androidx.compose.foundation.layout.<get-ime> (WindowInsets.android.kt:165)");
        }
        h ime = q2.INSTANCE.c(tVar, 8).getIme();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return ime;
    }

    @d0
    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getImeAnimationSource")
    public static final n2 p(@fg.l n2.Companion companion, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-1126064918);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1126064918, i4, -1, "androidx.compose.foundation.layout.<get-imeAnimationSource> (WindowInsets.android.kt:404)");
        }
        l2 imeAnimationSource = q2.INSTANCE.c(tVar, 8).getImeAnimationSource();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return imeAnimationSource;
    }

    @d0
    public static /* synthetic */ void q(n2.Companion companion) {
    }

    @d0
    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getImeAnimationTarget")
    public static final n2 r(@fg.l n2.Companion companion, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-466319786);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-466319786, i4, -1, "androidx.compose.foundation.layout.<get-imeAnimationTarget> (WindowInsets.android.kt:419)");
        }
        l2 imeAnimationTarget = q2.INSTANCE.c(tVar, 8).getImeAnimationTarget();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return imeAnimationTarget;
    }

    @d0
    public static /* synthetic */ void s(n2.Companion companion) {
    }

    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getMandatorySystemGestures")
    public static final n2 t(@fg.l n2.Companion companion, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1369492988);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1369492988, i4, -1, "androidx.compose.foundation.layout.<get-mandatorySystemGestures> (WindowInsets.android.kt:174)");
        }
        h mandatorySystemGestures = q2.INSTANCE.c(tVar, 8).getMandatorySystemGestures();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return mandatorySystemGestures;
    }

    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getNavigationBars")
    public static final n2 u(@fg.l n2.Companion companion, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1596175702);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1596175702, i4, -1, "androidx.compose.foundation.layout.<get-navigationBars> (WindowInsets.android.kt:184)");
        }
        h navigationBars = q2.INSTANCE.c(tVar, 8).getNavigationBars();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return navigationBars;
    }

    @d0
    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getNavigationBarsIgnoringVisibility")
    public static final n2 v(@fg.l n2.Companion companion, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-1990981160);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1990981160, i4, -1, "androidx.compose.foundation.layout.<get-navigationBarsIgnoringVisibility> (WindowInsets.android.kt:280)");
        }
        l2 navigationBarsIgnoringVisibility = q2.INSTANCE.c(tVar, 8).getNavigationBarsIgnoringVisibility();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return navigationBarsIgnoringVisibility;
    }

    @d0
    public static /* synthetic */ void w(n2.Companion companion) {
    }

    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getSafeContent")
    public static final n2 x(@fg.l n2.Companion companion, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-2026663876);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-2026663876, i4, -1, "androidx.compose.foundation.layout.<get-safeContent> (WindowInsets.android.kt:254)");
        }
        n2 safeContent = q2.INSTANCE.c(tVar, 8).getSafeContent();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return safeContent;
    }

    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getSafeDrawing")
    public static final n2 y(@fg.l n2.Companion companion, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-49441252);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-49441252, i4, -1, "androidx.compose.foundation.layout.<get-safeDrawing> (WindowInsets.android.kt:234)");
        }
        n2 safeDrawing = q2.INSTANCE.c(tVar, 8).getSafeDrawing();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return safeDrawing;
    }

    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getSafeGestures")
    public static final n2 z(@fg.l n2.Companion companion, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-1594247780);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1594247780, i4, -1, "androidx.compose.foundation.layout.<get-safeGestures> (WindowInsets.android.kt:245)");
        }
        n2 safeGestures = q2.INSTANCE.c(tVar, 8).getSafeGestures();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return safeGestures;
    }
}
