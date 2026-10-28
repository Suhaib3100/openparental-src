package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
@SafeParcelable.Class(creator = "StrokeStyleCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public final class StrokeStyle extends AbstractSafeParcelable {

    @o0
    public static final Parcelable.Creator<StrokeStyle> CREATOR = new zzaa();

    @SafeParcelable.Field(getter = "getWidth", id = 2)
    private final float zza;

    @SafeParcelable.Field(getter = "getColor", id = 3)
    private final int zzb;

    @SafeParcelable.Field(getter = "getToColor", id = 4)
    private final int zzc;

    @SafeParcelable.Field(getter = "isVisible", id = 5)
    private final boolean zzd;

    @q0
    @SafeParcelable.Field(getter = "getStamp", id = 6)
    private final StampStyle zze;

    /* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
    public static final class Builder {
        private float zza;
        private int zzb;
        private int zzc;
        private boolean zzd;

        @q0
        private StampStyle zze;

        private Builder() {
        }

        @o0
        public StrokeStyle build() {
            return new StrokeStyle(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
        }

        @o0
        public Builder stamp(@o0 StampStyle stampStyle) {
            this.zze = stampStyle;
            return this;
        }

        @o0
        public final Builder zza(int i4) {
            this.zzb = i4;
            this.zzc = i4;
            return this;
        }

        @o0
        public final Builder zzb(int i4, int i5) {
            this.zzb = i4;
            this.zzc = i5;
            return this;
        }

        @o0
        public final Builder zzc(boolean z4) {
            this.zzd = z4;
            return this;
        }

        @o0
        public final Builder zzd(float f4) {
            this.zza = f4;
            return this;
        }

        /* synthetic */ Builder(zzz zzzVar) {
        }

        public Builder(@o0 StrokeStyle strokeStyle) {
            this.zza = strokeStyle.zza();
            Pair zzb = strokeStyle.zzb();
            this.zzb = ((Integer) zzb.first).intValue();
            this.zzc = ((Integer) zzb.second).intValue();
            this.zzd = strokeStyle.isVisible();
            this.zze = strokeStyle.getStamp();
        }
    }

    @SafeParcelable.Constructor
    StrokeStyle(@SafeParcelable.Param(id = 2) float f4, @SafeParcelable.Param(id = 3) int i4, @SafeParcelable.Param(id = 4) int i5, @SafeParcelable.Param(id = 5) boolean z4, @q0 @SafeParcelable.Param(id = 6) StampStyle stampStyle) {
        this.zza = f4;
        this.zzb = i4;
        this.zzc = i5;
        this.zzd = z4;
        this.zze = stampStyle;
    }

    @o0
    public static Builder colorBuilder(int i4) {
        Builder builder = new Builder((zzz) null);
        builder.zza(i4);
        return builder;
    }

    @o0
    public static Builder gradientBuilder(int i4, int i5) {
        Builder builder = new Builder((zzz) null);
        builder.zzb(i4, i5);
        return builder;
    }

    @o0
    public static Builder transparentColorBuilder() {
        Builder builder = new Builder((zzz) null);
        builder.zza(0);
        return builder;
    }

    @q0
    public StampStyle getStamp() {
        return this.zze;
    }

    public boolean isVisible() {
        return this.zzd;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeFloat(parcel, 2, this.zza);
        SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 5, isVisible());
        SafeParcelWriter.writeParcelable(parcel, 6, getStamp(), i4, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final float zza() {
        return this.zza;
    }

    @o0
    public final Pair zzb() {
        return new Pair(Integer.valueOf(this.zzb), Integer.valueOf(this.zzc));
    }
}
