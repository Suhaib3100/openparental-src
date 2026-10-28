package repeackage.com.google.android.gms.ads.identifier.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: IAdvertisingIdService.java */
/* loaded from: classes5.dex */
public interface a extends IInterface {

    /* compiled from: IAdvertisingIdService.java */
    /* renamed from: repeackage.com.google.android.gms.ads.identifier.internal.a$a, reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C0503a implements a {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // repeackage.com.google.android.gms.ads.identifier.internal.a
        public boolean b(boolean boo) throws RemoteException {
            return false;
        }

        @Override // repeackage.com.google.android.gms.ads.identifier.internal.a
        public String getId() throws RemoteException {
            return null;
        }
    }

    /* compiled from: IAdvertisingIdService.java */
    /* loaded from: classes6.dex */
    public static abstract class b extends Binder implements a {

        /* renamed from: a, reason: collision with root package name */
        private static final String f32953a = ProtectedSandApp.s("鏦");

        /* renamed from: b, reason: collision with root package name */
        static final int f32954b = 1;

        /* renamed from: c, reason: collision with root package name */
        static final int f32955c = 2;

        /* compiled from: IAdvertisingIdService.java */
        /* renamed from: repeackage.com.google.android.gms.ads.identifier.internal.a$b$a, reason: collision with other inner class name */
        private static class C0504a implements a {

            /* renamed from: b, reason: collision with root package name */
            public static a f32956b;

            /* renamed from: a, reason: collision with root package name */
            private IBinder f32957a;

            C0504a(IBinder remote) {
                this.f32957a = remote;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f32957a;
            }

            @Override // repeackage.com.google.android.gms.ads.identifier.internal.a
            public boolean b(boolean boo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ProtectedSandApp.s("鏟"));
                    obtain.writeInt(boo ? 1 : 0);
                    if (!this.f32957a.transact(2, obtain, obtain2, 0) && b.e() != null) {
                        return f32956b.b(boo);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String d() {
                return ProtectedSandApp.s("鏠");
            }

            @Override // repeackage.com.google.android.gms.ads.identifier.internal.a
            public String getId() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ProtectedSandApp.s("鏡"));
                    if (!this.f32957a.transact(1, obtain, obtain2, 0) && b.e() != null) {
                        return f32956b.getId();
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, ProtectedSandApp.s("鏢"));
        }

        public static a d(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface queryLocalInterface = obj.queryLocalInterface(ProtectedSandApp.s("鏣"));
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0504a(obj) : (a) queryLocalInterface;
        }

        public static a e() {
            return C0504a.f32956b;
        }

        public static boolean f(a impl) {
            if (C0504a.f32956b != null) {
                throw new IllegalStateException(ProtectedSandApp.s("鏤"));
            }
            if (impl == null) {
                return false;
            }
            C0504a.f32956b = impl;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i5, Parcel parcel, Parcel parcel2, int i6) throws RemoteException {
            String s5 = ProtectedSandApp.s("鏥");
            if (i5 == 1) {
                parcel.enforceInterface(s5);
                String id = getId();
                parcel2.writeNoException();
                parcel2.writeString(id);
                return true;
            }
            if (i5 != 2) {
                if (i5 != 1598968902) {
                    return super.onTransact(i5, parcel, parcel2, i6);
                }
                parcel2.writeString(s5);
                return true;
            }
            parcel.enforceInterface(s5);
            boolean b6 = b(parcel.readInt() != 0);
            parcel2.writeNoException();
            parcel2.writeInt(b6 ? 1 : 0);
            return true;
        }
    }

    boolean b(boolean boo) throws RemoteException;

    String getId() throws RemoteException;
}
