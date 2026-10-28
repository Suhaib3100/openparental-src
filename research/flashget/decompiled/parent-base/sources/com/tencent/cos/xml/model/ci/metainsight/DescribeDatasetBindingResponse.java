package com.tencent.cos.xml.model.ci.metainsight;

/* loaded from: classes7.dex */
public class DescribeDatasetBindingResponse {
    public Binding binding;
    public String requestId;

    public static class Binding {
        public String createTime;
        public String datasetName;
        public String detail;
        public String state;
        public String uRI;
        public String updateTime;
    }
}
