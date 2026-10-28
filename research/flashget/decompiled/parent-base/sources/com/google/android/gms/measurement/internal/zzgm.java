package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLogging;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import com.google.android.gms.tasks.OnFailureListener;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzgm {
    private static zzgm zza;
    private static final Duration zzb;
    private final zzhy zzc;
    private final TelemetryLoggingClient zzd;
    private final AtomicLong zze = new AtomicLong(-1);

    static {
        Duration ofMinutes;
        ofMinutes = Duration.ofMinutes(30L);
        zzb = ofMinutes;
    }

    private zzgm(Context context, zzhy zzhyVar) {
        this.zzd = TelemetryLogging.getClient(context, TelemetryLoggingOptions.builder().setApi(ProtectedSandApp.s("\ude70")).build());
        this.zzc = zzhyVar;
    }

    static zzgm zza(zzhy zzhyVar) {
        if (zza == null) {
            zza = new zzgm(zzhyVar.zza(), zzhyVar);
        }
        return zza;
    }

    final /* synthetic */ void zza(long j4, Exception exc) {
        this.zze.set(j4);
    }

    public final synchronized void zza(int i4, int i5, long j4, long j5, int i6) {
        long millis;
        final long elapsedRealtime = this.zzc.zzb().elapsedRealtime();
        if (this.zze.get() != -1) {
            long j6 = elapsedRealtime - this.zze.get();
            millis = zzb.toMillis();
            if (j6 <= millis) {
                return;
            }
        }
        this.zzd.log(new TelemetryData(0, Arrays.asList(new MethodInvocation(36301, i5, 0, j4, j5, null, null, 0, i6)))).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.measurement.internal.zzgl
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                zzgm.this.zza(elapsedRealtime, exc);
            }
        });
    }
}
