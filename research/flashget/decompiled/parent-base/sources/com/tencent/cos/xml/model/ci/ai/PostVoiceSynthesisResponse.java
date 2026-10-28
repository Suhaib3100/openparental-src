package com.tencent.cos.xml.model.ci.ai;

import com.tencent.cos.xml.model.ci.ai.PostVoiceSynthesis;
import com.tencent.cos.xml.model.ci.common.MediaInfo;
import com.tencent.cos.xml.model.ci.common.MediaResult;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class PostVoiceSynthesisResponse {

    @XmlElement(flatListNote = true, ignoreListNote = true)
    public List<PostVoiceSynthesisResponseJobsDetail> jobsDetail;

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "JobsDetail")
    public static class PostVoiceSynthesisResponseJobsDetail {
        public String code;
        public String creationTime;
        public String endTime;
        public String jobId;
        public String message;
        public PostVoiceSynthesisResponseOperation operation;
        public String queueId;
        public String startTime;
        public String state;
        public String tag;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Operation")
    public static class PostVoiceSynthesisResponseOperation {
        public String jobLevel;
        public MediaInfo mediaInfo;
        public MediaResult mediaResult;
        public PostVoiceSynthesis.PostVoiceSynthesisOutput output;
        public String templateId;
        public String templateName;
        public PostVoiceSynthesis.PostVoiceSynthesisTtsConfig ttsConfig;
        public PostVoiceSynthesis.PostVoiceSynthesisTtsTpl ttsTpl;
        public String userData;
    }
}
