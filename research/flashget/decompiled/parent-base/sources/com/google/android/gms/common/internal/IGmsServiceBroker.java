package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes5.dex */
public interface IGmsServiceBroker extends IInterface {

    /* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    public static abstract class Stub extends Binder implements IGmsServiceBroker {
        public Stub() {
            attachInterface(this, ProtectedSandApp.s("쫕"));
        }

        @Override // android.os.IInterface
        @o0
        @KeepForSdk
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i4, @o0 Parcel parcel, @q0 Parcel parcel2, int i5) throws RemoteException {
            IGmsCallbacks zzyVar;
            if (i4 <= 0 || i4 > 16777215) {
                return super.onTransact(i4, parcel, parcel2, i5);
            }
            parcel.enforceInterface(ProtectedSandApp.s("쫕"));
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzyVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(ProtectedSandApp.s("쫖"));
                zzyVar = queryLocalInterface instanceof IGmsCallbacks ? (IGmsCallbacks) queryLocalInterface : new zzy(readStrongBinder);
            }
            if (i4 == 46) {
                getService(zzyVar, parcel.readInt() != 0 ? GetServiceRequest.CREATOR.createFromParcel(parcel) : null);
                Preconditions.checkNotNull(parcel2);
                parcel2.writeNoException();
                return true;
            }
            if (i4 == 47) {
                if (parcel.readInt() != 0) {
                    zzai.CREATOR.createFromParcel(parcel);
                }
                throw new UnsupportedOperationException();
            }
            parcel.readInt();
            if (i4 != 4) {
                parcel.readString();
                if (i4 != 1) {
                    if (i4 != 2 && i4 != 23 && i4 != 25 && i4 != 27) {
                        if (i4 != 30) {
                            if (i4 == 34) {
                                parcel.readString();
                            } else if (i4 != 41 && i4 != 43 && i4 != 37 && i4 != 38) {
                                switch (i4) {
                                    case 9:
                                        parcel.readString();
                                        parcel.createStringArray();
                                        parcel.readString();
                                        parcel.readStrongBinder();
                                        parcel.readString();
                                        if (parcel.readInt() != 0) {
                                            break;
                                        }
                                        break;
                                    case 10:
                                        parcel.readString();
                                        parcel.createStringArray();
                                        break;
                                    case 19:
                                        parcel.readStrongBinder();
                                        if (parcel.readInt() != 0) {
                                            break;
                                        }
                                        break;
                                }
                            }
                        }
                        parcel.createStringArray();
                        parcel.readString();
                        if (parcel.readInt() != 0) {
                        }
                    }
                    if (parcel.readInt() != 0) {
                    }
                } else {
                    parcel.readString();
                    parcel.createStringArray();
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                    }
                }
            }
            throw new UnsupportedOperationException();
        }
    }

    @KeepForSdk
    void getService(@o0 IGmsCallbacks iGmsCallbacks, @q0 GetServiceRequest getServiceRequest) throws RemoteException;
}
