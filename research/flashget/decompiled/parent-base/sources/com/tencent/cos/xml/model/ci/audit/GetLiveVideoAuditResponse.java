package com.tencent.cos.xml.model.ci.audit;

import com.tencent.cos.xml.model.tag.audit.bean.AuditListInfo;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class GetLiveVideoAuditResponse {
    public GetLiveVideoAuditResponseJobsDetail jobsDetail;
    public String requestId;

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "LibResults")
    public static class AudioSectionInfoLibResults {

        @XmlElement(flatListNote = true)
        public List<String> keywords;
        public String libName;
        public int libType;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "AudioSection")
    public static class GetLiveVideoAuditResponseAudioSection {
        public GetLiveVideoAuditResponseAudioSectionInfo adsInfo;
        public int duration;
        public String label;
        public int offsetTime;
        public GetLiveVideoAuditResponseAudioSectionInfo pornInfo;
        public int result;
        public String text;
        public String url;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM)
    public static class GetLiveVideoAuditResponseAudioSectionInfo {
        public String category;
        public String hitFlag;

        @XmlElement(flatListNote = true)
        public List<String> keywords;

        @XmlElement(flatListNote = true)
        public List<AudioSectionInfoLibResults> libResults;
        public String score;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM)
    public static class GetLiveVideoAuditResponseInfo {
        public int count;
        public int hitFlag;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "JobsDetail")
    public static class GetLiveVideoAuditResponseJobsDetail {
        public GetLiveVideoAuditResponseInfo adsInfo;

        @XmlElement(flatListNote = true)
        public List<GetLiveVideoAuditResponseAudioSection> audioSection;
        public String code;
        public String creationTime;
        public String dataId;
        public String jobId;
        public String label;
        public AuditListInfo listInfo;
        public GetLiveVideoAuditResponseInfo meaninglessInfo;
        public String message;
        public GetLiveVideoAuditResponseInfo pornInfo;
        public int result;

        @XmlElement(flatListNote = true)
        public List<GetLiveVideoAuditResponseSnapshot> snapshot;
        public String snapshotCount;
        public String state;
        public String type;
        public GetLiveVideoAuditResponseUserInfo userInfo;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Snapshot")
    public static class GetLiveVideoAuditResponseSnapshot {
        public GetLiveVideoAuditResponseSnapshotInfo adsInfo;
        public String label;
        public GetLiveVideoAuditResponseSnapshotInfo meaninglessInfo;
        public GetLiveVideoAuditResponseSnapshotInfo pornInfo;
        public int result;
        public int snapshotTime;
        public String text;
        public String url;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM)
    public static class GetLiveVideoAuditResponseSnapshotInfo {
        public String category;
        public int hitFlag;
        public String label;

        @XmlElement(flatListNote = true)
        public List<SnapshotInfoLibResults> libResults;

        @XmlElement(flatListNote = true)
        public List<SnapshotInfoObjectResults> objectResults;

        @XmlElement(flatListNote = true)
        public List<SnapshotInfoOcrResults> ocrResults;
        public int score;
        public String subLabel;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "UserInfo")
    public static class GetLiveVideoAuditResponseUserInfo {
        public String appId;
        public String deviceId;
        public String gender;
        public String iP;
        public String level;
        public String nickname;
        public String receiveTokenId;
        public String role;
        public String room;
        public String tokenId;
        public String type;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "LibResults")
    public static class SnapshotInfoLibResults {
        public String imageId;
        public int score;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "ObjectResults")
    public static class SnapshotInfoObjectResults {
        public SnapshotInfoOcrResultsLocation location;
        public String name;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "OcrResults")
    public static class SnapshotInfoOcrResults {

        @XmlElement(flatListNote = true)
        public List<String> keywords;
        public SnapshotInfoOcrResultsLocation location;
        public String text;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "ObjectResults")
    public static class SnapshotInfoOcrResultsLocation {
        public float height;
        public float rotate;
        public float width;

        /* renamed from: x, reason: collision with root package name */
        public float f71715x;

        /* renamed from: y, reason: collision with root package name */
        public float f71716y;
    }
}
