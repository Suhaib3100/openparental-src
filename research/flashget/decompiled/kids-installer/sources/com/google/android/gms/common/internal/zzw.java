package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.RemoteException;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes3.dex */
public final class zzw extends com.google.android.gms.internal.common.zza implements ICancelToken {
    zzw(IBinder iBinder) {
        super(iBinder, ProtectedSandApp.s("≬"));
    }

    @Override // com.google.android.gms.common.internal.ICancelToken
    public final void cancel() throws RemoteException {
        zzD(2, zza());
    }
}
