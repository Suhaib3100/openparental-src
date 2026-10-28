package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.common.AudioConfig;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.TO, name = "Request")
/* loaded from: classes7.dex */
public class UpdateVoiceSeparateTemplete {
    public AudioConfig audioConfig;
    public String audioMode;
    public String name;
    public String tag = ProtectedSandApp.s("㼎\u0001");
}
