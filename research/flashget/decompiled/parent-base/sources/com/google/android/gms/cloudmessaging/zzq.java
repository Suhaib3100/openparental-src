package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* loaded from: classes5.dex */
final class zzq {

    @q0
    private final Messenger zza;

    @q0
    private final zzd zzb;

    zzq(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, ProtectedSandApp.s("주"))) {
            this.zza = new Messenger(iBinder);
            this.zzb = null;
        } else if (Objects.equals(interfaceDescriptor, ProtectedSandApp.s("죽"))) {
            this.zzb = new zzd(iBinder);
            this.zza = null;
        } else {
            ProtectedSandApp.s("죾").concat(String.valueOf(interfaceDescriptor));
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
            throw new IllegalStateException(ProtectedSandApp.s("죿"));
        }
        zzdVar.zzb(message);
    }
}
