package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.IInterface;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
/* loaded from: classes5.dex */
public abstract class zzq extends zzb implements zzr {
    public static zzr zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(ProtectedSandApp.s("퇅"));
        return queryLocalInterface instanceof zzr ? (zzr) queryLocalInterface : new zzp(iBinder);
    }
}
