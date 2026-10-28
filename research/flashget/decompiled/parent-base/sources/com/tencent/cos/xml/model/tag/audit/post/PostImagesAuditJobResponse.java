package com.tencent.cos.xml.model.tag.audit.post;

import com.tencent.cos.xml.model.tag.audit.bean.ImageAuditJobsDetail;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class PostImagesAuditJobResponse {

    @XmlElement(flatListNote = true)
    public List<ImageAuditJobsDetail> jobsDetail;
    public String requestId;
}
