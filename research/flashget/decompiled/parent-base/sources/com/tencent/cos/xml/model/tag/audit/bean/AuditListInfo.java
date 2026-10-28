package com.tencent.cos.xml.model.tag.audit.bean;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "ListInfo")
/* loaded from: classes7.dex */
public class AuditListInfo {

    @XmlElement(flatListNote = true)
    public List<ListResults> listResults;

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "ListResults")
    public static class ListResults {
        public String entity;
        public String listName;
        public int listType;
    }
}
