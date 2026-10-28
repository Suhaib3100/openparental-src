package com.google.android.gms.measurement.internal;

import androidx.annotation.n1;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
abstract class zzh extends zze {
    private boolean zza;

    zzh(zzhy zzhyVar) {
        super(zzhyVar);
        this.zzu.zzaa();
    }

    protected final void zzu() {
        if (!zzy()) {
            throw new IllegalStateException(ProtectedSandApp.s("\ude0c"));
        }
    }

    public final void zzv() {
        if (this.zza) {
            throw new IllegalStateException(ProtectedSandApp.s("\ude0d"));
        }
        if (zzz()) {
            return;
        }
        this.zzu.zzz();
        this.zza = true;
    }

    public final void zzw() {
        if (this.zza) {
            throw new IllegalStateException(ProtectedSandApp.s("\ude0d"));
        }
        zzx();
        this.zzu.zzz();
        this.zza = true;
    }

    @n1
    protected void zzx() {
    }

    final boolean zzy() {
        return this.zza;
    }

    protected abstract boolean zzz();
}
