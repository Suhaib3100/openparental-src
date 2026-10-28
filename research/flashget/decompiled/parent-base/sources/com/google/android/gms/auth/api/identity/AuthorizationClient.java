package com.google.android.gms.auth.api.identity;

import android.content.Intent;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes5.dex */
public interface AuthorizationClient extends HasApiKey<zbc> {
    @o0
    Task<AuthorizationResult> authorize(@o0 AuthorizationRequest authorizationRequest);

    @o0
    AuthorizationResult getAuthorizationResultFromIntent(@q0 Intent intent) throws ApiException;
}
