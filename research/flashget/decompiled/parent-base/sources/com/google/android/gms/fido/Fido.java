package com.google.android.gms.fido;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.fido.fido2.Fido2ApiClient;
import com.google.android.gms.fido.fido2.Fido2PrivilegedApiClient;
import com.google.android.gms.fido.u2f.U2fApiClient;
import com.google.android.gms.internal.fido.zzaa;
import com.google.android.gms.internal.fido.zzab;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
public class Fido {

    @o0
    public static final Api.ClientKey zza;

    @o0
    public static final Api zzb;
    public static final zzaa zzc;

    @o0
    public static final String FIDO2_KEY_CREDENTIAL_EXTRA = ProtectedSandApp.s("첋");

    @o0
    @Deprecated
    public static final String FIDO2_KEY_ERROR_EXTRA = ProtectedSandApp.s("첌");

    @o0
    @Deprecated
    public static final String FIDO2_KEY_RESPONSE_EXTRA = ProtectedSandApp.s("첍");

    @o0
    public static final String KEY_RESPONSE_EXTRA = ProtectedSandApp.s("첎");

    @o0
    public static final String FIDO_CREDENTIAL_JSON_EXTRA = ProtectedSandApp.s("첏");

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        zza = clientKey;
        zzb = new Api(ProtectedSandApp.s("첐"), new zzab(), clientKey);
        zzc = new zzaa();
    }

    private Fido() {
    }

    @o0
    public static Fido2ApiClient getFido2ApiClient(@o0 Activity activity) {
        return new Fido2ApiClient(activity);
    }

    @o0
    public static Fido2PrivilegedApiClient getFido2PrivilegedApiClient(@o0 Activity activity) {
        return new Fido2PrivilegedApiClient(activity);
    }

    @o0
    public static U2fApiClient getU2fApiClient(@o0 Activity activity) {
        return new U2fApiClient(activity);
    }

    @o0
    public static Fido2ApiClient getFido2ApiClient(@o0 Context context) {
        return new Fido2ApiClient(context);
    }

    @o0
    public static Fido2PrivilegedApiClient getFido2PrivilegedApiClient(@o0 Context context) {
        return new Fido2PrivilegedApiClient(context);
    }

    @o0
    public static U2fApiClient getU2fApiClient(@o0 Context context) {
        return new U2fApiClient(context);
    }
}
