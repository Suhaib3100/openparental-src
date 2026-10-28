package com.tencent.cos.xml.model.ci.common;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.ALL, name = "NotifyConfig")
/* loaded from: classes7.dex */
public class NotifyConfig {
    public String event;
    public String mqMode;
    public String mqName;
    public String mqRegion;
    public String resultFormat;
    public String state;
    public String type;
    public String url;
}
