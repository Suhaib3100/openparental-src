package com.google.android.gms.common.api.internal;

import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes5.dex */
public final class zaad {
    private final Map zaa = Collections.synchronizedMap(new WeakHashMap());
    private final Map zab = Collections.synchronizedMap(new WeakHashMap());

    private final void zah(boolean z4, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.zaa) {
            hashMap = new HashMap(this.zaa);
        }
        synchronized (this.zab) {
            hashMap2 = new HashMap(this.zab);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z4 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).forceFailureUnlessReady(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z4 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).trySetException(new ApiException(status));
            }
        }
    }

    final void zac(BasePendingResult basePendingResult, boolean z4) {
        this.zaa.put(basePendingResult, Boolean.valueOf(z4));
        basePendingResult.addStatusListener(new zaab(this, basePendingResult));
    }

    final void zad(TaskCompletionSource taskCompletionSource, boolean z4) {
        this.zab.put(taskCompletionSource, Boolean.valueOf(z4));
        taskCompletionSource.getTask().addOnCompleteListener(new zaac(this, taskCompletionSource));
    }

    final void zae(int i4, @q0 String str) {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("쨙"));
        if (i4 == 1) {
            sb.append(ProtectedSandApp.s("쨚"));
        } else if (i4 == 3) {
            sb.append(ProtectedSandApp.s("쨛"));
        }
        if (str != null) {
            sb.append(ProtectedSandApp.s("쨜"));
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
