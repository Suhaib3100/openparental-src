package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes5.dex */
final class zacz extends com.google.android.gms.internal.base.zau {
    final /* synthetic */ zada zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zacz(zada zadaVar, Looper looper) {
        super(looper);
        this.zaa = zadaVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj;
        zada zadaVar;
        int i4 = message.what;
        if (i4 != 0) {
            if (i4 != 1) {
                return;
            }
            RuntimeException runtimeException = (RuntimeException) message.obj;
            ProtectedSandApp.s("쩳").concat(String.valueOf(runtimeException.getMessage()));
            throw runtimeException;
        }
        PendingResult pendingResult = (PendingResult) message.obj;
        obj = this.zaa.zae;
        synchronized (obj) {
            try {
                zadaVar = this.zaa.zab;
                zada zadaVar2 = (zada) Preconditions.checkNotNull(zadaVar);
                if (pendingResult == null) {
                    zadaVar2.zaj(new Status(13, ProtectedSandApp.s("쩴")));
                } else if (pendingResult instanceof zacp) {
                    zadaVar2.zaj(((zacp) pendingResult).zaa());
                } else {
                    zadaVar2.zai(pendingResult);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
