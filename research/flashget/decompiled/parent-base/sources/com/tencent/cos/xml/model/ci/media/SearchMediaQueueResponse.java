package com.tencent.cos.xml.model.ci.media;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class SearchMediaQueueResponse {

    @XmlElement(flatListNote = true)
    public List<QueueID> nonExistPIDs;
    public int pageNumber;
    public int pageSize;

    @XmlElement(flatListNote = true)
    public List<SearchMediaQueueResponseQueueList> queueList;
    public String requestId;
    public int totalCount;

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "NonExistPIDs")
    public static class QueueID {

        @XmlElement(ignoreName = true, name = "NonExistPIDs")
        public String queueID;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "NotifyConfig")
    public static class SearchMediaQueueResponseNotifyConfig {
        public String event;
        public String resultFormat;
        public String state;
        public String type;
        public String url;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "QueueList")
    public static class SearchMediaQueueResponseQueueList {
        public String category;
        public String createTime;
        public int maxConcurrent;
        public int maxSize;
        public String name;
        public SearchMediaQueueResponseNotifyConfig notifyConfig;
        public String queueId;
        public String state;
        public String updateTime;
    }
}
