package com.google.android.gms.auth.api.signin;

import androidx.annotation.q0;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.PendingResultUtil;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes5.dex */
final class zbb implements PendingResultUtil.ResultConverter {
    private zbb() {
        throw null;
    }

    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    @q0
    public final /* synthetic */ Object convert(Result result) {
        return ((GoogleSignInResult) result).getSignInAccount();
    }

    /* synthetic */ zbb(zba zbaVar) {
    }
}
