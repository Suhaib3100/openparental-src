package com.google.android.gms.common.api;

import androidx.annotation.o0;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes2.dex */
public abstract class PendingResult<R extends Result> {

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @KeepForSdk
    public interface StatusListener {
        @KeepForSdk
        void onComplete(@o0 Status status);
    }

    @KeepForSdk
    public void addStatusListener(@o0 StatusListener statusListener) {
        throw new UnsupportedOperationException();
    }

    @o0
    public abstract R await();

    @o0
    public abstract R await(long j5, @o0 TimeUnit timeUnit);

    public abstract void cancel();

    public abstract boolean isCanceled();

    public abstract void setResultCallback(@o0 ResultCallback<? super R> resultCallback);

    public abstract void setResultCallback(@o0 ResultCallback<? super R> resultCallback, long j5, @o0 TimeUnit timeUnit);

    @o0
    public <S extends Result> TransformedResult<S> then(@o0 ResultTransform<? super R, ? extends S> resultTransform) {
        throw new UnsupportedOperationException();
    }
}
