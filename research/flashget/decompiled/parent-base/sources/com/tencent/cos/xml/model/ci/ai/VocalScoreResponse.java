package com.tencent.cos.xml.model.ci.ai;

import com.tencent.cos.xml.model.ci.ai.VocalScore;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class VocalScoreResponse {

    @XmlElement(flatListNote = true, ignoreListNote = true)
    public List<VocalScoreResponseJobsDetail> jobsDetail;

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "JobsDetail")
    public static class VocalScoreResponseJobsDetail {
        public String code;
        public String creationTime;
        public String endTime;
        public VocalScore.VocalScoreInput input;
        public String jobId;
        public String message;
        public VocalScoreResponseOperation operation;
        public String queueId;
        public String startTime;
        public String state;
        public String tag;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Operation")
    public static class VocalScoreResponseOperation {
        public String jobLevel;
        public String userData;
        public VocalScore.VocalScoreVocalScore vocalScore;
        public VocalScoreResponseVocalScoreResult vocalScoreResult;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "PitchScore")
    public static class VocalScoreResponsePitchScore {

        @XmlElement(flatListNote = true, ignoreListNote = true)
        public List<VocalScoreResponseSentenceScores> sentenceScores;
        public int totalScore;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "RhythemScore")
    public static class VocalScoreResponseRhythemScore {

        @XmlElement(flatListNote = true, ignoreListNote = true)
        public List<VocalScoreResponseRhythemScoreSentenceScores> sentenceScores;
        public int totalScore;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "SentenceScores")
    public static class VocalScoreResponseRhythemScoreSentenceScores {
        public float endTime;
        public int score;
        public float startTime;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "SentenceScores")
    public static class VocalScoreResponseSentenceScores {
        public float endTime;
        public int score;
        public float startTime;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "VocalScoreResult")
    public static class VocalScoreResponseVocalScoreResult {
        public VocalScoreResponsePitchScore pitchScore;
        public VocalScoreResponseRhythemScore rhythemScore;
    }
}
