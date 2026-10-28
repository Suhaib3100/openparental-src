package com.google.android.libraries.places.api.model;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzi extends zzbd {
    private int zza;
    private int zzb;
    private byte zzc;

    zzi() {
    }

    final zzbd zza(int i4) {
        this.zza = i4;
        this.zzc = (byte) (this.zzc | 1);
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzbd
    final zzbd zzb(int i4) {
        this.zzb = i4;
        this.zzc = (byte) (this.zzc | 2);
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzbd
    final LocalTime zzc() {
        if (this.zzc == 3) {
            return new zzaj(this.zza, this.zzb);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.zzc & 1) == 0) {
            sb.append(ProtectedSandApp.s("\ue658"));
        }
        if ((this.zzc & 2) == 0) {
            sb.append(ProtectedSandApp.s("\ue659"));
        }
        throw new IllegalStateException(ProtectedSandApp.s("\ue65a").concat(sb.toString()));
    }
}
