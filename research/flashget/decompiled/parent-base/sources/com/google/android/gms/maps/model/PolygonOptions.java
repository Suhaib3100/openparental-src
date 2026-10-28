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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
@SafeParcelable.Class(creator = "PolygonOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public final class PolygonOptions extends AbstractSafeParcelable {

    @o0
    public static final Parcelable.Creator<PolygonOptions> CREATOR = new zzq();

    @SafeParcelable.Field(getter = "getPoints", id = 2)
    private final List zza;

    @SafeParcelable.Field(getter = "getHolesForParcel", id = 3, type = "java.util.List")
    private final List zzb;

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

    @SafeParcelable.Field(getter = "isGeodesic", id = 9)
    private boolean zzh;

    @SafeParcelable.Field(getter = "isClickable", id = 10)
    private boolean zzi;

    @SafeParcelable.Field(getter = "getStrokeJointType", id = 11)
    private int zzj;

    @q0
    @SafeParcelable.Field(getter = "getStrokePattern", id = 12)
    private List zzk;

    public PolygonOptions() {
        this.zzc = 10.0f;
        this.zzd = x1.f27484y;
        this.zze = 0;
        this.zzf = 0.0f;
        this.zzg = true;
        this.zzh = false;
        this.zzi = false;
        this.zzj = 0;
        this.zzk = null;
        this.zza = new ArrayList();
        this.zzb = new ArrayList();
    }

    @o0
    public PolygonOptions add(@o0 LatLng latLng) {
        Preconditions.checkNotNull(latLng, ProtectedSandApp.s("\udaf8"));
        this.zza.add(latLng);
        return this;
    }

    @o0
    public PolygonOptions addAll(@o0 Iterable<LatLng> iterable) {
        Preconditions.checkNotNull(iterable, ProtectedSandApp.s("\udaf9"));
        Iterator<LatLng> it = iterable.iterator();
        while (it.hasNext()) {
            this.zza.add(it.next());
        }
        return this;
    }

    @o0
    public PolygonOptions addHole(@o0 Iterable<LatLng> iterable) {
        Preconditions.checkNotNull(iterable, ProtectedSandApp.s("\udaf9"));
        ArrayList arrayList = new ArrayList();
        Iterator<LatLng> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        this.zzb.add(arrayList);
        return this;
    }

    @o0
    public PolygonOptions clickable(boolean z4) {
        this.zzi = z4;
        return this;
    }

    @o0
    public PolygonOptions fillColor(int i4) {
        this.zze = i4;
        return this;
    }

    @o0
    public PolygonOptions geodesic(boolean z4) {
        this.zzh = z4;
        return this;
    }

    public int getFillColor() {
        return this.zze;
    }

    @o0
    public List<List<LatLng>> getHoles() {
        return this.zzb;
    }

    @o0
    public List<LatLng> getPoints() {
        return this.zza;
    }

    public int getStrokeColor() {
        return this.zzd;
    }

    public int getStrokeJointType() {
        return this.zzj;
    }

    @q0
    public List<PatternItem> getStrokePattern() {
        return this.zzk;
    }

    public float getStrokeWidth() {
        return this.zzc;
    }

    public float getZIndex() {
        return this.zzf;
    }

    public boolean isClickable() {
        return this.zzi;
    }

    public boolean isGeodesic() {
        return this.zzh;
    }

    public boolean isVisible() {
        return this.zzg;
    }

    @o0
    public PolygonOptions strokeColor(int i4) {
        this.zzd = i4;
        return this;
    }

    @o0
    public PolygonOptions strokeJointType(int i4) {
        this.zzj = i4;
        return this;
    }

    @o0
    public PolygonOptions strokePattern(@q0 List<PatternItem> list) {
        this.zzk = list;
        return this;
    }

    @o0
    public PolygonOptions strokeWidth(float f4) {
        this.zzc = f4;
        return this;
    }

    @o0
    public PolygonOptions visible(boolean z4) {
        this.zzg = z4;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 2, getPoints(), false);
        SafeParcelWriter.writeList(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeFloat(parcel, 4, getStrokeWidth());
        SafeParcelWriter.writeInt(parcel, 5, getStrokeColor());
        SafeParcelWriter.writeInt(parcel, 6, getFillColor());
        SafeParcelWriter.writeFloat(parcel, 7, getZIndex());
        SafeParcelWriter.writeBoolean(parcel, 8, isVisible());
        SafeParcelWriter.writeBoolean(parcel, 9, isGeodesic());
        SafeParcelWriter.writeBoolean(parcel, 10, isClickable());
        SafeParcelWriter.writeInt(parcel, 11, getStrokeJointType());
        SafeParcelWriter.writeTypedList(parcel, 12, getStrokePattern(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @o0
    public PolygonOptions zIndex(float f4) {
        this.zzf = f4;
        return this;
    }

    @o0
    public PolygonOptions add(@o0 LatLng... latLngArr) {
        Preconditions.checkNotNull(latLngArr, ProtectedSandApp.s("\udaf9"));
        this.zza.addAll(Arrays.asList(latLngArr));
        return this;
    }

    @SafeParcelable.Constructor
    PolygonOptions(@SafeParcelable.Param(id = 2) List list, @SafeParcelable.Param(id = 3) List list2, @SafeParcelable.Param(id = 4) float f4, @SafeParcelable.Param(id = 5) int i4, @SafeParcelable.Param(id = 6) int i5, @SafeParcelable.Param(id = 7) float f5, @SafeParcelable.Param(id = 8) boolean z4, @SafeParcelable.Param(id = 9) boolean z5, @SafeParcelable.Param(id = 10) boolean z6, @SafeParcelable.Param(id = 11) int i6, @q0 @SafeParcelable.Param(id = 12) List list3) {
        this.zza = list;
        this.zzb = list2;
        this.zzc = f4;
        this.zzd = i4;
        this.zze = i5;
        this.zzf = f5;
        this.zzg = z4;
        this.zzh = z5;
        this.zzi = z6;
        this.zzj = i6;
        this.zzk = list3;
    }
}
