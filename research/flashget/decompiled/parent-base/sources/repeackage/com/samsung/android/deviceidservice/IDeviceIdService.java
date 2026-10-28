package repeackage.com.samsung.android.deviceidservice;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes9.dex */
public interface IDeviceIdService extends IInterface {

    public static class Default implements IDeviceIdService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // repeackage.com.samsung.android.deviceidservice.IDeviceIdService
        public String getAAID(String str) throws RemoteException {
            return null;
        }

        @Override // repeackage.com.samsung.android.deviceidservice.IDeviceIdService
        public String getOAID() throws RemoteException {
            return null;
        }

        @Override // repeackage.com.samsung.android.deviceidservice.IDeviceIdService
        public String getVAID(String str) throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IDeviceIdService {
        private static final String DESCRIPTOR = ProtectedSandApp.s("ꖒ\u0001");
        static final int TRANSACTION_getAAID = 3;
        static final int TRANSACTION_getOAID = 1;
        static final int TRANSACTION_getVAID = 2;

        private static class Proxy implements IDeviceIdService {
            public static IDeviceIdService sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder remote) {
                this.mRemote = remote;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // repeackage.com.samsung.android.deviceidservice.IDeviceIdService
            public String getAAID(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ProtectedSandApp.s("ꖑ\u0001"));
                    obtain.writeString(str);
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getAAID(str);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return ProtectedSandApp.s("ꖑ\u0001");
            }

            @Override // repeackage.com.samsung.android.deviceidservice.IDeviceIdService
            public String getOAID() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ProtectedSandApp.s("ꖑ\u0001"));
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getOAID();
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // repeackage.com.samsung.android.deviceidservice.IDeviceIdService
            public String getVAID(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ProtectedSandApp.s("ꖑ\u0001"));
                    obtain.writeString(str);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getVAID(str);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ProtectedSandApp.s("ꖒ\u0001"));
        }

        public static IDeviceIdService asInterface(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface queryLocalInterface = obj.queryLocalInterface(ProtectedSandApp.s("ꖒ\u0001"));
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IDeviceIdService)) ? new Proxy(obj) : (IDeviceIdService) queryLocalInterface;
        }

        public static IDeviceIdService getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IDeviceIdService impl) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException(ProtectedSandApp.s("ꖓ\u0001"));
            }
            if (impl == null) {
                return false;
            }
            Proxy.sDefaultImpl = impl;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            String s4 = ProtectedSandApp.s("ꖒ\u0001");
            if (code == 1) {
                data.enforceInterface(s4);
                String oaid = getOAID();
                reply.writeNoException();
                reply.writeString(oaid);
                return true;
            }
            if (code == 2) {
                data.enforceInterface(s4);
                String vaid = getVAID(data.readString());
                reply.writeNoException();
                reply.writeString(vaid);
                return true;
            }
            if (code != 3) {
                if (code != 1598968902) {
                    return super.onTransact(code, data, reply, flags);
                }
                reply.writeString(s4);
                return true;
            }
            data.enforceInterface(s4);
            String aaid = getAAID(data.readString());
            reply.writeNoException();
            reply.writeString(aaid);
            return true;
        }
    }

    String getAAID(String str) throws RemoteException;

    String getOAID() throws RemoteException;

    String getVAID(String str) throws RemoteException;
}
