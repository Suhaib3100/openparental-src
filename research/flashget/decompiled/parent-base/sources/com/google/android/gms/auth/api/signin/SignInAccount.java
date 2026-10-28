package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
@SafeParcelable.Class(creator = "SignInAccountCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {

    @o0
    public static final Parcelable.Creator<SignInAccount> CREATOR = new zbc();

    @SafeParcelable.Field(defaultValue = "", id = 4)
    @Deprecated
    final String zba;

    @SafeParcelable.Field(defaultValue = "", id = 8)
    @Deprecated
    final String zbb;

    @SafeParcelable.Field(getter = "getGoogleSignInAccount", id = 7)
    private final GoogleSignInAccount zbc;

    @SafeParcelable.Constructor
    SignInAccount(@SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 7) GoogleSignInAccount googleSignInAccount, @SafeParcelable.Param(id = 8) String str2) {
        this.zbc = googleSignInAccount;
        this.zba = Preconditions.checkNotEmpty(str, ProtectedSandApp.s("젗"));
        this.zbb = Preconditions.checkNotEmpty(str2, ProtectedSandApp.s("젘"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@o0 Parcel parcel, int i4) {
        String str = this.zba;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 4, str, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zbc, i4, false);
        SafeParcelWriter.writeString(parcel, 8, this.zbb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @q0
    public final GoogleSignInAccount zba() {
        return this.zbc;
    }
}
