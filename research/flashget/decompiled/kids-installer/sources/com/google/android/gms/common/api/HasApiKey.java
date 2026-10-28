package com.google.android.gms.common.api;

import androidx.annotation.o0;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.internal.ApiKey;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public interface HasApiKey<O extends Api.ApiOptions> {
    @o0
    @KeepForSdk
    ApiKey<O> getApiKey();
}
