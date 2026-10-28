package com.tencent.cos.xml.model.ci.ai;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class AIDetectCarResponse {

    @XmlElement(flatListNote = true, ignoreListNote = true)
    public List<AIDetectCarResponseCarTags> carTags;
    public String requestId;

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "CarLocation")
    public static class AIDetectCarResponseCarLocation {

        /* renamed from: x, reason: collision with root package name */
        public int f71699x;

        /* renamed from: y, reason: collision with root package name */
        public int f71700y;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "CarTags")
    public static class AIDetectCarResponseCarTags {
        public String brand;

        @XmlElement(flatListNote = true, ignoreListNote = true)
        public List<AIDetectCarResponseCarLocation> carLocation;
        public String color;
        public int confidence;

        @XmlElement(flatListNote = true, ignoreListNote = true)
        public List<AIDetectCarResponsePlateContent> plateContent;
        public String serial;
        public String type;
        public int year;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "PlateContent")
    public static class AIDetectCarResponsePlateContent {
        public String color;
        public String plate;

        @XmlElement(flatListNote = true, ignoreListNote = true)
        public List<AIDetectCarResponsePlateLocation> plateLocation;
        public String type;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "PlateLocation")
    public static class AIDetectCarResponsePlateLocation {

        /* renamed from: x, reason: collision with root package name */
        public int f71701x;

        /* renamed from: y, reason: collision with root package name */
        public int f71702y;
    }
}
