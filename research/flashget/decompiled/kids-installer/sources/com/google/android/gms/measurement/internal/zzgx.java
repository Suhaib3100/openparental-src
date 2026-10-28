package com.google.android.gms.measurement.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes3.dex */
abstract class zzgx extends zzgw {
    private boolean zza;

    zzgx(zzgd zzgdVar) {
        super(zzgdVar);
        this.zzt.zzD();
    }

    protected void zzaC() {
    }

    protected abstract boolean zzf();

    protected final void zzv() {
        if (!zzy()) {
            throw new IllegalStateException(ProtectedSandApp.s("⓮"));
        }
    }

    public final void zzw() {
        if (this.zza) {
            throw new IllegalStateException(ProtectedSandApp.s("⓯"));
        }
        if (zzf()) {
            return;
        }
        this.zzt.zzB();
        this.zza = true;
    }

    public final void zzx() {
        if (this.zza) {
            throw new IllegalStateException(ProtectedSandApp.s("⓰"));
        }
        zzaC();
        this.zzt.zzB();
        this.zza = true;
    }

    final boolean zzy() {
        return this.zza;
    }
}
