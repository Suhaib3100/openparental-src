package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.common.SpeechRecognition;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.TO, name = "Request")
/* loaded from: classes7.dex */
public class PostSpeechRecognitionTemplete {
    public String name;
    public SpeechRecognition speechRecognition;
    public String tag = ProtectedSandApp.s("㶍\u0001");
}
