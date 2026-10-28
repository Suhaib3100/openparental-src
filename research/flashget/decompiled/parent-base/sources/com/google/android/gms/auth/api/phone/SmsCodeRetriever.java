package com.google.android.gms.auth.api.phone;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.p001authapiphone.zzr;
import com.google.android.gms.internal.p001authapiphone.zzv;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@18.0.2 */
/* loaded from: classes5.dex */
public final class SmsCodeRetriever {

    @o0
    public static final String EXTRA_STATUS = ProtectedSandApp.s("쟌");

    @o0
    public static final String EXTRA_SMS_CODE = ProtectedSandApp.s("쟍");

    @o0
    public static final String EXTRA_SMS_CODE_LINE = ProtectedSandApp.s("쟎");

    @o0
    public static final String SMS_CODE_RETRIEVED_ACTION = ProtectedSandApp.s("쟏");

    private SmsCodeRetriever() {
    }

    @o0
    public static SmsCodeAutofillClient getAutofillClient(@o0 Activity activity) {
        return new zzr(activity);
    }

    @o0
    public static SmsCodeBrowserClient getBrowserClient(@o0 Activity activity) {
        return new zzv(activity);
    }

    @o0
    public static SmsCodeAutofillClient getAutofillClient(@o0 Context context) {
        return new zzr(context);
    }

    @o0
    public static SmsCodeBrowserClient getBrowserClient(@o0 Context context) {
        return new zzv(context);
    }
}
