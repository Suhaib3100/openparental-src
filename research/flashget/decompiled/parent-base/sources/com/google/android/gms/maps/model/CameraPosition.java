package com.google.android.gms.maps.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.firebase.remoteconfig.p;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
@SafeParcelable.Class(creator = "CameraPositionCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public final class CameraPosition extends AbstractSafeParcelable implements ReflectedParcelable {

    @o0
    public static final Parcelable.Creator<CameraPosition> CREATOR = new zza();

    @SafeParcelable.Field(id = 5)
    public final float bearing;

    @o0
    @SafeParcelable.Field(id = 2)
    public final LatLng target;

    @SafeParcelable.Field(id = 4)
    public final float tilt;

    @SafeParcelable.Field(id = 3)
    public final float zoom;

    /* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
    public static final class Builder {
        private LatLng zza;
        private float zzb;
        private float zzc;
        private float zzd;

        public Builder() {
        }

        @o0
        public Builder bearing(float f4) {
            this.zzd = f4;
            return this;
        }

        @o0
        public CameraPosition build() {
            return new CameraPosition(this.zza, this.zzb, this.zzc, this.zzd);
        }

        @o0
        public Builder target(@o0 LatLng latLng) {
            this.zza = (LatLng) Preconditions.checkNotNull(latLng, ProtectedSandApp.s("\udac4"));
            return this;
        }

        @o0
        public Builder tilt(float f4) {
            this.zzc = f4;
            return this;
        }

        @o0
        public Builder zoom(float f4) {
            this.zzb = f4;
            return this;
        }

        public Builder(@o0 CameraPosition cameraPosition) {
            CameraPosition cameraPosition2 = (CameraPosition) Preconditions.checkNotNull(cameraPosition, ProtectedSandApp.s("\udac3"));
            this.zza = cameraPosition2.target;
            this.zzb = cameraPosition2.zoom;
            this.zzc = cameraPosition2.tilt;
            this.zzd = cameraPosition2.bearing;
        }
    }

    @SafeParcelable.Constructor
    public CameraPosition(@SafeParcelable.Param(id = 2) @o0 LatLng latLng, @SafeParcelable.Param(id = 3) float f4, @SafeParcelable.Param(id = 4) float f5, @SafeParcelable.Param(id = 5) float f6) {
        Preconditions.checkNotNull(latLng, ProtectedSandApp.s("\udac5"));
        boolean z4 = false;
        if (f5 >= 0.0f && f5 <= 90.0f) {
            z4 = true;
        }
        Preconditions.checkArgument(z4, ProtectedSandApp.s("\udac6"), Float.valueOf(f5));
        this.target = latLng;
        this.zoom = f4;
        this.tilt = f5 + 0.0f;
        this.bearing = (((double) f6) <= p.f60679p ? (f6 % 360.0f) + 360.0f : f6) % 360.0f;
    }

    @o0
    public static Builder builder() {
        return new Builder();
    }

    @q0
    public static CameraPosition createFromAttributes(@q0 Context context, @q0 AttributeSet attributeSet) {
        return GoogleMapOptions.zza(context, attributeSet);
    }

    @o0
    public static final CameraPosition fromLatLngZoom(@o0 LatLng latLng, float f4) {
        return new CameraPosition(latLng, f4, 0.0f, 0.0f);
    }

    public boolean equals(@q0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.target.equals(cameraPosition.target) && Float.floatToIntBits(this.zoom) == Float.floatToIntBits(cameraPosition.zoom) && Float.floatToIntBits(this.tilt) == Float.floatToIntBits(cameraPosition.tilt) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(cameraPosition.bearing);
    }

    public int hashCode() {
        return Objects.hashCode(this.target, Float.valueOf(this.zoom), Float.valueOf(this.tilt), Float.valueOf(this.bearing));
    }

    @o0
    public String toString() {
        return Objects.toStringHelper(this).add(ProtectedSandApp.s("\udac7"), this.target).add(ProtectedSandApp.s("\udac8"), Float.valueOf(this.zoom)).add(ProtectedSandApp.s("\udac9"), Float.valueOf(this.tilt)).add(ProtectedSandApp.s("\udaca"), Float.valueOf(this.bearing)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        LatLng latLng = this.target;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, latLng, i4, false);
        SafeParcelWriter.writeFloat(parcel, 3, this.zoom);
        SafeParcelWriter.writeFloat(parcel, 4, this.tilt);
        SafeParcelWriter.writeFloat(parcel, 5, this.bearing);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @o0
    public static Builder builder(@o0 CameraPosition cameraPosition) {
        return new Builder(cameraPosition);
    }
}
