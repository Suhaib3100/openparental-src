package com.tencent.cos.xml.model.tag.audit.post;

import com.tencent.cos.xml.model.tag.audit.bean.AuditConf;
import com.tencent.cos.xml.model.tag.audit.bean.AuditInput;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.TO, name = "Request")
/* loaded from: classes7.dex */
public class PostAudioAudit {
    public AuditInput input = new AuditInput();
    public AudioAuditConf conf = new AudioAuditConf();

    @XmlBean(method = XmlBean.GenerateMethod.TO, name = "Conf")
    public static class AudioAuditConf extends AuditConf {
        public String callbackVersion;
    }
}
