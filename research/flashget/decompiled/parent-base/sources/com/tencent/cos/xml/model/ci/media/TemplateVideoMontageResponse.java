package com.tencent.cos.xml.model.ci.media;

import com.tencent.cos.xml.model.ci.common.AudioMix;
import com.tencent.cos.xml.model.ci.media.TemplateVideoMontage;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class TemplateVideoMontageResponse {
    public String bucketId;
    public String category;
    public String createTime;
    public String name;
    public String tag;
    public String templateId;
    public String updateTime;
    public TemplateVideoMontageResponseVideoMontage videoMontage;

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "VideoMontage")
    public static class TemplateVideoMontageResponseVideoMontage {
        public TemplateVideoMontage.TemplateVideoMontageAudio audio;
        public AudioMix audioMix;

        @XmlElement(flatListNote = true)
        public List<AudioMix> audioMixArray;
        public TemplateVideoMontage.TemplateVideoMontageContainer container;
        public String duration;
        public String scene;
        public TemplateVideoMontage.TemplateVideoMontageVideo video;
    }
}
