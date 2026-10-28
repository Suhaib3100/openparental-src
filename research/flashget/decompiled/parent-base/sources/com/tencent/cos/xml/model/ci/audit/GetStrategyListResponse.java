package com.tencent.cos.xml.model.ci.audit;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class GetStrategyListResponse {
    public String requestId;

    @XmlElement(flatListNote = true, ignoreListNote = true)
    public List<Strategies> strategies;
    public int totalCount;

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Strategies")
    public static class Strategies {
        public String bizType;
        public String createTime;
        public String isDefault;
        public String name;
        public String service;
    }
}
