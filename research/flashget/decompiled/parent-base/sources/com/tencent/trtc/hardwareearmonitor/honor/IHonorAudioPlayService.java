package com.tencent.trtc.hardwareearmonitor.honor;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes7.dex */
public interface IHonorAudioPlayService extends IInterface {

    public static class Default implements IHonorAudioPlayService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioPlayService
        public void destroy() throws RemoteException {
        }

        @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioPlayService
        public void enableHighSampleRatePlay(boolean z4) throws RemoteException {
        }

        @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioPlayService
        public void init(String str) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IHonorAudioPlayService {
        private static final String DESCRIPTOR = ProtectedSandApp.s("嵙\u0001");
        static final int TRANSACTION_destroy = 3;
        static final int TRANSACTION_enableHighSampleRatePlay = 2;
        static final int TRANSACTION_init = 1;

        public static class Proxy implements IHonorAudioPlayService {
            public static IHonorAudioPlayService sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioPlayService
            public void destroy() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ProtectedSandApp.s("嵘\u0001"));
                    if (this.mRemote.transact(3, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                    } else {
                        Stub.getDefaultImpl().destroy();
                        obtain2.recycle();
                        obtain.recycle();
                    }
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioPlayService
            public void enableHighSampleRatePlay(boolean z4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ProtectedSandApp.s("嵘\u0001"));
                    obtain.writeInt(z4 ? 1 : 0);
                    if (this.mRemote.transact(2, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                    } else {
                        Stub.getDefaultImpl().enableHighSampleRatePlay(z4);
                        obtain2.recycle();
                        obtain.recycle();
                    }
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            public String getInterfaceDescriptor() {
                return ProtectedSandApp.s("嵘\u0001");
            }

            @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioPlayService
            public void init(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ProtectedSandApp.s("嵘\u0001"));
                    obtain.writeString(str);
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                    } else {
                        Stub.getDefaultImpl().init(str);
                        obtain2.recycle();
                        obtain.recycle();
                    }
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }
        }

        public Stub() {
            attachInterface(this, ProtectedSandApp.s("嵙\u0001"));
        }

        public static IHonorAudioPlayService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(ProtectedSandApp.s("嵙\u0001"));
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IHonorAudioPlayService)) ? new Proxy(iBinder) : (IHonorAudioPlayService) queryLocalInterface;
        }

        public static IHonorAudioPlayService getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IHonorAudioPlayService iHonorAudioPlayService) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException(ProtectedSandApp.s("嵚\u0001"));
            }
            if (iHonorAudioPlayService == null) {
                return false;
            }
            Proxy.sDefaultImpl = iHonorAudioPlayService;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
            String s4 = ProtectedSandApp.s("嵙\u0001");
            if (i4 == 1) {
                parcel.enforceInterface(s4);
                init(parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            if (i4 == 2) {
                parcel.enforceInterface(s4);
                enableHighSampleRatePlay(parcel.readInt() != 0);
                parcel2.writeNoException();
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
            destroy();
            parcel2.writeNoException();
            return true;
        }
    }

    void destroy() throws RemoteException;

    void enableHighSampleRatePlay(boolean z4) throws RemoteException;

    void init(String str) throws RemoteException;
}
