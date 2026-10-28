package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.remoteconfig.p;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
@SafeParcelable.Class(creator = "StreetViewPanoramaOrientationCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public class StreetViewPanoramaOrientation extends AbstractSafeParcelable {

    @o0
    public static final Parcelable.Creator<StreetViewPanoramaOrientation> CREATOR = new zzx();

    @SafeParcelable.Field(id = 3)
    public final float bearing;

    @SafeParcelable.Field(id = 2)
    public final float tilt;

    /* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
    public static final class Builder {
        public float bearing;
        public float tilt;

        public Builder() {
        }

        @o0
        public Builder bearing(float f4) {
            this.bearing = f4;
            return this;
        }

        @o0
        public StreetViewPanoramaOrientation build() {
            return new StreetViewPanoramaOrientation(this.tilt, this.bearing);
        }

        @o0
        public Builder tilt(float f4) {
            this.tilt = f4;
            return this;
        }

        public Builder(@o0 StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
            Preconditions.checkNotNull(streetViewPanoramaOrientation, ProtectedSandApp.s("\udb0d"));
            this.bearing = streetViewPanoramaOrientation.bearing;
            this.tilt = streetViewPanoramaOrientation.tilt;
        }
    }

    @SafeParcelable.Constructor
    public StreetViewPanoramaOrientation(@SafeParcelable.Param(id = 2) float f4, @SafeParcelable.Param(id = 3) float f5) {
        boolean z4 = false;
        if (f4 >= -90.0f && f4 <= 90.0f) {
            z4 = true;
        }
        Preconditions.checkArgument(z4, ProtectedSandApp.s("\udb0e") + f4);
        this.tilt = f4 + 0.0f;
        this.bearing = (((double) f5) <= p.f60679p ? (f5 % 360.0f) + 360.0f : f5) % 360.0f;
    }

    @o0
    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(@q0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaOrientation)) {
            return false;
        }
        StreetViewPanoramaOrientation streetViewPanoramaOrientation = (StreetViewPanoramaOrientation) obj;
        return Float.floatToIntBits(this.tilt) == Float.floatToIntBits(streetViewPanoramaOrientation.tilt) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(streetViewPanoramaOrientation.bearing);
    }

    public int hashCode() {
        return Objects.hashCode(Float.valueOf(this.tilt), Float.valueOf(this.bearing));
    }

    @o0
    public String toString() {
        return Objects.toStringHelper(this).add(ProtectedSandApp.s("\udb0f"), Float.valueOf(this.tilt)).add(ProtectedSandApp.s("\udb10"), Float.valueOf(this.bearing)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        float f4 = this.tilt;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeFloat(parcel, 2, f4);
        SafeParcelWriter.writeFloat(parcel, 3, this.bearing);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @o0
    public static Builder builder(@o0 StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        return new Builder(streetViewPanoramaOrientation);
    }
}
