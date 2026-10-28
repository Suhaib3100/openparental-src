package com.google.android.gms.common.api;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes5.dex */
public abstract class ResultCallbacks<R extends Result> implements ResultCallback<R> {
    public abstract void onFailure(@o0 Status status);

    @Override // com.google.android.gms.common.api.ResultCallback
    @KeepForSdk
    public final void onResult(@o0 R r4) {
        Status status = r4.getStatus();
        if (status.isSuccess()) {
            onSuccess(r4);
            return;
        }
        onFailure(status);
        if (r4 instanceof Releasable) {
            try {
                ((Releasable) r4).release();
            } catch (RuntimeException unused) {
                ProtectedSandApp.s("짗").concat(String.valueOf(r4));
            }
        }
    }

    public abstract void onSuccess(@o0 R r4);
}
