package com.google.android.gms.internal.fido;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
public final class zzw extends zza implements IInterface {
    zzw(IBinder iBinder) {
        super(iBinder, ProtectedSandApp.s("턳"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzc(zzv zzvVar, RegisterRequestParams registerRequestParams) throws RemoteException {
        Parcel zza = zza();
        int i4 = zzc.zza;
        zza.writeStrongBinder(zzvVar);
        zzc.zzd(zza, registerRequestParams);
        zzb(1, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzd(zzv zzvVar, SignRequestParams signRequestParams) throws RemoteException {
        Parcel zza = zza();
        int i4 = zzc.zza;
        zza.writeStrongBinder(zzvVar);
        zzc.zzd(zza, signRequestParams);
        zzb(2, zza);
    }
}
