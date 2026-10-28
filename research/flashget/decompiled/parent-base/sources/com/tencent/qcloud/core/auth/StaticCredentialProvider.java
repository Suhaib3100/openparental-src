package com.tencent.qcloud.core.auth;

/* loaded from: classes7.dex */
public class StaticCredentialProvider implements QCloudCredentialProvider {
    private QCloudCredentials mCredentials;

    public StaticCredentialProvider() {
    }

    @Override // com.tencent.qcloud.core.auth.QCloudCredentialProvider
    public QCloudCredentials getCredentials() {
        return this.mCredentials;
    }

    @Override // com.tencent.qcloud.core.auth.QCloudCredentialProvider
    public void refresh() {
    }

    public void update(QCloudCredentials qCloudCredentials) {
        this.mCredentials = qCloudCredentials;
    }

    public StaticCredentialProvider(QCloudCredentials qCloudCredentials) {
        this.mCredentials = qCloudCredentials;
    }
}
