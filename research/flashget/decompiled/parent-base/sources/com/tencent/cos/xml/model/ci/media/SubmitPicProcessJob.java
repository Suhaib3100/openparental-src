package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.common.PicProcess;
import com.tencent.cos.xml.model.tag.CallBackMqConfig;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.TO, name = "Request")
/* loaded from: classes7.dex */
public class SubmitPicProcessJob {
    public String callBack;
    public String callBackFormat;
    public CallBackMqConfig callBackMqConfig;
    public String callBackType;
    public SubmitPicProcessJobInput input;
    public SubmitPicProcessJobOperation operation;
    public String tag = ProtectedSandApp.s("䓣\u0001");

    @XmlBean(method = XmlBean.GenerateMethod.TO, name = "Input")
    public static class SubmitPicProcessJobInput {
        public String object;
    }

    @XmlBean(method = XmlBean.GenerateMethod.TO, name = "Operation")
    public static class SubmitPicProcessJobOperation {
        public String jobLevel;
        public SubmitPicProcessJobOutput output;
        public PicProcess picProcess;
        public String templateId;
        public String userData;
    }

    @XmlBean(name = "Output")
    public static class SubmitPicProcessJobOutput {
        public String bucket;
        public String object;
        public String region;
    }
}
