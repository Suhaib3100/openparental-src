package com.tencent.cos.xml.model.ci.media;

import com.tencent.cos.xml.model.ci.common.DigitalWatermark;
import com.tencent.cos.xml.model.ci.common.MediaResult;
import com.tencent.cos.xml.model.ci.media.SubmitDigitalWatermarkJob;
import com.tencent.cos.xml.model.tag.MediaInfo;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class SubmitDigitalWatermarkJobResponse {
    public SubmitDigitalWatermarkJobResponseJobsDetail jobsDetail;

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Input")
    public static class SubmitDigitalWatermarkJobResponseInput {
        public String bucketId;
        public String object;
        public String region;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "JobsDetail")
    public static class SubmitDigitalWatermarkJobResponseJobsDetail {
        public String code;
        public String creationTime;
        public String endTime;
        public SubmitDigitalWatermarkJobResponseInput input;
        public String jobId;
        public String message;
        public SubmitDigitalWatermarkJobResponseOperation operation;
        public String queueId;
        public String state;
        public String tag;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Operation")
    public static class SubmitDigitalWatermarkJobResponseOperation {
        public DigitalWatermark digitalWatermark;
        public String jobLevel;
        public MediaInfo mediaInfo;
        public MediaResult mediaResult;
        public SubmitDigitalWatermarkJob.SubmitDigitalWatermarkJobOutput output;
        public String userData;
    }
}
