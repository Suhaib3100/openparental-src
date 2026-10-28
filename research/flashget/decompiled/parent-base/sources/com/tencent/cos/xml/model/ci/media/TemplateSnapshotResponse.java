package com.tencent.cos.xml.model.ci.media;

import com.tencent.cos.xml.model.ci.media.TemplateSnapshot;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class TemplateSnapshotResponse {
    public String createTime;
    public String name;
    public TemplateSnapshot.TemplateSnapshotSnapshot snapshot;
    public String tag;
    public String templateId;
    public String updateTime;
}
