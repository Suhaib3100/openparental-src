package com.google.android.libraries.places.api.model;

import androidx.room.l0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
abstract class zzl extends OpeningHours {
    private final List zza;
    private final List zzb;

    zzl(List list, List list2) {
        if (list == null) {
            throw new NullPointerException(ProtectedSandApp.s("\ue60b"));
        }
        this.zza = list;
        if (list2 == null) {
            throw new NullPointerException(ProtectedSandApp.s("\ue60a"));
        }
        this.zzb = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OpeningHours) {
            OpeningHours openingHours = (OpeningHours) obj;
            if (this.zza.equals(openingHours.getPeriods()) && this.zzb.equals(openingHours.getWeekdayText())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours
    public final List<Period> getPeriods() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours
    public final List<String> getWeekdayText() {
        return this.zzb;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
    }

    public final String toString() {
        String obj = this.zza.toString();
        String obj2 = this.zzb.toString();
        StringBuilder sb = new StringBuilder(obj2.length() + obj.length() + 36);
        l0.a(sb, ProtectedSandApp.s("\ue60c"), obj, ProtectedSandApp.s("\ue60d"), obj2);
        sb.append(ProtectedSandApp.s("\ue60e"));
        return sb.toString();
    }
}
