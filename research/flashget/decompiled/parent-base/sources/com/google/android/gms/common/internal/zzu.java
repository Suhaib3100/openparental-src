package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes5.dex */
public final class zzu extends com.google.android.gms.internal.common.zza implements ICancelToken {
    zzu(IBinder iBinder) {
        super(iBinder, ProtectedSandApp.s("쭢"));
    }

    @Override // com.google.android.gms.common.internal.ICancelToken
    public final void cancel() throws RemoteException {
        zzC(2, zza());
    }
}
