package com.google.android.gms.common.internal.service;

import android.os.Parcel;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes5.dex */
public abstract class zaj extends com.google.android.gms.internal.base.zab implements zak {
    public zaj() {
        super(ProtectedSandApp.s("쬙"));
    }

    @Override // com.google.android.gms.internal.base.zab
    protected final boolean zaa(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
        if (i4 != 1) {
            return false;
        }
        int readInt = parcel.readInt();
        com.google.android.gms.internal.base.zac.zab(parcel);
        zab(readInt);
        return true;
    }
}
