package com.tencent.cos.xml.model.ci.media;

import com.tencent.cos.xml.model.ci.common.MediaResult;
import com.tencent.cos.xml.model.ci.media.SubmitSmartCoverJob;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class SubmitSmartCoverJobResponse {
    public SubmitSmartCoverJobResponseJobsDetail jobsDetail;

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Input")
    public static class SubmitSmartCoverJobResponseInput {
        public String bucketId;
        public String object;
        public String region;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "JobsDetail")
    public static class SubmitSmartCoverJobResponseJobsDetail {
        public String code;
        public String creationTime;
        public String endTime;
        public SubmitSmartCoverJobResponseInput input;
        public String jobId;
        public String message;
        public SubmitSmartCoverJobResponseOperation operation;
        public String queueId;
        public String state;
        public String tag;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Operation")
    public static class SubmitSmartCoverJobResponseOperation {
        public String jobLevel;
        public MediaResult mediaResult;
        public SubmitSmartCoverJob.SubmitSmartCoverJobOutput output;
        public String smartCover;
        public String userData;
    }
}
