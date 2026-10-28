package com.tencent.cos.xml.model.ci.ai;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class AIDetectPetResponse {

    @XmlElement(flatListNote = true, ignoreListNote = true)
    public List<AIDetectPetResponseResultInfo> resultInfo;

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Location")
    public static class AIDetectPetResponseLocation {
        public int height;
        public int width;

        /* renamed from: x, reason: collision with root package name */
        public int f71705x;

        /* renamed from: y, reason: collision with root package name */
        public int f71706y;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "ResultInfo")
    public static class AIDetectPetResponseResultInfo {
        public AIDetectPetResponseLocation location;
        public String name;
        public int score;
    }
}
