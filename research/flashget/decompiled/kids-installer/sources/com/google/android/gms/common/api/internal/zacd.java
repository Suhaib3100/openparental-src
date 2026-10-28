package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import androidx.annotation.n1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes3.dex */
final class zacd<T> implements OnCompleteListener<T> {
    private final GoogleApiManager zaa;
    private final int zab;
    private final ApiKey<?> zac;
    private final long zad;
    private final long zae;

    @VisibleForTesting
    zacd(GoogleApiManager googleApiManager, int i5, ApiKey<?> apiKey, long j5, long j6, @q0 String str, @q0 String str2) {
        this.zaa = googleApiManager;
        this.zab = i5;
        this.zac = apiKey;
        this.zad = j5;
        this.zae = j6;
    }

    @q0
    static <T> zacd<T> zaa(GoogleApiManager googleApiManager, int i5, ApiKey<?> apiKey) {
        boolean z5;
        if (!googleApiManager.zaF()) {
            return null;
        }
        RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
        if (config == null) {
            z5 = true;
        } else {
            if (!config.getMethodInvocationTelemetryEnabled()) {
                return null;
            }
            z5 = config.getMethodTimingTelemetryEnabled();
            zabq zak = googleApiManager.zak(apiKey);
            if (zak != null) {
                if (!(zak.zaf() instanceof BaseGmsClient)) {
                    return null;
                }
                BaseGmsClient baseGmsClient = (BaseGmsClient) zak.zaf();
                if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                    ConnectionTelemetryConfiguration zab = zab(zak, baseGmsClient, i5);
                    if (zab == null) {
                        return null;
                    }
                    zak.zaq();
                    z5 = zab.getMethodTimingTelemetryEnabled();
                }
            }
        }
        return new zacd<>(googleApiManager, i5, apiKey, z5 ? System.currentTimeMillis() : 0L, z5 ? SystemClock.elapsedRealtime() : 0L, null, null);
    }

    @q0
    private static ConnectionTelemetryConfiguration zab(zabq<?> zabqVar, BaseGmsClient<?> baseGmsClient, int i5) {
        int[] methodInvocationMethodKeyAllowlist;
        int[] methodInvocationMethodKeyDisallowlist;
        ConnectionTelemetryConfiguration telemetryConfiguration = baseGmsClient.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.getMethodInvocationTelemetryEnabled() || ((methodInvocationMethodKeyAllowlist = telemetryConfiguration.getMethodInvocationMethodKeyAllowlist()) != null ? !ArrayUtils.contains(methodInvocationMethodKeyAllowlist, i5) : !((methodInvocationMethodKeyDisallowlist = telemetryConfiguration.getMethodInvocationMethodKeyDisallowlist()) == null || !ArrayUtils.contains(methodInvocationMethodKeyDisallowlist, i5))) || zabqVar.zac() >= telemetryConfiguration.getMaxMethodInvocationsLogged()) {
            return null;
        }
        return telemetryConfiguration;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    @n1
    public final void onComplete(@o0 Task<T> task) {
        zabq zak;
        int i5;
        int i6;
        int i7;
        int errorCode;
        long j5;
        long j6;
        int i8;
        if (this.zaa.zaF()) {
            RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
            if ((config == null || config.getMethodInvocationTelemetryEnabled()) && (zak = this.zaa.zak(this.zac)) != null && (zak.zaf() instanceof BaseGmsClient)) {
                BaseGmsClient baseGmsClient = (BaseGmsClient) zak.zaf();
                int i9 = 0;
                boolean z5 = this.zad > 0;
                int gCoreServiceId = baseGmsClient.getGCoreServiceId();
                if (config != null) {
                    z5 &= config.getMethodTimingTelemetryEnabled();
                    int batchPeriodMillis = config.getBatchPeriodMillis();
                    int maxMethodInvocationsInBatch = config.getMaxMethodInvocationsInBatch();
                    i5 = config.getVersion();
                    if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                        ConnectionTelemetryConfiguration zab = zab(zak, baseGmsClient, this.zab);
                        if (zab == null) {
                            return;
                        }
                        boolean z6 = zab.getMethodTimingTelemetryEnabled() && this.zad > 0;
                        maxMethodInvocationsInBatch = zab.getMaxMethodInvocationsLogged();
                        z5 = z6;
                    }
                    i7 = batchPeriodMillis;
                    i6 = maxMethodInvocationsInBatch;
                } else {
                    i5 = 0;
                    i6 = 100;
                    i7 = 5000;
                }
                GoogleApiManager googleApiManager = this.zaa;
                if (task.isSuccessful()) {
                    errorCode = 0;
                } else {
                    if (task.isCanceled()) {
                        i9 = 100;
                    } else {
                        Exception exception = task.getException();
                        if (exception instanceof ApiException) {
                            Status status = ((ApiException) exception).getStatus();
                            int statusCode = status.getStatusCode();
                            ConnectionResult connectionResult = status.getConnectionResult();
                            errorCode = connectionResult == null ? -1 : connectionResult.getErrorCode();
                            i9 = statusCode;
                        } else {
                            i9 = 101;
                        }
                    }
                    errorCode = -1;
                }
                if (z5) {
                    long j7 = this.zad;
                    long currentTimeMillis = System.currentTimeMillis();
                    i8 = (int) (SystemClock.elapsedRealtime() - this.zae);
                    j5 = j7;
                    j6 = currentTimeMillis;
                } else {
                    j5 = 0;
                    j6 = 0;
                    i8 = -1;
                }
                googleApiManager.zay(new MethodInvocation(this.zab, i9, errorCode, j5, j6, null, null, gCoreServiceId, i8), i5, i7, i6);
            }
        }
    }
}
