package com.tencent.cos.xml.model.tag.audit.bean;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "JobsDetail")
/* loaded from: classes7.dex */
public class AuditJobsDetail extends BaseAuditJobsDetail {
    public String category;
    public String code;
    public int forbidState;
    public String label;
    public AuditListInfo listInfo;
    public String message;
    public String result;
    public String subLabel;
    public AuditUserInfo userInfo;
}
