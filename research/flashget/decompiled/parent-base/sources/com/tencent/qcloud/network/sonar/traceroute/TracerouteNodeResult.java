package com.tencent.qcloud.network.sonar.traceroute;

import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.network.sonar.command.CommandStatus;
import com.tencent.qcloud.network.sonar.command.NetCommandResult;
import com.tencent.qcloud.network.sonar.utils.SonarLog;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class TracerouteNodeResult extends NetCommandResult {
    private int hop;
    private boolean isFinalRoute;
    private String routeIp;
    private List<SingleNodeResult> singleNodeList;

    protected TracerouteNodeResult(String str, int i4, List<SingleNodeResult> list) {
        super(str);
        this.hop = i4;
        this.isFinalRoute = false;
        this.routeIp = ProtectedSandApp.s("嬮\u0001");
        setSingleNodeList(list);
    }

    public int averageDelay() {
        List<SingleNodeResult> list = this.singleNodeList;
        int i4 = 0;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        float f4 = 0.0f;
        for (SingleNodeResult singleNodeResult : this.singleNodeList) {
            if (singleNodeResult != null) {
                float f5 = singleNodeResult.delay;
                if (f5 > 0.0f) {
                    i4++;
                    f4 += f5;
                }
            }
        }
        return Math.round(f4 / i4);
    }

    public int getHop() {
        return this.hop;
    }

    public String getRouteIp() {
        return this.routeIp;
    }

    public List<SingleNodeResult> getSingleNodeList() {
        return this.singleNodeList;
    }

    public boolean isFinalRoute() {
        return this.isFinalRoute;
    }

    public float lossRate() {
        List<SingleNodeResult> list = this.singleNodeList;
        if (list == null || list.isEmpty()) {
            return 1.0f;
        }
        float size = this.singleNodeList.size();
        int i4 = 0;
        for (SingleNodeResult singleNodeResult : this.singleNodeList) {
            if (singleNodeResult == null || singleNodeResult.getStatus() != CommandStatus.CMD_STATUS_SUCCESSFUL || singleNodeResult.delay == 0.0f) {
                i4++;
            }
        }
        return i4 / size;
    }

    TracerouteNodeResult setFinalRoute(boolean z4) {
        this.isFinalRoute = z4;
        return this;
    }

    TracerouteNodeResult setHop(int i4) {
        this.hop = i4;
        return this;
    }

    TracerouteNodeResult setRouteIp(String str) {
        this.routeIp = str;
        this.isFinalRoute = TextUtils.equals(this.targetIp, str);
        return this;
    }

    void setSingleNodeList(List<SingleNodeResult> list) {
        this.singleNodeList = list;
        if (list == null) {
            return;
        }
        for (SingleNodeResult singleNodeResult : list) {
            if (!TextUtils.equals(ProtectedSandApp.s("嬮\u0001"), singleNodeResult.getRouteIp())) {
                setRouteIp(singleNodeResult.getRouteIp());
                return;
            }
        }
    }

    @Override // com.tencent.qcloud.network.sonar.command.NetCommandResult, com.tencent.qcloud.network.sonar.command.CommandResult, com.tencent.qcloud.network.sonar.command.JsonSerializable
    public JSONObject toJson() {
        JSONObject json = super.toJson();
        try {
            json.put(ProtectedSandApp.s("嬯\u0001"), this.hop);
            json.put(ProtectedSandApp.s("嬰\u0001"), this.routeIp);
            json.put(ProtectedSandApp.s("嬱\u0001"), averageDelay());
            json.put(ProtectedSandApp.s("嬲\u0001"), String.format(ProtectedSandApp.s("嬳\u0001"), Float.valueOf(lossRate())));
            json.put(ProtectedSandApp.s("嬴\u0001"), this.isFinalRoute);
        } catch (JSONException e4) {
            if (SonarLog.openLog) {
                e4.printStackTrace();
            }
        }
        return json;
    }

    public String toString() {
        return toJson().toString();
    }
}
