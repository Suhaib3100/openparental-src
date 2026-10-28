package com.google.android.libraries.places.internal;

import android.os.Handler;
import android.os.HandlerThread;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzee {
    private final zzea zza;
    private final Map zzb = new HashMap();

    public zzee(zzea zzeaVar) {
        this.zza = zzeaVar;
    }

    public final boolean zza(final TaskCompletionSource taskCompletionSource, long j4, String str) {
        if (this.zzb.containsKey(taskCompletionSource)) {
            return false;
        }
        HandlerThread handlerThread = new HandlerThread(ProtectedSandApp.s("\ue948"));
        handlerThread.start();
        this.zzb.put(taskCompletionSource, handlerThread);
        Handler handler = new Handler(handlerThread.getLooper());
        final String s4 = ProtectedSandApp.s("\ue949");
        return handler.postDelayed(new Runnable(s4) { // from class: com.google.android.libraries.places.internal.zzed
            public final /* synthetic */ String zzb = ProtectedSandApp.s("\ue947");

            @Override // java.lang.Runnable
            public final void run() {
                TaskCompletionSource.this.trySetException(new ApiException(new Status(15, this.zzb)));
            }
        }, j4);
    }

    public final boolean zzb(TaskCompletionSource taskCompletionSource) {
        HandlerThread handlerThread = (HandlerThread) this.zzb.remove(taskCompletionSource);
        if (handlerThread == null) {
            return false;
        }
        return handlerThread.quit();
    }
}
