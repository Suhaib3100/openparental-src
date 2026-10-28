package com.google.android.gms.stats;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;

/* compiled from: com.google.android.gms:play-services-stats@@17.0.1 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes3.dex */
public abstract class GCoreWakefulBroadcastReceiver extends WakefulBroadcastReceiver {
    @KeepForSdk
    public static boolean completeWakefulIntent(@o0 Context context, @q0 Intent intent) {
        if (intent == null) {
            return false;
        }
        return WakefulBroadcastReceiver.completeWakefulIntent(intent);
    }
}
