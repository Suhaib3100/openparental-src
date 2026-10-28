package com.google.android.gms.common.api;

import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes3.dex */
public abstract class ResultCallbacks<R extends Result> implements ResultCallback<R> {
    public abstract void onFailure(@o0 Status status);

    @Override // com.google.android.gms.common.api.ResultCallback
    @KeepForSdk
    public final void onResult(@o0 R r5) {
        Status status = r5.getStatus();
        if (status.isSuccess()) {
            onSuccess(r5);
            return;
        }
        onFailure(status);
        if (r5 instanceof Releasable) {
            try {
                ((Releasable) r5).release();
            } catch (RuntimeException unused) {
                ProtectedSandApp.s("↔").concat(String.valueOf(r5));
            }
        }
    }

    public abstract void onSuccess(@o0 R r5);
}
