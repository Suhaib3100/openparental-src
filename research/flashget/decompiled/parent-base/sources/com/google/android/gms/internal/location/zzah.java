package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes5.dex */
public abstract class zzah extends zzb implements zzai {
    public zzah() {
        super(ProtectedSandApp.s("턹"));
    }

    @Override // com.google.android.gms.internal.location.zzb
    protected final boolean zza(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
        if (i4 == 1) {
            zzb((zzaa) zzc.zzb(parcel, zzaa.CREATOR));
        } else {
            if (i4 != 2) {
                return false;
            }
            zzc();
        }
        return true;
    }
}
