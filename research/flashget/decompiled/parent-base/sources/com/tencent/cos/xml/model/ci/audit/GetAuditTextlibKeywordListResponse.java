package com.tencent.cos.xml.model.ci.audit;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class GetAuditTextlibKeywordListResponse {

    @XmlElement(flatListNote = true, ignoreListNote = true)
    public List<Keywords> keywords;
    public String requestId;
    public int totalCount;

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Keywords")
    public static class Keywords {
        public String content;
        public String createTime;
        public String keywordID;
        public String label;
        public String remark;
    }
}
