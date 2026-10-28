package com.tencent.cos.xml.model.ci.ai;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class AIIDCardOCRResponse {
    public AIIDCardOCRResponseAdvancedInfo advancedInfo;
    public AIIDCardOCRResponseIdInfo idInfo;

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "AdvancedInfo")
    public static class AIIDCardOCRResponseAdvancedInfo {
        public String borderCodeValue;
        public String idCard;
        public String portrait;
        public String quality;
        public String warnInfos;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "IdInfo")
    public static class AIIDCardOCRResponseIdInfo {
        public String address;
        public String authority;
        public String birth;
        public String idNum;
        public String name;
        public String nation;
        public String sex;
        public String validDate;
    }
}
