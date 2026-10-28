package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.common.CallBackMqConfig;
import com.tencent.cos.xml.model.ci.common.NoiseReduction;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.TO, name = "Request")
/* loaded from: classes7.dex */
public class PostNoiseReduction {
    public String callBack;
    public String callBackFormat;
    public CallBackMqConfig callBackMqConfig;
    public String callBackType;
    public PostNoiseReductionInput input;
    public PostNoiseReductionOperation operation;
    public String tag = ProtectedSandApp.s("㳨\u0001");

    @XmlBean(method = XmlBean.GenerateMethod.TO, name = "Input")
    public static class PostNoiseReductionInput {
        public String object;
    }

    @XmlBean(method = XmlBean.GenerateMethod.TO, name = "Operation")
    public static class PostNoiseReductionOperation {
        public String jobLevel;
        public NoiseReduction noiseReduction;
        public PostNoiseReductionOutput output;
        public String templateId;
        public String userData;
    }

    @XmlBean(method = XmlBean.GenerateMethod.ALL, name = "Output")
    public static class PostNoiseReductionOutput {
        public String bucket;
        public String object;
        public String region;
    }
}
