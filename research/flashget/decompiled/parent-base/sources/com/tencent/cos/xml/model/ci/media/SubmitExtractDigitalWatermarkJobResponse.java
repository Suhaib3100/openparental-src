package com.tencent.cos.xml.model.ci.media;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class SubmitExtractDigitalWatermarkJobResponse {
    public SubmitExtractDigitalWatermarkJobResponseJobsDetail jobsDetail;

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "ExtractDigitalWatermark")
    public static class SubmitExtractDigitalWatermarkJobResponseExtractDigitalWatermark {
        public String message;
        public String type;
        public String version;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Input")
    public static class SubmitExtractDigitalWatermarkJobResponseInput {
        public String bucketId;
        public String object;
        public String region;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "JobsDetail")
    public static class SubmitExtractDigitalWatermarkJobResponseJobsDetail {
        public String code;
        public String creationTime;
        public String endTime;
        public SubmitExtractDigitalWatermarkJobResponseInput input;
        public String jobId;
        public String message;
        public SubmitExtractDigitalWatermarkJobResponseOperation operation;
        public String queueId;
        public String state;
        public String tag;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Operation")
    public static class SubmitExtractDigitalWatermarkJobResponseOperation {
        public SubmitExtractDigitalWatermarkJobResponseExtractDigitalWatermark extractDigitalWatermark;
        public String jobLevel;
        public String userData;
    }
}
