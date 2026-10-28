package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.remoteconfig.p;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
@SafeParcelable.Class(creator = "StyleSpanCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public final class StyleSpan extends AbstractSafeParcelable {

    @o0
    public static final Parcelable.Creator<StyleSpan> CREATOR = new zzab();

    @SafeParcelable.Field(getter = "getStyle", id = 2)
    private final StrokeStyle zza;

    @SafeParcelable.Field(getter = "getSegments", id = 3)
    private final double zzb;

    public StyleSpan(int i4) {
        this.zza = StrokeStyle.colorBuilder(i4).build();
        this.zzb = 1.0d;
    }

    public double getSegments() {
        return this.zzb;
    }

    @o0
    public StrokeStyle getStyle() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getStyle(), i4, false);
        SafeParcelWriter.writeDouble(parcel, 3, getSegments());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public StyleSpan(int i4, double d5) {
        if (d5 > p.f60679p) {
            this.zza = StrokeStyle.colorBuilder(i4).build();
            this.zzb = d5;
            return;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("\udb16"));
    }

    public StyleSpan(@o0 StrokeStyle strokeStyle) {
        this.zza = strokeStyle;
        this.zzb = 1.0d;
    }

    @SafeParcelable.Constructor
    public StyleSpan(@SafeParcelable.Param(id = 2) @o0 StrokeStyle strokeStyle, @SafeParcelable.Param(id = 3) double d5) {
        if (d5 > p.f60679p) {
            this.zza = strokeStyle;
            this.zzb = d5;
            return;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("\udb16"));
    }
}
