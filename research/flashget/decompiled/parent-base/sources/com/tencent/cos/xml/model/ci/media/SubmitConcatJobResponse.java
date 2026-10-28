package com.tencent.cos.xml.model.ci.media;

import com.tencent.cos.xml.model.ci.common.MediaResult;
import com.tencent.cos.xml.model.ci.media.SubmitConcatJob;
import com.tencent.cos.xml.model.tag.MediaInfo;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class SubmitConcatJobResponse {
    public SubmitConcatJobResponseJobsDetail jobsDetail;

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Input")
    public static class SubmitConcatJobResponseInput {
        public String bucketId;
        public String object;
        public String region;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "JobsDetail")
    public static class SubmitConcatJobResponseJobsDetail {
        public String code;
        public String creationTime;
        public String endTime;
        public SubmitConcatJobResponseInput input;
        public String jobId;
        public String message;
        public SubmitConcatJobResponseOperation operation;
        public String queueId;
        public String startTime;
        public String state;
        public String tag;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Operation")
    public static class SubmitConcatJobResponseOperation {
        public SubmitConcatJob.SubmitConcatJobConcatTemplate concatTemplate;
        public String jobLevel;
        public MediaInfo mediaInfo;
        public MediaResult mediaResult;
        public SubmitConcatJob.SubmitConcatJobOutput output;
        public String templateId;
        public String templateName;
        public String userData;
    }
}
