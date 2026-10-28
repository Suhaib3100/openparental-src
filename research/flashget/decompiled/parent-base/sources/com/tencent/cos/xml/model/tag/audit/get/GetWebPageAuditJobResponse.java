package com.tencent.cos.xml.model.tag.audit.get;

import com.tencent.cos.xml.model.tag.audit.bean.AuditJobsDetail;
import com.tencent.cos.xml.model.tag.audit.bean.ImageAuditScenarioInfo;
import com.tencent.cos.xml.model.tag.audit.bean.TextAuditScenarioInfo;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class GetWebPageAuditJobResponse {
    public WebPageAuditJobsDetail jobsDetail;
    public String requestId;

    @XmlBean(method = XmlBean.GenerateMethod.FROM)
    public static class ImageResult {
        public ImageAuditScenarioInfo adsInfo;
        public String label;
        public ImageAuditScenarioInfo politicsInfo;
        public ImageAuditScenarioInfo pornInfo;
        public int suggestion;
        public ImageAuditScenarioInfo terrorismInfo;
        public String text;
        public String url;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM)
    public static class ImageResults {

        @XmlElement(flatListNote = true)
        public List<ImageResult> results;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM)
    public static class Labels {
        public WebPageAuditScenarioInfo adsInfo;
        public WebPageAuditScenarioInfo politicsInfo;
        public WebPageAuditScenarioInfo pornInfo;
        public WebPageAuditScenarioInfo terrorismInfo;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM)
    public static class TextResult {
        public TextAuditScenarioInfo adsInfo;
        public String label;
        public TextAuditScenarioInfo politicsInfo;
        public TextAuditScenarioInfo pornInfo;
        public int suggestion;
        public TextAuditScenarioInfo terrorismInfo;
        public String text;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM)
    public static class TextResults {

        @XmlElement(flatListNote = true)
        public List<TextResult> results;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "JobsDetail")
    public static class WebPageAuditJobsDetail extends AuditJobsDetail {
        public String highlightHtml;
        public ImageResults imageResults;
        public Labels labels;
        public int pageCount;
        public int suggestion;
        public TextResults textResults;
        public String url;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM)
    public static class WebPageAuditScenarioInfo {
        public int hitFlag;
        public int score;
    }
}
