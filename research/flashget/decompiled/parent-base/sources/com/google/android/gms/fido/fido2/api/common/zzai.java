package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.m1;
import androidx.annotation.q0;
import androidx.constraintlayout.core.parser.b;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.internal.fido.zzgx;
import com.google.android.gms.internal.fido.zzhp;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.Class(creator = "HmacSecretExtensionCreator")
/* loaded from: classes5.dex */
public final class zzai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzai> CREATOR = new zzaj();

    @m1
    static final zzhp zza = zzhp.zzg(1);

    @m1
    static final zzhp zzb = zzhp.zzg(2);

    @m1
    static final zzhp zzc = zzhp.zzg(3);

    @m1
    static final zzhp zzd = zzhp.zzg(4);

    @q0
    @SafeParcelable.Field(getter = "getCoseKeyAgreement", id = 1, type = "byte[]")
    private final zzgx zze;

    @q0
    @SafeParcelable.Field(getter = "getSaltEnc", id = 2, type = "byte[]")
    private final zzgx zzf;

    @q0
    @SafeParcelable.Field(getter = "getSaltAuth", id = 3, type = "byte[]")
    private final zzgx zzg;

    @SafeParcelable.Field(getter = "getPinUvAuthProtocol", id = 4)
    private final int zzh;

    zzai(@q0 zzgx zzgxVar, @q0 zzgx zzgxVar2, @q0 zzgx zzgxVar3, int i4) {
        this.zze = zzgxVar;
        this.zzf = zzgxVar2;
        this.zzg = zzgxVar3;
        this.zzh = i4;
    }

    public final boolean equals(@q0 Object obj) {
        if (!(obj instanceof zzai)) {
            return false;
        }
        zzai zzaiVar = (zzai) obj;
        return Objects.equal(this.zze, zzaiVar.zze) && Objects.equal(this.zzf, zzaiVar.zzf) && Objects.equal(this.zzg, zzaiVar.zzg) && this.zzh == zzaiVar.zzh;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zze, this.zzf, this.zzg, Integer.valueOf(this.zzh));
    }

    public final String toString() {
        String encodeUrlSafeNoPadding = Base64Utils.encodeUrlSafeNoPadding(zza());
        String encodeUrlSafeNoPadding2 = Base64Utils.encodeUrlSafeNoPadding(zzc());
        String encodeUrlSafeNoPadding3 = Base64Utils.encodeUrlSafeNoPadding(zzb());
        StringBuilder a5 = b.a(ProtectedSandApp.s("춭"), encodeUrlSafeNoPadding, ProtectedSandApp.s("춮"), encodeUrlSafeNoPadding2, ProtectedSandApp.s("춯"));
        a5.append(encodeUrlSafeNoPadding3);
        a5.append(ProtectedSandApp.s("춰"));
        return android.support.v4.media.b.a(a5, this.zzh, ProtectedSandApp.s("춱"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 1, zza(), false);
        SafeParcelWriter.writeByteArray(parcel, 2, zzc(), false);
        SafeParcelWriter.writeByteArray(parcel, 3, zzb(), false);
        SafeParcelWriter.writeInt(parcel, 4, this.zzh);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @q0
    public final byte[] zza() {
        zzgx zzgxVar = this.zze;
        if (zzgxVar == null) {
            return null;
        }
        return zzgxVar.zzm();
    }

    @q0
    public final byte[] zzb() {
        zzgx zzgxVar = this.zzg;
        if (zzgxVar == null) {
            return null;
        }
        return zzgxVar.zzm();
    }

    @q0
    public final byte[] zzc() {
        zzgx zzgxVar = this.zzf;
        if (zzgxVar == null) {
            return null;
        }
        return zzgxVar.zzm();
    }
}
