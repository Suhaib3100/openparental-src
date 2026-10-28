package com.tencent.trtc.hardwareearmonitor.honor;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public interface IHonorAudioService extends IInterface {

    public static class Default implements IHonorAudioService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioService
        public List getSupportedServices() throws RemoteException {
            return null;
        }

        @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioService
        public void init(String str, String str2) throws RemoteException {
        }

        @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioService
        public boolean isServiceSupported(int i4) throws RemoteException {
            return false;
        }
    }

    public static abstract class Stub extends Binder implements IHonorAudioService {
        private static final String DESCRIPTOR = ProtectedSandApp.s("嵜\u0001");
        static final int TRANSACTION_getSupportedServices = 1;
        static final int TRANSACTION_init = 3;
        static final int TRANSACTION_isServiceSupported = 2;

        public static class Proxy implements IHonorAudioService {
            public static IHonorAudioService sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return ProtectedSandApp.s("嵛\u0001");
            }

            @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioService
            public List getSupportedServices() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ProtectedSandApp.s("嵛\u0001"));
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        List supportedServices = Stub.getDefaultImpl().getSupportedServices();
                        obtain2.recycle();
                        obtain.recycle();
                        return supportedServices;
                    }
                    obtain2.readException();
                    ArrayList readArrayList = obtain2.readArrayList(getClass().getClassLoader());
                    obtain2.recycle();
                    obtain.recycle();
                    return readArrayList;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioService
            public void init(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ProtectedSandApp.s("嵛\u0001"));
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (this.mRemote.transact(3, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                    } else {
                        Stub.getDefaultImpl().init(str, str2);
                        obtain2.recycle();
                        obtain.recycle();
                    }
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioService
            public boolean isServiceSupported(int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ProtectedSandApp.s("嵛\u0001"));
                    obtain.writeInt(i4);
                    if (this.mRemote.transact(2, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        return obtain2.readInt() != 0;
                    }
                    boolean isServiceSupported = Stub.getDefaultImpl().isServiceSupported(i4);
                    obtain2.recycle();
                    obtain.recycle();
                    return isServiceSupported;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ProtectedSandApp.s("嵜\u0001"));
        }

        public static IHonorAudioService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(ProtectedSandApp.s("嵜\u0001"));
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IHonorAudioService)) ? new Proxy(iBinder) : (IHonorAudioService) queryLocalInterface;
        }

        public static IHonorAudioService getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IHonorAudioService iHonorAudioService) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException(ProtectedSandApp.s("嵝\u0001"));
            }
            if (iHonorAudioService == null) {
                return false;
            }
            Proxy.sDefaultImpl = iHonorAudioService;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
            String s4 = ProtectedSandApp.s("嵜\u0001");
            if (i4 == 1) {
                parcel.enforceInterface(s4);
                List supportedServices = getSupportedServices();
                parcel2.writeNoException();
                parcel2.writeList(supportedServices);
                return true;
            }
            if (i4 == 2) {
                parcel.enforceInterface(s4);
                boolean isServiceSupported = isServiceSupported(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(isServiceSupported ? 1 : 0);
                return true;
            }
            if (i4 != 3) {
                if (i4 != 1598968902) {
                    return super.onTransact(i4, parcel, parcel2, i5);
                }
                parcel2.writeString(s4);
                return true;
            }
            parcel.enforceInterface(s4);
            init(parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            return true;
        }
    }

    List getSupportedServices() throws RemoteException;

    void init(String str, String str2) throws RemoteException;

    boolean isServiceSupported(int i4) throws RemoteException;
}
