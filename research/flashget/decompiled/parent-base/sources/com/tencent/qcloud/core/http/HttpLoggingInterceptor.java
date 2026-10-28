package com.tencent.qcloud.core.http;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.c0;
import okhttp3.d0;
import okhttp3.f0;
import okhttp3.j;
import okhttp3.w;

/* loaded from: classes7.dex */
public final class HttpLoggingInterceptor implements w {
    private volatile Level level = Level.NONE;
    private final Logger logger;

    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    public interface Logger {
        void logException(Exception exc, String str);

        void logRequest(String str);

        void logResponse(f0 f0Var, String str);
    }

    public HttpLoggingInterceptor(Logger logger) {
        this.logger = logger;
    }

    public Level getLevel() {
        return this.level;
    }

    @Override // okhttp3.w
    public f0 intercept(w.a aVar) throws IOException {
        Level level = this.level;
        d0 h4 = aVar.h();
        if (level == Level.NONE) {
            return aVar.c(h4);
        }
        j f4 = aVar.f();
        OkHttpLoggingUtils.logRequest(h4, f4 != null ? f4.a() : c0.HTTP_1_1, level, this.logger);
        long nanoTime = System.nanoTime();
        try {
            f0 c5 = aVar.c(h4);
            OkHttpLoggingUtils.logResponse(c5, TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime), level, this.logger);
            return c5;
        } catch (Exception e4) {
            this.logger.logException(e4, ProtectedSandApp.s("奼\u0001") + e4);
            throw e4;
        }
    }

    public HttpLoggingInterceptor setLevel(Level level) {
        if (level == null) {
            throw new NullPointerException(ProtectedSandApp.s("好\u0001"));
        }
        this.level = level;
        return this;
    }
}
