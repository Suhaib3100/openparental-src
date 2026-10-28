package com.tencent.cos.xml.model.ci.media;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class TemplateAnimationResponse {
    public String bucketId;
    public String category;
    public String createTime;
    public String name;
    public String tag;
    public String templateId;
    public TemplateAnimationResponseTransTpl transTpl;
    public String updateTime;

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "TransTpl")
    public static class TemplateAnimationResponseTransTpl {
        public TransTplContainer container;
        public TransTplTimeInterval timeInterval;
        public TransTplVideo video;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Container")
    public static class TransTplContainer {
        public String format;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "TimeInterval")
    public static class TransTplTimeInterval {
        public String duration;
        public String start;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Video")
    public static class TransTplVideo {
        public String animateFramesPerSecond;
        public String animateOnlyKeepKeyFrame;
        public String animateTimentervalOfFrame;
        public String codec;
        public String fps;
        public String height;
        public String quality;
        public String width;
    }
}
