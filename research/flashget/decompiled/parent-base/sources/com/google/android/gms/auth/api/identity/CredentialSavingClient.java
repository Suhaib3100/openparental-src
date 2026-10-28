package com.google.android.gms.auth.api.identity;

import android.content.Intent;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes5.dex */
public interface CredentialSavingClient extends HasApiKey<zbi> {
    @o0
    Status getStatusFromIntent(@q0 Intent intent);

    @o0
    Task<SaveAccountLinkingTokenResult> saveAccountLinkingToken(@o0 SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest);

    @o0
    @Deprecated
    Task<SavePasswordResult> savePassword(@o0 SavePasswordRequest savePasswordRequest);
}
