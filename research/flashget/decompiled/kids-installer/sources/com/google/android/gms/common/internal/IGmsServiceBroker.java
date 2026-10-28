package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public interface IGmsServiceBroker extends IInterface {

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    /* loaded from: classes3.dex */
    public static abstract class Stub extends Binder implements IGmsServiceBroker {
        public Stub() {
            attachInterface(this, ProtectedSandApp.s("≊"));
        }

        @Override // android.os.IInterface
        @o0
        @KeepForSdk
        @x1.a
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i5, @o0 Parcel parcel, @q0 Parcel parcel2, int i6) throws RemoteException {
            IGmsCallbacks zzaaVar;
            if (i5 > 16777215) {
                return super.onTransact(i5, parcel, parcel2, i6);
            }
            parcel.enforceInterface(ProtectedSandApp.s("≋"));
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzaaVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(ProtectedSandApp.s("≌"));
                zzaaVar = queryLocalInterface instanceof IGmsCallbacks ? (IGmsCallbacks) queryLocalInterface : new zzaa(readStrongBinder);
            }
            if (i5 == 46) {
                getService(zzaaVar, parcel.readInt() != 0 ? GetServiceRequest.CREATOR.createFromParcel(parcel) : null);
                Preconditions.checkNotNull(parcel2);
                parcel2.writeNoException();
                return true;
            }
            if (i5 == 47) {
                if (parcel.readInt() != 0) {
                    zzaj.CREATOR.createFromParcel(parcel);
                }
                throw new UnsupportedOperationException();
            }
            parcel.readInt();
            if (i5 != 4) {
                parcel.readString();
                if (i5 != 1) {
                    if (i5 != 2 && i5 != 23 && i5 != 25 && i5 != 27) {
                        if (i5 != 30) {
                            if (i5 == 34) {
                                parcel.readString();
                            } else if (i5 != 41 && i5 != 43 && i5 != 37 && i5 != 38) {
                                switch (i5) {
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
