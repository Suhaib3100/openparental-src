package com.google.android.gms.common.moduleinstall;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.o0;
import com.google.android.gms.common.moduleinstall.internal.zay;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes5.dex */
public final class ModuleInstall {
    private ModuleInstall() {
    }

    @o0
    public static ModuleInstallClient getClient(@o0 Activity activity) {
        return new zay(activity);
    }

    @o0
    public static ModuleInstallClient getClient(@o0 Context context) {
        return new zay(context);
    }
}
