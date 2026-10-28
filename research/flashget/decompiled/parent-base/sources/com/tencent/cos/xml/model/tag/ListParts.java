package com.tencent.cos.xml.model.tag;

import android.support.v4.media.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;

/* loaded from: classes7.dex */
public class ListParts {
    public String bucket;
    public String encodingType;
    public Initiator initiator;
    public boolean isTruncated;
    public String key;
    public String maxParts;
    public String nextPartNumberMarker;
    public Owner owner;
    public String partNumberMarker;
    public List<Part> parts;
    public String storageClass;
    public String uploadId;

    public static class Initiator {
        public String disPlayName;

        /* renamed from: id, reason: collision with root package name */
        public String f71731id;

        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("䫳\u0001"));
            sb.append(this.f71731id);
            sb.append(ProtectedSandApp.s("䫴\u0001"));
            return c.a(sb, this.disPlayName, ProtectedSandApp.s("䫵\u0001"));
        }
    }

    public static class Owner {
        public String disPlayName;

        /* renamed from: id, reason: collision with root package name */
        public String f71732id;

        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("䫶\u0001"));
            sb.append(this.f71732id);
            sb.append(ProtectedSandApp.s("䫷\u0001"));
            return c.a(sb, this.disPlayName, ProtectedSandApp.s("䫸\u0001"));
        }
    }

    public static class Part {
        public String eTag;
        public String lastModified;
        public String partNumber;
        public String size;

        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("䫹\u0001"));
            sb.append(this.partNumber);
            sb.append(ProtectedSandApp.s("䫺\u0001"));
            sb.append(this.lastModified);
            sb.append(ProtectedSandApp.s("䫻\u0001"));
            sb.append(this.eTag);
            sb.append(ProtectedSandApp.s("䫼\u0001"));
            return c.a(sb, this.size, ProtectedSandApp.s("䫽\u0001"));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("䫾\u0001"));
        sb.append(this.bucket);
        sb.append(ProtectedSandApp.s("䫿\u0001"));
        sb.append(this.encodingType);
        sb.append(ProtectedSandApp.s("䬀\u0001"));
        sb.append(this.key);
        sb.append(ProtectedSandApp.s("䬁\u0001"));
        sb.append(this.uploadId);
        String s4 = ProtectedSandApp.s("䬂\u0001");
        sb.append(s4);
        Owner owner = this.owner;
        if (owner != null) {
            sb.append(owner.toString());
            sb.append(s4);
        }
        sb.append(ProtectedSandApp.s("䬃\u0001"));
        sb.append(this.partNumberMarker);
        sb.append(s4);
        Initiator initiator = this.initiator;
        if (initiator != null) {
            sb.append(initiator.toString());
            sb.append(s4);
        }
        sb.append(ProtectedSandApp.s("䬄\u0001"));
        sb.append(this.storageClass);
        sb.append(ProtectedSandApp.s("䬅\u0001"));
        sb.append(this.nextPartNumberMarker);
        sb.append(ProtectedSandApp.s("䬆\u0001"));
        sb.append(this.maxParts);
        sb.append(ProtectedSandApp.s("䬇\u0001"));
        sb.append(this.isTruncated);
        sb.append(s4);
        List<Part> list = this.parts;
        if (list != null) {
            for (Part part : list) {
                if (part != null) {
                    sb.append(part.toString());
                    sb.append(s4);
                }
            }
        }
        sb.append(ProtectedSandApp.s("䬈\u0001"));
        return sb.toString();
    }
}
