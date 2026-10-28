package com.google.android.gms.internal.play_billing;

import android.os.Parcel;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public abstract class zzbb extends zzav implements zzbc {
    public zzbb() {
        super(ProtectedSandApp.s("획"));
    }

    @Override // com.google.android.gms.internal.play_billing.zzav
    protected final boolean dispatchTransaction(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
        if (i4 != 1) {
            return false;
        }
        int readInt = parcel.readInt();
        enforceNoDataAvail(parcel);
        zza(readInt);
        return true;
    }
}
