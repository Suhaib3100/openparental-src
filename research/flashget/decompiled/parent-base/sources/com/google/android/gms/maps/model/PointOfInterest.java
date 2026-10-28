package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
@SafeParcelable.Class(creator = "PointOfInterestCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public final class PointOfInterest extends AbstractSafeParcelable {

    @o0
    public static final Parcelable.Creator<PointOfInterest> CREATOR = new zzp();

    @o0
    @SafeParcelable.Field(id = 2)
    public final LatLng latLng;

    @o0
    @SafeParcelable.Field(id = 4)
    public final String name;

    @o0
    @SafeParcelable.Field(id = 3)
    public final String placeId;

    @SafeParcelable.Constructor
    public PointOfInterest(@SafeParcelable.Param(id = 2) @o0 LatLng latLng, @SafeParcelable.Param(id = 3) @o0 String str, @SafeParcelable.Param(id = 4) @o0 String str2) {
        this.latLng = latLng;
        this.placeId = str;
        this.name = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        LatLng latLng = this.latLng;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, latLng, i4, false);
        SafeParcelWriter.writeString(parcel, 3, this.placeId, false);
        SafeParcelWriter.writeString(parcel, 4, this.name, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
