package com.google.android.gms.common.util;

import android.os.StrictMode;
import androidx.annotation.u;
import androidx.annotation.x0;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@x0(31)
/* loaded from: classes5.dex */
final class zzc {
    @u
    static StrictMode.VmPolicy.Builder zza(StrictMode.VmPolicy.Builder builder) {
        StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch;
        permitUnsafeIntentLaunch = builder.permitUnsafeIntentLaunch();
        return permitUnsafeIntentLaunch;
    }
}
