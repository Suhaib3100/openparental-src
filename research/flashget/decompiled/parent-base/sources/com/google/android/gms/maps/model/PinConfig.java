package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.l;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.view.x1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
@SafeParcelable.Class(creator = "PinConfigCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public class PinConfig extends AbstractSafeParcelable {
    public static final int BITMAP_LENGTH_DP = 37;
    public static final int BITMAP_WIDTH_DP = 26;

    @o0
    public static final Parcelable.Creator<PinConfig> CREATOR = new zzo();
    public static final int DEFAULT_PIN_BACKGROUND_COLOR = -1424587;
    public static final int DEFAULT_PIN_BORDER_COLOR = -3857889;
    public static final int DEFAULT_PIN_GLYPH_COLOR = -5041134;

    @SafeParcelable.Field(getter = "getBackgroundColor", id = 2)
    private final int zza;

    @SafeParcelable.Field(getter = "getBorderColor", id = 3)
    private final int zzb;

    @SafeParcelable.Field(getter = "getGlyph", id = 4)
    private final Glyph zzc;

    /* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
    public static class Builder {
        private int zza = PinConfig.DEFAULT_PIN_BACKGROUND_COLOR;
        private int zzb = PinConfig.DEFAULT_PIN_BORDER_COLOR;
        private Glyph zzc = new Glyph(PinConfig.DEFAULT_PIN_GLYPH_COLOR);

        @o0
        public PinConfig build() {
            return new PinConfig(this.zza, this.zzb, this.zzc);
        }

        @o0
        public Builder setBackgroundColor(@l int i4) {
            this.zza = i4;
            return this;
        }

        @o0
        public Builder setBorderColor(@l int i4) {
            this.zzb = i4;
            return this;
        }

        @o0
        public Builder setGlyph(@o0 Glyph glyph) {
            this.zzc = glyph;
            return this;
        }
    }

    /* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
    @SafeParcelable.Class(creator = "GlyphCreator")
    @SafeParcelable.Reserved({1})
    public static class Glyph extends AbstractSafeParcelable {

        @o0
        public static final Parcelable.Creator<Glyph> CREATOR = new zzf();
        public static final float DEFAULT_CIRCLE_RADIUS_DP = 5.0f;
        public static final float X_COORDINATE_DP = 13.0f;
        public static final float Y_COORDINATE_DP = 13.0f;

        @q0
        @SafeParcelable.Field(getter = "getText", id = 2)
        private String zza;

        @q0
        @SafeParcelable.Field(getter = "getWrappedBitmapDescriptorBinder", id = 3, type = "android.os.IBinder")
        private BitmapDescriptor zzb;

        @SafeParcelable.Field(getter = "getGlyphColor", id = 4)
        private int zzc;

        @l
        @SafeParcelable.Field(getter = "getTextColor", id = 5)
        private int zzd;

        public Glyph(@l int i4) {
            this.zzd = x1.f27484y;
            this.zzc = i4;
        }

        public boolean equals(@q0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Glyph)) {
                return false;
            }
            Glyph glyph = (Glyph) obj;
            if (this.zzc != glyph.zzc || !zzn.zza(this.zza, glyph.zza) || this.zzd != glyph.zzd) {
                return false;
            }
            BitmapDescriptor bitmapDescriptor = this.zzb;
            if ((bitmapDescriptor == null && glyph.zzb != null) || (bitmapDescriptor != null && glyph.zzb == null)) {
                return false;
            }
            BitmapDescriptor bitmapDescriptor2 = glyph.zzb;
            if (bitmapDescriptor == null || bitmapDescriptor2 == null) {
                return true;
            }
            return zzn.zza(ObjectWrapper.unwrap(bitmapDescriptor.zza()), ObjectWrapper.unwrap(bitmapDescriptor2.zza()));
        }

        @q0
        public BitmapDescriptor getBitmapDescriptor() {
            return this.zzb;
        }

        public int getGlyphColor() {
            return this.zzc;
        }

        @q0
        public String getText() {
            return this.zza;
        }

        public int getTextColor() {
            return this.zzd;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.zza, this.zzb, Integer.valueOf(this.zzc)});
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@o0 Parcel parcel, int i4) {
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeString(parcel, 2, getText(), false);
            BitmapDescriptor bitmapDescriptor = this.zzb;
            SafeParcelWriter.writeIBinder(parcel, 3, bitmapDescriptor == null ? null : bitmapDescriptor.zza().asBinder(), false);
            SafeParcelWriter.writeInt(parcel, 4, getGlyphColor());
            SafeParcelWriter.writeInt(parcel, 5, getTextColor());
            SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }

        public Glyph(@q0 BitmapDescriptor bitmapDescriptor) {
            this.zzc = PinConfig.DEFAULT_PIN_GLYPH_COLOR;
            this.zzd = x1.f27484y;
            this.zzb = bitmapDescriptor;
        }

        public Glyph(@o0 String str) {
            this(str, x1.f27484y);
        }

        public Glyph(@o0 String str, @l int i4) {
            this.zzc = PinConfig.DEFAULT_PIN_GLYPH_COLOR;
            this.zza = str;
            this.zzd = i4;
        }

        @SafeParcelable.Constructor
        Glyph(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) IBinder iBinder, @SafeParcelable.Param(id = 4) int i4, @SafeParcelable.Param(id = 5) int i5) {
            this.zzc = PinConfig.DEFAULT_PIN_GLYPH_COLOR;
            this.zzd = x1.f27484y;
            this.zza = str;
            this.zzb = iBinder == null ? null : new BitmapDescriptor(IObjectWrapper.Stub.asInterface(iBinder));
            this.zzc = i4;
            this.zzd = i5;
        }
    }

    @SafeParcelable.Constructor
    PinConfig(@l @SafeParcelable.Param(id = 2) int i4, @l @SafeParcelable.Param(id = 3) int i5, @SafeParcelable.Param(id = 4) Glyph glyph) {
        this.zza = i4;
        this.zzb = i5;
        this.zzc = glyph;
    }

    @o0
    public static Builder builder() {
        return new Builder();
    }

    public int getBackgroundColor() {
        return this.zza;
    }

    public int getBorderColor() {
        return this.zzb;
    }

    @o0
    public Glyph getGlyph() {
        return this.zzc;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, getBackgroundColor());
        SafeParcelWriter.writeInt(parcel, 3, getBorderColor());
        SafeParcelWriter.writeParcelable(parcel, 4, getGlyph(), i4, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
