package com.tencent.qcloud.core.http;

import android.text.TextUtils;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.net.InetAddress;
import java.util.List;

/* loaded from: classes7.dex */
public class HttpTaskMetrics {
    private long calculateMD5STookTime;
    private long calculateMD5StartTime;

    @q0
    InetAddress connectAddress;
    long connectStartTimestamp;
    long connectTookTime;
    long dnsLookupTookTime;
    long dnsStartTimestamp;

    @q0
    String domainName;
    private long fullTaskStartTime;
    private long fullTaskTookTime;
    private long httpTaskStartTime;
    private long httpTaskTookTime;
    private boolean isClockSkewedRetry;
    long readResponseBodyStartTimestamp;
    long readResponseBodyTookTime;
    long readResponseHeaderStartTimestamp;
    long readResponseHeaderTookTime;

    @q0
    List<InetAddress> remoteAddress;
    long requestBodyByteCount;
    long responseBodyByteCount;
    private int retryCount;
    long secureConnectStartTimestamp;
    long secureConnectTookTime;
    private long signRequestStartTime;
    private long signRequestTookTime;
    long writeRequestBodyStartTimestamp;
    long writeRequestBodyTookTime;
    long writeRequestHeaderStartTimestamp;
    long writeRequestHeaderTookTime;

    public static HttpTaskMetrics createMetricsWithHost(String str) {
        HttpTaskMetrics httpTaskMetrics = new HttpTaskMetrics();
        httpTaskMetrics.domainName = str;
        return httpTaskMetrics;
    }

    private double toSeconds(long j4) {
        return j4 / 1.0E9d;
    }

    public double calculateMD5STookTime() {
        return toSeconds(this.calculateMD5STookTime);
    }

    public double connectTookTime() {
        return toSeconds(this.connectTookTime);
    }

    public double dnsLookupTookTime() {
        return toSeconds(this.dnsLookupTookTime);
    }

    public double fullTaskTookTime() {
        return toSeconds(this.fullTaskTookTime);
    }

    @q0
    public InetAddress getConnectAddress() {
        return this.connectAddress;
    }

    @q0
    public String getDomainName() {
        return this.domainName;
    }

    @q0
    public List<InetAddress> getRemoteAddress() {
        return this.remoteAddress;
    }

    public int getRetryCount() {
        return this.retryCount;
    }

    public double httpTaskFullTime() {
        return toSeconds(this.httpTaskTookTime);
    }

    public boolean isClockSkewedRetry() {
        return this.isClockSkewedRetry;
    }

    public synchronized HttpTaskMetrics merge(HttpTaskMetrics httpTaskMetrics) {
        String str;
        if (!TextUtils.isEmpty(this.domainName) && !TextUtils.isEmpty(httpTaskMetrics.domainName) && !this.domainName.equals(httpTaskMetrics.domainName)) {
            return this;
        }
        if (TextUtils.isEmpty(this.domainName) && (str = httpTaskMetrics.domainName) != null) {
            this.domainName = str;
        }
        this.dnsLookupTookTime = Math.max(httpTaskMetrics.dnsLookupTookTime, this.dnsLookupTookTime);
        this.connectTookTime = Math.max(httpTaskMetrics.connectTookTime, this.connectTookTime);
        this.secureConnectTookTime = Math.max(httpTaskMetrics.secureConnectTookTime, this.secureConnectTookTime);
        this.writeRequestHeaderTookTime += httpTaskMetrics.writeRequestHeaderTookTime;
        this.writeRequestBodyTookTime += httpTaskMetrics.writeRequestBodyTookTime;
        this.readResponseHeaderTookTime += httpTaskMetrics.readResponseHeaderTookTime;
        this.readResponseBodyTookTime += httpTaskMetrics.readResponseBodyTookTime;
        this.requestBodyByteCount += httpTaskMetrics.requestBodyByteCount;
        this.responseBodyByteCount += httpTaskMetrics.responseBodyByteCount;
        this.fullTaskTookTime += httpTaskMetrics.fullTaskTookTime;
        this.httpTaskTookTime += httpTaskMetrics.httpTaskTookTime;
        this.calculateMD5STookTime += httpTaskMetrics.calculateMD5STookTime;
        this.signRequestTookTime += httpTaskMetrics.signRequestTookTime;
        if (httpTaskMetrics.getRemoteAddress() != null) {
            this.remoteAddress = httpTaskMetrics.getRemoteAddress();
        }
        if (httpTaskMetrics.connectAddress != null) {
            this.connectAddress = httpTaskMetrics.getConnectAddress();
        }
        this.retryCount += httpTaskMetrics.retryCount;
        if (!this.isClockSkewedRetry) {
            this.isClockSkewedRetry = httpTaskMetrics.isClockSkewedRetry;
        }
        return this;
    }

    void onCalculateMD5End() {
        this.calculateMD5STookTime = (System.nanoTime() - this.calculateMD5StartTime) + this.calculateMD5STookTime;
    }

    void onCalculateMD5Start() {
        this.calculateMD5StartTime = System.nanoTime();
    }

    public void onDataReady() {
    }

    void onHttpTaskEnd() {
        if (this.httpTaskStartTime != 0) {
            this.httpTaskTookTime = System.nanoTime() - this.httpTaskStartTime;
        }
    }

    void onHttpTaskStart() {
        this.httpTaskStartTime = System.nanoTime();
    }

    void onSignRequestEnd() {
        this.signRequestTookTime = (System.nanoTime() - this.signRequestStartTime) + this.signRequestTookTime;
    }

    void onSignRequestStart() {
        this.signRequestStartTime = System.nanoTime();
    }

    void onTaskEnd() {
        this.fullTaskTookTime = System.nanoTime() - this.fullTaskStartTime;
        onDataReady();
    }

    void onTaskStart() {
        this.fullTaskStartTime = System.nanoTime();
    }

    public double readResponseBodyTookTime() {
        return toSeconds(this.readResponseBodyTookTime);
    }

    public double readResponseHeaderTookTime() {
        return toSeconds(this.readResponseHeaderTookTime);
    }

    public void recordConnectAddress(InetAddress inetAddress) {
        if (inetAddress != null) {
            this.connectAddress = inetAddress;
        }
    }

    public long requestBodyByteCount() {
        return this.requestBodyByteCount;
    }

    public long responseBodyByteCount() {
        return this.responseBodyByteCount;
    }

    public double secureConnectTookTime() {
        return toSeconds(this.secureConnectTookTime);
    }

    public void setClockSkewedRetry(boolean z4) {
        this.isClockSkewedRetry = z4;
    }

    public void setDomainName(@q0 String str) {
        this.domainName = str;
    }

    public void setRetryCount(int i4) {
        this.retryCount = i4;
    }

    public double signRequestTookTime() {
        return toSeconds(this.signRequestTookTime);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.util.List<java.net.InetAddress>] */
    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("佱\u0001"));
        sb.append(this.domainName);
        sb.append(ProtectedSandApp.s("佲\u0001"));
        InetAddress inetAddress = this.connectAddress;
        String s4 = ProtectedSandApp.s("佳\u0001");
        sb.append(inetAddress != null ? inetAddress.getHostAddress() : s4);
        sb.append(ProtectedSandApp.s("佴\u0001"));
        sb.append(this.retryCount);
        sb.append(ProtectedSandApp.s("併\u0001"));
        sb.append(this.isClockSkewedRetry);
        sb.append(ProtectedSandApp.s("佶\u0001"));
        ?? r12 = this.remoteAddress;
        if (r12 != 0) {
            s4 = r12;
        }
        sb.append((Object) s4);
        sb.append(ProtectedSandApp.s("佷\u0001"));
        sb.append(fullTaskTookTime());
        sb.append(ProtectedSandApp.s("佸\u0001"));
        sb.append(httpTaskFullTime());
        sb.append(ProtectedSandApp.s("佹\u0001"));
        sb.append(calculateMD5STookTime());
        sb.append(ProtectedSandApp.s("佺\u0001"));
        sb.append(signRequestTookTime());
        sb.append(ProtectedSandApp.s("佻\u0001"));
        sb.append(this.dnsStartTimestamp);
        sb.append(ProtectedSandApp.s("佼\u0001"));
        sb.append(dnsLookupTookTime());
        sb.append(ProtectedSandApp.s("佽\u0001"));
        sb.append(this.connectStartTimestamp);
        sb.append(ProtectedSandApp.s("佾\u0001"));
        sb.append(connectTookTime());
        sb.append(ProtectedSandApp.s("使\u0001"));
        sb.append(this.secureConnectStartTimestamp);
        sb.append(ProtectedSandApp.s("侀\u0001"));
        sb.append(secureConnectTookTime());
        sb.append(ProtectedSandApp.s("侁\u0001"));
        sb.append(this.writeRequestHeaderStartTimestamp);
        sb.append(ProtectedSandApp.s("侂\u0001"));
        sb.append(writeRequestHeaderTookTime());
        sb.append(ProtectedSandApp.s("侃\u0001"));
        sb.append(this.writeRequestBodyStartTimestamp);
        sb.append(ProtectedSandApp.s("侄\u0001"));
        sb.append(writeRequestBodyTookTime());
        sb.append(ProtectedSandApp.s("侅\u0001"));
        sb.append(this.readResponseHeaderStartTimestamp);
        sb.append(ProtectedSandApp.s("來\u0001"));
        sb.append(readResponseHeaderTookTime());
        sb.append(ProtectedSandApp.s("侇\u0001"));
        sb.append(this.readResponseBodyStartTimestamp);
        sb.append(ProtectedSandApp.s("侈\u0001"));
        sb.append(readResponseBodyTookTime());
        return sb.toString();
    }

    public double writeRequestBodyTookTime() {
        return toSeconds(this.writeRequestBodyTookTime);
    }

    public double writeRequestHeaderTookTime() {
        return toSeconds(this.writeRequestHeaderTookTime);
    }
}
