package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.fido.zzgx;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.Class(creator = "CableAuthenticationDataCreator")
/* loaded from: classes5.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new zzr();

    @SafeParcelable.Field(getter = "getVersion", id = 1)
    private final long zza;

    @o0
    @SafeParcelable.Field(getter = "getClientEid", id = 2, type = "byte[]")
    private final zzgx zzb;

    @o0
    @SafeParcelable.Field(getter = "getAuthenticatorEid", id = 3, type = "byte[]")
    private final zzgx zzc;

    @o0
    @SafeParcelable.Field(getter = "getSessionPreKey", id = 4, type = "byte[]")
    private final zzgx zzd;

    @SafeParcelable.Constructor
    zzq(@SafeParcelable.Param(id = 1) long j4, @SafeParcelable.Param(id = 2) @o0 byte[] bArr, @SafeParcelable.Param(id = 3) @o0 byte[] bArr2, @SafeParcelable.Param(id = 4) @o0 byte[] bArr3) {
        byte[] bArr4 = (byte[]) Preconditions.checkNotNull(bArr);
        zzgx zzgxVar = zzgx.zzb;
        zzgx zzl = zzgx.zzl(bArr4, 0, bArr4.length);
        byte[] bArr5 = (byte[]) Preconditions.checkNotNull(bArr2);
        zzgx zzl2 = zzgx.zzl(bArr5, 0, bArr5.length);
        byte[] bArr6 = (byte[]) Preconditions.checkNotNull(bArr3);
        zzgx zzl3 = zzgx.zzl(bArr6, 0, bArr6.length);
        this.zza = j4;
        this.zzb = (zzgx) Preconditions.checkNotNull(zzl);
        this.zzc = (zzgx) Preconditions.checkNotNull(zzl2);
        this.zzd = (zzgx) Preconditions.checkNotNull(zzl3);
    }

    public final boolean equals(@q0 Object obj) {
        if (!(obj instanceof zzq)) {
            return false;
        }
        zzq zzqVar = (zzq) obj;
        return this.zza == zzqVar.zza && Objects.equal(this.zzb, zzqVar.zzb) && Objects.equal(this.zzc, zzqVar.zzc) && Objects.equal(this.zzd, zzqVar.zzd);
    }

    public final int hashCode() {
        return Objects.hashCode(Long.valueOf(this.zza), this.zzb, this.zzc, this.zzd);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        long j4 = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, j4);
        SafeParcelWriter.writeByteArray(parcel, 2, this.zzb.zzm(), false);
        SafeParcelWriter.writeByteArray(parcel, 3, this.zzc.zzm(), false);
        SafeParcelWriter.writeByteArray(parcel, 4, this.zzd.zzm(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
