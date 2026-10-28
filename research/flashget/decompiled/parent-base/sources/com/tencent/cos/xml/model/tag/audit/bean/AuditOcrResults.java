package com.tencent.cos.xml.model.tag.audit.bean;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "OcrResults")
/* loaded from: classes7.dex */
public class AuditOcrResults {
    public String keywords;
    public AuditOcrLocation location;
    public String subLabel;
    public String text;
}
