package com.google.android.gms.auth.api.phone;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.p001authapiphone.zzab;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@18.0.2 */
/* loaded from: classes5.dex */
public final class SmsRetriever {

    @o0
    public static final String EXTRA_STATUS = ProtectedSandApp.s("쟐");

    @o0
    public static final String EXTRA_SIM_SUBSCRIPTION_ID = ProtectedSandApp.s("쟑");

    @o0
    public static final String SEND_PERMISSION = ProtectedSandApp.s("쟒");

    @o0
    public static final String SMS_RETRIEVED_ACTION = ProtectedSandApp.s("쟓");

    @o0
    public static final String EXTRA_SMS_MESSAGE = ProtectedSandApp.s("쟔");

    @o0
    public static final String EXTRA_CONSENT_INTENT = ProtectedSandApp.s("쟕");

    private SmsRetriever() {
    }

    @o0
    public static SmsRetrieverClient getClient(@o0 Activity activity) {
        return new zzab(activity);
    }

    @o0
    public static SmsRetrieverClient getClient(@o0 Context context) {
        return new zzab(context);
    }
}
