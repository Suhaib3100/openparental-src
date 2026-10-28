package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
/* loaded from: classes5.dex */
public final class zzak extends zza implements zzam {
    zzak(IBinder iBinder) {
        super(iBinder, ProtectedSandApp.s("톘"));
    }

    @Override // com.google.android.gms.internal.maps.zzam
    public final float zzd() throws RemoteException {
        Parcel zzJ = zzJ(13, zza());
        float readFloat = zzJ.readFloat();
        zzJ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzam
    public final float zze() throws RemoteException {
        Parcel zzJ = zzJ(5, zza());
        float readFloat = zzJ.readFloat();
        zzJ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzam
    public final int zzf() throws RemoteException {
        Parcel zzJ = zzJ(9, zza());
        int readInt = zzJ.readInt();
        zzJ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzam
    public final String zzg() throws RemoteException {
        Parcel zzJ = zzJ(3, zza());
        String readString = zzJ.readString();
        zzJ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzam
    public final void zzh() throws RemoteException {
        zzc(2, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzam
    public final void zzi() throws RemoteException {
        zzc(1, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzam
    public final void zzj(boolean z4) throws RemoteException {
        Parcel zza = zza();
        int i4 = zzc.zza;
        zza.writeInt(z4 ? 1 : 0);
        zzc(10, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzam
    public final void zzk(float f4) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f4);
        zzc(12, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzam
    public final void zzl(boolean z4) throws RemoteException {
        Parcel zza = zza();
        int i4 = zzc.zza;
        zza.writeInt(z4 ? 1 : 0);
        zzc(6, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzam
    public final void zzm(float f4) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f4);
        zzc(4, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzam
    public final boolean zzn(zzam zzamVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzamVar);
        Parcel zzJ = zzJ(8, zza);
        boolean zzf = zzc.zzf(zzJ);
        zzJ.recycle();
        return zzf;
    }

    @Override // com.google.android.gms.internal.maps.zzam
    public final boolean zzo() throws RemoteException {
        Parcel zzJ = zzJ(11, zza());
        boolean zzf = zzc.zzf(zzJ);
        zzJ.recycle();
        return zzf;
    }

    @Override // com.google.android.gms.internal.maps.zzam
    public final boolean zzp() throws RemoteException {
        Parcel zzJ = zzJ(7, zza());
        boolean zzf = zzc.zzf(zzJ);
        zzJ.recycle();
        return zzf;
    }
}
