package com.tencent.qcloud.track.cls;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes7.dex */
public class ClsSessionCredentials {
    private final long expiredTime;
    private final String secretId;
    private final String secretKey;
    private final String token;

    public ClsSessionCredentials(String str, String str2, String str3, long j4) {
        if (str == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("孹\u0001"));
        }
        if (str2 == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("學\u0001"));
        }
        if (str3 == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("孷\u0001"));
        }
        this.secretId = str;
        this.secretKey = str2;
        this.expiredTime = j4;
        this.token = str3;
    }

    public long getExpiredTime() {
        return this.expiredTime;
    }

    public String getSecretId() {
        return this.secretId;
    }

    public String getSecretKey() {
        return this.secretKey;
    }

    public String getToken() {
        return this.token;
    }

    public boolean isValid() {
        return System.currentTimeMillis() / 1000 <= this.expiredTime - 60;
    }
}
