package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.TO, name = "Request")
/* loaded from: classes7.dex */
public class PostTranslation {
    public String callBack;
    public String callBackFormat;
    public CallBackMqConfig callBackMqConfig;
    public String callBackType;
    public PostTranslationInput input;
    public PostTranslationOperation operation;
    public String tag = ProtectedSandApp.s("㶵\u0001");

    @XmlBean(method = XmlBean.GenerateMethod.TO, name = "CallBackMqConfig")
    public static class CallBackMqConfig {
        public String mqMode;
        public String mqName;
        public String mqRegion;
    }

    @XmlBean(method = XmlBean.GenerateMethod.ALL, name = "Input")
    public static class PostTranslationInput {
        public String basicType;
        public String lang;
        public String object;
        public String type;
    }

    @XmlBean(method = XmlBean.GenerateMethod.TO, name = "Operation")
    public static class PostTranslationOperation {
        public String jobLevel;
        public String noNeedOutput;
        public PostTranslationOutput output;
        public PostTranslationTranslation translation;
        public String userData;
    }

    @XmlBean(method = XmlBean.GenerateMethod.ALL, name = "Output")
    public static class PostTranslationOutput {
        public String bucket;
        public String object;
        public String region;
    }

    @XmlBean(method = XmlBean.GenerateMethod.ALL, name = "Translation")
    public static class PostTranslationTranslation {
        public String lang;
        public String type;
    }
}
