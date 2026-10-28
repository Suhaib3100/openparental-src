package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
/* loaded from: classes5.dex */
public abstract class zzu extends com.google.android.gms.internal.maps.zzb implements zzv {
    public zzu() {
        super(ProtectedSandApp.s("\udab0"));
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean zza(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
        if (i4 != 1) {
            return false;
        }
        int readInt = parcel.readInt();
        com.google.android.gms.internal.maps.zzc.zzc(parcel);
        zzb(readInt);
        parcel2.writeNoException();
        return true;
    }
}
