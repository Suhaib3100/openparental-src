package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.common.CallBackMqConfig;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.TO, name = "Request")
/* loaded from: classes7.dex */
public class PostSoundHound {
    public String callBack;
    public String callBackFormat;
    public CallBackMqConfig callBackMqConfig;
    public String callBackType;
    public PostSoundHoundInput input;
    public PostSoundHoundOperation operation;
    public String tag = ProtectedSandApp.s("㵦\u0001");

    @XmlBean(method = XmlBean.GenerateMethod.ALL, name = "Input")
    public static class PostSoundHoundInput {
        public String object;
    }

    @XmlBean(method = XmlBean.GenerateMethod.TO, name = "Operation")
    public static class PostSoundHoundOperation {
        public String jobLevel;
        public String userData;
    }
}
