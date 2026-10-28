package com.tencent.cos.xml.model.ci.audit;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean(method = XmlBean.GenerateMethod.TO, name = "Request")
/* loaded from: classes7.dex */
public class CreateStrategy {
    public Labels labels;
    public String name;

    @XmlElement(flatListNote = true, ignoreListNote = true)
    public List<String> textLibs;

    @XmlBean
    public static class LabelInfo {

        @XmlElement(flatListNote = true, ignoreListNote = true)
        public List<String> abuse;

        @XmlElement(flatListNote = true, ignoreListNote = true)
        public List<String> ads;

        @XmlElement(flatListNote = true, ignoreListNote = true)
        public List<String> illegal;

        @XmlElement(flatListNote = true, ignoreListNote = true)
        public List<String> politics;

        @XmlElement(flatListNote = true, ignoreListNote = true)
        public List<String> porn;

        @XmlElement(flatListNote = true, ignoreListNote = true)
        public List<String> terrorism;
    }

    @XmlBean(name = "Labels")
    public static class Labels {
        public LabelInfo audio;
        public LabelInfo image;
        public LabelInfo text;
    }
}
