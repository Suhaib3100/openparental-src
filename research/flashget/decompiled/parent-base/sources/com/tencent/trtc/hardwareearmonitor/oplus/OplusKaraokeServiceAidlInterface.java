package com.tencent.trtc.hardwareearmonitor.oplus;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.util.LiteavLog;

/* loaded from: classes7.dex */
public interface OplusKaraokeServiceAidlInterface extends IInterface {

    public static class Default implements OplusKaraokeServiceAidlInterface {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.tencent.trtc.hardwareearmonitor.oplus.OplusKaraokeServiceAidlInterface
        public void setActiveClient(String str) throws RemoteException {
        }

        @Override // com.tencent.trtc.hardwareearmonitor.oplus.OplusKaraokeServiceAidlInterface
        public void setHeadsetState(boolean z4) throws RemoteException {
        }

        @Override // com.tencent.trtc.hardwareearmonitor.oplus.OplusKaraokeServiceAidlInterface
        public void setPermitBits(int i4, int i5, int i6, String str) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements OplusKaraokeServiceAidlInterface {
        private static String DESCRIPTOR = ProtectedSandApp.s("嵾\u0001");
        static final int TRANSACTION_setActiveClient = 2;
        static final int TRANSACTION_setHeadsetState = 1;
        static final int TRANSACTION_setPermitBits = 3;

        static class a implements OplusKaraokeServiceAidlInterface {

            /* renamed from: a, reason: collision with root package name */
            public static OplusKaraokeServiceAidlInterface f72796a;

            /* renamed from: b, reason: collision with root package name */
            private IBinder f72797b;

            a(IBinder iBinder) {
                this.f72797b = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f72797b;
            }

            @Override // com.tencent.trtc.hardwareearmonitor.oplus.OplusKaraokeServiceAidlInterface
            public final void setActiveClient(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    boolean transact = this.f72797b.transact(2, obtain, obtain2, 0);
                    if (!transact) {
                        LiteavLog.e(ProtectedSandApp.s("嵺\u0001"), ProtectedSandApp.s("嵻\u0001"));
                    }
                    if (transact || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().setActiveClient(str);
                    }
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.tencent.trtc.hardwareearmonitor.oplus.OplusKaraokeServiceAidlInterface
            public final void setHeadsetState(boolean z4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(z4 ? 1 : 0);
                    boolean transact = this.f72797b.transact(1, obtain, obtain2, 0);
                    if (!transact) {
                        LiteavLog.e(ProtectedSandApp.s("嵼\u0001"), ProtectedSandApp.s("嵽\u0001"));
                    }
                    if (transact || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().setHeadsetState(z4);
                    }
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.tencent.trtc.hardwareearmonitor.oplus.OplusKaraokeServiceAidlInterface
            public final void setPermitBits(int i4, int i5, int i6, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i4);
                    obtain.writeInt(i5);
                    obtain.writeInt(i6);
                    obtain.writeString(str);
                    if (this.f72797b.transact(3, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().setPermitBits(i4, i5, i6, str);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static OplusKaraokeServiceAidlInterface asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof OplusKaraokeServiceAidlInterface)) ? new a(iBinder) : (OplusKaraokeServiceAidlInterface) queryLocalInterface;
        }

        public static OplusKaraokeServiceAidlInterface getDefaultImpl() {
            return a.f72796a;
        }

        public static void setDESCRIPTOR(String str) {
            DESCRIPTOR = str;
        }

        public static boolean setDefaultImpl(OplusKaraokeServiceAidlInterface oplusKaraokeServiceAidlInterface) {
            if (a.f72796a != null) {
                throw new IllegalStateException(ProtectedSandApp.s("嵿\u0001"));
            }
            if (oplusKaraokeServiceAidlInterface == null) {
                return false;
            }
            a.f72796a = oplusKaraokeServiceAidlInterface;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
            String str = DESCRIPTOR;
            if (i4 == 1) {
                parcel.enforceInterface(str);
                setHeadsetState(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            }
            if (i4 == 2) {
                parcel.enforceInterface(str);
                setActiveClient(parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            if (i4 != 3) {
                if (i4 != 1598968902) {
                    return super.onTransact(i4, parcel, parcel2, i5);
                }
                parcel2.writeString(str);
                return true;
            }
            parcel.enforceInterface(str);
            setPermitBits(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString());
            parcel2.writeNoException();
            return true;
        }
    }

    void setActiveClient(String str) throws RemoteException;

    void setHeadsetState(boolean z4) throws RemoteException;

    void setPermitBits(int i4, int i5, int i6, String str) throws RemoteException;
}
