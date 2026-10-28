package com.google.android.gms.auth.api.proxy;

import androidx.annotation.o0;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.ShowFirstParty;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes5.dex */
public interface ProxyApi {

    /* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
    @ShowFirstParty
    @KeepForSdk
    public interface ProxyResult extends Result {
        @o0
        @KeepForSdk
        ProxyResponse getResponse();
    }

    /* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
    @ShowFirstParty
    @KeepForSdk
    public interface SpatulaHeaderResult extends Result {
        @ShowFirstParty
        @o0
        @KeepForSdk
        String getSpatulaHeader();
    }

    @Deprecated
    @ShowFirstParty
    @o0
    @KeepForSdk
    PendingResult<SpatulaHeaderResult> getSpatulaHeader(@o0 GoogleApiClient googleApiClient);

    @o0
    @KeepForSdk
    @Deprecated
    PendingResult<ProxyResult> performProxyRequest(@o0 GoogleApiClient googleApiClient, @o0 ProxyRequest proxyRequest);
}
