package com.google.android.gms.auth.api;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.ShowFirstParty;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes5.dex */
public final class Auth {

    @o0
    public static final Api<GoogleSignInOptions> GOOGLE_SIGN_IN_API;

    @o0
    public static final GoogleSignInApi GoogleSignInApi;

    @Deprecated
    @ShowFirstParty
    @o0
    @KeepForSdk
    public static final Api<AuthProxyOptions> PROXY_API;

    @Deprecated
    @ShowFirstParty
    @o0
    @KeepForSdk
    public static final ProxyApi ProxyApi;

    @o0
    public static final Api.ClientKey zba;

    @o0
    public static final Api.ClientKey zbb;

    @o0
    public static final Api zbc;
    public static final com.google.android.gms.internal.p000authapi.zbd zbd;
    private static final Api.AbstractClientBuilder zbe;
    private static final Api.AbstractClientBuilder zbf;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        zba = clientKey;
        Api.ClientKey clientKey2 = new Api.ClientKey();
        zbb = clientKey2;
        zba zbaVar = new zba();
        zbe = zbaVar;
        zbb zbbVar = new zbb();
        zbf = zbbVar;
        PROXY_API = AuthProxy.API;
        zbc = new Api(ProtectedSandApp.s("읏"), zbaVar, clientKey);
        GOOGLE_SIGN_IN_API = new Api<>(ProtectedSandApp.s("읐"), zbbVar, clientKey2);
        ProxyApi = AuthProxy.ProxyApi;
        zbd = new com.google.android.gms.internal.p000authapi.zbd();
        GoogleSignInApi = new com.google.android.gms.auth.api.signin.internal.zbd();
    }

    private Auth() {
    }
}
