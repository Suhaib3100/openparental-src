package repeackage.com.zui.deviceidservice;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* loaded from: classes5.dex */
public interface IDeviceidInterface extends IInterface {

    /* loaded from: classes6.dex */
    public static class Default implements IDeviceidInterface {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // repeackage.com.zui.deviceidservice.IDeviceidInterface
        public String createAAIDForPackageName(String str) throws RemoteException {
            return null;
        }

        @Override // repeackage.com.zui.deviceidservice.IDeviceidInterface
        public String getAAID(String str) throws RemoteException {
            return null;
        }

        @Override // repeackage.com.zui.deviceidservice.IDeviceidInterface
        public String getOAID() throws RemoteException {
            return null;
        }

        @Override // repeackage.com.zui.deviceidservice.IDeviceidInterface
        public String getUDID() throws RemoteException {
            return null;
        }

        @Override // repeackage.com.zui.deviceidservice.IDeviceidInterface
        public String getVAID(String str) throws RemoteException {
            return null;
        }

        @Override // repeackage.com.zui.deviceidservice.IDeviceidInterface
        public boolean isSupport() throws RemoteException {
            return false;
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class Stub extends Binder implements IDeviceidInterface {
        private static final String DESCRIPTOR = ProtectedSandApp.s("鐉");
        static final int TRANSACTION_createAAIDForPackageName = 6;
        static final int TRANSACTION_getAAID = 5;
        static final int TRANSACTION_getOAID = 1;
        static final int TRANSACTION_getUDID = 2;
        static final int TRANSACTION_getVAID = 4;
        static final int TRANSACTION_isSupport = 3;

        private static class Proxy implements IDeviceidInterface {
            public static IDeviceidInterface sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder remote) {
                this.mRemote = remote;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // repeackage.com.zui.deviceidservice.IDeviceidInterface
            public String createAAIDForPackageName(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ProtectedSandApp.s("鏾"));
                    obtain.writeString(str);
                    if (!this.mRemote.transact(6, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().createAAIDForPackageName(str);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // repeackage.com.zui.deviceidservice.IDeviceidInterface
            public String getAAID(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ProtectedSandApp.s("鏿"));
                    obtain.writeString(str);
                    if (!this.mRemote.transact(5, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
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
                return ProtectedSandApp.s("鐀");
            }

            @Override // repeackage.com.zui.deviceidservice.IDeviceidInterface
            public String getOAID() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ProtectedSandApp.s("鐁"));
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

            @Override // repeackage.com.zui.deviceidservice.IDeviceidInterface
            public String getUDID() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ProtectedSandApp.s("鐂"));
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getUDID();
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // repeackage.com.zui.deviceidservice.IDeviceidInterface
            public String getVAID(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ProtectedSandApp.s("鐃"));
                    obtain.writeString(str);
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getVAID(str);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // repeackage.com.zui.deviceidservice.IDeviceidInterface
            public boolean isSupport() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ProtectedSandApp.s("鐄"));
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isSupport();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ProtectedSandApp.s("鐅"));
        }

        public static IDeviceidInterface asInterface(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface queryLocalInterface = obj.queryLocalInterface(ProtectedSandApp.s("鐆"));
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IDeviceidInterface)) ? new Proxy(obj) : (IDeviceidInterface) queryLocalInterface;
        }

        public static IDeviceidInterface getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IDeviceidInterface impl) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException(ProtectedSandApp.s("鐇"));
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
        public boolean onTransact(int i5, Parcel parcel, Parcel parcel2, int i6) throws RemoteException {
            String s5 = ProtectedSandApp.s("鐈");
            if (i5 == 1598968902) {
                parcel2.writeString(s5);
                return true;
            }
            switch (i5) {
                case 1:
                    parcel.enforceInterface(s5);
                    String oaid = getOAID();
                    parcel2.writeNoException();
                    parcel2.writeString(oaid);
                    return true;
                case 2:
                    parcel.enforceInterface(s5);
                    String udid = getUDID();
                    parcel2.writeNoException();
                    parcel2.writeString(udid);
                    return true;
                case 3:
                    parcel.enforceInterface(s5);
                    boolean isSupport = isSupport();
                    parcel2.writeNoException();
                    parcel2.writeInt(isSupport ? 1 : 0);
                    return true;
                case 4:
                    parcel.enforceInterface(s5);
                    String vaid = getVAID(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(vaid);
                    return true;
                case 5:
                    parcel.enforceInterface(s5);
                    String aaid = getAAID(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(aaid);
                    return true;
                case 6:
                    parcel.enforceInterface(s5);
                    String createAAIDForPackageName = createAAIDForPackageName(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(createAAIDForPackageName);
                    return true;
                default:
                    return super.onTransact(i5, parcel, parcel2, i6);
            }
        }
    }

    String createAAIDForPackageName(String str) throws RemoteException;

    String getAAID(String str) throws RemoteException;

    String getOAID() throws RemoteException;

    String getUDID() throws RemoteException;

    String getVAID(String str) throws RemoteException;

    boolean isSupport() throws RemoteException;
}
