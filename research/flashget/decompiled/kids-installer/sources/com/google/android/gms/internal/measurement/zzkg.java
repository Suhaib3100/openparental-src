package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzkg extends IOException {
    zzkg() {
        super(ProtectedSandApp.s("\u0dce"));
    }

    zzkg(String str, Throwable th) {
        super(ProtectedSandApp.s("ා").concat(String.valueOf(str)), th);
    }

    zzkg(Throwable th) {
        super(ProtectedSandApp.s("ැ"), th);
    }
}
