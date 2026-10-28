package com.tencent.cos.xml.model.ci.ai;

import android.text.TextUtils;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.bucket.BucketRequest;
import com.tencent.cos.xml.model.ci.ai.bean.CreateWordsGeneralizeJob;
import com.tencent.cos.xml.utils.QCloudXmlUtils;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class CreateWordsGeneralizeJobRequest extends BucketRequest {
    private final CreateWordsGeneralizeJob createWordsGeneralizeJob;

    public CreateWordsGeneralizeJobRequest(@o0 String str) {
        super(str);
        this.createWordsGeneralizeJob = new CreateWordsGeneralizeJob();
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public void checkParameters() throws CosXmlClientException {
        super.checkParameters();
        if (TextUtils.isEmpty(this.createWordsGeneralizeJob.input.object)) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), ProtectedSandApp.s("㰞\u0001"));
        }
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("㰟\u0001");
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return ProtectedSandApp.s("㰠\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getRequestHost(CosXmlServiceConfig cosXmlServiceConfig) {
        return cosXmlServiceConfig.getRequestHost(this.region, this.bucket, ProtectedSandApp.s("㰡\u0001"));
    }

    public void setCallBack(@o0 String str) {
        this.createWordsGeneralizeJob.callBack = str;
    }

    public void setCallBackFormat(@o0 String str) {
        this.createWordsGeneralizeJob.callBackFormat = str;
    }

    public void setInputObject(@o0 String str) {
        this.createWordsGeneralizeJob.input.object = str;
    }

    public void setJobLevel(int i4) {
        this.createWordsGeneralizeJob.operation.jobLevel = i4;
    }

    public void setNerMethod(@o0 String str) {
        this.createWordsGeneralizeJob.operation.wordsGeneralize.nerMethod = str;
    }

    public void setQueueId(@o0 String str) {
        this.createWordsGeneralizeJob.queueId = str;
    }

    public void setSegMethod(@o0 String str) {
        this.createWordsGeneralizeJob.operation.wordsGeneralize.segMethod = str;
    }

    public void setUserData(@o0 String str) {
        this.createWordsGeneralizeJob.operation.userData = str;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    protected RequestBodySerializer xmlBuilder() throws XmlPullParserException, IOException, CosXmlClientException {
        return RequestBodySerializer.bytes(ProtectedSandApp.s("㰣\u0001"), QCloudXmlUtils.toXml(this.createWordsGeneralizeJob).getBytes(ProtectedSandApp.s("㰢\u0001")));
    }
}
