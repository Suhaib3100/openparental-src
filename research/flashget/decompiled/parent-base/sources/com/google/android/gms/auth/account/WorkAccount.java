package com.google.android.gms.auth.account;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.auth.zzal;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes5.dex */
public class WorkAccount {

    @o0
    public static final Api<Api.ApiOptions.NoOptions> API;

    @o0
    @Deprecated
    public static final WorkAccountApi WorkAccountApi;
    private static final Api.ClientKey zza;
    private static final Api.AbstractClientBuilder zzb;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        zza = clientKey;
        zzf zzfVar = new zzf();
        zzb = zzfVar;
        API = new Api<>(ProtectedSandApp.s("읃"), zzfVar, clientKey);
        WorkAccountApi = new zzal();
    }

    private WorkAccount() {
    }

    @o0
    public static WorkAccountClient getClient(@o0 Activity activity) {
        return new WorkAccountClient(activity);
    }

    @o0
    public static WorkAccountClient getClient(@o0 Context context) {
        return new WorkAccountClient(context);
    }
}
