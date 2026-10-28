package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.fragment.app.k0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@SafeParcelable.Class(creator = "LocationResultCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes5.dex */
public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {

    @SafeParcelable.Field(defaultValueUnchecked = "LocationResult.DEFAULT_LOCATIONS", getter = "getLocations", id = 1)
    private final List<Location> zzb;
    static final List<Location> zza = Collections.emptyList();

    @o0
    public static final Parcelable.Creator<LocationResult> CREATOR = new zzbg();

    @SafeParcelable.Constructor
    LocationResult(@SafeParcelable.Param(id = 1) List<Location> list) {
        this.zzb = list;
    }

    @o0
    public static LocationResult create(@o0 List<Location> list) {
        if (list == null) {
            list = zza;
        }
        return new LocationResult(list);
    }

    @o0
    public static LocationResult extractResult(@o0 Intent intent) {
        if (hasResult(intent)) {
            return (LocationResult) intent.getParcelableExtra(ProtectedSandApp.s("\ud9eb"));
        }
        return null;
    }

    public static boolean hasResult(@o0 Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra(ProtectedSandApp.s("\ud9eb"));
    }

    public boolean equals(@o0 Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        if (locationResult.zzb.size() != this.zzb.size()) {
            return false;
        }
        Iterator<Location> it = locationResult.zzb.iterator();
        Iterator<Location> it2 = this.zzb.iterator();
        while (it.hasNext()) {
            if (it2.next().getTime() != it.next().getTime()) {
                return false;
            }
        }
        return true;
    }

    @o0
    public Location getLastLocation() {
        int size = this.zzb.size();
        if (size == 0) {
            return null;
        }
        return this.zzb.get(size - 1);
    }

    @o0
    public List<Location> getLocations() {
        return this.zzb;
    }

    public int hashCode() {
        Iterator<Location> it = this.zzb.iterator();
        int i4 = 17;
        while (it.hasNext()) {
            long time = it.next().getTime();
            i4 = (i4 * 31) + ((int) (time ^ (time >>> 32)));
        }
        return i4;
    }

    @o0
    public String toString() {
        String valueOf = String.valueOf(this.zzb);
        return k0.a(new StringBuilder(valueOf.length() + 27), ProtectedSandApp.s("\ud9ec"), valueOf, ProtectedSandApp.s("\ud9ed"));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, getLocations(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
