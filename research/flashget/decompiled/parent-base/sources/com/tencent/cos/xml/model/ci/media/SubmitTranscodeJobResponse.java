package com.tencent.cos.xml.model.ci.media;

import com.tencent.cos.xml.model.ci.common.DigitalWatermark;
import com.tencent.cos.xml.model.ci.common.MediaResult;
import com.tencent.cos.xml.model.ci.media.SubmitTranscodeJob;
import com.tencent.cos.xml.model.ci.media.TemplateWatermark;
import com.tencent.cos.xml.model.tag.MediaInfo;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class SubmitTranscodeJobResponse {
    public SubmitTranscodeJobResponseJobsDetail jobsDetail;

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Input")
    public static class SubmitTranscodeJobResponseInput {
        public String bucketId;
        public String object;
        public String region;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "JobsDetail")
    public static class SubmitTranscodeJobResponseJobsDetail {
        public String code;
        public String creationTime;
        public String endTime;
        public SubmitTranscodeJobResponseInput input;
        public String jobId;
        public String message;
        public SubmitTranscodeJobResponseOperation operation;
        public String progress;
        public String queueId;
        public String startTime;
        public String state;
        public String tag;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Operation")
    public static class SubmitTranscodeJobResponseOperation {
        public DigitalWatermark digitalWatermark;
        public String jobLevel;
        public MediaInfo mediaInfo;
        public MediaResult mediaResult;
        public SubmitTranscodeJob.SubmitTranscodeJobOutput output;
        public SubmitTranscodeJob.SubmitTranscodeJobRemoveWatermark removeWatermark;
        public String templateId;
        public String templateName;
        public SubmitTranscodeJob.SubmitTranscodeJobTranscode transcode;
        public String userData;

        @XmlElement(flatListNote = true)
        public List<TemplateWatermark.Watermark> watermark;

        @XmlElement(flatListNote = true)
        public List<String> watermarkTemplateId;
    }
}
