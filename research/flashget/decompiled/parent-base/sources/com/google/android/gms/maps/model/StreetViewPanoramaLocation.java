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
@SafeParcelable.Class(creator = "StreetViewPanoramaLocationCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public class StreetViewPanoramaLocation extends AbstractSafeParcelable {

    @o0
    public static final Parcelable.Creator<StreetViewPanoramaLocation> CREATOR = new zzw();

    @o0
    @SafeParcelable.Field(id = 2)
    public final StreetViewPanoramaLink[] links;

    @o0
    @SafeParcelable.Field(id = 4)
    public final String panoId;

    @o0
    @SafeParcelable.Field(id = 3)
    public final LatLng position;

    @SafeParcelable.Constructor
    public StreetViewPanoramaLocation(@SafeParcelable.Param(id = 2) @o0 StreetViewPanoramaLink[] streetViewPanoramaLinkArr, @SafeParcelable.Param(id = 3) @o0 LatLng latLng, @SafeParcelable.Param(id = 4) @o0 String str) {
        this.links = streetViewPanoramaLinkArr;
        this.position = latLng;
        this.panoId = str;
    }

    public boolean equals(@q0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLocation)) {
            return false;
        }
        StreetViewPanoramaLocation streetViewPanoramaLocation = (StreetViewPanoramaLocation) obj;
        return this.panoId.equals(streetViewPanoramaLocation.panoId) && this.position.equals(streetViewPanoramaLocation.position);
    }

    public int hashCode() {
        return Objects.hashCode(this.position, this.panoId);
    }

    @o0
    public String toString() {
        return Objects.toStringHelper(this).add(ProtectedSandApp.s("\udb0b"), this.panoId).add(ProtectedSandApp.s("\udb0c"), this.position.toString()).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        StreetViewPanoramaLink[] streetViewPanoramaLinkArr = this.links;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedArray(parcel, 2, streetViewPanoramaLinkArr, i4, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.position, i4, false);
        SafeParcelWriter.writeString(parcel, 4, this.panoId, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
