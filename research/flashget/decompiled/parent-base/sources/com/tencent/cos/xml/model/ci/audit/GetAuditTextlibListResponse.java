package com.tencent.cos.xml.model.ci.audit;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class GetAuditTextlibListResponse {

    @XmlElement(flatListNote = true, ignoreListNote = true)
    public List<Libs> libs;
    public String requestId;
    public int totalCount;

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Libs")
    public static class Libs {
        public String createTime;
        public String libID;
        public String libName;
        public String matchType;

        @XmlElement(flatListNote = true, ignoreListNote = true)
        public List<Strategies> strategies;
        public String suggestion;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Strategies")
    public static class Strategies {
        public String bizType;
        public String bucket;
        public String service;
    }
}
