package com.tencent.cos.xml.model.ci.asr.bean;

import com.tencent.cos.xml.model.tag.DescribeBucket;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class DescribeSpeechBucketsResponse {

    @XmlElement(flatListNote = true)
    public List<DescribeBucket> asrBucketList;
    public int pageNumber;
    public int pageSize;
    public String requestId;
    public int totalCount;
}
