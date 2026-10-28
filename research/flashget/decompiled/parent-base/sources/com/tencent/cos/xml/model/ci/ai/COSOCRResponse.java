package com.tencent.cos.xml.model.ci.ai;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class COSOCRResponse {
    public float angel;
    public String language;
    public int pdfPageSize;
    public String requestId;
    public COSOCRResponseTextDetections textDetections;

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "ItemPolygon")
    public static class COSOCRResponseItemPolygon {
        public int height;
        public int width;

        /* renamed from: x, reason: collision with root package name */
        public int f71707x;

        /* renamed from: y, reason: collision with root package name */
        public int f71708y;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Polygon")
    public static class COSOCRResponsePolygon {

        /* renamed from: x, reason: collision with root package name */
        public int f71709x;

        /* renamed from: y, reason: collision with root package name */
        public int f71710y;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "TextDetections")
    public static class COSOCRResponseTextDetections {
        public int confidence;
        public String detectedText;

        @XmlElement(flatListNote = true, ignoreListNote = true)
        public List<COSOCRResponseItemPolygon> itemPolygon;

        @XmlElement(flatListNote = true, ignoreListNote = true)
        public List<COSOCRResponsePolygon> polygon;

        @XmlElement(flatListNote = true, ignoreListNote = true)
        public List<COSOCRResponseWordPolygon> wordPolygon;

        @XmlElement(flatListNote = true, ignoreListNote = true)
        public List<COSOCRResponseWords> words;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "WordCoordPoint")
    public static class COSOCRResponseWordCoordPoint {
        public COSOCRResponseWordCoordinate wordCoordinate;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "WordCoordinate")
    public static class COSOCRResponseWordCoordinate {

        /* renamed from: x, reason: collision with root package name */
        public int f71711x;

        /* renamed from: y, reason: collision with root package name */
        public int f71712y;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "WordPolygon")
    public static class COSOCRResponseWordPolygon {
        public COSOCRResponsePolygon leftBottom;
        public COSOCRResponsePolygon leftTop;
        public COSOCRResponsePolygon rightBottom;
        public COSOCRResponsePolygon rightTop;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Words")
    public static class COSOCRResponseWords {
        public String character;
        public int confidence;
        public COSOCRResponseWordCoordPoint wordCoordPoint;
    }
}
