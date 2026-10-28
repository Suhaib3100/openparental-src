package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.constraintlayout.core.parser.b;
import androidx.fragment.app.c;
import androidx.room.l0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.internal.fido.zzbl;
import com.google.android.gms.internal.fido.zzia;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.Class(creator = "PublicKeyCredentialCreationOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public class PublicKeyCredentialCreationOptions extends RequestOptions {

    @o0
    public static final Parcelable.Creator<PublicKeyCredentialCreationOptions> CREATOR = new zzan();

    @o0
    @SafeParcelable.Field(getter = "getRp", id = 2)
    private final PublicKeyCredentialRpEntity zza;

    @o0
    @SafeParcelable.Field(getter = "getUser", id = 3)
    private final PublicKeyCredentialUserEntity zzb;

    @o0
    @SafeParcelable.Field(getter = "getChallenge", id = 4)
    private final byte[] zzc;

    @o0
    @SafeParcelable.Field(getter = "getParameters", id = 5)
    private final List zzd;

    @q0
    @SafeParcelable.Field(getter = "getTimeoutSeconds", id = 6)
    private final Double zze;

    @q0
    @SafeParcelable.Field(getter = "getExcludeList", id = 7)
    private final List zzf;

    @q0
    @SafeParcelable.Field(getter = "getAuthenticatorSelection", id = 8)
    private final AuthenticatorSelectionCriteria zzg;

    @q0
    @SafeParcelable.Field(getter = "getRequestId", id = 9)
    private final Integer zzh;

    @q0
    @SafeParcelable.Field(getter = "getTokenBinding", id = 10)
    private final TokenBinding zzi;

    @q0
    @SafeParcelable.Field(getter = "getAttestationConveyancePreferenceAsString", id = 11, type = "java.lang.String")
    private final AttestationConveyancePreference zzj;

    @q0
    @SafeParcelable.Field(getter = "getAuthenticationExtensions", id = 12)
    private final AuthenticationExtensions zzk;

    @q0
    @SafeParcelable.Field(getter = "getJsonString", id = 13)
    private final String zzl;

    @q0
    @SafeParcelable.Field(getter = "getResultReceiver", id = 14)
    private ResultReceiver zzm;

    /* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    public static final class Builder {
        private PublicKeyCredentialRpEntity zza;
        private PublicKeyCredentialUserEntity zzb;
        private byte[] zzc;
        private List zzd;
        private Double zze;
        private List zzf;
        private AuthenticatorSelectionCriteria zzg;
        private Integer zzh;
        private TokenBinding zzi;
        private AttestationConveyancePreference zzj;
        private AuthenticationExtensions zzk;

        @o0
        public PublicKeyCredentialCreationOptions build() {
            PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = this.zza;
            PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = this.zzb;
            byte[] bArr = this.zzc;
            List list = this.zzd;
            Double d5 = this.zze;
            List list2 = this.zzf;
            AuthenticatorSelectionCriteria authenticatorSelectionCriteria = this.zzg;
            Integer num = this.zzh;
            TokenBinding tokenBinding = this.zzi;
            AttestationConveyancePreference attestationConveyancePreference = this.zzj;
            return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, bArr, list, d5, list2, authenticatorSelectionCriteria, num, tokenBinding, attestationConveyancePreference == null ? null : attestationConveyancePreference.toString(), this.zzk, null, null);
        }

        @o0
        public Builder setAttestationConveyancePreference(@q0 AttestationConveyancePreference attestationConveyancePreference) {
            this.zzj = attestationConveyancePreference;
            return this;
        }

        @o0
        public Builder setAuthenticationExtensions(@q0 AuthenticationExtensions authenticationExtensions) {
            this.zzk = authenticationExtensions;
            return this;
        }

        @o0
        public Builder setAuthenticatorSelection(@q0 AuthenticatorSelectionCriteria authenticatorSelectionCriteria) {
            this.zzg = authenticatorSelectionCriteria;
            return this;
        }

        @o0
        public Builder setChallenge(@o0 byte[] bArr) {
            this.zzc = (byte[]) Preconditions.checkNotNull(bArr);
            return this;
        }

        @o0
        public Builder setExcludeList(@q0 List<PublicKeyCredentialDescriptor> list) {
            this.zzf = list;
            return this;
        }

        @o0
        public Builder setParameters(@o0 List<PublicKeyCredentialParameters> list) {
            this.zzd = (List) Preconditions.checkNotNull(list);
            return this;
        }

        @o0
        public Builder setRequestId(@q0 Integer num) {
            this.zzh = num;
            return this;
        }

        @o0
        public Builder setRp(@o0 PublicKeyCredentialRpEntity publicKeyCredentialRpEntity) {
            this.zza = (PublicKeyCredentialRpEntity) Preconditions.checkNotNull(publicKeyCredentialRpEntity);
            return this;
        }

        @o0
        public Builder setTimeoutSeconds(@q0 Double d5) {
            this.zze = d5;
            return this;
        }

        @o0
        public Builder setTokenBinding(@q0 TokenBinding tokenBinding) {
            this.zzi = tokenBinding;
            return this;
        }

        @o0
        public Builder setUser(@o0 PublicKeyCredentialUserEntity publicKeyCredentialUserEntity) {
            this.zzb = (PublicKeyCredentialUserEntity) Preconditions.checkNotNull(publicKeyCredentialUserEntity);
            return this;
        }
    }

    @SafeParcelable.Constructor
    PublicKeyCredentialCreationOptions(@SafeParcelable.Param(id = 2) @o0 PublicKeyCredentialRpEntity publicKeyCredentialRpEntity, @SafeParcelable.Param(id = 3) @o0 PublicKeyCredentialUserEntity publicKeyCredentialUserEntity, @SafeParcelable.Param(id = 4) @o0 byte[] bArr, @SafeParcelable.Param(id = 5) @o0 List list, @q0 @SafeParcelable.Param(id = 6) Double d5, @q0 @SafeParcelable.Param(id = 7) List list2, @q0 @SafeParcelable.Param(id = 8) AuthenticatorSelectionCriteria authenticatorSelectionCriteria, @q0 @SafeParcelable.Param(id = 9) Integer num, @q0 @SafeParcelable.Param(id = 10) TokenBinding tokenBinding, @q0 @SafeParcelable.Param(id = 11) String str, @q0 @SafeParcelable.Param(id = 12) AuthenticationExtensions authenticationExtensions, @q0 @SafeParcelable.Param(id = 13) String str2, @q0 @SafeParcelable.Param(id = 14) ResultReceiver resultReceiver) {
        this.zzm = resultReceiver;
        if (str2 != null) {
            try {
                PublicKeyCredentialCreationOptions zza = zza(new JSONObject(str2));
                this.zza = zza.zza;
                this.zzb = zza.zzb;
                this.zzc = zza.zzc;
                this.zzd = zza.zzd;
                this.zze = zza.zze;
                this.zzf = zza.zzf;
                this.zzg = zza.zzg;
                this.zzh = zza.zzh;
                this.zzi = zza.zzi;
                this.zzj = zza.zzj;
                this.zzk = zza.zzk;
                this.zzl = str2;
                return;
            } catch (JSONException e4) {
                throw new IllegalArgumentException(e4);
            }
        }
        this.zza = (PublicKeyCredentialRpEntity) Preconditions.checkNotNull(publicKeyCredentialRpEntity);
        this.zzb = (PublicKeyCredentialUserEntity) Preconditions.checkNotNull(publicKeyCredentialUserEntity);
        this.zzc = (byte[]) Preconditions.checkNotNull(bArr);
        this.zzd = (List) Preconditions.checkNotNull(list);
        this.zze = d5;
        this.zzf = list2;
        this.zzg = authenticatorSelectionCriteria;
        this.zzh = num;
        this.zzi = tokenBinding;
        if (str != null) {
            try {
                this.zzj = AttestationConveyancePreference.fromString(str);
            } catch (AttestationConveyancePreference.UnsupportedAttestationConveyancePreferenceException e5) {
                throw new IllegalArgumentException(e5);
            }
        } else {
            this.zzj = null;
        }
        this.zzk = authenticationExtensions;
        this.zzl = null;
    }

    @o0
    public static PublicKeyCredentialCreationOptions deserializeFromBytes(@o0 byte[] bArr) {
        return (PublicKeyCredentialCreationOptions) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    @o0
    public static PublicKeyCredentialCreationOptions zza(@o0 JSONObject jSONObject) throws JSONException {
        zzbl zzc;
        Builder builder = new Builder();
        JSONObject jSONObject2 = jSONObject.getJSONObject(ProtectedSandApp.s("쵁"));
        Parcelable.Creator<PublicKeyCredentialRpEntity> creator = PublicKeyCredentialRpEntity.CREATOR;
        String s4 = ProtectedSandApp.s("쵂");
        String string = jSONObject2.getString(s4);
        String s5 = ProtectedSandApp.s("쵃");
        String string2 = jSONObject2.getString(s5);
        String s6 = ProtectedSandApp.s("쵄");
        builder.setRp(new PublicKeyCredentialRpEntity(string, string2, jSONObject2.has(s6) ? jSONObject2.optString(s6) : null));
        JSONObject jSONObject3 = jSONObject.getJSONObject(ProtectedSandApp.s("쵅"));
        Parcelable.Creator<PublicKeyCredentialUserEntity> creator2 = PublicKeyCredentialUserEntity.CREATOR;
        builder.setUser(new PublicKeyCredentialUserEntity(Base64Utils.decodeUrlSafeNoPadding(jSONObject3.getString(s4)), jSONObject3.getString(s5), jSONObject3.has(s6) ? jSONObject3.optString(s6) : null, jSONObject3.optString(ProtectedSandApp.s("쵆"))));
        builder.setChallenge(Base64Utils.decodeUrlSafeNoPadding(jSONObject.getString(ProtectedSandApp.s("쵇"))));
        JSONArray jSONArray = jSONObject.getJSONArray(ProtectedSandApp.s("쵈"));
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            JSONObject jSONObject4 = jSONArray.getJSONObject(i4);
            Parcelable.Creator<PublicKeyCredentialParameters> creator3 = PublicKeyCredentialParameters.CREATOR;
            try {
                zzc = zzbl.zzd(new PublicKeyCredentialParameters(jSONObject4.getString(ProtectedSandApp.s("쵉")), jSONObject4.getInt(ProtectedSandApp.s("쵊"))));
            } catch (IllegalArgumentException unused) {
                zzc = zzbl.zzc();
            }
            if (zzc.zzb()) {
                arrayList.add(zzc.zza());
            }
        }
        builder.setParameters(arrayList);
        String s7 = ProtectedSandApp.s("쵋");
        if (jSONObject.has(s7)) {
            builder.setTimeoutSeconds(Double.valueOf(jSONObject.getDouble(s7) / 1000.0d));
        }
        String s10 = ProtectedSandApp.s("쵌");
        if (jSONObject.has(s10)) {
            JSONArray jSONArray2 = jSONObject.getJSONArray(s10);
            ArrayList arrayList2 = new ArrayList();
            for (int i5 = 0; i5 < jSONArray2.length(); i5++) {
                arrayList2.add(PublicKeyCredentialDescriptor.zza(jSONArray2.getJSONObject(i5)));
            }
            builder.setExcludeList(arrayList2);
        }
        String s11 = ProtectedSandApp.s("쵍");
        if (jSONObject.has(s11)) {
            JSONObject jSONObject5 = jSONObject.getJSONObject(s11);
            Parcelable.Creator<AuthenticatorSelectionCriteria> creator4 = AuthenticatorSelectionCriteria.CREATOR;
            String s12 = ProtectedSandApp.s("쵎");
            String optString = jSONObject5.has(s12) ? jSONObject5.optString(s12) : null;
            String s13 = ProtectedSandApp.s("쵏");
            String optString2 = jSONObject5.has(s13) ? jSONObject5.optString(s13) : null;
            String s14 = ProtectedSandApp.s("쵐");
            Boolean valueOf = jSONObject5.has(s14) ? Boolean.valueOf(jSONObject5.optBoolean(s14)) : null;
            String s15 = ProtectedSandApp.s("쵑");
            builder.setAuthenticatorSelection(new AuthenticatorSelectionCriteria(optString, valueOf, jSONObject5.has(s15) ? jSONObject5.optString(s15) : null, optString2));
        }
        String s16 = ProtectedSandApp.s("쵒");
        if (jSONObject.has(s16)) {
            builder.setAuthenticationExtensions(AuthenticationExtensions.zza(jSONObject.getJSONObject(s16)));
        }
        String s17 = ProtectedSandApp.s("쵓");
        if (jSONObject.has(s17)) {
            try {
                builder.setAttestationConveyancePreference(AttestationConveyancePreference.fromString(jSONObject.getString(s17)));
            } catch (AttestationConveyancePreference.UnsupportedAttestationConveyancePreferenceException unused2) {
                builder.setAttestationConveyancePreference(AttestationConveyancePreference.NONE);
            }
        }
        return builder.build();
    }

    public boolean equals(@o0 Object obj) {
        List list;
        List list2;
        if (!(obj instanceof PublicKeyCredentialCreationOptions)) {
            return false;
        }
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) obj;
        return Objects.equal(this.zza, publicKeyCredentialCreationOptions.zza) && Objects.equal(this.zzb, publicKeyCredentialCreationOptions.zzb) && Arrays.equals(this.zzc, publicKeyCredentialCreationOptions.zzc) && Objects.equal(this.zze, publicKeyCredentialCreationOptions.zze) && this.zzd.containsAll(publicKeyCredentialCreationOptions.zzd) && publicKeyCredentialCreationOptions.zzd.containsAll(this.zzd) && (((list = this.zzf) == null && publicKeyCredentialCreationOptions.zzf == null) || (list != null && (list2 = publicKeyCredentialCreationOptions.zzf) != null && list.containsAll(list2) && publicKeyCredentialCreationOptions.zzf.containsAll(this.zzf))) && Objects.equal(this.zzg, publicKeyCredentialCreationOptions.zzg) && Objects.equal(this.zzh, publicKeyCredentialCreationOptions.zzh) && Objects.equal(this.zzi, publicKeyCredentialCreationOptions.zzi) && Objects.equal(this.zzj, publicKeyCredentialCreationOptions.zzj) && Objects.equal(this.zzk, publicKeyCredentialCreationOptions.zzk) && Objects.equal(this.zzl, publicKeyCredentialCreationOptions.zzl);
    }

    @q0
    public AttestationConveyancePreference getAttestationConveyancePreference() {
        return this.zzj;
    }

    @q0
    public String getAttestationConveyancePreferenceAsString() {
        AttestationConveyancePreference attestationConveyancePreference = this.zzj;
        if (attestationConveyancePreference == null) {
            return null;
        }
        return attestationConveyancePreference.toString();
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    @q0
    public AuthenticationExtensions getAuthenticationExtensions() {
        return this.zzk;
    }

    @q0
    public AuthenticatorSelectionCriteria getAuthenticatorSelection() {
        return this.zzg;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    @o0
    public byte[] getChallenge() {
        return this.zzc;
    }

    @q0
    public List<PublicKeyCredentialDescriptor> getExcludeList() {
        return this.zzf;
    }

    @q0
    public String getJsonString() {
        return this.zzl;
    }

    @o0
    public List<PublicKeyCredentialParameters> getParameters() {
        return this.zzd;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    @q0
    public Integer getRequestId() {
        return this.zzh;
    }

    @o0
    public PublicKeyCredentialRpEntity getRp() {
        return this.zza;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    @q0
    public Double getTimeoutSeconds() {
        return this.zze;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    @q0
    public TokenBinding getTokenBinding() {
        return this.zzi;
    }

    @o0
    public PublicKeyCredentialUserEntity getUser() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, Integer.valueOf(Arrays.hashCode(this.zzc)), this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl);
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    @o0
    public byte[] serializeToBytes() {
        if (!zzia.zzd()) {
            return SafeParcelableSerializer.serializeToBytes(this);
        }
        Builder builder = new Builder();
        builder.setRp(this.zza);
        builder.setUser(this.zzb);
        builder.setChallenge(this.zzc);
        builder.setParameters(this.zzd);
        builder.setTimeoutSeconds(this.zze);
        builder.setExcludeList(this.zzf);
        builder.setAuthenticatorSelection(this.zzg);
        builder.setRequestId(this.zzh);
        builder.setTokenBinding(this.zzi);
        builder.setAttestationConveyancePreference(this.zzj);
        builder.setAuthenticationExtensions(this.zzk);
        return SafeParcelableSerializer.serializeToBytes(builder.build());
    }

    @o0
    public final String toString() {
        AuthenticationExtensions authenticationExtensions = this.zzk;
        AttestationConveyancePreference attestationConveyancePreference = this.zzj;
        TokenBinding tokenBinding = this.zzi;
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = this.zzg;
        List list = this.zzf;
        List list2 = this.zzd;
        byte[] bArr = this.zzc;
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = this.zzb;
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(publicKeyCredentialUserEntity);
        String encodeUrlSafeNoPadding = Base64Utils.encodeUrlSafeNoPadding(bArr);
        String valueOf3 = String.valueOf(list2);
        String valueOf4 = String.valueOf(list);
        String valueOf5 = String.valueOf(authenticatorSelectionCriteria);
        String valueOf6 = String.valueOf(tokenBinding);
        String valueOf7 = String.valueOf(attestationConveyancePreference);
        String valueOf8 = String.valueOf(authenticationExtensions);
        StringBuilder a5 = b.a(ProtectedSandApp.s("쵔"), valueOf, ProtectedSandApp.s("쵕"), valueOf2, ProtectedSandApp.s("쵖"));
        l0.a(a5, encodeUrlSafeNoPadding, ProtectedSandApp.s("쵗"), valueOf3, ProtectedSandApp.s("쵘"));
        a5.append(this.zze);
        a5.append(ProtectedSandApp.s("쵙"));
        a5.append(valueOf4);
        a5.append(ProtectedSandApp.s("쵚"));
        a5.append(valueOf5);
        a5.append(ProtectedSandApp.s("쵛"));
        a5.append(this.zzh);
        a5.append(ProtectedSandApp.s("최"));
        a5.append(valueOf6);
        a5.append(ProtectedSandApp.s("쵝"));
        return c.a(a5, valueOf7, ProtectedSandApp.s("쵞"), valueOf8, ProtectedSandApp.s("쵟"));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getRp(), i4, false);
        SafeParcelWriter.writeParcelable(parcel, 3, getUser(), i4, false);
        SafeParcelWriter.writeByteArray(parcel, 4, getChallenge(), false);
        SafeParcelWriter.writeTypedList(parcel, 5, getParameters(), false);
        SafeParcelWriter.writeDoubleObject(parcel, 6, getTimeoutSeconds(), false);
        SafeParcelWriter.writeTypedList(parcel, 7, getExcludeList(), false);
        SafeParcelWriter.writeParcelable(parcel, 8, getAuthenticatorSelection(), i4, false);
        SafeParcelWriter.writeIntegerObject(parcel, 9, getRequestId(), false);
        SafeParcelWriter.writeParcelable(parcel, 10, getTokenBinding(), i4, false);
        SafeParcelWriter.writeString(parcel, 11, getAttestationConveyancePreferenceAsString(), false);
        SafeParcelWriter.writeParcelable(parcel, 12, getAuthenticationExtensions(), i4, false);
        SafeParcelWriter.writeString(parcel, 13, getJsonString(), false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.zzm, i4, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public PublicKeyCredentialCreationOptions(@o0 String str) {
        try {
            PublicKeyCredentialCreationOptions zza = zza(new JSONObject(str));
            this.zza = zza.zza;
            this.zzb = zza.zzb;
            this.zzc = zza.zzc;
            this.zzd = zza.zzd;
            this.zze = zza.zze;
            this.zzf = zza.zzf;
            this.zzg = zza.zzg;
            this.zzh = zza.zzh;
            this.zzi = zza.zzi;
            this.zzj = zza.zzj;
            this.zzk = zza.zzk;
            this.zzl = str;
        } catch (JSONException e4) {
            throw new IllegalArgumentException(e4);
        }
    }
}
