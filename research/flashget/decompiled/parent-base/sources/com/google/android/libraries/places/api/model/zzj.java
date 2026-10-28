package com.google.android.libraries.places.api.model;

import androidx.annotation.g0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
abstract class zzj extends LocalTime {
    private final int zza;
    private final int zzb;

    zzj(int i4, int i5) {
        this.zza = i4;
        this.zzb = i5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LocalTime) {
            LocalTime localTime = (LocalTime) obj;
            if (this.zza == localTime.getHours() && this.zzb == localTime.getMinutes()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.LocalTime
    @g0(from = 0, to = 23)
    public final int getHours() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.LocalTime
    @g0(from = 0, to = 59)
    public final int getMinutes() {
        return this.zzb;
    }

    public final int hashCode() {
        return ((this.zza ^ 1000003) * 1000003) ^ this.zzb;
    }

    public final String toString() {
        int i4 = this.zza;
        int i5 = this.zzb;
        StringBuilder sb = new StringBuilder(49);
        sb.append(ProtectedSandApp.s("\ue607"));
        sb.append(i4);
        sb.append(ProtectedSandApp.s("\ue608"));
        sb.append(i5);
        sb.append(ProtectedSandApp.s("\ue609"));
        return sb.toString();
    }
}
