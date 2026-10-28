package com.tencent.cos.xml.model.ci.media;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class SubmitVideoTagJobResponse {
    public SubmitVideoTagJobResponseJobsDetail jobsDetail;

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "ActionTags")
    public static class SubmitVideoTagJobResponseActionTags {
        public String endTime;
        public String startTime;

        @XmlElement(flatListNote = true)
        public List<SubmitVideoTagJobResponseTags> tags;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "BBox")
    public static class SubmitVideoTagJobResponseBBox {

        /* renamed from: x1, reason: collision with root package name */
        public String f71717x1;

        /* renamed from: x2, reason: collision with root package name */
        public String f71718x2;

        /* renamed from: y1, reason: collision with root package name */
        public String f71719y1;

        /* renamed from: y2, reason: collision with root package name */
        public String f71720y2;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Data")
    public static class SubmitVideoTagJobResponseData {

        @XmlElement(flatListNote = true)
        public List<SubmitVideoTagJobResponseActionTags> actionTags;

        @XmlElement(flatListNote = true)
        public List<SubmitVideoTagJobResponseObjectTags> objectTags;

        @XmlElement(flatListNote = true)
        public List<SubmitVideoTagJobResponsePersonTags> personTags;

        @XmlElement(flatListNote = true)
        public List<SubmitVideoTagJobResponsePlaceTags> placeTags;
        public SubmitVideoTagJobResponseTags tags;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "DetailPerSecond")
    public static class SubmitVideoTagJobResponseDetailPerSecond {

        @XmlElement(flatListNote = true)
        public List<SubmitVideoTagJobResponseBBox> bBox;
        public float confidence;
        public String timeStamp;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Input")
    public static class SubmitVideoTagJobResponseInput {
        public String bucketId;
        public String object;
        public String region;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "JobsDetail")
    public static class SubmitVideoTagJobResponseJobsDetail {
        public String code;
        public String creationTime;
        public String endTime;
        public SubmitVideoTagJobResponseInput input;
        public String jobId;
        public String message;
        public SubmitVideoTagJobResponseOperation operation;
        public String queueId;
        public String startTime;
        public String state;
        public String tag;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "ObjectTags")
    public static class SubmitVideoTagJobResponseObjectTags {

        @XmlElement(flatListNote = true)
        public List<SubmitVideoTagJobResponseObjects> objects;
        public String timeStamp;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Objects")
    public static class SubmitVideoTagJobResponseObjects {

        @XmlElement(flatListNote = true)
        public List<SubmitVideoTagJobResponseBBox> bBox;
        public float confidence;
        public String name;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Operation")
    public static class SubmitVideoTagJobResponseOperation {
        public String jobLevel;
        public String userData;
        public OperationVideoTag videoTag;
        public SubmitVideoTagJobResponseVideoTagResult videoTagResult;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "PersonTags")
    public static class SubmitVideoTagJobResponsePersonTags {
        public float confidence;
        public String count;

        @XmlElement(flatListNote = true)
        public List<SubmitVideoTagJobResponseDetailPerSecond> detailPerSecond;
        public String name;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "PlaceTags")
    public static class SubmitVideoTagJobResponsePlaceTags {
        public String clipFrameResult;
        public String endIndex;
        public String endTime;
        public String startIndex;
        public String startTime;

        @XmlElement(flatListNote = true)
        public List<SubmitVideoTagJobResponseTags> tags;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "StreamData")
    public static class SubmitVideoTagJobResponseStreamData {
        public SubmitVideoTagJobResponseData data;
        public String subErrCode;
        public String subErrMsg;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Tags")
    public static class SubmitVideoTagJobResponseTags {
        public float confidence;
        public String tag;
        public String tagCls;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "VideoTagResult")
    public static class SubmitVideoTagJobResponseVideoTagResult {
        public SubmitVideoTagJobResponseStreamData streamData;
    }
}
