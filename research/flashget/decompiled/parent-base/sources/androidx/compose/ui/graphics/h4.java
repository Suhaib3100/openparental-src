package androidx.compose.ui.graphics;

import android.graphics.ColorSpace;
import java.util.function.DoubleUnaryOperator;
import kotlin.Metadata;

/* compiled from: AndroidColorSpace.android.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0004*\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/graphics/h4;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/colorspace/c;", "Landroid/graphics/ColorSpace;", "e", "(Landroidx/compose/ui/graphics/colorspace/c;)Landroid/graphics/ColorSpace;", "h", "(Landroid/graphics/ColorSpace;)Landroidx/compose/ui/graphics/colorspace/c;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.annotation.x0(26)
/* loaded from: classes.dex */
final class h4 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final h4 f17843a = new h4();

    private h4() {
    }

    @fg.l
    @androidx.annotation.u
    @kd.n
    @androidx.annotation.x0(26)
    public static final ColorSpace e(@fg.l androidx.compose.ui.graphics.colorspace.c cVar) {
        ColorSpace.Named named;
        ColorSpace colorSpace;
        ColorSpace.Rgb.TransferParameters transferParameters;
        ColorSpace.Rgb a5;
        ColorSpace.Named named2;
        ColorSpace colorSpace2;
        ColorSpace.Named named3;
        ColorSpace colorSpace3;
        ColorSpace.Named named4;
        ColorSpace colorSpace4;
        ColorSpace.Named named5;
        ColorSpace colorSpace5;
        ColorSpace.Named named6;
        ColorSpace colorSpace6;
        ColorSpace.Named named7;
        ColorSpace colorSpace7;
        ColorSpace.Named named8;
        ColorSpace colorSpace8;
        ColorSpace.Named named9;
        ColorSpace colorSpace9;
        ColorSpace.Named named10;
        ColorSpace colorSpace10;
        ColorSpace.Named named11;
        ColorSpace colorSpace11;
        ColorSpace.Named named12;
        ColorSpace colorSpace12;
        ColorSpace.Named named13;
        ColorSpace colorSpace13;
        ColorSpace.Named named14;
        ColorSpace colorSpace14;
        ColorSpace.Named named15;
        ColorSpace colorSpace15;
        ColorSpace.Named named16;
        ColorSpace colorSpace16;
        ColorSpace.Named named17;
        ColorSpace colorSpace17;
        androidx.compose.ui.graphics.colorspace.g gVar = androidx.compose.ui.graphics.colorspace.g.f17689a;
        if (kotlin.jvm.internal.l0.g(cVar, gVar.x())) {
            named17 = ColorSpace.Named.SRGB;
            colorSpace17 = ColorSpace.get(named17);
            return colorSpace17;
        }
        if (kotlin.jvm.internal.l0.g(cVar, gVar.e())) {
            named16 = ColorSpace.Named.ACES;
            colorSpace16 = ColorSpace.get(named16);
            return colorSpace16;
        }
        if (kotlin.jvm.internal.l0.g(cVar, gVar.f())) {
            named15 = ColorSpace.Named.ACESCG;
            colorSpace15 = ColorSpace.get(named15);
            return colorSpace15;
        }
        if (kotlin.jvm.internal.l0.g(cVar, gVar.g())) {
            named14 = ColorSpace.Named.ADOBE_RGB;
            colorSpace14 = ColorSpace.get(named14);
            return colorSpace14;
        }
        if (kotlin.jvm.internal.l0.g(cVar, gVar.h())) {
            named13 = ColorSpace.Named.BT2020;
            colorSpace13 = ColorSpace.get(named13);
            return colorSpace13;
        }
        if (kotlin.jvm.internal.l0.g(cVar, gVar.i())) {
            named12 = ColorSpace.Named.BT709;
            colorSpace12 = ColorSpace.get(named12);
            return colorSpace12;
        }
        if (kotlin.jvm.internal.l0.g(cVar, gVar.j())) {
            named11 = ColorSpace.Named.CIE_LAB;
            colorSpace11 = ColorSpace.get(named11);
            return colorSpace11;
        }
        if (kotlin.jvm.internal.l0.g(cVar, gVar.k())) {
            named10 = ColorSpace.Named.CIE_XYZ;
            colorSpace10 = ColorSpace.get(named10);
            return colorSpace10;
        }
        if (kotlin.jvm.internal.l0.g(cVar, gVar.n())) {
            named9 = ColorSpace.Named.DCI_P3;
            colorSpace9 = ColorSpace.get(named9);
            return colorSpace9;
        }
        if (kotlin.jvm.internal.l0.g(cVar, gVar.o())) {
            named8 = ColorSpace.Named.DISPLAY_P3;
            colorSpace8 = ColorSpace.get(named8);
            return colorSpace8;
        }
        if (kotlin.jvm.internal.l0.g(cVar, gVar.p())) {
            named7 = ColorSpace.Named.EXTENDED_SRGB;
            colorSpace7 = ColorSpace.get(named7);
            return colorSpace7;
        }
        if (kotlin.jvm.internal.l0.g(cVar, gVar.q())) {
            named6 = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
            colorSpace6 = ColorSpace.get(named6);
            return colorSpace6;
        }
        if (kotlin.jvm.internal.l0.g(cVar, gVar.r())) {
            named5 = ColorSpace.Named.LINEAR_SRGB;
            colorSpace5 = ColorSpace.get(named5);
            return colorSpace5;
        }
        if (kotlin.jvm.internal.l0.g(cVar, gVar.s())) {
            named4 = ColorSpace.Named.NTSC_1953;
            colorSpace4 = ColorSpace.get(named4);
            return colorSpace4;
        }
        if (kotlin.jvm.internal.l0.g(cVar, gVar.v())) {
            named3 = ColorSpace.Named.PRO_PHOTO_RGB;
            colorSpace3 = ColorSpace.get(named3);
            return colorSpace3;
        }
        if (kotlin.jvm.internal.l0.g(cVar, gVar.w())) {
            named2 = ColorSpace.Named.SMPTE_C;
            colorSpace2 = ColorSpace.get(named2);
            return colorSpace2;
        }
        if (!(cVar instanceof androidx.compose.ui.graphics.colorspace.a0)) {
            named = ColorSpace.Named.SRGB;
            colorSpace = ColorSpace.get(named);
            return colorSpace;
        }
        androidx.compose.ui.graphics.colorspace.a0 a0Var = (androidx.compose.ui.graphics.colorspace.a0) cVar;
        float[] g4 = a0Var.getWhitePoint().g();
        androidx.compose.ui.graphics.colorspace.d0 transferParameters2 = a0Var.getTransferParameters();
        if (transferParameters2 != null) {
            v3.a();
            transferParameters = r3.a(transferParameters2.j(), transferParameters2.k(), transferParameters2.l(), transferParameters2.m(), transferParameters2.n(), transferParameters2.o(), transferParameters2.p());
        } else {
            transferParameters = null;
        }
        if (transferParameters != null) {
            w3.a();
            a5 = t3.a(cVar.getName(), a0Var.getPrimaries(), g4, transferParameters);
        } else {
            w3.a();
            String name = cVar.getName();
            float[] primaries = a0Var.getPrimaries();
            final ld.l<Double, Double> Y = a0Var.Y();
            DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: androidx.compose.ui.graphics.d4
                @Override // java.util.function.DoubleUnaryOperator
                public final double applyAsDouble(double d5) {
                    double f4;
                    f4 = h4.f(ld.l.this, d5);
                    return f4;
                }
            };
            final ld.l<Double, Double> S = a0Var.S();
            a5 = u3.a(name, primaries, g4, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: androidx.compose.ui.graphics.e4
                @Override // java.util.function.DoubleUnaryOperator
                public final double applyAsDouble(double d5) {
                    double g5;
                    g5 = h4.g(ld.l.this, d5);
                    return g5;
                }
            }, cVar.f(0), cVar.e(0));
        }
        return s2.a(a5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double f(ld.l lVar, double d5) {
        return ((Number) lVar.invoke(Double.valueOf(d5))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double g(ld.l lVar, double d5) {
        return ((Number) lVar.invoke(Double.valueOf(d5))).doubleValue();
    }

    @fg.l
    @androidx.annotation.u
    @kd.n
    @androidx.annotation.x0(26)
    public static final androidx.compose.ui.graphics.colorspace.c h(@fg.l final ColorSpace colorSpace) {
        int id2;
        ColorSpace.Named named;
        int ordinal;
        ColorSpace.Named named2;
        int ordinal2;
        ColorSpace.Named named3;
        int ordinal3;
        ColorSpace.Named named4;
        int ordinal4;
        ColorSpace.Named named5;
        int ordinal5;
        ColorSpace.Named named6;
        int ordinal6;
        ColorSpace.Named named7;
        int ordinal7;
        ColorSpace.Named named8;
        int ordinal8;
        ColorSpace.Named named9;
        int ordinal9;
        ColorSpace.Named named10;
        int ordinal10;
        ColorSpace.Named named11;
        int ordinal11;
        ColorSpace.Named named12;
        int ordinal12;
        ColorSpace.Named named13;
        int ordinal13;
        ColorSpace.Named named14;
        int ordinal14;
        ColorSpace.Named named15;
        int ordinal15;
        ColorSpace.Named named16;
        int ordinal16;
        ColorSpace.Rgb.TransferParameters transferParameters;
        float[] whitePoint;
        androidx.compose.ui.graphics.colorspace.e0 e0Var;
        float[] whitePoint2;
        float[] whitePoint3;
        androidx.compose.ui.graphics.colorspace.d0 d0Var;
        String name;
        float[] primaries;
        float[] transform;
        float minValue;
        float maxValue;
        int id3;
        double d5;
        double d6;
        double d7;
        double d10;
        double d11;
        double d12;
        double d13;
        float[] whitePoint4;
        float[] whitePoint5;
        float[] whitePoint6;
        id2 = colorSpace.getId();
        named = ColorSpace.Named.SRGB;
        ordinal = named.ordinal();
        if (id2 == ordinal) {
            return androidx.compose.ui.graphics.colorspace.g.f17689a.x();
        }
        named2 = ColorSpace.Named.ACES;
        ordinal2 = named2.ordinal();
        if (id2 == ordinal2) {
            return androidx.compose.ui.graphics.colorspace.g.f17689a.e();
        }
        named3 = ColorSpace.Named.ACESCG;
        ordinal3 = named3.ordinal();
        if (id2 == ordinal3) {
            return androidx.compose.ui.graphics.colorspace.g.f17689a.f();
        }
        named4 = ColorSpace.Named.ADOBE_RGB;
        ordinal4 = named4.ordinal();
        if (id2 == ordinal4) {
            return androidx.compose.ui.graphics.colorspace.g.f17689a.g();
        }
        named5 = ColorSpace.Named.BT2020;
        ordinal5 = named5.ordinal();
        if (id2 == ordinal5) {
            return androidx.compose.ui.graphics.colorspace.g.f17689a.h();
        }
        named6 = ColorSpace.Named.BT709;
        ordinal6 = named6.ordinal();
        if (id2 == ordinal6) {
            return androidx.compose.ui.graphics.colorspace.g.f17689a.i();
        }
        named7 = ColorSpace.Named.CIE_LAB;
        ordinal7 = named7.ordinal();
        if (id2 == ordinal7) {
            return androidx.compose.ui.graphics.colorspace.g.f17689a.j();
        }
        named8 = ColorSpace.Named.CIE_XYZ;
        ordinal8 = named8.ordinal();
        if (id2 == ordinal8) {
            return androidx.compose.ui.graphics.colorspace.g.f17689a.k();
        }
        named9 = ColorSpace.Named.DCI_P3;
        ordinal9 = named9.ordinal();
        if (id2 == ordinal9) {
            return androidx.compose.ui.graphics.colorspace.g.f17689a.n();
        }
        named10 = ColorSpace.Named.DISPLAY_P3;
        ordinal10 = named10.ordinal();
        if (id2 == ordinal10) {
            return androidx.compose.ui.graphics.colorspace.g.f17689a.o();
        }
        named11 = ColorSpace.Named.EXTENDED_SRGB;
        ordinal11 = named11.ordinal();
        if (id2 == ordinal11) {
            return androidx.compose.ui.graphics.colorspace.g.f17689a.p();
        }
        named12 = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
        ordinal12 = named12.ordinal();
        if (id2 == ordinal12) {
            return androidx.compose.ui.graphics.colorspace.g.f17689a.q();
        }
        named13 = ColorSpace.Named.LINEAR_SRGB;
        ordinal13 = named13.ordinal();
        if (id2 == ordinal13) {
            return androidx.compose.ui.graphics.colorspace.g.f17689a.r();
        }
        named14 = ColorSpace.Named.NTSC_1953;
        ordinal14 = named14.ordinal();
        if (id2 == ordinal14) {
            return androidx.compose.ui.graphics.colorspace.g.f17689a.s();
        }
        named15 = ColorSpace.Named.PRO_PHOTO_RGB;
        ordinal15 = named15.ordinal();
        if (id2 == ordinal15) {
            return androidx.compose.ui.graphics.colorspace.g.f17689a.v();
        }
        named16 = ColorSpace.Named.SMPTE_C;
        ordinal16 = named16.ordinal();
        if (id2 == ordinal16) {
            return androidx.compose.ui.graphics.colorspace.g.f17689a.w();
        }
        if (!a3.a(colorSpace)) {
            return androidx.compose.ui.graphics.colorspace.g.f17689a.x();
        }
        transferParameters = l2.a(colorSpace).getTransferParameters();
        whitePoint = l2.a(colorSpace).getWhitePoint();
        if (whitePoint.length == 3) {
            whitePoint4 = l2.a(colorSpace).getWhitePoint();
            float f4 = whitePoint4[0];
            whitePoint5 = l2.a(colorSpace).getWhitePoint();
            float f5 = whitePoint5[1];
            whitePoint6 = l2.a(colorSpace).getWhitePoint();
            e0Var = new androidx.compose.ui.graphics.colorspace.e0(f4, f5, whitePoint6[2]);
        } else {
            whitePoint2 = l2.a(colorSpace).getWhitePoint();
            float f6 = whitePoint2[0];
            whitePoint3 = l2.a(colorSpace).getWhitePoint();
            e0Var = new androidx.compose.ui.graphics.colorspace.e0(f6, whitePoint3[1]);
        }
        androidx.compose.ui.graphics.colorspace.e0 e0Var2 = e0Var;
        if (transferParameters != null) {
            d5 = transferParameters.g;
            d6 = transferParameters.a;
            d7 = transferParameters.b;
            d10 = transferParameters.c;
            d11 = transferParameters.d;
            d12 = transferParameters.e;
            d13 = transferParameters.f;
            d0Var = new androidx.compose.ui.graphics.colorspace.d0(d5, d6, d7, d10, d11, d12, d13);
        } else {
            d0Var = null;
        }
        name = l2.a(colorSpace).getName();
        primaries = l2.a(colorSpace).getPrimaries();
        transform = l2.a(colorSpace).getTransform();
        androidx.compose.ui.graphics.colorspace.i iVar = new androidx.compose.ui.graphics.colorspace.i() { // from class: androidx.compose.ui.graphics.f4
            @Override // androidx.compose.ui.graphics.colorspace.i
            public final double a(double d14) {
                double i4;
                i4 = h4.i(colorSpace, d14);
                return i4;
            }
        };
        androidx.compose.ui.graphics.colorspace.i iVar2 = new androidx.compose.ui.graphics.colorspace.i() { // from class: androidx.compose.ui.graphics.g4
            @Override // androidx.compose.ui.graphics.colorspace.i
            public final double a(double d14) {
                double j4;
                j4 = h4.j(colorSpace, d14);
                return j4;
            }
        };
        minValue = colorSpace.getMinValue(0);
        maxValue = colorSpace.getMaxValue(0);
        id3 = l2.a(colorSpace).getId();
        return new androidx.compose.ui.graphics.colorspace.a0(name, primaries, e0Var2, transform, iVar, iVar2, minValue, maxValue, d0Var, id3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double i(ColorSpace colorSpace, double d5) {
        DoubleUnaryOperator oetf;
        oetf = l2.a(colorSpace).getOetf();
        return oetf.applyAsDouble(d5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double j(ColorSpace colorSpace, double d5) {
        DoubleUnaryOperator eotf;
        eotf = l2.a(colorSpace).getEotf();
        return eotf.applyAsDouble(d5);
    }
}
