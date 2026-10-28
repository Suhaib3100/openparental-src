package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import android.os.Parcel;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.location.Geofence;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes5.dex */
public class GeofencingEvent {
    private final int zza;

    @Geofence.GeofenceTransition
    private final int zzb;
    private final List<Geofence> zzc;
    private final Location zzd;

    private GeofencingEvent(int i4, @Geofence.GeofenceTransition int i5, List<Geofence> list, Location location) {
        this.zza = i4;
        this.zzb = i5;
        this.zzc = list;
        this.zzd = location;
    }

    @o0
    public static GeofencingEvent fromIntent(@o0 Intent intent) {
        ArrayList arrayList = null;
        if (intent == null) {
            return null;
        }
        int i4 = -1;
        int intExtra = intent.getIntExtra(ProtectedSandApp.s("\ud9ca"), -1);
        int intExtra2 = intent.getIntExtra(ProtectedSandApp.s("\ud9cb"), -1);
        if (intExtra2 != -1) {
            if (intExtra2 == 1 || intExtra2 == 2) {
                i4 = intExtra2;
            } else if (intExtra2 == 4) {
                i4 = 4;
            }
        }
        ArrayList arrayList2 = (ArrayList) intent.getSerializableExtra(ProtectedSandApp.s("\ud9cc"));
        if (arrayList2 != null) {
            arrayList = new ArrayList(arrayList2.size());
            int size = arrayList2.size();
            for (int i5 = 0; i5 < size; i5++) {
                byte[] bArr = (byte[]) arrayList2.get(i5);
                Parcel obtain = Parcel.obtain();
                obtain.unmarshall(bArr, 0, bArr.length);
                obtain.setDataPosition(0);
                com.google.android.gms.internal.location.zzbe createFromParcel = com.google.android.gms.internal.location.zzbe.CREATOR.createFromParcel(obtain);
                obtain.recycle();
                arrayList.add(createFromParcel);
            }
        }
        return new GeofencingEvent(intExtra, i4, arrayList, (Location) intent.getParcelableExtra(ProtectedSandApp.s("\ud9cd")));
    }

    public int getErrorCode() {
        return this.zza;
    }

    @Geofence.GeofenceTransition
    public int getGeofenceTransition() {
        return this.zzb;
    }

    @o0
    public List<Geofence> getTriggeringGeofences() {
        return this.zzc;
    }

    @o0
    public Location getTriggeringLocation() {
        return this.zzd;
    }

    public boolean hasError() {
        return this.zza != -1;
    }
}
