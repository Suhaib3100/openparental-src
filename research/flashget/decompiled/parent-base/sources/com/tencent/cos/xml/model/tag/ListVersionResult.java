package com.tencent.cos.xml.model.tag;

import java.util.List;

/* loaded from: classes7.dex */
public class ListVersionResult {
    public List<CommonPrefixes> commonPrefixes;
    public List<DeleteMarker> deleteMarkers;
    public String delimiter;
    public String encodingType;
    public boolean isTruncated;
    public String keyMarker;
    public int maxKeys;
    public String name;
    public String nextKeyMarker;
    public String nextVersionIdMarker;
    public String prefix;
    public String versionIdMarker;
    public List<Version> versions;

    public static class CommonPrefixes {
        public String prefix;
    }

    public static class DeleteMarker {
        public boolean isLatest;
        public String key;
        public String lastModified;
        public Owner owner;
        public String versionId;
    }

    public static class Owner {
        public String displayName;

        /* renamed from: id, reason: collision with root package name */
        public String f71733id;
    }

    public static class Version {
        public String etag;
        public boolean isLatest;
        public String key;
        public String lastModified;
        public Owner owner;
        public long size;
        public String storageClass;
        public String versionID;
    }
}
