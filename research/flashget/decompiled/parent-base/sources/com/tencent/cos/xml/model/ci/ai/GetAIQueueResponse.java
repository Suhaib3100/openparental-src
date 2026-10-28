package com.tencent.cos.xml.model.ci.ai;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class GetAIQueueResponse {

    @XmlElement(flatListNote = true, ignoreListNote = true)
    public List<String> nonExistPIDs;
    public int pageNumber;
    public int pageSize;

    @XmlElement(flatListNote = true, ignoreListNote = true)
    public List<GetAIQueueResponseQueueList> queueList;
    public String requestId;
    public int totalCount;

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "NotifyConfig")
    public static class GetAIQueueResponseNotifyConfig {
        public String event;
        public String mqMode;
        public String mqName;
        public String mqRegion;
        public String resultFormat;
        public String state;
        public String type;
        public String url;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "QueueList")
    public static class GetAIQueueResponseQueueList {
        public String category;
        public String createTime;
        public int maxConcurrent;
        public int maxSize;
        public String name;
        public GetAIQueueResponseNotifyConfig notifyConfig;
        public String queueId;
        public String state;
        public String updateTime;
    }
}
