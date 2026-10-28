package com.android.internal.telephony;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes3.dex */
public interface ITelephony extends IInterface {

    public static class Default implements ITelephony {
        @Override // com.android.internal.telephony.ITelephony
        public void answerRingingCall() throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.android.internal.telephony.ITelephony
        public boolean endCall() throws RemoteException {
            return false;
        }
    }

    public static abstract class Stub extends Binder implements ITelephony {
        public static final String DESCRIPTOR = ProtectedSandApp.s("٘");
        static final int TRANSACTION_answerRingingCall = 2;
        static final int TRANSACTION_endCall = 1;

        private static class Proxy implements ITelephony {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.android.internal.telephony.ITelephony
            public void answerRingingCall() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ProtectedSandApp.s("ٗ"));
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.android.internal.telephony.ITelephony
            public boolean endCall() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ProtectedSandApp.s("ٗ"));
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return ProtectedSandApp.s("ٗ");
            }
        }

        public Stub() {
            attachInterface(this, ProtectedSandApp.s("٘"));
        }

        public static ITelephony asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(ProtectedSandApp.s("٘"));
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ITelephony)) ? new Proxy(iBinder) : (ITelephony) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
            String s4 = ProtectedSandApp.s("٘");
            if (i4 >= 1 && i4 <= 16777215) {
                parcel.enforceInterface(s4);
            }
            if (i4 == 1598968902) {
                parcel2.writeString(s4);
                return true;
            }
            if (i4 == 1) {
                boolean endCall = endCall();
                parcel2.writeNoException();
                parcel2.writeInt(endCall ? 1 : 0);
            } else {
                if (i4 != 2) {
                    return super.onTransact(i4, parcel, parcel2, i5);
                }
                answerRingingCall();
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void answerRingingCall() throws RemoteException;

    boolean endCall() throws RemoteException;
}
