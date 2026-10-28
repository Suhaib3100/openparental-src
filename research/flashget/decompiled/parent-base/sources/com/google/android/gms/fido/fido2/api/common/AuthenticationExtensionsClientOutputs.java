package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.d;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.Class(creator = "AuthenticationExtensionsClientOutputsCreator")
/* loaded from: classes5.dex */
public class AuthenticationExtensionsClientOutputs extends AbstractSafeParcelable {

    @o0
    public static final Parcelable.Creator<AuthenticationExtensionsClientOutputs> CREATOR = new zzc();

    @q0
    @SafeParcelable.Field(getter = "getUvmEntries", id = 1)
    private final UvmEntries zza;

    @q0
    @SafeParcelable.Field(getter = "getDevicePubKey", id = 2)
    private final zzf zzb;

    @q0
    @SafeParcelable.Field(getter = "getCredProps", id = 3)
    private final AuthenticationExtensionsCredPropsOutputs zzc;

    @q0
    @SafeParcelable.Field(getter = "getPrf", id = 4)
    private final zzh zzd;

    @q0
    @SafeParcelable.Field(getter = "getTxAuthSimple", id = 5)
    private final String zze;

    /* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    public static final class Builder {

        @q0
        private UvmEntries zza;

        @q0
        private AuthenticationExtensionsCredPropsOutputs zzb;

        @o0
        public AuthenticationExtensionsClientOutputs build() {
            return new AuthenticationExtensionsClientOutputs(this.zza, null, this.zzb, null, null);
        }

        @o0
        public Builder setCredProps(@q0 AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs) {
            this.zzb = authenticationExtensionsCredPropsOutputs;
            return this;
        }

        @o0
        public Builder setUserVerificationMethodEntries(@q0 UvmEntries uvmEntries) {
            this.zza = uvmEntries;
            return this;
        }
    }

    @SafeParcelable.Constructor
    AuthenticationExtensionsClientOutputs(@q0 @SafeParcelable.Param(id = 1) UvmEntries uvmEntries, @q0 @SafeParcelable.Param(id = 2) zzf zzfVar, @q0 @SafeParcelable.Param(id = 3) AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs, @q0 @SafeParcelable.Param(id = 4) zzh zzhVar, @q0 @SafeParcelable.Param(id = 5) String str) {
        this.zza = uvmEntries;
        this.zzb = zzfVar;
        this.zzc = authenticationExtensionsCredPropsOutputs;
        this.zzd = zzhVar;
        this.zze = str;
    }

    @o0
    public static AuthenticationExtensionsClientOutputs deserializeFromBytes(@o0 byte[] bArr) {
        return (AuthenticationExtensionsClientOutputs) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    public boolean equals(@q0 Object obj) {
        if (!(obj instanceof AuthenticationExtensionsClientOutputs)) {
            return false;
        }
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) obj;
        return Objects.equal(this.zza, authenticationExtensionsClientOutputs.zza) && Objects.equal(this.zzb, authenticationExtensionsClientOutputs.zzb) && Objects.equal(this.zzc, authenticationExtensionsClientOutputs.zzc) && Objects.equal(this.zzd, authenticationExtensionsClientOutputs.zzd) && Objects.equal(this.zze, authenticationExtensionsClientOutputs.zze);
    }

    @q0
    public AuthenticationExtensionsCredPropsOutputs getCredProps() {
        return this.zzc;
    }

    @q0
    public UvmEntries getUvmEntries() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
    }

    @o0
    public byte[] serializeToBytes() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }

    @o0
    public final String toString() {
        return d.a(ProtectedSandApp.s("쳔"), zza().toString(), ProtectedSandApp.s("쳕"));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getUvmEntries(), i4, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i4, false);
        SafeParcelWriter.writeParcelable(parcel, 3, getCredProps(), i4, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i4, false);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @o0
    public final JSONObject zza() {
        try {
            JSONObject jSONObject = new JSONObject();
            AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs = this.zzc;
            if (authenticationExtensionsCredPropsOutputs != null) {
                jSONObject.put(ProtectedSandApp.s("쳖"), authenticationExtensionsCredPropsOutputs.zza());
            }
            UvmEntries uvmEntries = this.zza;
            if (uvmEntries != null) {
                jSONObject.put(ProtectedSandApp.s("쳗"), uvmEntries.zza());
            }
            zzh zzhVar = this.zzd;
            if (zzhVar != null) {
                jSONObject.put(ProtectedSandApp.s("쳘"), zzhVar.zza());
            }
            String str = this.zze;
            if (str != null) {
                jSONObject.put(ProtectedSandApp.s("쳙"), str);
            }
            return jSONObject;
        } catch (JSONException e4) {
            throw new RuntimeException(ProtectedSandApp.s("쳚"), e4);
        }
    }
}
