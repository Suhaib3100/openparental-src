package androidx.compose.material3;

import androidx.compose.ui.graphics.d2;
import kotlin.Metadata;

/* compiled from: Button.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J:\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u0006J:\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0006J:\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0012\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0006J:\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\rJ\u000f\u0010\u0014\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0006J:\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\rJD\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJD\u0010\u001f\u001a\u00020\u001c2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001eJD\u0010 \u001a\u00020\u001c2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010\u001eR\u001a\u0010!\u001a\u00020\u00168\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u001a\u0010\"\u001a\u00020\u00168\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001d\u0010\u0015R\u0017\u0010'\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010(\u001a\u00020\u00168\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0017\u0010*\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b\u001f\u0010$\u001a\u0004\b)\u0010&R\u001a\u0010+\u001a\u00020\u00168\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u0017\u0010-\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b\u0011\u0010$\u001a\u0004\b,\u0010&R\u001a\u0010.\u001a\u00020\u00168\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b \u0010\u0015R\u0017\u00100\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b/\u0010&R\u001d\u00103\u001a\u00020\u00168\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b%\u0010\u0015\u001a\u0004\b1\u00102R\u001d\u00106\u001a\u00020\u00168\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b4\u0010\u0015\u001a\u0004\b5\u00102R\u001d\u00109\u001a\u00020\u00168\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b7\u0010\u0015\u001a\u0004\b8\u00102R\u001d\u0010<\u001a\u00020\u00168\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b:\u0010\u0015\u001a\u0004\b;\u00102R\u0011\u0010@\u001a\u00020=8G¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0011\u0010B\u001a\u00020=8G¢\u0006\u0006\u001a\u0004\bA\u0010?R\u0011\u0010D\u001a\u00020=8G¢\u0006\u0006\u001a\u0004\bC\u0010?R\u0011\u0010F\u001a\u00020=8G¢\u0006\u0006\u001a\u0004\bE\u0010?R\u0011\u0010H\u001a\u00020=8G¢\u0006\u0006\u001a\u0004\bG\u0010?R\u0018\u0010K\u001a\u00020\u0004*\u00020I8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b4\u0010JR\u0018\u0010L\u001a\u00020\u0004*\u00020I8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b7\u0010JR\u0018\u0010M\u001a\u00020\u0004*\u00020I8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b:\u0010JR\u0018\u0010O\u001a\u00020\u0004*\u00020I8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bN\u0010JR\u0018\u0010Q\u001a\u00020\u0004*\u00020I8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bP\u0010JR\u0011\u0010U\u001a\u00020R8G¢\u0006\u0006\u001a\u0004\bS\u0010T\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006V"}, d2 = {"Landroidx/compose/material3/o0;", "", "<init>", "()V", "Landroidx/compose/material3/n0;", "a", "(Landroidx/compose/runtime/t;I)Landroidx/compose/material3/n0;", "Landroidx/compose/ui/graphics/d2;", "containerColor", "contentColor", "disabledContainerColor", "disabledContentColor", "b", "(JJJJLandroidx/compose/runtime/t;II)Landroidx/compose/material3/n0;", "d", "e", "g", "h", "C", "D", "E", "F", "Landroidx/compose/ui/unit/h;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "disabledElevation", "Landroidx/compose/material3/p0;", "c", "(FFFFFLandroidx/compose/runtime/t;II)Landroidx/compose/material3/p0;", "f", "i", "ButtonHorizontalPadding", "ButtonVerticalPadding", "Landroidx/compose/foundation/layout/l1;", "Landroidx/compose/foundation/layout/l1;", "k", "()Landroidx/compose/foundation/layout/l1;", "ContentPadding", "ButtonWithIconHorizontalStartPadding", "j", "ButtonWithIconContentPadding", "TextButtonHorizontalPadding", "z", "TextButtonContentPadding", "TextButtonWithIconHorizontalEndPadding", "A", "TextButtonWithIconContentPadding", "v", "()F", "MinWidth", "l", "u", "MinHeight", "m", "s", "IconSize", "n", "t", "IconSpacing", "Landroidx/compose/ui/graphics/e6;", "y", "(Landroidx/compose/runtime/t;I)Landroidx/compose/ui/graphics/e6;", "shape", "q", "elevatedShape", "r", "filledTonalShape", "x", "outlinedShape", "B", "textShape", "Landroidx/compose/material3/a3;", "(Landroidx/compose/material3/a3;)Landroidx/compose/material3/n0;", "defaultButtonColors", "defaultElevatedButtonColors", "defaultFilledTonalButtonColors", "o", "defaultOutlinedButtonColors", "p", "defaultTextButtonColors", "Landroidx/compose/foundation/c0;", "w", "(Landroidx/compose/runtime/t;I)Landroidx/compose/foundation/c0;", "outlinedButtonBorder", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\nandroidx/compose/material3/ButtonDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1068:1\n154#2:1069\n154#2:1070\n154#2:1071\n154#2:1072\n154#2:1073\n154#2:1074\n154#2:1075\n154#2:1076\n154#2:1077\n*S KotlinDebug\n*F\n+ 1 Button.kt\nandroidx/compose/material3/ButtonDefaults\n*L\n825#1:1069\n450#1:1070\n451#1:1071\n470#1:1072\n481#1:1073\n496#1:1074\n511#1:1075\n517#1:1076\n525#1:1077\n*E\n"})
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final o0 f12901a = new o0();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float ButtonHorizontalPadding;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float ButtonVerticalPadding;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final androidx.compose.foundation.layout.l1 ContentPadding;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final float ButtonWithIconHorizontalStartPadding;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final androidx.compose.foundation.layout.l1 ButtonWithIconContentPadding;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final float TextButtonHorizontalPadding;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final androidx.compose.foundation.layout.l1 TextButtonContentPadding;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final float TextButtonWithIconHorizontalEndPadding;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final androidx.compose.foundation.layout.l1 TextButtonWithIconContentPadding;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final float MinWidth;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final float MinHeight;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final float IconSize;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static final float IconSpacing;

    /* renamed from: o, reason: collision with root package name */
    public static final int f12915o = 0;

    static {
        float g4 = androidx.compose.ui.unit.h.g(24);
        ButtonHorizontalPadding = g4;
        float f4 = 8;
        ButtonVerticalPadding = f4;
        androidx.compose.foundation.layout.l1 d5 = androidx.compose.foundation.layout.j1.d(g4, f4, g4, f4);
        ContentPadding = d5;
        float f5 = 16;
        ButtonWithIconHorizontalStartPadding = f5;
        ButtonWithIconContentPadding = androidx.compose.foundation.layout.j1.d(f5, f4, g4, f4);
        float f6 = 12;
        TextButtonHorizontalPadding = f6;
        TextButtonContentPadding = androidx.compose.foundation.layout.j1.d(f6, d5.getTop(), f6, d5.getBottom());
        TextButtonWithIconHorizontalEndPadding = f5;
        TextButtonWithIconContentPadding = androidx.compose.foundation.layout.j1.d(f6, d5.getTop(), f5, d5.getBottom());
        MinWidth = 58;
        MinHeight = 40;
        IconSize = c0.v.f38240a.p();
        IconSpacing = f4;
    }

    private o0() {
    }

    @fg.l
    public final androidx.compose.foundation.layout.l1 A() {
        return TextButtonWithIconContentPadding;
    }

    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getTextShape")
    public final androidx.compose.ui.graphics.e6 B(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-349121587);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-349121587, i4, -1, "androidx.compose.material3.ButtonDefaults.<get-textShape> (Button.kt:539)");
        }
        androidx.compose.ui.graphics.e6 e4 = x8.e(c0.i1.f37455a.b(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return e4;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final n0 C(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-1344886725);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1344886725, i4, -1, "androidx.compose.material3.ButtonDefaults.outlinedButtonColors (Button.kt:675)");
        }
        n0 o4 = o(p6.f13227a.a(tVar, 6));
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return o4;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final n0 D(long j4, long j5, long j6, long j7, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        long j10;
        long j11;
        long j12;
        long j13;
        tVar.P(-1778526249);
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
            androidx.compose.runtime.x.r0(-1778526249, i4, -1, "androidx.compose.material3.ButtonDefaults.outlinedButtonColors (Button.kt:692)");
        }
        n0 c5 = o(p6.f13227a.a(tVar, 6)).c(j10, j11, j12, j13);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return c5;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final n0 E(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1880341584);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1880341584, i4, -1, "androidx.compose.material3.ButtonDefaults.textButtonColors (Button.kt:717)");
        }
        n0 p4 = p(p6.f13227a.a(tVar, 6));
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return p4;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final n0 F(long j4, long j5, long j6, long j7, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        long j10;
        long j11;
        long j12;
        long j13;
        tVar.P(-1402274782);
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
            androidx.compose.runtime.x.r0(-1402274782, i4, -1, "androidx.compose.material3.ButtonDefaults.textButtonColors (Button.kt:734)");
        }
        n0 c5 = p(p6.f13227a.a(tVar, 6)).c(j10, j11, j12, j13);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return c5;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final n0 a(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1449248637);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1449248637, i4, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:546)");
        }
        n0 l4 = l(p6.f13227a.a(tVar, 6));
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return l4;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final n0 b(long j4, long j5, long j6, long j7, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        long j10;
        long j11;
        long j12;
        long j13;
        tVar.P(-339300779);
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
            androidx.compose.runtime.x.r0(-339300779, i4, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:563)");
        }
        n0 c5 = l(p6.f13227a.a(tVar, 6)).c(j10, j11, j12, j13);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return c5;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final p0 c(float f4, float f5, float f6, float f7, float f10, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(1827791191);
        float b5 = (i5 & 1) != 0 ? c0.v.f38240a.b() : f4;
        float s4 = (i5 & 2) != 0 ? c0.v.f38240a.s() : f5;
        float i6 = (i5 & 4) != 0 ? c0.v.f38240a.i() : f6;
        float l4 = (i5 & 8) != 0 ? c0.v.f38240a.l() : f7;
        float f11 = (i5 & 16) != 0 ? c0.v.f38240a.f() : f10;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1827791191, i4, -1, "androidx.compose.material3.ButtonDefaults.buttonElevation (Button.kt:772)");
        }
        p0 p0Var = new p0(b5, s4, i6, l4, f11, null);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return p0Var;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final n0 d(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(2025043443);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(2025043443, i4, -1, "androidx.compose.material3.ButtonDefaults.elevatedButtonColors (Button.kt:589)");
        }
        n0 m4 = m(p6.f13227a.a(tVar, 6));
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return m4;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final n0 e(long j4, long j5, long j6, long j7, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        long j10;
        long j11;
        long j12;
        long j13;
        tVar.P(1507908383);
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
            androidx.compose.runtime.x.r0(1507908383, i4, -1, "androidx.compose.material3.ButtonDefaults.elevatedButtonColors (Button.kt:606)");
        }
        n0 c5 = m(p6.f13227a.a(tVar, 6)).c(j10, j11, j12, j13);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return c5;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final p0 f(float f4, float f5, float f6, float f7, float f10, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(1065482445);
        float b5 = (i5 & 1) != 0 ? c0.m.f37689a.b() : f4;
        float t4 = (i5 & 2) != 0 ? c0.m.f37689a.t() : f5;
        float j4 = (i5 & 4) != 0 ? c0.m.f37689a.j() : f6;
        float m4 = (i5 & 8) != 0 ? c0.m.f37689a.m() : f7;
        float g4 = (i5 & 16) != 0 ? c0.m.f37689a.g() : f10;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1065482445, i4, -1, "androidx.compose.material3.ButtonDefaults.elevatedButtonElevation (Button.kt:798)");
        }
        p0 p0Var = new p0(b5, t4, j4, m4, g4, null);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return p0Var;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final n0 g(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(824987837);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(824987837, i4, -1, "androidx.compose.material3.ButtonDefaults.filledTonalButtonColors (Button.kt:632)");
        }
        n0 n4 = n(p6.f13227a.a(tVar, 6));
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return n4;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final n0 h(long j4, long j5, long j6, long j7, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        long j10;
        long j11;
        long j12;
        long j13;
        tVar.P(1670757653);
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
            androidx.compose.runtime.x.r0(1670757653, i4, -1, "androidx.compose.material3.ButtonDefaults.filledTonalButtonColors (Button.kt:649)");
        }
        n0 c5 = n(p6.f13227a.a(tVar, 6)).c(j10, j11, j12, j13);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return c5;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final p0 i(float f4, float f5, float f6, float f7, float f10, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(5982871);
        float b5 = (i5 & 1) != 0 ? c0.z.f38399a.b() : f4;
        float s4 = (i5 & 2) != 0 ? c0.z.f38399a.s() : f5;
        float i6 = (i5 & 4) != 0 ? c0.z.f38399a.i() : f6;
        float l4 = (i5 & 8) != 0 ? c0.z.f38399a.l() : f7;
        float g4 = (i5 & 16) != 0 ? androidx.compose.ui.unit.h.g(0) : f10;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(5982871, i4, -1, "androidx.compose.material3.ButtonDefaults.filledTonalButtonElevation (Button.kt:825)");
        }
        p0 p0Var = new p0(b5, s4, i6, l4, g4, null);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return p0Var;
    }

    @fg.l
    public final androidx.compose.foundation.layout.l1 j() {
        return ButtonWithIconContentPadding;
    }

    @fg.l
    public final androidx.compose.foundation.layout.l1 k() {
        return ContentPadding;
    }

    @fg.l
    public final n0 l(@fg.l a3 a3Var) {
        n0 defaultButtonColorsCached = a3Var.getDefaultButtonColorsCached();
        if (defaultButtonColorsCached != null) {
            return defaultButtonColorsCached;
        }
        c0.v vVar = c0.v.f38240a;
        n0 n0Var = new n0(b3.h(a3Var, vVar.a()), b3.h(a3Var, vVar.q()), androidx.compose.ui.graphics.d2.w(b3.h(a3Var, vVar.e()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.d2.w(b3.h(a3Var, vVar.h()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        a3Var.E0(n0Var);
        return n0Var;
    }

    @fg.l
    public final n0 m(@fg.l a3 a3Var) {
        n0 defaultElevatedButtonColorsCached = a3Var.getDefaultElevatedButtonColorsCached();
        if (defaultElevatedButtonColorsCached != null) {
            return defaultElevatedButtonColorsCached;
        }
        c0.m mVar = c0.m.f37689a;
        n0 n0Var = new n0(b3.h(a3Var, mVar.a()), b3.h(a3Var, mVar.r()), androidx.compose.ui.graphics.d2.w(b3.h(a3Var, mVar.f()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.d2.w(b3.h(a3Var, mVar.i()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        a3Var.K0(n0Var);
        return n0Var;
    }

    @fg.l
    public final n0 n(@fg.l a3 a3Var) {
        n0 defaultFilledTonalButtonColorsCached = a3Var.getDefaultFilledTonalButtonColorsCached();
        if (defaultFilledTonalButtonColorsCached != null) {
            return defaultFilledTonalButtonColorsCached;
        }
        c0.z zVar = c0.z.f38399a;
        n0 n0Var = new n0(b3.h(a3Var, zVar.a()), b3.h(a3Var, zVar.q()), androidx.compose.ui.graphics.d2.w(b3.h(a3Var, zVar.e()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.d2.w(b3.h(a3Var, zVar.h()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        a3Var.O0(n0Var);
        return n0Var;
    }

    @fg.l
    public final n0 o(@fg.l a3 a3Var) {
        n0 defaultOutlinedButtonColorsCached = a3Var.getDefaultOutlinedButtonColorsCached();
        if (defaultOutlinedButtonColorsCached != null) {
            return defaultOutlinedButtonColorsCached;
        }
        d2.Companion companion = androidx.compose.ui.graphics.d2.INSTANCE;
        companion.getClass();
        long j4 = androidx.compose.ui.graphics.d2.f17777n;
        c0.m0 m0Var = c0.m0.f37715a;
        long h4 = b3.h(a3Var, m0Var.n());
        companion.getClass();
        n0 n0Var = new n0(j4, h4, androidx.compose.ui.graphics.d2.f17777n, androidx.compose.ui.graphics.d2.w(b3.h(a3Var, m0Var.d()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        a3Var.X0(n0Var);
        return n0Var;
    }

    @fg.l
    public final n0 p(@fg.l a3 a3Var) {
        n0 defaultTextButtonColorsCached = a3Var.getDefaultTextButtonColorsCached();
        if (defaultTextButtonColorsCached != null) {
            return defaultTextButtonColorsCached;
        }
        d2.Companion companion = androidx.compose.ui.graphics.d2.INSTANCE;
        companion.getClass();
        long j4 = androidx.compose.ui.graphics.d2.f17777n;
        c0.i1 i1Var = c0.i1.f37455a;
        long h4 = b3.h(a3Var, i1Var.k());
        companion.getClass();
        n0 n0Var = new n0(j4, h4, androidx.compose.ui.graphics.d2.f17777n, androidx.compose.ui.graphics.d2.w(b3.h(a3Var, i1Var.d()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        a3Var.g1(n0Var);
        return n0Var;
    }

    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getElevatedShape")
    public final androidx.compose.ui.graphics.e6 q(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(2143958791);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(2143958791, i4, -1, "androidx.compose.material3.ButtonDefaults.<get-elevatedShape> (Button.kt:530)");
        }
        androidx.compose.ui.graphics.e6 e4 = x8.e(c0.m.f37689a.d(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return e4;
    }

    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getFilledTonalShape")
    public final androidx.compose.ui.graphics.e6 r(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-886584987);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-886584987, i4, -1, "androidx.compose.material3.ButtonDefaults.<get-filledTonalShape> (Button.kt:533)");
        }
        androidx.compose.ui.graphics.e6 e4 = x8.e(c0.z.f38399a.d(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return e4;
    }

    public final float s() {
        return IconSize;
    }

    public final float t() {
        return IconSpacing;
    }

    public final float u() {
        return MinHeight;
    }

    public final float v() {
        return MinWidth;
    }

    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getOutlinedButtonBorder")
    public final androidx.compose.foundation.c0 w(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-563957672);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-563957672, i4, -1, "androidx.compose.material3.ButtonDefaults.<get-outlinedButtonBorder> (Button.kt:836)");
        }
        c0.m0 m0Var = c0.m0.f37715a;
        androidx.compose.foundation.c0 a5 = androidx.compose.foundation.d0.a(m0Var.q(), b3.k(m0Var.p(), tVar, 6));
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return a5;
    }

    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getOutlinedShape")
    public final androidx.compose.ui.graphics.e6 x(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-2045213065);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-2045213065, i4, -1, "androidx.compose.material3.ButtonDefaults.<get-outlinedShape> (Button.kt:536)");
        }
        androidx.compose.ui.graphics.e6 e4 = x8.e(c0.m0.f37715a.b(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return e4;
    }

    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getShape")
    public final androidx.compose.ui.graphics.e6 y(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-1234923021);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1234923021, i4, -1, "androidx.compose.material3.ButtonDefaults.<get-shape> (Button.kt:527)");
        }
        androidx.compose.ui.graphics.e6 e4 = x8.e(c0.v.f38240a.d(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return e4;
    }

    @fg.l
    public final androidx.compose.foundation.layout.l1 z() {
        return TextButtonContentPadding;
    }
}
