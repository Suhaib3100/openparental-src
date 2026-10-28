package com.google.android.gms.auth.api.signin;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
@Deprecated
/* loaded from: classes5.dex */
public class GoogleSignInResult implements Result {
    private final Status zba;

    @q0
    private final GoogleSignInAccount zbb;

    public GoogleSignInResult(@q0 GoogleSignInAccount googleSignInAccount, @o0 Status status) {
        this.zbb = googleSignInAccount;
        this.zba = status;
    }

    @q0
    public GoogleSignInAccount getSignInAccount() {
        return this.zbb;
    }

    @Override // com.google.android.gms.common.api.Result
    @o0
    public Status getStatus() {
        return this.zba;
    }

    public boolean isSuccess() {
        return this.zba.isSuccess();
    }
}
