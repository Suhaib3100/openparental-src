package com.tencent.cos.xml.model.ci.common;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.ALL, name = "AudioMix")
/* loaded from: classes7.dex */
public class AudioMix {
    public String audioSource;
    public EffectConfig effectConfig;
    public String mixMode;
    public String replace;
}
