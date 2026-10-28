package com.tencent.qcloud.core.auth;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.core.common.QCloudClientException;
import com.tencent.qcloud.core.http.HttpConfiguration;

/* loaded from: classes7.dex */
public class ShortTimeCredentialProvider extends BasicLifecycleCredentialProvider {
    private long duration;
    private String secretId;
    private String secretKey;
    private long startTime;

    @Deprecated
    public ShortTimeCredentialProvider(String str, String str2, long j4) {
        this.secretId = str;
        this.secretKey = str2;
        this.duration = j4;
    }

    private String secretKey2SignKey(String str, String str2) {
        byte[] hmacSha1 = Utils.hmacSha1(str2, str);
        if (hmacSha1 != null) {
            return new String(Utils.encodeHex(hmacSha1));
        }
        return null;
    }

    @Override // com.tencent.qcloud.core.auth.BasicLifecycleCredentialProvider
    protected QCloudLifecycleCredentials fetchNewCredentials() throws QCloudClientException {
        long j4 = this.startTime;
        if (j4 <= 0) {
            j4 = HttpConfiguration.getDeviceTimeWithOffset();
        }
        String str = j4 + ProtectedSandApp.s("外\u0001") + (this.duration + j4);
        return new BasicQCloudCredentials(this.secretId, this.secretKey, secretKey2SignKey(this.secretKey, str), str);
    }

    public long getDuration() {
        return this.duration;
    }

    public String getSecretId() {
        return this.secretId;
    }

    public String getSecretKey() {
        return this.secretKey;
    }

    public long getStartTime() {
        return this.startTime;
    }

    @Deprecated
    public ShortTimeCredentialProvider(String str, String str2, long j4, long j5) {
        this(str, str2, j5);
        this.startTime = j4;
    }
}
