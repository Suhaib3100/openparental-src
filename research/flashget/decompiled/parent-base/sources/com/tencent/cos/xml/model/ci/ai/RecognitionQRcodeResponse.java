package com.tencent.cos.xml.model.ci.ai;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class RecognitionQRcodeResponse {
    public int codeStatus;
    public RecognitionQRcodeResponseQRcodeInfo qRcodeInfo;
    public String resultImage;

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "CodeLocation")
    public static class RecognitionQRcodeResponseCodeLocation {
        public String point;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "QRcodeInfo")
    public static class RecognitionQRcodeResponseQRcodeInfo {

        @XmlElement(flatListNote = true, ignoreListNote = true)
        public List<RecognitionQRcodeResponseCodeLocation> codeLocation;
        public String codeUrl;
    }
}
