package com.tencent.cos.xml.model.ci.media;

import com.tencent.cos.xml.model.ci.common.MediaResult;
import com.tencent.cos.xml.model.ci.media.SubmitVoiceSeparateJob;
import com.tencent.cos.xml.model.tag.MediaInfo;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class SubmitVoiceSeparateJobResponse {
    public SubmitVoiceSeparateJobResponseJobsDetail jobsDetail;

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Input")
    public static class SubmitVoiceSeparateJobResponseInput {
        public String bucketId;
        public String object;
        public String region;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "JobsDetail")
    public static class SubmitVoiceSeparateJobResponseJobsDetail {
        public String code;
        public String creationTime;
        public String endTime;
        public SubmitVoiceSeparateJobResponseInput input;
        public String jobId;
        public String message;
        public SubmitVoiceSeparateJobResponseOperation operation;
        public String queueId;
        public String startTime;
        public String state;
        public String tag;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Operation")
    public static class SubmitVoiceSeparateJobResponseOperation {
        public String jobLevel;
        public MediaInfo mediaInfo;
        public MediaResult mediaResult;
        public SubmitVoiceSeparateJob.SubmitVoiceSeparateJobOutput output;
        public String templateId;
        public String templateName;
        public String userData;
        public SubmitVoiceSeparateJob.VoiceSeparate voiceSeparate;
    }
}
