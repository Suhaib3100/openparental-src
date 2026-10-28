package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes5.dex */
public interface IStatusCallback extends IInterface {

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    public static abstract class Stub extends com.google.android.gms.internal.base.zab implements IStatusCallback {
        public Stub() {
            super(ProtectedSandApp.s("짶"));
        }

        @o0
        public static IStatusCallback asInterface(@o0 IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(ProtectedSandApp.s("짶"));
            return queryLocalInterface instanceof IStatusCallback ? (IStatusCallback) queryLocalInterface : new zaby(iBinder);
        }

        @Override // com.google.android.gms.internal.base.zab
        protected final boolean zaa(int i4, @o0 Parcel parcel, @o0 Parcel parcel2, int i5) throws RemoteException {
            if (i4 != 1) {
                return false;
            }
            Status status = (Status) com.google.android.gms.internal.base.zac.zaa(parcel, Status.CREATOR);
            com.google.android.gms.internal.base.zac.zab(parcel);
            onResult(status);
            return true;
        }
    }

    void onResult(@o0 Status status) throws RemoteException;
}
