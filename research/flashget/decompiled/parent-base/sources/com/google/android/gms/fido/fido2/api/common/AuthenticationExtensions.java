package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.c;
import android.util.Base64;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.constraintlayout.core.parser.b;
import androidx.room.l0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.Class(creator = "AuthenticationExtensionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public class AuthenticationExtensions extends AbstractSafeParcelable {

    @o0
    public static final Parcelable.Creator<AuthenticationExtensions> CREATOR = new zzd();

    @q0
    @SafeParcelable.Field(getter = "getFidoAppIdExtension", id = 2)
    private final FidoAppIdExtension zza;

    @q0
    @SafeParcelable.Field(getter = "getCableAuthenticationExtension", id = 3)
    private final zzs zzb;

    @q0
    @SafeParcelable.Field(getter = "getUserVerificationMethodExtension", id = 4)
    private final UserVerificationMethodExtension zzc;

    @q0
    @SafeParcelable.Field(getter = "getGoogleMultiAssertionExtension", id = 5)
    private final zzz zzd;

    @q0
    @SafeParcelable.Field(getter = "getGoogleSessionIdExtension", id = 6)
    private final zzab zze;

    @q0
    @SafeParcelable.Field(getter = "getGoogleSilentVerificationExtension", id = 7)
    private final zzad zzf;

    @q0
    @SafeParcelable.Field(getter = "getDevicePublicKeyExtension", id = 8)
    private final zzu zzg;

    @q0
    @SafeParcelable.Field(getter = "getGoogleTunnelServerIdExtension", id = 9)
    private final zzag zzh;

    @q0
    @SafeParcelable.Field(getter = "getGoogleThirdPartyPaymentExtension", id = 10)
    private final GoogleThirdPartyPaymentExtension zzi;

    @q0
    @SafeParcelable.Field(getter = "getPrfExtension", id = 11)
    private final zzak zzj;

    @q0
    @SafeParcelable.Field(getter = "getSimpleTransactionAuthorizationExtension", id = 12)
    private final zzaw zzk;

    @q0
    @SafeParcelable.Field(getter = "getHmacSecretExtension", id = 13)
    private final zzai zzl;

    /* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    public static final class Builder {

        @q0
        private FidoAppIdExtension zza;

        @q0
        private UserVerificationMethodExtension zzb;

        @q0
        private zzs zzc;

        @q0
        private zzz zzd;

        @q0
        private zzab zze;

        @q0
        private zzad zzf;

        @q0
        private zzu zzg;

        @q0
        private zzag zzh;

        @q0
        private GoogleThirdPartyPaymentExtension zzi;

        @q0
        private zzak zzj;

        @q0
        private zzaw zzk;

        @q0
        private zzai zzl;

        public Builder() {
        }

        @o0
        public AuthenticationExtensions build() {
            return new AuthenticationExtensions(this.zza, this.zzc, this.zzb, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl);
        }

        @o0
        public Builder setFido2Extension(@q0 FidoAppIdExtension fidoAppIdExtension) {
            this.zza = fidoAppIdExtension;
            return this;
        }

        @o0
        public Builder setGoogleThirdPartyPaymentExtension(@q0 GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension) {
            this.zzi = googleThirdPartyPaymentExtension;
            return this;
        }

        @o0
        public Builder setUserVerificationMethodExtension(@q0 UserVerificationMethodExtension userVerificationMethodExtension) {
            this.zzb = userVerificationMethodExtension;
            return this;
        }

        public final Builder zza(@q0 zzs zzsVar) {
            this.zzc = zzsVar;
            return this;
        }

        public final Builder zzb(@q0 zzu zzuVar) {
            this.zzg = zzuVar;
            return this;
        }

        public final Builder zzc(@q0 zzz zzzVar) {
            this.zzd = zzzVar;
            return this;
        }

        public final Builder zzd(@q0 zzab zzabVar) {
            this.zze = zzabVar;
            return this;
        }

        public final Builder zze(@q0 zzad zzadVar) {
            this.zzf = zzadVar;
            return this;
        }

        public final Builder zzf(@q0 zzag zzagVar) {
            this.zzh = zzagVar;
            return this;
        }

        public final Builder zzg(@q0 zzak zzakVar) {
            this.zzj = zzakVar;
            return this;
        }

        public final Builder zzh(@q0 zzaw zzawVar) {
            this.zzk = zzawVar;
            return this;
        }

        public Builder(@q0 AuthenticationExtensions authenticationExtensions) {
            if (authenticationExtensions != null) {
                this.zza = authenticationExtensions.getFidoAppIdExtension();
                this.zzb = authenticationExtensions.getUserVerificationMethodExtension();
                this.zzc = authenticationExtensions.zzb();
                this.zzd = authenticationExtensions.zzd();
                this.zze = authenticationExtensions.zze();
                this.zzf = authenticationExtensions.zzf();
                this.zzg = authenticationExtensions.zzc();
                this.zzh = authenticationExtensions.zzh();
                this.zzi = authenticationExtensions.zzg();
                this.zzj = authenticationExtensions.zzj();
                this.zzk = authenticationExtensions.zzk();
                this.zzl = authenticationExtensions.zzi();
            }
        }
    }

    @SafeParcelable.Constructor
    AuthenticationExtensions(@q0 @SafeParcelable.Param(id = 2) FidoAppIdExtension fidoAppIdExtension, @q0 @SafeParcelable.Param(id = 3) zzs zzsVar, @q0 @SafeParcelable.Param(id = 4) UserVerificationMethodExtension userVerificationMethodExtension, @q0 @SafeParcelable.Param(id = 5) zzz zzzVar, @q0 @SafeParcelable.Param(id = 6) zzab zzabVar, @q0 @SafeParcelable.Param(id = 7) zzad zzadVar, @q0 @SafeParcelable.Param(id = 8) zzu zzuVar, @q0 @SafeParcelable.Param(id = 9) zzag zzagVar, @q0 @SafeParcelable.Param(id = 10) GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension, @q0 @SafeParcelable.Param(id = 11) zzak zzakVar, @q0 @SafeParcelable.Param(id = 12) zzaw zzawVar, @q0 @SafeParcelable.Param(id = 13) zzai zzaiVar) {
        this.zza = fidoAppIdExtension;
        this.zzc = userVerificationMethodExtension;
        this.zzb = zzsVar;
        this.zzd = zzzVar;
        this.zze = zzabVar;
        this.zzf = zzadVar;
        this.zzg = zzuVar;
        this.zzh = zzagVar;
        this.zzi = googleThirdPartyPaymentExtension;
        this.zzj = zzakVar;
        this.zzk = zzawVar;
        this.zzl = zzaiVar;
    }

    @o0
    public static AuthenticationExtensions zza(@o0 JSONObject jSONObject) throws JSONException {
        Builder builder = new Builder();
        String s4 = ProtectedSandApp.s("첯");
        boolean has = jSONObject.has(s4);
        String s5 = ProtectedSandApp.s("첰");
        if (has) {
            builder.setFido2Extension(new FidoAppIdExtension(jSONObject.getJSONObject(s4).getString(s5)));
        }
        if (jSONObject.has(s5)) {
            builder.setFido2Extension(new FidoAppIdExtension(jSONObject.getString(s5)));
        }
        String s6 = ProtectedSandApp.s("첱");
        boolean has2 = jSONObject.has(s6);
        String s7 = ProtectedSandApp.s("첲");
        if (has2) {
            if (jSONObject.has(s7)) {
                throw new JSONException(ProtectedSandApp.s("첳"));
            }
            builder.zzg(zzak.zza(jSONObject.getJSONObject(s6), false));
        } else if (jSONObject.has(s7)) {
            builder.zzg(zzak.zza(jSONObject.getJSONObject(s7), true));
        }
        String s10 = ProtectedSandApp.s("체");
        if (jSONObject.has(s10)) {
            JSONArray jSONArray = jSONObject.getJSONArray(s10);
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i4);
                arrayList.add(new zzq(jSONObject2.getLong(ProtectedSandApp.s("첵")), Base64.decode(jSONObject2.getString(ProtectedSandApp.s("첶")), 11), Base64.decode(jSONObject2.getString(ProtectedSandApp.s("첷")), 11), Base64.decode(jSONObject2.getString(ProtectedSandApp.s("첸")), 11)));
            }
            builder.zza(new zzs(arrayList));
        }
        String s11 = ProtectedSandApp.s("첹");
        if (jSONObject.has(s11)) {
            builder.setUserVerificationMethodExtension(new UserVerificationMethodExtension(jSONObject.getJSONObject(s11).getBoolean(ProtectedSandApp.s("첺"))));
        }
        String s12 = ProtectedSandApp.s("첻");
        if (jSONObject.has(s12)) {
            builder.zzc(new zzz(jSONObject.getJSONObject(s12).getBoolean(ProtectedSandApp.s("첼"))));
        }
        if (jSONObject.has(ProtectedSandApp.s("첽"))) {
            builder.zzd(new zzab(jSONObject.getJSONObject(r1).getInt(ProtectedSandApp.s("첾"))));
        }
        String s13 = ProtectedSandApp.s("첿");
        if (jSONObject.has(s13)) {
            builder.zze(new zzad(jSONObject.getJSONObject(s13).getBoolean(ProtectedSandApp.s("쳀"))));
        }
        String s14 = ProtectedSandApp.s("쳁");
        if (jSONObject.has(s14)) {
            builder.zzb(new zzu(jSONObject.getJSONObject(s14).getBoolean(ProtectedSandApp.s("쳂"))));
        }
        String s15 = ProtectedSandApp.s("쳃");
        if (jSONObject.has(s15)) {
            builder.zzf(new zzag(jSONObject.getJSONObject(s15).getString(ProtectedSandApp.s("쳄"))));
        }
        String s16 = ProtectedSandApp.s("쳅");
        if (jSONObject.has(s16)) {
            builder.setGoogleThirdPartyPaymentExtension(new GoogleThirdPartyPaymentExtension(jSONObject.getJSONObject(s16).getBoolean(ProtectedSandApp.s("쳆"))));
        }
        String s17 = ProtectedSandApp.s("쳇");
        if (jSONObject.has(s17)) {
            builder.zzh(new zzaw(jSONObject.getString(s17)));
        }
        return builder.build();
    }

    public boolean equals(@q0 Object obj) {
        if (!(obj instanceof AuthenticationExtensions)) {
            return false;
        }
        AuthenticationExtensions authenticationExtensions = (AuthenticationExtensions) obj;
        return Objects.equal(this.zza, authenticationExtensions.zza) && Objects.equal(this.zzb, authenticationExtensions.zzb) && Objects.equal(this.zzc, authenticationExtensions.zzc) && Objects.equal(this.zzd, authenticationExtensions.zzd) && Objects.equal(this.zze, authenticationExtensions.zze) && Objects.equal(this.zzf, authenticationExtensions.zzf) && Objects.equal(this.zzg, authenticationExtensions.zzg) && Objects.equal(this.zzh, authenticationExtensions.zzh) && Objects.equal(this.zzi, authenticationExtensions.zzi) && Objects.equal(this.zzj, authenticationExtensions.zzj) && Objects.equal(this.zzk, authenticationExtensions.zzk) && Objects.equal(this.zzl, authenticationExtensions.zzl);
    }

    @q0
    public FidoAppIdExtension getFidoAppIdExtension() {
        return this.zza;
    }

    @q0
    public UserVerificationMethodExtension getUserVerificationMethodExtension() {
        return this.zzc;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl);
    }

    @o0
    public final String toString() {
        zzaw zzawVar = this.zzk;
        zzak zzakVar = this.zzj;
        GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension = this.zzi;
        zzag zzagVar = this.zzh;
        zzu zzuVar = this.zzg;
        zzad zzadVar = this.zzf;
        zzab zzabVar = this.zze;
        zzz zzzVar = this.zzd;
        UserVerificationMethodExtension userVerificationMethodExtension = this.zzc;
        zzs zzsVar = this.zzb;
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(zzsVar);
        String valueOf3 = String.valueOf(userVerificationMethodExtension);
        String valueOf4 = String.valueOf(zzzVar);
        String valueOf5 = String.valueOf(zzabVar);
        String valueOf6 = String.valueOf(zzadVar);
        String valueOf7 = String.valueOf(zzuVar);
        String valueOf8 = String.valueOf(zzagVar);
        String valueOf9 = String.valueOf(googleThirdPartyPaymentExtension);
        String valueOf10 = String.valueOf(zzakVar);
        String valueOf11 = String.valueOf(zzawVar);
        StringBuilder a5 = b.a(ProtectedSandApp.s("쳈"), valueOf, ProtectedSandApp.s("쳉"), valueOf2, ProtectedSandApp.s("쳊"));
        l0.a(a5, valueOf3, ProtectedSandApp.s("쳋"), valueOf4, ProtectedSandApp.s("쳌"));
        l0.a(a5, valueOf5, ProtectedSandApp.s("쳍"), valueOf6, ProtectedSandApp.s("쳎"));
        l0.a(a5, valueOf7, ProtectedSandApp.s("쳏"), valueOf8, ProtectedSandApp.s("쳐"));
        l0.a(a5, valueOf9, ProtectedSandApp.s("쳑"), valueOf10, ProtectedSandApp.s("쳒"));
        return c.a(a5, valueOf11, ProtectedSandApp.s("쳓"));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getFidoAppIdExtension(), i4, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzb, i4, false);
        SafeParcelWriter.writeParcelable(parcel, 4, getUserVerificationMethodExtension(), i4, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zzd, i4, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zze, i4, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzf, i4, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.zzg, i4, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.zzh, i4, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzi, i4, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.zzj, i4, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.zzk, i4, false);
        SafeParcelWriter.writeParcelable(parcel, 13, this.zzl, i4, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @q0
    public final zzs zzb() {
        return this.zzb;
    }

    @q0
    public final zzu zzc() {
        return this.zzg;
    }

    @q0
    public final zzz zzd() {
        return this.zzd;
    }

    @q0
    public final zzab zze() {
        return this.zze;
    }

    @q0
    public final zzad zzf() {
        return this.zzf;
    }

    @q0
    public final GoogleThirdPartyPaymentExtension zzg() {
        return this.zzi;
    }

    @q0
    public final zzag zzh() {
        return this.zzh;
    }

    @q0
    public final zzai zzi() {
        return this.zzl;
    }

    @q0
    public final zzak zzj() {
        return this.zzj;
    }

    @q0
    public final zzaw zzk() {
        return this.zzk;
    }
}
