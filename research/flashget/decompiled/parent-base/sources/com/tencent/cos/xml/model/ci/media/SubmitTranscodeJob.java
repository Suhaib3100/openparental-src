package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.common.AudioMix;
import com.tencent.cos.xml.model.ci.common.DigitalWatermark;
import com.tencent.cos.xml.model.ci.media.TemplateTranscode;
import com.tencent.cos.xml.model.ci.media.TemplateWatermark;
import com.tencent.cos.xml.model.tag.CallBackMqConfig;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean(method = XmlBean.GenerateMethod.TO, name = "Request")
/* loaded from: classes7.dex */
public class SubmitTranscodeJob {
    public String callBack;
    public String callBackFormat;
    public CallBackMqConfig callBackMqConfig;
    public String callBackType;
    public SubmitTranscodeJobInput input;
    public SubmitTranscodeJobOperation operation;
    public String queueType;
    public String tag = ProtectedSandApp.s("䖫\u0001");

    @XmlBean(method = XmlBean.GenerateMethod.TO, name = "Input")
    public static class SubmitTranscodeJobInput {
        public String object;
    }

    @XmlBean(method = XmlBean.GenerateMethod.TO, name = "Operation")
    public static class SubmitTranscodeJobOperation {
        public DigitalWatermark digitalWatermark;
        public String jobLevel;
        public SubmitTranscodeJobOutput output;
        public SubmitTranscodeJobRemoveWatermark removeWatermark;
        public SubmitTranscodeJobSubtitles subtitles;
        public String templateId;
        public SubmitTranscodeJobTranscode transcode;
        public String userData;

        @XmlElement(flatListNote = true, ignoreListNote = true)
        public List<TemplateWatermark.Watermark> watermark;

        @XmlElement(flatListNote = true, ignoreListNote = true)
        public List<String> watermarkTemplateId;
    }

    @XmlBean(name = "Output")
    public static class SubmitTranscodeJobOutput {
        public String bucket;
        public String object;
        public String region;
    }

    @XmlBean(name = "RemoveWatermark")
    public static class SubmitTranscodeJobRemoveWatermark {
        public String dx;
        public String dy;
        public String height;
        public String width;
    }

    @XmlBean(method = XmlBean.GenerateMethod.TO, name = "Subtitle")
    public static class SubmitTranscodeJobSubtitle {
        public String url;
    }

    @XmlBean(method = XmlBean.GenerateMethod.TO, name = "Subtitles")
    public static class SubmitTranscodeJobSubtitles {

        @XmlElement(flatListNote = true, ignoreListNote = true)
        public List<SubmitTranscodeJobSubtitle> subtitle;
    }

    @XmlBean(name = "Transcode")
    public static class SubmitTranscodeJobTranscode {
        public TemplateTranscode.TemplateTranscodeAudio audio;
        public AudioMix audioMix;

        @XmlElement(flatListNote = true, ignoreListNote = true)
        public List<AudioMix> audioMixArray;
        public TemplateTranscode.TemplateTranscodeContainer container;
        public TemplateTranscode.TemplateTranscodeTimeInterval timeInterval;
        public TemplateTranscode.TemplateTranscodeTransConfig transConfig;
        public TemplateTranscode.TemplateTranscodeVideo video;
    }
}
