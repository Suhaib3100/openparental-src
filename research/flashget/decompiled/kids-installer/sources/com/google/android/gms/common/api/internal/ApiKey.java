package com.google.android.gms.common.api.internal;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.internal.Objects;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public final class ApiKey<O extends Api.ApiOptions> {
    private final int zaa;
    private final Api<O> zab;

    @q0
    private final O zac;

    @q0
    private final String zad;

    private ApiKey(Api<O> api, @q0 O o5, @q0 String str) {
        this.zab = api;
        this.zac = o5;
        this.zad = str;
        this.zaa = Objects.hashCode(api, o5, str);
    }

    @o0
    public static <O extends Api.ApiOptions> ApiKey<O> zaa(@o0 Api<O> api, @q0 O o5, @q0 String str) {
        return new ApiKey<>(api, o5, str);
    }

    public final boolean equals(@q0 Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ApiKey)) {
            return false;
        }
        ApiKey apiKey = (ApiKey) obj;
        return Objects.equal(this.zab, apiKey.zab) && Objects.equal(this.zac, apiKey.zac) && Objects.equal(this.zad, apiKey.zad);
    }

    public final int hashCode() {
        return this.zaa;
    }

    @o0
    public final String zab() {
        return this.zab.zad();
    }
}
