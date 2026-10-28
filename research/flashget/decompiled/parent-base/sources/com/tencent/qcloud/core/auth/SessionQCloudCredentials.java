package com.tencent.qcloud.core.auth;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.core.http.HttpConfiguration;

/* loaded from: classes7.dex */
public class SessionQCloudCredentials implements QCloudLifecycleCredentials, QCloudRawCredentials {
    private final long expiredTime;
    private final String secretId;
    private final String secretKey;
    private final long startTime;
    private final String token;

    public SessionQCloudCredentials(String str, String str2, String str3, long j4) {
        this(str, str2, str3, HttpConfiguration.getDeviceTimeWithOffset(), j4);
    }

    private String getKeyTime(long j4, long j5) {
        return Utils.handleTimeAccuracy(j4) + ProtectedSandApp.s("夕\u0001") + Utils.handleTimeAccuracy(j5);
    }

    private String getSignKey(String str, String str2) {
        byte[] hmacSha1 = Utils.hmacSha1(str2, str);
        if (hmacSha1 != null) {
            return new String(Utils.encodeHex(hmacSha1));
        }
        return null;
    }

    public long getExpiredTime() {
        return this.expiredTime;
    }

    @Override // com.tencent.qcloud.core.auth.QCloudCredentials
    public String getSecretId() {
        return this.secretId;
    }

    @Override // com.tencent.qcloud.core.auth.QCloudRawCredentials
    public String getSecretKey() {
        return this.secretKey;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public String getToken() {
        return this.token;
    }

    @Override // com.tencent.qcloud.core.auth.QCloudLifecycleCredentials
    public boolean isValid() {
        return HttpConfiguration.getDeviceTimeWithOffset() <= this.expiredTime - 60;
    }

    public SessionQCloudCredentials(String str, String str2, String str3, long j4, long j5) {
        if (str == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("夓\u0001"));
        }
        if (str2 == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("夒\u0001"));
        }
        if (str3 == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("夑\u0001"));
        }
        if (j4 >= j5) {
            throw new IllegalArgumentException(ProtectedSandApp.s("夐\u0001"));
        }
        this.secretId = str;
        this.secretKey = str2;
        this.startTime = j4;
        this.expiredTime = j5;
        this.token = str3;
    }

    @Override // com.tencent.qcloud.core.auth.QCloudLifecycleCredentials
    public String getKeyTime() {
        return Utils.handleTimeAccuracy(this.startTime) + ProtectedSandApp.s("夕\u0001") + Utils.handleTimeAccuracy(this.expiredTime);
    }

    @Override // com.tencent.qcloud.core.auth.QCloudLifecycleCredentials
    public String getSignKey() {
        return getSignKey(this.secretKey, getKeyTime());
    }

    public SessionQCloudCredentials(String str, String str2, String str3, String str4) {
        if (str == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("夓\u0001"));
        }
        if (str2 == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("夒\u0001"));
        }
        if (str3 == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("夑\u0001"));
        }
        if (str4 != null) {
            this.secretId = str;
            this.secretKey = str2;
            this.token = str3;
            long[] parseKeyTimes = Utils.parseKeyTimes(str4);
            this.startTime = parseKeyTimes[0];
            this.expiredTime = parseKeyTimes[1];
            return;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("夔\u0001"));
    }
}
