package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.maps.model.LatLng;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
/* loaded from: classes5.dex */
public abstract class zzam extends com.google.android.gms.internal.maps.zzb implements zzan {
    public zzam() {
        super(ProtectedSandApp.s("\uda6f"));
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean zza(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
        if (i4 != 1) {
            return false;
        }
        LatLng latLng = (LatLng) com.google.android.gms.internal.maps.zzc.zza(parcel, LatLng.CREATOR);
        com.google.android.gms.internal.maps.zzc.zzc(parcel);
        zzb(latLng);
        parcel2.writeNoException();
        return true;
    }
}
