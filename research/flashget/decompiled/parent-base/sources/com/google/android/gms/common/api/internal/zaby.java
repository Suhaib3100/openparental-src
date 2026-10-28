package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes5.dex */
public final class zaby extends com.google.android.gms.internal.base.zaa implements IStatusCallback {
    zaby(IBinder iBinder) {
        super(iBinder, ProtectedSandApp.s("쩦"));
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status) throws RemoteException {
        throw null;
    }
}
