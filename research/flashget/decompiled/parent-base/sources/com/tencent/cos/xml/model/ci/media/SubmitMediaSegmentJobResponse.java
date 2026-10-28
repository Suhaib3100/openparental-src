package com.tencent.cos.xml.model.ci.media;

import com.tencent.cos.xml.model.ci.common.MediaResult;
import com.tencent.cos.xml.model.ci.media.SubmitMediaSegmentJob;
import com.tencent.cos.xml.model.tag.MediaInfo;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class SubmitMediaSegmentJobResponse {
    public SubmitMediaSegmentJobResponseJobsDetail jobsDetail;

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Input")
    public static class SubmitMediaSegmentJobResponseInput {
        public String bucketId;
        public String object;
        public String region;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "JobsDetail")
    public static class SubmitMediaSegmentJobResponseJobsDetail {
        public String code;
        public String creationTime;
        public String endTime;
        public SubmitMediaSegmentJobResponseInput input;
        public String jobId;
        public String message;
        public SubmitMediaSegmentJobResponseOperation operation;
        public String queueId;
        public String startTime;
        public String state;
        public String tag;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Operation")
    public static class SubmitMediaSegmentJobResponseOperation {
        public String jobLevel;
        public MediaInfo mediaInfo;
        public MediaResult mediaResult;
        public SubmitMediaSegmentJob.SubmitMediaSegmentJobOutput output;
        public SubmitMediaSegmentJob.SubmitMediaSegmentJobSegment segment;
        public String userData;
    }
}
