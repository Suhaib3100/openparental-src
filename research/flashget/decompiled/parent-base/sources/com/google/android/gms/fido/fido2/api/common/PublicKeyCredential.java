package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.constraintlayout.core.parser.b;
import androidx.fragment.app.c;
import androidx.room.l0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.internal.fido.zzgx;
import com.google.android.gms.internal.fido.zzia;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.Class(creator = "PublicKeyCredentialCreator")
/* loaded from: classes5.dex */
public class PublicKeyCredential extends AbstractSafeParcelable {

    @o0
    public static final Parcelable.Creator<PublicKeyCredential> CREATOR = new zzao();

    @q0
    @SafeParcelable.Field(getter = "getId", id = 1)
    private final String zza;

    @o0
    @SafeParcelable.Field(getter = "getType", id = 2)
    private final String zzb;

    @q0
    @SafeParcelable.Field(getter = "getRawId", id = 3, type = "byte[]")
    private final zzgx zzc;

    @q0
    @SafeParcelable.Field(getter = "getRegisterResponse", id = 4)
    private final AuthenticatorAttestationResponse zzd;

    @q0
    @SafeParcelable.Field(getter = "getSignResponse", id = 5)
    private final AuthenticatorAssertionResponse zze;

    @q0
    @SafeParcelable.Field(getter = "getErrorResponse", id = 6)
    private final AuthenticatorErrorResponse zzf;

    @q0
    @SafeParcelable.Field(getter = "getClientExtensionResults", id = 7)
    private final AuthenticationExtensionsClientOutputs zzg;

    @q0
    @SafeParcelable.Field(getter = "getAuthenticatorAttachment", id = 8)
    private final String zzh;

    @q0
    @SafeParcelable.Field(getter = "getJsonString", id = 9)
    private String zzi;

    /* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    public static class Builder {

        @q0
        private String zza;

        @q0
        private zzgx zzb;
        private AuthenticatorResponse zzc;

        @q0
        private AuthenticationExtensionsClientOutputs zzd;

        @q0
        private String zze;

        @o0
        public PublicKeyCredential build() {
            AuthenticatorResponse authenticatorResponse = this.zzc;
            return new PublicKeyCredential(this.zza, PublicKeyCredentialType.PUBLIC_KEY.toString(), this.zzb, authenticatorResponse instanceof AuthenticatorAttestationResponse ? (AuthenticatorAttestationResponse) authenticatorResponse : null, authenticatorResponse instanceof AuthenticatorAssertionResponse ? (AuthenticatorAssertionResponse) authenticatorResponse : null, authenticatorResponse instanceof AuthenticatorErrorResponse ? (AuthenticatorErrorResponse) authenticatorResponse : null, this.zzd, this.zze);
        }

        @o0
        public Builder setAuthenticationExtensionsClientOutputs(@q0 AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs) {
            this.zzd = authenticationExtensionsClientOutputs;
            return this;
        }

        @o0
        public Builder setAuthenticatorAttachment(@q0 String str) {
            this.zze = str;
            return this;
        }

        @o0
        public Builder setId(@q0 String str) {
            this.zza = str;
            return this;
        }

        public Builder setRawId(@q0 zzgx zzgxVar) {
            this.zzb = zzgxVar;
            return this;
        }

        @o0
        public Builder setResponse(@o0 AuthenticatorResponse authenticatorResponse) {
            this.zzc = authenticatorResponse;
            return this;
        }

        @o0
        public Builder setRawId(@q0 byte[] bArr) {
            this.zzb = bArr == null ? null : zzgx.zzl(bArr, 0, bArr.length);
            return this;
        }
    }

    @o0
    public static PublicKeyCredential deserializeFromBytes(@o0 byte[] bArr) {
        return (PublicKeyCredential) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    public boolean equals(@q0 Object obj) {
        if (!(obj instanceof PublicKeyCredential)) {
            return false;
        }
        PublicKeyCredential publicKeyCredential = (PublicKeyCredential) obj;
        return Objects.equal(this.zza, publicKeyCredential.zza) && Objects.equal(this.zzb, publicKeyCredential.zzb) && Objects.equal(this.zzc, publicKeyCredential.zzc) && Objects.equal(this.zzd, publicKeyCredential.zzd) && Objects.equal(this.zze, publicKeyCredential.zze) && Objects.equal(this.zzf, publicKeyCredential.zzf) && Objects.equal(this.zzg, publicKeyCredential.zzg) && Objects.equal(this.zzh, publicKeyCredential.zzh);
    }

    @q0
    public String getAuthenticatorAttachment() {
        return this.zzh;
    }

    @q0
    public AuthenticationExtensionsClientOutputs getClientExtensionResults() {
        return this.zzg;
    }

    @q0
    public String getId() {
        return this.zza;
    }

    @q0
    public byte[] getRawId() {
        zzgx zzgxVar = this.zzc;
        if (zzgxVar == null) {
            return null;
        }
        return zzgxVar.zzm();
    }

    @q0
    public zzgx getRawIdAsByteString() {
        return this.zzc;
    }

    @o0
    public AuthenticatorResponse getResponse() {
        AuthenticatorAttestationResponse authenticatorAttestationResponse = this.zzd;
        if (authenticatorAttestationResponse != null) {
            return authenticatorAttestationResponse;
        }
        AuthenticatorAssertionResponse authenticatorAssertionResponse = this.zze;
        if (authenticatorAssertionResponse != null) {
            return authenticatorAssertionResponse;
        }
        AuthenticatorErrorResponse authenticatorErrorResponse = this.zzf;
        if (authenticatorErrorResponse != null) {
            return authenticatorErrorResponse;
        }
        throw new IllegalStateException(ProtectedSandApp.s("촯"));
    }

    @o0
    public String getType() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, this.zze, this.zzd, this.zzf, this.zzg, this.zzh);
    }

    @o0
    public byte[] serializeToBytes() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }

    @o0
    public String toJson() {
        return zza().toString();
    }

    @o0
    public final String toString() {
        zzgx zzgxVar = this.zzc;
        byte[] zzm = zzgxVar == null ? null : zzgxVar.zzm();
        String str = this.zzb;
        String str2 = this.zza;
        AuthenticatorAttestationResponse authenticatorAttestationResponse = this.zzd;
        AuthenticatorAssertionResponse authenticatorAssertionResponse = this.zze;
        AuthenticatorErrorResponse authenticatorErrorResponse = this.zzf;
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = this.zzg;
        String str3 = this.zzh;
        String encodeUrlSafeNoPadding = Base64Utils.encodeUrlSafeNoPadding(zzm);
        String valueOf = String.valueOf(authenticatorAttestationResponse);
        String valueOf2 = String.valueOf(authenticatorAssertionResponse);
        String valueOf3 = String.valueOf(authenticatorErrorResponse);
        String valueOf4 = String.valueOf(authenticationExtensionsClientOutputs);
        StringBuilder a5 = b.a(ProtectedSandApp.s("촰"), str2, ProtectedSandApp.s("촱"), str, ProtectedSandApp.s("촲"));
        l0.a(a5, encodeUrlSafeNoPadding, ProtectedSandApp.s("촳"), valueOf, ProtectedSandApp.s("촴"));
        l0.a(a5, valueOf2, ProtectedSandApp.s("촵"), valueOf3, ProtectedSandApp.s("촶"));
        return c.a(a5, valueOf4, ProtectedSandApp.s("촷"), str3, ProtectedSandApp.s("촸"));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        if (zzia.zzc()) {
            this.zzi = zza().toString();
        }
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getId(), false);
        SafeParcelWriter.writeString(parcel, 2, getType(), false);
        SafeParcelWriter.writeByteArray(parcel, 3, getRawId(), false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i4, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zze, i4, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i4, false);
        SafeParcelWriter.writeParcelable(parcel, 7, getClientExtensionResults(), i4, false);
        SafeParcelWriter.writeString(parcel, 8, getAuthenticatorAttachment(), false);
        SafeParcelWriter.writeString(parcel, 9, this.zzi, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        this.zzi = null;
    }

    @o0
    public final JSONObject zza() {
        JSONObject jSONObject;
        try {
            JSONObject jSONObject2 = new JSONObject();
            zzgx zzgxVar = this.zzc;
            if (zzgxVar != null && zzgxVar.zzm().length > 0) {
                jSONObject2.put(ProtectedSandApp.s("촹"), Base64Utils.encodeUrlSafeNoPadding(this.zzc.zzm()));
            }
            String str = this.zzh;
            if (str != null) {
                jSONObject2.put(ProtectedSandApp.s("촺"), str);
            }
            String str2 = this.zzb;
            if (str2 != null && this.zzf == null) {
                jSONObject2.put(ProtectedSandApp.s("촻"), str2);
            }
            String str3 = this.zza;
            if (str3 != null) {
                jSONObject2.put(ProtectedSandApp.s("촼"), str3);
            }
            String s4 = ProtectedSandApp.s("촽");
            AuthenticatorAssertionResponse authenticatorAssertionResponse = this.zze;
            boolean z4 = true;
            if (authenticatorAssertionResponse != null) {
                jSONObject = authenticatorAssertionResponse.zza();
            } else {
                AuthenticatorAttestationResponse authenticatorAttestationResponse = this.zzd;
                if (authenticatorAttestationResponse != null) {
                    jSONObject = authenticatorAttestationResponse.zza();
                } else {
                    AuthenticatorErrorResponse authenticatorErrorResponse = this.zzf;
                    z4 = false;
                    if (authenticatorErrorResponse != null) {
                        jSONObject = authenticatorErrorResponse.zza();
                        s4 = ProtectedSandApp.s("촾");
                    } else {
                        jSONObject = null;
                    }
                }
            }
            if (jSONObject != null) {
                jSONObject2.put(s4, jSONObject);
            }
            AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = this.zzg;
            String s5 = ProtectedSandApp.s("촿");
            if (authenticationExtensionsClientOutputs != null) {
                jSONObject2.put(s5, authenticationExtensionsClientOutputs.zza());
            } else if (z4) {
                jSONObject2.put(s5, new JSONObject());
            }
            return jSONObject2;
        } catch (JSONException e4) {
            throw new RuntimeException(ProtectedSandApp.s("쵀"), e4);
        }
    }

    private PublicKeyCredential(@q0 String str, @o0 String str2, @q0 zzgx zzgxVar, @q0 AuthenticatorAttestationResponse authenticatorAttestationResponse, @q0 AuthenticatorAssertionResponse authenticatorAssertionResponse, @q0 AuthenticatorErrorResponse authenticatorErrorResponse, @q0 AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs, @q0 String str3, @q0 String str4) {
        boolean z4 = false;
        Preconditions.checkArgument((authenticatorAttestationResponse != null && authenticatorAssertionResponse == null && authenticatorErrorResponse == null) || (authenticatorAttestationResponse == null && authenticatorAssertionResponse != null && authenticatorErrorResponse == null) || (authenticatorAttestationResponse == null && authenticatorAssertionResponse == null && authenticatorErrorResponse != null), ProtectedSandApp.s("촭"));
        if (authenticatorErrorResponse != null || (str != null && zzgxVar != null)) {
            z4 = true;
        }
        Preconditions.checkArgument(z4, ProtectedSandApp.s("촮"));
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzgxVar;
        this.zzd = authenticatorAttestationResponse;
        this.zze = authenticatorAssertionResponse;
        this.zzf = authenticatorErrorResponse;
        this.zzg = authenticationExtensionsClientOutputs;
        this.zzh = str3;
        this.zzi = null;
    }

    @SafeParcelable.Constructor
    PublicKeyCredential(@q0 @SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) @o0 String str2, @q0 @SafeParcelable.Param(id = 3) byte[] bArr, @q0 @SafeParcelable.Param(id = 4) AuthenticatorAttestationResponse authenticatorAttestationResponse, @q0 @SafeParcelable.Param(id = 5) AuthenticatorAssertionResponse authenticatorAssertionResponse, @q0 @SafeParcelable.Param(id = 6) AuthenticatorErrorResponse authenticatorErrorResponse, @q0 @SafeParcelable.Param(id = 7) AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs, @q0 @SafeParcelable.Param(id = 8) String str3, @q0 @SafeParcelable.Param(id = 9) String str4) {
        this(str, str2, bArr == null ? null : zzgx.zzl(bArr, 0, bArr.length), authenticatorAttestationResponse, authenticatorAssertionResponse, authenticatorErrorResponse, authenticationExtensionsClientOutputs, str3, str4);
    }
}
