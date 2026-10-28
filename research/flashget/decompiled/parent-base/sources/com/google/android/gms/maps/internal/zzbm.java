package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
/* loaded from: classes5.dex */
public abstract class zzbm extends com.google.android.gms.internal.maps.zzb implements zzbn {
    public zzbm() {
        super(ProtectedSandApp.s("\uda7e"));
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean zza(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
        if (i4 != 1) {
            return false;
        }
        StreetViewPanoramaLocation streetViewPanoramaLocation = (StreetViewPanoramaLocation) com.google.android.gms.internal.maps.zzc.zza(parcel, StreetViewPanoramaLocation.CREATOR);
        com.google.android.gms.internal.maps.zzc.zzc(parcel);
        zzb(streetViewPanoramaLocation);
        parcel2.writeNoException();
        return true;
    }
}
