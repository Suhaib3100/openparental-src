package com.google.android.gms.internal.measurement;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
/* loaded from: classes5.dex */
public class zzbx extends Binder implements IInterface {
    protected zzbx(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
        boolean z4;
        if (i4 > 16777215) {
            z4 = super.onTransact(i4, parcel, parcel2, i5);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z4 = false;
        }
        if (z4) {
            return true;
        }
        return zza(i4, parcel, parcel2, i5);
    }

    protected boolean zza(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
        return false;
    }
}
