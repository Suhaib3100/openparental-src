package com.google.android.gms.common;

import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes5.dex */
final class zzv {
    private String zza = null;

    @q0
    private Boolean zzb = null;

    @q0
    private Boolean zzc = null;

    private zzv() {
    }

    final zzv zza(String str) {
        this.zza = str;
        return this;
    }

    final zzv zzb(boolean z4) {
        this.zzb = Boolean.valueOf(z4);
        return this;
    }

    final zzv zzc(boolean z4) {
        this.zzc = Boolean.valueOf(z4);
        return this;
    }

    final zzw zzd() {
        Boolean bool = this.zzb;
        if (bool == null) {
            throw new IllegalStateException(ProtectedSandApp.s("챐"));
        }
        if (this.zzc != null) {
            return new zzw(this.zza, bool.booleanValue(), false, false, this.zzc.booleanValue(), false, null);
        }
        throw new IllegalStateException(ProtectedSandApp.s("챏"));
    }

    /* synthetic */ zzv(byte[] bArr) {
    }
}
