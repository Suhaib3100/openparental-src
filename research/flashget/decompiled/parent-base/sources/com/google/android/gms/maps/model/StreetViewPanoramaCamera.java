package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import com.google.firebase.remoteconfig.p;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
@SafeParcelable.Class(creator = "StreetViewPanoramaCameraCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public class StreetViewPanoramaCamera extends AbstractSafeParcelable implements ReflectedParcelable {

    @o0
    public static final Parcelable.Creator<StreetViewPanoramaCamera> CREATOR = new zzu();

    @SafeParcelable.Field(id = 4)
    public final float bearing;

    @SafeParcelable.Field(id = 3)
    public final float tilt;

    @SafeParcelable.Field(id = 2)
    public final float zoom;
    private final StreetViewPanoramaOrientation zza;

    /* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
    public static final class Builder {
        public float bearing;
        public float tilt;
        public float zoom;

        public Builder() {
        }

        @o0
        public Builder bearing(float f4) {
            this.bearing = f4;
            return this;
        }

        @o0
        public StreetViewPanoramaCamera build() {
            return new StreetViewPanoramaCamera(this.zoom, this.tilt, this.bearing);
        }

        @o0
        public Builder orientation(@o0 StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
            Preconditions.checkNotNull(streetViewPanoramaOrientation, ProtectedSandApp.s("\udb04"));
            this.tilt = streetViewPanoramaOrientation.tilt;
            this.bearing = streetViewPanoramaOrientation.bearing;
            return this;
        }

        @o0
        public Builder tilt(float f4) {
            this.tilt = f4;
            return this;
        }

        @o0
        public Builder zoom(float f4) {
            this.zoom = f4;
            return this;
        }

        public Builder(@o0 StreetViewPanoramaCamera streetViewPanoramaCamera) {
            Preconditions.checkNotNull(streetViewPanoramaCamera, ProtectedSandApp.s("\udb03"));
            this.zoom = streetViewPanoramaCamera.zoom;
            this.bearing = streetViewPanoramaCamera.bearing;
            this.tilt = streetViewPanoramaCamera.tilt;
        }
    }

    @SafeParcelable.Constructor
    public StreetViewPanoramaCamera(@SafeParcelable.Param(id = 2) float f4, @SafeParcelable.Param(id = 3) float f5, @SafeParcelable.Param(id = 4) float f6) {
        boolean z4 = false;
        if (f5 >= -90.0f && f5 <= 90.0f) {
            z4 = true;
        }
        Preconditions.checkArgument(z4, ProtectedSandApp.s("\udb05") + f5);
        this.zoom = ((double) f4) <= p.f60679p ? 0.0f : f4;
        this.tilt = 0.0f + f5;
        this.bearing = (((double) f6) <= p.f60679p ? (f6 % 360.0f) + 360.0f : f6) % 360.0f;
        StreetViewPanoramaOrientation.Builder builder = new StreetViewPanoramaOrientation.Builder();
        builder.tilt(f5);
        builder.bearing(f6);
        this.zza = builder.build();
    }

    @o0
    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(@q0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaCamera)) {
            return false;
        }
        StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) obj;
        return Float.floatToIntBits(this.zoom) == Float.floatToIntBits(streetViewPanoramaCamera.zoom) && Float.floatToIntBits(this.tilt) == Float.floatToIntBits(streetViewPanoramaCamera.tilt) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(streetViewPanoramaCamera.bearing);
    }

    @o0
    public StreetViewPanoramaOrientation getOrientation() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(Float.valueOf(this.zoom), Float.valueOf(this.tilt), Float.valueOf(this.bearing));
    }

    @o0
    public String toString() {
        return Objects.toStringHelper(this).add(ProtectedSandApp.s("\udb06"), Float.valueOf(this.zoom)).add(ProtectedSandApp.s("\udb07"), Float.valueOf(this.tilt)).add(ProtectedSandApp.s("\udb08"), Float.valueOf(this.bearing)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        float f4 = this.zoom;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeFloat(parcel, 2, f4);
        SafeParcelWriter.writeFloat(parcel, 3, this.tilt);
        SafeParcelWriter.writeFloat(parcel, 4, this.bearing);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @o0
    public static Builder builder(@o0 StreetViewPanoramaCamera streetViewPanoramaCamera) {
        return new Builder(streetViewPanoramaCamera);
    }
}
