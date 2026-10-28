package com.tencent.cos.xml.model.ci.ai.bean;

import com.tencent.cos.xml.model.tag.DescribeBucket;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class OpenBucketAiResponse {
    public DescribeBucket aiBucket;
    public String requestId;
}
