package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.TO, name = "Request")
/* loaded from: classes7.dex */
public class TemplateVoiceSeparate {
    public AudioConfig audioConfig;
    public String audioMode;
    public String name;
    public String tag = ProtectedSandApp.s("䡐\u0001");

    @XmlBean(name = "Audio")
    public static class AudioConfig {
        public String bitrate;
        public String channels;
        public String codec;
        public String samplerate;
    }
}
