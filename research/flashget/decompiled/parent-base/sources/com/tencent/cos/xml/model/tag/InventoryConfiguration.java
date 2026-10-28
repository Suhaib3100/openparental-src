package com.tencent.cos.xml.model.tag;

import android.support.v4.media.c;
import androidx.concurrent.futures.a;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes7.dex */
public class InventoryConfiguration {
    public Destination destination;
    public Filter filter;

    /* renamed from: id, reason: collision with root package name */
    public String f71725id;
    public String includedObjectVersions;
    public boolean isEnabled;
    public OptionalFields optionalFields;
    public Schedule schedule;
    public static final String SCHEDULE_FREQUENCY_WEEKLY = ProtectedSandApp.s("䩯\u0001");
    public static final String SCHEDULE_FREQUENCY_DAILY = ProtectedSandApp.s("䩰\u0001");

    public static class COSBucketDestination {
        public String accountId;
        public String bucket;
        public Encryption encryption;
        public String format;
        public String prefix;

        public void setBucket(String str, String str2) {
            if (str == null || str2 == null) {
                return;
            }
            this.bucket = String.format(ProtectedSandApp.s("䩄\u0001"), str, str2);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("䩅\u0001"));
            sb.append(this.format);
            sb.append(ProtectedSandApp.s("䩆\u0001"));
            sb.append(this.accountId);
            sb.append(ProtectedSandApp.s("䩇\u0001"));
            sb.append(this.bucket);
            sb.append(ProtectedSandApp.s("䩈\u0001"));
            sb.append(this.prefix);
            String s4 = ProtectedSandApp.s("䩉\u0001");
            sb.append(s4);
            Encryption encryption = this.encryption;
            if (encryption != null) {
                sb.append(encryption.toString());
                sb.append(s4);
            }
            sb.append(ProtectedSandApp.s("䩊\u0001"));
            return sb.toString();
        }
    }

    public static class Destination {
        public COSBucketDestination cosBucketDestination;

        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("䩋\u0001"));
            COSBucketDestination cOSBucketDestination = this.cosBucketDestination;
            if (cOSBucketDestination != null) {
                sb.append(cOSBucketDestination.toString());
                sb.append(ProtectedSandApp.s("䩌\u0001"));
            }
            sb.append(ProtectedSandApp.s("䩍\u0001"));
            return sb.toString();
        }
    }

    public static class Encryption {
        public String sSECOS;

        public String toString() {
            return c.a(new StringBuilder(ProtectedSandApp.s("䩎\u0001")), this.sSECOS, ProtectedSandApp.s("䩏\u0001"));
        }
    }

    public enum Field {
        SIZE(ProtectedSandApp.s("䩐\u0001")),
        LastModified_Date(ProtectedSandApp.s("䩒\u0001")),
        StroageClass(ProtectedSandApp.s("䩔\u0001")),
        ETAG(ProtectedSandApp.s("䩖\u0001")),
        IS_MULTIPARTUPLOADed(ProtectedSandApp.s("䩘\u0001")),
        REPLICATION_STATUS(ProtectedSandApp.s("䩚\u0001"));

        String value;

        Field(String str) {
            this.value = str;
        }

        public String getValue() {
            return this.value;
        }
    }

    public static class Filter {
        public String prefix;

        public String toString() {
            return c.a(new StringBuilder(ProtectedSandApp.s("䩜\u0001")), this.prefix, ProtectedSandApp.s("䩝\u0001"));
        }
    }

    public enum Frequency {
        DAILY(ProtectedSandApp.s("䩞\u0001"));

        String value;

        Frequency(String str) {
            this.value = str;
        }

        public String getValue() {
            return this.value;
        }
    }

    public enum IncludedObjectVersions {
        ALL(ProtectedSandApp.s("䩠\u0001")),
        CURRENT(ProtectedSandApp.s("䩢\u0001"));

        private String desc;

        IncludedObjectVersions(String str) {
            this.desc = str;
        }

        public String getDesc() {
            return this.desc;
        }
    }

    public static class OptionalFields {
        public Set<String> fields;

        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("䩤\u0001"));
            Set<String> set = this.fields;
            if (set != null) {
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    a.a(sb, ProtectedSandApp.s("䩥\u0001"), it.next(), ProtectedSandApp.s("䩦\u0001"));
                }
            }
            sb.append(ProtectedSandApp.s("䩧\u0001"));
            return sb.toString();
        }
    }

    public static class Schedule {
        public String frequency;

        public String toString() {
            return c.a(new StringBuilder(ProtectedSandApp.s("䩨\u0001")), this.frequency, ProtectedSandApp.s("䩩\u0001"));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("䩪\u0001"));
        sb.append(this.f71725id);
        sb.append(ProtectedSandApp.s("䩫\u0001"));
        sb.append(this.isEnabled);
        String s4 = ProtectedSandApp.s("䩬\u0001");
        sb.append(s4);
        Destination destination = this.destination;
        if (destination != null) {
            sb.append(destination.toString());
            sb.append(s4);
        }
        Schedule schedule = this.schedule;
        if (schedule != null) {
            sb.append(schedule.toString());
            sb.append(s4);
        }
        Filter filter = this.filter;
        if (filter != null) {
            sb.append(filter.toString());
            sb.append(s4);
        }
        sb.append(ProtectedSandApp.s("䩭\u0001"));
        sb.append(this.includedObjectVersions);
        sb.append(s4);
        OptionalFields optionalFields = this.optionalFields;
        if (optionalFields != null) {
            sb.append(optionalFields.toString());
            sb.append(s4);
        }
        sb.append(ProtectedSandApp.s("䩮\u0001"));
        return sb.toString();
    }
}
