package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.content.Intent;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes5.dex */
public interface SignInClient extends HasApiKey<zbv> {
    @o0
    @Deprecated
    Task<BeginSignInResult> beginSignIn(@o0 BeginSignInRequest beginSignInRequest);

    @o0
    String getPhoneNumberFromIntent(@q0 Intent intent) throws ApiException;

    @o0
    Task<PendingIntent> getPhoneNumberHintIntent(@o0 GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest);

    @o0
    @Deprecated
    SignInCredential getSignInCredentialFromIntent(@q0 Intent intent) throws ApiException;

    @o0
    @Deprecated
    Task<PendingIntent> getSignInIntent(@o0 GetSignInIntentRequest getSignInIntentRequest);

    @o0
    @Deprecated
    Task<Void> signOut();
}
