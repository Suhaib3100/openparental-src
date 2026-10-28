package com.tencent.beacon.module;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes6.dex */
public enum ModuleName {
    STRATEGY(ProtectedSandApp.s("㏑\u0001")),
    EVENT(ProtectedSandApp.s("㏓\u0001")),
    STAT(ProtectedSandApp.s("㏕\u0001"));

    private String className;

    ModuleName(String str) {
        this.className = str;
    }

    public String getClassName() {
        return this.className;
    }
}
