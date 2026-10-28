package com.google.android.gms.measurement.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
abstract class zzjd extends zzja {
    private boolean zza;

    zzjd(zzhy zzhyVar) {
        super(zzhyVar);
        this.zzu.zzaa();
    }

    protected void zzaa() {
    }

    protected final void zzac() {
        if (!zzaf()) {
            throw new IllegalStateException(ProtectedSandApp.s("\udd64"));
        }
    }

    public final void zzad() {
        if (this.zza) {
            throw new IllegalStateException(ProtectedSandApp.s("\udd65"));
        }
        if (zzh()) {
            return;
        }
        this.zzu.zzz();
        this.zza = true;
    }

    public final void zzae() {
        if (this.zza) {
            throw new IllegalStateException(ProtectedSandApp.s("\udd65"));
        }
        zzaa();
        this.zzu.zzz();
        this.zza = true;
    }

    final boolean zzaf() {
        return this.zza;
    }

    protected abstract boolean zzh();
}
