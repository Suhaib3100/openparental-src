package com.tencent.cos.xml.model.ci.metainsight;

import java.util.List;

/* loaded from: classes7.dex */
public class DescribeDatasetBindingsResponse {
    public List<Binding> bindings;
    public String nextToken;
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
