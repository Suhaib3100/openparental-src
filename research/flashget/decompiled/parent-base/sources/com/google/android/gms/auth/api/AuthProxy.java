package com.google.android.gms.auth.api;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.auth.api.proxy.ProxyClient;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.auth.zzbo;
import com.google.android.gms.internal.auth.zzbt;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes5.dex */
public final class AuthProxy {

    @ShowFirstParty
    @o0
    @KeepForSdk
    public static final Api<AuthProxyOptions> API;

    @ShowFirstParty
    @o0
    @KeepForSdk
    public static final ProxyApi ProxyApi;

    @o0
    public static final Api.ClientKey zza;
    private static final Api.AbstractClientBuilder zzb;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        zza = clientKey;
        zza zzaVar = new zza();
        zzb = zzaVar;
        API = new Api<>(ProtectedSandApp.s("응"), zzaVar, clientKey);
        ProxyApi = new zzbt();
    }

    @o0
    @KeepForSdk
    public static ProxyClient getClient(@o0 Activity activity, @q0 AuthProxyOptions authProxyOptions) {
        return new zzbo(activity, authProxyOptions);
    }

    @o0
    @KeepForSdk
    public static ProxyClient getClient(@o0 Context context, @q0 AuthProxyOptions authProxyOptions) {
        return new zzbo(context, authProxyOptions);
    }
}
