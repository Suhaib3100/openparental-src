package com.tencent.cos.xml.model.ci.ai;

import com.tencent.cos.xml.model.ci.ai.PostTranslation;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class PostTranslationResponse {

    @XmlElement(flatListNote = true, ignoreListNote = true)
    public List<PostTranslationResponseJobsDetail> jobsDetail;

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "AITranslateResult")
    public static class PostTranslationResponseAITranslateResult {
        public String result;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "JobsDetail")
    public static class PostTranslationResponseJobsDetail {
        public String code;
        public String creationTime;
        public String endTime;
        public PostTranslation.PostTranslationInput input;
        public String jobId;
        public String message;
        public PostTranslationResponseOperation operation;
        public String queueId;
        public String startTime;
        public String state;
        public String tag;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Operation")
    public static class PostTranslationResponseOperation {
        public PostTranslationResponseAITranslateResult aITranslateResult;
        public String jobLevel;
        public PostTranslation.PostTranslationOutput output;
        public PostTranslation.PostTranslationTranslation translation;
        public String userData;
    }
}
