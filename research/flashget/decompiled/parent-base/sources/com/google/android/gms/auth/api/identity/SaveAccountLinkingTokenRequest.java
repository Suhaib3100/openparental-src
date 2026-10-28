package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
@SafeParcelable.Class(creator = "SaveAccountLinkingTokenRequestCreator")
/* loaded from: classes5.dex */
public class SaveAccountLinkingTokenRequest extends AbstractSafeParcelable implements ReflectedParcelable {

    @SafeParcelable.Field(getter = "getConsentPendingIntent", id = 1)
    private final PendingIntent zba;

    @SafeParcelable.Field(getter = "getTokenType", id = 2)
    private final String zbb;

    @SafeParcelable.Field(getter = "getServiceId", id = 3)
    private final String zbc;

    @SafeParcelable.Field(getter = "getScopes", id = 4)
    private final List zbd;

    @q0
    @SafeParcelable.Field(getter = "getSessionId", id = 5)
    private final String zbe;

    @SafeParcelable.Field(getter = "getTheme", id = 6)
    private final int zbf;

    @o0
    public static final String TOKEN_TYPE_AUTH_CODE = ProtectedSandApp.s("쟃");

    @o0
    public static final String EXTRA_TOKEN = ProtectedSandApp.s("쟄");

    @o0
    public static final Parcelable.Creator<SaveAccountLinkingTokenRequest> CREATOR = new zbq();

    /* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
    public static final class Builder {
        private PendingIntent zba;
        private String zbb;
        private String zbc;
        private List zbd = new ArrayList();
        private String zbe;
        private int zbf;

        @o0
        public SaveAccountLinkingTokenRequest build() {
            Preconditions.checkArgument(this.zba != null, ProtectedSandApp.s("잾"));
            Preconditions.checkArgument(ProtectedSandApp.s("잿").equals(this.zbb), ProtectedSandApp.s("쟀"));
            Preconditions.checkArgument(!TextUtils.isEmpty(this.zbc), ProtectedSandApp.s("쟁"));
            Preconditions.checkArgument(this.zbd != null, ProtectedSandApp.s("쟂"));
            return new SaveAccountLinkingTokenRequest(this.zba, this.zbb, this.zbc, this.zbd, this.zbe, this.zbf);
        }

        @o0
        public Builder setConsentPendingIntent(@o0 PendingIntent pendingIntent) {
            this.zba = pendingIntent;
            return this;
        }

        @o0
        public Builder setScopes(@o0 List<String> list) {
            this.zbd = list;
            return this;
        }

        @o0
        public Builder setServiceId(@o0 String str) {
            this.zbc = str;
            return this;
        }

        @o0
        public Builder setTokenType(@o0 String str) {
            this.zbb = str;
            return this;
        }

        @o0
        public final Builder zba(@o0 String str) {
            this.zbe = str;
            return this;
        }

        @o0
        public final Builder zbb(int i4) {
            this.zbf = i4;
            return this;
        }
    }

    @SafeParcelable.Constructor
    SaveAccountLinkingTokenRequest(@SafeParcelable.Param(id = 1) PendingIntent pendingIntent, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) List list, @q0 @SafeParcelable.Param(id = 5) String str3, @SafeParcelable.Param(id = 6) int i4) {
        this.zba = pendingIntent;
        this.zbb = str;
        this.zbc = str2;
        this.zbd = list;
        this.zbe = str3;
        this.zbf = i4;
    }

    @o0
    public static Builder builder() {
        return new Builder();
    }

    @o0
    public static Builder zba(@o0 SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        Preconditions.checkNotNull(saveAccountLinkingTokenRequest);
        Builder builder = builder();
        builder.setScopes(saveAccountLinkingTokenRequest.getScopes());
        builder.setServiceId(saveAccountLinkingTokenRequest.getServiceId());
        builder.setConsentPendingIntent(saveAccountLinkingTokenRequest.getConsentPendingIntent());
        builder.setTokenType(saveAccountLinkingTokenRequest.getTokenType());
        builder.zbb(saveAccountLinkingTokenRequest.zbf);
        String str = saveAccountLinkingTokenRequest.zbe;
        if (!TextUtils.isEmpty(str)) {
            builder.zba(str);
        }
        return builder;
    }

    public boolean equals(@q0 Object obj) {
        if (!(obj instanceof SaveAccountLinkingTokenRequest)) {
            return false;
        }
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) obj;
        return this.zbd.size() == saveAccountLinkingTokenRequest.zbd.size() && this.zbd.containsAll(saveAccountLinkingTokenRequest.zbd) && Objects.equal(this.zba, saveAccountLinkingTokenRequest.zba) && Objects.equal(this.zbb, saveAccountLinkingTokenRequest.zbb) && Objects.equal(this.zbc, saveAccountLinkingTokenRequest.zbc) && Objects.equal(this.zbe, saveAccountLinkingTokenRequest.zbe) && this.zbf == saveAccountLinkingTokenRequest.zbf;
    }

    @o0
    public PendingIntent getConsentPendingIntent() {
        return this.zba;
    }

    @o0
    public List<String> getScopes() {
        return this.zbd;
    }

    @o0
    public String getServiceId() {
        return this.zbc;
    }

    @o0
    public String getTokenType() {
        return this.zbb;
    }

    public int hashCode() {
        return Objects.hashCode(this.zba, this.zbb, this.zbc, this.zbd, this.zbe);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getConsentPendingIntent(), i4, false);
        SafeParcelWriter.writeString(parcel, 2, getTokenType(), false);
        SafeParcelWriter.writeString(parcel, 3, getServiceId(), false);
        SafeParcelWriter.writeStringList(parcel, 4, getScopes(), false);
        SafeParcelWriter.writeString(parcel, 5, this.zbe, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zbf);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
