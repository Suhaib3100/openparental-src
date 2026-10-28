package com.tencent.cos.xml.common;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes6.dex */
public enum MetaDataDirective {
    COPY(ProtectedSandApp.s("㔼\u0001")),
    REPLACED(ProtectedSandApp.s("㔾\u0001"));

    String directive;

    MetaDataDirective(String str) {
        this.directive = str;
    }

    public static MetaDataDirective fromValue(String str) {
        for (MetaDataDirective metaDataDirective : values()) {
            if (metaDataDirective.directive.equalsIgnoreCase(str)) {
                return metaDataDirective;
            }
        }
        return null;
    }

    public String getMetaDirective() {
        return this.directive;
    }
}
