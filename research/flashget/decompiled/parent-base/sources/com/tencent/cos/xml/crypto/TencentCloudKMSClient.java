package com.tencent.cos.xml.crypto;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.qcloud.core.auth.BasicQCloudCredentials;
import com.tencent.qcloud.core.auth.QCloudCredentialProvider;
import com.tencent.qcloud.core.auth.QCloudCredentials;
import com.tencent.qcloud.core.auth.SessionQCloudCredentials;
import com.tencent.qcloud.core.common.QCloudClientException;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.kms.v20190118.KmsClient;
import com.tencentcloudapi.kms.v20190118.models.DecryptRequest;
import com.tencentcloudapi.kms.v20190118.models.DecryptResponse;
import com.tencentcloudapi.kms.v20190118.models.EncryptRequest;
import com.tencentcloudapi.kms.v20190118.models.EncryptResponse;
import com.tencentcloudapi.kms.v20190118.models.GenerateDataKeyRequest;
import com.tencentcloudapi.kms.v20190118.models.GenerateDataKeyResponse;
import java.util.Locale;

/* loaded from: classes6.dex */
public class TencentCloudKMSClient implements QCLOUDKMS {
    private QCloudCredentialProvider credentialProvider;
    private final KmsClient kmsClient;

    public TencentCloudKMSClient(String str, QCloudCredentialProvider qCloudCredentialProvider) {
        this.kmsClient = new KmsClient((Credential) null, str);
        this.credentialProvider = qCloudCredentialProvider;
    }

    private CosXmlClientException getClientException(TencentCloudSDKException tencentCloudSDKException, String str) {
        String errorCode = tencentCloudSDKException.getErrorCode();
        String requestId = tencentCloudSDKException.getRequestId();
        return new CosXmlClientException(ClientErrorCode.KMS_ERROR.getCode(), String.format(Locale.ENGLISH, ProtectedSandApp.s("㘱\u0001"), str, tencentCloudSDKException.getMessage(), errorCode, requestId));
    }

    public void assetCredentials() throws CosXmlClientException {
        Credential credential;
        try {
            QCloudCredentials credentials = this.credentialProvider.getCredentials();
            if (credentials instanceof SessionQCloudCredentials) {
                SessionQCloudCredentials sessionQCloudCredentials = (SessionQCloudCredentials) credentials;
                credential = new Credential(sessionQCloudCredentials.getSecretId(), sessionQCloudCredentials.getSecretKey(), sessionQCloudCredentials.getToken());
            } else {
                if (!(credentials instanceof BasicQCloudCredentials)) {
                    throw CosXmlClientException.internalException(ProtectedSandApp.s("㘲\u0001"));
                }
                BasicQCloudCredentials basicQCloudCredentials = (BasicQCloudCredentials) credentials;
                credential = new Credential(basicQCloudCredentials.getSecretId(), basicQCloudCredentials.getSecretKey());
            }
            this.kmsClient.setCredential(credential);
        } catch (QCloudClientException e4) {
            throw CosXmlClientException.internalException(e4.getMessage());
        }
    }

    @Override // com.tencent.cos.xml.crypto.QCLOUDKMS
    public DecryptResponse decrypt(DecryptRequest decryptRequest) throws CosXmlClientException {
        try {
            assetCredentials();
            return this.kmsClient.Decrypt(decryptRequest);
        } catch (TencentCloudSDKException e4) {
            throw getClientException(e4, ProtectedSandApp.s("㘳\u0001"));
        }
    }

    @Override // com.tencent.cos.xml.crypto.QCLOUDKMS
    public EncryptResponse encrypt(EncryptRequest encryptRequest) throws CosXmlClientException {
        try {
            assetCredentials();
            return this.kmsClient.Encrypt(encryptRequest);
        } catch (TencentCloudSDKException e4) {
            throw getClientException(e4, ProtectedSandApp.s("㘴\u0001"));
        }
    }

    @Override // com.tencent.cos.xml.crypto.QCLOUDKMS
    public GenerateDataKeyResponse generateDataKey(GenerateDataKeyRequest generateDataKeyRequest) throws CosXmlClientException {
        try {
            assetCredentials();
            return this.kmsClient.GenerateDataKey(generateDataKeyRequest);
        } catch (TencentCloudSDKException e4) {
            throw getClientException(e4, ProtectedSandApp.s("㘵\u0001"));
        }
    }

    @Override // com.tencent.cos.xml.crypto.QCLOUDKMS
    public void shutdown() {
    }
}
