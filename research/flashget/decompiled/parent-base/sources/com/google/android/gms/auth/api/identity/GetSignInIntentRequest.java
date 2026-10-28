package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
@SafeParcelable.Class(creator = "GetSignInIntentRequestCreator")
@Deprecated
/* loaded from: classes5.dex */
public class GetSignInIntentRequest extends AbstractSafeParcelable {

    @o0
    public static final Parcelable.Creator<GetSignInIntentRequest> CREATOR = new zbl();

    @SafeParcelable.Field(getter = "getServerClientId", id = 1)
    private final String zba;

    @q0
    @SafeParcelable.Field(getter = "getHostedDomainFilter", id = 2)
    private final String zbb;

    @q0
    @SafeParcelable.Field(getter = "getSessionId", id = 3)
    private final String zbc;

    @q0
    @SafeParcelable.Field(getter = "getNonce", id = 4)
    private final String zbd;

    @SafeParcelable.Field(getter = "requestVerifiedPhoneNumber", id = 5)
    private final boolean zbe;

    @SafeParcelable.Field(getter = "getTheme", id = 6)
    private final int zbf;

    /* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
    public static final class Builder {
        private String zba;

        @q0
        private String zbb;

        @q0
        private String zbc;

        @q0
        private String zbd;
        private boolean zbe;
        private int zbf;

        @o0
        public GetSignInIntentRequest build() {
            return new GetSignInIntentRequest(this.zba, this.zbb, this.zbc, this.zbd, this.zbe, this.zbf);
        }

        @o0
        public Builder filterByHostedDomain(@q0 String str) {
            this.zbb = str;
            return this;
        }

        @o0
        public Builder setNonce(@q0 String str) {
            this.zbd = str;
            return this;
        }

        @o0
        @Deprecated
        public Builder setRequestVerifiedPhoneNumber(boolean z4) {
            this.zbe = z4;
            return this;
        }

        @o0
        public Builder setServerClientId(@o0 String str) {
            Preconditions.checkNotNull(str);
            this.zba = str;
            return this;
        }

        @o0
        public final Builder zba(@q0 String str) {
            this.zbc = str;
            return this;
        }

        @o0
        public final Builder zbb(int i4) {
            this.zbf = i4;
            return this;
        }
    }

    @SafeParcelable.Constructor
    GetSignInIntentRequest(@SafeParcelable.Param(id = 1) String str, @q0 @SafeParcelable.Param(id = 2) String str2, @q0 @SafeParcelable.Param(id = 3) String str3, @q0 @SafeParcelable.Param(id = 4) String str4, @SafeParcelable.Param(id = 5) boolean z4, @SafeParcelable.Param(id = 6) int i4) {
        Preconditions.checkNotNull(str);
        this.zba = str;
        this.zbb = str2;
        this.zbc = str3;
        this.zbd = str4;
        this.zbe = z4;
        this.zbf = i4;
    }

    @o0
    public static Builder builder() {
        return new Builder();
    }

    @o0
    public static Builder zba(@o0 GetSignInIntentRequest getSignInIntentRequest) {
        Preconditions.checkNotNull(getSignInIntentRequest);
        Builder builder = builder();
        builder.setServerClientId(getSignInIntentRequest.getServerClientId());
        builder.setNonce(getSignInIntentRequest.getNonce());
        builder.filterByHostedDomain(getSignInIntentRequest.getHostedDomainFilter());
        builder.setRequestVerifiedPhoneNumber(getSignInIntentRequest.zbe);
        builder.zbb(getSignInIntentRequest.zbf);
        String str = getSignInIntentRequest.zbc;
        if (str != null) {
            builder.zba(str);
        }
        return builder;
    }

    public boolean equals(@q0 Object obj) {
        if (!(obj instanceof GetSignInIntentRequest)) {
            return false;
        }
        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) obj;
        return Objects.equal(this.zba, getSignInIntentRequest.zba) && Objects.equal(this.zbd, getSignInIntentRequest.zbd) && Objects.equal(this.zbb, getSignInIntentRequest.zbb) && Objects.equal(Boolean.valueOf(this.zbe), Boolean.valueOf(getSignInIntentRequest.zbe)) && this.zbf == getSignInIntentRequest.zbf;
    }

    @q0
    public String getHostedDomainFilter() {
        return this.zbb;
    }

    @q0
    public String getNonce() {
        return this.zbd;
    }

    @o0
    public String getServerClientId() {
        return this.zba;
    }

    public int hashCode() {
        return Objects.hashCode(this.zba, this.zbb, this.zbd, Boolean.valueOf(this.zbe), Integer.valueOf(this.zbf));
    }

    @Deprecated
    public boolean requestVerifiedPhoneNumber() {
        return this.zbe;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getServerClientId(), false);
        SafeParcelWriter.writeString(parcel, 2, getHostedDomainFilter(), false);
        SafeParcelWriter.writeString(parcel, 3, this.zbc, false);
        SafeParcelWriter.writeString(parcel, 4, getNonce(), false);
        SafeParcelWriter.writeBoolean(parcel, 5, requestVerifiedPhoneNumber());
        SafeParcelWriter.writeInt(parcel, 6, this.zbf);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
