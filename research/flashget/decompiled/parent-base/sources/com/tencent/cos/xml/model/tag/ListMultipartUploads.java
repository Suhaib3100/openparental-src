package com.tencent.cos.xml.model.tag;

import android.support.v4.media.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;

/* loaded from: classes7.dex */
public class ListMultipartUploads {
    public String bucket;
    public List<CommonPrefixes> commonPrefixes;
    public String delimiter;
    public String encodingType;
    public boolean isTruncated;
    public String keyMarker;
    public String maxUploads;
    public String nextKeyMarker;
    public String nextUploadIdMarker;
    public String prefix;
    public String uploadIdMarker;
    public List<Upload> uploads;

    public static class CommonPrefixes {
        public String prefix;

        public String toString() {
            return c.a(new StringBuilder(ProtectedSandApp.s("䫗\u0001")), this.prefix, ProtectedSandApp.s("䫘\u0001"));
        }
    }

    public static class Initiator {
        public String displayName;

        /* renamed from: id, reason: collision with root package name */
        public String f71729id;
        public String uin;

        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("䫙\u0001"));
            sb.append(this.uin);
            sb.append(ProtectedSandApp.s("䫚\u0001"));
            sb.append(this.f71729id);
            sb.append(ProtectedSandApp.s("䫛\u0001"));
            return c.a(sb, this.displayName, ProtectedSandApp.s("䫜\u0001"));
        }
    }

    public static class Owner {
        public String displayName;

        /* renamed from: id, reason: collision with root package name */
        public String f71730id;
        public String uid;

        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("䫝\u0001"));
            sb.append(this.uid);
            sb.append(ProtectedSandApp.s("䫞\u0001"));
            sb.append(this.f71730id);
            sb.append(ProtectedSandApp.s("䫟\u0001"));
            return c.a(sb, this.displayName, ProtectedSandApp.s("䫠\u0001"));
        }
    }

    public static class Upload {
        public String initiated;
        public Initiator initiator;
        public String key;
        public Owner owner;
        public String storageClass;
        public String uploadID;

        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("䫡\u0001"));
            sb.append(this.key);
            sb.append(ProtectedSandApp.s("䫢\u0001"));
            sb.append(this.uploadID);
            sb.append(ProtectedSandApp.s("䫣\u0001"));
            sb.append(this.storageClass);
            String s4 = ProtectedSandApp.s("䫤\u0001");
            sb.append(s4);
            Initiator initiator = this.initiator;
            if (initiator != null) {
                sb.append(initiator.toString());
                sb.append(s4);
            }
            Owner owner = this.owner;
            if (owner != null) {
                sb.append(owner.toString());
                sb.append(s4);
            }
            sb.append(ProtectedSandApp.s("䫥\u0001"));
            return c.a(sb, this.initiated, ProtectedSandApp.s("䫦\u0001"));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("䫧\u0001"));
        sb.append(this.bucket);
        sb.append(ProtectedSandApp.s("䫨\u0001"));
        sb.append(this.encodingType);
        sb.append(ProtectedSandApp.s("䫩\u0001"));
        sb.append(this.keyMarker);
        sb.append(ProtectedSandApp.s("䫪\u0001"));
        sb.append(this.uploadIdMarker);
        sb.append(ProtectedSandApp.s("䫫\u0001"));
        sb.append(this.nextKeyMarker);
        sb.append(ProtectedSandApp.s("䫬\u0001"));
        sb.append(this.nextUploadIdMarker);
        sb.append(ProtectedSandApp.s("䫭\u0001"));
        sb.append(this.maxUploads);
        sb.append(ProtectedSandApp.s("䫮\u0001"));
        sb.append(this.isTruncated);
        sb.append(ProtectedSandApp.s("䫯\u0001"));
        sb.append(this.prefix);
        sb.append(ProtectedSandApp.s("䫰\u0001"));
        sb.append(this.delimiter);
        String s4 = ProtectedSandApp.s("䫱\u0001");
        sb.append(s4);
        List<Upload> list = this.uploads;
        if (list != null) {
            for (Upload upload : list) {
                if (upload != null) {
                    sb.append(upload.toString());
                    sb.append(s4);
                }
            }
        }
        List<CommonPrefixes> list2 = this.commonPrefixes;
        if (list2 != null) {
            for (CommonPrefixes commonPrefixes : list2) {
                if (commonPrefixes != null) {
                    sb.append(commonPrefixes.toString());
                    sb.append(s4);
                }
            }
        }
        sb.append(ProtectedSandApp.s("䫲\u0001"));
        return sb.toString();
    }
}
