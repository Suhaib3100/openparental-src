package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.l0;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfk implements ServiceConnection {
    final /* synthetic */ zzfl zza;
    private final String zzb;

    zzfk(zzfl zzflVar, String str) {
        this.zza = zzflVar;
        this.zzb = str;
    }

    @Override // android.content.ServiceConnection
    @l0
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            b.a(this.zza.zza, ProtectedSandApp.s("ྵ"));
            return;
        }
        try {
            com.google.android.gms.internal.measurement.zzbr zzb = com.google.android.gms.internal.measurement.zzbq.zzb(iBinder);
            if (zzb == null) {
                this.zza.zza.zzaA().zzk().zza(ProtectedSandApp.s("ྲ"));
            } else {
                this.zza.zza.zzaA().zzj().zza(ProtectedSandApp.s("ླ"));
                this.zza.zza.zzaB().zzp(new zzfj(this, zzb, this));
            }
        } catch (RuntimeException e6) {
            this.zza.zza.zzaA().zzk().zzb(ProtectedSandApp.s("ྴ"), e6);
        }
    }

    @Override // android.content.ServiceConnection
    @l0
    public final void onServiceDisconnected(ComponentName componentName) {
        c.a(this.zza.zza, ProtectedSandApp.s("ྶ"));
    }
}
