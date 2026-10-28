package com.tencent.cos.xml.model.tag.audit.get;

import com.tencent.cos.xml.model.tag.audit.bean.AuditJobsDetail;
import com.tencent.cos.xml.model.tag.audit.bean.AuditScenarioInfo;
import com.tencent.cos.xml.model.tag.audit.bean.AuditSection;
import com.tencent.cos.xml.model.tag.audit.bean.TextAuditScenarioInfo;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class TextAuditJobResponse {
    public TextAuditJobsDetail jobsDetail;
    public String requestId;

    @XmlBean(method = XmlBean.GenerateMethod.FROM)
    public static class Section extends AuditSection {
        public TextAuditScenarioInfo abuseInfo;
        public TextAuditScenarioInfo illegalInfo;
        public String label;
        public int result;
        public int startByte;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "JobsDetail")
    public static class TextAuditJobsDetail extends AuditJobsDetail {
        public AuditScenarioInfo abuseInfo;
        public AuditScenarioInfo adsInfo;
        public String content;
        public AuditScenarioInfo illegalInfo;
        public AuditScenarioInfo politicsInfo;
        public AuditScenarioInfo pornInfo;

        @XmlElement(flatListNote = true)
        public List<Section> section;
        public int sectionCount;
        public AuditScenarioInfo terrorismInfo;
    }
}
