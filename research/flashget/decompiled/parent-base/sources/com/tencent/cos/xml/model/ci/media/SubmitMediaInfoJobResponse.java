package com.tencent.cos.xml.model.ci.media;

import com.tencent.cos.xml.model.tag.MediaInfo;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class SubmitMediaInfoJobResponse {
    public SubmitMediaInfoJobResponseJobsDetail jobsDetail;

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Input")
    public static class SubmitMediaInfoJobResponseInput {
        public String bucketId;
        public String object;
        public String region;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "JobsDetail")
    public static class SubmitMediaInfoJobResponseJobsDetail {
        public String code;
        public String creationTime;
        public String endTime;
        public SubmitMediaInfoJobResponseInput input;
        public String jobId;
        public String message;
        public SubmitMediaInfoJobResponseOperation operation;
        public String queueId;
        public String startTime;
        public String state;
        public String tag;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Operation")
    public static class SubmitMediaInfoJobResponseOperation {
        public String jobLevel;
        public MediaInfo mediaInfo;
        public String userData;
    }
}
