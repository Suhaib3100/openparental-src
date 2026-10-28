package com.tencent.cos.xml.model.tag;

import android.support.v4.media.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "ListAllMyBucketsResult")
/* loaded from: classes7.dex */
public class ListAllMyBuckets {
    public List<Bucket> buckets;
    public Owner owner;

    @XmlBean(method = XmlBean.GenerateMethod.FROM)
    public static class Bucket {

        @XmlElement(name = "CreationDate")
        public String createDate;
        public String location;
        public String name;
        public String type;

        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("䪔\u0001"));
            sb.append(this.name);
            sb.append(ProtectedSandApp.s("䪕\u0001"));
            sb.append(this.location);
            sb.append(ProtectedSandApp.s("䪖\u0001"));
            return c.a(sb, this.createDate, ProtectedSandApp.s("䪗\u0001"));
        }
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM)
    public static class Owner {

        @XmlElement(name = "DisplayName")
        public String disPlayName;

        /* renamed from: id, reason: collision with root package name */
        @XmlElement(name = "ID")
        public String f71727id;

        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("䪛\u0001"));
            sb.append(this.f71727id);
            sb.append(ProtectedSandApp.s("䪜\u0001"));
            return c.a(sb, this.disPlayName, ProtectedSandApp.s("䪝\u0001"));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("䪞\u0001"));
        Owner owner = this.owner;
        String s4 = ProtectedSandApp.s("䪟\u0001");
        if (owner != null) {
            sb.append(owner.toString());
            sb.append(s4);
        }
        sb.append(ProtectedSandApp.s("䪠\u0001"));
        for (Bucket bucket : this.buckets) {
            if (bucket != null) {
                sb.append(bucket.toString());
                sb.append(s4);
            }
        }
        sb.append(ProtectedSandApp.s("䪡\u0001"));
        return sb.toString();
    }
}
