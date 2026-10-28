package com.google.android.gms.internal.auth;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes5.dex */
public abstract class zzn extends zzb implements zzo {
    public zzn() {
        super(ProtectedSandApp.s("쿍"));
    }

    @Override // com.google.android.gms.internal.auth.zzb
    protected final boolean zza(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
        if (i4 != 2) {
            return false;
        }
        Status status = (Status) zzc.zza(parcel, Status.CREATOR);
        Bundle bundle = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
        zzc.zzb(parcel);
        zzb(status, bundle);
        return true;
    }
}
