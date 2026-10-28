package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
@SafeParcelable.Class(creator = "AuthorizationRequestCreator")
/* loaded from: classes5.dex */
public class AuthorizationRequest extends AbstractSafeParcelable implements ReflectedParcelable {

    @o0
    public static final Parcelable.Creator<AuthorizationRequest> CREATOR = new zbe();

    @SafeParcelable.Field(getter = "getRequestedScopes", id = 1)
    private final List zba;

    @q0
    @SafeParcelable.Field(getter = "getServerClientId", id = 2)
    private final String zbb;

    @SafeParcelable.Field(getter = "isOfflineAccessRequested", id = 3)
    private final boolean zbc;

    @SafeParcelable.Field(getter = "isIdTokenRequested", id = 4)
    private final boolean zbd;

    @q0
    @SafeParcelable.Field(getter = "getAccount", id = 5)
    private final Account zbe;

    @q0
    @SafeParcelable.Field(getter = "getHostedDomain", id = 6)
    private final String zbf;

    @q0
    @SafeParcelable.Field(getter = "getSessionId", id = 7)
    private final String zbg;

    @SafeParcelable.Field(getter = "isForceCodeForRefreshToken", id = 8)
    private final boolean zbh;

    @q0
    @SafeParcelable.Field(getter = "getResourceParameters", id = 9)
    private final Bundle zbi;

    /* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
    public static final class Builder {
        private List zba;

        @q0
        private String zbb;
        private boolean zbc;
        private boolean zbd;

        @q0
        private Account zbe;

        @q0
        private String zbf;

        @q0
        private String zbg;
        private boolean zbh;

        @q0
        private Bundle zbi;

        private final String zbd(String str) {
            Preconditions.checkNotNull(str);
            String str2 = this.zbb;
            boolean z4 = true;
            if (str2 != null && !str2.equals(str)) {
                z4 = false;
            }
            Preconditions.checkArgument(z4, ProtectedSandApp.s("잶"));
            return str;
        }

        @o0
        public AuthorizationRequest build() {
            return new AuthorizationRequest(this.zba, this.zbb, this.zbc, this.zbd, this.zbe, this.zbf, this.zbg, this.zbh, this.zbi);
        }

        @o0
        public Builder filterByHostedDomain(@o0 String str) {
            this.zbf = Preconditions.checkNotEmpty(str);
            return this;
        }

        @o0
        public Builder requestOfflineAccess(@o0 String str) {
            requestOfflineAccess(str, false);
            return this;
        }

        @o0
        public Builder setAccount(@o0 Account account) {
            this.zbe = (Account) Preconditions.checkNotNull(account);
            return this;
        }

        @o0
        public Builder setRequestedScopes(@o0 List<Scope> list) {
            boolean z4 = false;
            if (list != null && !list.isEmpty()) {
                z4 = true;
            }
            Preconditions.checkArgument(z4, ProtectedSandApp.s("잷"));
            this.zba = list;
            return this;
        }

        public final Builder zba(@o0 zbd zbdVar, @o0 String str) {
            Preconditions.checkNotNull(zbdVar, ProtectedSandApp.s("잸"));
            Preconditions.checkNotNull(str, ProtectedSandApp.s("잹"));
            if (this.zbi == null) {
                this.zbi = new Bundle();
            }
            this.zbi.putString(zbdVar.zbc, str);
            return this;
        }

        @ShowFirstParty
        @o0
        public final Builder zbb(@o0 String str) {
            zbd(str);
            this.zbb = str;
            this.zbd = true;
            return this;
        }

        @o0
        public final Builder zbc(@o0 String str) {
            this.zbg = str;
            return this;
        }

        @o0
        public Builder requestOfflineAccess(@o0 String str, boolean z4) {
            zbd(str);
            this.zbb = str;
            this.zbc = true;
            this.zbh = z4;
            return this;
        }
    }

    @SafeParcelable.Constructor
    AuthorizationRequest(@SafeParcelable.Param(id = 1) List list, @q0 @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) boolean z4, @SafeParcelable.Param(id = 4) boolean z5, @q0 @SafeParcelable.Param(id = 5) Account account, @q0 @SafeParcelable.Param(id = 6) String str2, @q0 @SafeParcelable.Param(id = 7) String str3, @SafeParcelable.Param(id = 8) boolean z6, @q0 @SafeParcelable.Param(id = 9) Bundle bundle) {
        boolean z7 = false;
        if (list != null && !list.isEmpty()) {
            z7 = true;
        }
        Preconditions.checkArgument(z7, ProtectedSandApp.s("잺"));
        this.zba = list;
        this.zbb = str;
        this.zbc = z4;
        this.zbd = z5;
        this.zbe = account;
        this.zbf = str2;
        this.zbg = str3;
        this.zbh = z6;
        this.zbi = bundle;
    }

    @o0
    public static Builder builder() {
        return new Builder();
    }

    @o0
    public static Builder zba(@o0 AuthorizationRequest authorizationRequest) {
        zbd zbdVar;
        Preconditions.checkNotNull(authorizationRequest);
        Builder builder = builder();
        builder.setRequestedScopes(authorizationRequest.getRequestedScopes());
        Bundle bundle = authorizationRequest.zbi;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                zbd[] values = zbd.values();
                int length = values.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        zbdVar = null;
                        break;
                    }
                    zbdVar = values[i4];
                    if (zbdVar.zbc.equals(str)) {
                        break;
                    }
                    i4++;
                }
                if (string != null && zbdVar != null) {
                    builder.zba(zbdVar, string);
                }
            }
        }
        boolean isForceCodeForRefreshToken = authorizationRequest.isForceCodeForRefreshToken();
        String str2 = authorizationRequest.zbg;
        String hostedDomain = authorizationRequest.getHostedDomain();
        Account account = authorizationRequest.getAccount();
        String serverClientId = authorizationRequest.getServerClientId();
        if (str2 != null) {
            builder.zbc(str2);
        }
        if (hostedDomain != null) {
            builder.filterByHostedDomain(hostedDomain);
        }
        if (account != null) {
            builder.setAccount(account);
        }
        if (authorizationRequest.zbd && serverClientId != null) {
            builder.zbb(serverClientId);
        }
        if (authorizationRequest.isOfflineAccessRequested() && serverClientId != null) {
            builder.requestOfflineAccess(serverClientId, isForceCodeForRefreshToken);
        }
        return builder;
    }

    public boolean equals(@q0 Object obj) {
        if (!(obj instanceof AuthorizationRequest)) {
            return false;
        }
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) obj;
        if (this.zba.size() == authorizationRequest.zba.size() && this.zba.containsAll(authorizationRequest.zba)) {
            Bundle bundle = authorizationRequest.zbi;
            Bundle bundle2 = this.zbi;
            if (bundle2 == null) {
                if (bundle == null) {
                    bundle = null;
                }
                return false;
            }
            if (bundle2 == null || bundle != null) {
                if (bundle2 != null) {
                    if (bundle2.size() != bundle.size()) {
                        return false;
                    }
                    for (String str : this.zbi.keySet()) {
                        if (!Objects.equal(this.zbi.getString(str), bundle.getString(str))) {
                            return false;
                        }
                    }
                }
                if (this.zbc == authorizationRequest.zbc && this.zbh == authorizationRequest.zbh && this.zbd == authorizationRequest.zbd && Objects.equal(this.zbb, authorizationRequest.zbb) && Objects.equal(this.zbe, authorizationRequest.zbe) && Objects.equal(this.zbf, authorizationRequest.zbf) && Objects.equal(this.zbg, authorizationRequest.zbg)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @q0
    public Account getAccount() {
        return this.zbe;
    }

    @q0
    public String getHostedDomain() {
        return this.zbf;
    }

    @o0
    public List<Scope> getRequestedScopes() {
        return this.zba;
    }

    @q0
    public String getServerClientId() {
        return this.zbb;
    }

    public int hashCode() {
        return Objects.hashCode(this.zba, this.zbb, Boolean.valueOf(this.zbc), Boolean.valueOf(this.zbh), Boolean.valueOf(this.zbd), this.zbe, this.zbf, this.zbg, this.zbi);
    }

    public boolean isForceCodeForRefreshToken() {
        return this.zbh;
    }

    public boolean isOfflineAccessRequested() {
        return this.zbc;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, getRequestedScopes(), false);
        SafeParcelWriter.writeString(parcel, 2, getServerClientId(), false);
        SafeParcelWriter.writeBoolean(parcel, 3, isOfflineAccessRequested());
        SafeParcelWriter.writeBoolean(parcel, 4, this.zbd);
        SafeParcelWriter.writeParcelable(parcel, 5, getAccount(), i4, false);
        SafeParcelWriter.writeString(parcel, 6, getHostedDomain(), false);
        SafeParcelWriter.writeString(parcel, 7, this.zbg, false);
        SafeParcelWriter.writeBoolean(parcel, 8, isForceCodeForRefreshToken());
        SafeParcelWriter.writeBundle(parcel, 9, this.zbi, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
