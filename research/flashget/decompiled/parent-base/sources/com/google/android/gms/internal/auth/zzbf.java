package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.auth.api.proxy.ProxyResponse;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes5.dex */
public abstract class zzbf extends zzb implements zzbg {
    public zzbf() {
        super(ProtectedSandApp.s("칹"));
    }

    @Override // com.google.android.gms.internal.auth.zzb
    protected final boolean zza(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
        if (i4 == 1) {
            ProxyResponse proxyResponse = (ProxyResponse) zzc.zza(parcel, ProxyResponse.CREATOR);
            zzc.zzb(parcel);
            zzb(proxyResponse);
        } else {
            if (i4 != 2) {
                return false;
            }
            String readString = parcel.readString();
            zzc.zzb(parcel);
            zzc(readString);
        }
        parcel2.writeNoException();
        return true;
    }
}
