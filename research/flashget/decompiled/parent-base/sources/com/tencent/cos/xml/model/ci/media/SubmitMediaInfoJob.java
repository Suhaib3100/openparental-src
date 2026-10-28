package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.tag.CallBackMqConfig;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.TO, name = "Request")
/* loaded from: classes7.dex */
public class SubmitMediaInfoJob {
    public String callBack;
    public String callBackFormat;
    public CallBackMqConfig callBackMqConfig;
    public String callBackType;
    public SubmitMediaInfoJobInput input;
    public SubmitMediaInfoJobOperation operation;
    public String tag = ProtectedSandApp.s("䑮\u0001");

    @XmlBean(method = XmlBean.GenerateMethod.TO, name = "Input")
    public static class SubmitMediaInfoJobInput {
        public String object;
    }

    @XmlBean(method = XmlBean.GenerateMethod.TO, name = "Operation")
    public static class SubmitMediaInfoJobOperation {
        public String jobLevel;
        public String userData;
    }
}
