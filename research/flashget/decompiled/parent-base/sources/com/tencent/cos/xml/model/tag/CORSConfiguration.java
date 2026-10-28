package com.tencent.cos.xml.model.tag;

import android.support.v4.media.b;
import androidx.concurrent.futures.a;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;

/* loaded from: classes7.dex */
public class CORSConfiguration {
    public List<CORSRule> corsRules;

    public static class CORSRule {
        public List<String> allowedHeader;
        public List<String> allowedMethod;
        public String allowedOrigin;
        public List<String> exposeHeader;

        /* renamed from: id, reason: collision with root package name */
        public String f71724id;
        public int maxAgeSeconds;

        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("䧢\u0001"));
            sb.append(this.f71724id);
            sb.append(ProtectedSandApp.s("䧣\u0001"));
            sb.append(this.allowedOrigin);
            String s4 = ProtectedSandApp.s("䧤\u0001");
            sb.append(s4);
            List<String> list = this.allowedMethod;
            if (list != null) {
                for (String str : list) {
                    if (str != null) {
                        a.a(sb, ProtectedSandApp.s("䧥\u0001"), str, s4);
                    }
                }
            }
            List<String> list2 = this.allowedHeader;
            if (list2 != null) {
                for (String str2 : list2) {
                    if (str2 != null) {
                        a.a(sb, ProtectedSandApp.s("䧦\u0001"), str2, s4);
                    }
                }
            }
            List<String> list3 = this.exposeHeader;
            if (list3 != null) {
                for (String str3 : list3) {
                    if (str3 != null) {
                        a.a(sb, ProtectedSandApp.s("䧧\u0001"), str3, s4);
                    }
                }
            }
            sb.append(ProtectedSandApp.s("䧨\u0001"));
            return b.a(sb, this.maxAgeSeconds, ProtectedSandApp.s("䧩\u0001"));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("䧪\u0001"));
        List<CORSRule> list = this.corsRules;
        if (list != null) {
            for (CORSRule cORSRule : list) {
                if (cORSRule != null) {
                    sb.append(cORSRule.toString());
                    sb.append(ProtectedSandApp.s("䧫\u0001"));
                }
            }
        }
        sb.append(ProtectedSandApp.s("䧬\u0001"));
        return sb.toString();
    }
}
