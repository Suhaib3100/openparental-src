package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.TO, name = "Request")
/* loaded from: classes7.dex */
public class TemplateWatermark {
    public String name;
    public String tag = ProtectedSandApp.s("䢊\u0001");
    public Watermark watermark;

    @XmlBean(name = "Image")
    public static class TemplateWatermarkImage {
        public String background;
        public String height;
        public String mode;
        public String transparency;
        public String url;
        public String width;
    }

    @XmlBean(name = "SlideConfig")
    public static class TemplateWatermarkSlideConfig {
        public String slideMode;
        public String xSlideSpeed;
        public String ySlideSpeed;
    }

    @XmlBean(name = "Text")
    public static class TemplateWatermarkText {
        public String fontColor;
        public String fontSize;
        public String fontType;
        public String text;
        public String transparency;
    }

    @XmlBean(name = "Watermark")
    public static class Watermark {
        public String dx;
        public String dy;
        public String endTime;
        public TemplateWatermarkImage image;
        public String locMode;
        public String pos;
        public TemplateWatermarkSlideConfig slideConfig;
        public String startTime;
        public TemplateWatermarkText text;
        public String type;
    }
}
