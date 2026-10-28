package com.tencent.cos.xml.model.ci.common;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean
/* loaded from: classes7.dex */
public class MediaInfoStream {

    @XmlElement(flatListNote = true, ignoreListNote = true)
    public List<MediaInfoStreamAudio> audio;

    @XmlElement(flatListNote = true, ignoreListNote = true)
    public List<MediaInfoStreamSubtitle> subtitle;

    @XmlElement(flatListNote = true, ignoreListNote = true)
    public List<MediaInfoStreamVideo> video;
}
