package com.google.android.gms.common.api;

import androidx.annotation.o0;
import com.google.android.gms.common.api.Result;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes5.dex */
public class Response<T extends Result> {
    private Result zza;

    public Response() {
    }

    @o0
    protected T getResult() {
        return (T) this.zza;
    }

    public void setResult(@o0 T t4) {
        this.zza = t4;
    }

    protected Response(@o0 T t4) {
        this.zza = t4;
    }
}
