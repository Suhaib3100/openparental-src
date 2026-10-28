package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.l0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzhi implements ServiceConnection {
    final /* synthetic */ zzhf zza;
    private final String zzb;

    zzhi(zzhf zzhfVar, String str) {
        this.zza = zzhfVar;
        this.zzb = str;
    }

    @Override // android.content.ServiceConnection
    @l0
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.zza.zza.zzj().zzu().zza(ProtectedSandApp.s("\udee2"));
            return;
        }
        try {
            com.google.android.gms.internal.measurement.zzbz zza = com.google.android.gms.internal.measurement.zzby.zza(iBinder);
            if (zza == null) {
                this.zza.zza.zzj().zzu().zza(ProtectedSandApp.s("\udee3"));
            } else {
                this.zza.zza.zzj().zzp().zza(ProtectedSandApp.s("\udee4"));
                this.zza.zza.zzl().zzb(new zzhh(this, zza, this));
            }
        } catch (RuntimeException e4) {
            this.zza.zza.zzj().zzu().zza(ProtectedSandApp.s("\udee5"), e4);
        }
    }

    @Override // android.content.ServiceConnection
    @l0
    public final void onServiceDisconnected(ComponentName componentName) {
        this.zza.zza.zzj().zzp().zza(ProtectedSandApp.s("\udee6"));
    }
}
