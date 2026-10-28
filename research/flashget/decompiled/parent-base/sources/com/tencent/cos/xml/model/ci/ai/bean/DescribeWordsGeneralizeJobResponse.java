package com.tencent.cos.xml.model.ci.ai.bean;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class DescribeWordsGeneralizeJobResponse {
    public WordsGeneralizeJobDetail jobsDetail;
    public String nonExistJobIds;
}
