package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.work.multiprocess.c;

/* compiled from: IListenableWorkerImpl.java */
/* loaded from: classes3.dex */
public interface a extends IInterface {

    /* compiled from: IListenableWorkerImpl.java */
    /* renamed from: androidx.work.multiprocess.a$a, reason: collision with other inner class name */
    public static class C0647a implements a {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.work.multiprocess.a
        public void g(byte[] request, c callback) throws RemoteException {
        }

        @Override // androidx.work.multiprocess.a
        public void z(byte[] request, c callback) throws RemoteException {
        }
    }

    /* compiled from: IListenableWorkerImpl.java */
    public static abstract class b extends Binder implements a {

        /* renamed from: a, reason: collision with root package name */
        private static final String f36581a = "androidx.work.multiprocess.IListenableWorkerImpl";

        /* renamed from: b, reason: collision with root package name */
        static final int f36582b = 1;

        /* renamed from: h, reason: collision with root package name */
        static final int f36583h = 2;

        /* compiled from: IListenableWorkerImpl.java */
        /* renamed from: androidx.work.multiprocess.a$b$a, reason: collision with other inner class name */
        private static class C0648a implements a {

            /* renamed from: b, reason: collision with root package name */
            public static a f36584b;

            /* renamed from: a, reason: collision with root package name */
            private IBinder f36585a;

            C0648a(IBinder remote) {
                this.f36585a = remote;
            }

            public String E() {
                return "androidx.work.multiprocess.IListenableWorkerImpl";
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f36585a;
            }

            @Override // androidx.work.multiprocess.a
            public void g(byte[] request, c callback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.work.multiprocess.IListenableWorkerImpl");
                    obtain.writeByteArray(request);
                    obtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.f36585a.transact(1, obtain, null, 1) || b.F() == null) {
                        obtain.recycle();
                    } else {
                        f36584b.g(request, callback);
                        obtain.recycle();
                    }
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.work.multiprocess.a
            public void z(byte[] request, c callback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.work.multiprocess.IListenableWorkerImpl");
                    obtain.writeByteArray(request);
                    obtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.f36585a.transact(2, obtain, null, 1) || b.F() == null) {
                        obtain.recycle();
                    } else {
                        f36584b.z(request, callback);
                        obtain.recycle();
                    }
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            }
        }

        public b() {
            attachInterface(this, "androidx.work.multiprocess.IListenableWorkerImpl");
        }

        public static a E(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface queryLocalInterface = obj.queryLocalInterface("androidx.work.multiprocess.IListenableWorkerImpl");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0648a(obj) : (a) queryLocalInterface;
        }

        public static a F() {
            return C0648a.f36584b;
        }

        public static boolean G(a impl) {
            if (C0648a.f36584b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (impl == null) {
                return false;
            }
            C0648a.f36584b = impl;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            if (code == 1) {
                data.enforceInterface("androidx.work.multiprocess.IListenableWorkerImpl");
                g(data.createByteArray(), c.b.E(data.readStrongBinder()));
                return true;
            }
            if (code == 2) {
                data.enforceInterface("androidx.work.multiprocess.IListenableWorkerImpl");
                z(data.createByteArray(), c.b.E(data.readStrongBinder()));
                return true;
            }
            if (code != 1598968902) {
                return super.onTransact(code, data, reply, flags);
            }
            reply.writeString("androidx.work.multiprocess.IListenableWorkerImpl");
            return true;
        }
    }

    void g(byte[] request, c callback) throws RemoteException;

    void z(byte[] request, c callback) throws RemoteException;
}
