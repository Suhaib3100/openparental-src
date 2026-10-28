package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.x;
import b9.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.libraries.places.internal.zzhf;
import com.google.android.libraries.places.internal.zzie;
import com.google.firebase.remoteconfig.p;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
@c
/* loaded from: classes5.dex */
public abstract class PlaceLikelihood implements Parcelable {
    public static final double LIKELIHOOD_MAX_VALUE = 1.0d;
    public static final double LIKELIHOOD_MIN_VALUE = 0.0d;

    @RecentlyNonNull
    public static PlaceLikelihood newInstance(@RecentlyNonNull Place place, @x(from = 0.0d, to = 1.0d) double d5) {
        Double valueOf = Double.valueOf(p.f60679p);
        Double valueOf2 = Double.valueOf(1.0d);
        zzie zzc = zzie.zzc(valueOf, valueOf2);
        Double valueOf3 = Double.valueOf(d5);
        if (zzc.zze(valueOf3)) {
            return new zzat(place, d5);
        }
        throw new IllegalArgumentException(zzhf.zza(ProtectedSandApp.s("\ue5e6"), valueOf, valueOf2, valueOf3));
    }

    @x(from = p.f60679p, to = 1.0d)
    public abstract double getLikelihood();

    @RecentlyNonNull
    public abstract Place getPlace();
}
