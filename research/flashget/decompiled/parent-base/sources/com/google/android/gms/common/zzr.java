package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import zc.h;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@SafeParcelable.Class(creator = "GoogleCertificatesLookupResponseCreator")
@SafeParcelable.Reserved({6})
/* loaded from: classes5.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs();

    @SafeParcelable.Field(getter = "getResult", id = 1)
    private final boolean zza;

    @h
    @SafeParcelable.Field(getter = "getErrorMessage", id = 2)
    private final String zzb;

    @SafeParcelable.Field(getter = "getStatusValue", id = 3)
    private final int zzc;

    @SafeParcelable.Field(getter = "getFirstPartyStatusValue", id = 4)
    private final int zzd;

    @SafeParcelable.Field(defaultValue = "-1", getter = "getSourceStampTimestampSeconds", id = 5)
    private final long zze;

    @SafeParcelable.Constructor
    zzr(@SafeParcelable.Param(id = 1) boolean z4, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i4, @SafeParcelable.Param(id = 4) int i5, @SafeParcelable.Param(id = 5) long j4) {
        this.zza = z4;
        this.zzb = str;
        this.zzc = zzz.zza(i4) - 1;
        this.zzd = zzc.zza(i5) - 1;
        this.zze = j4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.zza);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.writeLong(parcel, 5, this.zze);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final boolean zza() {
        return this.zza;
    }

    @h
    public final String zzb() {
        return this.zzb;
    }

    public final long zzc() {
        return this.zze;
    }

    public final int zzd() {
        return zzz.zza(this.zzc);
    }

    public final int zze() {
        return zzc.zza(this.zzd);
    }
}
