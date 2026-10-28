package com.tencent.cos.xml.model.ci.ai;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class RecognizeLogoResponse {

    @XmlElement(flatListNote = true, ignoreListNote = true)
    public List<RecognizeLogoResponseLogoInfo> logoInfo;
    public int status;

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Location")
    public static class RecognizeLogoResponseLocation {
        public String point;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "LogoInfo")
    public static class RecognizeLogoResponseLogoInfo {

        @XmlElement(flatListNote = true, ignoreListNote = true)
        public List<RecognizeLogoResponseLocation> location;
        public String name;
        public int score;
    }
}
