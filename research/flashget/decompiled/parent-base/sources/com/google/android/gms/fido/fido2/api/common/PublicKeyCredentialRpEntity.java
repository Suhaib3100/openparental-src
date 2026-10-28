package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.c;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.Class(creator = "PublicKeyCredentialRpEntityCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public class PublicKeyCredentialRpEntity extends AbstractSafeParcelable {

    @o0
    public static final Parcelable.Creator<PublicKeyCredentialRpEntity> CREATOR = new zzas();

    @o0
    @SafeParcelable.Field(getter = "getId", id = 2)
    private final String zza;

    @o0
    @SafeParcelable.Field(getter = "getName", id = 3)
    private final String zzb;

    @q0
    @SafeParcelable.Field(getter = "getIcon", id = 4)
    private final String zzc;

    @SafeParcelable.Constructor
    public PublicKeyCredentialRpEntity(@SafeParcelable.Param(id = 2) @o0 String str, @SafeParcelable.Param(id = 3) @o0 String str2, @q0 @SafeParcelable.Param(id = 4) String str3) {
        this.zza = (String) Preconditions.checkNotNull(str);
        this.zzb = (String) Preconditions.checkNotNull(str2);
        this.zzc = str3;
    }

    public boolean equals(@q0 Object obj) {
        if (!(obj instanceof PublicKeyCredentialRpEntity)) {
            return false;
        }
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) obj;
        return Objects.equal(this.zza, publicKeyCredentialRpEntity.zza) && Objects.equal(this.zzb, publicKeyCredentialRpEntity.zzb) && Objects.equal(this.zzc, publicKeyCredentialRpEntity.zzc);
    }

    @q0
    public String getIcon() {
        return this.zzc;
    }

    @o0
    public String getId() {
        return this.zza;
    }

    @o0
    public String getName() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc);
    }

    @o0
    public final String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("춂"));
        sb.append(this.zza);
        sb.append(ProtectedSandApp.s("춃"));
        sb.append(this.zzb);
        sb.append(ProtectedSandApp.s("춄"));
        return c.a(sb, this.zzc, ProtectedSandApp.s("춅"));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, getId(), false);
        SafeParcelWriter.writeString(parcel, 3, getName(), false);
        SafeParcelWriter.writeString(parcel, 4, getIcon(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
