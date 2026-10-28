package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@KeepForSdk
@SafeParcelable.Class(creator = "FeatureCreator")
/* loaded from: classes5.dex */
public class Feature extends AbstractSafeParcelable {

    @o0
    public static final Parcelable.Creator<Feature> CREATOR = new zzb();

    @SafeParcelable.Field(getter = "getName", id = 1)
    private final String zza;

    @SafeParcelable.Field(getter = "getOldVersion", id = 2)
    @Deprecated
    private final int zzb;

    @SafeParcelable.Field(defaultValue = "-1", getter = "getVersion", id = 3)
    private final long zzc;

    @SafeParcelable.Field(defaultValue = "false", getter = "getIsFullyRolledOut", id = 4)
    private final boolean zzd;

    @SafeParcelable.Constructor
    public Feature(@SafeParcelable.Param(id = 1) @o0 String str, @SafeParcelable.Param(id = 2) int i4, @SafeParcelable.Param(id = 3) long j4, @SafeParcelable.Param(id = 4) boolean z4) {
        this.zza = str;
        this.zzb = i4;
        this.zzc = j4;
        this.zzd = z4;
    }

    public final boolean equals(@q0 Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (Objects.equal(getName(), feature.getName()) && getVersion() == feature.getVersion() && getIsFullyRolledOut() == feature.getIsFullyRolledOut()) {
                return true;
            }
        }
        return false;
    }

    @KeepForSdk
    public boolean getIsFullyRolledOut() {
        return this.zzd;
    }

    @o0
    @KeepForSdk
    public String getName() {
        return this.zza;
    }

    @KeepForSdk
    public long getVersion() {
        long j4 = this.zzc;
        return j4 == -1 ? this.zzb : j4;
    }

    public final int hashCode() {
        return Objects.hashCode(getName(), Long.valueOf(getVersion()), Boolean.valueOf(getIsFullyRolledOut()));
    }

    @o0
    public final String toString() {
        Objects.ToStringHelper stringHelper = Objects.toStringHelper(this);
        stringHelper.add(ProtectedSandApp.s("쥌"), getName());
        stringHelper.add(ProtectedSandApp.s("쥍"), Long.valueOf(getVersion()));
        stringHelper.add(ProtectedSandApp.s("쥎"), Boolean.valueOf(getIsFullyRolledOut()));
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getName(), false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeLong(parcel, 3, getVersion());
        SafeParcelWriter.writeBoolean(parcel, 4, getIsFullyRolledOut());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @KeepForSdk
    public Feature(@o0 String str, int i4, long j4) {
        this(str, i4, j4, false);
    }

    @KeepForSdk
    public Feature(@o0 String str, long j4) {
        this(str, -1, j4, false);
    }

    @KeepForSdk
    public Feature(@o0 String str, long j4, boolean z4) {
        this(str, -1, j4, z4);
    }
}
