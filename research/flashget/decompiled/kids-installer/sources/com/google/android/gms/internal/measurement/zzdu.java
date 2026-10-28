package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.3.0 */
/* loaded from: classes2.dex */
abstract class zzdu implements Runnable {
    final long zzh;
    final long zzi;
    final boolean zzj;
    final /* synthetic */ zzef zzk;

    zzdu(zzef zzefVar, boolean z5) {
        this.zzk = zzefVar;
        this.zzh = zzefVar.zza.currentTimeMillis();
        this.zzi = zzefVar.zza.elapsedRealtime();
        this.zzj = z5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z5;
        z5 = this.zzk.zzh;
        if (z5) {
            zzb();
            return;
        }
        try {
            zza();
        } catch (Exception e6) {
            this.zzk.zzT(e6, false, this.zzj);
            zzb();
        }
    }

    abstract void zza() throws RemoteException;

    protected void zzb() {
    }
}
