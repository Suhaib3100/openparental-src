package com.tencent.cos.xml.model.ci.ai;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class GetAIBucketResponse {

    @XmlElement(flatListNote = true, ignoreListNote = true)
    public List<GetAIBucketResponseAiBucketList> aiBucketList;
    public int pageNumber;
    public int pageSize;
    public String requestId;
    public int totalCount;

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "AiBucketList")
    public static class GetAIBucketResponseAiBucketList {
        public String bucketId;
        public String createTime;
        public String name;
        public String region;
    }
}
