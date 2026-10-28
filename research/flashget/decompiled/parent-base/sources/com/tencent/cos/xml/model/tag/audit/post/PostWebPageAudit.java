package com.tencent.cos.xml.model.tag.audit.post;

import com.tencent.cos.xml.model.tag.audit.bean.AuditConf;
import com.tencent.cos.xml.model.tag.audit.bean.AuditInput;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.TO, name = "Request")
/* loaded from: classes7.dex */
public class PostWebPageAudit {
    public AuditInput input = new AuditInput();
    public WebPageAuditConf conf = new WebPageAuditConf();

    @XmlBean(method = XmlBean.GenerateMethod.TO, name = "Conf")
    public static class WebPageAuditConf extends AuditConf {
        public boolean returnHighlightHtml;
    }
}
