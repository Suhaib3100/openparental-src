package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.common.AudioMix;
import com.tencent.cos.xml.model.ci.media.TemplateConcat;
import com.tencent.cos.xml.model.tag.CallBackMqConfig;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean(method = XmlBean.GenerateMethod.TO, name = "Request")
/* loaded from: classes7.dex */
public class SubmitConcatJob {
    public String callBack;
    public String callBackFormat;
    public CallBackMqConfig callBackMqConfig;
    public String callBackType;
    public SubmitConcatJobInput input;
    public SubmitConcatJobOperation operation;
    public String tag = ProtectedSandApp.s("䏋\u0001");

    @XmlBean(name = "ConcatFragment")
    public static class SubmitConcatJobConcatFragment {
        public String endTime;
        public String fragmentIndex;
        public String startTime;
        public String url;
    }

    @XmlBean(name = "ConcatTemplate")
    public static class SubmitConcatJobConcatTemplate {
        public TemplateConcat.TemplateConcatAudio audio;
        public AudioMix audioMix;

        @XmlElement(flatListNote = true, ignoreListNote = true)
        public List<AudioMix> audioMixArray;

        @XmlElement(flatListNote = true, ignoreListNote = true)
        public List<SubmitConcatJobConcatFragment> concatFragment;
        public TemplateConcat.TemplateConcatContainer container;
        public String directConcat;
        public String index;
        public TemplateConcat.TemplateConcatVideo video;
    }

    @XmlBean(method = XmlBean.GenerateMethod.TO, name = "Input")
    public static class SubmitConcatJobInput {
        public String object;
    }

    @XmlBean(method = XmlBean.GenerateMethod.TO, name = "Operation")
    public static class SubmitConcatJobOperation {
        public SubmitConcatJobConcatTemplate concatTemplate;
        public String jobLevel;
        public SubmitConcatJobOutput output;
        public String templateId;
    }

    @XmlBean(name = "Output")
    public static class SubmitConcatJobOutput {
        public String bucket;
        public String object;
        public String region;
    }
}
