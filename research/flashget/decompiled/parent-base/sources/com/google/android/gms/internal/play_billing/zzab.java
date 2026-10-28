package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public abstract class zzab extends zzav implements zzac {
    private static final String DESCRIPTOR = ProtectedSandApp.s("홲");
    static final int TRANSACTION_onDelegateToBackendResponse = 1;

    public zzab() {
        super(ProtectedSandApp.s("홲"));
    }

    public static zzac asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(ProtectedSandApp.s("홲"));
        return queryLocalInterface instanceof zzac ? (zzac) queryLocalInterface : new zzaa(iBinder);
    }

    @Override // com.google.android.gms.internal.play_billing.zzav
    protected boolean dispatchTransaction(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
        if (i4 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) zzaw.zza(parcel, Bundle.CREATOR);
        enforceNoDataAvail(parcel);
        onDelegateToBackendResponse(bundle);
        return true;
    }
}
