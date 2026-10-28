package com.tencent.qcloud.network.sonar.traceroute;

import android.os.SystemClock;
import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.network.sonar.Sonar;
import com.tencent.qcloud.network.sonar.SonarCallback;
import com.tencent.qcloud.network.sonar.SonarRequest;
import com.tencent.qcloud.network.sonar.SonarResult;
import com.tencent.qcloud.network.sonar.SonarType;
import com.tencent.qcloud.network.sonar.command.CommandStatus;
import com.tencent.qcloud.network.sonar.utils.SonarLog;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public class TracerouteSonar implements Sonar<TracerouteResult> {
    protected final String TAG = getClass().getSimpleName();
    private final Config config = new Config();
    private boolean isUserStop = false;
    private SonarCallback.Step<TracerouteNodeResult> stepCallback;
    private TracerouteTask task;

    public static class Config {
        private int maxHop = 32;
        private int countPerRoute = 3;

        public int getCountPerRoute() {
            return this.countPerRoute;
        }

        public int getMaxHop() {
            return this.maxHop;
        }

        public Config setCountPerRoute(int i4) {
            this.countPerRoute = Math.max(1, Math.min(i4, 3));
            return this;
        }

        public Config setMaxHop(int i4) {
            this.maxHop = Math.max(1, Math.min(i4, 128));
            return this;
        }
    }

    @Override // com.tencent.qcloud.network.sonar.Sonar
    public SonarResult<TracerouteResult> start(SonarRequest sonarRequest) {
        if (!sonarRequest.isNetworkAvailable()) {
            return new SonarResult<>(SonarType.TRACEROUTE, new Exception(ProtectedSandApp.s("嬾\u0001")));
        }
        if (TextUtils.isEmpty(sonarRequest.getIp())) {
            return new SonarResult<>(SonarType.TRACEROUTE, new Exception(ProtectedSandApp.s("嬿\u0001")));
        }
        long currentTimeMillis = System.currentTimeMillis();
        SonarLog.d(this.TAG, ProtectedSandApp.s("孀\u0001") + Thread.currentThread().getId() + ProtectedSandApp.s("孁\u0001") + Thread.currentThread().getName());
        this.isUserStop = false;
        ArrayList arrayList = new ArrayList();
        long currentTimeMillis2 = System.currentTimeMillis() / 1000;
        SystemClock.elapsedRealtime();
        int i4 = 0;
        for (int i5 = 1; i5 <= this.config.maxHop && !this.isUserStop; i5++) {
            TracerouteTask tracerouteTask = new TracerouteTask(sonarRequest.getIp(), i5, this.config.countPerRoute, this.stepCallback);
            this.task = tracerouteTask;
            TracerouteNodeResult run = tracerouteTask.run();
            SonarLog.d(this.TAG, String.format(ProtectedSandApp.s("孃\u0001"), Long.valueOf(Thread.currentThread().getId()), run == null ? ProtectedSandApp.s("孂\u0001") : run.toString()));
            if (run != null) {
                arrayList.add(run);
                if (run.isFinalRoute()) {
                    break;
                }
                i4 = TextUtils.equals(ProtectedSandApp.s("孄\u0001"), run.getRouteIp()) ? i4 + 1 : 0;
                if (i4 == 10) {
                    break;
                }
            }
        }
        TracerouteResult tracerouteResult = new TracerouteResult(sonarRequest.getIp(), currentTimeMillis2, this.isUserStop ? CommandStatus.CMD_STATUS_USER_STOP : CommandStatus.CMD_STATUS_SUCCESSFUL, sonarRequest.getHost(), System.currentTimeMillis() - currentTimeMillis);
        tracerouteResult.getTracerouteNodeResults().addAll(arrayList);
        return new SonarResult<>(SonarType.TRACEROUTE, tracerouteResult);
    }

    @Override // com.tencent.qcloud.network.sonar.Sonar
    public void stop() {
        this.isUserStop = true;
        TracerouteTask tracerouteTask = this.task;
        if (tracerouteTask != null) {
            tracerouteTask.stop();
        }
    }
}
