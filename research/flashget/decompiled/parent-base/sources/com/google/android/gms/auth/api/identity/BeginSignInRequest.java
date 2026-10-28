package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
@SafeParcelable.Class(creator = "BeginSignInRequestCreator")
@Deprecated
/* loaded from: classes5.dex */
public final class BeginSignInRequest extends AbstractSafeParcelable {

    @o0
    public static final Parcelable.Creator<BeginSignInRequest> CREATOR = new zbg();

    @SafeParcelable.Field(getter = "getPasswordRequestOptions", id = 1)
    private final PasswordRequestOptions zba;

    @SafeParcelable.Field(getter = "getGoogleIdTokenRequestOptions", id = 2)
    private final GoogleIdTokenRequestOptions zbb;

    @q0
    @SafeParcelable.Field(getter = "getSessionId", id = 3)
    private final String zbc;

    @SafeParcelable.Field(getter = "isAutoSelectEnabled", id = 4)
    private final boolean zbd;

    @SafeParcelable.Field(getter = "getTheme", id = 5)
    private final int zbe;

    @SafeParcelable.Field(getter = "getPasskeysRequestOptions", id = 6)
    private final PasskeysRequestOptions zbf;

    @SafeParcelable.Field(getter = "getPasskeyJsonRequestOptions", id = 7)
    private final PasskeyJsonRequestOptions zbg;

    @SafeParcelable.Field(defaultValue = "false", getter = "getPreferImmediatelyAvailableCredentials", id = 8)
    private final boolean zbh;

    /* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
    @Deprecated
    public static final class Builder {
        private PasswordRequestOptions zba;
        private GoogleIdTokenRequestOptions zbb;
        private PasskeysRequestOptions zbc;
        private PasskeyJsonRequestOptions zbd;

        @q0
        private String zbe;
        private boolean zbf;
        private int zbg;
        private boolean zbh;

        public Builder() {
            PasswordRequestOptions.Builder builder = PasswordRequestOptions.builder();
            builder.setSupported(false);
            this.zba = builder.build();
            GoogleIdTokenRequestOptions.Builder builder2 = GoogleIdTokenRequestOptions.builder();
            builder2.setSupported(false);
            this.zbb = builder2.build();
            PasskeysRequestOptions.Builder builder3 = PasskeysRequestOptions.builder();
            builder3.setSupported(false);
            this.zbc = builder3.build();
            PasskeyJsonRequestOptions.Builder builder4 = PasskeyJsonRequestOptions.builder();
            builder4.setSupported(false);
            this.zbd = builder4.build();
        }

        @o0
        public BeginSignInRequest build() {
            return new BeginSignInRequest(this.zba, this.zbb, this.zbe, this.zbf, this.zbg, this.zbc, this.zbd, this.zbh);
        }

        @o0
        public Builder setAutoSelectEnabled(boolean z4) {
            this.zbf = z4;
            return this;
        }

        @o0
        public Builder setGoogleIdTokenRequestOptions(@o0 GoogleIdTokenRequestOptions googleIdTokenRequestOptions) {
            this.zbb = (GoogleIdTokenRequestOptions) Preconditions.checkNotNull(googleIdTokenRequestOptions);
            return this;
        }

        @o0
        public Builder setPasskeyJsonSignInRequestOptions(@o0 PasskeyJsonRequestOptions passkeyJsonRequestOptions) {
            this.zbd = (PasskeyJsonRequestOptions) Preconditions.checkNotNull(passkeyJsonRequestOptions);
            return this;
        }

        @o0
        @Deprecated
        public Builder setPasskeysSignInRequestOptions(@o0 PasskeysRequestOptions passkeysRequestOptions) {
            this.zbc = (PasskeysRequestOptions) Preconditions.checkNotNull(passkeysRequestOptions);
            return this;
        }

        @o0
        public Builder setPasswordRequestOptions(@o0 PasswordRequestOptions passwordRequestOptions) {
            this.zba = (PasswordRequestOptions) Preconditions.checkNotNull(passwordRequestOptions);
            return this;
        }

        @o0
        public Builder setPreferImmediatelyAvailableCredentials(boolean z4) {
            this.zbh = z4;
            return this;
        }

        @o0
        public final Builder zba(@o0 String str) {
            this.zbe = str;
            return this;
        }

        @o0
        public final Builder zbb(int i4) {
            this.zbg = i4;
            return this;
        }
    }

    /* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
    @SafeParcelable.Class(creator = "GoogleIdTokenRequestOptionsCreator")
    @Deprecated
    public static final class GoogleIdTokenRequestOptions extends AbstractSafeParcelable {

        @o0
        public static final Parcelable.Creator<GoogleIdTokenRequestOptions> CREATOR = new zbm();

        @SafeParcelable.Field(getter = "isSupported", id = 1)
        private final boolean zba;

        @q0
        @SafeParcelable.Field(getter = "getServerClientId", id = 2)
        private final String zbb;

        @q0
        @SafeParcelable.Field(getter = "getNonce", id = 3)
        private final String zbc;

        @SafeParcelable.Field(getter = "filterByAuthorizedAccounts", id = 4)
        private final boolean zbd;

        @q0
        @SafeParcelable.Field(getter = "getLinkedServiceId", id = 5)
        private final String zbe;

        @q0
        @SafeParcelable.Field(getter = "getIdTokenDepositionScopes", id = 6)
        private final List zbf;

        @SafeParcelable.Field(getter = "requestVerifiedPhoneNumber", id = 7)
        private final boolean zbg;

        /* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
        public static final class Builder {
            private boolean zba = false;

            @q0
            private String zbb = null;

            @q0
            private String zbc = null;
            private boolean zbd = true;

            @q0
            private String zbe = null;

            @q0
            private List zbf = null;
            private boolean zbg = false;

            @o0
            public Builder associateLinkedAccounts(@o0 String str, @q0 List<String> list) {
                this.zbe = (String) Preconditions.checkNotNull(str, ProtectedSandApp.s("잻"));
                this.zbf = list;
                return this;
            }

            @o0
            public GoogleIdTokenRequestOptions build() {
                return new GoogleIdTokenRequestOptions(this.zba, this.zbb, this.zbc, this.zbd, this.zbe, this.zbf, this.zbg);
            }

            @o0
            public Builder setFilterByAuthorizedAccounts(boolean z4) {
                this.zbd = z4;
                return this;
            }

            @o0
            public Builder setNonce(@q0 String str) {
                this.zbc = str;
                return this;
            }

            @o0
            @Deprecated
            public Builder setRequestVerifiedPhoneNumber(boolean z4) {
                this.zbg = z4;
                return this;
            }

            @o0
            public Builder setServerClientId(@o0 String str) {
                this.zbb = Preconditions.checkNotEmpty(str);
                return this;
            }

            @o0
            public Builder setSupported(boolean z4) {
                this.zba = z4;
                return this;
            }
        }

        @SafeParcelable.Constructor
        GoogleIdTokenRequestOptions(@SafeParcelable.Param(id = 1) boolean z4, @q0 @SafeParcelable.Param(id = 2) String str, @q0 @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) boolean z5, @q0 @SafeParcelable.Param(id = 5) String str3, @q0 @SafeParcelable.Param(id = 6) List list, @SafeParcelable.Param(id = 7) boolean z6) {
            boolean z7 = true;
            if (z5 && z6) {
                z7 = false;
            }
            Preconditions.checkArgument(z7, ProtectedSandApp.s("잼"));
            this.zba = z4;
            if (z4) {
                Preconditions.checkNotNull(str, ProtectedSandApp.s("잽"));
            }
            this.zbb = str;
            this.zbc = str2;
            this.zbd = z5;
            Parcelable.Creator<BeginSignInRequest> creator = BeginSignInRequest.CREATOR;
            ArrayList arrayList = null;
            if (list != null && !list.isEmpty()) {
                arrayList = new ArrayList(list);
                Collections.sort(arrayList);
            }
            this.zbf = arrayList;
            this.zbe = str3;
            this.zbg = z6;
        }

        @o0
        public static Builder builder() {
            return new Builder();
        }

        public boolean equals(@q0 Object obj) {
            if (!(obj instanceof GoogleIdTokenRequestOptions)) {
                return false;
            }
            GoogleIdTokenRequestOptions googleIdTokenRequestOptions = (GoogleIdTokenRequestOptions) obj;
            return this.zba == googleIdTokenRequestOptions.zba && Objects.equal(this.zbb, googleIdTokenRequestOptions.zbb) && Objects.equal(this.zbc, googleIdTokenRequestOptions.zbc) && this.zbd == googleIdTokenRequestOptions.zbd && Objects.equal(this.zbe, googleIdTokenRequestOptions.zbe) && Objects.equal(this.zbf, googleIdTokenRequestOptions.zbf) && this.zbg == googleIdTokenRequestOptions.zbg;
        }

        public boolean filterByAuthorizedAccounts() {
            return this.zbd;
        }

        @q0
        public List<String> getIdTokenDepositionScopes() {
            return this.zbf;
        }

        @q0
        public String getLinkedServiceId() {
            return this.zbe;
        }

        @q0
        public String getNonce() {
            return this.zbc;
        }

        @q0
        public String getServerClientId() {
            return this.zbb;
        }

        public int hashCode() {
            return Objects.hashCode(Boolean.valueOf(this.zba), this.zbb, this.zbc, Boolean.valueOf(this.zbd), this.zbe, this.zbf, Boolean.valueOf(this.zbg));
        }

        public boolean isSupported() {
            return this.zba;
        }

        @Deprecated
        public boolean requestVerifiedPhoneNumber() {
            return this.zbg;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@o0 Parcel parcel, int i4) {
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeBoolean(parcel, 1, isSupported());
            SafeParcelWriter.writeString(parcel, 2, getServerClientId(), false);
            SafeParcelWriter.writeString(parcel, 3, getNonce(), false);
            SafeParcelWriter.writeBoolean(parcel, 4, filterByAuthorizedAccounts());
            SafeParcelWriter.writeString(parcel, 5, getLinkedServiceId(), false);
            SafeParcelWriter.writeStringList(parcel, 6, getIdTokenDepositionScopes(), false);
            SafeParcelWriter.writeBoolean(parcel, 7, requestVerifiedPhoneNumber());
            SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }
    }

    /* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
    @SafeParcelable.Class(creator = "PasskeyJsonRequestOptionsCreator")
    @Deprecated
    public static final class PasskeyJsonRequestOptions extends AbstractSafeParcelable {

        @o0
        public static final Parcelable.Creator<PasskeyJsonRequestOptions> CREATOR = new zbn();

        @SafeParcelable.Field(getter = "isSupported", id = 1)
        private final boolean zba;

        @SafeParcelable.Field(getter = "getRequestJson", id = 2)
        private final String zbb;

        /* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
        public static final class Builder {
            private boolean zba = false;
            private String zbb;

            @o0
            public PasskeyJsonRequestOptions build() {
                return new PasskeyJsonRequestOptions(this.zba, this.zbb);
            }

            @o0
            public Builder setRequestJson(@o0 String str) {
                this.zbb = str;
                return this;
            }

            @o0
            public Builder setSupported(boolean z4) {
                this.zba = z4;
                return this;
            }
        }

        @SafeParcelable.Constructor
        PasskeyJsonRequestOptions(@SafeParcelable.Param(id = 1) boolean z4, @SafeParcelable.Param(id = 2) String str) {
            if (z4) {
                Preconditions.checkNotNull(str);
            }
            this.zba = z4;
            this.zbb = str;
        }

        @o0
        public static Builder builder() {
            return new Builder();
        }

        public boolean equals(@q0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeyJsonRequestOptions)) {
                return false;
            }
            PasskeyJsonRequestOptions passkeyJsonRequestOptions = (PasskeyJsonRequestOptions) obj;
            return this.zba == passkeyJsonRequestOptions.zba && Objects.equal(this.zbb, passkeyJsonRequestOptions.zbb);
        }

        @o0
        public String getRequestJson() {
            return this.zbb;
        }

        public int hashCode() {
            return Objects.hashCode(Boolean.valueOf(this.zba), this.zbb);
        }

        public boolean isSupported() {
            return this.zba;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@o0 Parcel parcel, int i4) {
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeBoolean(parcel, 1, isSupported());
            SafeParcelWriter.writeString(parcel, 2, getRequestJson(), false);
            SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }
    }

    /* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
    @SafeParcelable.Class(creator = "PasskeysRequestOptionsCreator")
    @Deprecated
    public static final class PasskeysRequestOptions extends AbstractSafeParcelable {

        @o0
        public static final Parcelable.Creator<PasskeysRequestOptions> CREATOR = new zbo();

        @SafeParcelable.Field(getter = "isSupported", id = 1)
        private final boolean zba;

        @SafeParcelable.Field(getter = "getChallenge", id = 2)
        private final byte[] zbb;

        @SafeParcelable.Field(getter = "getRpId", id = 3)
        private final String zbc;

        /* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
        public static final class Builder {
            private boolean zba = false;
            private byte[] zbb;
            private String zbc;

            @o0
            public PasskeysRequestOptions build() {
                return new PasskeysRequestOptions(this.zba, this.zbb, this.zbc);
            }

            @o0
            public Builder setChallenge(@o0 byte[] bArr) {
                this.zbb = bArr;
                return this;
            }

            @o0
            public Builder setRpId(@o0 String str) {
                this.zbc = str;
                return this;
            }

            @o0
            public Builder setSupported(boolean z4) {
                this.zba = z4;
                return this;
            }
        }

        @SafeParcelable.Constructor
        PasskeysRequestOptions(@SafeParcelable.Param(id = 1) boolean z4, @SafeParcelable.Param(id = 2) byte[] bArr, @SafeParcelable.Param(id = 3) String str) {
            if (z4) {
                Preconditions.checkNotNull(bArr);
                Preconditions.checkNotNull(str);
            }
            this.zba = z4;
            this.zbb = bArr;
            this.zbc = str;
        }

        @o0
        public static Builder builder() {
            return new Builder();
        }

        public boolean equals(@q0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeysRequestOptions)) {
                return false;
            }
            PasskeysRequestOptions passkeysRequestOptions = (PasskeysRequestOptions) obj;
            return this.zba == passkeysRequestOptions.zba && Arrays.equals(this.zbb, passkeysRequestOptions.zbb) && java.util.Objects.equals(this.zbc, passkeysRequestOptions.zbc);
        }

        @o0
        public byte[] getChallenge() {
            return this.zbb;
        }

        @o0
        public String getRpId() {
            return this.zbc;
        }

        public int hashCode() {
            return Arrays.hashCode(this.zbb) + (java.util.Objects.hash(Boolean.valueOf(this.zba), this.zbc) * 31);
        }

        public boolean isSupported() {
            return this.zba;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@o0 Parcel parcel, int i4) {
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeBoolean(parcel, 1, isSupported());
            SafeParcelWriter.writeByteArray(parcel, 2, getChallenge(), false);
            SafeParcelWriter.writeString(parcel, 3, getRpId(), false);
            SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }
    }

    /* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
    @SafeParcelable.Class(creator = "PasswordRequestOptionsCreator")
    @Deprecated
    public static final class PasswordRequestOptions extends AbstractSafeParcelable {

        @o0
        public static final Parcelable.Creator<PasswordRequestOptions> CREATOR = new zbp();

        @SafeParcelable.Field(getter = "isSupported", id = 1)
        private final boolean zba;

        /* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
        public static final class Builder {
            private boolean zba = false;

            @o0
            public PasswordRequestOptions build() {
                return new PasswordRequestOptions(this.zba);
            }

            @o0
            public Builder setSupported(boolean z4) {
                this.zba = z4;
                return this;
            }
        }

        @SafeParcelable.Constructor
        PasswordRequestOptions(@SafeParcelable.Param(id = 1) boolean z4) {
            this.zba = z4;
        }

        @o0
        public static Builder builder() {
            return new Builder();
        }

        public boolean equals(@q0 Object obj) {
            return (obj instanceof PasswordRequestOptions) && this.zba == ((PasswordRequestOptions) obj).zba;
        }

        public int hashCode() {
            return Objects.hashCode(Boolean.valueOf(this.zba));
        }

        public boolean isSupported() {
            return this.zba;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@o0 Parcel parcel, int i4) {
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeBoolean(parcel, 1, isSupported());
            SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }
    }

    @SafeParcelable.Constructor
    BeginSignInRequest(@SafeParcelable.Param(id = 1) PasswordRequestOptions passwordRequestOptions, @SafeParcelable.Param(id = 2) GoogleIdTokenRequestOptions googleIdTokenRequestOptions, @q0 @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) boolean z4, @SafeParcelable.Param(id = 5) int i4, @q0 @SafeParcelable.Param(id = 6) PasskeysRequestOptions passkeysRequestOptions, @q0 @SafeParcelable.Param(id = 7) PasskeyJsonRequestOptions passkeyJsonRequestOptions, @SafeParcelable.Param(id = 8) boolean z5) {
        this.zba = (PasswordRequestOptions) Preconditions.checkNotNull(passwordRequestOptions);
        this.zbb = (GoogleIdTokenRequestOptions) Preconditions.checkNotNull(googleIdTokenRequestOptions);
        this.zbc = str;
        this.zbd = z4;
        this.zbe = i4;
        if (passkeysRequestOptions == null) {
            PasskeysRequestOptions.Builder builder = PasskeysRequestOptions.builder();
            builder.setSupported(false);
            passkeysRequestOptions = builder.build();
        }
        this.zbf = passkeysRequestOptions;
        if (passkeyJsonRequestOptions == null) {
            PasskeyJsonRequestOptions.Builder builder2 = PasskeyJsonRequestOptions.builder();
            builder2.setSupported(false);
            passkeyJsonRequestOptions = builder2.build();
        }
        this.zbg = passkeyJsonRequestOptions;
        this.zbh = z5;
    }

    @o0
    public static Builder builder() {
        return new Builder();
    }

    @o0
    public static Builder zba(@o0 BeginSignInRequest beginSignInRequest) {
        Preconditions.checkNotNull(beginSignInRequest);
        Builder builder = builder();
        builder.setGoogleIdTokenRequestOptions(beginSignInRequest.getGoogleIdTokenRequestOptions());
        builder.setPasswordRequestOptions(beginSignInRequest.getPasswordRequestOptions());
        builder.setPasskeysSignInRequestOptions(beginSignInRequest.getPasskeysRequestOptions());
        builder.setPasskeyJsonSignInRequestOptions(beginSignInRequest.getPasskeyJsonRequestOptions());
        builder.setAutoSelectEnabled(beginSignInRequest.zbd);
        builder.zbb(beginSignInRequest.zbe);
        builder.setPreferImmediatelyAvailableCredentials(beginSignInRequest.zbh);
        String str = beginSignInRequest.zbc;
        if (str != null) {
            builder.zba(str);
        }
        return builder;
    }

    public boolean equals(@q0 Object obj) {
        if (!(obj instanceof BeginSignInRequest)) {
            return false;
        }
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) obj;
        return Objects.equal(this.zba, beginSignInRequest.zba) && Objects.equal(this.zbb, beginSignInRequest.zbb) && Objects.equal(this.zbf, beginSignInRequest.zbf) && Objects.equal(this.zbg, beginSignInRequest.zbg) && Objects.equal(this.zbc, beginSignInRequest.zbc) && this.zbd == beginSignInRequest.zbd && this.zbe == beginSignInRequest.zbe && this.zbh == beginSignInRequest.zbh;
    }

    @o0
    public GoogleIdTokenRequestOptions getGoogleIdTokenRequestOptions() {
        return this.zbb;
    }

    @o0
    public PasskeyJsonRequestOptions getPasskeyJsonRequestOptions() {
        return this.zbg;
    }

    @o0
    public PasskeysRequestOptions getPasskeysRequestOptions() {
        return this.zbf;
    }

    @o0
    public PasswordRequestOptions getPasswordRequestOptions() {
        return this.zba;
    }

    public boolean getPreferImmediatelyAvailableCredentials() {
        return this.zbh;
    }

    public int hashCode() {
        return Objects.hashCode(this.zba, this.zbb, this.zbf, this.zbg, this.zbc, Boolean.valueOf(this.zbd), Integer.valueOf(this.zbe), Boolean.valueOf(this.zbh));
    }

    public boolean isAutoSelectEnabled() {
        return this.zbd;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getPasswordRequestOptions(), i4, false);
        SafeParcelWriter.writeParcelable(parcel, 2, getGoogleIdTokenRequestOptions(), i4, false);
        SafeParcelWriter.writeString(parcel, 3, this.zbc, false);
        SafeParcelWriter.writeBoolean(parcel, 4, isAutoSelectEnabled());
        SafeParcelWriter.writeInt(parcel, 5, this.zbe);
        SafeParcelWriter.writeParcelable(parcel, 6, getPasskeysRequestOptions(), i4, false);
        SafeParcelWriter.writeParcelable(parcel, 7, getPasskeyJsonRequestOptions(), i4, false);
        SafeParcelWriter.writeBoolean(parcel, 8, getPreferImmediatelyAvailableCredentials());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
