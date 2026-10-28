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
import com.google.android.gms.internal.maps.zzao;
import com.google.android.gms.internal.maps.zzap;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
@SafeParcelable.Class(creator = "TileOverlayOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public final class TileOverlayOptions extends AbstractSafeParcelable {

    @o0
    public static final Parcelable.Creator<TileOverlayOptions> CREATOR = new zzah();

    @q0
    @SafeParcelable.Field(getter = "getTileProviderDelegate", id = 2, type = "android.os.IBinder")
    private zzap zza;

    @q0
    private TileProvider zzb;

    @SafeParcelable.Field(getter = "isVisible", id = 3)
    private boolean zzc;

    @SafeParcelable.Field(getter = "getZIndex", id = 4)
    private float zzd;

    @SafeParcelable.Field(defaultValue = "true", getter = "getFadeIn", id = 5)
    private boolean zze;

    @SafeParcelable.Field(getter = "getTransparency", id = 6)
    private float zzf;

    public TileOverlayOptions() {
        this.zzc = true;
        this.zze = true;
        this.zzf = 0.0f;
    }

    @o0
    public TileOverlayOptions fadeIn(boolean z4) {
        this.zze = z4;
        return this;
    }

    public boolean getFadeIn() {
        return this.zze;
    }

    @q0
    public TileProvider getTileProvider() {
        return this.zzb;
    }

    public float getTransparency() {
        return this.zzf;
    }

    public float getZIndex() {
        return this.zzd;
    }

    public boolean isVisible() {
        return this.zzc;
    }

    @o0
    public TileOverlayOptions tileProvider(@o0 TileProvider tileProvider) {
        this.zzb = (TileProvider) Preconditions.checkNotNull(tileProvider, ProtectedSandApp.s("\udb17"));
        this.zza = new zzag(this, tileProvider);
        return this;
    }

    @o0
    public TileOverlayOptions transparency(float f4) {
        boolean z4 = false;
        if (f4 >= 0.0f && f4 <= 1.0f) {
            z4 = true;
        }
        Preconditions.checkArgument(z4, ProtectedSandApp.s("\udb18"));
        this.zzf = f4;
        return this;
    }

    @o0
    public TileOverlayOptions visible(boolean z4) {
        this.zzc = z4;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzap zzapVar = this.zza;
        SafeParcelWriter.writeIBinder(parcel, 2, zzapVar == null ? null : zzapVar.asBinder(), false);
        SafeParcelWriter.writeBoolean(parcel, 3, isVisible());
        SafeParcelWriter.writeFloat(parcel, 4, getZIndex());
        SafeParcelWriter.writeBoolean(parcel, 5, getFadeIn());
        SafeParcelWriter.writeFloat(parcel, 6, getTransparency());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @o0
    public TileOverlayOptions zIndex(float f4) {
        this.zzd = f4;
        return this;
    }

    @SafeParcelable.Constructor
    TileOverlayOptions(@SafeParcelable.Param(id = 2) IBinder iBinder, @SafeParcelable.Param(id = 3) boolean z4, @SafeParcelable.Param(id = 4) float f4, @SafeParcelable.Param(id = 5) boolean z5, @SafeParcelable.Param(id = 6) float f5) {
        this.zzc = true;
        this.zze = true;
        this.zzf = 0.0f;
        zzap zzc = zzao.zzc(iBinder);
        this.zza = zzc;
        this.zzb = zzc == null ? null : new zzaf(this);
        this.zzc = z4;
        this.zzd = f4;
        this.zze = z5;
        this.zzf = f5;
    }
}
