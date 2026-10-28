package com.tencent.cos.xml.model.ci.audit;

import com.tencent.cos.xml.model.ci.audit.CreateStrategy;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean(method = XmlBean.GenerateMethod.TO, name = "Request")
/* loaded from: classes7.dex */
public class UpdateStrategy {
    public CreateStrategy.Labels labels;

    @XmlElement(flatListNote = true, ignoreListNote = true)
    public List<String> textLibs;
}
