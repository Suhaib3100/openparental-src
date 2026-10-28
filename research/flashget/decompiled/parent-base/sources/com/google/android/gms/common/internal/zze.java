package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.m1;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@m1
/* loaded from: classes5.dex */
public final class zze implements ServiceConnection {
    final /* synthetic */ BaseGmsClient zza;
    private final int zzb;

    public zze(BaseGmsClient baseGmsClient, int i4) {
        java.util.Objects.requireNonNull(baseGmsClient);
        this.zza = baseGmsClient;
        this.zzb = i4;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        BaseGmsClient baseGmsClient = this.zza;
        if (iBinder == null) {
            baseGmsClient.zzf(16);
            return;
        }
        synchronized (baseGmsClient.zzh()) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface(ProtectedSandApp.s("쭘"));
                baseGmsClient.zzi((queryLocalInterface == null || !(queryLocalInterface instanceof IGmsServiceBroker)) ? new zzaa(iBinder) : (IGmsServiceBroker) queryLocalInterface);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.zza.zzb(0, null, this.zzb);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        BaseGmsClient baseGmsClient = this.zza;
        synchronized (baseGmsClient.zzh()) {
            baseGmsClient.zzi(null);
        }
        BaseGmsClient baseGmsClient2 = this.zza;
        int i4 = this.zzb;
        Handler handler = baseGmsClient2.zzb;
        handler.sendMessage(handler.obtainMessage(6, i4, 1));
    }
}
