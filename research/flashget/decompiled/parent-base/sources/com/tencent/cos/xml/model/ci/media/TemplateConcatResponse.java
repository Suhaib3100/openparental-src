package com.tencent.cos.xml.model.ci.media;

import com.tencent.cos.xml.model.ci.media.TemplateConcat;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class TemplateConcatResponse {
    public String requestId;
    public TemplateConcatResponseTemplate template;

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Template")
    public static class TemplateConcatResponseTemplate {
        public String bucketId;
        public String category;
        public TemplateConcat.TemplateConcatConcatTemplate concatTemplate;
        public String createTime;
        public String name;
        public String tag;
        public String templateId;
        public String updateTime;
    }
}
