package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.media.TemplateSmartCover;
import com.tencent.cos.xml.model.tag.CallBackMqConfig;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.TO, name = "Request")
/* loaded from: classes7.dex */
public class SubmitSmartCoverJob {
    public String callBack;
    public String callBackFormat;
    public CallBackMqConfig callBackMqConfig;
    public String callBackType;
    public SubmitSmartCoverJobInput input;
    public SubmitSmartCoverJobOperation operation;
    public String tag = ProtectedSandApp.s("䔜\u0001");

    @XmlBean(method = XmlBean.GenerateMethod.TO, name = "Input")
    public static class SubmitSmartCoverJobInput {
        public String object;
    }

    @XmlBean(method = XmlBean.GenerateMethod.TO, name = "Operation")
    public static class SubmitSmartCoverJobOperation {
        public String jobLevel;
        public SubmitSmartCoverJobOutput output;
        public TemplateSmartCover.TemplateSmartCoverSmartCover smartCover;
        public String templateId;
        public String userData;
    }

    @XmlBean(name = "Output")
    public static class SubmitSmartCoverJobOutput {
        public String bucket;
        public String object;
        public String region;
    }
}
