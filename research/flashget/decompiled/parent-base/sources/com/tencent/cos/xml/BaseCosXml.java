package com.tencent.cos.xml;

import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.listener.CosXmlResultListener;
import com.tencent.cos.xml.model.CosXmlRequest;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.cos.xml.model.object.BasePutObjectRequest;
import com.tencent.cos.xml.model.object.BasePutObjectResult;
import com.tencent.cos.xml.model.object.GetObjectBytesRequest;
import com.tencent.cos.xml.model.object.GetObjectRequest;
import com.tencent.cos.xml.model.object.GetObjectResult;
import com.tencent.cos.xml.model.object.UploadPartRequest;
import com.tencent.cos.xml.model.object.UploadPartResult;

/* loaded from: classes6.dex */
public interface BaseCosXml {
    BasePutObjectResult basePutObject(BasePutObjectRequest basePutObjectRequest) throws CosXmlClientException, CosXmlServiceException;

    void basePutObjectAsync(BasePutObjectRequest basePutObjectRequest, CosXmlResultListener cosXmlResultListener);

    void cancel(CosXmlRequest cosXmlRequest);

    void cancel(CosXmlRequest cosXmlRequest, boolean z4);

    void cancelAll();

    <T1 extends CosXmlRequest, T2 extends CosXmlResult> T2 commonInterface(T1 t12, Class<T2> cls) throws CosXmlClientException, CosXmlServiceException;

    <T1 extends CosXmlRequest, T2 extends CosXmlResult> void commonInterfaceAsync(T1 t12, Class<T2> cls, CosXmlResultListener cosXmlResultListener);

    GetObjectResult getObject(GetObjectRequest getObjectRequest) throws CosXmlClientException, CosXmlServiceException;

    byte[] getObject(GetObjectBytesRequest getObjectBytesRequest) throws CosXmlClientException, CosXmlServiceException;

    byte[] getObject(String str, String str2) throws CosXmlClientException, CosXmlServiceException;

    void getObjectAsync(GetObjectRequest getObjectRequest, CosXmlResultListener cosXmlResultListener);

    String getObjectUrl(String str, String str2, String str3);

    void release();

    UploadPartResult uploadPart(UploadPartRequest uploadPartRequest) throws CosXmlClientException, CosXmlServiceException;

    void uploadPartAsync(UploadPartRequest uploadPartRequest, CosXmlResultListener cosXmlResultListener);
}
