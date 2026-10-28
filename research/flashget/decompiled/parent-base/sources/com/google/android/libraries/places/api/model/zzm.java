package com.google.android.libraries.places.api.model;

import androidx.annotation.q0;
import com.google.android.libraries.places.api.model.Period;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzm extends Period.Builder {
    private TimeOfWeek zza;
    private TimeOfWeek zzb;

    zzm() {
    }

    @Override // com.google.android.libraries.places.api.model.Period.Builder
    public final Period build() {
        return new zzan(this.zza, this.zzb);
    }

    @Override // com.google.android.libraries.places.api.model.Period.Builder
    @q0
    public final TimeOfWeek getClose() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.Period.Builder
    @q0
    public final TimeOfWeek getOpen() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.Period.Builder
    public final Period.Builder setClose(@q0 TimeOfWeek timeOfWeek) {
        this.zzb = timeOfWeek;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Period.Builder
    public final Period.Builder setOpen(@q0 TimeOfWeek timeOfWeek) {
        this.zza = timeOfWeek;
        return this;
    }
}
