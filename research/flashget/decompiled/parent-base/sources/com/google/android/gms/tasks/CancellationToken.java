package com.google.android.gms.tasks;

import androidx.annotation.o0;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes5.dex */
public abstract class CancellationToken {
    public abstract boolean isCancellationRequested();

    @o0
    public abstract CancellationToken onCanceledRequested(@o0 OnTokenCanceledListener onTokenCanceledListener);
}
