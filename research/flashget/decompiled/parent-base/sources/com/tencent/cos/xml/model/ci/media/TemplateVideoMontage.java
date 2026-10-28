package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.common.AudioMix;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean(method = XmlBean.GenerateMethod.TO, name = "Request")
/* loaded from: classes7.dex */
public class TemplateVideoMontage {
    public TemplateVideoMontageAudio audio;
    public AudioMix audioMix;

    @XmlElement(flatListNote = true, ignoreListNote = true)
    public List<AudioMix> audioMixArray;
    public TemplateVideoMontageContainer container;
    public String duration;
    public String name;
    public String scene;
    public String tag = ProtectedSandApp.s("䠩\u0001");
    public TemplateVideoMontageVideo video;

    @XmlBean(name = "Audio")
    public static class TemplateVideoMontageAudio {
        public String bitrate;
        public String channels;
        public String codec;
        public String remove;
        public String samplerate;
    }

    @XmlBean(name = "Container")
    public static class TemplateVideoMontageContainer {
        public String format;
    }

    @XmlBean(name = "Video")
    public static class TemplateVideoMontageVideo {
        public String bitrate;
        public String codec;
        public String crf;
        public String fps;
        public String height;
        public String rotate;
        public String width;
    }
}
