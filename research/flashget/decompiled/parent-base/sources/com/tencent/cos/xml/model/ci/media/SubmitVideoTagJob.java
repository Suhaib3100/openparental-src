package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.tag.CallBackMqConfig;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.TO, name = "Request")
/* loaded from: classes7.dex */
public class SubmitVideoTagJob {
    public String callBack;
    public String callBackFormat;
    public CallBackMqConfig callBackMqConfig;
    public String callBackType;
    public SubmitVideoTagJobInput input;
    public SubmitVideoTagJobOperation operation;
    public String tag = ProtectedSandApp.s("䘴\u0001");

    @XmlBean(method = XmlBean.GenerateMethod.TO, name = "Input")
    public static class SubmitVideoTagJobInput {
        public String object;
    }

    @XmlBean(method = XmlBean.GenerateMethod.TO, name = "Operation")
    public static class SubmitVideoTagJobOperation {
        public String jobLevel;
        public String userData;
        public OperationVideoTag videoTag;
    }
}
