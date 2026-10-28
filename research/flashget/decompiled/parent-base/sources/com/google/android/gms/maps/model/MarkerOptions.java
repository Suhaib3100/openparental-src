package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.model.AdvancedMarkerOptions;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
@SafeParcelable.Class(creator = "MarkerOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public class MarkerOptions extends AbstractSafeParcelable {

    @o0
    public static final Parcelable.Creator<MarkerOptions> CREATOR = new zzl();

    @SafeParcelable.Field(getter = "getPosition", id = 2)
    private LatLng zza;

    @q0
    @SafeParcelable.Field(getter = "getTitle", id = 3)
    private String zzb;

    @q0
    @SafeParcelable.Field(getter = "getSnippet", id = 4)
    private String zzc;

    @q0
    @SafeParcelable.Field(getter = "getWrappedIconDescriptorImplBinder", id = 5, type = "android.os.IBinder")
    private BitmapDescriptor zzd;

    @SafeParcelable.Field(getter = "getAnchorU", id = 6)
    private float zze;

    @SafeParcelable.Field(getter = "getAnchorV", id = 7)
    private float zzf;

    @SafeParcelable.Field(getter = "isDraggable", id = 8)
    private boolean zzg;

    @SafeParcelable.Field(getter = "isVisible", id = 9)
    private boolean zzh;

    @SafeParcelable.Field(getter = "isFlat", id = 10)
    private boolean zzi;

    @SafeParcelable.Field(getter = "getRotation", id = 11)
    private float zzj;

    @SafeParcelable.Field(defaultValue = "0.5f", getter = "getInfoWindowAnchorU", id = 12)
    private float zzk;

    @SafeParcelable.Field(getter = "getInfoWindowAnchorV", id = 13)
    private float zzl;

    @SafeParcelable.Field(defaultValue = "1.0f", getter = "getAlpha", id = 14)
    private float zzm;

    @SafeParcelable.Field(getter = "getZIndex", id = 15)
    private float zzn;

    @AdvancedMarkerOptions.CollisionBehavior
    @SafeParcelable.Field(getter = "getCollisionBehaviorInternal", id = 17)
    private int zzo;

    @q0
    @SafeParcelable.Field(getter = "getIconViewBinder", id = 18, type = "android.os.IBinder")
    private View zzp;

    @SafeParcelable.Field(getter = "getMarkerType", id = 19)
    private int zzq;

    @q0
    @SafeParcelable.Field(getter = "getContentDescription", id = 20)
    private String zzr;

    @SafeParcelable.Field(getter = "getAltitudeInternal", id = 21)
    private float zzs;

    public MarkerOptions() {
        this.zze = 0.5f;
        this.zzf = 1.0f;
        this.zzh = true;
        this.zzi = false;
        this.zzj = 0.0f;
        this.zzk = 0.5f;
        this.zzl = 0.0f;
        this.zzm = 1.0f;
        this.zzo = 0;
    }

    @o0
    public MarkerOptions alpha(float f4) {
        this.zzm = f4;
        return this;
    }

    @o0
    public MarkerOptions anchor(float f4, float f5) {
        this.zze = f4;
        this.zzf = f5;
        return this;
    }

    @o0
    public MarkerOptions contentDescription(@q0 String str) {
        this.zzr = str;
        return this;
    }

    @o0
    public MarkerOptions draggable(boolean z4) {
        this.zzg = z4;
        return this;
    }

    @o0
    public MarkerOptions flat(boolean z4) {
        this.zzi = z4;
        return this;
    }

    public float getAlpha() {
        return this.zzm;
    }

    public float getAnchorU() {
        return this.zze;
    }

    public float getAnchorV() {
        return this.zzf;
    }

    @q0
    public BitmapDescriptor getIcon() {
        return this.zzd;
    }

    public float getInfoWindowAnchorU() {
        return this.zzk;
    }

    public float getInfoWindowAnchorV() {
        return this.zzl;
    }

    @o0
    public LatLng getPosition() {
        return this.zza;
    }

    public float getRotation() {
        return this.zzj;
    }

    @q0
    public String getSnippet() {
        return this.zzc;
    }

    @q0
    public String getTitle() {
        return this.zzb;
    }

    public float getZIndex() {
        return this.zzn;
    }

    @o0
    public MarkerOptions icon(@q0 BitmapDescriptor bitmapDescriptor) {
        this.zzd = bitmapDescriptor;
        return this;
    }

    @o0
    public MarkerOptions infoWindowAnchor(float f4, float f5) {
        this.zzk = f4;
        this.zzl = f5;
        return this;
    }

    public boolean isDraggable() {
        return this.zzg;
    }

    public boolean isFlat() {
        return this.zzi;
    }

    public boolean isVisible() {
        return this.zzh;
    }

    @o0
    public MarkerOptions position(@o0 LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\udab5"));
        }
        this.zza = latLng;
        return this;
    }

    @o0
    public MarkerOptions rotation(float f4) {
        this.zzj = f4;
        return this;
    }

    @o0
    public MarkerOptions snippet(@q0 String str) {
        this.zzc = str;
        return this;
    }

    @o0
    public MarkerOptions title(@q0 String str) {
        this.zzb = str;
        return this;
    }

    @o0
    public MarkerOptions visible(boolean z4) {
        this.zzh = z4;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getPosition(), i4, false);
        SafeParcelWriter.writeString(parcel, 3, getTitle(), false);
        SafeParcelWriter.writeString(parcel, 4, getSnippet(), false);
        BitmapDescriptor bitmapDescriptor = this.zzd;
        SafeParcelWriter.writeIBinder(parcel, 5, bitmapDescriptor == null ? null : bitmapDescriptor.zza().asBinder(), false);
        SafeParcelWriter.writeFloat(parcel, 6, getAnchorU());
        SafeParcelWriter.writeFloat(parcel, 7, getAnchorV());
        SafeParcelWriter.writeBoolean(parcel, 8, isDraggable());
        SafeParcelWriter.writeBoolean(parcel, 9, isVisible());
        SafeParcelWriter.writeBoolean(parcel, 10, isFlat());
        SafeParcelWriter.writeFloat(parcel, 11, getRotation());
        SafeParcelWriter.writeFloat(parcel, 12, getInfoWindowAnchorU());
        SafeParcelWriter.writeFloat(parcel, 13, getInfoWindowAnchorV());
        SafeParcelWriter.writeFloat(parcel, 14, getAlpha());
        SafeParcelWriter.writeFloat(parcel, 15, getZIndex());
        SafeParcelWriter.writeInt(parcel, 17, this.zzo);
        SafeParcelWriter.writeIBinder(parcel, 18, ObjectWrapper.wrap(this.zzp).asBinder(), false);
        SafeParcelWriter.writeInt(parcel, 19, this.zzq);
        SafeParcelWriter.writeString(parcel, 20, this.zzr, false);
        SafeParcelWriter.writeFloat(parcel, 21, this.zzs);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @o0
    public MarkerOptions zIndex(float f4) {
        this.zzn = f4;
        return this;
    }

    public final int zza() {
        return this.zzo;
    }

    public final int zzb() {
        return this.zzq;
    }

    @q0
    public final View zzc() {
        return this.zzp;
    }

    @o0
    public final MarkerOptions zzd(@AdvancedMarkerOptions.CollisionBehavior int i4) {
        this.zzo = i4;
        return this;
    }

    @o0
    public final MarkerOptions zze(@q0 View view) {
        this.zzp = view;
        return this;
    }

    @o0
    public final MarkerOptions zzf(int i4) {
        this.zzq = 1;
        return this;
    }

    @SafeParcelable.Constructor
    MarkerOptions(@SafeParcelable.Param(id = 2) LatLng latLng, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) String str2, @q0 @SafeParcelable.Param(id = 5) IBinder iBinder, @SafeParcelable.Param(id = 6) float f4, @SafeParcelable.Param(id = 7) float f5, @SafeParcelable.Param(id = 8) boolean z4, @SafeParcelable.Param(id = 9) boolean z5, @SafeParcelable.Param(id = 10) boolean z6, @SafeParcelable.Param(id = 11) float f6, @SafeParcelable.Param(id = 12) float f7, @SafeParcelable.Param(id = 13) float f10, @SafeParcelable.Param(id = 14) float f11, @SafeParcelable.Param(id = 15) float f12, @SafeParcelable.Param(id = 17) int i4, @SafeParcelable.Param(id = 18) IBinder iBinder2, @SafeParcelable.Param(id = 19) int i5, @SafeParcelable.Param(id = 20) String str3, @SafeParcelable.Param(id = 21) float f13) {
        this.zze = 0.5f;
        this.zzf = 1.0f;
        this.zzh = true;
        this.zzi = false;
        this.zzj = 0.0f;
        this.zzk = 0.5f;
        this.zzl = 0.0f;
        this.zzm = 1.0f;
        this.zzo = 0;
        this.zza = latLng;
        this.zzb = str;
        this.zzc = str2;
        if (iBinder == null) {
            this.zzd = null;
        } else {
            this.zzd = new BitmapDescriptor(IObjectWrapper.Stub.asInterface(iBinder));
        }
        this.zze = f4;
        this.zzf = f5;
        this.zzg = z4;
        this.zzh = z5;
        this.zzi = z6;
        this.zzj = f6;
        this.zzk = f7;
        this.zzl = f10;
        this.zzm = f11;
        this.zzn = f12;
        this.zzq = i5;
        this.zzo = i4;
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(iBinder2);
        this.zzp = asInterface != null ? (View) ObjectWrapper.unwrap(asInterface) : null;
        this.zzr = str3;
        this.zzs = f13;
    }
}
