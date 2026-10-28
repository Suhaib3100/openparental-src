package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.fido.zzgx;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.Class(creator = "AuthenticationExtensionsDevicePublicKeyOutputsCreator")
/* loaded from: classes5.dex */
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new zzg();

    @q0
    @SafeParcelable.Field(getter = "getSignature", id = 1, type = "byte[]")
    private final zzgx zza;

    @q0
    @SafeParcelable.Field(getter = "getAuthenticatorOutput", id = 2, type = "byte[]")
    private final zzgx zzb;

    public zzf(@q0 zzgx zzgxVar, @q0 zzgx zzgxVar2) {
        this.zza = zzgxVar;
        this.zzb = zzgxVar2;
    }

    public final boolean equals(@q0 Object obj) {
        if (!(obj instanceof zzf)) {
            return false;
        }
        zzf zzfVar = (zzf) obj;
        return Objects.equal(this.zza, zzfVar.zza) && Objects.equal(this.zzb, zzfVar.zzb);
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@o0 Parcel parcel, int i4) {
        zzgx zzgxVar = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 1, zzgxVar == null ? null : zzgxVar.zzm(), false);
        zzgx zzgxVar2 = this.zzb;
        SafeParcelWriter.writeByteArray(parcel, 2, zzgxVar2 != null ? zzgxVar2.zzm() : null, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
