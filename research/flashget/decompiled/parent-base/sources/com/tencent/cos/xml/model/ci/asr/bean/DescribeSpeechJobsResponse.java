package com.tencent.cos.xml.model.ci.asr.bean;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class DescribeSpeechJobsResponse {

    @XmlElement(flatListNote = true)
    public List<SpeechJobsDetail> jobsDetail;
    public String nextToken;
}
