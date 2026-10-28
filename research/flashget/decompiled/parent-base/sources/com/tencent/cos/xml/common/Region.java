package com.tencent.cos.xml.common;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes6.dex */
public enum Region {
    AP_Beijing_1(ProtectedSandApp.s("㕄\u0001")),
    AP_Beijing(ProtectedSandApp.s("㕆\u0001")),
    AP_Shanghai(ProtectedSandApp.s("㕈\u0001")),
    AP_Guangzhou(ProtectedSandApp.s("㕊\u0001")),
    AP_Guangzhou_2(ProtectedSandApp.s("㕌\u0001")),
    AP_Chengdu(ProtectedSandApp.s("㕎\u0001")),
    AP_Singapore(ProtectedSandApp.s("㕐\u0001")),
    AP_Hongkong(ProtectedSandApp.s("㕒\u0001")),
    NA_Toronto(ProtectedSandApp.s("㕔\u0001")),
    EU_Frankfurt(ProtectedSandApp.s("㕖\u0001")),
    CN_NORTH(ProtectedSandApp.s("㕘\u0001")),
    CN_SOUTH(ProtectedSandApp.s("㕚\u0001")),
    CN_EAST(ProtectedSandApp.s("㕜\u0001")),
    CN_SOUTHWEST(ProtectedSandApp.s("㕞\u0001")),
    SG(ProtectedSandApp.s("㕠\u0001"));

    private String region;

    Region(String str) {
        this.region = str;
    }

    public static Region fromValue(String str) {
        for (Region region : values()) {
            if (region.region.equalsIgnoreCase(str)) {
                return region;
            }
        }
        return null;
    }

    public String getRegion() {
        return this.region;
    }
}
