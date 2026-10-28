package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: IWorkManagerImplCallback.java */
/* loaded from: classes3.dex */
public interface c extends IInterface {

    /* compiled from: IWorkManagerImplCallback.java */
    public static class a implements c {
        @Override // androidx.work.multiprocess.c
        public void A(byte[] response) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.work.multiprocess.c
        public void w(String error) throws RemoteException {
        }
    }

    /* compiled from: IWorkManagerImplCallback.java */
    public static abstract class b extends Binder implements c {

        /* renamed from: a, reason: collision with root package name */
        private static final String f36597a = "androidx.work.multiprocess.IWorkManagerImplCallback";

        /* renamed from: b, reason: collision with root package name */
        static final int f36598b = 1;

        /* renamed from: h, reason: collision with root package name */
        static final int f36599h = 2;

        /* compiled from: IWorkManagerImplCallback.java */
        private static class a implements c {

            /* renamed from: b, reason: collision with root package name */
            public static c f36600b;

            /* renamed from: a, reason: collision with root package name */
            private IBinder f36601a;

            a(IBinder remote) {
                this.f36601a = remote;
            }

            @Override // androidx.work.multiprocess.c
            public void A(byte[] response) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImplCallback");
                    obtain.writeByteArray(response);
                    if (this.f36601a.transact(1, obtain, null, 1) || b.F() == null) {
                        return;
                    }
                    f36600b.A(response);
                } finally {
                    obtain.recycle();
                }
            }

            public String E() {
                return "androidx.work.multiprocess.IWorkManagerImplCallback";
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f36601a;
            }

            @Override // androidx.work.multiprocess.c
            public void w(String error) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImplCallback");
                    obtain.writeString(error);
                    if (this.f36601a.transact(2, obtain, null, 1) || b.F() == null) {
                        return;
                    }
                    f36600b.w(error);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, "androidx.work.multiprocess.IWorkManagerImplCallback");
        }

        public static c E(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface queryLocalInterface = obj.queryLocalInterface("androidx.work.multiprocess.IWorkManagerImplCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof c)) ? new a(obj) : (c) queryLocalInterface;
        }

        public static c F() {
            return a.f36600b;
        }

        public static boolean G(c impl) {
            if (a.f36600b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (impl == null) {
                return false;
            }
            a.f36600b = impl;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            if (code == 1) {
                data.enforceInterface("androidx.work.multiprocess.IWorkManagerImplCallback");
                A(data.createByteArray());
                return true;
            }
            if (code == 2) {
                data.enforceInterface("androidx.work.multiprocess.IWorkManagerImplCallback");
                w(data.readString());
                return true;
            }
            if (code != 1598968902) {
                return super.onTransact(code, data, reply, flags);
            }
            reply.writeString("androidx.work.multiprocess.IWorkManagerImplCallback");
            return true;
        }
    }

    void A(byte[] response) throws RemoteException;

    void w(String error) throws RemoteException;
}
