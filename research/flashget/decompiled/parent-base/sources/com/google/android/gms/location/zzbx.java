package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@ShowFirstParty
@SafeParcelable.Class(creator = "UserPreferredSleepWindowCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes5.dex */
public final class zzbx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbx> CREATOR = new zzby();

    @SafeParcelable.Field(getter = "getStartHour", id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "getStartMinute", id = 2)
    private final int zzb;

    @SafeParcelable.Field(getter = "getEndHour", id = 3)
    private final int zzc;

    @SafeParcelable.Field(getter = "getEndMinute", id = 4)
    private final int zzd;

    @SafeParcelable.Constructor
    public zzbx(@SafeParcelable.Param(id = 1) int i4, @SafeParcelable.Param(id = 2) int i5, @SafeParcelable.Param(id = 3) int i6, @SafeParcelable.Param(id = 4) int i7) {
        Preconditions.checkState(i4 >= 0 && i4 <= 23, ProtectedSandApp.s("\uda0d"));
        Preconditions.checkState(i5 >= 0 && i5 <= 59, ProtectedSandApp.s("\uda0e"));
        Preconditions.checkState(i6 >= 0 && i6 <= 23, ProtectedSandApp.s("\uda0f"));
        Preconditions.checkState(i7 >= 0 && i7 <= 59, ProtectedSandApp.s("\uda10"));
        Preconditions.checkState(((i4 + i5) + i6) + i7 > 0, ProtectedSandApp.s("\uda11"));
        this.zza = i4;
        this.zzb = i5;
        this.zzc = i6;
        this.zzd = i7;
    }

    public final boolean equals(@q0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbx)) {
            return false;
        }
        zzbx zzbxVar = (zzbx) obj;
        return this.zza == zzbxVar.zza && this.zzb == zzbxVar.zzb && this.zzc == zzbxVar.zzc && this.zzd == zzbxVar.zzd;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd));
    }

    public final String toString() {
        int i4 = this.zza;
        int i5 = this.zzb;
        int i6 = this.zzc;
        int i7 = this.zzd;
        StringBuilder sb = new StringBuilder(117);
        sb.append(ProtectedSandApp.s("\uda12"));
        sb.append(i4);
        sb.append(ProtectedSandApp.s("\uda13"));
        sb.append(i5);
        sb.append(ProtectedSandApp.s("\uda14"));
        sb.append(i6);
        sb.append(ProtectedSandApp.s("\uda15"));
        sb.append(i7);
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        Preconditions.checkNotNull(parcel);
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
