package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.q0;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@SafeParcelable.Class(creator = "ResolveAccountRequestCreator")
/* loaded from: classes3.dex */
public final class zat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zat> CREATOR = new zau();

    @SafeParcelable.VersionField(id = 1)
    final int zaa;

    @SafeParcelable.Field(getter = "getAccount", id = 2)
    private final Account zab;

    @SafeParcelable.Field(getter = "getSessionId", id = 3)
    private final int zac;

    @q0
    @SafeParcelable.Field(getter = "getSignInAccountHint", id = 4)
    private final GoogleSignInAccount zad;

    @SafeParcelable.Constructor
    zat(@SafeParcelable.Param(id = 1) int i5, @SafeParcelable.Param(id = 2) Account account, @SafeParcelable.Param(id = 3) int i6, @q0 @SafeParcelable.Param(id = 4) GoogleSignInAccount googleSignInAccount) {
        this.zaa = i5;
        this.zab = account;
        this.zac = i6;
        this.zad = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zaa);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zab, i5, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zac);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zad, i5, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zat(Account account, int i5, @q0 GoogleSignInAccount googleSignInAccount) {
        this(2, account, i5, googleSignInAccount);
    }
}
