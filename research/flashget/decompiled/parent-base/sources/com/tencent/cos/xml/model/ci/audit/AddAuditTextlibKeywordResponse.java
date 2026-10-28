package com.tencent.cos.xml.model.ci.audit;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class AddAuditTextlibKeywordResponse {
    public String requestId;

    @XmlElement(flatListNote = true, ignoreListNote = true)
    public List<Results> results;

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Results")
    public static class Results {
        public String code;
        public String content;
        public String errMsg;
        public String keywordID;
        public String label;
        public String remark;
    }
}
