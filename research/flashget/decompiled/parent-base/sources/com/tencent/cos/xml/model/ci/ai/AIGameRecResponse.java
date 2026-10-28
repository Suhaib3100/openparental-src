package com.tencent.cos.xml.model.ci.ai;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class AIGameRecResponse {
    public AIGameRecResponseGameLabels gameLabels;

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "GameLabels")
    public static class AIGameRecResponseGameLabels {
        public int confidence;
        public String firstCategory;
        public String gameName;
        public String secondCategory;
    }
}
