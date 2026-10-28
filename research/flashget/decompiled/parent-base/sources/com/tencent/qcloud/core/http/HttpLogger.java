package com.tencent.qcloud.core.http;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.core.http.HttpLoggingInterceptor;
import com.tencent.qcloud.core.logger.COSLogger;
import okhttp3.f0;

/* loaded from: classes7.dex */
public class HttpLogger implements HttpLoggingInterceptor.Logger {
    private String tag;

    public HttpLogger(String str) {
        this.tag = str;
    }

    @Override // com.tencent.qcloud.core.http.HttpLoggingInterceptor.Logger
    public void logException(Exception exc, String str) {
        COSLogger.iNetwork(this.tag, str);
    }

    @Override // com.tencent.qcloud.core.http.HttpLoggingInterceptor.Logger
    public void logRequest(String str) {
        COSLogger.iNetwork(this.tag, str);
    }

    @Override // com.tencent.qcloud.core.http.HttpLoggingInterceptor.Logger
    public void logResponse(f0 f0Var, String str) {
        COSLogger.iNetwork(this.tag, str);
    }

    public void setTag(String str) {
        this.tag = str;
    }

    HttpLogger() {
        this(ProtectedSandApp.s("奷\u0001"));
    }
}
