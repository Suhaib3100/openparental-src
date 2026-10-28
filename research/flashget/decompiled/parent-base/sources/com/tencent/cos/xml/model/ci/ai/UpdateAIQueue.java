package com.tencent.cos.xml.model.ci.ai;

import com.tencent.cos.xml.model.ci.common.NotifyConfig;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.TO, name = "Request")
/* loaded from: classes7.dex */
public class UpdateAIQueue {
    public String name;
    public NotifyConfig notifyConfig;
    public String state;
}
