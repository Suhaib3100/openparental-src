package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes5.dex */
public abstract class zbo extends com.google.android.gms.internal.p000authapi.zbb implements zbp {
    public zbo() {
        super(ProtectedSandApp.s("좀"));
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    protected final boolean zba(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
        if (i4 == 1) {
            zbc();
        } else {
            if (i4 != 2) {
                return false;
            }
            zbb();
        }
        return true;
    }
}
