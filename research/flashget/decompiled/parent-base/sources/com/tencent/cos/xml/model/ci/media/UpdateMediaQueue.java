package com.tencent.cos.xml.model.ci.media;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.TO, name = "Request")
/* loaded from: classes7.dex */
public class UpdateMediaQueue {
    public String name;
    public UpdateMediaQueueNotifyConfig notifyConfig;
    public String state;

    @XmlBean(name = "NotifyConfig")
    public static class UpdateMediaQueueNotifyConfig {
        public String event;
        public String mqMode;
        public String mqName;
        public String mqRegion;
        public String resultFormat;
        public String state;
        public String type;
        public String url;
    }
}
