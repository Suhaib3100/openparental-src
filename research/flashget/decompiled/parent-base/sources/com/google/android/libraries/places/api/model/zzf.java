package com.google.android.libraries.places.api.model;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzf extends zzba {
    private int zza;
    private int zzb;
    private byte zzc;

    zzf() {
    }

    @Override // com.google.android.libraries.places.api.model.zzba
    public final zzba zza(int i4) {
        this.zzb = i4;
        this.zzc = (byte) (this.zzc | 2);
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzba
    public final zzba zzb(int i4) {
        this.zza = i4;
        this.zzc = (byte) (this.zzc | 1);
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzba
    public final zzbb zzc() {
        if (this.zzc == 3) {
            return new zzaf(this.zza, this.zzb);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.zzc & 1) == 0) {
            sb.append(ProtectedSandApp.s("\ue655"));
        }
        if ((this.zzc & 2) == 0) {
            sb.append(ProtectedSandApp.s("\ue656"));
        }
        throw new IllegalStateException(ProtectedSandApp.s("\ue657").concat(sb.toString()));
    }
}
