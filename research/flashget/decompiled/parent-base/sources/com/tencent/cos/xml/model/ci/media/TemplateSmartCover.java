package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.TO, name = "Request")
/* loaded from: classes7.dex */
public class TemplateSmartCover {
    public String name;
    public TemplateSmartCoverSmartCover smartCover;
    public String tag = ProtectedSandApp.s("䝮\u0001");

    @XmlBean(name = "SmartCover")
    public static class TemplateSmartCoverSmartCover {
        public String count;
        public String deleteDuplicates;
        public String format;
        public String height;
        public String width;
    }
}
