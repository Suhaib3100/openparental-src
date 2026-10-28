package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes5.dex */
public final class zzy extends com.google.android.gms.internal.common.zza implements IGmsCallbacks {
    zzy(IBinder iBinder) {
        super(iBinder, ProtectedSandApp.s("쭥"));
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void onPostInitComplete(int i4, IBinder iBinder, Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i4);
        zza.writeStrongBinder(iBinder);
        com.google.android.gms.internal.common.zzc.zzc(zza, bundle);
        zzD(1, zza);
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void zzb(int i4, Bundle bundle) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void zzc(int i4, IBinder iBinder, zzj zzjVar) throws RemoteException {
        throw null;
    }
}
