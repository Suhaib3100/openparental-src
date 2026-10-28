package android.net;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface IConnectivityManager extends IInterface {

    public static class Default implements IConnectivityManager {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.net.IConnectivityManager
        public int getLastTetherError(String str) throws RemoteException {
            return 0;
        }

        @Override // android.net.IConnectivityManager
        public boolean getMobileDataEnabled() throws RemoteException {
            return false;
        }

        @Override // android.net.IConnectivityManager
        public int getNetworkPreference() throws RemoteException {
            return 0;
        }

        @Override // android.net.IConnectivityManager
        public String[] getTetherableBluetoothRegexs() throws RemoteException {
            return null;
        }

        @Override // android.net.IConnectivityManager
        public String[] getTetherableIfaces() throws RemoteException {
            return null;
        }

        @Override // android.net.IConnectivityManager
        public String[] getTetherableUsbRegexs() throws RemoteException {
            return null;
        }

        @Override // android.net.IConnectivityManager
        public String[] getTetherableWifiRegexs() throws RemoteException {
            return null;
        }

        @Override // android.net.IConnectivityManager
        public String[] getTetheredIfacePairs() throws RemoteException {
            return null;
        }

        @Override // android.net.IConnectivityManager
        public String[] getTetheredIfaces() throws RemoteException {
            return null;
        }

        @Override // android.net.IConnectivityManager
        public String[] getTetheringErroredIfaces() throws RemoteException {
            return null;
        }

        @Override // android.net.IConnectivityManager
        public boolean isNetworkSupported(int i4) throws RemoteException {
            return false;
        }

        @Override // android.net.IConnectivityManager
        public boolean isTetheringSupported() throws RemoteException {
            return false;
        }

        @Override // android.net.IConnectivityManager
        public boolean prepareVpn(String str, String str2) throws RemoteException {
            return false;
        }

        @Override // android.net.IConnectivityManager
        public boolean protectVpn(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
            return false;
        }

        @Override // android.net.IConnectivityManager
        public void reportInetCondition(int i4, int i5) throws RemoteException {
        }

        @Override // android.net.IConnectivityManager
        public void requestNetworkTransitionWakelock(String str) throws RemoteException {
        }

        @Override // android.net.IConnectivityManager
        public boolean requestRouteToHost(int i4, int i5) throws RemoteException {
            return false;
        }

        @Override // android.net.IConnectivityManager
        public boolean requestRouteToHostAddress(int i4, byte[] bArr) throws RemoteException {
            return false;
        }

        @Override // android.net.IConnectivityManager
        public void setDataDependency(int i4, boolean z4) throws RemoteException {
        }

        @Override // android.net.IConnectivityManager
        public void setMobileDataEnabled(boolean z4) throws RemoteException {
        }

        @Override // android.net.IConnectivityManager
        public void setNetworkPreference(int i4) throws RemoteException {
        }

        @Override // android.net.IConnectivityManager
        public void setPolicyDataEnable(int i4, boolean z4) throws RemoteException {
        }

        @Override // android.net.IConnectivityManager
        public boolean setRadio(int i4, boolean z4) throws RemoteException {
            return false;
        }

        @Override // android.net.IConnectivityManager
        public boolean setRadios(boolean z4) throws RemoteException {
            return false;
        }

        @Override // android.net.IConnectivityManager
        public int setUsbTethering(boolean z4) throws RemoteException {
            return 0;
        }

        @Override // android.net.IConnectivityManager
        public int startUsingNetworkFeature(int i4, String str, IBinder iBinder) throws RemoteException {
            return 0;
        }

        @Override // android.net.IConnectivityManager
        public int stopUsingNetworkFeature(int i4, String str) throws RemoteException {
            return 0;
        }

        @Override // android.net.IConnectivityManager
        public int tether(String str) throws RemoteException {
            return 0;
        }

        @Override // android.net.IConnectivityManager
        public int untether(String str) throws RemoteException {
            return 0;
        }
    }

    public static abstract class Stub extends Binder implements IConnectivityManager {
        public static final String DESCRIPTOR = "android.net.IConnectivityManager";
        static final int TRANSACTION_getLastTetherError = 15;
        static final int TRANSACTION_getMobileDataEnabled = 10;
        static final int TRANSACTION_getNetworkPreference = 2;
        static final int TRANSACTION_getTetherableBluetoothRegexs = 23;
        static final int TRANSACTION_getTetherableIfaces = 17;
        static final int TRANSACTION_getTetherableUsbRegexs = 21;
        static final int TRANSACTION_getTetherableWifiRegexs = 22;
        static final int TRANSACTION_getTetheredIfacePairs = 19;
        static final int TRANSACTION_getTetheredIfaces = 18;
        static final int TRANSACTION_getTetheringErroredIfaces = 20;
        static final int TRANSACTION_isNetworkSupported = 3;
        static final int TRANSACTION_isTetheringSupported = 16;
        static final int TRANSACTION_prepareVpn = 29;
        static final int TRANSACTION_protectVpn = 28;
        static final int TRANSACTION_reportInetCondition = 26;
        static final int TRANSACTION_requestNetworkTransitionWakelock = 25;
        static final int TRANSACTION_requestRouteToHost = 8;
        static final int TRANSACTION_requestRouteToHostAddress = 9;
        static final int TRANSACTION_setDataDependency = 27;
        static final int TRANSACTION_setMobileDataEnabled = 11;
        static final int TRANSACTION_setNetworkPreference = 1;
        static final int TRANSACTION_setPolicyDataEnable = 12;
        static final int TRANSACTION_setRadio = 5;
        static final int TRANSACTION_setRadios = 4;
        static final int TRANSACTION_setUsbTethering = 24;
        static final int TRANSACTION_startUsingNetworkFeature = 6;
        static final int TRANSACTION_stopUsingNetworkFeature = 7;
        static final int TRANSACTION_tether = 13;
        static final int TRANSACTION_untether = 14;

        private static class Proxy implements IConnectivityManager {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return "android.net.IConnectivityManager";
            }

            @Override // android.net.IConnectivityManager
            public int getLastTetherError(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.net.IConnectivityManager");
                    obtain.writeString(str);
                    this.mRemote.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.net.IConnectivityManager
            public boolean getMobileDataEnabled() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.net.IConnectivityManager");
                    this.mRemote.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.net.IConnectivityManager
            public int getNetworkPreference() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.net.IConnectivityManager");
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.net.IConnectivityManager
            public String[] getTetherableBluetoothRegexs() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.net.IConnectivityManager");
                    this.mRemote.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createStringArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.net.IConnectivityManager
            public String[] getTetherableIfaces() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.net.IConnectivityManager");
                    this.mRemote.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createStringArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.net.IConnectivityManager
            public String[] getTetherableUsbRegexs() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.net.IConnectivityManager");
                    this.mRemote.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createStringArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.net.IConnectivityManager
            public String[] getTetherableWifiRegexs() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.net.IConnectivityManager");
                    this.mRemote.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createStringArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.net.IConnectivityManager
            public String[] getTetheredIfacePairs() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.net.IConnectivityManager");
                    this.mRemote.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createStringArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.net.IConnectivityManager
            public String[] getTetheredIfaces() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.net.IConnectivityManager");
                    this.mRemote.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createStringArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.net.IConnectivityManager
            public String[] getTetheringErroredIfaces() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.net.IConnectivityManager");
                    this.mRemote.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createStringArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.net.IConnectivityManager
            public boolean isNetworkSupported(int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.net.IConnectivityManager");
                    obtain.writeInt(i4);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.net.IConnectivityManager
            public boolean isTetheringSupported() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.net.IConnectivityManager");
                    this.mRemote.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.net.IConnectivityManager
            public boolean prepareVpn(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.net.IConnectivityManager");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.mRemote.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.net.IConnectivityManager
            public boolean protectVpn(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.net.IConnectivityManager");
                    _Parcel.writeTypedObject(obtain, parcelFileDescriptor, 0);
                    this.mRemote.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.net.IConnectivityManager
            public void reportInetCondition(int i4, int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.net.IConnectivityManager");
                    obtain.writeInt(i4);
                    obtain.writeInt(i5);
                    this.mRemote.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.net.IConnectivityManager
            public void requestNetworkTransitionWakelock(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.net.IConnectivityManager");
                    obtain.writeString(str);
                    this.mRemote.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.net.IConnectivityManager
            public boolean requestRouteToHost(int i4, int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.net.IConnectivityManager");
                    obtain.writeInt(i4);
                    obtain.writeInt(i5);
                    this.mRemote.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.net.IConnectivityManager
            public boolean requestRouteToHostAddress(int i4, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.net.IConnectivityManager");
                    obtain.writeInt(i4);
                    obtain.writeByteArray(bArr);
                    this.mRemote.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.net.IConnectivityManager
            public void setDataDependency(int i4, boolean z4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.net.IConnectivityManager");
                    obtain.writeInt(i4);
                    obtain.writeInt(z4 ? 1 : 0);
                    this.mRemote.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.net.IConnectivityManager
            public void setMobileDataEnabled(boolean z4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.net.IConnectivityManager");
                    obtain.writeInt(z4 ? 1 : 0);
                    this.mRemote.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.net.IConnectivityManager
            public void setNetworkPreference(int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.net.IConnectivityManager");
                    obtain.writeInt(i4);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.net.IConnectivityManager
            public void setPolicyDataEnable(int i4, boolean z4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.net.IConnectivityManager");
                    obtain.writeInt(i4);
                    obtain.writeInt(z4 ? 1 : 0);
                    this.mRemote.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.net.IConnectivityManager
            public boolean setRadio(int i4, boolean z4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.net.IConnectivityManager");
                    obtain.writeInt(i4);
                    obtain.writeInt(z4 ? 1 : 0);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.net.IConnectivityManager
            public boolean setRadios(boolean z4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.net.IConnectivityManager");
                    obtain.writeInt(z4 ? 1 : 0);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.net.IConnectivityManager
            public int setUsbTethering(boolean z4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.net.IConnectivityManager");
                    obtain.writeInt(z4 ? 1 : 0);
                    this.mRemote.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.net.IConnectivityManager
            public int startUsingNetworkFeature(int i4, String str, IBinder iBinder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.net.IConnectivityManager");
                    obtain.writeInt(i4);
                    obtain.writeString(str);
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.net.IConnectivityManager
            public int stopUsingNetworkFeature(int i4, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.net.IConnectivityManager");
                    obtain.writeInt(i4);
                    obtain.writeString(str);
                    this.mRemote.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.net.IConnectivityManager
            public int tether(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.net.IConnectivityManager");
                    obtain.writeString(str);
                    this.mRemote.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.net.IConnectivityManager
            public int untether(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.net.IConnectivityManager");
                    obtain.writeString(str);
                    this.mRemote.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "android.net.IConnectivityManager");
        }

        public static IConnectivityManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.net.IConnectivityManager");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IConnectivityManager)) ? new Proxy(iBinder) : (IConnectivityManager) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
            if (i4 >= 1 && i4 <= 16777215) {
                parcel.enforceInterface("android.net.IConnectivityManager");
            }
            if (i4 == 1598968902) {
                parcel2.writeString("android.net.IConnectivityManager");
                return true;
            }
            switch (i4) {
                case 1:
                    setNetworkPreference(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 2:
                    int networkPreference = getNetworkPreference();
                    parcel2.writeNoException();
                    parcel2.writeInt(networkPreference);
                    return true;
                case 3:
                    boolean isNetworkSupported = isNetworkSupported(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(isNetworkSupported ? 1 : 0);
                    return true;
                case 4:
                    boolean radios = setRadios(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(radios ? 1 : 0);
                    return true;
                case 5:
                    boolean radio = setRadio(parcel.readInt(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(radio ? 1 : 0);
                    return true;
                case 6:
                    int startUsingNetworkFeature = startUsingNetworkFeature(parcel.readInt(), parcel.readString(), parcel.readStrongBinder());
                    parcel2.writeNoException();
                    parcel2.writeInt(startUsingNetworkFeature);
                    return true;
                case 7:
                    int stopUsingNetworkFeature = stopUsingNetworkFeature(parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(stopUsingNetworkFeature);
                    return true;
                case 8:
                    boolean requestRouteToHost = requestRouteToHost(parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(requestRouteToHost ? 1 : 0);
                    return true;
                case 9:
                    boolean requestRouteToHostAddress = requestRouteToHostAddress(parcel.readInt(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(requestRouteToHostAddress ? 1 : 0);
                    return true;
                case 10:
                    boolean mobileDataEnabled = getMobileDataEnabled();
                    parcel2.writeNoException();
                    parcel2.writeInt(mobileDataEnabled ? 1 : 0);
                    return true;
                case 11:
                    setMobileDataEnabled(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 12:
                    setPolicyDataEnable(parcel.readInt(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 13:
                    int tether = tether(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(tether);
                    return true;
                case 14:
                    int untether = untether(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(untether);
                    return true;
                case 15:
                    int lastTetherError = getLastTetherError(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(lastTetherError);
                    return true;
                case 16:
                    boolean isTetheringSupported = isTetheringSupported();
                    parcel2.writeNoException();
                    parcel2.writeInt(isTetheringSupported ? 1 : 0);
                    return true;
                case 17:
                    String[] tetherableIfaces = getTetherableIfaces();
                    parcel2.writeNoException();
                    parcel2.writeStringArray(tetherableIfaces);
                    return true;
                case 18:
                    String[] tetheredIfaces = getTetheredIfaces();
                    parcel2.writeNoException();
                    parcel2.writeStringArray(tetheredIfaces);
                    return true;
                case 19:
                    String[] tetheredIfacePairs = getTetheredIfacePairs();
                    parcel2.writeNoException();
                    parcel2.writeStringArray(tetheredIfacePairs);
                    return true;
                case 20:
                    String[] tetheringErroredIfaces = getTetheringErroredIfaces();
                    parcel2.writeNoException();
                    parcel2.writeStringArray(tetheringErroredIfaces);
                    return true;
                case 21:
                    String[] tetherableUsbRegexs = getTetherableUsbRegexs();
                    parcel2.writeNoException();
                    parcel2.writeStringArray(tetherableUsbRegexs);
                    return true;
                case 22:
                    String[] tetherableWifiRegexs = getTetherableWifiRegexs();
                    parcel2.writeNoException();
                    parcel2.writeStringArray(tetherableWifiRegexs);
                    return true;
                case 23:
                    String[] tetherableBluetoothRegexs = getTetherableBluetoothRegexs();
                    parcel2.writeNoException();
                    parcel2.writeStringArray(tetherableBluetoothRegexs);
                    return true;
                case 24:
                    int usbTethering = setUsbTethering(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(usbTethering);
                    return true;
                case 25:
                    requestNetworkTransitionWakelock(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 26:
                    reportInetCondition(parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 27:
                    setDataDependency(parcel.readInt(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 28:
                    boolean protectVpn = protectVpn((ParcelFileDescriptor) _Parcel.readTypedObject(parcel, ParcelFileDescriptor.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(protectVpn ? 1 : 0);
                    return true;
                case 29:
                    boolean prepareVpn = prepareVpn(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(prepareVpn ? 1 : 0);
                    return true;
                default:
                    return super.onTransact(i4, parcel, parcel2, i5);
            }
        }
    }

    public static class _Parcel {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T readTypedObject(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void writeTypedObject(Parcel parcel, T t4, int i4) {
            if (t4 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t4.writeToParcel(parcel, i4);
            }
        }
    }

    int getLastTetherError(String str) throws RemoteException;

    boolean getMobileDataEnabled() throws RemoteException;

    int getNetworkPreference() throws RemoteException;

    String[] getTetherableBluetoothRegexs() throws RemoteException;

    String[] getTetherableIfaces() throws RemoteException;

    String[] getTetherableUsbRegexs() throws RemoteException;

    String[] getTetherableWifiRegexs() throws RemoteException;

    String[] getTetheredIfacePairs() throws RemoteException;

    String[] getTetheredIfaces() throws RemoteException;

    String[] getTetheringErroredIfaces() throws RemoteException;

    boolean isNetworkSupported(int i4) throws RemoteException;

    boolean isTetheringSupported() throws RemoteException;

    boolean prepareVpn(String str, String str2) throws RemoteException;

    boolean protectVpn(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException;

    void reportInetCondition(int i4, int i5) throws RemoteException;

    void requestNetworkTransitionWakelock(String str) throws RemoteException;

    boolean requestRouteToHost(int i4, int i5) throws RemoteException;

    boolean requestRouteToHostAddress(int i4, byte[] bArr) throws RemoteException;

    void setDataDependency(int i4, boolean z4) throws RemoteException;

    void setMobileDataEnabled(boolean z4) throws RemoteException;

    void setNetworkPreference(int i4) throws RemoteException;

    void setPolicyDataEnable(int i4, boolean z4) throws RemoteException;

    boolean setRadio(int i4, boolean z4) throws RemoteException;

    boolean setRadios(boolean z4) throws RemoteException;

    int setUsbTethering(boolean z4) throws RemoteException;

    int startUsingNetworkFeature(int i4, String str, IBinder iBinder) throws RemoteException;

    int stopUsingNetworkFeature(int i4, String str) throws RemoteException;

    int tether(String str) throws RemoteException;

    int untether(String str) throws RemoteException;
}
