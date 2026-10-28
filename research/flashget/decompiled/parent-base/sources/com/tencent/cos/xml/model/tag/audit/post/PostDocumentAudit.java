package com.tencent.cos.xml.model.tag.audit.post;

import com.tencent.cos.xml.model.tag.audit.bean.AuditConf;
import com.tencent.cos.xml.model.tag.audit.bean.AuditInput;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.TO, name = "Request")
/* loaded from: classes7.dex */
public class PostDocumentAudit {
    public DocumentAuditInput input = new DocumentAuditInput();
    public AuditConf conf = new AuditConf();

    @XmlBean(method = XmlBean.GenerateMethod.TO, name = "Input")
    public static class DocumentAuditInput extends AuditInput {
        public String type;
    }
}
