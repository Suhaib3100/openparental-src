package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
@SafeParcelable.Class(creator = "AccountChangeEventsRequestCreator")
/* loaded from: classes5.dex */
public class AccountChangeEventsRequest extends AbstractSafeParcelable {

    @o0
    public static final Parcelable.Creator<AccountChangeEventsRequest> CREATOR = new zzb();

    @SafeParcelable.VersionField(id = 1)
    final int zza;

    @SafeParcelable.Field(id = 2)
    int zzb;

    @SafeParcelable.Field(id = 3)
    @Deprecated
    String zzc;

    @SafeParcelable.Field(id = 4)
    Account zzd;

    public AccountChangeEventsRequest() {
        this.zza = 1;
    }

    @o0
    public Account getAccount() {
        return this.zzd;
    }

    @o0
    @Deprecated
    public String getAccountName() {
        return this.zzc;
    }

    public int getEventIndex() {
        return this.zzb;
    }

    @o0
    public AccountChangeEventsRequest setAccount(@o0 Account account) {
        this.zzd = account;
        return this;
    }

    @o0
    @Deprecated
    public AccountChangeEventsRequest setAccountName(@o0 String str) {
        this.zzc = str;
        return this;
    }

    @o0
    public AccountChangeEventsRequest setEventIndex(int i4) {
        this.zzb = i4;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i4, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    AccountChangeEventsRequest(@SafeParcelable.Param(id = 1) int i4, @SafeParcelable.Param(id = 2) int i5, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) Account account) {
        this.zza = i4;
        this.zzb = i5;
        this.zzc = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.zzd = account;
        } else {
            this.zzd = new Account(str, ProtectedSandApp.s("윀"));
        }
    }
}
