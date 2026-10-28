package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.annotation.l;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
@SafeParcelable.Class(creator = "GoogleMapOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {

    @o0
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new zzac();
    private static final Integer zza = Integer.valueOf(Color.argb(255, 236, 233, 225));

    @q0
    @SafeParcelable.Field(defaultValue = "-1", getter = "getZOrderOnTopForParcel", id = 2, type = "byte")
    private Boolean zzb;

    @q0
    @SafeParcelable.Field(defaultValue = "-1", getter = "getUseViewLifecycleInFragmentForParcel", id = 3, type = "byte")
    private Boolean zzc;

    @SafeParcelable.Field(getter = "getMapType", id = 4)
    private int zzd;

    @q0
    @SafeParcelable.Field(getter = "getCamera", id = 5)
    private CameraPosition zze;

    @q0
    @SafeParcelable.Field(defaultValue = "-1", getter = "getZoomControlsEnabledForParcel", id = 6, type = "byte")
    private Boolean zzf;

    @q0
    @SafeParcelable.Field(defaultValue = "-1", getter = "getCompassEnabledForParcel", id = 7, type = "byte")
    private Boolean zzg;

    @q0
    @SafeParcelable.Field(defaultValue = "-1", getter = "getScrollGesturesEnabledForParcel", id = 8, type = "byte")
    private Boolean zzh;

    @q0
    @SafeParcelable.Field(defaultValue = "-1", getter = "getZoomGesturesEnabledForParcel", id = 9, type = "byte")
    private Boolean zzi;

    @q0
    @SafeParcelable.Field(defaultValue = "-1", getter = "getTiltGesturesEnabledForParcel", id = 10, type = "byte")
    private Boolean zzj;

    @q0
    @SafeParcelable.Field(defaultValue = "-1", getter = "getRotateGesturesEnabledForParcel", id = 11, type = "byte")
    private Boolean zzk;

    @q0
    @SafeParcelable.Field(defaultValue = "-1", getter = "getLiteModeForParcel", id = 12, type = "byte")
    private Boolean zzl;

    @q0
    @SafeParcelable.Field(defaultValue = "-1", getter = "getMapToolbarEnabledForParcel", id = 14, type = "byte")
    private Boolean zzm;

    @q0
    @SafeParcelable.Field(defaultValue = "-1", getter = "getAmbientEnabledForParcel", id = 15, type = "byte")
    private Boolean zzn;

    @q0
    @SafeParcelable.Field(getter = "getMinZoomPreference", id = 16)
    private Float zzo;

    @q0
    @SafeParcelable.Field(getter = "getMaxZoomPreference", id = 17)
    private Float zzp;

    @q0
    @SafeParcelable.Field(getter = "getLatLngBoundsForCameraTarget", id = 18)
    private LatLngBounds zzq;

    @q0
    @SafeParcelable.Field(defaultValue = "-1", getter = "getScrollGesturesEnabledDuringRotateOrZoomForParcel", id = 19, type = "byte")
    private Boolean zzr;

    @l
    @q0
    @SafeParcelable.Field(getter = "getBackgroundColor", id = 20)
    private Integer zzs;

    @q0
    @SafeParcelable.Field(getter = "getMapId", id = 21)
    private String zzt;

    public GoogleMapOptions() {
        this.zzd = -1;
        this.zzo = null;
        this.zzp = null;
        this.zzq = null;
        this.zzs = null;
        this.zzt = null;
    }

    @q0
    public static GoogleMapOptions createFromAttributes(@q0 Context context, @q0 AttributeSet attributeSet) {
        String string;
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.MapAttrs);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        int i4 = R.styleable.MapAttrs_mapType;
        if (obtainAttributes.hasValue(i4)) {
            googleMapOptions.mapType(obtainAttributes.getInt(i4, -1));
        }
        int i5 = R.styleable.MapAttrs_zOrderOnTop;
        if (obtainAttributes.hasValue(i5)) {
            googleMapOptions.zOrderOnTop(obtainAttributes.getBoolean(i5, false));
        }
        int i6 = R.styleable.MapAttrs_useViewLifecycle;
        if (obtainAttributes.hasValue(i6)) {
            googleMapOptions.useViewLifecycleInFragment(obtainAttributes.getBoolean(i6, false));
        }
        int i7 = R.styleable.MapAttrs_uiCompass;
        if (obtainAttributes.hasValue(i7)) {
            googleMapOptions.compassEnabled(obtainAttributes.getBoolean(i7, true));
        }
        int i10 = R.styleable.MapAttrs_uiRotateGestures;
        if (obtainAttributes.hasValue(i10)) {
            googleMapOptions.rotateGesturesEnabled(obtainAttributes.getBoolean(i10, true));
        }
        int i11 = R.styleable.MapAttrs_uiScrollGesturesDuringRotateOrZoom;
        if (obtainAttributes.hasValue(i11)) {
            googleMapOptions.scrollGesturesEnabledDuringRotateOrZoom(obtainAttributes.getBoolean(i11, true));
        }
        int i12 = R.styleable.MapAttrs_uiScrollGestures;
        if (obtainAttributes.hasValue(i12)) {
            googleMapOptions.scrollGesturesEnabled(obtainAttributes.getBoolean(i12, true));
        }
        int i13 = R.styleable.MapAttrs_uiTiltGestures;
        if (obtainAttributes.hasValue(i13)) {
            googleMapOptions.tiltGesturesEnabled(obtainAttributes.getBoolean(i13, true));
        }
        int i14 = R.styleable.MapAttrs_uiZoomGestures;
        if (obtainAttributes.hasValue(i14)) {
            googleMapOptions.zoomGesturesEnabled(obtainAttributes.getBoolean(i14, true));
        }
        int i15 = R.styleable.MapAttrs_uiZoomControls;
        if (obtainAttributes.hasValue(i15)) {
            googleMapOptions.zoomControlsEnabled(obtainAttributes.getBoolean(i15, true));
        }
        int i16 = R.styleable.MapAttrs_liteMode;
        if (obtainAttributes.hasValue(i16)) {
            googleMapOptions.liteMode(obtainAttributes.getBoolean(i16, false));
        }
        int i17 = R.styleable.MapAttrs_uiMapToolbar;
        if (obtainAttributes.hasValue(i17)) {
            googleMapOptions.mapToolbarEnabled(obtainAttributes.getBoolean(i17, true));
        }
        int i18 = R.styleable.MapAttrs_ambientEnabled;
        if (obtainAttributes.hasValue(i18)) {
            googleMapOptions.ambientEnabled(obtainAttributes.getBoolean(i18, false));
        }
        int i19 = R.styleable.MapAttrs_cameraMinZoomPreference;
        if (obtainAttributes.hasValue(i19)) {
            googleMapOptions.minZoomPreference(obtainAttributes.getFloat(i19, Float.NEGATIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(i19)) {
            googleMapOptions.maxZoomPreference(obtainAttributes.getFloat(R.styleable.MapAttrs_cameraMaxZoomPreference, Float.POSITIVE_INFINITY));
        }
        int i20 = R.styleable.MapAttrs_backgroundColor;
        if (obtainAttributes.hasValue(i20)) {
            googleMapOptions.backgroundColor(Integer.valueOf(obtainAttributes.getColor(i20, zza.intValue())));
        }
        int i21 = R.styleable.MapAttrs_mapId;
        if (obtainAttributes.hasValue(i21) && (string = obtainAttributes.getString(i21)) != null && !string.isEmpty()) {
            googleMapOptions.mapId(string);
        }
        googleMapOptions.latLngBoundsForCameraTarget(zzb(context, attributeSet));
        googleMapOptions.camera(zza(context, attributeSet));
        obtainAttributes.recycle();
        return googleMapOptions;
    }

    @q0
    public static CameraPosition zza(@q0 Context context, @q0 AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.MapAttrs);
        int i4 = R.styleable.MapAttrs_cameraTargetLat;
        LatLng latLng = new LatLng(obtainAttributes.hasValue(i4) ? obtainAttributes.getFloat(i4, 0.0f) : 0.0f, obtainAttributes.hasValue(R.styleable.MapAttrs_cameraTargetLng) ? obtainAttributes.getFloat(r0, 0.0f) : 0.0f);
        CameraPosition.Builder builder = CameraPosition.builder();
        builder.target(latLng);
        int i5 = R.styleable.MapAttrs_cameraZoom;
        if (obtainAttributes.hasValue(i5)) {
            builder.zoom(obtainAttributes.getFloat(i5, 0.0f));
        }
        int i6 = R.styleable.MapAttrs_cameraBearing;
        if (obtainAttributes.hasValue(i6)) {
            builder.bearing(obtainAttributes.getFloat(i6, 0.0f));
        }
        int i7 = R.styleable.MapAttrs_cameraTilt;
        if (obtainAttributes.hasValue(i7)) {
            builder.tilt(obtainAttributes.getFloat(i7, 0.0f));
        }
        obtainAttributes.recycle();
        return builder.build();
    }

    @q0
    public static LatLngBounds zzb(@q0 Context context, @q0 AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.MapAttrs);
        int i4 = R.styleable.MapAttrs_latLngBoundsSouthWestLatitude;
        Float valueOf = obtainAttributes.hasValue(i4) ? Float.valueOf(obtainAttributes.getFloat(i4, 0.0f)) : null;
        int i5 = R.styleable.MapAttrs_latLngBoundsSouthWestLongitude;
        Float valueOf2 = obtainAttributes.hasValue(i5) ? Float.valueOf(obtainAttributes.getFloat(i5, 0.0f)) : null;
        int i6 = R.styleable.MapAttrs_latLngBoundsNorthEastLatitude;
        Float valueOf3 = obtainAttributes.hasValue(i6) ? Float.valueOf(obtainAttributes.getFloat(i6, 0.0f)) : null;
        int i7 = R.styleable.MapAttrs_latLngBoundsNorthEastLongitude;
        Float valueOf4 = obtainAttributes.hasValue(i7) ? Float.valueOf(obtainAttributes.getFloat(i7, 0.0f)) : null;
        obtainAttributes.recycle();
        if (valueOf == null || valueOf2 == null || valueOf3 == null || valueOf4 == null) {
            return null;
        }
        return new LatLngBounds(new LatLng(valueOf.floatValue(), valueOf2.floatValue()), new LatLng(valueOf3.floatValue(), valueOf4.floatValue()));
    }

    @o0
    public GoogleMapOptions ambientEnabled(boolean z4) {
        this.zzn = Boolean.valueOf(z4);
        return this;
    }

    @o0
    public GoogleMapOptions backgroundColor(@l @q0 Integer num) {
        this.zzs = num;
        return this;
    }

    @o0
    public GoogleMapOptions camera(@q0 CameraPosition cameraPosition) {
        this.zze = cameraPosition;
        return this;
    }

    @o0
    public GoogleMapOptions compassEnabled(boolean z4) {
        this.zzg = Boolean.valueOf(z4);
        return this;
    }

    @q0
    public Boolean getAmbientEnabled() {
        return this.zzn;
    }

    @l
    @q0
    public Integer getBackgroundColor() {
        return this.zzs;
    }

    @q0
    public CameraPosition getCamera() {
        return this.zze;
    }

    @q0
    public Boolean getCompassEnabled() {
        return this.zzg;
    }

    @q0
    public LatLngBounds getLatLngBoundsForCameraTarget() {
        return this.zzq;
    }

    @q0
    public Boolean getLiteMode() {
        return this.zzl;
    }

    @q0
    public String getMapId() {
        return this.zzt;
    }

    @q0
    public Boolean getMapToolbarEnabled() {
        return this.zzm;
    }

    public int getMapType() {
        return this.zzd;
    }

    @q0
    public Float getMaxZoomPreference() {
        return this.zzp;
    }

    @q0
    public Float getMinZoomPreference() {
        return this.zzo;
    }

    @q0
    public Boolean getRotateGesturesEnabled() {
        return this.zzk;
    }

    @q0
    public Boolean getScrollGesturesEnabled() {
        return this.zzh;
    }

    @q0
    public Boolean getScrollGesturesEnabledDuringRotateOrZoom() {
        return this.zzr;
    }

    @q0
    public Boolean getTiltGesturesEnabled() {
        return this.zzj;
    }

    @q0
    public Boolean getUseViewLifecycleInFragment() {
        return this.zzc;
    }

    @q0
    public Boolean getZOrderOnTop() {
        return this.zzb;
    }

    @q0
    public Boolean getZoomControlsEnabled() {
        return this.zzf;
    }

    @q0
    public Boolean getZoomGesturesEnabled() {
        return this.zzi;
    }

    @o0
    public GoogleMapOptions latLngBoundsForCameraTarget(@q0 LatLngBounds latLngBounds) {
        this.zzq = latLngBounds;
        return this;
    }

    @o0
    public GoogleMapOptions liteMode(boolean z4) {
        this.zzl = Boolean.valueOf(z4);
        return this;
    }

    @o0
    public GoogleMapOptions mapId(@o0 String str) {
        this.zzt = str;
        return this;
    }

    @o0
    public GoogleMapOptions mapToolbarEnabled(boolean z4) {
        this.zzm = Boolean.valueOf(z4);
        return this;
    }

    @o0
    public GoogleMapOptions mapType(int i4) {
        this.zzd = i4;
        return this;
    }

    @o0
    public GoogleMapOptions maxZoomPreference(float f4) {
        this.zzp = Float.valueOf(f4);
        return this;
    }

    @o0
    public GoogleMapOptions minZoomPreference(float f4) {
        this.zzo = Float.valueOf(f4);
        return this;
    }

    @o0
    public GoogleMapOptions rotateGesturesEnabled(boolean z4) {
        this.zzk = Boolean.valueOf(z4);
        return this;
    }

    @o0
    public GoogleMapOptions scrollGesturesEnabled(boolean z4) {
        this.zzh = Boolean.valueOf(z4);
        return this;
    }

    @o0
    public GoogleMapOptions scrollGesturesEnabledDuringRotateOrZoom(boolean z4) {
        this.zzr = Boolean.valueOf(z4);
        return this;
    }

    @o0
    public GoogleMapOptions tiltGesturesEnabled(boolean z4) {
        this.zzj = Boolean.valueOf(z4);
        return this;
    }

    @o0
    public String toString() {
        return Objects.toStringHelper(this).add(ProtectedSandApp.s("\uda2f"), Integer.valueOf(this.zzd)).add(ProtectedSandApp.s("\uda30"), this.zzl).add(ProtectedSandApp.s("\uda31"), this.zze).add(ProtectedSandApp.s("\uda32"), this.zzg).add(ProtectedSandApp.s("\uda33"), this.zzf).add(ProtectedSandApp.s("\uda34"), this.zzh).add(ProtectedSandApp.s("\uda35"), this.zzi).add(ProtectedSandApp.s("\uda36"), this.zzj).add(ProtectedSandApp.s("\uda37"), this.zzk).add(ProtectedSandApp.s("\uda38"), this.zzr).add(ProtectedSandApp.s("\uda39"), this.zzm).add(ProtectedSandApp.s("\uda3a"), this.zzn).add(ProtectedSandApp.s("\uda3b"), this.zzo).add(ProtectedSandApp.s("\uda3c"), this.zzp).add(ProtectedSandApp.s("\uda3d"), this.zzs).add(ProtectedSandApp.s("\uda3e"), this.zzq).add(ProtectedSandApp.s("\uda3f"), this.zzb).add(ProtectedSandApp.s("\uda40"), this.zzc).toString();
    }

    @o0
    public GoogleMapOptions useViewLifecycleInFragment(boolean z4) {
        this.zzc = Boolean.valueOf(z4);
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByte(parcel, 2, com.google.android.gms.maps.internal.zza.zza(this.zzb));
        SafeParcelWriter.writeByte(parcel, 3, com.google.android.gms.maps.internal.zza.zza(this.zzc));
        SafeParcelWriter.writeInt(parcel, 4, getMapType());
        SafeParcelWriter.writeParcelable(parcel, 5, getCamera(), i4, false);
        SafeParcelWriter.writeByte(parcel, 6, com.google.android.gms.maps.internal.zza.zza(this.zzf));
        SafeParcelWriter.writeByte(parcel, 7, com.google.android.gms.maps.internal.zza.zza(this.zzg));
        SafeParcelWriter.writeByte(parcel, 8, com.google.android.gms.maps.internal.zza.zza(this.zzh));
        SafeParcelWriter.writeByte(parcel, 9, com.google.android.gms.maps.internal.zza.zza(this.zzi));
        SafeParcelWriter.writeByte(parcel, 10, com.google.android.gms.maps.internal.zza.zza(this.zzj));
        SafeParcelWriter.writeByte(parcel, 11, com.google.android.gms.maps.internal.zza.zza(this.zzk));
        SafeParcelWriter.writeByte(parcel, 12, com.google.android.gms.maps.internal.zza.zza(this.zzl));
        SafeParcelWriter.writeByte(parcel, 14, com.google.android.gms.maps.internal.zza.zza(this.zzm));
        SafeParcelWriter.writeByte(parcel, 15, com.google.android.gms.maps.internal.zza.zza(this.zzn));
        SafeParcelWriter.writeFloatObject(parcel, 16, getMinZoomPreference(), false);
        SafeParcelWriter.writeFloatObject(parcel, 17, getMaxZoomPreference(), false);
        SafeParcelWriter.writeParcelable(parcel, 18, getLatLngBoundsForCameraTarget(), i4, false);
        SafeParcelWriter.writeByte(parcel, 19, com.google.android.gms.maps.internal.zza.zza(this.zzr));
        SafeParcelWriter.writeIntegerObject(parcel, 20, getBackgroundColor(), false);
        SafeParcelWriter.writeString(parcel, 21, getMapId(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @o0
    public GoogleMapOptions zOrderOnTop(boolean z4) {
        this.zzb = Boolean.valueOf(z4);
        return this;
    }

    @o0
    public GoogleMapOptions zoomControlsEnabled(boolean z4) {
        this.zzf = Boolean.valueOf(z4);
        return this;
    }

    @o0
    public GoogleMapOptions zoomGesturesEnabled(boolean z4) {
        this.zzi = Boolean.valueOf(z4);
        return this;
    }

    @SafeParcelable.Constructor
    GoogleMapOptions(@SafeParcelable.Param(id = 2) byte b5, @SafeParcelable.Param(id = 3) byte b6, @SafeParcelable.Param(id = 4) int i4, @q0 @SafeParcelable.Param(id = 5) CameraPosition cameraPosition, @SafeParcelable.Param(id = 6) byte b7, @SafeParcelable.Param(id = 7) byte b10, @SafeParcelable.Param(id = 8) byte b11, @SafeParcelable.Param(id = 9) byte b12, @SafeParcelable.Param(id = 10) byte b13, @SafeParcelable.Param(id = 11) byte b14, @SafeParcelable.Param(id = 12) byte b15, @SafeParcelable.Param(id = 14) byte b16, @SafeParcelable.Param(id = 15) byte b17, @q0 @SafeParcelable.Param(id = 16) Float f4, @q0 @SafeParcelable.Param(id = 17) Float f5, @q0 @SafeParcelable.Param(id = 18) LatLngBounds latLngBounds, @SafeParcelable.Param(id = 19) byte b18, @l @q0 @SafeParcelable.Param(id = 20) Integer num, @q0 @SafeParcelable.Param(id = 21) String str) {
        this.zzd = -1;
        this.zzo = null;
        this.zzp = null;
        this.zzq = null;
        this.zzs = null;
        this.zzt = null;
        this.zzb = com.google.android.gms.maps.internal.zza.zzb(b5);
        this.zzc = com.google.android.gms.maps.internal.zza.zzb(b6);
        this.zzd = i4;
        this.zze = cameraPosition;
        this.zzf = com.google.android.gms.maps.internal.zza.zzb(b7);
        this.zzg = com.google.android.gms.maps.internal.zza.zzb(b10);
        this.zzh = com.google.android.gms.maps.internal.zza.zzb(b11);
        this.zzi = com.google.android.gms.maps.internal.zza.zzb(b12);
        this.zzj = com.google.android.gms.maps.internal.zza.zzb(b13);
        this.zzk = com.google.android.gms.maps.internal.zza.zzb(b14);
        this.zzl = com.google.android.gms.maps.internal.zza.zzb(b15);
        this.zzm = com.google.android.gms.maps.internal.zza.zzb(b16);
        this.zzn = com.google.android.gms.maps.internal.zza.zzb(b17);
        this.zzo = f4;
        this.zzp = f5;
        this.zzq = latLngBounds;
        this.zzr = com.google.android.gms.maps.internal.zza.zzb(b18);
        this.zzs = num;
        this.zzt = str;
    }
}
