package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.location.LocationSettingsResult;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes5.dex */
public abstract class zzan extends zzb implements zzao {
    public zzan() {
        super(ProtectedSandApp.s("턼"));
    }

    @Override // com.google.android.gms.internal.location.zzb
    protected final boolean zza(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
        if (i4 != 1) {
            return false;
        }
        zzb((LocationSettingsResult) zzc.zzb(parcel, LocationSettingsResult.CREATOR));
        return true;
    }
}
