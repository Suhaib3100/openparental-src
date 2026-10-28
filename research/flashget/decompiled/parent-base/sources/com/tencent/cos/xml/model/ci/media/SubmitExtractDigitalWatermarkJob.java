package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.tag.CallBackMqConfig;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.TO, name = "Request")
/* loaded from: classes7.dex */
public class SubmitExtractDigitalWatermarkJob {
    public String callBack;
    public String callBackFormat;
    public CallBackMqConfig callBackMqConfig;
    public String callBackType;
    public SubmitExtractDigitalWatermarkJobInput input;
    public SubmitExtractDigitalWatermarkJobOperation operation;
    public String tag = ProtectedSandApp.s("䐾\u0001");

    @XmlBean(method = XmlBean.GenerateMethod.TO, name = "ExtractDigitalWatermark")
    public static class SubmitExtractDigitalWatermarkJobExtractDigitalWatermark {
        public String type = ProtectedSandApp.s("䐶\u0001");
        public String version = ProtectedSandApp.s("䐷\u0001");
    }

    @XmlBean(method = XmlBean.GenerateMethod.TO, name = "Input")
    public static class SubmitExtractDigitalWatermarkJobInput {
        public String object;
    }

    @XmlBean(method = XmlBean.GenerateMethod.TO, name = "Operation")
    public static class SubmitExtractDigitalWatermarkJobOperation {
        public SubmitExtractDigitalWatermarkJobExtractDigitalWatermark extractDigitalWatermark;
        public String jobLevel;
        public String userData;
    }
}
