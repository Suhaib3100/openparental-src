package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes5.dex */
public abstract class zzw extends com.google.android.gms.internal.common.zzb implements zzx {
    public zzw() {
        super(ProtectedSandApp.s("쭤"));
    }

    public static zzx zzg(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface(ProtectedSandApp.s("쭤"));
        return queryLocalInterface instanceof zzx ? (zzx) queryLocalInterface : new zzv(iBinder);
    }

    @Override // com.google.android.gms.internal.common.zzb
    protected final boolean zza(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
        if (i4 == 1) {
            IObjectWrapper zzd = zzd();
            parcel2.writeNoException();
            com.google.android.gms.internal.common.zzc.zze(parcel2, zzd);
        } else {
            if (i4 != 2) {
                return false;
            }
            int zze = zze();
            parcel2.writeNoException();
            parcel2.writeInt(zze);
        }
        return true;
    }
}
