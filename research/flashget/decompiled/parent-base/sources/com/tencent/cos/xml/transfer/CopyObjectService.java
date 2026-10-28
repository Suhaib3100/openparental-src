package com.tencent.cos.xml.transfer;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosXmlService;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.model.CosXmlRequest;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.cos.xml.model.object.CompleteMultiUploadRequest;
import com.tencent.cos.xml.model.object.CompleteMultiUploadResult;
import com.tencent.cos.xml.model.object.CopyObjectRequest;
import com.tencent.cos.xml.model.object.CopyObjectResult;
import com.tencent.cos.xml.model.object.HeadObjectRequest;
import com.tencent.cos.xml.model.object.HeadObjectResult;
import com.tencent.cos.xml.model.object.InitMultipartUploadRequest;
import com.tencent.cos.xml.model.object.UploadPartCopyRequest;
import com.tencent.cos.xml.model.object.UploadPartCopyResult;
import com.tencent.cos.xml.transfer.UploadService;
import java.util.LinkedHashMap;
import java.util.Map;

@Deprecated
/* loaded from: classes7.dex */
public class CopyObjectService {
    private CosXmlService cosXmlService;
    private String sourceCustomerKey;
    private String sourceCustomerKeyId;
    private String sourceJsonContent;
    private long maxSliceSize = 5242880;
    private UploadService.EncryptionType encryptionType = UploadService.EncryptionType.NONE;

    /* renamed from: com.tencent.cos.xml.transfer.CopyObjectService$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$tencent$cos$xml$transfer$UploadService$EncryptionType;

        static {
            int[] iArr = new int[UploadService.EncryptionType.values().length];
            $SwitchMap$com$tencent$cos$xml$transfer$UploadService$EncryptionType = iArr;
            try {
                iArr[UploadService.EncryptionType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tencent$cos$xml$transfer$UploadService$EncryptionType[UploadService.EncryptionType.SSEC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tencent$cos$xml$transfer$UploadService$EncryptionType[UploadService.EncryptionType.SSEKMS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class CopyServerResult extends CosXmlResult {
        public String eTag;
    }

    public CopyObjectService(CosXmlService cosXmlService) {
        this.cosXmlService = cosXmlService;
    }

    private CompleteMultiUploadResult completeMultipart(String str, String str2, String str3, Map<Integer, String> map) throws CosXmlServiceException, CosXmlClientException {
        return this.cosXmlService.completeMultiUpload(new CompleteMultiUploadRequest(str, str2, str3, map));
    }

    private CompleteMultiUploadResult copyObjectForLargeFile(String str, String str2, CopyObjectRequest.CopySourceStruct copySourceStruct, long j4) throws CosXmlClientException, CosXmlServiceException {
        String initMultiUpload = initMultiUpload(str, str2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long j5 = this.maxSliceSize;
        long j6 = -1;
        int i4 = 1;
        while (true) {
            long j7 = j4 - 1;
            if (j6 >= j7) {
                return completeMultipart(str, str2, initMultiUpload, linkedHashMap);
            }
            long j10 = j6 + 1;
            long j11 = j6 + j5;
            long j12 = j11 >= j7 ? j7 : j11;
            linkedHashMap.put(Integer.valueOf(i4), copyObjectForLargeFile(str, str2, i4, initMultiUpload, copySourceStruct, j10, j12).copyObject.eTag);
            i4++;
            j6 = j12;
        }
    }

    private CopyObjectResult copyObjectForSmallFile(String str, String str2, CopyObjectRequest.CopySourceStruct copySourceStruct) throws CosXmlServiceException, CosXmlClientException {
        CopyObjectRequest copyObjectRequest = new CopyObjectRequest(str, str2, copySourceStruct);
        setCopySourceEncryptionRequest(copyObjectRequest);
        return this.cosXmlService.copyObject(copyObjectRequest);
    }

    private long headObject(String str, String str2) throws CosXmlServiceException, CosXmlClientException {
        HeadObjectRequest headObjectRequest = new HeadObjectRequest(str, str2);
        setCopySourceEncryptionRequest(headObjectRequest);
        HeadObjectResult headObject = this.cosXmlService.headObject(headObjectRequest);
        if (headObject != null) {
            return Long.valueOf(headObject.headers.get(ProtectedSandApp.s("侟\u0001")).get(0)).longValue();
        }
        return -1L;
    }

    private String initMultiUpload(String str, String str2) throws CosXmlServiceException, CosXmlClientException {
        return this.cosXmlService.initMultipartUpload(new InitMultipartUploadRequest(str, str2)).initMultipartUpload.uploadId;
    }

    private void setCopySourceEncryptionRequest(CosXmlRequest cosXmlRequest) throws CosXmlClientException {
        if (cosXmlRequest == null) {
            return;
        }
        int i4 = AnonymousClass1.$SwitchMap$com$tencent$cos$xml$transfer$UploadService$EncryptionType[this.encryptionType.ordinal()];
        if (i4 == 2) {
            if (cosXmlRequest instanceof HeadObjectRequest) {
                ((HeadObjectRequest) cosXmlRequest).setCOSServerSideEncryptionWithCustomerKey(this.sourceCustomerKey);
                return;
            } else {
                if (cosXmlRequest instanceof CopyObjectRequest) {
                    ((CopyObjectRequest) cosXmlRequest).setCopySourceServerSideEncryptionCustomerKey(this.sourceCustomerKey);
                    return;
                }
                return;
            }
        }
        if (i4 != 3) {
            return;
        }
        if (cosXmlRequest instanceof HeadObjectRequest) {
            ((HeadObjectRequest) cosXmlRequest).setCOSServerSideEncryptionWithKMS(this.sourceCustomerKeyId, this.sourceJsonContent);
        } else if (cosXmlRequest instanceof CopyObjectRequest) {
            ((CopyObjectRequest) cosXmlRequest).setCopySourceServerSideEncryptionKMS(this.sourceCustomerKeyId, this.sourceJsonContent);
        }
    }

    public CosXmlResult copyObject(String str, String str2, CopyObjectRequest.CopySourceStruct copySourceStruct) throws CosXmlClientException, CosXmlServiceException {
        CopyServerResult copyServerResult = new CopyServerResult();
        long headObject = headObject(copySourceStruct.bucket, copySourceStruct.cosPath);
        if (headObject >= this.maxSliceSize) {
            CompleteMultiUploadResult copyObjectForLargeFile = copyObjectForLargeFile(str, str2, copySourceStruct, headObject);
            copyServerResult.headers = copyObjectForLargeFile.headers;
            copyServerResult.httpCode = copyObjectForLargeFile.httpCode;
            copyServerResult.httpMessage = copyObjectForLargeFile.httpMessage;
            copyServerResult.accessUrl = copyObjectForLargeFile.accessUrl;
            copyServerResult.eTag = copyObjectForLargeFile.completeMultipartUpload.eTag;
        } else {
            CopyObjectResult copyObjectForSmallFile = copyObjectForSmallFile(str, str2, copySourceStruct);
            copyServerResult.headers = copyObjectForSmallFile.headers;
            copyServerResult.httpCode = copyObjectForSmallFile.httpCode;
            copyServerResult.httpMessage = copyObjectForSmallFile.httpMessage;
            copyServerResult.accessUrl = copyObjectForSmallFile.accessUrl;
            copyServerResult.eTag = copyObjectForSmallFile.copyObject.eTag;
        }
        return copyServerResult;
    }

    public void setCopySourceCustomerKey(String str) {
        this.encryptionType = UploadService.EncryptionType.SSEC;
        this.sourceCustomerKey = str;
    }

    public void setCopySourceCustomerKeyIdAndJsonContent(String str, String str2) {
        this.sourceCustomerKeyId = str;
        this.sourceJsonContent = str2;
        this.encryptionType = UploadService.EncryptionType.SSEKMS;
    }

    private UploadPartCopyResult copyObjectForLargeFile(String str, String str2, int i4, String str3, CopyObjectRequest.CopySourceStruct copySourceStruct, long j4, long j5) throws CosXmlServiceException, CosXmlClientException {
        UploadPartCopyRequest uploadPartCopyRequest = new UploadPartCopyRequest(str, str2, i4, str3, copySourceStruct, j4, j5);
        setCopySourceEncryptionRequest(uploadPartCopyRequest);
        return this.cosXmlService.copyObject(uploadPartCopyRequest);
    }

    public CosXmlResult copyObject(String str, String str2, CopyObjectRequest.CopySourceStruct copySourceStruct, long j4) throws CosXmlClientException, CosXmlServiceException {
        if (j4 >= this.maxSliceSize) {
            return copyObjectForLargeFile(str, str2, copySourceStruct, j4);
        }
        return copyObjectForSmallFile(str, str2, copySourceStruct);
    }
}
