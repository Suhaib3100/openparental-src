package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.l0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.measurement.zzpn;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzp extends BroadcastReceiver {
    private final zzhy zza;

    public zzp(zzhy zzhyVar) {
        this.zza = zzhyVar;
    }

    @Override // android.content.BroadcastReceiver
    @l0
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            this.zza.zzj().zzu().zza(ProtectedSandApp.s("\ue491"));
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            this.zza.zzj().zzu().zza(ProtectedSandApp.s("\ue492"));
            return;
        }
        if (!action.equals(ProtectedSandApp.s("\ue493"))) {
            this.zza.zzj().zzu().zza(ProtectedSandApp.s("\ue494"));
            return;
        }
        final zzhy zzhyVar = this.zza;
        if (zzpn.zza() && zzhyVar.zzf().zzf(null, zzbh.zzci)) {
            zzhyVar.zzj().zzp().zza(ProtectedSandApp.s("\ue495"));
            zzhyVar.zzl().zzb(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzr
                @Override // java.lang.Runnable
                public final void run() {
                    zzhy zzhyVar2 = zzhy.this;
                    if (!zzhyVar2.zzt().zzw()) {
                        zzhyVar2.zzj().zzu().zza(ProtectedSandApp.s("\ue496"));
                        return;
                    }
                    final zzjq zzp = zzhyVar2.zzp();
                    Objects.requireNonNull(zzp);
                    new Thread(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzs
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzjq.this.zzap();
                        }
                    }).start();
                }
            });
        }
    }
}
