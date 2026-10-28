package com.tencent.cos.xml.model.ci.asr.bean;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.tag.CallBackMqConfig;
import com.tencent.cos.xml.model.tag.Locator;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.TO, name = "Request")
/* loaded from: classes7.dex */
public class CreateSpeechJobs {
    public String callBack;
    public String callBackFormat;
    public String callBackType;
    public String queueId;
    public String tag = ProtectedSandApp.s("㿡\u0001");
    public CreateSpeechJobsInput input = new CreateSpeechJobsInput();
    public CreateSpeechJobsOperation operation = new CreateSpeechJobsOperation();
    public CallBackMqConfig callBackMqConfig = new CallBackMqConfig();

    @XmlBean(method = XmlBean.GenerateMethod.TO)
    public static class CreateSpeechJobsInput {
        public String object;
        public String url;
    }

    @XmlBean(method = XmlBean.GenerateMethod.TO, name = "Operation")
    public static class CreateSpeechJobsOperation {
        public int jobLevel;
        public String templateId;
        public String userData;
        public SpeechRecognition speechRecognition = new SpeechRecognition();
        public Locator output = new Locator();
    }
}
