package com.tencent.cos.xml.model.ci.metainsight;

import java.util.List;

/* loaded from: classes7.dex */
public class DatasetFaceSearchResponse {
    public List<FaceResult> faceResult;
    public String requestId;

    public static class FaceBoundary {
        public int height;
        public int left;

        /* renamed from: top, reason: collision with root package name */
        public int f71721top;
        public int width;
    }

    public static class FaceInfos {
        public FaceBoundary faceBoundary;
        public String faceId;
        public String personId;
        public int score;
        public String uRI;
    }

    public static class FaceResult {
        public List<FaceInfos> faceInfos;
        public FaceBoundary inputFaceBoundary;
    }
}
