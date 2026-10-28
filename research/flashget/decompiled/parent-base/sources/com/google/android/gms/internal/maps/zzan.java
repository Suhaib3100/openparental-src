package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.maps.model.Tile;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
/* loaded from: classes5.dex */
public final class zzan extends zza implements zzap {
    zzan(IBinder iBinder) {
        super(iBinder, ProtectedSandApp.s("톚"));
    }

    @Override // com.google.android.gms.internal.maps.zzap
    public final Tile zzb(int i4, int i5, int i6) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i4);
        zza.writeInt(i5);
        zza.writeInt(i6);
        Parcel zzJ = zzJ(1, zza);
        Tile tile = (Tile) zzc.zza(zzJ, Tile.CREATOR);
        zzJ.recycle();
        return tile;
    }
}
