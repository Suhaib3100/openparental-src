package com.tencent.cos.xml.model.ci.asr;

import android.text.TextUtils;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.bucket.BucketRequest;
import com.tencent.cos.xml.model.ci.asr.bean.CreateSpeechJobs;
import com.tencent.cos.xml.model.ci.asr.bean.SpeechRecognition;
import com.tencent.cos.xml.model.tag.CallBackMqConfig;
import com.tencent.cos.xml.model.tag.Locator;
import com.tencent.cos.xml.utils.QCloudXmlUtils;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class CreateSpeechJobsRequest extends BucketRequest {
    private final CreateSpeechJobs createSpeechJobs;

    public CreateSpeechJobsRequest(@o0 String str) {
        super(str);
        this.createSpeechJobs = new CreateSpeechJobs();
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public void checkParameters() throws CosXmlClientException {
        super.checkParameters();
        if (TextUtils.isEmpty(this.createSpeechJobs.input.object)) {
            TextUtils.isEmpty(this.createSpeechJobs.input.url);
        }
        if (!TextUtils.isEmpty(this.createSpeechJobs.operation.output.region) && !TextUtils.isEmpty(this.createSpeechJobs.operation.output.bucket)) {
            TextUtils.isEmpty(this.createSpeechJobs.operation.output.object);
        }
        TextUtils.isEmpty(this.createSpeechJobs.operation.speechRecognition.engineModelType);
        SpeechRecognition speechRecognition = this.createSpeechJobs.operation.speechRecognition;
        int i4 = speechRecognition.channelNum;
        int i5 = speechRecognition.resTextFormat;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("㾲\u0001");
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return ProtectedSandApp.s("㾳\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getRequestHost(CosXmlServiceConfig cosXmlServiceConfig) {
        return cosXmlServiceConfig.getRequestHost(this.region, this.bucket, ProtectedSandApp.s("㾴\u0001"));
    }

    public void setCallBack(@o0 String str) {
        this.createSpeechJobs.callBack = str;
    }

    public void setCallBackFormat(@o0 String str) {
        this.createSpeechJobs.callBackFormat = str;
    }

    public void setCallBackMqConfig(@o0 CallBackMqConfig callBackMqConfig) {
        this.createSpeechJobs.callBackMqConfig = callBackMqConfig;
    }

    public void setCallBackType(@o0 String str) {
        this.createSpeechJobs.callBackType = str;
    }

    public void setChannelNum(int i4) {
        this.createSpeechJobs.operation.speechRecognition.channelNum = i4;
    }

    public void setConvertNumMode(int i4) {
        this.createSpeechJobs.operation.speechRecognition.convertNumMode = i4;
    }

    public void setEngineModelType(@o0 String str) {
        this.createSpeechJobs.operation.speechRecognition.engineModelType = str;
    }

    public void setFilterDirty(int i4) {
        this.createSpeechJobs.operation.speechRecognition.filterDirty = i4;
    }

    public void setFilterModal(int i4) {
        this.createSpeechJobs.operation.speechRecognition.filterModal = i4;
    }

    public void setFilterPunc(int i4) {
        this.createSpeechJobs.operation.speechRecognition.filterPunc = i4;
    }

    public void setFirstChannelOnly(int i4) {
        this.createSpeechJobs.operation.speechRecognition.firstChannelOnly = i4;
    }

    public void setFlashAsr(boolean z4) {
        this.createSpeechJobs.operation.speechRecognition.flashAsr = z4;
    }

    public void setFormat(String str) {
        this.createSpeechJobs.operation.speechRecognition.format = str;
    }

    public void setInputObject(@o0 String str) {
        this.createSpeechJobs.input.object = str;
    }

    public void setInputUrl(@o0 String str) {
        this.createSpeechJobs.input.url = str;
    }

    public void setJobLevel(int i4) {
        this.createSpeechJobs.operation.jobLevel = i4;
    }

    public void setOutput(@o0 String str, @o0 String str2, @o0 String str3) {
        Locator locator = this.createSpeechJobs.operation.output;
        locator.region = str;
        locator.bucket = str2;
        locator.object = str3;
    }

    public void setOutputFileType(String str) {
        this.createSpeechJobs.operation.speechRecognition.outputFileType = str;
    }

    public void setQueueId(@o0 String str) {
        this.createSpeechJobs.queueId = str;
    }

    public void setResTextFormat(int i4) {
        this.createSpeechJobs.operation.speechRecognition.resTextFormat = i4;
    }

    public void setSpeakerDiarization(int i4) {
        this.createSpeechJobs.operation.speechRecognition.speakerDiarization = i4;
    }

    public void setSpeakerNumber(int i4) {
        this.createSpeechJobs.operation.speechRecognition.speakerNumber = i4;
    }

    public void setTemplateId(String str) {
        this.createSpeechJobs.operation.templateId = str;
    }

    public void setUserData(@o0 String str) {
        this.createSpeechJobs.operation.userData = str;
    }

    public void setWordInfo(int i4) {
        this.createSpeechJobs.operation.speechRecognition.wordInfo = i4;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    protected RequestBodySerializer xmlBuilder() throws XmlPullParserException, IOException, CosXmlClientException {
        return RequestBodySerializer.bytes(ProtectedSandApp.s("㾶\u0001"), QCloudXmlUtils.toXml(this.createSpeechJobs).getBytes(ProtectedSandApp.s("㾵\u0001")));
    }
}
