package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
@SafeParcelable.Class(creator = "GroundOverlayOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public final class GroundOverlayOptions extends AbstractSafeParcelable {

    @o0
    public static final Parcelable.Creator<GroundOverlayOptions> CREATOR = new zzg();
    public static final float NO_DIMENSION = -1.0f;

    @SafeParcelable.Field(getter = "getWrappedImageDescriptorImplBinder", id = 2, type = "android.os.IBinder")
    private BitmapDescriptor zza;

    @q0
    @SafeParcelable.Field(getter = "getLocation", id = 3)
    private LatLng zzb;

    @SafeParcelable.Field(getter = "getWidth", id = 4)
    private float zzc;

    @SafeParcelable.Field(getter = "getHeight", id = 5)
    private float zzd;

    @q0
    @SafeParcelable.Field(getter = "getBounds", id = 6)
    private LatLngBounds zze;

    @SafeParcelable.Field(getter = "getBearing", id = 7)
    private float zzf;

    @SafeParcelable.Field(getter = "getZIndex", id = 8)
    private float zzg;

    @SafeParcelable.Field(getter = "isVisible", id = 9)
    private boolean zzh;

    @SafeParcelable.Field(getter = "getTransparency", id = 10)
    private float zzi;

    @SafeParcelable.Field(getter = "getAnchorU", id = 11)
    private float zzj;

    @SafeParcelable.Field(getter = "getAnchorV", id = 12)
    private float zzk;

    @SafeParcelable.Field(getter = "isClickable", id = 13)
    private boolean zzl;

    public GroundOverlayOptions() {
        this.zzh = true;
        this.zzi = 0.0f;
        this.zzj = 0.5f;
        this.zzk = 0.5f;
        this.zzl = false;
    }

    private final GroundOverlayOptions zza(LatLng latLng, float f4, float f5) {
        this.zzb = latLng;
        this.zzc = f4;
        this.zzd = f5;
        return this;
    }

    @o0
    public GroundOverlayOptions anchor(float f4, float f5) {
        this.zzj = f4;
        this.zzk = f5;
        return this;
    }

    @o0
    public GroundOverlayOptions bearing(float f4) {
        this.zzf = ((f4 % 360.0f) + 360.0f) % 360.0f;
        return this;
    }

    @o0
    public GroundOverlayOptions clickable(boolean z4) {
        this.zzl = z4;
        return this;
    }

    public float getAnchorU() {
        return this.zzj;
    }

    public float getAnchorV() {
        return this.zzk;
    }

    public float getBearing() {
        return this.zzf;
    }

    @q0
    public LatLngBounds getBounds() {
        return this.zze;
    }

    public float getHeight() {
        return this.zzd;
    }

    @o0
    public BitmapDescriptor getImage() {
        return this.zza;
    }

    @q0
    public LatLng getLocation() {
        return this.zzb;
    }

    public float getTransparency() {
        return this.zzi;
    }

    public float getWidth() {
        return this.zzc;
    }

    public float getZIndex() {
        return this.zzg;
    }

    @o0
    public GroundOverlayOptions image(@o0 BitmapDescriptor bitmapDescriptor) {
        Preconditions.checkNotNull(bitmapDescriptor, ProtectedSandApp.s("\udade"));
        this.zza = bitmapDescriptor;
        return this;
    }

    public boolean isClickable() {
        return this.zzl;
    }

    public boolean isVisible() {
        return this.zzh;
    }

    @o0
    public GroundOverlayOptions position(@o0 LatLng latLng, float f4) {
        Preconditions.checkState(this.zze == null, ProtectedSandApp.s("\udadf"));
        Preconditions.checkArgument(latLng != null, ProtectedSandApp.s("\udae0"));
        Preconditions.checkArgument(f4 >= 0.0f, ProtectedSandApp.s("\udae1"));
        zza(latLng, f4, -1.0f);
        return this;
    }

    @o0
    public GroundOverlayOptions positionFromBounds(@o0 LatLngBounds latLngBounds) {
        LatLng latLng = this.zzb;
        Preconditions.checkState(latLng == null, ProtectedSandApp.s("\udae3").concat(String.valueOf(latLng)));
        this.zze = latLngBounds;
        return this;
    }

    @o0
    public GroundOverlayOptions transparency(float f4) {
        boolean z4 = false;
        if (f4 >= 0.0f && f4 <= 1.0f) {
            z4 = true;
        }
        Preconditions.checkArgument(z4, ProtectedSandApp.s("\udae4"));
        this.zzi = f4;
        return this;
    }

    @o0
    public GroundOverlayOptions visible(boolean z4) {
        this.zzh = z4;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIBinder(parcel, 2, this.zza.zza().asBinder(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, getLocation(), i4, false);
        SafeParcelWriter.writeFloat(parcel, 4, getWidth());
        SafeParcelWriter.writeFloat(parcel, 5, getHeight());
        SafeParcelWriter.writeParcelable(parcel, 6, getBounds(), i4, false);
        SafeParcelWriter.writeFloat(parcel, 7, getBearing());
        SafeParcelWriter.writeFloat(parcel, 8, getZIndex());
        SafeParcelWriter.writeBoolean(parcel, 9, isVisible());
        SafeParcelWriter.writeFloat(parcel, 10, getTransparency());
        SafeParcelWriter.writeFloat(parcel, 11, getAnchorU());
        SafeParcelWriter.writeFloat(parcel, 12, getAnchorV());
        SafeParcelWriter.writeBoolean(parcel, 13, isClickable());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @o0
    public GroundOverlayOptions zIndex(float f4) {
        this.zzg = f4;
        return this;
    }

    @SafeParcelable.Constructor
    GroundOverlayOptions(@SafeParcelable.Param(id = 2) IBinder iBinder, @SafeParcelable.Param(id = 3) LatLng latLng, @SafeParcelable.Param(id = 4) float f4, @SafeParcelable.Param(id = 5) float f5, @SafeParcelable.Param(id = 6) LatLngBounds latLngBounds, @SafeParcelable.Param(id = 7) float f6, @SafeParcelable.Param(id = 8) float f7, @SafeParcelable.Param(id = 9) boolean z4, @SafeParcelable.Param(id = 10) float f10, @SafeParcelable.Param(id = 11) float f11, @SafeParcelable.Param(id = 12) float f12, @SafeParcelable.Param(id = 13) boolean z5) {
        this.zzh = true;
        this.zzi = 0.0f;
        this.zzj = 0.5f;
        this.zzk = 0.5f;
        this.zzl = false;
        this.zza = new BitmapDescriptor(IObjectWrapper.Stub.asInterface(iBinder));
        this.zzb = latLng;
        this.zzc = f4;
        this.zzd = f5;
        this.zze = latLngBounds;
        this.zzf = f6;
        this.zzg = f7;
        this.zzh = z4;
        this.zzi = f10;
        this.zzj = f11;
        this.zzk = f12;
        this.zzl = z5;
    }

    @o0
    public GroundOverlayOptions position(@o0 LatLng latLng, float f4, float f5) {
        Preconditions.checkState(this.zze == null, ProtectedSandApp.s("\udadf"));
        Preconditions.checkArgument(latLng != null, ProtectedSandApp.s("\udae0"));
        Preconditions.checkArgument(f4 >= 0.0f, ProtectedSandApp.s("\udae1"));
        Preconditions.checkArgument(f5 >= 0.0f, ProtectedSandApp.s("\udae2"));
        zza(latLng, f4, f5);
        return this;
    }
}
