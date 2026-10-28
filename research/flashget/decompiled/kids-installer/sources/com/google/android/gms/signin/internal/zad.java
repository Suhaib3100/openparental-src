package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes3.dex */
public abstract class zad extends com.google.android.gms.internal.base.zab implements zae {
    public zad() {
        super(ProtectedSandApp.s("♽"));
    }

    @Override // com.google.android.gms.internal.base.zab
    protected final boolean zaa(int i5, Parcel parcel, Parcel parcel2, int i6) throws RemoteException {
        switch (i5) {
            case 3:
                break;
            case 4:
                break;
            case 5:
            default:
                return false;
            case 6:
                break;
            case 7:
                break;
            case 8:
                zab((zak) com.google.android.gms.internal.base.zac.zaa(parcel, zak.CREATOR));
                break;
            case 9:
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
