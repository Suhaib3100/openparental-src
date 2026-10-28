package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.media.TemplateAnimation;
import com.tencent.cos.xml.model.tag.CallBackMqConfig;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.TO, name = "Request")
/* loaded from: classes7.dex */
public class SubmitAnimationJob {
    public String callBack;
    public String callBackFormat;
    public CallBackMqConfig callBackMqConfig;
    public String callBackType;
    public SubmitAnimationJobInput input;
    public SubmitAnimationJobOperation operation;
    public String tag = ProtectedSandApp.s("䍼\u0001");

    @XmlBean(name = "Animation")
    public static class SubmitAnimationJobAnimation {
        public TemplateAnimation.TemplateAnimationContainer container;
        public TemplateAnimation.TemplateAnimationTimeInterval timeInterval;
        public TemplateAnimation.TemplateAnimationVideo video;
    }

    @XmlBean(method = XmlBean.GenerateMethod.TO, name = "Input")
    public static class SubmitAnimationJobInput {
        public String object;
    }

    @XmlBean(method = XmlBean.GenerateMethod.TO, name = "Operation")
    public static class SubmitAnimationJobOperation {
        public SubmitAnimationJobAnimation animation;
        public String jobLevel;
        public SubmitAnimationJobOutput output;
        public String templateId;
        public String userData;
    }

    @XmlBean(name = "Output")
    public static class SubmitAnimationJobOutput {
        public String bucket;
        public String object;
        public String region;
    }
}
