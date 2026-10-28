package com.google.android.gms.measurement.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
abstract class zznr extends zzns {
    private boolean zza;

    zznr(zznv zznvVar) {
        super(zznvVar);
        this.zzg.zzu();
    }

    protected final void zzal() {
        if (!zzan()) {
            throw new IllegalStateException(ProtectedSandApp.s("\udb91"));
        }
    }

    public final void zzam() {
        if (this.zza) {
            throw new IllegalStateException(ProtectedSandApp.s("\udb92"));
        }
        zzc();
        this.zzg.zzt();
        this.zza = true;
    }

    final boolean zzan() {
        return this.zza;
    }

    protected abstract boolean zzc();
}
