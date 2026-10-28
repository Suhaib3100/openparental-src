package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.c1;
import androidx.room.e0;

/* compiled from: IMultiInstanceInvalidationService.java */
@androidx.annotation.c1({c1.a.LIBRARY})
/* loaded from: classes3.dex */
public interface f0 extends IInterface {

    /* renamed from: f, reason: collision with root package name */
    public static final String f33671f = "androidx$room$IMultiInstanceInvalidationService".replace('$', '.');

    /* compiled from: IMultiInstanceInvalidationService.java */
    public static class a implements f0 {
        @Override // androidx.room.f0
        public void D(e0 e0Var, int i4) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.room.f0
        public void n(int i4, String[] strArr) throws RemoteException {
        }

        @Override // androidx.room.f0
        public int r(e0 e0Var, String str) throws RemoteException {
            return 0;
        }
    }

    /* compiled from: IMultiInstanceInvalidationService.java */
    public static abstract class b extends Binder implements f0 {

        /* renamed from: a, reason: collision with root package name */
        static final int f33672a = 1;

        /* renamed from: b, reason: collision with root package name */
        static final int f33673b = 2;

        /* renamed from: h, reason: collision with root package name */
        static final int f33674h = 3;

        /* compiled from: IMultiInstanceInvalidationService.java */
        private static class a implements f0 {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f33675a;

            a(IBinder iBinder) {
                this.f33675a = iBinder;
            }

            @Override // androidx.room.f0
            public void D(e0 e0Var, int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(f0.f33671f);
                    obtain.writeStrongInterface(e0Var);
                    obtain.writeInt(i4);
                    this.f33675a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String E() {
                return f0.f33671f;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f33675a;
            }

            @Override // androidx.room.f0
            public void n(int i4, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(f0.f33671f);
                    obtain.writeInt(i4);
                    obtain.writeStringArray(strArr);
                    this.f33675a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.room.f0
            public int r(e0 e0Var, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(f0.f33671f);
                    obtain.writeStrongInterface(e0Var);
                    obtain.writeString(str);
                    this.f33675a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, f0.f33671f);
        }

        public static f0 E(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f0.f33671f);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof f0)) ? new a(iBinder) : (f0) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
            String str = f0.f33671f;
            if (i4 >= 1 && i4 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i4 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i4 == 1) {
                int r4 = r(e0.b.E(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(r4);
            } else if (i4 == 2) {
                D(e0.b.E(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
            } else {
                if (i4 != 3) {
                    return super.onTransact(i4, parcel, parcel2, i5);
                }
                n(parcel.readInt(), parcel.createStringArray());
            }
            return true;
        }
    }

    void D(e0 e0Var, int i4) throws RemoteException;

    void n(int i4, String[] strArr) throws RemoteException;

    int r(e0 e0Var, String str) throws RemoteException;
}
