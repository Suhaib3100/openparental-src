package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes5.dex */
public abstract class zzaj extends zzb implements zzak {
    public zzaj() {
        super(ProtectedSandApp.s("턺"));
    }

    @Override // com.google.android.gms.internal.location.zzb
    protected final boolean zza(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
        if (i4 == 1) {
            zzb(parcel.readInt(), parcel.createStringArray());
        } else if (i4 == 2) {
            zzc(parcel.readInt(), parcel.createStringArray());
        } else {
            if (i4 != 3) {
                return false;
            }
            zzd(parcel.readInt(), (PendingIntent) zzc.zzb(parcel, PendingIntent.CREATOR));
        }
        return true;
    }
}
