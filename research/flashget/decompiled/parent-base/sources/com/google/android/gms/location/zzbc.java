package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes5.dex */
public abstract class zzbc extends com.google.android.gms.internal.location.zzb implements zzbd {
    public zzbc() {
        super(ProtectedSandApp.s("턿"));
    }

    public static zzbd zzb(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface(ProtectedSandApp.s("턿"));
        return queryLocalInterface instanceof zzbd ? (zzbd) queryLocalInterface : new zzbb(iBinder);
    }

    @Override // com.google.android.gms.internal.location.zzb
    protected final boolean zza(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
        if (i4 != 1) {
            return false;
        }
        zzd((Location) com.google.android.gms.internal.location.zzc.zzb(parcel, Location.CREATOR));
        return true;
    }
}
