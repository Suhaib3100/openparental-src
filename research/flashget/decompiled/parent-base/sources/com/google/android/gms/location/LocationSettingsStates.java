package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@SafeParcelable.Class(creator = "LocationSettingsStatesCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes5.dex */
public final class LocationSettingsStates extends AbstractSafeParcelable {

    @o0
    public static final Parcelable.Creator<LocationSettingsStates> CREATOR = new zzbn();

    @SafeParcelable.Field(getter = "isGpsUsable", id = 1)
    private final boolean zza;

    @SafeParcelable.Field(getter = "isNetworkLocationUsable", id = 2)
    private final boolean zzb;

    @SafeParcelable.Field(getter = "isBleUsable", id = 3)
    private final boolean zzc;

    @SafeParcelable.Field(getter = "isGpsPresent", id = 4)
    private final boolean zzd;

    @SafeParcelable.Field(getter = "isNetworkLocationPresent", id = 5)
    private final boolean zze;

    @SafeParcelable.Field(getter = "isBlePresent", id = 6)
    private final boolean zzf;

    @SafeParcelable.Constructor
    public LocationSettingsStates(@SafeParcelable.Param(id = 1) boolean z4, @SafeParcelable.Param(id = 2) boolean z5, @SafeParcelable.Param(id = 3) boolean z6, @SafeParcelable.Param(id = 4) boolean z7, @SafeParcelable.Param(id = 5) boolean z10, @SafeParcelable.Param(id = 6) boolean z11) {
        this.zza = z4;
        this.zzb = z5;
        this.zzc = z6;
        this.zzd = z7;
        this.zze = z10;
        this.zzf = z11;
    }

    @q0
    public static LocationSettingsStates fromIntent(@o0 Intent intent) {
        return (LocationSettingsStates) SafeParcelableSerializer.deserializeFromIntentExtra(intent, ProtectedSandApp.s("\ud9f1"), CREATOR);
    }

    public boolean isBlePresent() {
        return this.zzf;
    }

    public boolean isBleUsable() {
        return this.zzc;
    }

    public boolean isGpsPresent() {
        return this.zzd;
    }

    public boolean isGpsUsable() {
        return this.zza;
    }

    public boolean isLocationPresent() {
        return this.zzd || this.zze;
    }

    public boolean isLocationUsable() {
        return this.zza || this.zzb;
    }

    public boolean isNetworkLocationPresent() {
        return this.zze;
    }

    public boolean isNetworkLocationUsable() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, isGpsUsable());
        SafeParcelWriter.writeBoolean(parcel, 2, isNetworkLocationUsable());
        SafeParcelWriter.writeBoolean(parcel, 3, isBleUsable());
        SafeParcelWriter.writeBoolean(parcel, 4, isGpsPresent());
        SafeParcelWriter.writeBoolean(parcel, 5, isNetworkLocationPresent());
        SafeParcelWriter.writeBoolean(parcel, 6, isBlePresent());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
