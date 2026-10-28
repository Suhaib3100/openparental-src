package com.google.android.gms.internal.play_billing;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public class zzav extends Binder implements IInterface {
    private static zzax globalInterceptor;

    protected zzav(String str) {
        attachInterface(this, str);
    }

    static synchronized void installTransactionInterceptorPackagePrivate(zzax zzaxVar) {
        synchronized (zzav.class) {
            if (zzaxVar == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("홰"));
            }
            if (globalInterceptor != null) {
                throw new IllegalStateException(ProtectedSandApp.s("홯"));
            }
            globalInterceptor = zzaxVar;
        }
    }

    private boolean routeToSuperOrEnforceInterface(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
        if (i4 > 16777215) {
            return super.onTransact(i4, parcel, parcel2, i5);
        }
        parcel.enforceInterface(getInterfaceDescriptor());
        return false;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    protected boolean dispatchTransaction(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
        return false;
    }

    protected void enforceNoDataAvail(Parcel parcel) {
        zzax zzaxVar = globalInterceptor;
        if (zzaxVar != null) {
            zzaxVar.zza();
            return;
        }
        int i4 = zzaw.zza;
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException(android.support.v4.media.a.a(ProtectedSandApp.s("홱"), dataAvail));
        }
    }

    @Override // android.os.Binder
    public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
        if (routeToSuperOrEnforceInterface(i4, parcel, parcel2, i5)) {
            return true;
        }
        zzax zzaxVar = globalInterceptor;
        return zzaxVar == null ? dispatchTransaction(i4, parcel, parcel2, i5) : zzaxVar.zzb();
    }
}
