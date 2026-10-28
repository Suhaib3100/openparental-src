package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.c;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.appcompat.view.g;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.internal.fido.zzgx;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.Class(creator = "PublicKeyCredentialUserEntityCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public class PublicKeyCredentialUserEntity extends AbstractSafeParcelable {

    @o0
    public static final Parcelable.Creator<PublicKeyCredentialUserEntity> CREATOR = new zzau();

    @o0
    @SafeParcelable.Field(getter = "getId", id = 2, type = "byte[]")
    private final zzgx zza;

    @o0
    @SafeParcelable.Field(getter = "getName", id = 3)
    private final String zzb;

    @q0
    @SafeParcelable.Field(getter = "getIcon", id = 4)
    private final String zzc;

    @o0
    @SafeParcelable.Field(getter = "getDisplayName", id = 5)
    private final String zzd;

    public PublicKeyCredentialUserEntity(zzgx zzgxVar, String str, @q0 String str2, String str3) {
        this.zza = (zzgx) Preconditions.checkNotNull(zzgxVar);
        this.zzb = (String) Preconditions.checkNotNull(str);
        this.zzc = str2;
        this.zzd = (String) Preconditions.checkNotNull(str3);
    }

    public boolean equals(@q0 Object obj) {
        if (!(obj instanceof PublicKeyCredentialUserEntity)) {
            return false;
        }
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) obj;
        return Objects.equal(this.zza, publicKeyCredentialUserEntity.zza) && Objects.equal(this.zzb, publicKeyCredentialUserEntity.zzb) && Objects.equal(this.zzc, publicKeyCredentialUserEntity.zzc) && Objects.equal(this.zzd, publicKeyCredentialUserEntity.zzd);
    }

    @o0
    public String getDisplayName() {
        return this.zzd;
    }

    @q0
    public String getIcon() {
        return this.zzc;
    }

    @o0
    public byte[] getId() {
        return this.zza.zzm();
    }

    public zzgx getIdAsByteString() {
        return this.zza;
    }

    @o0
    public String getName() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd);
    }

    @o0
    public final String toString() {
        StringBuilder a5 = g.a(ProtectedSandApp.s("춉"), Base64Utils.encodeUrlSafeNoPadding(this.zza.zzm()), ProtectedSandApp.s("춊"));
        a5.append(this.zzb);
        a5.append(ProtectedSandApp.s("춋"));
        a5.append(this.zzc);
        a5.append(ProtectedSandApp.s("춌"));
        return c.a(a5, this.zzd, ProtectedSandApp.s("춍"));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 2, getId(), false);
        SafeParcelWriter.writeString(parcel, 3, getName(), false);
        SafeParcelWriter.writeString(parcel, 4, getIcon(), false);
        SafeParcelWriter.writeString(parcel, 5, getDisplayName(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PublicKeyCredentialUserEntity(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) @androidx.annotation.o0 byte[] r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) @androidx.annotation.o0 java.lang.String r4, @androidx.annotation.q0 @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) java.lang.String r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) @androidx.annotation.o0 java.lang.String r6) {
        /*
            r2 = this;
            java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            byte[] r3 = (byte[]) r3
            com.google.android.gms.internal.fido.zzgx r0 = com.google.android.gms.internal.fido.zzgx.zzb
            int r0 = r3.length
            r1 = 0
            com.google.android.gms.internal.fido.zzgx r3 = com.google.android.gms.internal.fido.zzgx.zzl(r3, r1, r0)
            r2.<init>(r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity.<init>(byte[], java.lang.String, java.lang.String, java.lang.String):void");
    }
}
