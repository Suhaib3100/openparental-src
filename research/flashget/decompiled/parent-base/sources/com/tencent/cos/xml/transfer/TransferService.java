package com.tencent.cos.xml.transfer;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosXmlSimpleService;
import com.tencent.cos.xml.crypto.COSDirectImpl;
import com.tencent.cos.xml.crypto.CryptoModuleAE;
import com.tencent.cos.xml.crypto.CryptoModuleBase;
import com.tencent.cos.xml.crypto.EncryptionMaterialsProvider;
import com.tencent.cos.xml.crypto.QCLOUDKMS;
import com.tencent.cos.xml.crypto.TencentCloudKMSClient;
import com.tencent.cos.xml.model.object.GetObjectRequest;
import com.tencent.cos.xml.model.object.PutObjectRequest;
import com.tencent.qcloud.core.auth.QCloudCredentialProvider;

/* loaded from: classes7.dex */
public class TransferService {
    protected CosXmlSimpleService cosXmlService;
    private CryptoModuleBase cryptoModule;
    private QCLOUDKMS kms;
    protected TransferConfig transferConfig;

    public TransferService(CosXmlSimpleService cosXmlSimpleService, TransferConfig transferConfig) {
        if (cosXmlSimpleService == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("侾\u0001"));
        }
        if (transferConfig == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("侽\u0001"));
        }
        this.cosXmlService = cosXmlSimpleService;
        this.transferConfig = transferConfig;
    }

    private TencentCloudKMSClient newTencentCloudKMSClient(QCloudCredentialProvider qCloudCredentialProvider) {
        return new TencentCloudKMSClient(this.cosXmlService.getConfig().getRegion(), qCloudCredentialProvider);
    }

    public COSDownloadTask download(GetObjectRequest getObjectRequest) {
        COSDownloadTask cOSDownloadTask = new COSDownloadTask(new COSDirectImpl(this.cosXmlService, this.cryptoModule), getObjectRequest);
        cOSDownloadTask.start();
        return cOSDownloadTask;
    }

    public COSUploadTask upload(PutObjectRequest putObjectRequest) {
        COSUploadTask cOSUploadTask = new COSUploadTask(new COSDirectImpl(this.cosXmlService, this.cryptoModule), putObjectRequest);
        cOSUploadTask.setPartSize(this.transferConfig.sliceSizeForUpload);
        cOSUploadTask.setSliceSizeThreshold(this.transferConfig.divisionForUpload);
        cOSUploadTask.forceSimpleUpload(this.transferConfig.isForceSimpleUpload());
        cOSUploadTask.setVerifyCRC64(this.transferConfig.isVerifyCRC64());
        cOSUploadTask.start();
        return cOSUploadTask;
    }

    public TransferService(CosXmlSimpleService cosXmlSimpleService, TransferConfig transferConfig, EncryptionMaterialsProvider encryptionMaterialsProvider) {
        this(cosXmlSimpleService, transferConfig);
        TencentCloudKMSClient newTencentCloudKMSClient = newTencentCloudKMSClient(cosXmlSimpleService.getCredentialProvider());
        this.kms = newTencentCloudKMSClient;
        this.cryptoModule = new CryptoModuleAE(newTencentCloudKMSClient, cosXmlSimpleService, cosXmlSimpleService.getCredentialProvider(), encryptionMaterialsProvider);
    }
}
