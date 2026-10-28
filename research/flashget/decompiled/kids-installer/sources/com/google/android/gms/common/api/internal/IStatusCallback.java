package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public interface IStatusCallback extends IInterface {

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* loaded from: classes3.dex */
    public static abstract class Stub extends com.google.android.gms.internal.base.zab implements IStatusCallback {
        public Stub() {
            super(ProtectedSandApp.s("↟"));
        }

        @o0
        public static IStatusCallback asInterface(@o0 IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(ProtectedSandApp.s("↠"));
            return queryLocalInterface instanceof IStatusCallback ? (IStatusCallback) queryLocalInterface : new zaby(iBinder);
        }

        @Override // com.google.android.gms.internal.base.zab
        protected final boolean zaa(int i5, @o0 Parcel parcel, @o0 Parcel parcel2, int i6) throws RemoteException {
            if (i5 != 1) {
                return false;
            }
            onResult((Status) com.google.android.gms.internal.base.zac.zaa(parcel, Status.CREATOR));
            return true;
        }
    }

    void onResult(@o0 Status status) throws RemoteException;
}
