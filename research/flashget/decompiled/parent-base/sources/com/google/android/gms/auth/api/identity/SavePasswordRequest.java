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
@SafeParcelable.Class(creator = "SavePasswordRequestCreator")
@Deprecated
/* loaded from: classes5.dex */
public class SavePasswordRequest extends AbstractSafeParcelable {

    @o0
    public static final Parcelable.Creator<SavePasswordRequest> CREATOR = new zbs();

    @SafeParcelable.Field(getter = "getSignInPassword", id = 1)
    private final SignInPassword zba;

    @q0
    @SafeParcelable.Field(getter = "getSessionId", id = 2)
    private final String zbb;

    @SafeParcelable.Field(getter = "getTheme", id = 3)
    private final int zbc;

    /* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
    @Deprecated
    public static final class Builder {
        private SignInPassword zba;

        @q0
        private String zbb;
        private int zbc;

        @o0
        public SavePasswordRequest build() {
            return new SavePasswordRequest(this.zba, this.zbb, this.zbc);
        }

        @o0
        public Builder setSignInPassword(@o0 SignInPassword signInPassword) {
            this.zba = signInPassword;
            return this;
        }

        @o0
        public final Builder zba(@o0 String str) {
            this.zbb = str;
            return this;
        }

        @o0
        public final Builder zbb(int i4) {
            this.zbc = i4;
            return this;
        }
    }

    @SafeParcelable.Constructor
    SavePasswordRequest(@SafeParcelable.Param(id = 1) SignInPassword signInPassword, @q0 @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i4) {
        this.zba = (SignInPassword) Preconditions.checkNotNull(signInPassword);
        this.zbb = str;
        this.zbc = i4;
    }

    @o0
    public static Builder builder() {
        return new Builder();
    }

    @o0
    public static Builder zba(@o0 SavePasswordRequest savePasswordRequest) {
        Preconditions.checkNotNull(savePasswordRequest);
        Builder builder = builder();
        builder.setSignInPassword(savePasswordRequest.getSignInPassword());
        builder.zbb(savePasswordRequest.zbc);
        String str = savePasswordRequest.zbb;
        if (str != null) {
            builder.zba(str);
        }
        return builder;
    }

    public boolean equals(@q0 Object obj) {
        if (!(obj instanceof SavePasswordRequest)) {
            return false;
        }
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) obj;
        return Objects.equal(this.zba, savePasswordRequest.zba) && Objects.equal(this.zbb, savePasswordRequest.zbb) && this.zbc == savePasswordRequest.zbc;
    }

    @o0
    public SignInPassword getSignInPassword() {
        return this.zba;
    }

    public int hashCode() {
        return Objects.hashCode(this.zba, this.zbb);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getSignInPassword(), i4, false);
        SafeParcelWriter.writeString(parcel, 2, this.zbb, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zbc);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
