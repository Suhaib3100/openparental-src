package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes2.dex */
final class zzn {

    @q0
    private final Messenger zza;

    @q0
    private final zzd zzb;

    zzn(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (ProtectedSandApp.s("\u0a04").equals(interfaceDescriptor)) {
            this.zza = new Messenger(iBinder);
            this.zzb = null;
        } else if (ProtectedSandApp.s("ਅ").equals(interfaceDescriptor)) {
            this.zzb = new zzd(iBinder);
            this.zza = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            if (valueOf.length() != 0) {
                ProtectedSandApp.s("ਆ").concat(valueOf);
            }
            throw new RemoteException();
        }
    }

    final void zza(Message message) throws RemoteException {
        Messenger messenger = this.zza;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        zzd zzdVar = this.zzb;
        if (zzdVar == null) {
            throw new IllegalStateException(ProtectedSandApp.s("ਇ"));
        }
        zzdVar.zzb(message);
    }
}
