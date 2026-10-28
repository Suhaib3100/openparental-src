package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.g;
import androidx.annotation.q0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes5.dex */
public final class zzf extends zza {

    @q0
    public final IBinder zze;
    final /* synthetic */ BaseGmsClient zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @g
    public zzf(BaseGmsClient baseGmsClient, @q0 int i4, @q0 IBinder iBinder, Bundle bundle) {
        super(baseGmsClient, i4, bundle);
        java.util.Objects.requireNonNull(baseGmsClient);
        this.zzf = baseGmsClient;
        this.zze = iBinder;
    }

    @Override // com.google.android.gms.common.internal.zza
    protected final boolean zza() {
        try {
            IBinder iBinder = this.zze;
            Preconditions.checkNotNull(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            BaseGmsClient baseGmsClient = this.zzf;
            if (!baseGmsClient.getServiceDescriptor().equals(interfaceDescriptor)) {
                new StringBuilder(String.valueOf(baseGmsClient.getServiceDescriptor()).length() + 34 + String.valueOf(interfaceDescriptor).length());
                return false;
            }
            IInterface createServiceInterface = baseGmsClient.createServiceInterface(this.zze);
            if (createServiceInterface == null) {
                return false;
            }
            if (!baseGmsClient.zze(2, 4, createServiceInterface) && !baseGmsClient.zze(3, 4, createServiceInterface)) {
                return false;
            }
            baseGmsClient.zzn(null);
            BaseGmsClient.BaseConnectionCallbacks zzk = baseGmsClient.zzk();
            Bundle connectionHint = baseGmsClient.getConnectionHint();
            if (zzk != null) {
                baseGmsClient.zzk().onConnected(connectionHint);
            }
            return true;
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.common.internal.zza
    protected final void zzb(ConnectionResult connectionResult) {
        BaseGmsClient baseGmsClient = this.zzf;
        if (baseGmsClient.zzl() != null) {
            baseGmsClient.zzl().onConnectionFailed(connectionResult);
        }
        baseGmsClient.onConnectionFailed(connectionResult);
    }
}
