package com.tencent.qcloud.core.auth;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.core.http.HttpConfiguration;

/* loaded from: classes7.dex */
public class BasicQCloudCredentials implements QCloudLifecycleCredentials, QCloudRawCredentials {
    private final String keyTime;
    private final String secretId;
    private final String secretKey;
    private final String signKey;

    public BasicQCloudCredentials(String str, String str2, String str3, long j4, long j5) {
        if (str == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("壅\u0001"));
        }
        if (str2 == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("壄\u0001"));
        }
        if (str3 == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("壃\u0001"));
        }
        if (j4 >= j5) {
            throw new IllegalArgumentException(ProtectedSandApp.s("壂\u0001"));
        }
        this.secretId = str;
        this.secretKey = str2;
        this.signKey = str3;
        this.keyTime = Utils.handleTimeAccuracy(j4) + ProtectedSandApp.s("壁\u0001") + Utils.handleTimeAccuracy(j5);
    }

    @Override // com.tencent.qcloud.core.auth.QCloudLifecycleCredentials
    public String getKeyTime() {
        return this.keyTime;
    }

    @Override // com.tencent.qcloud.core.auth.QCloudCredentials
    public String getSecretId() {
        return this.secretId;
    }

    @Override // com.tencent.qcloud.core.auth.QCloudRawCredentials
    public String getSecretKey() {
        return this.secretKey;
    }

    @Override // com.tencent.qcloud.core.auth.QCloudLifecycleCredentials
    public String getSignKey() {
        return this.signKey;
    }

    @Override // com.tencent.qcloud.core.auth.QCloudLifecycleCredentials
    public boolean isValid() {
        long deviceTimeWithOffset = HttpConfiguration.getDeviceTimeWithOffset();
        long[] parseKeyTimes = Utils.parseKeyTimes(this.keyTime);
        return deviceTimeWithOffset > parseKeyTimes[0] && deviceTimeWithOffset < parseKeyTimes[1] - 60;
    }

    public BasicQCloudCredentials(String str, String str2, String str3, String str4) {
        if (str == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("壅\u0001"));
        }
        if (str2 == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("壄\u0001"));
        }
        if (str3 == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("壃\u0001"));
        }
        if (str4 != null) {
            this.secretId = str;
            this.secretKey = str2;
            this.signKey = str3;
            this.keyTime = str4;
            return;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("壆\u0001"));
    }
}
