package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.g0;
import b9.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.libraries.places.internal.zzha;
import com.google.android.libraries.places.internal.zzie;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
@c
/* loaded from: classes5.dex */
public abstract class LocalTime implements Parcelable, Comparable<LocalTime> {
    @RecentlyNonNull
    public static LocalTime newInstance(@g0(from = 0, to = 23) int i4, @g0(from = 0, to = 59) int i5) {
        try {
            zzi zziVar = new zzi();
            zziVar.zza(i4);
            zziVar.zzb(i5);
            LocalTime zzc = zziVar.zzc();
            int hours = zzc.getHours();
            zzha.zzj(zzie.zzc(0, 23).zze(Integer.valueOf(hours)), ProtectedSandApp.s("\ue539"), hours);
            int minutes = zzc.getMinutes();
            zzha.zzj(zzie.zzc(0, 59).zze(Integer.valueOf(minutes)), ProtectedSandApp.s("\ue53a"), minutes);
            return zzc;
        } catch (IllegalStateException e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(@RecentlyNonNull LocalTime localTime) {
        int hours;
        int hours2;
        zzha.zzc(localTime, ProtectedSandApp.s("\ue53b"));
        if (this == localTime) {
            return 0;
        }
        if (getHours() == localTime.getHours()) {
            hours = getMinutes();
            hours2 = localTime.getMinutes();
        } else {
            hours = getHours();
            hours2 = localTime.getHours();
        }
        return hours - hours2;
    }

    @g0(from = 0, to = 23)
    public abstract int getHours();

    @g0(from = 0, to = 59)
    public abstract int getMinutes();
}
