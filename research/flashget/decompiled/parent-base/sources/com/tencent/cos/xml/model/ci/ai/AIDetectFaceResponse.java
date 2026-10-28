package com.tencent.cos.xml.model.ci.ai;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class AIDetectFaceResponse {
    public AIDetectFaceResponseFaceInfos faceInfos;
    public String faceModelVersion;
    public int imageHeight;
    public int imageWidth;
    public String requestId;

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "FaceInfos")
    public static class AIDetectFaceResponseFaceInfos {
        public int height;
        public int width;

        /* renamed from: x, reason: collision with root package name */
        public int f71703x;

        /* renamed from: y, reason: collision with root package name */
        public int f71704y;
    }
}
