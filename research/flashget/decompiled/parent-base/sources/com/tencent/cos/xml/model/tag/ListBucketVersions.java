package com.tencent.cos.xml.model.tag;

import android.support.v4.media.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public class ListBucketVersions {
    public boolean isTruncated;
    public String keyMarker;
    public long maxKeys;
    public String name;
    public String nextKeyMarker;
    public String nextVersionIdMarker;
    public List<ObjectVersion> objectVersionList;
    public String prefix;
    public String versionIdMarker;

    public static class DeleteMarker extends ObjectVersion {
        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("䪷\u0001"));
            sb.append(this.key);
            sb.append(ProtectedSandApp.s("䪸\u0001"));
            sb.append(this.versionId);
            sb.append(ProtectedSandApp.s("䪹\u0001"));
            sb.append(this.isLatest);
            sb.append(ProtectedSandApp.s("䪺\u0001"));
            sb.append(this.lastModified);
            String s4 = ProtectedSandApp.s("䪻\u0001");
            sb.append(s4);
            Owner owner = this.owner;
            if (owner != null) {
                sb.append(owner.toString());
                sb.append(s4);
            }
            sb.append(ProtectedSandApp.s("䪼\u0001"));
            return sb.toString();
        }
    }

    public static class ObjectVersion {
        public boolean isLatest;
        public String key;
        public String lastModified;
        public Owner owner;
        public String versionId;
    }

    public static class Owner {
        public String uid;

        public String toString() {
            return c.a(new StringBuilder(ProtectedSandApp.s("䪽\u0001")), this.uid, ProtectedSandApp.s("䪾\u0001"));
        }
    }

    public static class Version extends ObjectVersion {
        public String eTag;
        public long size;
        public String storageClass;

        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("䪿\u0001"));
            sb.append(this.key);
            sb.append(ProtectedSandApp.s("䫀\u0001"));
            sb.append(this.versionId);
            sb.append(ProtectedSandApp.s("䫁\u0001"));
            sb.append(this.isLatest);
            sb.append(ProtectedSandApp.s("䫂\u0001"));
            sb.append(this.lastModified);
            sb.append(ProtectedSandApp.s("䫃\u0001"));
            sb.append(this.eTag);
            sb.append(ProtectedSandApp.s("䫄\u0001"));
            sb.append(this.size);
            sb.append(ProtectedSandApp.s("䫅\u0001"));
            sb.append(this.storageClass);
            String s4 = ProtectedSandApp.s("䫆\u0001");
            sb.append(s4);
            Owner owner = this.owner;
            if (owner != null) {
                sb.append(owner.toString());
                sb.append(s4);
            }
            sb.append(ProtectedSandApp.s("䫇\u0001"));
            return sb.toString();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("䫈\u0001"));
        sb.append(this.name);
        sb.append(ProtectedSandApp.s("䫉\u0001"));
        sb.append(this.prefix);
        sb.append(ProtectedSandApp.s("䫊\u0001"));
        sb.append(this.keyMarker);
        sb.append(ProtectedSandApp.s("䫋\u0001"));
        sb.append(this.versionIdMarker);
        sb.append(ProtectedSandApp.s("䫌\u0001"));
        sb.append(this.maxKeys);
        sb.append(ProtectedSandApp.s("䫍\u0001"));
        sb.append(this.isTruncated);
        sb.append(ProtectedSandApp.s("䫎\u0001"));
        sb.append(this.nextKeyMarker);
        sb.append(ProtectedSandApp.s("䫏\u0001"));
        sb.append(this.nextVersionIdMarker);
        String s4 = ProtectedSandApp.s("䫐\u0001");
        sb.append(s4);
        List<ObjectVersion> list = this.objectVersionList;
        if (list != null) {
            Iterator<ObjectVersion> it = list.iterator();
            while (it.hasNext()) {
                sb.append(it.next().toString());
                sb.append(s4);
            }
        }
        sb.append(ProtectedSandApp.s("䫑\u0001"));
        return sb.toString();
    }
}
