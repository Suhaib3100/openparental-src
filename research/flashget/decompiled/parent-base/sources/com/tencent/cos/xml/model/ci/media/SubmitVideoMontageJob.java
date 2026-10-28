package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.common.AudioMix;
import com.tencent.cos.xml.model.ci.media.TemplateTranscode;
import com.tencent.cos.xml.model.ci.media.TemplateVideoMontage;
import com.tencent.cos.xml.model.tag.CallBackMqConfig;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean(method = XmlBean.GenerateMethod.TO, name = "Request")
/* loaded from: classes7.dex */
public class SubmitVideoMontageJob {
    public String callBack;
    public String callBackFormat;
    public CallBackMqConfig callBackMqConfig;
    public String callBackType;
    public SubmitVideoMontageJobInput input;
    public SubmitVideoMontageJobOperation operation;
    public String tag = ProtectedSandApp.s("䗾\u0001");

    @XmlBean(method = XmlBean.GenerateMethod.TO, name = "Input")
    public static class SubmitVideoMontageJobInput {
        public String object;
        public String url;
    }

    @XmlBean(method = XmlBean.GenerateMethod.TO, name = "Operation")
    public static class SubmitVideoMontageJobOperation {
        public String jobLevel;
        public SubmitVideoMontageJobOutput output;
        public String templateId;
        public String userData;
        public SubmitVideoMontageJobVideoMontage videoMontage;
    }

    @XmlBean(name = "Output")
    public static class SubmitVideoMontageJobOutput {
        public String bucket;
        public String object;
        public String region;
    }

    @XmlBean(name = "Transcode")
    public static class SubmitVideoMontageJobVideoMontage {
        public TemplateVideoMontage.TemplateVideoMontageAudio audio;
        public AudioMix audioMix;

        @XmlElement(flatListNote = true, ignoreListNote = true)
        public List<AudioMix> audioMixArray;
        public TemplateVideoMontage.TemplateVideoMontageContainer container;
        public TemplateTranscode.TemplateTranscodeTransConfig transConfig;
        public TemplateVideoMontage.TemplateVideoMontageVideo video;
    }
}
