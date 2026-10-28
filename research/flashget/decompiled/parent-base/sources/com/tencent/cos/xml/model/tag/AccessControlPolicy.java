package com.tencent.cos.xml.model.tag;

import android.support.v4.media.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;

/* loaded from: classes7.dex */
public class AccessControlPolicy {
    public AccessControlList accessControlList;
    public Owner owner;

    public static class AccessControlList {
        public List<Grant> grants;

        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("䧆\u0001"));
            List<Grant> list = this.grants;
            if (list != null) {
                for (Grant grant : list) {
                    if (grant != null) {
                        sb.append(grant.toString());
                        sb.append(ProtectedSandApp.s("䧇\u0001"));
                    }
                }
            }
            sb.append(ProtectedSandApp.s("䧈\u0001"));
            return sb.toString();
        }
    }

    public static class Grant {
        public Grantee grantee;
        public String permission;

        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("䧉\u0001"));
            Grantee grantee = this.grantee;
            if (grantee != null) {
                sb.append(grantee.toString());
                sb.append(ProtectedSandApp.s("䧊\u0001"));
            }
            sb.append(ProtectedSandApp.s("䧋\u0001"));
            return c.a(sb, this.permission, ProtectedSandApp.s("䧌\u0001"));
        }
    }

    public static class Grantee {
        public String displayName;

        /* renamed from: id, reason: collision with root package name */
        public String f71722id;
        public String uri;

        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("䧍\u0001"));
            sb.append(this.uri);
            sb.append(ProtectedSandApp.s("䧎\u0001"));
            sb.append(this.f71722id);
            sb.append(ProtectedSandApp.s("䧏\u0001"));
            return c.a(sb, this.displayName, ProtectedSandApp.s("䧐\u0001"));
        }
    }

    public static class Owner {
        public String displayName;

        /* renamed from: id, reason: collision with root package name */
        public String f71723id;

        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("䧑\u0001"));
            sb.append(this.f71723id);
            sb.append(ProtectedSandApp.s("䧒\u0001"));
            return c.a(sb, this.displayName, ProtectedSandApp.s("䧓\u0001"));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("䧔\u0001"));
        Owner owner = this.owner;
        String s4 = ProtectedSandApp.s("䧕\u0001");
        if (owner != null) {
            sb.append(owner.toString());
            sb.append(s4);
        }
        AccessControlList accessControlList = this.accessControlList;
        if (accessControlList != null) {
            sb.append(accessControlList.toString());
            sb.append(s4);
        }
        sb.append(ProtectedSandApp.s("䧖\u0001"));
        return sb.toString();
    }
}
