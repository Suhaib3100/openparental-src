package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.IAccountAccessor;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes5.dex */
public final class zaf extends com.google.android.gms.internal.base.zaa implements IInterface {
    zaf(IBinder iBinder) {
        super(iBinder, ProtectedSandApp.s("\ue4f4"));
    }

    public final void zae(int i4) throws RemoteException {
        Parcel zaa = zaa();
        zaa.writeInt(i4);
        zac(7, zaa);
    }

    public final void zaf(IAccountAccessor iAccountAccessor, int i4, boolean z4) throws RemoteException {
        Parcel zaa = zaa();
        com.google.android.gms.internal.base.zac.zad(zaa, iAccountAccessor);
        zaa.writeInt(i4);
        zaa.writeInt(z4 ? 1 : 0);
        zac(9, zaa);
    }

    public final void zag(zai zaiVar, zae zaeVar) throws RemoteException {
        Parcel zaa = zaa();
        com.google.android.gms.internal.base.zac.zac(zaa, zaiVar);
        com.google.android.gms.internal.base.zac.zad(zaa, zaeVar);
        zac(12, zaa);
    }
}
