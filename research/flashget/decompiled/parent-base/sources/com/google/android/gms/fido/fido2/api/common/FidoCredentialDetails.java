package com.google.android.gms.fido.fido2.api.common;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.internal.fido.zzgx;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.Class(creator = "FidoCredentialDetailsCreator")
/* loaded from: classes5.dex */
public class FidoCredentialDetails extends AbstractSafeParcelable {

    @o0
    public static final Parcelable.Creator<FidoCredentialDetails> CREATOR = new zzy();

    @q0
    @SafeParcelable.Field(getter = "getUserName", id = 1)
    private final String zza;

    @q0
    @SafeParcelable.Field(getter = "getUserDisplayName", id = 2)
    private final String zzb;

    @q0
    @SafeParcelable.Field(getter = "getUserId", id = 3, type = "byte[]")
    private final zzgx zzc;

    @o0
    @SafeParcelable.Field(getter = "getCredentialId", id = 4, type = "byte[]")
    private final zzgx zzd;

    @SafeParcelable.Field(getter = "getIsDiscoverable", id = 5)
    private final boolean zze;

    @SafeParcelable.Field(getter = "getIsPaymentCredential", id = 6)
    private final boolean zzf;

    @SafeParcelable.Field(defaultValue = "0", getter = "getLastUsedTime", id = 7)
    private final long zzg;

    @q0
    @SafeParcelable.Field(getter = "getOwningAccount", id = 8)
    private final Account zzh;

    @SafeParcelable.Field(getter = "getIsCryptauthSigninCredentialForAccount", id = 9)
    private final boolean zzi;

    @SafeParcelable.Constructor
    FidoCredentialDetails(@q0 @SafeParcelable.Param(id = 1) String str, @q0 @SafeParcelable.Param(id = 2) String str2, @q0 @SafeParcelable.Param(id = 3) byte[] bArr, @SafeParcelable.Param(id = 4) @o0 byte[] bArr2, @SafeParcelable.Param(id = 5) boolean z4, @SafeParcelable.Param(id = 6) boolean z5, @SafeParcelable.Param(id = 7) long j4, @q0 @SafeParcelable.Param(id = 8) Account account, @SafeParcelable.Param(id = 9) boolean z6) {
        zzgx zzl = bArr == null ? null : zzgx.zzl(bArr, 0, bArr.length);
        zzgx zzgxVar = zzgx.zzb;
        zzgx zzl2 = zzgx.zzl(bArr2, 0, bArr2.length);
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzl;
        this.zzd = zzl2;
        this.zze = z4;
        this.zzf = z5;
        this.zzg = j4;
        this.zzh = account;
        this.zzi = z6;
    }

    @o0
    public static FidoCredentialDetails deserializeFromBytes(@o0 byte[] bArr) {
        return (FidoCredentialDetails) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    public boolean equals(@q0 Object obj) {
        if (!(obj instanceof FidoCredentialDetails)) {
            return false;
        }
        FidoCredentialDetails fidoCredentialDetails = (FidoCredentialDetails) obj;
        return Objects.equal(this.zza, fidoCredentialDetails.zza) && Objects.equal(this.zzb, fidoCredentialDetails.zzb) && Objects.equal(this.zzc, fidoCredentialDetails.zzc) && Objects.equal(this.zzd, fidoCredentialDetails.zzd) && this.zze == fidoCredentialDetails.zze && this.zzf == fidoCredentialDetails.zzf && this.zzi == fidoCredentialDetails.zzi && this.zzg == fidoCredentialDetails.zzg && Objects.equal(this.zzh, fidoCredentialDetails.zzh);
    }

    @o0
    public byte[] getCredentialId() {
        return this.zzd.zzm();
    }

    public zzgx getCredentialIdAsByteString() {
        return this.zzd;
    }

    public boolean getIsDiscoverable() {
        return this.zze;
    }

    public boolean getIsPaymentCredential() {
        return this.zzf;
    }

    public long getLastUsedTime() {
        return this.zzg;
    }

    @q0
    public String getUserDisplayName() {
        return this.zzb;
    }

    @q0
    public byte[] getUserId() {
        zzgx zzgxVar = this.zzc;
        if (zzgxVar == null) {
            return null;
        }
        return zzgxVar.zzm();
    }

    @q0
    public zzgx getUserIdAsByteString() {
        return this.zzc;
    }

    @q0
    public String getUserName() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd, Boolean.valueOf(this.zze), Boolean.valueOf(this.zzf), Boolean.valueOf(this.zzi), Long.valueOf(this.zzg), this.zzh);
    }

    @o0
    public byte[] serializeToBytes() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getUserName(), false);
        SafeParcelWriter.writeString(parcel, 2, getUserDisplayName(), false);
        SafeParcelWriter.writeByteArray(parcel, 3, getUserId(), false);
        SafeParcelWriter.writeByteArray(parcel, 4, getCredentialId(), false);
        SafeParcelWriter.writeBoolean(parcel, 5, getIsDiscoverable());
        SafeParcelWriter.writeBoolean(parcel, 6, getIsPaymentCredential());
        SafeParcelWriter.writeLong(parcel, 7, getLastUsedTime());
        SafeParcelWriter.writeParcelable(parcel, 8, this.zzh, i4, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzi);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
