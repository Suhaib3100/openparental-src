package com.google.android.gms.common.internal;

import android.content.Context;
import androidx.annotation.o0;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@KeepForSdk
/* loaded from: classes5.dex */
public class TelemetryLogging {
    private TelemetryLogging() {
    }

    @o0
    @KeepForSdk
    public static TelemetryLoggingClient getClient(@o0 Context context) {
        return getClient(context, TelemetryLoggingOptions.zaa);
    }

    @o0
    @KeepForSdk
    public static TelemetryLoggingClient getClient(@o0 Context context, @o0 TelemetryLoggingOptions telemetryLoggingOptions) {
        return new com.google.android.gms.common.internal.service.zao(context, telemetryLoggingOptions);
    }
}
