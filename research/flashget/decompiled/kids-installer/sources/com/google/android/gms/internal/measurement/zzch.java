package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes3.dex */
public abstract class zzch extends zzbn implements zzci {
    public zzch() {
        super(ProtectedSandApp.s("⍁"));
    }

    @Override // com.google.android.gms.internal.measurement.zzbn
    protected final boolean zza(int i5, Parcel parcel, Parcel parcel2, int i6) throws RemoteException {
        if (i5 == 1) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Bundle bundle = (Bundle) zzbo.zza(parcel, Bundle.CREATOR);
            long readLong = parcel.readLong();
            zzbo.zzc(parcel);
            zze(readString, readString2, bundle, readLong);
            parcel2.writeNoException();
        } else {
            if (i5 != 2) {
                return false;
            }
            int zzd = zzd();
            parcel2.writeNoException();
            parcel2.writeInt(zzd);
        }
        return true;
    }
}
