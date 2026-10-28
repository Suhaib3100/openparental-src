package com.tencent.cos.xml.model.ci.audit;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.TO, name = "Request")
/* loaded from: classes7.dex */
public class PostImageAuditReport {
    public int contentType = 2;
    public String jobId;
    public String label;
    public String moderationTime;
    public String suggestedLabel;
    public String url;
}
