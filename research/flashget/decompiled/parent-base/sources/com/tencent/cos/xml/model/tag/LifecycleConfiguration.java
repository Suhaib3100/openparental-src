package com.tencent.cos.xml.model.tag;

import android.support.v4.media.b;
import android.support.v4.media.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;

/* loaded from: classes7.dex */
public class LifecycleConfiguration {
    public List<Rule> rules;

    public static class AbortIncompleteMultiUpload {
        public int daysAfterInitiation;

        public String toString() {
            return b.a(new StringBuilder(ProtectedSandApp.s("䩱\u0001")), this.daysAfterInitiation, ProtectedSandApp.s("䩲\u0001"));
        }
    }

    public static class Expiration {
        public String date;
        public int days;
        public String expiredObjectDeleteMarker;

        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("䩳\u0001"));
            sb.append(this.days);
            sb.append(ProtectedSandApp.s("䩴\u0001"));
            sb.append(this.date);
            sb.append(ProtectedSandApp.s("䩵\u0001"));
            return c.a(sb, this.expiredObjectDeleteMarker, ProtectedSandApp.s("䩶\u0001"));
        }
    }

    public static class Filter {
        public String prefix;

        public String toString() {
            return c.a(new StringBuilder(ProtectedSandApp.s("䩷\u0001")), this.prefix, ProtectedSandApp.s("䩸\u0001"));
        }
    }

    public static class NoncurrentVersionExpiration {
        public int noncurrentDays;

        public String toString() {
            return b.a(new StringBuilder(ProtectedSandApp.s("䩹\u0001")), this.noncurrentDays, ProtectedSandApp.s("䩺\u0001"));
        }
    }

    public static class NoncurrentVersionTransition {
        public int noncurrentDays;
        public String storageClass;

        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("䩻\u0001"));
            sb.append(this.noncurrentDays);
            sb.append(ProtectedSandApp.s("䩼\u0001"));
            return c.a(sb, this.storageClass, ProtectedSandApp.s("䩽\u0001"));
        }
    }

    public static class Rule {
        public AbortIncompleteMultiUpload abortIncompleteMultiUpload;
        public Expiration expiration;
        public Filter filter;

        /* renamed from: id, reason: collision with root package name */
        public String f71726id;
        public NoncurrentVersionExpiration noncurrentVersionExpiration;
        public NoncurrentVersionTransition noncurrentVersionTransition;
        public String status;
        public Transition transition;

        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("䩾\u0001"));
            sb.append(this.f71726id);
            String s4 = ProtectedSandApp.s("䩿\u0001");
            sb.append(s4);
            Filter filter = this.filter;
            if (filter != null) {
                sb.append(filter.toString());
                sb.append(s4);
            }
            sb.append(ProtectedSandApp.s("䪀\u0001"));
            sb.append(this.status);
            sb.append(s4);
            Transition transition = this.transition;
            if (transition != null) {
                sb.append(transition.toString());
                sb.append(s4);
            }
            Expiration expiration = this.expiration;
            if (expiration != null) {
                sb.append(expiration.toString());
                sb.append(s4);
            }
            NoncurrentVersionExpiration noncurrentVersionExpiration = this.noncurrentVersionExpiration;
            if (noncurrentVersionExpiration != null) {
                sb.append(noncurrentVersionExpiration.toString());
                sb.append(s4);
            }
            NoncurrentVersionTransition noncurrentVersionTransition = this.noncurrentVersionTransition;
            if (noncurrentVersionTransition != null) {
                sb.append(noncurrentVersionTransition.toString());
                sb.append(s4);
            }
            AbortIncompleteMultiUpload abortIncompleteMultiUpload = this.abortIncompleteMultiUpload;
            if (abortIncompleteMultiUpload != null) {
                sb.append(abortIncompleteMultiUpload.toString());
                sb.append(s4);
            }
            sb.append(ProtectedSandApp.s("䪁\u0001"));
            return sb.toString();
        }
    }

    public static class Transition {
        public String date;
        public int days;
        public String storageClass;

        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("䪂\u0001"));
            sb.append(this.days);
            sb.append(ProtectedSandApp.s("䪃\u0001"));
            sb.append(this.date);
            sb.append(ProtectedSandApp.s("䪄\u0001"));
            return c.a(sb, this.storageClass, ProtectedSandApp.s("䪅\u0001"));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("䪆\u0001"));
        List<Rule> list = this.rules;
        if (list != null) {
            for (Rule rule : list) {
                if (rule != null) {
                    sb.append(rule.toString());
                    sb.append(ProtectedSandApp.s("䪇\u0001"));
                }
            }
        }
        sb.append(ProtectedSandApp.s("䪈\u0001"));
        return sb.toString();
    }
}
