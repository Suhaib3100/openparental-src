package com.tencent.qcloud.network.sonar.command;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.network.sonar.utils.SonarLog;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public abstract class CommandResult implements JsonSerializable {
    protected CommandStatus status;

    public CommandStatus getStatus() {
        return this.status;
    }

    @Override // com.tencent.qcloud.network.sonar.command.JsonSerializable
    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            String s4 = ProtectedSandApp.s("嫙\u0001");
            CommandStatus commandStatus = this.status;
            jSONObject.put(s4, commandStatus == null ? null : commandStatus.name());
        } catch (JSONException e4) {
            if (SonarLog.openLog) {
                e4.printStackTrace();
            }
        }
        return jSONObject;
    }
}
