package androidx.compose.material3;

import android.R;
import android.content.Context;
import android.os.Build;
import kotlin.Metadata;

/* compiled from: DynamicTonalPalette.android.kt */
@kd.i(name = "DynamicTonalPaletteKt")
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\u0007\u001a \u0010\f\u001a\u00020\t*\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0018\u0010\u0007\u001a\u0017\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0019\u0010\u0017\u001a\u0017\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u001a\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroid/content/Context;", "context", "Landroidx/compose/material3/fb;", "h", "(Landroid/content/Context;)Landroidx/compose/material3/fb;", "Landroidx/compose/material3/a3;", "e", "(Landroid/content/Context;)Landroidx/compose/material3/a3;", "b", "Landroidx/compose/ui/graphics/d2;", "", "newLuminance", "j", "(JF)J", "ft", "i", "(F)F", "rgbComponent", "", "a", "(F)I", "tonalPalette", "f", "(Landroidx/compose/material3/fb;)Landroidx/compose/material3/a3;", "g", "c", "d", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class z4 {
    private static final int a(float f4) {
        double d5 = f4 / 100;
        return e1.a.e(kotlin.math.b.K0((d5 <= 0.0031308d ? d5 * 12.92d : (Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d), 0, 255);
    }

    @fg.l
    @androidx.annotation.x0(31)
    public static final a3 b(@fg.l Context context) {
        return Build.VERSION.SDK_INT >= 34 ? d(context) : c(h(context));
    }

    @fg.l
    @androidx.annotation.x0(31)
    public static final a3 c(@fg.l fb fbVar) {
        long primary80 = fbVar.getPrimary80();
        long primary20 = fbVar.getPrimary20();
        long primary30 = fbVar.getPrimary30();
        long primary90 = fbVar.getPrimary90();
        long primary40 = fbVar.getPrimary40();
        long secondary80 = fbVar.getSecondary80();
        long secondary20 = fbVar.getSecondary20();
        long secondary30 = fbVar.getSecondary30();
        long secondary90 = fbVar.getSecondary90();
        long tertiary80 = fbVar.getTertiary80();
        long tertiary20 = fbVar.getTertiary20();
        long tertiary30 = fbVar.getTertiary30();
        long tertiary90 = fbVar.getTertiary90();
        long neutralVariant6 = fbVar.getNeutralVariant6();
        long neutralVariant90 = fbVar.getNeutralVariant90();
        long neutralVariant62 = fbVar.getNeutralVariant6();
        long neutralVariant902 = fbVar.getNeutralVariant90();
        long neutralVariant30 = fbVar.getNeutralVariant30();
        long neutralVariant80 = fbVar.getNeutralVariant80();
        long neutralVariant903 = fbVar.getNeutralVariant90();
        long neutralVariant20 = fbVar.getNeutralVariant20();
        long neutralVariant60 = fbVar.getNeutralVariant60();
        long neutralVariant302 = fbVar.getNeutralVariant30();
        long neutralVariant0 = fbVar.getNeutralVariant0();
        long neutralVariant24 = fbVar.getNeutralVariant24();
        long neutralVariant63 = fbVar.getNeutralVariant6();
        return b3.e(primary80, primary20, primary30, primary90, primary40, secondary80, secondary20, secondary30, secondary90, tertiary80, tertiary20, tertiary30, tertiary90, neutralVariant6, neutralVariant90, neutralVariant62, neutralVariant902, neutralVariant30, neutralVariant80, fbVar.getPrimary80(), neutralVariant903, neutralVariant20, 0L, 0L, 0L, 0L, neutralVariant60, neutralVariant302, neutralVariant0, neutralVariant24, fbVar.getNeutralVariant12(), fbVar.getNeutralVariant17(), fbVar.getNeutralVariant22(), fbVar.getNeutralVariant10(), fbVar.getNeutralVariant4(), neutralVariant63, 62914560, 0, null);
    }

    @fg.l
    @androidx.annotation.x0(34)
    public static final a3 d(@fg.l Context context) {
        z2 z2Var = z2.f15841a;
        long a5 = z2Var.a(context, R.color.system_primary_dark);
        long a6 = z2Var.a(context, R.color.system_on_primary_dark);
        long a7 = z2Var.a(context, R.color.system_primary_container_dark);
        long a8 = z2Var.a(context, R.color.system_on_primary_container_dark);
        long a10 = z2Var.a(context, R.color.system_primary_light);
        long a11 = z2Var.a(context, R.color.system_secondary_dark);
        long a12 = z2Var.a(context, R.color.system_on_secondary_dark);
        long a13 = z2Var.a(context, R.color.system_secondary_container_dark);
        long a14 = z2Var.a(context, R.color.system_on_secondary_container_dark);
        long a15 = z2Var.a(context, R.color.system_tertiary_dark);
        long a16 = z2Var.a(context, R.color.system_on_tertiary_dark);
        long a17 = z2Var.a(context, R.color.system_tertiary_container_dark);
        long a18 = z2Var.a(context, R.color.system_on_tertiary_container_dark);
        long a19 = z2Var.a(context, R.color.system_background_dark);
        long a20 = z2Var.a(context, R.color.system_on_background_dark);
        long a21 = z2Var.a(context, R.color.system_surface_dark);
        long a22 = z2Var.a(context, R.color.system_on_surface_dark);
        long a23 = z2Var.a(context, R.color.system_surface_variant_dark);
        long a24 = z2Var.a(context, R.color.system_on_surface_variant_dark);
        long a25 = z2Var.a(context, R.color.system_surface_light);
        long a26 = z2Var.a(context, R.color.system_on_surface_light);
        long a27 = z2Var.a(context, R.color.system_outline_dark);
        long a28 = z2Var.a(context, R.color.system_outline_variant_dark);
        long a29 = z2Var.a(context, R.color.system_surface_bright_dark);
        long a30 = z2Var.a(context, R.color.system_surface_dim_dark);
        return b3.e(a5, a6, a7, a8, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, z2Var.a(context, R.color.system_primary_dark), a25, a26, 0L, 0L, 0L, 0L, a27, a28, 0L, a29, z2Var.a(context, R.color.system_surface_container_dark), z2Var.a(context, R.color.system_surface_container_high_dark), z2Var.a(context, R.color.system_surface_container_highest_dark), z2Var.a(context, R.color.system_surface_container_low_dark), z2Var.a(context, R.color.system_surface_container_lowest_dark), a30, 331350016, 0, null);
    }

    @fg.l
    @androidx.annotation.x0(31)
    public static final a3 e(@fg.l Context context) {
        return Build.VERSION.SDK_INT >= 34 ? g(context) : f(h(context));
    }

    @fg.l
    @androidx.annotation.x0(31)
    public static final a3 f(@fg.l fb fbVar) {
        long primary40 = fbVar.getPrimary40();
        long primary100 = fbVar.getPrimary100();
        long primary90 = fbVar.getPrimary90();
        long primary10 = fbVar.getPrimary10();
        long primary80 = fbVar.getPrimary80();
        long secondary40 = fbVar.getSecondary40();
        long secondary100 = fbVar.getSecondary100();
        long secondary90 = fbVar.getSecondary90();
        long secondary10 = fbVar.getSecondary10();
        long tertiary40 = fbVar.getTertiary40();
        long tertiary100 = fbVar.getTertiary100();
        long tertiary90 = fbVar.getTertiary90();
        long tertiary10 = fbVar.getTertiary10();
        long neutralVariant98 = fbVar.getNeutralVariant98();
        long neutralVariant10 = fbVar.getNeutralVariant10();
        long neutralVariant982 = fbVar.getNeutralVariant98();
        long neutralVariant102 = fbVar.getNeutralVariant10();
        long neutralVariant90 = fbVar.getNeutralVariant90();
        long neutralVariant30 = fbVar.getNeutralVariant30();
        long neutralVariant20 = fbVar.getNeutralVariant20();
        long neutralVariant95 = fbVar.getNeutralVariant95();
        long neutralVariant50 = fbVar.getNeutralVariant50();
        long neutralVariant80 = fbVar.getNeutralVariant80();
        long neutralVariant0 = fbVar.getNeutralVariant0();
        long neutralVariant983 = fbVar.getNeutralVariant98();
        long neutralVariant87 = fbVar.getNeutralVariant87();
        return b3.m(primary40, primary100, primary90, primary10, primary80, secondary40, secondary100, secondary90, secondary10, tertiary40, tertiary100, tertiary90, tertiary10, neutralVariant98, neutralVariant10, neutralVariant982, neutralVariant102, neutralVariant90, neutralVariant30, fbVar.getPrimary40(), neutralVariant20, neutralVariant95, 0L, 0L, 0L, 0L, neutralVariant50, neutralVariant80, neutralVariant0, neutralVariant983, fbVar.getNeutralVariant94(), fbVar.getNeutralVariant92(), fbVar.getNeutralVariant90(), fbVar.getNeutralVariant96(), fbVar.getNeutralVariant100(), neutralVariant87, 62914560, 0, null);
    }

    @fg.l
    @androidx.annotation.x0(34)
    public static final a3 g(@fg.l Context context) {
        z2 z2Var = z2.f15841a;
        long a5 = z2Var.a(context, R.color.system_primary_light);
        long a6 = z2Var.a(context, R.color.system_on_primary_light);
        long a7 = z2Var.a(context, R.color.system_primary_container_light);
        long a8 = z2Var.a(context, R.color.system_on_primary_container_light);
        long a10 = z2Var.a(context, R.color.system_primary_dark);
        long a11 = z2Var.a(context, R.color.system_secondary_light);
        long a12 = z2Var.a(context, R.color.system_on_secondary_light);
        long a13 = z2Var.a(context, R.color.system_secondary_container_light);
        long a14 = z2Var.a(context, R.color.system_on_secondary_container_light);
        long a15 = z2Var.a(context, R.color.system_tertiary_light);
        long a16 = z2Var.a(context, R.color.system_on_tertiary_light);
        long a17 = z2Var.a(context, R.color.system_tertiary_container_light);
        long a18 = z2Var.a(context, R.color.system_on_tertiary_container_light);
        long a19 = z2Var.a(context, R.color.system_background_light);
        long a20 = z2Var.a(context, R.color.system_on_background_light);
        long a21 = z2Var.a(context, R.color.system_surface_light);
        long a22 = z2Var.a(context, R.color.system_on_surface_light);
        long a23 = z2Var.a(context, R.color.system_surface_variant_light);
        long a24 = z2Var.a(context, R.color.system_on_surface_variant_light);
        long a25 = z2Var.a(context, R.color.system_surface_dark);
        long a26 = z2Var.a(context, R.color.system_on_surface_dark);
        long a27 = z2Var.a(context, R.color.system_outline_light);
        long a28 = z2Var.a(context, R.color.system_outline_variant_light);
        long a29 = z2Var.a(context, R.color.system_surface_bright_light);
        long a30 = z2Var.a(context, R.color.system_surface_dim_light);
        return b3.m(a5, a6, a7, a8, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, z2Var.a(context, R.color.system_primary_light), a25, a26, 0L, 0L, 0L, 0L, a27, a28, 0L, a29, z2Var.a(context, R.color.system_surface_container_light), z2Var.a(context, R.color.system_surface_container_high_light), z2Var.a(context, R.color.system_surface_container_highest_light), z2Var.a(context, R.color.system_surface_container_low_light), z2Var.a(context, R.color.system_surface_container_lowest_light), a30, 331350016, 0, null);
    }

    @fg.l
    @androidx.annotation.x0(31)
    public static final fb h(@fg.l Context context) {
        z2 z2Var = z2.f15841a;
        return new fb(z2Var.a(context, R.color.system_neutral1_0), z2Var.a(context, R.color.system_neutral1_10), j(z2Var.a(context, R.color.system_neutral1_600), 98.0f), j(z2Var.a(context, R.color.system_neutral1_600), 96.0f), z2Var.a(context, R.color.system_neutral1_50), j(z2Var.a(context, R.color.system_neutral1_600), 94.0f), j(z2Var.a(context, R.color.system_neutral1_600), 92.0f), z2Var.a(context, R.color.system_neutral1_100), j(z2Var.a(context, R.color.system_neutral1_600), 87.0f), z2Var.a(context, R.color.system_neutral1_200), z2Var.a(context, R.color.system_neutral1_300), z2Var.a(context, R.color.system_neutral1_400), z2Var.a(context, R.color.system_neutral1_500), z2Var.a(context, R.color.system_neutral1_600), z2Var.a(context, R.color.system_neutral1_700), j(z2Var.a(context, R.color.system_neutral1_600), 24.0f), j(z2Var.a(context, R.color.system_neutral1_600), 22.0f), z2Var.a(context, R.color.system_neutral1_800), j(z2Var.a(context, R.color.system_neutral1_600), 17.0f), j(z2Var.a(context, R.color.system_neutral1_600), 12.0f), z2Var.a(context, R.color.system_neutral1_900), j(z2Var.a(context, R.color.system_neutral1_600), 6.0f), j(z2Var.a(context, R.color.system_neutral1_600), 4.0f), z2Var.a(context, R.color.system_neutral1_1000), z2Var.a(context, R.color.system_neutral2_0), z2Var.a(context, R.color.system_neutral2_10), j(z2Var.a(context, R.color.system_neutral2_600), 98.0f), j(z2Var.a(context, R.color.system_neutral2_600), 96.0f), z2Var.a(context, R.color.system_neutral2_50), j(z2Var.a(context, R.color.system_neutral2_600), 94.0f), j(z2Var.a(context, R.color.system_neutral2_600), 92.0f), z2Var.a(context, R.color.system_neutral2_100), j(z2Var.a(context, R.color.system_neutral2_600), 87.0f), z2Var.a(context, R.color.system_neutral2_200), z2Var.a(context, R.color.system_neutral2_300), z2Var.a(context, R.color.system_neutral2_400), z2Var.a(context, R.color.system_neutral2_500), z2Var.a(context, R.color.system_neutral2_600), z2Var.a(context, R.color.system_neutral2_700), j(z2Var.a(context, R.color.system_neutral2_600), 24.0f), j(z2Var.a(context, R.color.system_neutral2_600), 22.0f), z2Var.a(context, R.color.system_neutral2_800), j(z2Var.a(context, R.color.system_neutral2_600), 17.0f), j(z2Var.a(context, R.color.system_neutral2_600), 12.0f), z2Var.a(context, R.color.system_neutral2_900), j(z2Var.a(context, R.color.system_neutral2_600), 6.0f), j(z2Var.a(context, R.color.system_neutral2_600), 4.0f), z2Var.a(context, R.color.system_neutral2_1000), z2Var.a(context, R.color.system_accent1_0), z2Var.a(context, R.color.system_accent1_10), z2Var.a(context, R.color.system_accent1_50), z2Var.a(context, R.color.system_accent1_100), z2Var.a(context, R.color.system_accent1_200), z2Var.a(context, R.color.system_accent1_300), z2Var.a(context, R.color.system_accent1_400), z2Var.a(context, R.color.system_accent1_500), z2Var.a(context, R.color.system_accent1_600), z2Var.a(context, R.color.system_accent1_700), z2Var.a(context, R.color.system_accent1_800), z2Var.a(context, R.color.system_accent1_900), z2Var.a(context, R.color.system_accent1_1000), z2Var.a(context, R.color.system_accent2_0), z2Var.a(context, R.color.system_accent2_10), z2Var.a(context, R.color.system_accent2_50), z2Var.a(context, R.color.system_accent2_100), z2Var.a(context, R.color.system_accent2_200), z2Var.a(context, R.color.system_accent2_300), z2Var.a(context, R.color.system_accent2_400), z2Var.a(context, R.color.system_accent2_500), z2Var.a(context, R.color.system_accent2_600), z2Var.a(context, R.color.system_accent2_700), z2Var.a(context, R.color.system_accent2_800), z2Var.a(context, R.color.system_accent2_900), z2Var.a(context, R.color.system_accent2_1000), z2Var.a(context, R.color.system_accent3_0), z2Var.a(context, R.color.system_accent3_10), z2Var.a(context, R.color.system_accent3_50), z2Var.a(context, R.color.system_accent3_100), z2Var.a(context, R.color.system_accent3_200), z2Var.a(context, R.color.system_accent3_300), z2Var.a(context, R.color.system_accent3_400), z2Var.a(context, R.color.system_accent3_500), z2Var.a(context, R.color.system_accent3_600), z2Var.a(context, R.color.system_accent3_700), z2Var.a(context, R.color.system_accent3_800), z2Var.a(context, R.color.system_accent3_900), z2Var.a(context, R.color.system_accent3_1000), null);
    }

    private static final float i(float f4) {
        float f5 = f4 * f4 * f4;
        return f5 > 0.008856452f ? f5 : ((116 * f4) - 16) / 903.2963f;
    }

    public static final long j(long j4, @androidx.annotation.x(from = 0.0d, to = 100.0d) float f4) {
        double d5 = f4;
        if ((d5 < 1.0E-4d) || (d5 > 99.9999d)) {
            int a5 = a(100 * i((f4 + 16) / 116));
            return androidx.compose.ui.graphics.f2.f(a5, a5, a5, 0, 8, null);
        }
        androidx.compose.ui.graphics.colorspace.g gVar = androidx.compose.ui.graphics.colorspace.g.f17689a;
        long u4 = androidx.compose.ui.graphics.d2.u(j4, gVar.j());
        return androidx.compose.ui.graphics.d2.u(androidx.compose.ui.graphics.f2.e(f4, androidx.compose.ui.graphics.d2.G(u4), androidx.compose.ui.graphics.d2.C(u4), 0.0f, gVar.j(), 8, null), gVar.x());
    }
}
