package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.work.multiprocess.c;

/* compiled from: IWorkManagerImpl.java */
/* loaded from: classes3.dex */
public interface b extends IInterface {

    /* compiled from: IWorkManagerImpl.java */
    public static class a implements b {
        @Override // androidx.work.multiprocess.b
        public void C(String tag, c callback) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.work.multiprocess.b
        public void c(String name, c callback) throws RemoteException {
        }

        @Override // androidx.work.multiprocess.b
        public void d(byte[] request, c callback) throws RemoteException {
        }

        @Override // androidx.work.multiprocess.b
        public void f(c callback) throws RemoteException {
        }

        @Override // androidx.work.multiprocess.b
        public void k(String id2, c callback) throws RemoteException {
        }

        @Override // androidx.work.multiprocess.b
        public void o(byte[] request, c callback) throws RemoteException {
        }

        @Override // androidx.work.multiprocess.b
        public void p(byte[] request, c callback) throws RemoteException {
        }

        @Override // androidx.work.multiprocess.b
        public void x(byte[] request, c callback) throws RemoteException {
        }
    }

    /* compiled from: IWorkManagerImpl.java */
    /* renamed from: androidx.work.multiprocess.b$b, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0649b extends Binder implements b {

        /* renamed from: a, reason: collision with root package name */
        private static final String f36586a = "androidx.work.multiprocess.IWorkManagerImpl";

        /* renamed from: b, reason: collision with root package name */
        static final int f36587b = 1;

        /* renamed from: h, reason: collision with root package name */
        static final int f36588h = 2;

        /* renamed from: i, reason: collision with root package name */
        static final int f36589i = 3;

        /* renamed from: j, reason: collision with root package name */
        static final int f36590j = 4;

        /* renamed from: k, reason: collision with root package name */
        static final int f36591k = 5;

        /* renamed from: l, reason: collision with root package name */
        static final int f36592l = 6;

        /* renamed from: m, reason: collision with root package name */
        static final int f36593m = 7;

        /* renamed from: n, reason: collision with root package name */
        static final int f36594n = 8;

        /* compiled from: IWorkManagerImpl.java */
        /* renamed from: androidx.work.multiprocess.b$b$a */
        private static class a implements b {

            /* renamed from: b, reason: collision with root package name */
            public static b f36595b;

            /* renamed from: a, reason: collision with root package name */
            private IBinder f36596a;

            a(IBinder remote) {
                this.f36596a = remote;
            }

            @Override // androidx.work.multiprocess.b
            public void C(String tag, c callback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
                    obtain.writeString(tag);
                    obtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.f36596a.transact(4, obtain, null, 1) || AbstractBinderC0649b.F() == null) {
                        obtain.recycle();
                    } else {
                        f36595b.C(tag, callback);
                        obtain.recycle();
                    }
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            }

            public String E() {
                return "androidx.work.multiprocess.IWorkManagerImpl";
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f36596a;
            }

            @Override // androidx.work.multiprocess.b
            public void c(String name, c callback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
                    obtain.writeString(name);
                    obtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.f36596a.transact(5, obtain, null, 1) || AbstractBinderC0649b.F() == null) {
                        obtain.recycle();
                    } else {
                        f36595b.c(name, callback);
                        obtain.recycle();
                    }
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.work.multiprocess.b
            public void d(byte[] request, c callback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
                    obtain.writeByteArray(request);
                    obtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.f36596a.transact(1, obtain, null, 1) || AbstractBinderC0649b.F() == null) {
                        obtain.recycle();
                    } else {
                        f36595b.d(request, callback);
                        obtain.recycle();
                    }
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.work.multiprocess.b
            public void f(c callback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
                    obtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.f36596a.transact(6, obtain, null, 1) || AbstractBinderC0649b.F() == null) {
                        obtain.recycle();
                    } else {
                        f36595b.f(callback);
                        obtain.recycle();
                    }
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.work.multiprocess.b
            public void k(String id2, c callback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
                    obtain.writeString(id2);
                    obtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.f36596a.transact(3, obtain, null, 1) || AbstractBinderC0649b.F() == null) {
                        obtain.recycle();
                    } else {
                        f36595b.k(id2, callback);
                        obtain.recycle();
                    }
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.work.multiprocess.b
            public void o(byte[] request, c callback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
                    obtain.writeByteArray(request);
                    obtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.f36596a.transact(8, obtain, null, 1) || AbstractBinderC0649b.F() == null) {
                        obtain.recycle();
                    } else {
                        f36595b.o(request, callback);
                        obtain.recycle();
                    }
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.work.multiprocess.b
            public void p(byte[] request, c callback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
                    obtain.writeByteArray(request);
                    obtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.f36596a.transact(2, obtain, null, 1) || AbstractBinderC0649b.F() == null) {
                        obtain.recycle();
                    } else {
                        f36595b.p(request, callback);
                        obtain.recycle();
                    }
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.work.multiprocess.b
            public void x(byte[] request, c callback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
                    obtain.writeByteArray(request);
                    obtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.f36596a.transact(7, obtain, null, 1) || AbstractBinderC0649b.F() == null) {
                        obtain.recycle();
                    } else {
                        f36595b.x(request, callback);
                        obtain.recycle();
                    }
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            }
        }

        public AbstractBinderC0649b() {
            attachInterface(this, "androidx.work.multiprocess.IWorkManagerImpl");
        }

        public static b E(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface queryLocalInterface = obj.queryLocalInterface("androidx.work.multiprocess.IWorkManagerImpl");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof b)) ? new a(obj) : (b) queryLocalInterface;
        }

        public static b F() {
            return a.f36595b;
        }

        public static boolean G(b impl) {
            if (a.f36595b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (impl == null) {
                return false;
            }
            a.f36595b = impl;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            if (code == 1598968902) {
                reply.writeString("androidx.work.multiprocess.IWorkManagerImpl");
                return true;
            }
            switch (code) {
                case 1:
                    data.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                    d(data.createByteArray(), c.b.E(data.readStrongBinder()));
                    return true;
                case 2:
                    data.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                    p(data.createByteArray(), c.b.E(data.readStrongBinder()));
                    return true;
                case 3:
                    data.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                    k(data.readString(), c.b.E(data.readStrongBinder()));
                    return true;
                case 4:
                    data.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                    C(data.readString(), c.b.E(data.readStrongBinder()));
                    return true;
                case 5:
                    data.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                    c(data.readString(), c.b.E(data.readStrongBinder()));
                    return true;
                case 6:
                    data.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                    f(c.b.E(data.readStrongBinder()));
                    return true;
                case 7:
                    data.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                    x(data.createByteArray(), c.b.E(data.readStrongBinder()));
                    return true;
                case 8:
                    data.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                    o(data.createByteArray(), c.b.E(data.readStrongBinder()));
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }
    }

    void C(String tag, c callback) throws RemoteException;

    void c(String name, c callback) throws RemoteException;

    void d(byte[] request, c callback) throws RemoteException;

    void f(c callback) throws RemoteException;

    void k(String id2, c callback) throws RemoteException;

    void o(byte[] request, c callback) throws RemoteException;

    void p(byte[] request, c callback) throws RemoteException;

    void x(byte[] request, c callback) throws RemoteException;
}
