package com.tencent.cos.xml.model.tag.audit.bean;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "JobsDetail")
/* loaded from: classes7.dex */
public class BaseAuditJobsDetail {
    public String creationTime;
    public String dataId;
    public String jobId;
    public String state;
}
