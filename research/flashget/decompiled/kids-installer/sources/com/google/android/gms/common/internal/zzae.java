package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes3.dex */
public abstract class zzae extends com.google.android.gms.internal.common.zzb implements zzaf {
    public static zzaf zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(ProtectedSandApp.s("≟"));
        return queryLocalInterface instanceof zzaf ? (zzaf) queryLocalInterface : new zzad(iBinder);
    }
}
