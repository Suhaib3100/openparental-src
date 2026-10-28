package com.google.android.gms.maps.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.GoogleMapOptions;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
@SafeParcelable.Class(creator = "LatLngBoundsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public final class LatLngBounds extends AbstractSafeParcelable implements ReflectedParcelable {

    @o0
    @KeepForSdk
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new zzi();

    @o0
    @SafeParcelable.Field(id = 3)
    public final LatLng northeast;

    @o0
    @SafeParcelable.Field(id = 2)
    public final LatLng southwest;

    /* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
    public static final class Builder {
        private double zza = Double.POSITIVE_INFINITY;
        private double zzb = Double.NEGATIVE_INFINITY;
        private double zzc = Double.NaN;
        private double zzd = Double.NaN;

        @o0
        public LatLngBounds build() {
            Preconditions.checkState(!Double.isNaN(this.zzc), ProtectedSandApp.s("\udaea"));
            return new LatLngBounds(new LatLng(this.zza, this.zzc), new LatLng(this.zzb, this.zzd));
        }

        @o0
        public Builder include(@o0 LatLng latLng) {
            Preconditions.checkNotNull(latLng, ProtectedSandApp.s("\udaeb"));
            this.zza = Math.min(this.zza, latLng.latitude);
            this.zzb = Math.max(this.zzb, latLng.latitude);
            double d5 = latLng.longitude;
            if (Double.isNaN(this.zzc)) {
                this.zzc = d5;
                this.zzd = d5;
            } else {
                double d6 = this.zzc;
                double d7 = this.zzd;
                if (d6 > d7 ? !(d6 <= d5 || d5 <= d7) : !(d6 <= d5 && d5 <= d7)) {
                    Parcelable.Creator<LatLngBounds> creator = LatLngBounds.CREATOR;
                    if (((d6 - d5) + 360.0d) % 360.0d < ((d5 - d7) + 360.0d) % 360.0d) {
                        this.zzc = d5;
                    } else {
                        this.zzd = d5;
                    }
                }
            }
            return this;
        }
    }

    @SafeParcelable.Constructor
    public LatLngBounds(@SafeParcelable.Param(id = 2) @o0 LatLng latLng, @SafeParcelable.Param(id = 3) @o0 LatLng latLng2) {
        Preconditions.checkNotNull(latLng, ProtectedSandApp.s("\udaec"));
        Preconditions.checkNotNull(latLng2, ProtectedSandApp.s("\udaed"));
        double d5 = latLng2.latitude;
        double d6 = latLng.latitude;
        Preconditions.checkArgument(d5 >= d6, ProtectedSandApp.s("\udaee"), Double.valueOf(d6), Double.valueOf(latLng2.latitude));
        this.southwest = latLng;
        this.northeast = latLng2;
    }

    @o0
    public static Builder builder() {
        return new Builder();
    }

    @q0
    public static LatLngBounds createFromAttributes(@q0 Context context, @q0 AttributeSet attributeSet) {
        return GoogleMapOptions.zzb(context, attributeSet);
    }

    private final boolean zza(double d5) {
        LatLng latLng = this.northeast;
        double d6 = this.southwest.longitude;
        double d7 = latLng.longitude;
        return d6 <= d7 ? d6 <= d5 && d5 <= d7 : d6 <= d5 || d5 <= d7;
    }

    public boolean contains(@o0 LatLng latLng) {
        LatLng latLng2 = (LatLng) Preconditions.checkNotNull(latLng, ProtectedSandApp.s("\udaef"));
        double d5 = latLng2.latitude;
        return this.southwest.latitude <= d5 && d5 <= this.northeast.latitude && zza(latLng2.longitude);
    }

    public boolean equals(@q0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.southwest.equals(latLngBounds.southwest) && this.northeast.equals(latLngBounds.northeast);
    }

    @o0
    public LatLng getCenter() {
        LatLng latLng = this.northeast;
        LatLng latLng2 = this.southwest;
        double d5 = latLng2.latitude + latLng.latitude;
        double d6 = latLng.longitude;
        double d7 = latLng2.longitude;
        if (d7 > d6) {
            d6 += 360.0d;
        }
        return new LatLng(d5 / 2.0d, (d6 + d7) / 2.0d);
    }

    public int hashCode() {
        return Objects.hashCode(this.southwest, this.northeast);
    }

    @o0
    public LatLngBounds including(@o0 LatLng latLng) {
        LatLng latLng2 = (LatLng) Preconditions.checkNotNull(latLng, ProtectedSandApp.s("\udaef"));
        double min = Math.min(this.southwest.latitude, latLng2.latitude);
        double max = Math.max(this.northeast.latitude, latLng2.latitude);
        double d5 = this.northeast.longitude;
        double d6 = this.southwest.longitude;
        double d7 = latLng2.longitude;
        if (!zza(d7)) {
            if (((d6 - d7) + 360.0d) % 360.0d < ((d7 - d5) + 360.0d) % 360.0d) {
                d6 = d7;
            } else {
                d5 = d7;
            }
        }
        return new LatLngBounds(new LatLng(min, d6), new LatLng(max, d5));
    }

    @o0
    public String toString() {
        return Objects.toStringHelper(this).add(ProtectedSandApp.s("\udaf0"), this.southwest).add(ProtectedSandApp.s("\udaf1"), this.northeast).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        LatLng latLng = this.southwest;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, latLng, i4, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.northeast, i4, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
