package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.constraintlayout.core.parser.b;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
@SafeParcelable.Class(creator = "AccountChangeEventCreator")
/* loaded from: classes5.dex */
public class AccountChangeEvent extends AbstractSafeParcelable {

    @o0
    public static final Parcelable.Creator<AccountChangeEvent> CREATOR = new zza();

    @SafeParcelable.VersionField(id = 1)
    final int zza;

    @SafeParcelable.Field(id = 2)
    final long zzb;

    @SafeParcelable.Field(id = 3)
    final String zzc;

    @SafeParcelable.Field(id = 4)
    final int zzd;

    @SafeParcelable.Field(id = 5)
    final int zze;

    @SafeParcelable.Field(id = 6)
    final String zzf;

    @SafeParcelable.Constructor
    AccountChangeEvent(@SafeParcelable.Param(id = 1) int i4, @SafeParcelable.Param(id = 2) long j4, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) int i5, @SafeParcelable.Param(id = 5) int i6, @SafeParcelable.Param(id = 6) String str2) {
        this.zza = i4;
        this.zzb = j4;
        this.zzc = (String) Preconditions.checkNotNull(str);
        this.zzd = i5;
        this.zze = i6;
        this.zzf = str2;
    }

    public boolean equals(@q0 Object obj) {
        if (!(obj instanceof AccountChangeEvent)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
        return this.zza == accountChangeEvent.zza && this.zzb == accountChangeEvent.zzb && Objects.equal(this.zzc, accountChangeEvent.zzc) && this.zzd == accountChangeEvent.zzd && this.zze == accountChangeEvent.zze && Objects.equal(this.zzf, accountChangeEvent.zzf);
    }

    @o0
    public String getAccountName() {
        return this.zzc;
    }

    @o0
    public String getChangeData() {
        return this.zzf;
    }

    public int getChangeType() {
        return this.zzd;
    }

    public int getEventIndex() {
        return this.zze;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Long.valueOf(this.zzb), this.zzc, Integer.valueOf(this.zzd), Integer.valueOf(this.zze), this.zzf);
    }

    @o0
    public String toString() {
        int i4 = this.zzd;
        String s4 = i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? ProtectedSandApp.s("웶") : ProtectedSandApp.s("웷") : ProtectedSandApp.s("웸") : ProtectedSandApp.s("웹") : ProtectedSandApp.s("웺");
        String str = this.zzc;
        String str2 = this.zzf;
        int i5 = this.zze;
        StringBuilder a5 = b.a(ProtectedSandApp.s("웻"), str, ProtectedSandApp.s("웼"), s4, ProtectedSandApp.s("웽"));
        a5.append(str2);
        a5.append(ProtectedSandApp.s("웾"));
        a5.append(i5);
        a5.append(ProtectedSandApp.s("웿"));
        return a5.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.writeString(parcel, 6, this.zzf, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public AccountChangeEvent(long j4, @o0 String str, int i4, int i5, @o0 String str2) {
        this.zza = 1;
        this.zzb = j4;
        this.zzc = (String) Preconditions.checkNotNull(str);
        this.zzd = i4;
        this.zze = i5;
        this.zzf = str2;
    }
}
