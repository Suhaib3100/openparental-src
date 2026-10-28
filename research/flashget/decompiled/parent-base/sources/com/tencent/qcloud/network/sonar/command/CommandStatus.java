package com.tencent.qcloud.network.sonar.command;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes7.dex */
public enum CommandStatus {
    CMD_STATUS_SUCCESSFUL(ProtectedSandApp.s("嫚\u0001")),
    CMD_STATUS_FAILED(ProtectedSandApp.s("嫜\u0001")),
    CMD_STATUS_USER_STOP(ProtectedSandApp.s("嫞\u0001")),
    CMD_STATUS_ERROR(ProtectedSandApp.s("嫠\u0001")),
    CMD_STATUS_NETWORK_ERROR(ProtectedSandApp.s("嫢\u0001")),
    CMD_STATUS_ERROR_UNKNOW_HOST(ProtectedSandApp.s("嫤\u0001"));

    String name;

    CommandStatus(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }
}
