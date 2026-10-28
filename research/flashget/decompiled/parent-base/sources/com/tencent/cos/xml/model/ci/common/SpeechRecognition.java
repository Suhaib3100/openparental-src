package com.tencent.cos.xml.model.ci.common;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.ALL, name = "SpeechRecognition")
/* loaded from: classes7.dex */
public class SpeechRecognition {
    public String channelNum;
    public String convertNumMode;
    public String engineModelType;
    public String filterDirty;
    public String filterModal;
    public String filterPunc;
    public String firstChannelOnly;
    public String flashAsr;
    public String format;
    public String outputFileType;
    public String resTextFormat;
    public String sentenceMaxLength;
    public String speakerDiarization;
    public String speakerNumber;
    public String wordInfo;
}
