package com.google.android.gms.cloudmessaging;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* loaded from: classes5.dex */
interface IMessengerCompat extends IInterface {
    public static final String DESCRIPTOR = ProtectedSandApp.s("죂");
    public static final int TRANSACTION_SEND = 1;

    /* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
    public static class Impl extends Binder implements IMessengerCompat {
        @Override // android.os.IInterface
        @o0
        public IBinder asBinder() {
            throw null;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i4, @o0 Parcel parcel, @q0 Parcel parcel2, int i5) throws RemoteException {
            throw null;
        }

        @Override // com.google.android.gms.cloudmessaging.IMessengerCompat
        public void send(@o0 Message message) throws RemoteException {
            throw null;
        }
    }

    /* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
    public static class Proxy implements IMessengerCompat {
        private final IBinder zza;

        Proxy(@o0 IBinder iBinder) {
            this.zza = iBinder;
        }

        @Override // android.os.IInterface
        @o0
        public IBinder asBinder() {
            return this.zza;
        }

        @Override // com.google.android.gms.cloudmessaging.IMessengerCompat
        public void send(@o0 Message message) throws RemoteException {
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(ProtectedSandApp.s("죃"));
            obtain.writeInt(1);
            message.writeToParcel(obtain, 0);
            try {
                this.zza.transact(1, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        }
    }

    void send(@o0 Message message) throws RemoteException;
}
