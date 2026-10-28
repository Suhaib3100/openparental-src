package com.google.android.libraries.places.api.model;

import androidx.room.l0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
abstract class zzx extends TimeOfWeek {
    private final DayOfWeek zza;
    private final LocalTime zzb;

    zzx(DayOfWeek dayOfWeek, LocalTime localTime) {
        if (dayOfWeek == null) {
            throw new NullPointerException(ProtectedSandApp.s("\ue63b"));
        }
        this.zza = dayOfWeek;
        if (localTime == null) {
            throw new NullPointerException(ProtectedSandApp.s("\ue63a"));
        }
        this.zzb = localTime;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TimeOfWeek) {
            TimeOfWeek timeOfWeek = (TimeOfWeek) obj;
            if (this.zza.equals(timeOfWeek.getDay()) && this.zzb.equals(timeOfWeek.getTime())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.TimeOfWeek
    public final DayOfWeek getDay() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.TimeOfWeek
    public final LocalTime getTime() {
        return this.zzb;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
    }

    public final String toString() {
        String obj = this.zza.toString();
        String obj2 = this.zzb.toString();
        StringBuilder sb = new StringBuilder(obj2.length() + obj.length() + 23);
        l0.a(sb, ProtectedSandApp.s("\ue63c"), obj, ProtectedSandApp.s("\ue63d"), obj2);
        sb.append(ProtectedSandApp.s("\ue63e"));
        return sb.toString();
    }
}
