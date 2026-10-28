package com.google.android.gms.common.util.concurrent;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.o0;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.common.zzg;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@KeepForSdk
/* loaded from: classes5.dex */
public class HandlerExecutor implements Executor {
    private final Handler zza;

    @KeepForSdk
    public HandlerExecutor(@o0 Looper looper) {
        this.zza = new zzg(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@o0 Runnable runnable) {
        this.zza.post(runnable);
    }
}
