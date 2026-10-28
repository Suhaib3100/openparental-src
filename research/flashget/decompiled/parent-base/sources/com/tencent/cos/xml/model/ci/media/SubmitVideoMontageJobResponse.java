package com.tencent.cos.xml.model.ci.media;

import com.tencent.cos.xml.model.ci.common.MediaResult;
import com.tencent.cos.xml.model.ci.media.SubmitVideoMontageJob;
import com.tencent.cos.xml.model.tag.MediaInfo;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class SubmitVideoMontageJobResponse {
    public SubmitVideoMontageJobResponseJobsDetail jobsDetail;

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Input")
    public static class SubmitVideoMontageJobResponseInput {
        public String bucketId;
        public String object;
        public String region;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "JobsDetail")
    public static class SubmitVideoMontageJobResponseJobsDetail {
        public String code;
        public String creationTime;
        public String endTime;
        public SubmitVideoMontageJobResponseInput input;
        public String jobId;
        public String message;
        public SubmitVideoMontageJobResponseOperation operation;
        public String queueId;
        public String startTime;
        public String state;
        public String tag;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Operation")
    public static class SubmitVideoMontageJobResponseOperation {
        public String jobLevel;
        public MediaInfo mediaInfo;
        public MediaResult mediaResult;
        public SubmitVideoMontageJob.SubmitVideoMontageJobOutput output;
        public String templateId;
        public String templateName;
        public String userData;
        public SubmitVideoMontageJob.SubmitVideoMontageJobVideoMontage videoMontage;
    }
}
