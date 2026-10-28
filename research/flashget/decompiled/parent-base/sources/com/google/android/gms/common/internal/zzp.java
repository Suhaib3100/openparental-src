package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes5.dex */
final class zzp implements Handler.Callback {
    final /* synthetic */ zzq zza;

    /* synthetic */ zzp(zzq zzqVar, byte[] bArr) {
        java.util.Objects.requireNonNull(zzqVar);
        this.zza = zzqVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i4 = message.what;
        if (i4 == 0) {
            zzq zzqVar = this.zza;
            synchronized (zzqVar.zzf()) {
                try {
                    zzn zznVar = (zzn) message.obj;
                    zzo zzoVar = (zzo) zzqVar.zzf().get(zznVar);
                    if (zzoVar != null && zzoVar.zzg()) {
                        if (zzoVar.zzd()) {
                            zzoVar.zza(ProtectedSandApp.s("쭜"));
                        }
                        zzqVar.zzf().remove(zznVar);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i4 != 1) {
            return false;
        }
        zzq zzqVar2 = this.zza;
        synchronized (zzqVar2.zzf()) {
            try {
                zzn zznVar2 = (zzn) message.obj;
                zzo zzoVar2 = (zzo) zzqVar2.zzf().get(zznVar2);
                if (zzoVar2 != null && zzoVar2.zze() == 3) {
                    new StringBuilder(String.valueOf(zznVar2).length() + 47);
                    new Exception();
                    ComponentName zzi = zzoVar2.zzi();
                    if (zzi == null) {
                        zzi = zznVar2.zzc();
                    }
                    if (zzi == null) {
                        String zzb = zznVar2.zzb();
                        Preconditions.checkNotNull(zzb);
                        zzi = new ComponentName(zzb, ProtectedSandApp.s("쭛"));
                    }
                    zzoVar2.onServiceDisconnected(zzi);
                }
            } finally {
            }
        }
        return true;
    }
}
