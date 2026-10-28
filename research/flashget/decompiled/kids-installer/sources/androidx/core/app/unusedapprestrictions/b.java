package androidx.core.app.unusedapprestrictions;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.core.app.unusedapprestrictions.a;

/* compiled from: IUnusedAppRestrictionsBackportService.java */
/* loaded from: classes.dex */
public interface b extends IInterface {

    /* compiled from: IUnusedAppRestrictionsBackportService.java */
    /* loaded from: classes3.dex */
    public static class a implements b {
        @Override // androidx.core.app.unusedapprestrictions.b
        public void a(androidx.core.app.unusedapprestrictions.a aVar) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    /* compiled from: IUnusedAppRestrictionsBackportService.java */
    /* renamed from: androidx.core.app.unusedapprestrictions.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static abstract class AbstractBinderC0031b extends Binder implements b {

        /* renamed from: a, reason: collision with root package name */
        private static final String f4232a = "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService";

        /* renamed from: b, reason: collision with root package name */
        static final int f4233b = 1;

        /* compiled from: IUnusedAppRestrictionsBackportService.java */
        /* renamed from: androidx.core.app.unusedapprestrictions.b$b$a */
        private static class a implements b {

            /* renamed from: b, reason: collision with root package name */
            public static b f4234b;

            /* renamed from: a, reason: collision with root package name */
            private IBinder f4235a;

            a(IBinder iBinder) {
                this.f4235a = iBinder;
            }

            @Override // androidx.core.app.unusedapprestrictions.b
            public void a(androidx.core.app.unusedapprestrictions.a aVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    if (this.f4235a.transact(1, obtain, null, 1) || AbstractBinderC0031b.e() == null) {
                        return;
                    }
                    f4234b.a(aVar);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4235a;
            }

            public String d() {
                return "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService";
            }
        }

        public AbstractBinderC0031b() {
            attachInterface(this, "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
        }

        public static b d(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof b)) ? new a(iBinder) : (b) queryLocalInterface;
        }

        public static b e() {
            return a.f4234b;
        }

        public static boolean f(b bVar) {
            if (a.f4234b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (bVar == null) {
                return false;
            }
            a.f4234b = bVar;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i5, Parcel parcel, Parcel parcel2, int i6) throws RemoteException {
            if (i5 == 1) {
                parcel.enforceInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
                a(a.b.d(parcel.readStrongBinder()));
                return true;
            }
            if (i5 != 1598968902) {
                return super.onTransact(i5, parcel, parcel2, i6);
            }
            parcel2.writeString("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
            return true;
        }
    }

    void a(androidx.core.app.unusedapprestrictions.a aVar) throws RemoteException;
}
