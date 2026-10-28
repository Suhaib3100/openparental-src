package com.google.android.gms.common.api.internal;

import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes3.dex */
final class zacx implements Continuation<Boolean, Void> {
    zacx() {
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* bridge */ /* synthetic */ Void then(@o0 Task<Boolean> task) throws Exception {
        if (task.getResult().booleanValue()) {
            return null;
        }
        throw new ApiException(new Status(13, ProtectedSandApp.s("∍")));
    }
}
