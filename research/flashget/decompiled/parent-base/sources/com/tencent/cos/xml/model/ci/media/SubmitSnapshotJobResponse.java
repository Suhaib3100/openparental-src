package com.tencent.cos.xml.model.ci.media;

import com.tencent.cos.xml.model.ci.common.MediaResult;
import com.tencent.cos.xml.model.ci.media.SubmitSnapshotJob;
import com.tencent.cos.xml.model.ci.media.TemplateSnapshot;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class SubmitSnapshotJobResponse {
    public SubmitSnapshotJobResponseJobsDetail jobsDetail;

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Input")
    public static class SubmitSnapshotJobResponseInput {
        public String bucketId;
        public String object;
        public String region;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "JobsDetail")
    public static class SubmitSnapshotJobResponseJobsDetail {
        public String code;
        public String creationTime;
        public String endTime;
        public SubmitSnapshotJobResponseInput input;
        public String jobId;
        public String message;
        public SubmitSnapshotJobResponseOperation operation;
        public String queueId;
        public String startTime;
        public String state;
        public String tag;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Operation")
    public static class SubmitSnapshotJobResponseOperation {
        public String jobLevel;
        public MediaResult mediaResult;
        public SubmitSnapshotJob.SubmitSnapshotJobOutput output;
        public TemplateSnapshot.TemplateSnapshotSnapshot snapshot;
        public String templateId;
        public String templateName;
        public String userData;
    }
}
