package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.c1;

/* compiled from: IMultiInstanceInvalidationCallback.java */
@androidx.annotation.c1({c1.a.LIBRARY})
/* loaded from: classes3.dex */
public interface e0 extends IInterface {

    /* renamed from: e, reason: collision with root package name */
    public static final String f33657e = "androidx$room$IMultiInstanceInvalidationCallback".replace('$', '.');

    /* compiled from: IMultiInstanceInvalidationCallback.java */
    public static class a implements e0 {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.room.e0
        public void e(String[] strArr) throws RemoteException {
        }
    }

    /* compiled from: IMultiInstanceInvalidationCallback.java */
    public static abstract class b extends Binder implements e0 {

        /* renamed from: a, reason: collision with root package name */
        static final int f33658a = 1;

        /* compiled from: IMultiInstanceInvalidationCallback.java */
        private static class a implements e0 {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f33659a;

            a(IBinder iBinder) {
                this.f33659a = iBinder;
            }

            public String E() {
                return e0.f33657e;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f33659a;
            }

            @Override // androidx.room.e0
            public void e(String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(e0.f33657e);
                    obtain.writeStringArray(strArr);
                    this.f33659a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, e0.f33657e);
        }

        public static e0 E(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(e0.f33657e);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof e0)) ? new a(iBinder) : (e0) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
            String str = e0.f33657e;
            if (i4 >= 1 && i4 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i4 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i4 != 1) {
                return super.onTransact(i4, parcel, parcel2, i5);
            }
            e(parcel.createStringArray());
            return true;
        }
    }

    void e(String[] strArr) throws RemoteException;
}
