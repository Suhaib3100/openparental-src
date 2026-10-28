package com.google.android.gms.internal.fido;

import android.os.Parcel;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
public abstract class zzf extends zzb implements zzg {
    public zzf() {
        super(ProtectedSandApp.s("췈"));
    }

    @Override // com.google.android.gms.internal.fido.zzb
    protected final boolean zza(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
        if (i4 == 1) {
            ArrayList zzb = zzc.zzb(parcel);
            zzc.zzc(parcel);
            zzb(zzb);
        } else {
            if (i4 != 2) {
                return false;
            }
            Status status = (Status) zzc.zza(parcel, Status.CREATOR);
            zzc.zzc(parcel);
            zzc(status);
        }
        parcel2.writeNoException();
        return true;
    }
}
