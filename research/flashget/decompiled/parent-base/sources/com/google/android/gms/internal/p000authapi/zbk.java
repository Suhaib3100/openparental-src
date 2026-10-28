package com.google.android.gms.internal.p000authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes5.dex */
public final class zbk extends zba implements IInterface {
    zbk(IBinder iBinder) {
        super(iBinder, ProtectedSandApp.s("칦"));
    }

    public final void zbc(zbj zbjVar, AuthorizationRequest authorizationRequest) throws RemoteException {
        Parcel zba = zba();
        zbc.zbd(zba, zbjVar);
        zbc.zbc(zba, authorizationRequest);
        zbb(1, zba);
    }
}
