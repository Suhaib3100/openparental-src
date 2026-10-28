package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.TO, name = "Request")
/* loaded from: classes7.dex */
public class VocalScore {
    public String callBack;
    public String callBackFormat;
    public CallBackMqConfig callBackMqConfig;
    public String callBackType;
    public VocalScoreInput input;
    public VocalScoreOperation operation;
    public String tag = ProtectedSandApp.s("㼿\u0001");

    @XmlBean(method = XmlBean.GenerateMethod.TO, name = "CallBackMqConfig")
    public static class CallBackMqConfig {
        public String mqMode;
        public String mqName;
        public String mqRegion;
    }

    @XmlBean(method = XmlBean.GenerateMethod.ALL, name = "Input")
    public static class VocalScoreInput {
        public String object;
    }

    @XmlBean(method = XmlBean.GenerateMethod.TO, name = "Operation")
    public static class VocalScoreOperation {
        public String jobLevel;
        public String userData;
        public VocalScoreVocalScore vocalScore;
    }

    @XmlBean(method = XmlBean.GenerateMethod.ALL, name = "Operation")
    public static class VocalScoreVocalScore {
        public String standardObject;
    }
}
