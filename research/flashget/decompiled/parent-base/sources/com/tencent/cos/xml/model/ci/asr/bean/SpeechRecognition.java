package com.tencent.cos.xml.model.ci.asr.bean;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean
/* loaded from: classes7.dex */
public class SpeechRecognition {
    public String engineModelType;
    public int filterDirty;
    public int filterModal;
    public int filterPunc;
    public boolean flashAsr;
    public String format;
    public String outputFileType;
    public int speakerDiarization;
    public int speakerNumber;
    public int wordInfo;
    public int channelNum = -1;
    public int resTextFormat = -1;
    public int convertNumMode = 1;
    public int firstChannelOnly = 1;
}
