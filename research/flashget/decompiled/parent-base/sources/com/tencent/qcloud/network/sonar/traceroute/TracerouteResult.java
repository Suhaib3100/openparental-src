package com.tencent.qcloud.network.sonar.traceroute;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.network.sonar.command.CommandStatus;
import com.tencent.qcloud.network.sonar.command.JsonSerializable;
import com.tencent.qcloud.network.sonar.utils.SonarLog;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class TracerouteResult implements JsonSerializable {
    private String host;
    private CommandStatus status;
    private String targetIp;
    private long timeConsuming;
    private long timestamp;
    private List<TracerouteNodeResult> tracerouteNodeResults = new ArrayList();

    public TracerouteResult(String str, long j4, CommandStatus commandStatus, String str2, long j5) {
        this.targetIp = str;
        this.timestamp = j4;
        this.status = commandStatus;
        this.host = str2;
        this.timeConsuming = j5;
    }

    public CommandStatus getCommandStatus() {
        return this.status;
    }

    public int getHopCount() {
        List<TracerouteNodeResult> list = this.tracerouteNodeResults;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public float getLossRate() {
        List<TracerouteNodeResult> list = this.tracerouteNodeResults;
        if (list == null) {
            return 1.0f;
        }
        int i4 = 0;
        float f4 = 0.0f;
        for (TracerouteNodeResult tracerouteNodeResult : list) {
            if (tracerouteNodeResult != null) {
                i4++;
                f4 += tracerouteNodeResult.lossRate();
            }
        }
        return f4 / i4;
    }

    public String getNodeResultsString() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        List<TracerouteNodeResult> list = this.tracerouteNodeResults;
        if (list != null && !list.isEmpty()) {
            for (TracerouteNodeResult tracerouteNodeResult : this.tracerouteNodeResults) {
                if (tracerouteNodeResult != null && tracerouteNodeResult.toJson().length() != 0) {
                    jSONArray.put(tracerouteNodeResult.toJson());
                }
            }
        }
        try {
            jSONObject.put(ProtectedSandApp.s("嬵\u0001"), jSONArray);
        } catch (JSONException e4) {
            if (SonarLog.openLog) {
                e4.printStackTrace();
            }
        }
        return jSONObject.toString();
    }

    public String getTargetIp() {
        return this.targetIp;
    }

    public long getTimeConsuming() {
        return this.timeConsuming;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public int getTotalDelay() {
        List<TracerouteNodeResult> list = this.tracerouteNodeResults;
        int i4 = 0;
        if (list != null) {
            for (TracerouteNodeResult tracerouteNodeResult : list) {
                if (tracerouteNodeResult != null && tracerouteNodeResult.averageDelay() > 0.0f) {
                    i4 += tracerouteNodeResult.averageDelay();
                }
            }
        }
        return i4;
    }

    public List<TracerouteNodeResult> getTracerouteNodeResults() {
        return this.tracerouteNodeResults;
    }

    @Override // com.tencent.qcloud.network.sonar.command.JsonSerializable
    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        List<TracerouteNodeResult> list = this.tracerouteNodeResults;
        if (list != null && !list.isEmpty()) {
            for (TracerouteNodeResult tracerouteNodeResult : this.tracerouteNodeResults) {
                if (tracerouteNodeResult != null && tracerouteNodeResult.toJson().length() != 0) {
                    jSONArray.put(tracerouteNodeResult.toJson());
                }
            }
        }
        try {
            jSONObject.put(ProtectedSandApp.s("嬶\u0001"), this.host);
            jSONObject.put(ProtectedSandApp.s("嬷\u0001"), this.targetIp);
            jSONObject.put(ProtectedSandApp.s("嬸\u0001"), this.timestamp);
            jSONObject.put(ProtectedSandApp.s("嬹\u0001"), this.status.getName().toString());
            jSONObject.put(ProtectedSandApp.s("嬺\u0001"), getHopCount());
            jSONObject.put(ProtectedSandApp.s("嬻\u0001"), getTotalDelay());
            jSONObject.put(ProtectedSandApp.s("嬼\u0001"), getLossRate());
            jSONObject.put(ProtectedSandApp.s("嬽\u0001"), this.timeConsuming);
            jSONObject.put(ProtectedSandApp.s("嬵\u0001"), jSONArray);
        } catch (JSONException e4) {
            if (SonarLog.openLog) {
                e4.printStackTrace();
            }
        }
        return jSONObject;
    }

    public String toString() {
        return toJson().toString();
    }
}
