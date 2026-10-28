package com.tencent.cos.xml.model.ci.media;

import com.tencent.cos.xml.model.ci.media.UpdateMediaQueue;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class UpdateMediaQueueResponse {
    public UpdateMediaQueueResponseQueue queue;
    public String requestId;

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Queue")
    public static class UpdateMediaQueueResponseQueue {
        public String category;
        public String createTime;
        public int maxConcurrent;
        public int maxSize;
        public String name;
        public UpdateMediaQueue.UpdateMediaQueueNotifyConfig notifyConfig;
        public String queueId;
        public String state;
        public String updateTime;
    }
}
