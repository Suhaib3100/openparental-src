package com.tencent.cos.xml.model.ci.ai;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class AssessQualityResponse {
    public int aestheticScore;
    public boolean bigImage;
    public boolean blackAndWhite;
    public int clarityScore;
    public boolean longImage;
    public int lowQualityScore;
    public boolean pureImage;
    public String requestId;
    public boolean smallImage;
}
