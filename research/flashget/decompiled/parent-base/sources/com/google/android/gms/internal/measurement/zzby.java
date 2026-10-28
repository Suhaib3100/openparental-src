package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
public abstract class zzby extends zzbx implements zzbz {
    public static zzbz zza(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(ProtectedSandApp.s("틀"));
        return queryLocalInterface instanceof zzbz ? (zzbz) queryLocalInterface : new zzca(iBinder);
    }
}
