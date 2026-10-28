package com.tencent.beacon.base.net;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes6.dex */
public enum BodyType {
    JSON(ProtectedSandApp.s("セ\u0001")),
    FORM(ProtectedSandApp.s("ソ\u0001")),
    DATA(ProtectedSandApp.s("タ\u0001"));

    public String httpType;

    BodyType(String str) {
        this.httpType = str;
    }
}
