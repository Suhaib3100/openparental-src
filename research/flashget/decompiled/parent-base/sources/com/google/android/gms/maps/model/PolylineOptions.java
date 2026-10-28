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
import com.google.android.gms.maps.model.StrokeStyle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
@SafeParcelable.Class(creator = "PolylineOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public final class PolylineOptions extends AbstractSafeParcelable {

    @o0
    public static final Parcelable.Creator<PolylineOptions> CREATOR = new zzr();

    @SafeParcelable.Field(getter = "getPoints", id = 2)
    private final List zza;

    @SafeParcelable.Field(getter = "getWidth", id = 3)
    private float zzb;

    @SafeParcelable.Field(getter = "getColor", id = 4)
    private int zzc;

    @SafeParcelable.Field(getter = "getZIndex", id = 5)
    private float zzd;

    @SafeParcelable.Field(getter = "isVisible", id = 6)
    private boolean zze;

    @SafeParcelable.Field(getter = "isGeodesic", id = 7)
    private boolean zzf;

    @SafeParcelable.Field(getter = "isClickable", id = 8)
    private boolean zzg;

    @SafeParcelable.Field(getter = "getStartCap", id = 9)
    private Cap zzh;

    @SafeParcelable.Field(getter = "getEndCap", id = 10)
    private Cap zzi;

    @SafeParcelable.Field(getter = "getJointType", id = 11)
    private int zzj;

    @q0
    @SafeParcelable.Field(getter = "getPattern", id = 12)
    private List zzk;

    @SafeParcelable.Field(getter = "getSpans", id = 13)
    private List zzl;

    public PolylineOptions() {
        this.zzb = 10.0f;
        this.zzc = x1.f27484y;
        this.zzd = 0.0f;
        this.zze = true;
        this.zzf = false;
        this.zzg = false;
        this.zzh = new ButtCap();
        this.zzi = new ButtCap();
        this.zzj = 0;
        this.zzk = null;
        this.zzl = new ArrayList();
        this.zza = new ArrayList();
    }

    @o0
    public PolylineOptions add(@o0 LatLng latLng) {
        Preconditions.checkNotNull(this.zza, ProtectedSandApp.s("\udafd"));
        this.zza.add(latLng);
        return this;
    }

    @o0
    public PolylineOptions addAll(@o0 Iterable<LatLng> iterable) {
        Preconditions.checkNotNull(iterable, ProtectedSandApp.s("\udafe"));
        Iterator<LatLng> it = iterable.iterator();
        while (it.hasNext()) {
            this.zza.add(it.next());
        }
        return this;
    }

    @o0
    public PolylineOptions addAllSpans(@o0 Iterable<StyleSpan> iterable) {
        Iterator<StyleSpan> it = iterable.iterator();
        while (it.hasNext()) {
            addSpan(it.next());
        }
        return this;
    }

    @o0
    public PolylineOptions addSpan(@o0 StyleSpan styleSpan) {
        this.zzl.add(styleSpan);
        return this;
    }

    @o0
    public PolylineOptions clickable(boolean z4) {
        this.zzg = z4;
        return this;
    }

    @o0
    public PolylineOptions color(int i4) {
        this.zzc = i4;
        return this;
    }

    @o0
    public PolylineOptions endCap(@o0 Cap cap) {
        this.zzi = (Cap) Preconditions.checkNotNull(cap, ProtectedSandApp.s("\udaff"));
        return this;
    }

    @o0
    public PolylineOptions geodesic(boolean z4) {
        this.zzf = z4;
        return this;
    }

    public int getColor() {
        return this.zzc;
    }

    @o0
    public Cap getEndCap() {
        return this.zzi.zza();
    }

    public int getJointType() {
        return this.zzj;
    }

    @q0
    public List<PatternItem> getPattern() {
        return this.zzk;
    }

    @o0
    public List<LatLng> getPoints() {
        return this.zza;
    }

    @o0
    public Cap getStartCap() {
        return this.zzh.zza();
    }

    public float getWidth() {
        return this.zzb;
    }

    public float getZIndex() {
        return this.zzd;
    }

    public boolean isClickable() {
        return this.zzg;
    }

    public boolean isGeodesic() {
        return this.zzf;
    }

    public boolean isVisible() {
        return this.zze;
    }

    @o0
    public PolylineOptions jointType(int i4) {
        this.zzj = i4;
        return this;
    }

    @o0
    public PolylineOptions pattern(@q0 List<PatternItem> list) {
        this.zzk = list;
        return this;
    }

    @o0
    public PolylineOptions startCap(@o0 Cap cap) {
        this.zzh = (Cap) Preconditions.checkNotNull(cap, ProtectedSandApp.s("\udb00"));
        return this;
    }

    @o0
    public PolylineOptions visible(boolean z4) {
        this.zze = z4;
        return this;
    }

    @o0
    public PolylineOptions width(float f4) {
        this.zzb = f4;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 2, getPoints(), false);
        SafeParcelWriter.writeFloat(parcel, 3, getWidth());
        SafeParcelWriter.writeInt(parcel, 4, getColor());
        SafeParcelWriter.writeFloat(parcel, 5, getZIndex());
        SafeParcelWriter.writeBoolean(parcel, 6, isVisible());
        SafeParcelWriter.writeBoolean(parcel, 7, isGeodesic());
        SafeParcelWriter.writeBoolean(parcel, 8, isClickable());
        SafeParcelWriter.writeParcelable(parcel, 9, getStartCap(), i4, false);
        SafeParcelWriter.writeParcelable(parcel, 10, getEndCap(), i4, false);
        SafeParcelWriter.writeInt(parcel, 11, getJointType());
        SafeParcelWriter.writeTypedList(parcel, 12, getPattern(), false);
        ArrayList arrayList = new ArrayList(this.zzl.size());
        for (StyleSpan styleSpan : this.zzl) {
            StrokeStyle.Builder builder = new StrokeStyle.Builder(styleSpan.getStyle());
            builder.zzd(this.zzb);
            builder.zzc(this.zze);
            arrayList.add(new StyleSpan(builder.build(), styleSpan.getSegments()));
        }
        SafeParcelWriter.writeTypedList(parcel, 13, arrayList, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @o0
    public PolylineOptions zIndex(float f4) {
        this.zzd = f4;
        return this;
    }

    @o0
    public PolylineOptions addSpan(@o0 StyleSpan... styleSpanArr) {
        for (StyleSpan styleSpan : styleSpanArr) {
            addSpan(styleSpan);
        }
        return this;
    }

    @o0
    public PolylineOptions add(@o0 LatLng... latLngArr) {
        Preconditions.checkNotNull(latLngArr, ProtectedSandApp.s("\udafe"));
        Collections.addAll(this.zza, latLngArr);
        return this;
    }

    @SafeParcelable.Constructor
    PolylineOptions(@SafeParcelable.Param(id = 2) List list, @SafeParcelable.Param(id = 3) float f4, @SafeParcelable.Param(id = 4) int i4, @SafeParcelable.Param(id = 5) float f5, @SafeParcelable.Param(id = 6) boolean z4, @SafeParcelable.Param(id = 7) boolean z5, @SafeParcelable.Param(id = 8) boolean z6, @q0 @SafeParcelable.Param(id = 9) Cap cap, @q0 @SafeParcelable.Param(id = 10) Cap cap2, @SafeParcelable.Param(id = 11) int i5, @q0 @SafeParcelable.Param(id = 12) List list2, @q0 @SafeParcelable.Param(id = 13) List list3) {
        this.zzb = 10.0f;
        this.zzc = x1.f27484y;
        this.zzd = 0.0f;
        this.zze = true;
        this.zzf = false;
        this.zzg = false;
        this.zzh = new ButtCap();
        this.zzi = new ButtCap();
        this.zzj = 0;
        this.zzk = null;
        this.zzl = new ArrayList();
        this.zza = list;
        this.zzb = f4;
        this.zzc = i4;
        this.zzd = f5;
        this.zze = z4;
        this.zzf = z5;
        this.zzg = z6;
        if (cap != null) {
            this.zzh = cap;
        }
        if (cap2 != null) {
            this.zzi = cap2;
        }
        this.zzj = i5;
        this.zzk = list2;
        if (list3 != null) {
            this.zzl = list3;
        }
    }
}
