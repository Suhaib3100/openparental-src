package com.tencent.qcloud.core.logger.channel;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.q0;
import com.tencent.qcloud.core.logger.LogEntity;
import com.tencent.qcloud.core.logger.LogLevel;

/* loaded from: classes7.dex */
public class LogcatChannel extends BaseLogChannel {

    /* renamed from: com.tencent.qcloud.core.logger.channel.LogcatChannel$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$tencent$qcloud$core$logger$LogLevel;

        static {
            int[] iArr = new int[LogLevel.values().length];
            $SwitchMap$com$tencent$qcloud$core$logger$LogLevel = iArr;
            try {
                iArr[LogLevel.VERBOSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tencent$qcloud$core$logger$LogLevel[LogLevel.DEBUG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tencent$qcloud$core$logger$LogLevel[LogLevel.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$tencent$qcloud$core$logger$LogLevel[LogLevel.WARN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$tencent$qcloud$core$logger$LogLevel[LogLevel.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private int d(String str, String str2, @q0 Throwable th) {
        return th == null ? Log.d(str, str2) : Log.d(str, str2, th);
    }

    private int e(String str, String str2, @q0 Throwable th) {
        return th == null ? Log.e(str, str2) : Log.e(str, str2, th);
    }

    private int i(String str, String str2, @q0 Throwable th) {
        return th == null ? Log.i(str, str2) : Log.i(str, str2, th);
    }

    private boolean isLoggable(LogEntity logEntity) {
        if (!isEnabled() || logEntity == null || !logEntity.getLevel().isLoggable(getMinLevel()) || TextUtils.isEmpty(logEntity.getTag()) || logEntity.getTag().length() >= 23) {
            return false;
        }
        return Log.isLoggable(logEntity.getTag(), logEntity.getLevel().getPriority() + 1);
    }

    private int v(String str, String str2, @q0 Throwable th) {
        return th == null ? Log.v(str, str2) : Log.v(str, str2, th);
    }

    private int w(String str, String str2, @q0 Throwable th) {
        return th == null ? Log.w(str, str2) : Log.w(str, str2, th);
    }

    @Override // com.tencent.qcloud.core.logger.channel.BaseLogChannel
    public void log(LogEntity logEntity) {
        if (isLoggable(logEntity)) {
            String logcatString = logEntity.getLogcatString();
            int i4 = AnonymousClass1.$SwitchMap$com$tencent$qcloud$core$logger$LogLevel[logEntity.getLevel().ordinal()];
            if (i4 == 1) {
                v(logEntity.getTag(), logcatString, logEntity.getThrowable());
                return;
            }
            if (i4 == 2) {
                d(logEntity.getTag(), logcatString, logEntity.getThrowable());
                return;
            }
            if (i4 == 3) {
                i(logEntity.getTag(), logcatString, logEntity.getThrowable());
            } else if (i4 == 4) {
                w(logEntity.getTag(), logcatString, logEntity.getThrowable());
            } else {
                if (i4 != 5) {
                    return;
                }
                e(logEntity.getTag(), logcatString, logEntity.getThrowable());
            }
        }
    }
}
