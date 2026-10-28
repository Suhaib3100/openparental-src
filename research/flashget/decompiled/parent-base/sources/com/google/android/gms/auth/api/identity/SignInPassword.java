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

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
@SafeParcelable.Class(creator = "SignInPasswordCreator")
@Deprecated
/* loaded from: classes5.dex */
public class SignInPassword extends AbstractSafeParcelable {

    @o0
    public static final Parcelable.Creator<SignInPassword> CREATOR = new zbw();

    @SafeParcelable.Field(getter = "getId", id = 1)
    private final String zba;

    @SafeParcelable.Field(getter = "getPassword", id = 2)
    private final String zbb;

    @SafeParcelable.Constructor
    public SignInPassword(@SafeParcelable.Param(id = 1) @o0 String str, @SafeParcelable.Param(id = 2) @o0 String str2) {
        this.zba = Preconditions.checkNotEmpty(((String) Preconditions.checkNotNull(str, ProtectedSandApp.s("쟅"))).trim(), ProtectedSandApp.s("쟆"));
        this.zbb = Preconditions.checkNotEmpty(str2);
    }

    public boolean equals(@q0 Object obj) {
        if (!(obj instanceof SignInPassword)) {
            return false;
        }
        SignInPassword signInPassword = (SignInPassword) obj;
        return Objects.equal(this.zba, signInPassword.zba) && Objects.equal(this.zbb, signInPassword.zbb);
    }

    @o0
    public String getId() {
        return this.zba;
    }

    @o0
    public String getPassword() {
        return this.zbb;
    }

    public int hashCode() {
        return Objects.hashCode(this.zba, this.zbb);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getId(), false);
        SafeParcelWriter.writeString(parcel, 2, getPassword(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
