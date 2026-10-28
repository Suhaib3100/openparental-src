package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.media.TemplateVoiceSeparate;
import com.tencent.cos.xml.model.tag.CallBackMqConfig;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.TO, name = "Request")
/* loaded from: classes7.dex */
public class SubmitVoiceSeparateJob {
    public String callBack;
    public String callBackFormat;
    public CallBackMqConfig callBackMqConfig;
    public String callBackType;
    public SubmitVoiceSeparateJobInput input;
    public SubmitVoiceSeparateJobOperation operation;
    public String tag = ProtectedSandApp.s("䚫\u0001");

    @XmlBean(method = XmlBean.GenerateMethod.TO, name = "Input")
    public static class SubmitVoiceSeparateJobInput {
        public String object;
    }

    @XmlBean(method = XmlBean.GenerateMethod.TO, name = "Operation")
    public static class SubmitVoiceSeparateJobOperation {
        public String jobLevel;
        public SubmitVoiceSeparateJobOutput output;
        public String templateId;
        public VoiceSeparate voiceSeparate;
    }

    @XmlBean(name = "Output")
    public static class SubmitVoiceSeparateJobOutput {
        public String auObject;
        public String bucket;
        public String object;
        public String region;
    }

    @XmlBean(name = "VoiceSeparate")
    public static class VoiceSeparate {
        public TemplateVoiceSeparate.AudioConfig audioConfig;
        public String audioMode;
    }
}
