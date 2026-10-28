package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.appcompat.view.g;
import androidx.room.l0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.internal.fido.zzia;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.Class(creator = "PublicKeyCredentialRequestOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public class PublicKeyCredentialRequestOptions extends RequestOptions {

    @o0
    public static final Parcelable.Creator<PublicKeyCredentialRequestOptions> CREATOR = new zzar();

    @o0
    @SafeParcelable.Field(getter = "getChallenge", id = 2)
    private final byte[] zza;

    @q0
    @SafeParcelable.Field(getter = "getTimeoutSeconds", id = 3)
    private final Double zzb;

    @o0
    @SafeParcelable.Field(getter = "getRpId", id = 4)
    private final String zzc;

    @q0
    @SafeParcelable.Field(getter = "getAllowList", id = 5)
    private final List zzd;

    @q0
    @SafeParcelable.Field(getter = "getRequestId", id = 6)
    private final Integer zze;

    @q0
    @SafeParcelable.Field(getter = "getTokenBinding", id = 7)
    private final TokenBinding zzf;

    @q0
    @SafeParcelable.Field(getter = "getUserVerificationAsString", id = 8, type = "java.lang.String")
    private final UserVerificationRequirement zzg;

    @q0
    @SafeParcelable.Field(getter = "getAuthenticationExtensions", id = 9)
    private final AuthenticationExtensions zzh;

    @q0
    @SafeParcelable.Field(getter = "getLongRequestId", id = 10)
    private final Long zzi;

    @q0
    @SafeParcelable.Field(getter = "getResultReceiver", id = 12)
    private ResultReceiver zzj;

    /* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    public static final class Builder {
        private byte[] zza;
        private Double zzb;
        private String zzc;
        private List zzd;
        private Integer zze;
        private TokenBinding zzf;
        private UserVerificationRequirement zzg;
        private AuthenticationExtensions zzh;
        private Long zzi;
        private ResultReceiver zzj;

        public Builder() {
        }

        @o0
        public PublicKeyCredentialRequestOptions build() {
            byte[] bArr = this.zza;
            Double d5 = this.zzb;
            String str = this.zzc;
            List list = this.zzd;
            Integer num = this.zze;
            TokenBinding tokenBinding = this.zzf;
            UserVerificationRequirement userVerificationRequirement = this.zzg;
            return new PublicKeyCredentialRequestOptions(bArr, d5, str, list, num, tokenBinding, userVerificationRequirement == null ? null : userVerificationRequirement.toString(), this.zzh, this.zzi, null, this.zzj);
        }

        @o0
        public Builder setAllowList(@q0 List<PublicKeyCredentialDescriptor> list) {
            this.zzd = list;
            return this;
        }

        @o0
        public Builder setAuthenticationExtensions(@q0 AuthenticationExtensions authenticationExtensions) {
            this.zzh = authenticationExtensions;
            return this;
        }

        @o0
        public Builder setChallenge(@o0 byte[] bArr) {
            this.zza = (byte[]) Preconditions.checkNotNull(bArr);
            return this;
        }

        @o0
        public Builder setRequestId(@q0 Integer num) {
            this.zze = num;
            return this;
        }

        @o0
        public Builder setRpId(@o0 String str) {
            this.zzc = (String) Preconditions.checkNotNull(str);
            return this;
        }

        @o0
        public Builder setTimeoutSeconds(@q0 Double d5) {
            this.zzb = d5;
            return this;
        }

        @o0
        public Builder setTokenBinding(@q0 TokenBinding tokenBinding) {
            this.zzf = tokenBinding;
            return this;
        }

        @o0
        public final Builder zza(@q0 Long l4) {
            this.zzi = l4;
            return this;
        }

        @o0
        public final Builder zzb(@q0 ResultReceiver resultReceiver) {
            this.zzj = null;
            return this;
        }

        @o0
        public final Builder zzc(@q0 UserVerificationRequirement userVerificationRequirement) {
            this.zzg = userVerificationRequirement;
            return this;
        }

        public Builder(@q0 PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions) {
            if (publicKeyCredentialRequestOptions != null) {
                this.zza = publicKeyCredentialRequestOptions.getChallenge();
                this.zzb = publicKeyCredentialRequestOptions.getTimeoutSeconds();
                this.zzc = publicKeyCredentialRequestOptions.getRpId();
                this.zzd = publicKeyCredentialRequestOptions.getAllowList();
                this.zze = publicKeyCredentialRequestOptions.getRequestId();
                this.zzf = publicKeyCredentialRequestOptions.getTokenBinding();
                this.zzg = publicKeyCredentialRequestOptions.zzb();
                this.zzh = publicKeyCredentialRequestOptions.getAuthenticationExtensions();
                this.zzi = publicKeyCredentialRequestOptions.zzc();
                this.zzj = publicKeyCredentialRequestOptions.zza();
            }
        }
    }

    @SafeParcelable.Constructor
    PublicKeyCredentialRequestOptions(@SafeParcelable.Param(id = 2) @o0 byte[] bArr, @q0 @SafeParcelable.Param(id = 3) Double d5, @SafeParcelable.Param(id = 4) @o0 String str, @q0 @SafeParcelable.Param(id = 5) List list, @q0 @SafeParcelable.Param(id = 6) Integer num, @q0 @SafeParcelable.Param(id = 7) TokenBinding tokenBinding, @q0 @SafeParcelable.Param(id = 8) String str2, @q0 @SafeParcelable.Param(id = 9) AuthenticationExtensions authenticationExtensions, @q0 @SafeParcelable.Param(id = 10) Long l4, @q0 @SafeParcelable.Param(id = 11) String str3, @q0 @SafeParcelable.Param(id = 12) ResultReceiver resultReceiver) {
        String s4 = ProtectedSandApp.s("쵪");
        String s5 = ProtectedSandApp.s("쵫");
        String s6 = ProtectedSandApp.s("쵬");
        String s7 = ProtectedSandApp.s("쵭");
        String s10 = ProtectedSandApp.s("쵮");
        String s11 = ProtectedSandApp.s("쵯");
        String s12 = ProtectedSandApp.s("쵰");
        String s13 = ProtectedSandApp.s("쵱");
        String s14 = ProtectedSandApp.s("쵲");
        String s15 = ProtectedSandApp.s("쵳");
        String s16 = ProtectedSandApp.s("쵴");
        this.zzj = resultReceiver;
        if (str3 == null || !zzia.zzc()) {
            this.zza = (byte[]) Preconditions.checkNotNull(bArr);
            this.zzb = d5;
            this.zzc = (String) Preconditions.checkNotNull(str);
            this.zzd = list;
            this.zze = num;
            this.zzf = tokenBinding;
            this.zzi = l4;
            if (str2 != null) {
                try {
                    this.zzg = UserVerificationRequirement.fromString(str2);
                } catch (zzbc e4) {
                    throw new IllegalArgumentException(e4);
                }
            } else {
                this.zzg = null;
            }
            this.zzh = authenticationExtensions;
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str3);
            Builder builder = new Builder();
            builder.setChallenge(Base64Utils.decodeUrlSafeNoPadding(jSONObject.getString(ProtectedSandApp.s("쵵"))));
            if (jSONObject.has(s16)) {
                builder.setTimeoutSeconds(Double.valueOf(jSONObject.getDouble(s16) / 1000.0d));
            } else if (jSONObject.has(s15)) {
                builder.setTimeoutSeconds(Double.valueOf(jSONObject.getDouble(s15)));
            }
            builder.setRpId(jSONObject.getString(ProtectedSandApp.s("쵶")));
            JSONArray jSONArray = jSONObject.has(s14) ? jSONObject.getJSONArray(s14) : jSONObject.has(s13) ? jSONObject.getJSONArray(s13) : null;
            if (jSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                    arrayList.add(PublicKeyCredentialDescriptor.zza(jSONArray.getJSONObject(i4)));
                }
                builder.setAllowList(arrayList);
            }
            if (jSONObject.has(s12)) {
                builder.setRequestId(Integer.valueOf(jSONObject.getInt(s12)));
            }
            if (jSONObject.has(s11)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(s11);
                builder.setTokenBinding(new TokenBinding(jSONObject2.getString(ProtectedSandApp.s("쵷")), jSONObject2.has(s10) ? jSONObject2.getString(s10) : null));
            }
            if (jSONObject.has(s7)) {
                builder.zzc(UserVerificationRequirement.fromString(jSONObject.getString(s7)));
            }
            if (jSONObject.has(s6)) {
                builder.setAuthenticationExtensions(AuthenticationExtensions.zza(jSONObject.getJSONObject(s6)));
            } else if (jSONObject.has(s5)) {
                builder.setAuthenticationExtensions(AuthenticationExtensions.zza(jSONObject.getJSONObject(s5)));
            }
            if (jSONObject.has(s4)) {
                builder.zza(Long.valueOf(jSONObject.getLong(s4)));
            }
            PublicKeyCredentialRequestOptions build = builder.build();
            this.zza = build.zza;
            this.zzb = build.zzb;
            this.zzc = build.zzc;
            this.zzd = build.zzd;
            this.zze = build.zze;
            this.zzf = build.zzf;
            this.zzg = build.zzg;
            this.zzh = build.zzh;
            this.zzi = build.zzi;
        } catch (zzbc e5) {
            e = e5;
            throw new IllegalArgumentException(e);
        } catch (JSONException e6) {
            e = e6;
            throw new IllegalArgumentException(e);
        }
    }

    @o0
    public static PublicKeyCredentialRequestOptions deserializeFromBytes(@q0 byte[] bArr) {
        return (PublicKeyCredentialRequestOptions) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    public boolean equals(@o0 Object obj) {
        List list;
        List list2;
        if (!(obj instanceof PublicKeyCredentialRequestOptions)) {
            return false;
        }
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) obj;
        return Arrays.equals(this.zza, publicKeyCredentialRequestOptions.zza) && Objects.equal(this.zzb, publicKeyCredentialRequestOptions.zzb) && Objects.equal(this.zzc, publicKeyCredentialRequestOptions.zzc) && (((list = this.zzd) == null && publicKeyCredentialRequestOptions.zzd == null) || (list != null && (list2 = publicKeyCredentialRequestOptions.zzd) != null && list.containsAll(list2) && publicKeyCredentialRequestOptions.zzd.containsAll(this.zzd))) && Objects.equal(this.zze, publicKeyCredentialRequestOptions.zze) && Objects.equal(this.zzf, publicKeyCredentialRequestOptions.zzf) && Objects.equal(this.zzg, publicKeyCredentialRequestOptions.zzg) && Objects.equal(this.zzh, publicKeyCredentialRequestOptions.zzh) && Objects.equal(this.zzi, publicKeyCredentialRequestOptions.zzi);
    }

    @q0
    public List<PublicKeyCredentialDescriptor> getAllowList() {
        return this.zzd;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    @q0
    public AuthenticationExtensions getAuthenticationExtensions() {
        return this.zzh;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    @o0
    public byte[] getChallenge() {
        return this.zza;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    @q0
    public Integer getRequestId() {
        return this.zze;
    }

    @o0
    public String getRpId() {
        return this.zzc;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    @q0
    public Double getTimeoutSeconds() {
        return this.zzb;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    @q0
    public TokenBinding getTokenBinding() {
        return this.zzf;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.zza)), this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    @o0
    public byte[] serializeToBytes() {
        if (!zzia.zzd()) {
            return SafeParcelableSerializer.serializeToBytes(this);
        }
        Builder builder = new Builder(this);
        builder.zzb(null);
        return SafeParcelableSerializer.serializeToBytes(builder.build());
    }

    @o0
    public final String toString() {
        AuthenticationExtensions authenticationExtensions = this.zzh;
        UserVerificationRequirement userVerificationRequirement = this.zzg;
        TokenBinding tokenBinding = this.zzf;
        List list = this.zzd;
        String encodeUrlSafeNoPadding = Base64Utils.encodeUrlSafeNoPadding(this.zza);
        String valueOf = String.valueOf(list);
        String valueOf2 = String.valueOf(tokenBinding);
        String valueOf3 = String.valueOf(userVerificationRequirement);
        String valueOf4 = String.valueOf(authenticationExtensions);
        StringBuilder a5 = g.a(ProtectedSandApp.s("쵸"), encodeUrlSafeNoPadding, ProtectedSandApp.s("쵹"));
        a5.append(this.zzb);
        a5.append(ProtectedSandApp.s("쵺"));
        l0.a(a5, this.zzc, ProtectedSandApp.s("쵻"), valueOf, ProtectedSandApp.s("쵼"));
        a5.append(this.zze);
        a5.append(ProtectedSandApp.s("쵽"));
        a5.append(valueOf2);
        a5.append(ProtectedSandApp.s("쵾"));
        l0.a(a5, valueOf3, ProtectedSandApp.s("쵿"), valueOf4, ProtectedSandApp.s("춀"));
        a5.append(this.zzi);
        a5.append(ProtectedSandApp.s("춁"));
        return a5.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 2, getChallenge(), false);
        SafeParcelWriter.writeDoubleObject(parcel, 3, getTimeoutSeconds(), false);
        SafeParcelWriter.writeString(parcel, 4, getRpId(), false);
        SafeParcelWriter.writeTypedList(parcel, 5, getAllowList(), false);
        SafeParcelWriter.writeIntegerObject(parcel, 6, getRequestId(), false);
        SafeParcelWriter.writeParcelable(parcel, 7, getTokenBinding(), i4, false);
        UserVerificationRequirement userVerificationRequirement = this.zzg;
        SafeParcelWriter.writeString(parcel, 8, userVerificationRequirement == null ? null : userVerificationRequirement.toString(), false);
        SafeParcelWriter.writeParcelable(parcel, 9, getAuthenticationExtensions(), i4, false);
        SafeParcelWriter.writeLongObject(parcel, 10, this.zzi, false);
        SafeParcelWriter.writeString(parcel, 11, null, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.zzj, i4, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @q0
    public final ResultReceiver zza() {
        return this.zzj;
    }

    @q0
    public final UserVerificationRequirement zzb() {
        return this.zzg;
    }

    @q0
    public final Long zzc() {
        return this.zzi;
    }
}
