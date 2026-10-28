package com.tencent.cos.xml.model.ci.audit;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean(method = XmlBean.GenerateMethod.TO, name = "Request")
/* loaded from: classes7.dex */
public class AddAuditTextlibKeyword {

    @XmlElement(flatListNote = true, ignoreListNote = true)
    public List<Keywords> keywords;

    @XmlBean(method = XmlBean.GenerateMethod.TO, name = "Keywords")
    public static class Keywords {
        public String content;
        public String label;
        public String remark;
    }
}
