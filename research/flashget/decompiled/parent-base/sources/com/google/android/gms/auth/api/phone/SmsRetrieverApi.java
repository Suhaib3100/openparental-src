package com.google.android.gms.auth.api.phone;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@18.0.2 */
/* loaded from: classes5.dex */
public interface SmsRetrieverApi {
    @o0
    Task<Void> startSmsRetriever();

    @o0
    Task<Void> startSmsUserConsent(@q0 String str);
}
