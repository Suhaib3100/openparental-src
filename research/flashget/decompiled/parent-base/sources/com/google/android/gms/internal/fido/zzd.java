package com.google.android.gms.internal.fido;

import android.os.Parcel;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
public abstract class zzd extends zzb implements zze {
    public zzd() {
        super(ProtectedSandApp.s("췆"));
    }

    @Override // com.google.android.gms.internal.fido.zzb
    protected final boolean zza(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
        if (i4 == 1) {
            int i6 = zzc.zza;
            boolean z4 = parcel.readInt() != 0;
            zzc.zzc(parcel);
            zzb(z4);
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
