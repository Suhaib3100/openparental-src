package com.tencent.cos.xml.model.ci.asr.bean;

import com.tencent.cos.xml.model.ci.ai.bean.WordsGeneralizeJobDetail;
import com.tencent.cos.xml.model.tag.Locator;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "JobsDetail")
/* loaded from: classes7.dex */
public class SpeechJobsDetail {
    public String code;
    public String creationTime;
    public String endTime;
    public SpeechJobsDetailInput input;
    public String jobId;
    public String message;
    public SpeechJobsDetailOperation operation;
    public String queueId;
    public String startTime;
    public String state;
    public String tag;

    @XmlBean(method = XmlBean.GenerateMethod.FROM)
    public static class FlashResult {

        @XmlElement(name = "channel_id")
        public int channelId;

        @XmlElement(flatListNote = true, name = "sentence_list")
        public List<FlashSentence> sentenceList;

        @XmlElement(name = "text")
        public String text;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM)
    public static class FlashSentence {

        @XmlElement(name = "end_time")
        public int endTime;

        @XmlElement(name = "speaker_id")
        public int speakerId;

        @XmlElement(name = "start_time")
        public int startTime;

        @XmlElement(name = "text")
        public String text;

        @XmlElement(flatListNote = true, name = "word_list")
        public List<FlashSentenceWord> wordList;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM)
    public static class FlashSentenceWord {

        @XmlElement(name = "end_time")
        public int endTime;

        @XmlElement(name = "start_time")
        public int startTime;

        @XmlElement(name = "word")
        public String word;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM)
    public static class SentenceDetail {
        public String endMs;
        public String finalSentence;
        public String sliceSentence;
        public String speakerId;
        public String speechSpeed;
        public String startMs;

        @XmlElement(flatListNote = true)
        public List<SentenceWords> words;
        public String wordsNum;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM)
    public static class SentenceWords {
        public String offsetEndMs;
        public String offsetStartMs;
        public String voiceType;
        public String word;
    }

    @XmlBean
    public static class SpeechJobsDetailInput {
        public String bucketId;
        public String object;
        public String region;
    }

    @XmlBean(name = "Operation")
    public static class SpeechJobsDetailOperation {
        public int jobLevel;
        public Locator output;
        public SpeechRecognition speechRecognition;
        public SpeechRecognitionResult speechRecognitionResult;
        public String templateId;
        public String userData;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM)
    public static class SpeechRecognitionResult {
        public double audioTime;

        @XmlElement(flatListNote = true)
        public List<FlashResult> flashResult;

        @XmlElement(name = "result")
        public String result;

        @XmlElement(flatListNote = true)
        public List<SentenceDetail> resultDetail;
        public WordsGeneralizeJobDetail.WordsGeneralizeResult wordsGeneralizeResult;
    }
}
