package com.tencent.cos.xml.model.ci.ai;

import com.tencent.cos.xml.model.ci.ai.PostSegmentVideoBody;
import com.tencent.cos.xml.model.ci.common.MediaInfo;
import com.tencent.cos.xml.model.ci.common.MediaResult;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class PostSegmentVideoBodyResponse {

    @XmlElement(flatListNote = true, ignoreListNote = true)
    public List<PostSegmentVideoBodyResponseJobsDetail> jobsDetail;

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "JobsDetail")
    public static class PostSegmentVideoBodyResponseJobsDetail {
        public String code;
        public String creationTime;
        public String endTime;
        public PostSegmentVideoBody.PostSegmentVideoBodyInput input;
        public String jobId;
        public String message;
        public PostSegmentVideoBodyResponseOperation operation;
        public String queueId;
        public String startTime;
        public String state;
        public String tag;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Operation")
    public static class PostSegmentVideoBodyResponseOperation {
        public String jobLevel;
        public MediaInfo mediaInfo;
        public MediaResult mediaResult;
        public PostSegmentVideoBody.PostSegmentVideoBodyOutput output;
        public PostSegmentVideoBody.PostSegmentVideoBodySegmentVideoBody segmentVideoBody;
        public String userData;
    }
}
