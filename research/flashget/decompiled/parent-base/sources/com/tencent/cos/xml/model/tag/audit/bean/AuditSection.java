package com.tencent.cos.xml.model.tag.audit.bean;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.FROM)
/* loaded from: classes7.dex */
public class AuditSection {
    public TextAuditScenarioInfo adsInfo;
    public TextAuditScenarioInfo politicsInfo;
    public TextAuditScenarioInfo pornInfo;
    public TextAuditScenarioInfo teenagerInfo;
    public TextAuditScenarioInfo terrorismInfo;
}
