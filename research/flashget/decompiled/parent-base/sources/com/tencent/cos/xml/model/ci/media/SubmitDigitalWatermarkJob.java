package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.common.DigitalWatermark;
import com.tencent.cos.xml.model.tag.CallBackMqConfig;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.TO, name = "Request")
/* loaded from: classes7.dex */
public class SubmitDigitalWatermarkJob {
    public String callBack;
    public String callBackFormat;
    public CallBackMqConfig callBackMqConfig;
    public String callBackType;
    public SubmitDigitalWatermarkJobInput input;
    public SubmitDigitalWatermarkJobOperation operation;
    public String tag = ProtectedSandApp.s("䐆\u0001");

    @XmlBean(method = XmlBean.GenerateMethod.TO, name = "Input")
    public static class SubmitDigitalWatermarkJobInput {
        public String object;
    }

    @XmlBean(method = XmlBean.GenerateMethod.TO, name = "Operation")
    public static class SubmitDigitalWatermarkJobOperation {
        public DigitalWatermark digitalWatermark;
        public String jobLevel;
        public SubmitDigitalWatermarkJobOutput output;
        public String userData;
    }

    @XmlBean(name = "Output")
    public static class SubmitDigitalWatermarkJobOutput {
        public String bucket;
        public String object;
        public String region;
    }
}
