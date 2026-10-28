package repeackage.com.heytap.openid;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes9.dex */
public interface IOpenID extends IInterface {

    public static class Default implements IOpenID {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // repeackage.com.heytap.openid.IOpenID
        public String getSerID(String pkgName, String sign, String type) throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IOpenID {
        private static final String DESCRIPTOR = ProtectedSandApp.s("ꖐ\u0001");
        static final int TRANSACTION_getSerID = 1;

        private static class Proxy implements IOpenID {
            public static IOpenID sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder remote) {
                this.mRemote = remote;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return ProtectedSandApp.s("ꖏ\u0001");
            }

            @Override // repeackage.com.heytap.openid.IOpenID
            public String getSerID(String pkgName, String sign, String type) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ProtectedSandApp.s("ꖏ\u0001"));
                    obtain.writeString(pkgName);
                    obtain.writeString(sign);
                    obtain.writeString(type);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getSerID(pkgName, sign, type);
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
            attachInterface(this, ProtectedSandApp.s("ꖐ\u0001"));
        }

        public static IOpenID asInterface(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface queryLocalInterface = obj.queryLocalInterface(ProtectedSandApp.s("ꖐ\u0001"));
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IOpenID)) ? new Proxy(obj) : (IOpenID) queryLocalInterface;
        }

        public static IOpenID getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IOpenID impl) {
            if (Proxy.sDefaultImpl != null || impl == null) {
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
            String s4 = ProtectedSandApp.s("ꖐ\u0001");
            if (code != 1) {
                if (code != 1598968902) {
                    return super.onTransact(code, data, reply, flags);
                }
                reply.writeString(s4);
                return true;
            }
            data.enforceInterface(s4);
            String serID = getSerID(data.readString(), data.readString(), data.readString());
            reply.writeNoException();
            reply.writeString(serID);
            return true;
        }
    }

    String getSerID(String pkgName, String sign, String type) throws RemoteException;
}
