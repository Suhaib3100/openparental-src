package com.tencent.cos.xml.model.ci.audit;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.TO, name = "Request")
/* loaded from: classes7.dex */
public class PostTextAuditReport {
    public int contentType = 1;
    public String jobId;
    public String label;
    public String moderationTime;
    public String suggestedLabel;
    public String text;
}
