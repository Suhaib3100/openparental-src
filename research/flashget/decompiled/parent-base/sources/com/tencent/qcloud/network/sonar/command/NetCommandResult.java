package com.tencent.qcloud.network.sonar.command;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.network.sonar.utils.SonarLog;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class NetCommandResult extends CommandResult {
    protected String targetIp;

    protected NetCommandResult(String str) {
        this.targetIp = str;
    }

    public String getTargetIp() {
        return this.targetIp;
    }

    protected NetCommandResult setTargetIp(String str) {
        this.targetIp = str;
        return this;
    }

    @Override // com.tencent.qcloud.network.sonar.command.CommandResult, com.tencent.qcloud.network.sonar.command.JsonSerializable
    public JSONObject toJson() {
        JSONObject json = super.toJson();
        try {
            json.put(ProtectedSandApp.s("嫩\u0001"), this.targetIp);
        } catch (JSONException e4) {
            if (SonarLog.openLog) {
                e4.printStackTrace();
            }
        }
        return json;
    }
}
