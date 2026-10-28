package androidx.core.app.unusedapprestrictions;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.c1;

/* compiled from: IUnusedAppRestrictionsBackportCallback.java */
@c1({c1.a.LIBRARY})
/* loaded from: classes3.dex */
public interface a extends IInterface {

    /* renamed from: c, reason: collision with root package name */
    public static final String f25907c = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportCallback".replace('$', '.');

    /* compiled from: IUnusedAppRestrictionsBackportCallback.java */
    /* renamed from: androidx.core.app.unusedapprestrictions.a$a, reason: collision with other inner class name */
    public static class C0407a implements a {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.core.app.unusedapprestrictions.a
        public void m(boolean z4, boolean z5) throws RemoteException {
        }
    }

    /* compiled from: IUnusedAppRestrictionsBackportCallback.java */
    public static abstract class b extends Binder implements a {

        /* renamed from: a, reason: collision with root package name */
        static final int f25908a = 1;

        /* compiled from: IUnusedAppRestrictionsBackportCallback.java */
        /* renamed from: androidx.core.app.unusedapprestrictions.a$b$a, reason: collision with other inner class name */
        private static class C0408a implements a {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f25909a;

            C0408a(IBinder iBinder) {
                this.f25909a = iBinder;
            }

            public String E() {
                return a.f25907c;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f25909a;
            }

            @Override // androidx.core.app.unusedapprestrictions.a
            public void m(boolean z4, boolean z5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f25907c);
                    obtain.writeInt(z4 ? 1 : 0);
                    obtain.writeInt(z5 ? 1 : 0);
                    this.f25909a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, a.f25907c);
        }

        public static a E(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(a.f25907c);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0408a(iBinder) : (a) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
            String str = a.f25907c;
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
            m(parcel.readInt() != 0, parcel.readInt() != 0);
            return true;
        }
    }

    void m(boolean z4, boolean z5) throws RemoteException;
}
