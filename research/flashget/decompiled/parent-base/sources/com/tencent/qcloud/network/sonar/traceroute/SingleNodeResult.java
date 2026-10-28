package com.tencent.qcloud.network.sonar.traceroute;

import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.network.sonar.command.CommandStatus;
import com.tencent.qcloud.network.sonar.command.NetCommandResult;
import com.tencent.qcloud.network.sonar.utils.SonarLog;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class SingleNodeResult extends NetCommandResult {
    protected float delay;
    private int hop;
    private boolean isFinalRoute;
    private String routeIp;

    protected SingleNodeResult(String str, int i4) {
        super(str);
        this.hop = i4;
        setRouteIp(ProtectedSandApp.s("嬨\u0001"));
        this.delay = 0.0f;
    }

    public float getDelay() {
        return this.delay;
    }

    public int getHop() {
        return this.hop;
    }

    public String getRouteIp() {
        return this.routeIp;
    }

    public boolean isFinalRoute() {
        return this.isFinalRoute;
    }

    public void setDelay(float f4) {
        this.delay = f4;
    }

    SingleNodeResult setFinalRoute(boolean z4) {
        this.isFinalRoute = z4;
        return this;
    }

    SingleNodeResult setHop(int i4) {
        this.hop = i4;
        return this;
    }

    SingleNodeResult setRouteIp(String str) {
        this.routeIp = str;
        this.isFinalRoute = TextUtils.equals(this.targetIp, str);
        return this;
    }

    SingleNodeResult setStatus(CommandStatus commandStatus) {
        this.status = commandStatus;
        return this;
    }

    @Override // com.tencent.qcloud.network.sonar.command.NetCommandResult, com.tencent.qcloud.network.sonar.command.CommandResult, com.tencent.qcloud.network.sonar.command.JsonSerializable
    public JSONObject toJson() {
        JSONObject json = super.toJson();
        try {
            json.put(ProtectedSandApp.s("嬩\u0001"), this.hop);
            json.put(ProtectedSandApp.s("嬪\u0001"), this.routeIp);
            json.put(ProtectedSandApp.s("嬫\u0001"), String.format(ProtectedSandApp.s("嬬\u0001"), Float.valueOf(this.delay)));
            json.put(ProtectedSandApp.s("嬭\u0001"), this.isFinalRoute);
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
