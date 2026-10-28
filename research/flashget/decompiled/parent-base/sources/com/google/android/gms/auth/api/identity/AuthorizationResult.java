package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
@SafeParcelable.Class(creator = "AuthorizationResultCreator")
/* loaded from: classes5.dex */
public final class AuthorizationResult extends AbstractSafeParcelable {

    @o0
    public static final Parcelable.Creator<AuthorizationResult> CREATOR = new zbf();

    @q0
    @SafeParcelable.Field(getter = "getServerAuthCode", id = 1)
    private final String zba;

    @q0
    @SafeParcelable.Field(getter = "getAccessToken", id = 2)
    private final String zbb;

    @q0
    @SafeParcelable.Field(getter = "getIdToken", id = 3)
    private final String zbc;

    @SafeParcelable.Field(getter = "getGrantedScopes", id = 4)
    private final List zbd;

    @q0
    @SafeParcelable.Field(getter = "toGoogleSignInAccount", id = 5)
    private final GoogleSignInAccount zbe;

    @q0
    @SafeParcelable.Field(getter = "getPendingIntent", id = 6)
    private final PendingIntent zbf;

    @SafeParcelable.Constructor
    public AuthorizationResult(@q0 @SafeParcelable.Param(id = 1) String str, @q0 @SafeParcelable.Param(id = 2) String str2, @q0 @SafeParcelable.Param(id = 3) String str3, @SafeParcelable.Param(id = 4) @o0 List<String> list, @q0 @SafeParcelable.Param(id = 5) GoogleSignInAccount googleSignInAccount, @q0 @SafeParcelable.Param(id = 6) PendingIntent pendingIntent) {
        this.zba = str;
        this.zbb = str2;
        this.zbc = str3;
        this.zbd = (List) Preconditions.checkNotNull(list);
        this.zbf = pendingIntent;
        this.zbe = googleSignInAccount;
    }

    public boolean equals(@q0 Object obj) {
        if (!(obj instanceof AuthorizationResult)) {
            return false;
        }
        AuthorizationResult authorizationResult = (AuthorizationResult) obj;
        return Objects.equal(this.zba, authorizationResult.zba) && Objects.equal(this.zbb, authorizationResult.zbb) && Objects.equal(this.zbc, authorizationResult.zbc) && Objects.equal(this.zbd, authorizationResult.zbd) && Objects.equal(this.zbf, authorizationResult.zbf) && Objects.equal(this.zbe, authorizationResult.zbe);
    }

    @q0
    public String getAccessToken() {
        return this.zbb;
    }

    @o0
    public List<String> getGrantedScopes() {
        return this.zbd;
    }

    @q0
    public PendingIntent getPendingIntent() {
        return this.zbf;
    }

    @q0
    public String getServerAuthCode() {
        return this.zba;
    }

    public boolean hasResolution() {
        return this.zbf != null;
    }

    public int hashCode() {
        return Objects.hashCode(this.zba, this.zbb, this.zbc, this.zbd, this.zbf, this.zbe);
    }

    @q0
    public GoogleSignInAccount toGoogleSignInAccount() {
        return this.zbe;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getServerAuthCode(), false);
        SafeParcelWriter.writeString(parcel, 2, getAccessToken(), false);
        SafeParcelWriter.writeString(parcel, 3, this.zbc, false);
        SafeParcelWriter.writeStringList(parcel, 4, getGrantedScopes(), false);
        SafeParcelWriter.writeParcelable(parcel, 5, toGoogleSignInAccount(), i4, false);
        SafeParcelWriter.writeParcelable(parcel, 6, getPendingIntent(), i4, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
