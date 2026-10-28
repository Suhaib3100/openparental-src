package com.tencent.cos.xml.model.ci.ai;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class OpenAsrBucketResponse {
    public OpenAsrBucketResponseAsrBucket asrBucket;
    public String requestId;

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "AsrBucket")
    public static class OpenAsrBucketResponseAsrBucket {
        public String bucketId;
        public String createTime;
        public String name;
        public String region;
    }
}
