package com.tencent.cos.xml.model.ci.media;

import com.tencent.cos.xml.model.ci.common.AudioMix;
import com.tencent.cos.xml.model.ci.media.TemplateTranscode;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class TemplateTranscodeResponse {
    public String requestId;
    public TemplateTranscodeResponseTemplate template;

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Template")
    public static class TemplateTranscodeResponseTemplate {
        public String bucketId;
        public String category;
        public String createTime;
        public String name;
        public String tag;
        public String templateId;
        public TemplateTranscodeResponseTransTpl transTpl;
        public String updateTime;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "TransTpl")
    public static class TemplateTranscodeResponseTransTpl {
        public TemplateTranscode.TemplateTranscodeAudio audio;
        public AudioMix audioMix;

        @XmlElement(flatListNote = true)
        public List<AudioMix> audioMixArray;
        public TemplateTranscode.TemplateTranscodeContainer container;
        public TemplateTranscode.TemplateTranscodeTimeInterval timeInterval;
        public TemplateTranscode.TemplateTranscodeTransConfig transConfig;
        public TemplateTranscode.TemplateTranscodeVideo video;
    }
}
