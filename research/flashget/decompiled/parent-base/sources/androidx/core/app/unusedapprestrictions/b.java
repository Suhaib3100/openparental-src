package androidx.core.app.unusedapprestrictions;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.c1;
import androidx.core.app.unusedapprestrictions.a;

/* compiled from: IUnusedAppRestrictionsBackportService.java */
@c1({c1.a.LIBRARY})
/* loaded from: classes3.dex */
public interface b extends IInterface {

    /* renamed from: d, reason: collision with root package name */
    public static final String f25910d = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportService".replace('$', '.');

    /* compiled from: IUnusedAppRestrictionsBackportService.java */
    public static class a implements b {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.core.app.unusedapprestrictions.b
        public void s(androidx.core.app.unusedapprestrictions.a aVar) throws RemoteException {
        }
    }

    /* compiled from: IUnusedAppRestrictionsBackportService.java */
    /* renamed from: androidx.core.app.unusedapprestrictions.b$b, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0409b extends Binder implements b {

        /* renamed from: a, reason: collision with root package name */
        static final int f25911a = 1;

        /* compiled from: IUnusedAppRestrictionsBackportService.java */
        /* renamed from: androidx.core.app.unusedapprestrictions.b$b$a */
        private static class a implements b {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f25912a;

            a(IBinder iBinder) {
                this.f25912a = iBinder;
            }

            public String E() {
                return b.f25910d;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f25912a;
            }

            @Override // androidx.core.app.unusedapprestrictions.b
            public void s(androidx.core.app.unusedapprestrictions.a aVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f25910d);
                    obtain.writeStrongInterface(aVar);
                    this.f25912a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC0409b() {
            attachInterface(this, b.f25910d);
        }

        public static b E(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(b.f25910d);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof b)) ? new a(iBinder) : (b) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
            String str = b.f25910d;
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
            s(a.b.E(parcel.readStrongBinder()));
            return true;
        }
    }

    void s(androidx.core.app.unusedapprestrictions.a aVar) throws RemoteException;
}
