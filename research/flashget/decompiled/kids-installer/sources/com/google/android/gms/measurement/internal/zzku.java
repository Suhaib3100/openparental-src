package com.google.android.gms.measurement.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes4.dex */
abstract class zzku extends zzkt {
    private boolean zza;

    zzku(zzlh zzlhVar) {
        super(zzlhVar);
        this.zzf.zzM();
    }

    protected final void zzW() {
        if (!zzY()) {
            throw new IllegalStateException(ProtectedSandApp.s("\u2e61"));
        }
    }

    public final void zzX() {
        if (this.zza) {
            throw new IllegalStateException(ProtectedSandApp.s("\u2e62"));
        }
        zzb();
        this.zzf.zzH();
        this.zza = true;
    }

    final boolean zzY() {
        return this.zza;
    }

    protected abstract boolean zzb();
}
