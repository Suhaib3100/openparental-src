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
public final class zzq extends com.google.android.gms.internal.common.zza implements IInterface {
    zzq(IBinder iBinder) {
        super(iBinder, ProtectedSandApp.s("첊"));
    }

    public final IObjectWrapper zze(IObjectWrapper iObjectWrapper, String str, int i4, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i4);
        com.google.android.gms.internal.common.zzc.zze(zza, iObjectWrapper2);
        return c.a(zzB(2, zza));
    }

    public final IObjectWrapper zzf(IObjectWrapper iObjectWrapper, String str, int i4, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i4);
        com.google.android.gms.internal.common.zzc.zze(zza, iObjectWrapper2);
        return c.a(zzB(3, zza));
    }
}
