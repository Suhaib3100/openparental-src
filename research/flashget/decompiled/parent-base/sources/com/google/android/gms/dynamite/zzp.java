package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes5.dex */
public final class zzp extends com.google.android.gms.internal.common.zza implements IInterface {
    zzp(IBinder iBinder) {
        super(iBinder, ProtectedSandApp.s("첉"));
    }

    public final IObjectWrapper zze(IObjectWrapper iObjectWrapper, String str, int i4) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i4);
        return c.a(zzB(2, zza));
    }

    public final int zzf(IObjectWrapper iObjectWrapper, String str, boolean z4) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(z4 ? 1 : 0);
        Parcel zzB = zzB(3, zza);
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final IObjectWrapper zzg(IObjectWrapper iObjectWrapper, String str, int i4) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i4);
        return c.a(zzB(4, zza));
    }

    public final int zzh(IObjectWrapper iObjectWrapper, String str, boolean z4) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(z4 ? 1 : 0);
        Parcel zzB = zzB(5, zza);
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final int zzi() throws RemoteException {
        Parcel zzB = zzB(6, zza());
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final IObjectWrapper zzj(IObjectWrapper iObjectWrapper, String str, boolean z4, long j4) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(z4 ? 1 : 0);
        zza.writeLong(j4);
        return c.a(zzB(7, zza));
    }

    public final IObjectWrapper zzk(IObjectWrapper iObjectWrapper, String str, int i4, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i4);
        com.google.android.gms.internal.common.zzc.zze(zza, iObjectWrapper2);
        return c.a(zzB(8, zza));
    }
}
