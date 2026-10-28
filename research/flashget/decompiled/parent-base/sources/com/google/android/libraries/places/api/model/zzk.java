package com.google.android.libraries.places.api.model;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.libraries.places.api.model.OpeningHours;
import java.util.List;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzk extends OpeningHours.Builder {
    private List zza;
    private List zzb;

    zzk() {
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    public final List<Period> getPeriods() {
        List<Period> list = this.zza;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException(ProtectedSandApp.s("\ue65b"));
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    public final List<String> getWeekdayText() {
        List<String> list = this.zzb;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException(ProtectedSandApp.s("\ue65c"));
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    public final OpeningHours.Builder setPeriods(List<Period> list) {
        if (list == null) {
            throw new NullPointerException(ProtectedSandApp.s("\ue65d"));
        }
        this.zza = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    public final OpeningHours.Builder setWeekdayText(List<String> list) {
        if (list == null) {
            throw new NullPointerException(ProtectedSandApp.s("\ue65e"));
        }
        this.zzb = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    final OpeningHours zza() {
        List list;
        List list2 = this.zza;
        if (list2 != null && (list = this.zzb) != null) {
            return new zzal(list2, list);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(ProtectedSandApp.s("\ue65f"));
        }
        if (this.zzb == null) {
            sb.append(ProtectedSandApp.s("\ue660"));
        }
        throw new IllegalStateException(ProtectedSandApp.s("\ue661").concat(sb.toString()));
    }
}
