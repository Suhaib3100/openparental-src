package com.tencent.cos.xml.model.ci.common;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.ALL, name = "AudioConfig")
/* loaded from: classes7.dex */
public class AudioConfig {
    public String bitrate;
    public String channels;
    public String codec;
    public String samplerate;
}
