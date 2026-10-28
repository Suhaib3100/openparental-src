package com.tencent.cos.xml.model.tag;

import android.support.v4.media.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;

/* loaded from: classes7.dex */
public class ListBucket {
    public List<CommonPrefixes> commonPrefixesList;
    public List<Contents> contentsList;
    public String delimiter;
    public String encodingType;
    public boolean isTruncated;
    public String marker;
    public int maxKeys;
    public String name;
    public String nextMarker;
    public String prefix;

    public static class CommonPrefixes {
        public String prefix;

        public String toString() {
            return c.a(new StringBuilder(ProtectedSandApp.s("䪢\u0001")), this.prefix, ProtectedSandApp.s("䪣\u0001"));
        }
    }

    public static class Contents {
        public String eTag;
        public String key;
        public String lastModified;
        public Owner owner;
        public long size;
        public String storageClass;

        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("䪤\u0001"));
            sb.append(this.key);
            sb.append(ProtectedSandApp.s("䪥\u0001"));
            sb.append(this.lastModified);
            sb.append(ProtectedSandApp.s("䪦\u0001"));
            sb.append(this.eTag);
            sb.append(ProtectedSandApp.s("䪧\u0001"));
            sb.append(this.size);
            String s4 = ProtectedSandApp.s("䪨\u0001");
            sb.append(s4);
            Owner owner = this.owner;
            if (owner != null) {
                sb.append(owner.toString());
                sb.append(s4);
            }
            sb.append(ProtectedSandApp.s("䪩\u0001"));
            return c.a(sb, this.storageClass, ProtectedSandApp.s("䪪\u0001"));
        }
    }

    public static class Owner {

        /* renamed from: id, reason: collision with root package name */
        public String f71728id;

        public String toString() {
            return c.a(new StringBuilder(ProtectedSandApp.s("䪫\u0001")), this.f71728id, ProtectedSandApp.s("䪬\u0001"));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("䪭\u0001"));
        sb.append(this.name);
        sb.append(ProtectedSandApp.s("䪮\u0001"));
        sb.append(this.encodingType);
        sb.append(ProtectedSandApp.s("䪯\u0001"));
        sb.append(this.prefix);
        sb.append(ProtectedSandApp.s("䪰\u0001"));
        sb.append(this.marker);
        sb.append(ProtectedSandApp.s("䪱\u0001"));
        sb.append(this.maxKeys);
        sb.append(ProtectedSandApp.s("䪲\u0001"));
        sb.append(this.isTruncated);
        sb.append(ProtectedSandApp.s("䪳\u0001"));
        sb.append(this.nextMarker);
        String s4 = ProtectedSandApp.s("䪴\u0001");
        sb.append(s4);
        List<Contents> list = this.contentsList;
        if (list != null) {
            for (Contents contents : list) {
                if (contents != null) {
                    sb.append(contents.toString());
                    sb.append(s4);
                }
            }
        }
        List<CommonPrefixes> list2 = this.commonPrefixesList;
        if (list2 != null) {
            for (CommonPrefixes commonPrefixes : list2) {
                if (commonPrefixes != null) {
                    sb.append(commonPrefixes.toString());
                    sb.append(s4);
                }
            }
        }
        sb.append(ProtectedSandApp.s("䪵\u0001"));
        return c.a(sb, this.delimiter, ProtectedSandApp.s("䪶\u0001"));
    }
}
