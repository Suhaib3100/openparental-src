package com.google.android.gms.internal.play_billing;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.Locale;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public final class zzfv extends IOException {
    zzfv() {
        super(ProtectedSandApp.s("힣"));
    }

    zzfv(long j4, long j5, int i4, Throwable th) {
        super(ProtectedSandApp.s("\ud7a5").concat(String.format(Locale.US, ProtectedSandApp.s("\ud7a4"), Long.valueOf(j4), Long.valueOf(j5), Integer.valueOf(i4))), th);
    }

    zzfv(Throwable th) {
        super(ProtectedSandApp.s("힣"), th);
    }
}
