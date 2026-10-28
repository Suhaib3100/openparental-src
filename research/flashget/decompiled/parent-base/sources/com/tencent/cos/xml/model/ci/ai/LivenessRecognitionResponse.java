package com.tencent.cos.xml.model.ci.ai;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class LivenessRecognitionResponse {
    public String bestFrameBase64;

    @XmlElement(flatListNote = true, ignoreListNote = true)
    public List<String> bestFrameList;
    public float sim;
}
