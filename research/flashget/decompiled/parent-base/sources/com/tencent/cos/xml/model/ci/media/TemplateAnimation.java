package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.TO, name = "Request")
/* loaded from: classes7.dex */
public class TemplateAnimation {
    public TemplateAnimationContainer container;
    public String name;
    public String tag = ProtectedSandApp.s("䛧\u0001");
    public TemplateAnimationTimeInterval timeInterval;
    public TemplateAnimationVideo video;

    @XmlBean(name = "Container")
    public static class TemplateAnimationContainer {
        public String format;
    }

    @XmlBean(name = "TimeInterval")
    public static class TemplateAnimationTimeInterval {
        public String duration;
        public String start;
    }

    @XmlBean(name = "Video")
    public static class TemplateAnimationVideo {
        public String animateFramesPerSecond;
        public String animateOnlyKeepKeyFrame;
        public String animateTimeIntervalOfFrame;
        public String codec;
        public String fps;
        public String height;
        public String quality;
        public String width;
    }
}
