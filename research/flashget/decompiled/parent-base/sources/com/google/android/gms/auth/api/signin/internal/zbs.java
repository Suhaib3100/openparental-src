package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes5.dex */
public final class zbs extends com.google.android.gms.internal.p000authapi.zba implements IInterface {
    zbs(IBinder iBinder) {
        super(iBinder, ProtectedSandApp.s("좁"));
    }

    public final void zbc(zbr zbrVar, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel zba = zba();
        com.google.android.gms.internal.p000authapi.zbc.zbd(zba, zbrVar);
        com.google.android.gms.internal.p000authapi.zbc.zbc(zba, googleSignInOptions);
        zbb(103, zba);
    }

    public final void zbd(zbr zbrVar, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel zba = zba();
        com.google.android.gms.internal.p000authapi.zbc.zbd(zba, zbrVar);
        com.google.android.gms.internal.p000authapi.zbc.zbc(zba, googleSignInOptions);
        zbb(102, zba);
    }

    public final void zbe(zbr zbrVar, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel zba = zba();
        com.google.android.gms.internal.p000authapi.zbc.zbd(zba, zbrVar);
        com.google.android.gms.internal.p000authapi.zbc.zbc(zba, googleSignInOptions);
        zbb(101, zba);
    }
}
