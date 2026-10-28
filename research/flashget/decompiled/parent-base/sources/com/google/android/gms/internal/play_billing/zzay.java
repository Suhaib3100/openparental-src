package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public final class zzay extends zzau implements zzba {
    zzay(IBinder iBinder) {
        super(iBinder, ProtectedSandApp.s("홼"));
    }

    @Override // com.google.android.gms.internal.play_billing.zzba
    public final void zza(String str, String str2, zzbc zzbcVar) throws RemoteException {
        Parcel zzu = zzu();
        zzu.writeString(str);
        zzu.writeString(str2);
        zzaw.zzc(zzu, zzbcVar);
        zzx(1, zzu);
    }
}
