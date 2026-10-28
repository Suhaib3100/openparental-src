package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public abstract class zzaq extends zzav implements zzar {
    public static zzar zzu(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(ProtectedSandApp.s("홺"));
        return queryLocalInterface instanceof zzar ? (zzar) queryLocalInterface : new zzap(iBinder);
    }

    @Override // com.google.android.gms.internal.play_billing.zzav
    protected final boolean dispatchTransaction(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
        throw null;
    }
}
