package com.tencent.cos.xml.model.ci.media;

import com.tencent.cos.xml.model.ci.media.TemplateVoiceSeparate;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class TemplateVoiceSeparateResponse {
    public String requestId;
    public TemplateVoiceSeparateResponseTemplate template;

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Template")
    public static class TemplateVoiceSeparateResponseTemplate {
        public String bucketId;
        public String category;
        public String createTime;
        public String name;
        public String tag;
        public String templateId;
        public String updateTime;
        public TemplateVoiceSeparateResponseVoiceSeparate voiceSeparate;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "VoiceSeparate")
    public static class TemplateVoiceSeparateResponseVoiceSeparate {
        public TemplateVoiceSeparate.AudioConfig audioConfig;
        public String audioMode;
    }
}
