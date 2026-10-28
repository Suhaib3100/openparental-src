package com.google.android.gms.auth.api.proxy;

import androidx.annotation.o0;
import com.google.android.gms.auth.api.AuthProxyOptions;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes5.dex */
public interface ProxyClient extends HasApiKey<AuthProxyOptions> {
    @o0
    @KeepForSdk
    Task<String> getSpatulaHeader();

    @o0
    @KeepForSdk
    Task<ProxyResponse> performProxyRequest(@o0 ProxyRequest proxyRequest);
}
