package com.google.android.gms.location;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.api.Api;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes5.dex */
public class ActivityRecognition {

    @o0
    public static final Api<Api.ApiOptions.NoOptions> API;

    @o0
    @Deprecated
    public static final ActivityRecognitionApi ActivityRecognitionApi;

    @o0
    public static final String CLIENT_NAME = ProtectedSandApp.s("\ud98d");
    private static final Api.ClientKey<com.google.android.gms.internal.location.zzaz> zza;
    private static final Api.AbstractClientBuilder<com.google.android.gms.internal.location.zzaz, Api.ApiOptions.NoOptions> zzb;

    static {
        Api.ClientKey<com.google.android.gms.internal.location.zzaz> clientKey = new Api.ClientKey<>();
        zza = clientKey;
        zza zzaVar = new zza();
        zzb = zzaVar;
        API = new Api<>(ProtectedSandApp.s("\ud98e"), zzaVar, clientKey);
        ActivityRecognitionApi = new com.google.android.gms.internal.location.zzg();
    }

    private ActivityRecognition() {
    }

    @o0
    public static ActivityRecognitionClient getClient(@o0 Activity activity) {
        return new ActivityRecognitionClient(activity);
    }

    @o0
    public static ActivityRecognitionClient getClient(@o0 Context context) {
        return new ActivityRecognitionClient(context);
    }
}
