package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
final class zzmn implements Runnable {
    private final /* synthetic */ AtomicReference zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ zzo zze;
    private final /* synthetic */ boolean zzf;
    private final /* synthetic */ zzls zzg;

    zzmn(zzls zzlsVar, AtomicReference atomicReference, String str, String str2, String str3, zzo zzoVar, boolean z4) {
        this.zza = atomicReference;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = zzoVar;
        this.zzf = z4;
        this.zzg = zzlsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzgb zzgbVar;
        synchronized (this.zza) {
            try {
                try {
                    zzgbVar = this.zzg.zzb;
                } catch (RemoteException e4) {
                    this.zzg.zzj().zzg().zza(ProtectedSandApp.s("\ue1ca"), zzgo.zza(this.zzb), this.zzc, e4);
                    this.zza.set(Collections.emptyList());
                }
                if (zzgbVar == null) {
                    this.zzg.zzj().zzg().zza(ProtectedSandApp.s("\ue1c9"), zzgo.zza(this.zzb), this.zzc, this.zzd);
                    this.zza.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(this.zzb)) {
                    Preconditions.checkNotNull(this.zze);
                    this.zza.set(zzgbVar.zza(this.zzc, this.zzd, this.zzf, this.zze));
                } else {
                    this.zza.set(zzgbVar.zza(this.zzb, this.zzc, this.zzd, this.zzf));
                }
                this.zzg.zzar();
                this.zza.notify();
            } finally {
                this.zza.notify();
            }
        }
    }
}
