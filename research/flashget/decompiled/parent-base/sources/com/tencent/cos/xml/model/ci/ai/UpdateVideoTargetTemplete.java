package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.common.VideoTargetRec;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.TO, name = "Request")
/* loaded from: classes7.dex */
public class UpdateVideoTargetTemplete {
    public String name;
    public String tag = ProtectedSandApp.s("㻿\u0001");
    public VideoTargetRec videoTargetRec;
}
