package com.tencent.cos.xml.model.ci.ai;

import com.tencent.cos.xml.model.ci.common.VoiceSeparateTempleteResponseTemplate;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class UpdateVoiceSeparateTempleteResponse {
    public String requestId;
    public VoiceSeparateTempleteResponseTemplate template;
}
