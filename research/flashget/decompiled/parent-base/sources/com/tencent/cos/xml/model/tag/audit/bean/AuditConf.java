package com.tencent.cos.xml.model.tag.audit.bean;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;

@XmlBean(method = XmlBean.GenerateMethod.TO, name = "Conf")
/* loaded from: classes7.dex */
public class AuditConf {
    public int async;
    public String bizType;
    public String callback;

    @XmlElement(ignoreZero = true)
    public int callbackType;
    public String detectType;
    public Freeze freeze;

    @XmlBean(method = XmlBean.GenerateMethod.TO, name = "Freeze")
    public static class Freeze {
        public int abuseScore;
        public int adsScore;
        public int illegalScore;
        public int pornScore;
    }
}
