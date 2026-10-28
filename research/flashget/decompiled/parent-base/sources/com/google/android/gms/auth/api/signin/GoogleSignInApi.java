package com.google.android.gms.auth.api.signin;

import android.content.Intent;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
@Deprecated
/* loaded from: classes5.dex */
public interface GoogleSignInApi {

    @o0
    public static final String EXTRA_SIGN_IN_ACCOUNT = ProtectedSandApp.s("쟽");

    @o0
    Intent getSignInIntent(@o0 GoogleApiClient googleApiClient);

    @q0
    GoogleSignInResult getSignInResultFromIntent(@o0 Intent intent);

    @o0
    PendingResult<Status> revokeAccess(@o0 GoogleApiClient googleApiClient);

    @o0
    PendingResult<Status> signOut(@o0 GoogleApiClient googleApiClient);

    @o0
    OptionalPendingResult<GoogleSignInResult> silentSignIn(@o0 GoogleApiClient googleApiClient);
}
