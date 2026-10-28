package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewSource;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
@SafeParcelable.Class(creator = "StreetViewPanoramaOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public final class StreetViewPanoramaOptions extends AbstractSafeParcelable implements ReflectedParcelable {

    @o0
    public static final Parcelable.Creator<StreetViewPanoramaOptions> CREATOR = new zzaq();

    @q0
    @SafeParcelable.Field(getter = "getStreetViewPanoramaCamera", id = 2)
    private StreetViewPanoramaCamera zza;

    @q0
    @SafeParcelable.Field(getter = "getPanoramaId", id = 3)
    private String zzb;

    @q0
    @SafeParcelable.Field(getter = "getPosition", id = 4)
    private LatLng zzc;

    @q0
    @SafeParcelable.Field(getter = "getRadius", id = 5)
    private Integer zzd;

    @q0
    @SafeParcelable.Field(getter = "getUserNavigationEnabledForParcel", id = 6, type = "byte")
    private Boolean zze;

    @q0
    @SafeParcelable.Field(getter = "getZoomGesturesEnabledForParcel", id = 7, type = "byte")
    private Boolean zzf;

    @q0
    @SafeParcelable.Field(getter = "getPanningGesturesEnabledForParcel", id = 8, type = "byte")
    private Boolean zzg;

    @q0
    @SafeParcelable.Field(getter = "getStreetNamesEnabledForParcel", id = 9, type = "byte")
    private Boolean zzh;

    @q0
    @SafeParcelable.Field(getter = "getUseViewLifecycleInFragmentForParcel", id = 10, type = "byte")
    private Boolean zzi;

    @SafeParcelable.Field(getter = "getSource", id = 11)
    private StreetViewSource zzj;

    public StreetViewPanoramaOptions() {
        Boolean bool = Boolean.TRUE;
        this.zze = bool;
        this.zzf = bool;
        this.zzg = bool;
        this.zzh = bool;
        this.zzj = StreetViewSource.DEFAULT;
    }

    @q0
    public Boolean getPanningGesturesEnabled() {
        return this.zzg;
    }

    @q0
    public String getPanoramaId() {
        return this.zzb;
    }

    @q0
    public LatLng getPosition() {
        return this.zzc;
    }

    @q0
    public Integer getRadius() {
        return this.zzd;
    }

    @o0
    public StreetViewSource getSource() {
        return this.zzj;
    }

    @q0
    public Boolean getStreetNamesEnabled() {
        return this.zzh;
    }

    @q0
    public StreetViewPanoramaCamera getStreetViewPanoramaCamera() {
        return this.zza;
    }

    @q0
    public Boolean getUseViewLifecycleInFragment() {
        return this.zzi;
    }

    @q0
    public Boolean getUserNavigationEnabled() {
        return this.zze;
    }

    @q0
    public Boolean getZoomGesturesEnabled() {
        return this.zzf;
    }

    @o0
    public StreetViewPanoramaOptions panningGesturesEnabled(boolean z4) {
        this.zzg = Boolean.valueOf(z4);
        return this;
    }

    @o0
    public StreetViewPanoramaOptions panoramaCamera(@q0 StreetViewPanoramaCamera streetViewPanoramaCamera) {
        this.zza = streetViewPanoramaCamera;
        return this;
    }

    @o0
    public StreetViewPanoramaOptions panoramaId(@q0 String str) {
        this.zzb = str;
        return this;
    }

    @o0
    public StreetViewPanoramaOptions position(@q0 LatLng latLng) {
        this.zzc = latLng;
        return this;
    }

    @o0
    public StreetViewPanoramaOptions streetNamesEnabled(boolean z4) {
        this.zzh = Boolean.valueOf(z4);
        return this;
    }

    @o0
    public String toString() {
        return Objects.toStringHelper(this).add(ProtectedSandApp.s("\uda54"), this.zzb).add(ProtectedSandApp.s("\uda55"), this.zzc).add(ProtectedSandApp.s("\uda56"), this.zzd).add(ProtectedSandApp.s("\uda57"), this.zzj).add(ProtectedSandApp.s("\uda58"), this.zza).add(ProtectedSandApp.s("\uda59"), this.zze).add(ProtectedSandApp.s("\uda5a"), this.zzf).add(ProtectedSandApp.s("\uda5b"), this.zzg).add(ProtectedSandApp.s("\uda5c"), this.zzh).add(ProtectedSandApp.s("\uda5d"), this.zzi).toString();
    }

    @o0
    public StreetViewPanoramaOptions useViewLifecycleInFragment(boolean z4) {
        this.zzi = Boolean.valueOf(z4);
        return this;
    }

    @o0
    public StreetViewPanoramaOptions userNavigationEnabled(boolean z4) {
        this.zze = Boolean.valueOf(z4);
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getStreetViewPanoramaCamera(), i4, false);
        SafeParcelWriter.writeString(parcel, 3, getPanoramaId(), false);
        SafeParcelWriter.writeParcelable(parcel, 4, getPosition(), i4, false);
        SafeParcelWriter.writeIntegerObject(parcel, 5, getRadius(), false);
        SafeParcelWriter.writeByte(parcel, 6, com.google.android.gms.maps.internal.zza.zza(this.zze));
        SafeParcelWriter.writeByte(parcel, 7, com.google.android.gms.maps.internal.zza.zza(this.zzf));
        SafeParcelWriter.writeByte(parcel, 8, com.google.android.gms.maps.internal.zza.zza(this.zzg));
        SafeParcelWriter.writeByte(parcel, 9, com.google.android.gms.maps.internal.zza.zza(this.zzh));
        SafeParcelWriter.writeByte(parcel, 10, com.google.android.gms.maps.internal.zza.zza(this.zzi));
        SafeParcelWriter.writeParcelable(parcel, 11, getSource(), i4, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @o0
    public StreetViewPanoramaOptions zoomGesturesEnabled(boolean z4) {
        this.zzf = Boolean.valueOf(z4);
        return this;
    }

    @o0
    public StreetViewPanoramaOptions position(@q0 LatLng latLng, @o0 StreetViewSource streetViewSource) {
        this.zzc = latLng;
        this.zzj = streetViewSource;
        return this;
    }

    @o0
    public StreetViewPanoramaOptions position(@q0 LatLng latLng, @q0 Integer num) {
        this.zzc = latLng;
        this.zzd = num;
        return this;
    }

    @SafeParcelable.Constructor
    StreetViewPanoramaOptions(@q0 @SafeParcelable.Param(id = 2) StreetViewPanoramaCamera streetViewPanoramaCamera, @q0 @SafeParcelable.Param(id = 3) String str, @q0 @SafeParcelable.Param(id = 4) LatLng latLng, @q0 @SafeParcelable.Param(id = 5) Integer num, @SafeParcelable.Param(id = 6) byte b5, @SafeParcelable.Param(id = 7) byte b6, @SafeParcelable.Param(id = 8) byte b7, @SafeParcelable.Param(id = 9) byte b10, @SafeParcelable.Param(id = 10) byte b11, @SafeParcelable.Param(id = 11) StreetViewSource streetViewSource) {
        Boolean bool = Boolean.TRUE;
        this.zze = bool;
        this.zzf = bool;
        this.zzg = bool;
        this.zzh = bool;
        this.zzj = StreetViewSource.DEFAULT;
        this.zza = streetViewPanoramaCamera;
        this.zzc = latLng;
        this.zzd = num;
        this.zzb = str;
        this.zze = com.google.android.gms.maps.internal.zza.zzb(b5);
        this.zzf = com.google.android.gms.maps.internal.zza.zzb(b6);
        this.zzg = com.google.android.gms.maps.internal.zza.zzb(b7);
        this.zzh = com.google.android.gms.maps.internal.zza.zzb(b10);
        this.zzi = com.google.android.gms.maps.internal.zza.zzb(b11);
        this.zzj = streetViewSource;
    }

    @o0
    public StreetViewPanoramaOptions position(@q0 LatLng latLng, @q0 Integer num, @o0 StreetViewSource streetViewSource) {
        this.zzc = latLng;
        this.zzd = num;
        this.zzj = streetViewSource;
        return this;
    }
}
