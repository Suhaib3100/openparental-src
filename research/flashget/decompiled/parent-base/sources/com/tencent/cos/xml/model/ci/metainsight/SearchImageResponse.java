package com.tencent.cos.xml.model.ci.metainsight;

import java.util.List;

/* loaded from: classes7.dex */
public class SearchImageResponse {
    public List<ImageResult> imageResult;
    public String requestId;

    public static class ImageResult {
        public int score;
        public String uRI;
    }
}
