package com.tencent.cos.xml.model.ci.audit;

import com.tencent.cos.xml.model.ci.audit.CreateStrategy;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class GetStrategyDetailResponse {
    public String requestId;
    public Strategy strategy;

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Strategy")
    public static class Strategy {
        public String bizType;
        public CreateStrategy.Labels labels;
        public String name;
        public String service;

        @XmlElement(flatListNote = true, ignoreListNote = true)
        public List<String> textLibs;
    }
}
