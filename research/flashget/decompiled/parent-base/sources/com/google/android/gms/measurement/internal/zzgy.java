package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.l0;
import androidx.annotation.n1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
class zzgy extends BroadcastReceiver {
    private final zznv zza;
    private boolean zzb;
    private boolean zzc;

    zzgy(zznv zznvVar) {
        Preconditions.checkNotNull(zznvVar);
        this.zza = zznvVar;
    }

    @Override // android.content.BroadcastReceiver
    @l0
    public void onReceive(Context context, Intent intent) {
        this.zza.zzs();
        String action = intent.getAction();
        this.zza.zzj().zzp().zza(ProtectedSandApp.s("\ude88"), action);
        if (!ProtectedSandApp.s("\ude89").equals(action)) {
            this.zza.zzj().zzu().zza(ProtectedSandApp.s("\ude8a"), action);
            return;
        }
        boolean zzu = this.zza.zzh().zzu();
        if (this.zzc != zzu) {
            this.zzc = zzu;
            this.zza.zzl().zzb(new zzgx(this, zzu));
        }
    }

    @n1
    public final void zzb() {
        this.zza.zzs();
        this.zza.zzl().zzt();
        this.zza.zzl().zzt();
        if (this.zzb) {
            this.zza.zzj().zzp().zza(ProtectedSandApp.s("\ude8c"));
            this.zzb = false;
            this.zzc = false;
            try {
                this.zza.zza().unregisterReceiver(this);
            } catch (IllegalArgumentException e4) {
                this.zza.zzj().zzg().zza(ProtectedSandApp.s("\ude8d"), e4);
            }
        }
    }

    @n1
    public final void zza() {
        this.zza.zzs();
        this.zza.zzl().zzt();
        if (this.zzb) {
            return;
        }
        this.zza.zza().registerReceiver(this, new IntentFilter(ProtectedSandApp.s("\ude89")));
        this.zzc = this.zza.zzh().zzu();
        this.zza.zzj().zzp().zza(ProtectedSandApp.s("\ude8b"), Boolean.valueOf(this.zzc));
        this.zzb = true;
    }
}
