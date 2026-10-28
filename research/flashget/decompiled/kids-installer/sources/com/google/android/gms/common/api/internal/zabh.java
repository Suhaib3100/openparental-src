package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes3.dex */
final class zabh extends com.google.android.gms.internal.base.zaq {
    final /* synthetic */ zabi zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zabh(zabi zabiVar, Looper looper) {
        super(looper);
        this.zaa = zabiVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i5 = message.what;
        if (i5 == 1) {
            ((zabg) message.obj).zab(this.zaa);
        } else if (i5 == 2) {
            throw ((RuntimeException) message.obj);
        }
    }
}
