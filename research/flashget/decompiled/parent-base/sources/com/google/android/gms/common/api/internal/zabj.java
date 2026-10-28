package com.google.android.gms.common.api.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.util.concurrent.NumberedThreadFactory;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes5.dex */
public final class zabj {
    private static final ExecutorService zaa = com.google.android.gms.internal.base.zat.zaa().zac(2, new NumberedThreadFactory(ProtectedSandApp.s("쩔")), 2);

    public static ExecutorService zaa() {
        return zaa;
    }
}
