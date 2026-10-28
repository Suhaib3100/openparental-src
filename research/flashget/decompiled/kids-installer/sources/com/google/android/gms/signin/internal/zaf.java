package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.internal.IAccountAccessor;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes3.dex */
public final class zaf extends com.google.android.gms.internal.base.zaa implements IInterface {
    zaf(IBinder iBinder) {
        super(iBinder, ProtectedSandApp.s("♾"));
    }

    public final void zae(int i5) throws RemoteException {
        Parcel zaa = zaa();
        zaa.writeInt(i5);
        zac(7, zaa);
    }

    public final void zaf(IAccountAccessor iAccountAccessor, int i5, boolean z5) throws RemoteException {
        Parcel zaa = zaa();
        com.google.android.gms.internal.base.zac.zad(zaa, iAccountAccessor);
        zaa.writeInt(i5);
        com.google.android.gms.internal.base.zac.zab(zaa, z5);
        zac(9, zaa);
    }

    public final void zag(zai zaiVar, zae zaeVar) throws RemoteException {
        Parcel zaa = zaa();
        com.google.android.gms.internal.base.zac.zac(zaa, zaiVar);
        com.google.android.gms.internal.base.zac.zad(zaa, zaeVar);
        zac(12, zaa);
    }
}
