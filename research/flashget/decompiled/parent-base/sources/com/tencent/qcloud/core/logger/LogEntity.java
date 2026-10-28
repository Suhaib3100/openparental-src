package com.tencent.qcloud.core.logger;

import android.util.Log;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes7.dex */
public class LogEntity {
    private final LogCategory category;

    @q0
    private final Map<String, String> extras;
    private final LogLevel level;
    private final String message;
    private final String tag;

    @q0
    private final Throwable throwable;
    private final long timestamp = System.currentTimeMillis();
    private final String threadName = Thread.currentThread().getName();

    public LogEntity(LogLevel logLevel, LogCategory logCategory, String str, String str2, @q0 Map<String, String> map, @q0 Throwable th) {
        this.level = logLevel;
        this.category = logCategory;
        this.tag = str;
        this.message = str2;
        this.extras = map;
        this.throwable = th;
    }

    private static String timeUtils(long j4, String str) {
        Date date = new Date(j4);
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(date);
        return new SimpleDateFormat(str, Locale.CHINA).format(gregorianCalendar.getTime());
    }

    public LogCategory getCategory() {
        return this.category;
    }

    @q0
    public Map<String, String> getExtras() {
        return this.extras;
    }

    public long getLength() {
        return (this.message != null ? r0.length() : 0) + 40;
    }

    public LogLevel getLevel() {
        return this.level;
    }

    public String getLogcatString() {
        if (getExtras() == null || getExtras().isEmpty()) {
            return String.format(ProtectedSandApp.s("媅\u0001"), getCategory().name(), getThreadName(), getMessage());
        }
        return String.format(ProtectedSandApp.s("媄\u0001"), getCategory().name(), getThreadName(), getMessage(), getExtras());
    }

    public String getMessage() {
        return this.message;
    }

    public String getTag() {
        return this.tag;
    }

    public String getThreadName() {
        return this.threadName;
    }

    @q0
    public Throwable getThrowable() {
        return this.throwable;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    @o0
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.level);
        sb.append(ProtectedSandApp.s("媆\u0001"));
        sb.append(timeUtils(this.timestamp, ProtectedSandApp.s("媇\u0001")));
        sb.append(ProtectedSandApp.s("媈\u0001"));
        sb.append(this.threadName);
        String s4 = ProtectedSandApp.s("媉\u0001");
        sb.append(s4);
        sb.append(this.category);
        sb.append(ProtectedSandApp.s("媊\u0001"));
        sb.append(this.tag);
        sb.append(s4);
        sb.append(this.message);
        sb.append(s4);
        sb.append(this.extras);
        sb.append(ProtectedSandApp.s("媋\u0001"));
        if (this.throwable != null) {
            sb.append(ProtectedSandApp.s("媌\u0001"));
            sb.append(Log.getStackTraceString(this.throwable));
        }
        sb.append(ProtectedSandApp.s("媍\u0001"));
        return sb.toString();
    }
}
