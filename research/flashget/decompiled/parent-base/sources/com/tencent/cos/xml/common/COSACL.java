package com.tencent.cos.xml.common;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes6.dex */
public enum COSACL {
    PRIVATE(ProtectedSandApp.s("㓰\u0001")),
    PUBLIC_READ(ProtectedSandApp.s("㓲\u0001")),
    PUBLIC_READ_WRITE(ProtectedSandApp.s("㓴\u0001")),
    DEFAULT(ProtectedSandApp.s("㓶\u0001"));

    private String acl;

    COSACL(String str) {
        this.acl = str;
    }

    public static COSACL fromString(String str) {
        for (COSACL cosacl : values()) {
            if (cosacl.acl.equalsIgnoreCase(str)) {
                return cosacl;
            }
        }
        return null;
    }

    public String getAcl() {
        return this.acl;
    }
}
