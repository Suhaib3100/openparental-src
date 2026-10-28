package com.tencent.cos.xml.model.tag;

import android.support.v4.media.c;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes7.dex */
public class BucketLoggingStatus {
    public LoggingEnabled loggingEnabled;

    public static class LoggingEnabled {
        public String targetBucket;
        public String targetPrefix;

        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("䧜\u0001"));
            sb.append(this.targetBucket);
            sb.append(ProtectedSandApp.s("䧝\u0001"));
            return c.a(sb, this.targetPrefix, ProtectedSandApp.s("䧞\u0001"));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("䧟\u0001"));
        LoggingEnabled loggingEnabled = this.loggingEnabled;
        if (loggingEnabled != null) {
            sb.append(loggingEnabled.toString());
            sb.append(ProtectedSandApp.s("䧠\u0001"));
        }
        sb.append(ProtectedSandApp.s("䧡\u0001"));
        return sb.toString();
    }
}
