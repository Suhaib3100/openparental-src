package com.tencent.cos.xml.model.ci.media;

import com.tencent.cos.xml.model.ci.media.TemplateSmartCover;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class TemplateSmartCoverResponse {
    public String bucketId;
    public String category;
    public String createTime;
    public String name;
    public TemplateSmartCover.TemplateSmartCoverSmartCover smartCover;
    public String tag;
    public String templateId;
    public String updateTime;
}
