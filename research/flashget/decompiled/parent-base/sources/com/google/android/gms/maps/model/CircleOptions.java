package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.view.x1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.remoteconfig.p;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
@SafeParcelable.Class(creator = "CircleOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public final class CircleOptions extends AbstractSafeParcelable {

    @o0
    public static final Parcelable.Creator<CircleOptions> CREATOR = new zzc();

    @q0
    @SafeParcelable.Field(getter = "getCenter", id = 2)
    private LatLng zza;

    @SafeParcelable.Field(getter = "getRadius", id = 3)
    private double zzb;

    @SafeParcelable.Field(getter = "getStrokeWidth", id = 4)
    private float zzc;

    @SafeParcelable.Field(getter = "getStrokeColor", id = 5)
    private int zzd;

    @SafeParcelable.Field(getter = "getFillColor", id = 6)
    private int zze;

    @SafeParcelable.Field(getter = "getZIndex", id = 7)
    private float zzf;

    @SafeParcelable.Field(getter = "isVisible", id = 8)
    private boolean zzg;

    @SafeParcelable.Field(getter = "isClickable", id = 9)
    private boolean zzh;

    @q0
    @SafeParcelable.Field(getter = "getStrokePattern", id = 10)
    private List zzi;

    public CircleOptions() {
        this.zza = null;
        this.zzb = p.f60679p;
        this.zzc = 10.0f;
        this.zzd = x1.f27484y;
        this.zze = 0;
        this.zzf = 0.0f;
        this.zzg = true;
        this.zzh = false;
        this.zzi = null;
    }

    @o0
    public CircleOptions center(@o0 LatLng latLng) {
        Preconditions.checkNotNull(latLng, ProtectedSandApp.s("\udacc"));
        this.zza = latLng;
        return this;
    }

    @o0
    public CircleOptions clickable(boolean z4) {
        this.zzh = z4;
        return this;
    }

    @o0
    public CircleOptions fillColor(int i4) {
        this.zze = i4;
        return this;
    }

    @q0
    public LatLng getCenter() {
        return this.zza;
    }

    public int getFillColor() {
        return this.zze;
    }

    public double getRadius() {
        return this.zzb;
    }

    public int getStrokeColor() {
        return this.zzd;
    }

    @q0
    public List<PatternItem> getStrokePattern() {
        return this.zzi;
    }

    public float getStrokeWidth() {
        return this.zzc;
    }

    public float getZIndex() {
        return this.zzf;
    }

    public boolean isClickable() {
        return this.zzh;
    }

    public boolean isVisible() {
        return this.zzg;
    }

    @o0
    public CircleOptions radius(double d5) {
        this.zzb = d5;
        return this;
    }

    @o0
    public CircleOptions strokeColor(int i4) {
        this.zzd = i4;
        return this;
    }

    @o0
    public CircleOptions strokePattern(@q0 List<PatternItem> list) {
        this.zzi = list;
        return this;
    }

    @o0
    public CircleOptions strokeWidth(float f4) {
        this.zzc = f4;
        return this;
    }

    @o0
    public CircleOptions visible(boolean z4) {
        this.zzg = z4;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getCenter(), i4, false);
        SafeParcelWriter.writeDouble(parcel, 3, getRadius());
        SafeParcelWriter.writeFloat(parcel, 4, getStrokeWidth());
        SafeParcelWriter.writeInt(parcel, 5, getStrokeColor());
        SafeParcelWriter.writeInt(parcel, 6, getFillColor());
        SafeParcelWriter.writeFloat(parcel, 7, getZIndex());
        SafeParcelWriter.writeBoolean(parcel, 8, isVisible());
        SafeParcelWriter.writeBoolean(parcel, 9, isClickable());
        SafeParcelWriter.writeTypedList(parcel, 10, getStrokePattern(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @o0
    public CircleOptions zIndex(float f4) {
        this.zzf = f4;
        return this;
    }

    @SafeParcelable.Constructor
    CircleOptions(@SafeParcelable.Param(id = 2) LatLng latLng, @SafeParcelable.Param(id = 3) double d5, @SafeParcelable.Param(id = 4) float f4, @SafeParcelable.Param(id = 5) int i4, @SafeParcelable.Param(id = 6) int i5, @SafeParcelable.Param(id = 7) float f5, @SafeParcelable.Param(id = 8) boolean z4, @SafeParcelable.Param(id = 9) boolean z5, @q0 @SafeParcelable.Param(id = 10) List list) {
        this.zza = latLng;
        this.zzb = d5;
        this.zzc = f4;
        this.zzd = i4;
        this.zze = i5;
        this.zzf = f5;
        this.zzg = z4;
        this.zzh = z5;
        this.zzi = list;
    }
}
