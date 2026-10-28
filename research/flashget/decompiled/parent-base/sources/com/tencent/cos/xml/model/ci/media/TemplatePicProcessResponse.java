package com.tencent.cos.xml.model.ci.media;

import com.tencent.cos.xml.model.ci.common.PicProcess;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class TemplatePicProcessResponse {
    public String requestId;
    public TemplatePicProcessResponseTemplate template;

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Template")
    public static class TemplatePicProcessResponseTemplate {
        public String bucketId;
        public String category;
        public String createTime;
        public String name;
        public PicProcess picProcess;
        public String tag;
        public String templateId;
        public String updateTime;
    }
}
