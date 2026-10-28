package com.tencent.cos.xml.model.tag.audit.bean;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean(method = XmlBean.GenerateMethod.FROM)
/* loaded from: classes7.dex */
public class ImageAuditScenarioInfo {
    public String category;
    public int hitFlag;

    @XmlElement(flatListNote = true)
    public List<LibResults> libResults;

    @XmlElement(flatListNote = true)
    public List<ObjectResults> objectResults;

    @XmlElement(flatListNote = true)
    public List<AuditOcrResults> ocrResults;
    public int score;
    public String subLabel;

    @XmlBean(method = XmlBean.GenerateMethod.FROM)
    public static class LibResults {
        public String imageId;
        public int score;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM)
    public static class ObjectResults {
        public AuditOcrLocation location;
        public String name;
        public String subLabel;
    }
}
