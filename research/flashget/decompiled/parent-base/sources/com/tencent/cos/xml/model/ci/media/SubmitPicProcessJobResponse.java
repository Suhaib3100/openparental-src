package com.tencent.cos.xml.model.ci.media;

import com.tencent.cos.xml.model.ci.common.PicProcess;
import com.tencent.cos.xml.model.ci.media.SubmitPicProcessJob;
import com.tencent.cos.xml.model.tag.pic.PicUploadResult;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class SubmitPicProcessJobResponse {
    public SubmitPicProcessJobResponseJobsDetail jobsDetail;

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Input")
    public static class SubmitPicProcessJobResponseInput {
        public String bucketId;
        public String object;
        public String region;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "JobsDetail")
    public static class SubmitPicProcessJobResponseJobsDetail {
        public String code;
        public String creationTime;
        public String endTime;
        public SubmitPicProcessJobResponseInput input;
        public String jobId;
        public String message;
        public SubmitPicProcessJobResponseOperation operation;
        public String queueId;
        public String startTime;
        public String state;
        public String tag;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Operation")
    public static class SubmitPicProcessJobResponseOperation {
        public SubmitPicProcessJob.SubmitPicProcessJobOutput output;
        public PicProcess picProcess;
        public PicUploadResult picProcessResult;
        public String templateId;
        public String templateName;
        public String userData;
    }
}
