package com.google.android.gms.common.api.internal;

import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public final class zaad {
    private final Map<BasePendingResult<?>, Boolean> zaa = Collections.synchronizedMap(new WeakHashMap());
    private final Map<TaskCompletionSource<?>, Boolean> zab = Collections.synchronizedMap(new WeakHashMap());

    private final void zah(boolean z5, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.zaa) {
            hashMap = new HashMap(this.zaa);
        }
        synchronized (this.zab) {
            hashMap2 = new HashMap(this.zab);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z5 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).forceFailureUnlessReady(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z5 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).trySetException(new ApiException(status));
            }
        }
    }

    final void zac(BasePendingResult<? extends Result> basePendingResult, boolean z5) {
        this.zaa.put(basePendingResult, Boolean.valueOf(z5));
        basePendingResult.addStatusListener(new zaab(this, basePendingResult));
    }

    final <TResult> void zad(TaskCompletionSource<TResult> taskCompletionSource, boolean z5) {
        this.zab.put(taskCompletionSource, Boolean.valueOf(z5));
        taskCompletionSource.getTask().addOnCompleteListener(new zaac(this, taskCompletionSource));
    }

    final void zae(int i5, @q0 String str) {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ଃ"));
        if (i5 == 1) {
            sb.append(ProtectedSandApp.s("\u0b04"));
        } else if (i5 == 3) {
            sb.append(ProtectedSandApp.s("ଅ"));
        }
        if (str != null) {
            sb.append(ProtectedSandApp.s("ଆ"));
            sb.append(str);
        }
        zah(true, new Status(20, sb.toString()));
    }

    public final void zaf() {
        zah(false, GoogleApiManager.zaa);
    }

    final boolean zag() {
        return (this.zaa.isEmpty() && this.zab.isEmpty()) ? false : true;
    }
}
