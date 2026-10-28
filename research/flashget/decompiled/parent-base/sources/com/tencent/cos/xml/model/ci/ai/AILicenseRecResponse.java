package com.tencent.cos.xml.model.ci.ai;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class AILicenseRecResponse {

    @XmlElement(flatListNote = true, ignoreListNote = true)
    public List<AILicenseRecResponseIdInfo> idInfo;
    public int status;

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "IdInfo")
    public static class AILicenseRecResponseIdInfo {
        public String detectedText;

        @XmlElement(flatListNote = true, ignoreListNote = true)
        public List<AILicenseRecResponseLocation> location;
        public String name;
        public int score;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Location")
    public static class AILicenseRecResponseLocation {
        public String point;
    }
}
