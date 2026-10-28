package com.tencent.cos.xml.model.ci.ai;

import com.tencent.cos.xml.model.ci.ai.PostSoundHound;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class PostSoundHoundResponse {

    @XmlElement(flatListNote = true, ignoreListNote = true)
    public List<PostSoundHoundResponseJobsDetail> jobsDetail;

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "JobsDetail")
    public static class PostSoundHoundResponseJobsDetail {
        public String code;
        public String creationTime;
        public String endTime;
        public PostSoundHound.PostSoundHoundInput input;
        public String jobId;
        public String message;
        public PostSoundHoundResponseOperation operation;
        public String queueId;
        public String startTime;
        public String state;
        public String tag;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Operation")
    public static class PostSoundHoundResponseOperation {
        public String jobLevel;
        public PostSoundHoundResponseSoundHoundResult soundHoundResult;
        public String userData;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "SongList")
    public static class PostSoundHoundResponseSongList {
        public int inlier;
        public String singerName;
        public String songName;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "SoundHoundResult")
    public static class PostSoundHoundResponseSoundHoundResult {

        @XmlElement(flatListNote = true, ignoreListNote = true)
        public List<PostSoundHoundResponseSongList> songList;
    }
}
