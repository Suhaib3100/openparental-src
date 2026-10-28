package com.tencent.cos.xml.model.tag.audit.get;

import com.tencent.cos.xml.model.tag.audit.bean.AuditJobsDetail;
import com.tencent.cos.xml.model.tag.audit.bean.AuditScenarioInfo;
import com.tencent.cos.xml.model.tag.audit.bean.ImageAuditScenarioInfo;
import com.tencent.cos.xml.model.tag.audit.get.GetAudioAuditJobResponse;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class GetVideoAuditJobResponse {
    public VideoAuditJobsDetail jobsDetail;
    public String requestId;

    @XmlBean(method = XmlBean.GenerateMethod.FROM)
    public static class Snapshot {
        public SnapshotAuditScenarioInfo adsInfo;
        public SnapshotAuditScenarioInfo politicsInfo;
        public SnapshotAuditScenarioInfo pornInfo;
        public int snapshotTime;
        public SnapshotAuditScenarioInfo terrorismInfo;
        public String text;
        public String url;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM)
    public static class SnapshotAuditScenarioInfo extends ImageAuditScenarioInfo {
        public String label;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM)
    public static class VideoAuditJobsDetail extends AuditJobsDetail {
        public AuditScenarioInfo adsInfo;

        @XmlElement(flatListNote = true)
        public List<GetAudioAuditJobResponse.AudioSection> audioSection;
        public String object;
        public AuditScenarioInfo politicsInfo;
        public AuditScenarioInfo pornInfo;

        @XmlElement(flatListNote = true)
        public List<Snapshot> snapshot;
        public String snapshotCount;
        public AuditScenarioInfo terrorismInfo;
        public String url;
    }
}
