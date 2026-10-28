package com.tencent.cos.xml.model.tag.audit.bean;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean(method = XmlBean.GenerateMethod.FROM)
/* loaded from: classes7.dex */
public class TextAuditScenarioInfo {
    public String category;
    public int hitFlag;
    public String keywords;

    @XmlElement(flatListNote = true)
    public List<LibResults> libResults;

    @XmlElement(flatListNote = true)
    public List<Results> recognitionResults;
    public int score;

    @XmlElement(flatListNote = true)
    public List<Results> speakerResults;
    public String subLabel;

    @XmlBean(method = XmlBean.GenerateMethod.FROM)
    public static class LibResults {

        @XmlElement(flatListNote = true)
        public List<String> keywords;
        public String libName;

        @XmlElement(ignoreZero = true)
        public int libType;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM)
    public static class Results {
        public int endTime;
        public String label;
        public int score;
        public int startTime;
    }
}
