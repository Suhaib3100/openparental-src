package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
/* loaded from: classes5.dex */
public final class zzj extends zza implements zzl {
    zzj(IBinder iBinder) {
        super(iBinder, ProtectedSandApp.s("퇀"));
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final boolean zzA() throws RemoteException {
        Parcel zzJ = zzJ(16, zza());
        boolean zzf = zzc.zzf(zzJ);
        zzJ.recycle();
        return zzf;
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final double zzd() throws RemoteException {
        Parcel zzJ = zzJ(6, zza());
        double readDouble = zzJ.readDouble();
        zzJ.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final float zze() throws RemoteException {
        Parcel zzJ = zzJ(8, zza());
        float readFloat = zzJ.readFloat();
        zzJ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final float zzf() throws RemoteException {
        Parcel zzJ = zzJ(14, zza());
        float readFloat = zzJ.readFloat();
        zzJ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final int zzg() throws RemoteException {
        Parcel zzJ = zzJ(12, zza());
        int readInt = zzJ.readInt();
        zzJ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final int zzh() throws RemoteException {
        Parcel zzJ = zzJ(10, zza());
        int readInt = zzJ.readInt();
        zzJ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final int zzi() throws RemoteException {
        Parcel zzJ = zzJ(18, zza());
        int readInt = zzJ.readInt();
        zzJ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final IObjectWrapper zzj() throws RemoteException {
        return c.a(zzJ(24, zza()));
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final LatLng zzk() throws RemoteException {
        Parcel zzJ = zzJ(4, zza());
        LatLng latLng = (LatLng) zzc.zza(zzJ, LatLng.CREATOR);
        zzJ.recycle();
        return latLng;
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final String zzl() throws RemoteException {
        Parcel zzJ = zzJ(2, zza());
        String readString = zzJ.readString();
        zzJ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final List zzm() throws RemoteException {
        Parcel zzJ = zzJ(22, zza());
        ArrayList createTypedArrayList = zzJ.createTypedArrayList(PatternItem.CREATOR);
        zzJ.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final void zzn() throws RemoteException {
        zzc(1, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final void zzo(LatLng latLng) throws RemoteException {
        Parcel zza = zza();
        zzc.zzd(zza, latLng);
        zzc(3, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final void zzp(boolean z4) throws RemoteException {
        Parcel zza = zza();
        int i4 = zzc.zza;
        zza.writeInt(z4 ? 1 : 0);
        zzc(19, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final void zzq(int i4) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i4);
        zzc(11, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final void zzr(double d5) throws RemoteException {
        Parcel zza = zza();
        zza.writeDouble(d5);
        zzc(5, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final void zzs(int i4) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i4);
        zzc(9, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final void zzt(List list) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzc(21, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final void zzu(float f4) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f4);
        zzc(7, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final void zzv(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, iObjectWrapper);
        zzc(23, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final void zzw(boolean z4) throws RemoteException {
        Parcel zza = zza();
        int i4 = zzc.zza;
        zza.writeInt(z4 ? 1 : 0);
        zzc(15, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final void zzx(float f4) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f4);
        zzc(13, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final boolean zzy(zzl zzlVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzlVar);
        Parcel zzJ = zzJ(17, zza);
        boolean zzf = zzc.zzf(zzJ);
        zzJ.recycle();
        return zzf;
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final boolean zzz() throws RemoteException {
        Parcel zzJ = zzJ(20, zza());
        boolean zzf = zzc.zzf(zzJ);
        zzJ.recycle();
        return zzf;
    }
}
