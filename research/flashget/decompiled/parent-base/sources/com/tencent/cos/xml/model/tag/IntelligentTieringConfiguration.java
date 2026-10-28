package com.tencent.cos.xml.model.tag;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;

@XmlBean
/* loaded from: classes7.dex */
public class IntelligentTieringConfiguration {

    @XmlElement(name = "Status")
    public String status;

    @XmlElement(name = "Transition")
    public Transition transition;

    @XmlBean
    public static class Transition {

        @XmlElement(name = "Days")
        public int days;

        @XmlElement(name = "RequestFrequent")
        public int requestFrequent;
    }

    public IntelligentTieringConfiguration(String str, int i4) {
        this.status = str;
        Transition transition = new Transition();
        this.transition = transition;
        transition.days = i4;
        transition.requestFrequent = 1;
    }

    public IntelligentTieringConfiguration() {
    }
}
