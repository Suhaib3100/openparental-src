package com.tencent.cos.xml.model.ci.ai.bean;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.TO, name = "Request")
/* loaded from: classes7.dex */
public class CreateWordsGeneralizeJob {
    public String callBack;
    public String callBackFormat;
    public String queueId;
    public String tag = ProtectedSandApp.s("㽹\u0001");
    public WordsGeneralizeJobInput input = new WordsGeneralizeJobInput();
    public WordsGeneralizeJobOperation operation = new WordsGeneralizeJobOperation();
}
