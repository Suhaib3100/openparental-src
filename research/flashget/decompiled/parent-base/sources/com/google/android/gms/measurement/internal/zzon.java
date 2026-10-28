package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
@SafeParcelable.Class(creator = "UserAttributeParcelCreator")
/* loaded from: classes5.dex */
public final class zzon extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzon> CREATOR = new zzoq();

    @SafeParcelable.Field(id = 2)
    public final String zza;

    @SafeParcelable.Field(id = 3)
    public final long zzb;

    @q0
    @SafeParcelable.Field(id = 4)
    public final Long zzc;

    @q0
    @SafeParcelable.Field(id = 6)
    public final String zzd;

    @SafeParcelable.Field(id = 7)
    public final String zze;

    @q0
    @SafeParcelable.Field(id = 8)
    public final Double zzf;

    @SafeParcelable.Field(id = 1)
    private final int zzg;

    zzon(zzop zzopVar) {
        this(zzopVar.zzc, zzopVar.zzd, zzopVar.zze, zzopVar.zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzg);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeLong(parcel, 3, this.zzb);
        SafeParcelWriter.writeLongObject(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeFloatObject(parcel, 5, null, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 7, this.zze, false);
        SafeParcelWriter.writeDoubleObject(parcel, 8, this.zzf, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @q0
    public final Object zza() {
        Long l4 = this.zzc;
        if (l4 != null) {
            return l4;
        }
        Double d5 = this.zzf;
        if (d5 != null) {
            return d5;
        }
        String str = this.zzd;
        if (str != null) {
            return str;
        }
        return null;
    }

    zzon(String str, long j4, @q0 Object obj, String str2) {
        Preconditions.checkNotEmpty(str);
        this.zzg = 2;
        this.zza = str;
        this.zzb = j4;
        this.zze = str2;
        if (obj == null) {
            this.zzc = null;
            this.zzf = null;
            this.zzd = null;
            return;
        }
        if (obj instanceof Long) {
            this.zzc = (Long) obj;
            this.zzf = null;
            this.zzd = null;
        } else if (obj instanceof String) {
            this.zzc = null;
            this.zzf = null;
            this.zzd = (String) obj;
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("\ue36b"));
            }
            this.zzc = null;
            this.zzf = (Double) obj;
            this.zzd = null;
        }
    }

    @SafeParcelable.Constructor
    zzon(@SafeParcelable.Param(id = 1) int i4, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) long j4, @q0 @SafeParcelable.Param(id = 4) Long l4, @SafeParcelable.Param(id = 5) Float f4, @q0 @SafeParcelable.Param(id = 6) String str2, @SafeParcelable.Param(id = 7) String str3, @q0 @SafeParcelable.Param(id = 8) Double d5) {
        this.zzg = i4;
        this.zza = str;
        this.zzb = j4;
        this.zzc = l4;
        if (i4 == 1) {
            this.zzf = f4 != null ? Double.valueOf(f4.doubleValue()) : null;
        } else {
            this.zzf = d5;
        }
        this.zzd = str2;
        this.zze = str3;
    }
}
