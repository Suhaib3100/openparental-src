package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.TO, name = "Request")
/* loaded from: classes7.dex */
public class UpdateVoiceSynthesisTemplete {
    public String codec;
    public String emotion;
    public String mode;
    public String name;
    public String speed;
    public String tag = ProtectedSandApp.s("㼡\u0001");
    public String voiceType;
    public String volume;
}
