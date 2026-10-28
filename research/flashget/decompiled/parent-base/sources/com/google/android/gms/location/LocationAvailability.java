package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@SafeParcelable.Class(creator = "LocationAvailabilityCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes5.dex */
public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {

    @o0
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new zzbe();

    @SafeParcelable.Field(defaultValueUnchecked = "LocationAvailability.STATUS_UNKNOWN", id = 1)
    @Deprecated
    int zza;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationAvailability.STATUS_UNKNOWN", id = 2)
    @Deprecated
    int zzb;

    @SafeParcelable.Field(defaultValueUnchecked = "0", id = 3)
    long zzc;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationAvailability.STATUS_UNSUCCESSFUL", id = 4)
    int zzd;

    @SafeParcelable.Field(id = 5)
    zzbo[] zze;

    @SafeParcelable.Constructor
    LocationAvailability(@SafeParcelable.Param(id = 4) int i4, @SafeParcelable.Param(id = 1) int i5, @SafeParcelable.Param(id = 2) int i6, @SafeParcelable.Param(id = 3) long j4, @SafeParcelable.Param(id = 5) zzbo[] zzboVarArr) {
        this.zzd = i4;
        this.zza = i5;
        this.zzb = i6;
        this.zzc = j4;
        this.zze = zzboVarArr;
    }

    @o0
    public static LocationAvailability extractLocationAvailability(@o0 Intent intent) {
        if (!hasLocationAvailability(intent)) {
            return null;
        }
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                return (LocationAvailability) extras.getParcelable(ProtectedSandApp.s("\ud9d6"));
            }
            return null;
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public static boolean hasLocationAvailability(@o0 Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra(ProtectedSandApp.s("\ud9d6"));
    }

    public boolean equals(@o0 Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.zza == locationAvailability.zza && this.zzb == locationAvailability.zzb && this.zzc == locationAvailability.zzc && this.zzd == locationAvailability.zzd && Arrays.equals(this.zze, locationAvailability.zze)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzd), Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Long.valueOf(this.zzc), this.zze);
    }

    public boolean isLocationAvailable() {
        return this.zzd < 1000;
    }

    @o0
    public String toString() {
        boolean isLocationAvailable = isLocationAvailable();
        StringBuilder sb = new StringBuilder(48);
        sb.append(ProtectedSandApp.s("\ud9d7"));
        sb.append(isLocationAvailable);
        sb.append(ProtectedSandApp.s("\ud9d8"));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeLong(parcel, 3, this.zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.writeTypedArray(parcel, 5, this.zze, i4, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
