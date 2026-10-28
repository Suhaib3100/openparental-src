package com.google.android.gms.auth.api.identity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
@SafeParcelable.Class(creator = "SignInCredentialCreator")
@Deprecated
/* loaded from: classes5.dex */
public final class SignInCredential extends AbstractSafeParcelable {

    @o0
    public static final Parcelable.Creator<SignInCredential> CREATOR = new zbu();

    @SafeParcelable.Field(getter = "getId", id = 1)
    private final String zba;

    @q0
    @SafeParcelable.Field(getter = "getDisplayName", id = 2)
    private final String zbb;

    @q0
    @SafeParcelable.Field(getter = "getGivenName", id = 3)
    private final String zbc;

    @q0
    @SafeParcelable.Field(getter = "getFamilyName", id = 4)
    private final String zbd;

    @q0
    @SafeParcelable.Field(getter = "getProfilePictureUri", id = 5)
    private final Uri zbe;

    @q0
    @SafeParcelable.Field(getter = "getPassword", id = 6)
    private final String zbf;

    @q0
    @SafeParcelable.Field(getter = "getGoogleIdToken", id = 7)
    private final String zbg;

    @q0
    @SafeParcelable.Field(getter = "getPhoneNumber", id = 8)
    private final String zbh;

    @q0
    @SafeParcelable.Field(getter = "getPublicKeyCredential", id = 9)
    private final PublicKeyCredential zbi;

    @SafeParcelable.Constructor
    SignInCredential(@SafeParcelable.Param(id = 1) String str, @q0 @SafeParcelable.Param(id = 2) String str2, @q0 @SafeParcelable.Param(id = 3) String str3, @q0 @SafeParcelable.Param(id = 4) String str4, @q0 @SafeParcelable.Param(id = 5) Uri uri, @q0 @SafeParcelable.Param(id = 6) String str5, @q0 @SafeParcelable.Param(id = 7) String str6, @q0 @SafeParcelable.Param(id = 8) String str7, @q0 @SafeParcelable.Param(id = 9) PublicKeyCredential publicKeyCredential) {
        this.zba = (String) Preconditions.checkNotNull(str);
        this.zbb = str2;
        this.zbc = str3;
        this.zbd = str4;
        this.zbe = uri;
        this.zbf = str5;
        this.zbg = str6;
        this.zbh = str7;
        this.zbi = publicKeyCredential;
    }

    public boolean equals(@q0 Object obj) {
        if (!(obj instanceof SignInCredential)) {
            return false;
        }
        SignInCredential signInCredential = (SignInCredential) obj;
        return Objects.equal(this.zba, signInCredential.zba) && Objects.equal(this.zbb, signInCredential.zbb) && Objects.equal(this.zbc, signInCredential.zbc) && Objects.equal(this.zbd, signInCredential.zbd) && Objects.equal(this.zbe, signInCredential.zbe) && Objects.equal(this.zbf, signInCredential.zbf) && Objects.equal(this.zbg, signInCredential.zbg) && Objects.equal(this.zbh, signInCredential.zbh) && Objects.equal(this.zbi, signInCredential.zbi);
    }

    @q0
    public String getDisplayName() {
        return this.zbb;
    }

    @q0
    public String getFamilyName() {
        return this.zbd;
    }

    @q0
    public String getGivenName() {
        return this.zbc;
    }

    @q0
    public String getGoogleIdToken() {
        return this.zbg;
    }

    @o0
    public String getId() {
        return this.zba;
    }

    @q0
    public String getPassword() {
        return this.zbf;
    }

    @q0
    @Deprecated
    public String getPhoneNumber() {
        return this.zbh;
    }

    @q0
    public Uri getProfilePictureUri() {
        return this.zbe;
    }

    @q0
    public PublicKeyCredential getPublicKeyCredential() {
        return this.zbi;
    }

    public int hashCode() {
        return Objects.hashCode(this.zba, this.zbb, this.zbc, this.zbd, this.zbe, this.zbf, this.zbg, this.zbh, this.zbi);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getId(), false);
        SafeParcelWriter.writeString(parcel, 2, getDisplayName(), false);
        SafeParcelWriter.writeString(parcel, 3, getGivenName(), false);
        SafeParcelWriter.writeString(parcel, 4, getFamilyName(), false);
        SafeParcelWriter.writeParcelable(parcel, 5, getProfilePictureUri(), i4, false);
        SafeParcelWriter.writeString(parcel, 6, getPassword(), false);
        SafeParcelWriter.writeString(parcel, 7, getGoogleIdToken(), false);
        SafeParcelWriter.writeString(parcel, 8, getPhoneNumber(), false);
        SafeParcelWriter.writeParcelable(parcel, 9, getPublicKeyCredential(), i4, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
