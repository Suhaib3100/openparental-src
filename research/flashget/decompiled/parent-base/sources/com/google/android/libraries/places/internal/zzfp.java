package com.google.android.libraries.places.internal;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.l;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzfp {
    @l
    public static int zza(@l int i4, @l int i5, @l int i6) {
        return zzc(i4, i5, i6) ? i6 : i5;
    }

    public static void zzb(ImageView imageView, @l int i4) {
        Drawable drawable = imageView.getDrawable();
        int rgb = Color.rgb(Color.red(i4), Color.green(i4), Color.blue(i4));
        Drawable mutate = drawable.mutate();
        mutate.setColorFilter(rgb, PorterDuff.Mode.SRC_ATOP);
        mutate.setAlpha(Color.alpha(i4));
    }

    public static boolean zzc(@l int i4, @l int i5, @l int i6) {
        double zzf = zzf(i4);
        double zze = zze(zzf(i5), zzf);
        return zze <= 3.0d && zze <= zze(zzf(i6), zzf);
    }

    private static double zzd(double d5) {
        return d5 <= 0.03928d ? d5 / 12.92d : Math.pow((d5 + 0.055d) / 1.055d, 2.4d);
    }

    private static double zze(double d5, double d6) {
        return Math.round(((Math.max(d5, d6) + 0.05d) / (Math.min(d5, d6) + 0.05d)) * 100.0d) / 100.0d;
    }

    private static double zzf(@l int i4) {
        return (zzd(Color.blue(i4) / 255.0d) * 0.0722d) + (zzd(Color.green(i4) / 255.0d) * 0.7152d) + (zzd(Color.red(i4) / 255.0d) * 0.2126d);
    }
}
