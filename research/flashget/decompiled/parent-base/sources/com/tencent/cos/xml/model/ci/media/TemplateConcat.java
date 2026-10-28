package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.common.AudioMix;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean(method = XmlBean.GenerateMethod.TO, name = "Request")
/* loaded from: classes7.dex */
public class TemplateConcat {
    public TemplateConcatConcatTemplate concatTemplate;
    public String name;
    public String tag = ProtectedSandApp.s("䜸\u0001");

    @XmlBean(name = "Audio")
    public static class TemplateConcatAudio {
        public String bitrate;
        public String channels;
        public String codec;
        public String samplerate;
    }

    @XmlBean(name = "ConcatFragment")
    public static class TemplateConcatConcatFragment {
        public String endTime;
        public String mode;
        public String startTime;
        public String url;
    }

    @XmlBean(name = "ConcatTemplate")
    public static class TemplateConcatConcatTemplate {
        public TemplateConcatAudio audio;
        public AudioMix audioMix;

        @XmlElement(flatListNote = true, ignoreListNote = true)
        public List<AudioMix> audioMixArray;

        @XmlElement(flatListNote = true, ignoreListNote = true)
        public List<TemplateConcatConcatFragment> concatFragment;
        public TemplateConcatContainer container;
        public String directConcat;
        public TemplateConcatSceneChangeInfo sceneChangeInfo;
        public TemplateConcatVideo video;
    }

    @XmlBean(name = "Container")
    public static class TemplateConcatContainer {
        public String format;
    }

    @XmlBean(name = "SceneChangeInfo")
    public static class TemplateConcatSceneChangeInfo {
        public String mode;
        public String time;
    }

    @XmlBean(name = "Video")
    public static class TemplateConcatVideo {
        public String bitrate;
        public String codec;
        public String crf;
        public String fps;
        public String height;
        public String remove;
        public String rotate;
        public String width;
    }
}
