package com.tencent.cos.xml.model.ci.ai.bean;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "JobsDetail")
/* loaded from: classes7.dex */
public class WordsGeneralizeJobDetail {
    public String code;
    public String creationTime;
    public String endTime;
    public WordsGeneralizeJobInput input;
    public String jobId;
    public String message;
    public WordsGeneralizeJobDetailOperation operation;
    public String queueId;
    public String startTime;
    public String state;
    public String tag;

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Operation")
    public static class WordsGeneralizeJobDetailOperation extends WordsGeneralizeJobOperation {
        public WordsGeneralizeResult wordsGeneralizeResult;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM)
    public static class WordsGeneralizeLable {
        public String category;
        public String word;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM)
    public static class WordsGeneralizeResult {

        @XmlElement(flatListNote = true)
        public List<WordsGeneralizeLable> wordsGeneralizeLable;

        @XmlElement(flatListNote = true)
        public List<WordsGeneralizeToken> wordsGeneralizeToken;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM)
    public static class WordsGeneralizeToken {
        public String length;
        public String offset;
        public String pos;
        public String word;
    }
}
