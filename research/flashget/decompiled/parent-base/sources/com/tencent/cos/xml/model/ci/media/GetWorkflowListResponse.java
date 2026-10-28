package com.tencent.cos.xml.model.ci.media;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class GetWorkflowListResponse {

    @XmlElement(flatListNote = true, ignoreListNote = true)
    public List<GetWorkflowListResponseMediaWorkflowList> mediaWorkflowList;
    public int pageNumber;
    public int pageSize;
    public String requestId;
    public int totalCount;

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "MediaWorkflowList")
    public static class GetWorkflowListResponseMediaWorkflowList {
        public String createTime;
        public String name;
        public String state;
        public String updateTime;
        public String workflowId;
    }
}
