package com.google.android.gms.auth.account;

import android.accounts.Account;
import androidx.annotation.o0;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
@Deprecated
/* loaded from: classes5.dex */
public interface WorkAccountApi {

    /* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
    @Deprecated
    public interface AddAccountResult extends Result {
        @o0
        Account getAccount();
    }

    @o0
    @Deprecated
    PendingResult<AddAccountResult> addWorkAccount(@o0 GoogleApiClient googleApiClient, @o0 String str);

    @o0
    @Deprecated
    PendingResult<Result> removeWorkAccount(@o0 GoogleApiClient googleApiClient, @o0 Account account);

    @Deprecated
    void setWorkAuthenticatorEnabled(@o0 GoogleApiClient googleApiClient, boolean z4);

    @o0
    @Deprecated
    PendingResult<Result> setWorkAuthenticatorEnabledWithResult(@o0 GoogleApiClient googleApiClient, boolean z4);
}
