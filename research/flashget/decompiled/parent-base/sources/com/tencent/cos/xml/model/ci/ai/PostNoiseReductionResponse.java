package com.tencent.cos.xml.model.ci.ai;

import com.tencent.cos.xml.model.ci.ai.PostNoiseReduction;
import com.tencent.cos.xml.model.ci.common.NoiseReduction;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class PostNoiseReductionResponse {

    @XmlElement(flatListNote = true, ignoreListNote = true)
    public List<PostNoiseReductionResponseJobsDetail> jobsDetail;

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Input")
    public static class PostNoiseReductionResponseInput {
        public String bucket;
        public String object;
        public String region;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "JobsDetail")
    public static class PostNoiseReductionResponseJobsDetail {
        public String code;
        public String creationTime;
        public String endTime;
        public PostNoiseReductionResponseInput input;
        public String jobId;
        public String message;
        public PostNoiseReductionResponseOperation operation;
        public String queueId;
        public String state;
        public String tag;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Operation")
    public static class PostNoiseReductionResponseOperation {
        public String jobLevel;
        public NoiseReduction noiseReduction;
        public PostNoiseReduction.PostNoiseReductionOutput output;
        public String templateId;
        public String templateName;
        public String userData;
    }
}
