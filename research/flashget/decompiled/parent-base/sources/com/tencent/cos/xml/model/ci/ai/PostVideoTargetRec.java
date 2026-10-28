package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.common.CallBackMqConfig;
import com.tencent.cos.xml.model.ci.common.VideoTargetRec;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.TO, name = "Request")
/* loaded from: classes7.dex */
public class PostVideoTargetRec {
    public String callBack;
    public String callBackFormat;
    public CallBackMqConfig callBackMqConfig;
    public String callBackType;
    public PostVideoTargetRecInput input;
    public PostVideoTargetRecOperation operation;
    public String tag = ProtectedSandApp.s("㷦\u0001");

    @XmlBean(method = XmlBean.GenerateMethod.TO, name = "Input")
    public static class PostVideoTargetRecInput {
        public String object;
    }

    @XmlBean(method = XmlBean.GenerateMethod.TO, name = "Operation")
    public static class PostVideoTargetRecOperation {
        public String jobLevel;
        public String templateId;
        public String userData;
        public VideoTargetRec videoTargetRec;
    }
}
