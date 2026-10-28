package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
/* loaded from: classes5.dex */
public abstract class zzaa extends com.google.android.gms.internal.maps.zzb implements zzab {
    public zzaa() {
        super(ProtectedSandApp.s("\uda69"));
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean zza(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
        if (i4 == 1) {
            zzb();
        } else {
            if (i4 != 2) {
                return false;
            }
            com.google.android.gms.internal.maps.zzu zzb = com.google.android.gms.internal.maps.zzt.zzb(parcel.readStrongBinder());
            com.google.android.gms.internal.maps.zzc.zzc(parcel);
            zzc(zzb);
        }
        parcel2.writeNoException();
        return true;
    }
}
