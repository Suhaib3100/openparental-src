package com.tencent.cos.xml.model.ci.metainsight;

/* loaded from: classes7.dex */
public class CreateDatasetResponse {
    public Dataset dataset;
    public String requestId;

    public static class Dataset {
        public int bindCount;
        public String createTime;
        public String datasetName;
        public String description;
        public int fileCount;
        public String templateId;
        public int totalFileSize;
        public String updateTime;
    }
}
