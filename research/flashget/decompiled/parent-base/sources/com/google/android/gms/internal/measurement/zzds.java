package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
/* loaded from: classes5.dex */
public abstract class zzds extends zzbx implements zzdp {
    public zzds() {
        super(ProtectedSandApp.s("틳"));
    }

    @Override // com.google.android.gms.internal.measurement.zzbx
    protected final boolean zza(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
        if (i4 == 1) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Bundle bundle = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
            long readLong = parcel.readLong();
            zzbw.zzb(parcel);
            zza(readString, readString2, bundle, readLong);
            parcel2.writeNoException();
        } else {
            if (i4 != 2) {
                return false;
            }
            int zza = zza();
            parcel2.writeNoException();
            parcel2.writeInt(zza);
        }
        return true;
    }
}
