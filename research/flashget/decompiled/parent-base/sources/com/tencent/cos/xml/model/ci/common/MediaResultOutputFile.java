package com.tencent.cos.xml.model.ci.common;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean
/* loaded from: classes7.dex */
public class MediaResultOutputFile {
    public String bucket;

    @XmlElement(flatListNote = true, ignoreListNote = true)
    public List<MediaResultMd5Info> md5Info;

    @XmlElement(flatListNote = true, ignoreListNote = true)
    public List<String> objectName;
    public String region;
}
