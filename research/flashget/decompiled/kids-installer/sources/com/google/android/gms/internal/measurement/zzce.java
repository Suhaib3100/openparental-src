package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes3.dex */
public abstract class zzce extends zzbn implements zzcf {
    public zzce() {
        super(ProtectedSandApp.s("⌶"));
    }

    @Override // com.google.android.gms.internal.measurement.zzbn
    protected final boolean zza(int i5, Parcel parcel, Parcel parcel2, int i6) throws RemoteException {
        if (i5 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) zzbo.zza(parcel, Bundle.CREATOR);
        zzbo.zzc(parcel);
        zze(bundle);
        parcel2.writeNoException();
        return true;
    }
}
