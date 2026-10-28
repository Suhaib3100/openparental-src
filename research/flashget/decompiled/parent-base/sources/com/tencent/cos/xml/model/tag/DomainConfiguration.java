package com.tencent.cos.xml.model.tag;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;

/* loaded from: classes7.dex */
public class DomainConfiguration {
    public List<DomainRule> domainRules;
    public static final String TYPE_WEBSITE = ProtectedSandApp.s("䨳\u0001");
    public static final String STATUS_DISABLED = ProtectedSandApp.s("䨴\u0001");
    public static final String TYPE_REST = ProtectedSandApp.s("䨵\u0001");
    public static final String STATUS_ENABLED = ProtectedSandApp.s("䨶\u0001");
    public static final String REPLACE_TXT = ProtectedSandApp.s("䨷\u0001");
    public static final String REPLACE_CNAME = ProtectedSandApp.s("䨸\u0001");

    public static class DomainRule {
        public String forcedReplacement;
        public String name;
        public String status;
        public String type;

        public DomainRule(String str, String str2, String str3) {
            this.status = str;
            this.name = str2;
            this.type = str3;
        }

        public DomainRule() {
        }
    }
}
