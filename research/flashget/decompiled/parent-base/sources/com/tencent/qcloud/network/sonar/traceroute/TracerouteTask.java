package com.tencent.qcloud.network.sonar.traceroute;

import android.os.SystemClock;
import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.network.sonar.SonarCallback;
import com.tencent.qcloud.network.sonar.command.CommandStatus;
import com.tencent.qcloud.network.sonar.command.CommandTask;
import com.tencent.qcloud.network.sonar.command.NetCommandTask;
import com.tencent.qcloud.network.sonar.utils.SonarLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;

/* loaded from: classes7.dex */
final class TracerouteTask extends NetCommandTask<TracerouteNodeResult> {
    private final int count;
    private final int hop;
    private SonarCallback.Step<TracerouteNodeResult> stepCallback;
    private final String targetIp;

    TracerouteTask(String str, int i4, int i5, SonarCallback.Step<TracerouteNodeResult> step) {
        this.targetIp = str;
        this.hop = i4;
        this.count = i5;
        this.stepCallback = step;
    }

    @Override // com.tencent.qcloud.network.sonar.command.CommandTask
    protected void parseErrorInfo(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SonarLog.d(this.TAG, ProtectedSandApp.s("孅\u0001") + this.hop + ProtectedSandApp.s("孆\u0001") + str);
    }

    @Override // com.tencent.qcloud.network.sonar.command.CommandTask
    protected void parseInputInfo(String str) {
    }

    protected SingleNodeResult parseSingleNodeInfoInput(String str) {
        SonarLog.d(this.TAG, ProtectedSandApp.s("孅\u0001") + this.hop + ProtectedSandApp.s("孇\u0001") + str);
        SingleNodeResult singleNodeResult = new SingleNodeResult(this.targetIp, this.hop);
        if (TextUtils.isEmpty(str)) {
            singleNodeResult.setStatus(CommandStatus.CMD_STATUS_NETWORK_ERROR);
            singleNodeResult.setDelay(0.0f);
            return singleNodeResult;
        }
        Matcher matcherRouteNode = matcherRouteNode(str);
        if (matcherRouteNode.find()) {
            singleNodeResult.setRouteIp(getIpFromMatcher(matcherRouteNode));
            singleNodeResult.setStatus(CommandStatus.CMD_STATUS_SUCCESSFUL);
        } else {
            Matcher matcherIp = matcherIp(str);
            if (matcherIp.find()) {
                singleNodeResult.setRouteIp(matcherIp.group());
                singleNodeResult.setStatus(CommandStatus.CMD_STATUS_SUCCESSFUL);
                singleNodeResult.setDelay(Float.parseFloat(getPingDelayFromMatcher(matcherTime(str))));
            } else {
                singleNodeResult.setStatus(CommandStatus.CMD_STATUS_FAILED);
                singleNodeResult.setDelay(0.0f);
            }
        }
        return singleNodeResult;
    }

    @Override // com.tencent.qcloud.network.sonar.command.CommandTask
    protected void stop() {
        this.isRunning = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, com.tencent.qcloud.network.sonar.traceroute.TracerouteNodeResult, java.lang.Object] */
    @Override // com.tencent.qcloud.network.sonar.command.CommandTask
    public TracerouteNodeResult run() {
        float f4;
        this.isRunning = true;
        this.command = String.format(ProtectedSandApp.s("孈\u0001"), Integer.valueOf(this.hop), this.targetIp);
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; this.isRunning && i4 < this.count; i4++) {
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                String execCommand = execCommand(this.command);
                int elapsedRealtime2 = (int) (SystemClock.elapsedRealtime() - elapsedRealtime);
                float f5 = CommandTask.COMMAND_ELAPSED_TIME;
                while (true) {
                    f4 = elapsedRealtime2 - f5;
                    if (f4 >= elapsedRealtime2 * 0.1d || f5 <= CommandTask.COMMAND_ELAPSED_TIME * 0.1f) {
                        break;
                    }
                    f5 = (float) (f5 * 0.8d);
                }
                SonarLog.d(this.TAG, String.format(ProtectedSandApp.s("孉\u0001"), Integer.valueOf(elapsedRealtime2), Float.valueOf(CommandTask.COMMAND_ELAPSED_TIME), Float.valueOf(f5)));
                int i5 = (int) f4;
                SingleNodeResult parseSingleNodeInfoInput = parseSingleNodeInfoInput(execCommand);
                if (!parseSingleNodeInfoInput.isFinalRoute() && parseSingleNodeInfoInput.getStatus() == CommandStatus.CMD_STATUS_SUCCESSFUL) {
                    parseSingleNodeInfoInput.setDelay(i5);
                }
                arrayList.add(parseSingleNodeInfoInput);
            } catch (IOException e4) {
                e = e4;
                SonarLog.d(this.TAG, String.format(ProtectedSandApp.s("孊\u0001"), Integer.valueOf(i4), this.command, e.getMessage()));
            } catch (InterruptedException e5) {
                e = e5;
                SonarLog.d(this.TAG, String.format(ProtectedSandApp.s("孊\u0001"), Integer.valueOf(i4), this.command, e.getMessage()));
            } catch (Throwable th) {
                throw th;
            }
        }
        ?? tracerouteNodeResult = new TracerouteNodeResult(this.targetIp, this.hop, arrayList);
        this.resultData = tracerouteNodeResult;
        SonarCallback.Step<TracerouteNodeResult> step = this.stepCallback;
        if (step != 0) {
            step.step(tracerouteNodeResult);
        }
        if (this.isRunning) {
            return (TracerouteNodeResult) this.resultData;
        }
        return null;
    }
}
