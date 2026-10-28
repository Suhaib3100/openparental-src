package com.google.android.gms.common.api.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.util.concurrent.NumberedThreadFactory;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public final class zaco {
    private static final ExecutorService zaa = com.google.android.gms.internal.base.zap.zaa().zaa(new NumberedThreadFactory(ProtectedSandApp.s("\u0b0d")), 1);

    public static ExecutorService zaa() {
        return zaa;
    }
}
