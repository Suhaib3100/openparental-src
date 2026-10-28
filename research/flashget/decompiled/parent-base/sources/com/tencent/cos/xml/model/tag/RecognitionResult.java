package com.tencent.cos.xml.model.tag;

import com.tencent.cos.xml.model.tag.audit.bean.AuditLibResults;
import com.tencent.cos.xml.model.tag.audit.bean.AuditOcrResults;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "RecognitionResult")
/* loaded from: classes7.dex */
public class RecognitionResult {

    @XmlElement(name = "AdsInfo")
    public AdsInfo adsInfo;
    public String category;
    public int compressionResult;
    public String dataId;
    public String jobId;
    public String label;
    public String object;

    @XmlElement(name = "PoliticsInfo")
    public PoliticsInfo politicsInfo;

    @XmlElement(name = "PornInfo")
    public PornInfo pornInfo;

    @XmlElement(name = "QualityInfo")
    public QualityInfo qualityInfo;
    public int result;
    public int score;
    public String state;
    public String subLabel;

    @XmlElement(name = "TerroristInfo")
    public TerroristInfo terroristInfo;
    public String text;
    public String url;

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "AdsInfo")
    public static class AdsInfo {

        @XmlElement(name = "Category")
        public String category;

        @XmlElement(name = "Code")
        public int code;

        @XmlElement(name = "HitFlag")
        public int hitFlag;

        @XmlElement(name = "Label")
        public String label;

        @XmlElement(flatListNote = true)
        public List<AuditLibResults> libResults;

        @XmlElement(name = "Msg")
        public String msg;

        @XmlElement(flatListNote = true)
        public List<AuditOcrResults> ocrResults;

        @XmlElement(name = "Score")
        public int score;

        @XmlElement(name = "SubLabel")
        public String subLabel;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "PoliticsInfo")
    public static class PoliticsInfo {

        @XmlElement(name = "Category")
        public String category;

        @XmlElement(name = "Code")
        public int code;

        @XmlElement(name = "HitFlag")
        public int hitFlag;

        @XmlElement(name = "Label")
        public String label;

        @XmlElement(flatListNote = true)
        public List<AuditLibResults> libResults;

        @XmlElement(name = "Msg")
        public String msg;

        @XmlElement(flatListNote = true)
        public List<AuditOcrResults> ocrResults;

        @XmlElement(name = "Score")
        public int score;

        @XmlElement(name = "SubLabel")
        public String subLabel;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "PornInfo")
    public static class PornInfo {

        @XmlElement(name = "Category")
        public String category;

        @XmlElement(name = "Code")
        public int code;

        @XmlElement(name = "HitFlag")
        public int hitFlag;

        @XmlElement(name = "Label")
        public String label;

        @XmlElement(flatListNote = true)
        public List<AuditLibResults> libResults;

        @XmlElement(name = "Msg")
        public String msg;

        @XmlElement(flatListNote = true)
        public List<AuditOcrResults> ocrResults;

        @XmlElement(name = "Score")
        public int score;

        @XmlElement(name = "SubLabel")
        public String subLabel;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "QualityInfo")
    public static class QualityInfo {

        @XmlElement(name = "Category")
        public String category;

        @XmlElement(name = "Code")
        public int code;

        @XmlElement(name = "HitFlag")
        public int hitFlag;

        @XmlElement(name = "Label")
        public String label;

        @XmlElement(flatListNote = true)
        public List<AuditLibResults> libResults;

        @XmlElement(name = "Msg")
        public String msg;

        @XmlElement(flatListNote = true)
        public List<AuditOcrResults> ocrResults;

        @XmlElement(name = "Score")
        public int score;

        @XmlElement(name = "SubLabel")
        public String subLabel;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "TerroristInfo")
    public static class TerroristInfo {

        @XmlElement(name = "Category")
        public String category;

        @XmlElement(name = "Code")
        public int code;

        @XmlElement(name = "HitFlag")
        public int hitFlag;

        @XmlElement(name = "Label")
        public String label;

        @XmlElement(flatListNote = true)
        public List<AuditLibResults> libResults;

        @XmlElement(name = "Msg")
        public String msg;

        @XmlElement(flatListNote = true)
        public List<AuditOcrResults> ocrResults;

        @XmlElement(name = "Score")
        public int score;

        @XmlElement(name = "SubLabel")
        public String subLabel;
    }
}
