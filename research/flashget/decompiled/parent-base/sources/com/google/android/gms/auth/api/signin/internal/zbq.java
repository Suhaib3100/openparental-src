package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes5.dex */
public abstract class zbq extends com.google.android.gms.internal.p000authapi.zbb implements zbr {
    public zbq() {
        super(ProtectedSandApp.s("젬"));
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    protected final boolean zba(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
        switch (i4) {
            case 101:
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) com.google.android.gms.internal.p000authapi.zbc.zba(parcel, GoogleSignInAccount.CREATOR);
                Status status = (Status) com.google.android.gms.internal.p000authapi.zbc.zba(parcel, Status.CREATOR);
                com.google.android.gms.internal.p000authapi.zbc.zbb(parcel);
                zbd(googleSignInAccount, status);
                break;
            case 102:
                Status status2 = (Status) com.google.android.gms.internal.p000authapi.zbc.zba(parcel, Status.CREATOR);
                com.google.android.gms.internal.p000authapi.zbc.zbb(parcel);
                zbc(status2);
                break;
            case 103:
                Status status3 = (Status) com.google.android.gms.internal.p000authapi.zbc.zba(parcel, Status.CREATOR);
                com.google.android.gms.internal.p000authapi.zbc.zbb(parcel);
                zbb(status3);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
