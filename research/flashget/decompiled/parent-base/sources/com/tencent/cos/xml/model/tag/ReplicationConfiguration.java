package com.tencent.cos.xml.model.tag;

import android.support.v4.media.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;

/* loaded from: classes7.dex */
public class ReplicationConfiguration {
    public String role;
    public List<Rule> rules;

    public static class Destination {
        public String bucket;
        public String storageClass;

        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("䮻\u0001"));
            sb.append(this.bucket);
            sb.append(ProtectedSandApp.s("䮼\u0001"));
            return c.a(sb, this.storageClass, ProtectedSandApp.s("䮽\u0001"));
        }
    }

    public static class Rule {
        public Destination destination;

        /* renamed from: id, reason: collision with root package name */
        public String f71734id;
        public String prefix;
        public String status;

        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("䮾\u0001"));
            sb.append(this.f71734id);
            sb.append(ProtectedSandApp.s("䮿\u0001"));
            sb.append(this.status);
            sb.append(ProtectedSandApp.s("䯀\u0001"));
            sb.append(this.prefix);
            String s4 = ProtectedSandApp.s("䯁\u0001");
            sb.append(s4);
            Destination destination = this.destination;
            if (destination != null) {
                sb.append(destination.toString());
                sb.append(s4);
            }
            sb.append(ProtectedSandApp.s("䯂\u0001"));
            return sb.toString();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("䯃\u0001"));
        sb.append(this.role);
        String s4 = ProtectedSandApp.s("䯄\u0001");
        sb.append(s4);
        List<Rule> list = this.rules;
        if (list != null) {
            for (Rule rule : list) {
                if (rule != null) {
                    sb.append(rule.toString());
                    sb.append(s4);
                }
            }
        }
        sb.append(ProtectedSandApp.s("䯅\u0001"));
        return sb.toString();
    }
}
