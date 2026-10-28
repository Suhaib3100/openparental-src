package com.tencent.cos.xml.model.tag.audit.get;

import com.tencent.cos.xml.model.tag.audit.bean.AuditJobsDetail;
import com.tencent.cos.xml.model.tag.audit.bean.ImageAuditScenarioInfo;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class GetDocumentAuditJobResponse {
    public DocumentAuditJobsDetail jobsDetail;
    public String requestId;

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "JobsDetail")
    public static class DocumentAuditJobsDetail extends AuditJobsDetail {
        public Labels labels;
        public String object;
        public int pageCount;
        public PageSegment pageSegment;
        public int suggestion;
        public String url;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM)
    public static class DocumentAuditScenarioInfo {
        public int hitFlag;
        public int score;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM)
    public static class Labels {
        public DocumentAuditScenarioInfo adsInfo;
        public DocumentAuditScenarioInfo politicsInfo;
        public DocumentAuditScenarioInfo pornInfo;
        public DocumentAuditScenarioInfo terrorismInfo;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM)
    public static class PageSegment {

        @XmlElement(flatListNote = true)
        public List<Results> results;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM)
    public static class Results {
        public ImageAuditScenarioInfo adsInfo;
        public String label;
        public int pageNumber;
        public ImageAuditScenarioInfo politicsInfo;
        public ImageAuditScenarioInfo pornInfo;
        public int sheetNumber;
        public int suggestion;
        public ImageAuditScenarioInfo terrorismInfo;
        public String text;
        public String url;
    }
}
