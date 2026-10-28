package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.TO, name = "Request")
/* loaded from: classes7.dex */
public class TemplateSnapshot {
    public String name;
    public TemplateSnapshotSnapshot snapshot;
    public String tag = ProtectedSandApp.s("䞚\u0001");

    @XmlBean(name = "Snapshot")
    public static class TemplateSnapshotSnapshot {
        public String blackLevel;
        public String cIParam;
        public String count;
        public String height;
        public String isCheckBlack;
        public String isCheckCount;
        public String mode;
        public String pixelBlackThreshold;
        public String snapshotOutMode;
        public TemplateSnapshotSpriteSnapshotConfig spriteSnapshotConfig;
        public String start;
        public String timeInterval;
        public String width;
    }

    @XmlBean(name = "SpriteSnapshotConfig")
    public static class TemplateSnapshotSpriteSnapshotConfig {
        public String cellHeight;
        public String cellWidth;
        public String color;
        public String columns;
        public String lines;
        public String margin;
        public String padding;
        public String scaleMethod;
    }
}
