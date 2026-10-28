package com.tencent.cos.xml.model.tag.audit.bean;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.TO, name = "Input")
/* loaded from: classes7.dex */
public class AuditInput {
    public String dataId;
    public String object;
    public String url;
    public AuditUserInfo userInfo;
}
