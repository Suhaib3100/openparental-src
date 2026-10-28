package com.tencent.cos.xml.model.ci.ai;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class GetSearchImageResponse {
    public int count;

    @XmlElement(flatListNote = true, ignoreListNote = true)
    public List<GetSearchImageResponseImageInfos> imageInfos;
    public String requestId;

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "ImageInfos")
    public static class GetSearchImageResponseImageInfos {
        public String customContent;
        public String entityId;
        public String picName;
        public int score;
        public String tags;
    }
}
