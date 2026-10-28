package repeackage.com.google.android.gms.ads.identifier.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: IAdvertisingIdService.java */
/* loaded from: classes9.dex */
public interface a extends IInterface {

    /* compiled from: IAdvertisingIdService.java */
    /* renamed from: repeackage.com.google.android.gms.ads.identifier.internal.a$a, reason: collision with other inner class name */
    public static class C1385a implements a {
        @Override // repeackage.com.google.android.gms.ads.identifier.internal.a
        public String a() throws RemoteException {
            return null;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // repeackage.com.google.android.gms.ads.identifier.internal.a
        public boolean b(boolean boo) throws RemoteException {
            return false;
        }
    }

    /* compiled from: IAdvertisingIdService.java */
    public static abstract class b extends Binder implements a {

        /* renamed from: a, reason: collision with root package name */
        private static final String f89869a = ProtectedSandApp.s("ꖍ\u0001");

        /* renamed from: b, reason: collision with root package name */
        static final int f89870b = 1;

        /* renamed from: h, reason: collision with root package name */
        static final int f89871h = 2;

        /* compiled from: IAdvertisingIdService.java */
        /* renamed from: repeackage.com.google.android.gms.ads.identifier.internal.a$b$a, reason: collision with other inner class name */
        private static class C1386a implements a {

            /* renamed from: b, reason: collision with root package name */
            public static a f89872b;

            /* renamed from: a, reason: collision with root package name */
            private IBinder f89873a;

            C1386a(IBinder remote) {
                this.f89873a = remote;
            }

            public String E() {
                return ProtectedSandApp.s("ꖌ\u0001");
            }

            @Override // repeackage.com.google.android.gms.ads.identifier.internal.a
            public String a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ProtectedSandApp.s("ꖌ\u0001"));
                    if (!this.f89873a.transact(1, obtain, obtain2, 0) && b.F() != null) {
                        return f89872b.a();
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f89873a;
            }

            @Override // repeackage.com.google.android.gms.ads.identifier.internal.a
            public boolean b(boolean z4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ProtectedSandApp.s("ꖌ\u0001"));
                    obtain.writeInt(z4 ? 1 : 0);
                    if (!this.f89873a.transact(2, obtain, obtain2, 0) && b.F() != null) {
                        return f89872b.b(z4);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, ProtectedSandApp.s("ꖍ\u0001"));
        }

        public static a E(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface queryLocalInterface = obj.queryLocalInterface(ProtectedSandApp.s("ꖍ\u0001"));
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C1386a(obj) : (a) queryLocalInterface;
        }

        public static a F() {
            return C1386a.f89872b;
        }

        public static boolean G(a impl) {
            if (C1386a.f89872b != null) {
                throw new IllegalStateException(ProtectedSandApp.s("ꖎ\u0001"));
            }
            if (impl == null) {
                return false;
            }
            C1386a.f89872b = impl;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
            String s4 = ProtectedSandApp.s("ꖍ\u0001");
            if (i4 == 1) {
                parcel.enforceInterface(s4);
                String a5 = a();
                parcel2.writeNoException();
                parcel2.writeString(a5);
                return true;
            }
            if (i4 != 2) {
                if (i4 != 1598968902) {
                    return super.onTransact(i4, parcel, parcel2, i5);
                }
                parcel2.writeString(s4);
                return true;
            }
            parcel.enforceInterface(s4);
            boolean b5 = b(parcel.readInt() != 0);
            parcel2.writeNoException();
            parcel2.writeInt(b5 ? 1 : 0);
            return true;
        }
    }

    String a() throws RemoteException;

    boolean b(boolean boo) throws RemoteException;
}
