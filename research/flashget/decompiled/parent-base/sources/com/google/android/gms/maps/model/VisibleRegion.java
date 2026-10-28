package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
@SafeParcelable.Class(creator = "VisibleRegionCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public final class VisibleRegion extends AbstractSafeParcelable {

    @o0
    public static final Parcelable.Creator<VisibleRegion> CREATOR = new zzai();

    @o0
    @SafeParcelable.Field(id = 4)
    public final LatLng farLeft;

    @o0
    @SafeParcelable.Field(id = 5)
    public final LatLng farRight;

    @o0
    @SafeParcelable.Field(id = 6)
    public final LatLngBounds latLngBounds;

    @o0
    @SafeParcelable.Field(id = 2)
    public final LatLng nearLeft;

    @o0
    @SafeParcelable.Field(id = 3)
    public final LatLng nearRight;

    @SafeParcelable.Constructor
    public VisibleRegion(@SafeParcelable.Param(id = 2) @o0 LatLng latLng, @SafeParcelable.Param(id = 3) @o0 LatLng latLng2, @SafeParcelable.Param(id = 4) @o0 LatLng latLng3, @SafeParcelable.Param(id = 5) @o0 LatLng latLng4, @SafeParcelable.Param(id = 6) @o0 LatLngBounds latLngBounds) {
        this.nearLeft = latLng;
        this.nearRight = latLng2;
        this.farLeft = latLng3;
        this.farRight = latLng4;
        this.latLngBounds = latLngBounds;
    }

    public boolean equals(@q0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisibleRegion)) {
            return false;
        }
        VisibleRegion visibleRegion = (VisibleRegion) obj;
        return this.nearLeft.equals(visibleRegion.nearLeft) && this.nearRight.equals(visibleRegion.nearRight) && this.farLeft.equals(visibleRegion.farLeft) && this.farRight.equals(visibleRegion.farRight) && this.latLngBounds.equals(visibleRegion.latLngBounds);
    }

    public int hashCode() {
        return Objects.hashCode(this.nearLeft, this.nearRight, this.farLeft, this.farRight, this.latLngBounds);
    }

    @o0
    public String toString() {
        return Objects.toStringHelper(this).add(ProtectedSandApp.s("\udb1b"), this.nearLeft).add(ProtectedSandApp.s("\udb1c"), this.nearRight).add(ProtectedSandApp.s("\udb1d"), this.farLeft).add(ProtectedSandApp.s("\udb1e"), this.farRight).add(ProtectedSandApp.s("\udb1f"), this.latLngBounds).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        LatLng latLng = this.nearLeft;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, latLng, i4, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.nearRight, i4, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.farLeft, i4, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.farRight, i4, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.latLngBounds, i4, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
