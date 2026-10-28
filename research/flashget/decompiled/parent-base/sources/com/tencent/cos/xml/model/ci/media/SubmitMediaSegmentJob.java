package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.tag.CallBackMqConfig;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.TO, name = "Request")
/* loaded from: classes7.dex */
public class SubmitMediaSegmentJob {
    public String callBack;
    public String callBackFormat;
    public CallBackMqConfig callBackMqConfig;
    public String callBackType;
    public SubmitMediaSegmentJobInput input;
    public SubmitMediaSegmentJobOperation operation;
    public String tag = ProtectedSandApp.s("䒩\u0001");

    @XmlBean(name = "HlsEncrypt")
    public static class SubmitMediaSegmentJobHlsEncrypt {
        public String isHlsEncrypt;
        public String uriKey;
    }

    @XmlBean(method = XmlBean.GenerateMethod.TO, name = "Input")
    public static class SubmitMediaSegmentJobInput {
        public String object;
    }

    @XmlBean(method = XmlBean.GenerateMethod.TO, name = "Operation")
    public static class SubmitMediaSegmentJobOperation {
        public String jobLevel;
        public SubmitMediaSegmentJobOutput output;
        public SubmitMediaSegmentJobSegment segment;
    }

    @XmlBean(name = "Output")
    public static class SubmitMediaSegmentJobOutput {
        public String bucket;
        public String object;
        public String region;
    }

    @XmlBean(name = "Segment")
    public static class SubmitMediaSegmentJobSegment {
        public String duration;
        public String format;
        public SubmitMediaSegmentJobHlsEncrypt hlsEncrypt;
        public String transcodeIndex;
    }
}
