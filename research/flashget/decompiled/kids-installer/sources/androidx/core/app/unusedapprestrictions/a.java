package androidx.core.app.unusedapprestrictions;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: IUnusedAppRestrictionsBackportCallback.java */
/* loaded from: classes.dex */
public interface a extends IInterface {

    /* compiled from: IUnusedAppRestrictionsBackportCallback.java */
    /* renamed from: androidx.core.app.unusedapprestrictions.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0029a implements a {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.core.app.unusedapprestrictions.a
        public void c(boolean z5, boolean z6) throws RemoteException {
        }
    }

    /* compiled from: IUnusedAppRestrictionsBackportCallback.java */
    /* loaded from: classes3.dex */
    public static abstract class b extends Binder implements a {

        /* renamed from: a, reason: collision with root package name */
        private static final String f4228a = "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback";

        /* renamed from: b, reason: collision with root package name */
        static final int f4229b = 1;

        /* compiled from: IUnusedAppRestrictionsBackportCallback.java */
        /* renamed from: androidx.core.app.unusedapprestrictions.a$b$a, reason: collision with other inner class name */
        private static class C0030a implements a {

            /* renamed from: b, reason: collision with root package name */
            public static a f4230b;

            /* renamed from: a, reason: collision with root package name */
            private IBinder f4231a;

            C0030a(IBinder iBinder) {
                this.f4231a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4231a;
            }

            @Override // androidx.core.app.unusedapprestrictions.a
            public void c(boolean z5, boolean z6) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback");
                    obtain.writeInt(z5 ? 1 : 0);
                    obtain.writeInt(z6 ? 1 : 0);
                    if (this.f4231a.transact(1, obtain, null, 1) || b.e() == null) {
                        return;
                    }
                    f4230b.c(z5, z6);
                } finally {
                    obtain.recycle();
                }
            }

            public String d() {
                return "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback";
            }
        }

        public b() {
            attachInterface(this, "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback");
        }

        public static a d(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0030a(iBinder) : (a) queryLocalInterface;
        }

        public static a e() {
            return C0030a.f4230b;
        }

        public static boolean f(a aVar) {
            if (C0030a.f4230b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (aVar == null) {
                return false;
            }
            C0030a.f4230b = aVar;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i5, Parcel parcel, Parcel parcel2, int i6) throws RemoteException {
            if (i5 == 1) {
                parcel.enforceInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback");
                c(parcel.readInt() != 0, parcel.readInt() != 0);
                return true;
            }
            if (i5 != 1598968902) {
                return super.onTransact(i5, parcel, parcel2, i6);
            }
            parcel2.writeString("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback");
            return true;
        }
    }

    void c(boolean z5, boolean z6) throws RemoteException;
}
