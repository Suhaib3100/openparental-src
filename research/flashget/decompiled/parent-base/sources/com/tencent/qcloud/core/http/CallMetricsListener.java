package com.tencent.qcloud.core.http;

import androidx.annotation.o0;
import androidx.collection.y0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.core.logger.COSLogger;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Iterator;
import java.util.List;
import okhttp3.c0;
import okhttp3.d0;
import okhttp3.e;
import okhttp3.f0;
import okhttp3.r;
import okhttp3.t;

/* loaded from: classes7.dex */
public class CallMetricsListener extends r {
    private InetAddress connectAddress;
    private long connectStartTime;
    private long connectStartTimestamp;
    private long connectTookTime;
    private List<InetAddress> dnsInetAddressList;
    private long dnsLookupTookTime;
    private long dnsStartTime;
    private long dnsStartTimestamp;
    private long readResponseBodyStartTime;
    private long readResponseBodyStartTimestamp;
    private long readResponseBodyTookTime;
    private long readResponseHeaderStartTime;
    private long readResponseHeaderStartTimestamp;
    private long readResponseHeaderTookTime;
    private long requestBodyByteCount;
    private long responseBodyByteCount;
    private long secureConnectStartTime;
    private long secureConnectStartTimestamp;
    private long secureConnectTookTime;
    private long writeRequestBodyStartTime;
    private long writeRequestBodyStartTimestamp;
    private long writeRequestBodyTookTime;
    private long writeRequestHeaderStartTime;
    private long writeRequestHeaderStartTimestamp;
    private long writeRequestHeaderTookTime;

    public CallMetricsListener(e eVar) {
    }

    @Override // okhttp3.r
    public void connectEnd(e eVar, InetSocketAddress inetSocketAddress, Proxy proxy, c0 c0Var) {
        super.connectEnd(eVar, inetSocketAddress, proxy, c0Var);
        this.connectTookTime = (System.nanoTime() - this.connectStartTime) + this.connectTookTime;
        if (inetSocketAddress != null) {
            this.connectAddress = inetSocketAddress.getAddress();
        }
    }

    @Override // okhttp3.r
    public void connectFailed(e eVar, InetSocketAddress inetSocketAddress, Proxy proxy, c0 c0Var, IOException iOException) {
        super.connectFailed(eVar, inetSocketAddress, proxy, c0Var, iOException);
        this.connectTookTime = (System.nanoTime() - this.connectStartTime) + this.connectTookTime;
        if (inetSocketAddress != null) {
            this.connectAddress = inetSocketAddress.getAddress();
        }
    }

    @Override // okhttp3.r
    public void connectStart(e eVar, InetSocketAddress inetSocketAddress, Proxy proxy) {
        super.connectStart(eVar, inetSocketAddress, proxy);
        this.connectStartTime = System.nanoTime();
        this.connectStartTimestamp = System.currentTimeMillis();
    }

    @Override // okhttp3.r
    public void dnsEnd(e eVar, String str, List<InetAddress> list) {
        super.dnsEnd(eVar, str, list);
        StringBuffer stringBuffer = new StringBuffer(ProtectedSandApp.s("夵\u0001"));
        if (list != null) {
            Iterator<InetAddress> it = list.iterator();
            while (it.hasNext()) {
                stringBuffer.append(it.next().getHostAddress());
                stringBuffer.append(ProtectedSandApp.s("夶\u0001"));
            }
        }
        stringBuffer.append(ProtectedSandApp.s("夷\u0001"));
        COSLogger.iNetwork(ProtectedSandApp.s("夺\u0001"), ProtectedSandApp.s("夸\u0001") + str + ProtectedSandApp.s("夹\u0001") + stringBuffer.toString());
        this.dnsLookupTookTime = (System.nanoTime() - this.dnsStartTime) + this.dnsLookupTookTime;
        this.dnsInetAddressList = list;
    }

    @Override // okhttp3.r
    public void dnsStart(e eVar, String str) {
        super.dnsStart(eVar, str);
        this.dnsStartTime = System.nanoTime();
        this.dnsStartTimestamp = System.currentTimeMillis();
    }

    public List<InetAddress> dumpDns() {
        return this.dnsInetAddressList;
    }

    public void dumpMetrics(HttpTaskMetrics httpTaskMetrics) {
        httpTaskMetrics.recordConnectAddress(this.connectAddress);
        httpTaskMetrics.remoteAddress = this.dnsInetAddressList;
        httpTaskMetrics.dnsStartTimestamp += this.dnsStartTimestamp;
        httpTaskMetrics.dnsLookupTookTime += this.dnsLookupTookTime;
        httpTaskMetrics.connectStartTimestamp += this.connectStartTimestamp;
        httpTaskMetrics.connectTookTime += this.connectTookTime;
        httpTaskMetrics.secureConnectStartTimestamp += this.secureConnectStartTimestamp;
        httpTaskMetrics.secureConnectTookTime += this.secureConnectTookTime;
        httpTaskMetrics.writeRequestHeaderStartTimestamp += this.writeRequestHeaderStartTimestamp;
        httpTaskMetrics.writeRequestHeaderTookTime += this.writeRequestHeaderTookTime;
        httpTaskMetrics.writeRequestBodyStartTimestamp += this.writeRequestBodyStartTimestamp;
        httpTaskMetrics.writeRequestBodyTookTime += this.writeRequestBodyTookTime;
        httpTaskMetrics.readResponseHeaderStartTimestamp += this.readResponseHeaderStartTimestamp;
        httpTaskMetrics.readResponseHeaderTookTime += this.readResponseHeaderTookTime;
        httpTaskMetrics.readResponseBodyStartTimestamp += this.readResponseBodyStartTimestamp;
        httpTaskMetrics.readResponseBodyTookTime += this.readResponseBodyTookTime;
        httpTaskMetrics.requestBodyByteCount = this.requestBodyByteCount;
        httpTaskMetrics.responseBodyByteCount = this.responseBodyByteCount;
    }

    @Override // okhttp3.r
    public void requestBodyEnd(e eVar, long j4) {
        super.requestBodyEnd(eVar, j4);
        this.writeRequestBodyTookTime = (System.nanoTime() - this.writeRequestBodyStartTime) + this.writeRequestBodyTookTime;
        this.requestBodyByteCount = j4;
    }

    @Override // okhttp3.r
    public void requestBodyStart(e eVar) {
        super.requestBodyStart(eVar);
        this.writeRequestBodyStartTime = System.nanoTime();
        this.writeRequestBodyStartTimestamp = System.currentTimeMillis();
    }

    @Override // okhttp3.r
    public void requestHeadersEnd(e eVar, d0 d0Var) {
        super.requestHeadersEnd(eVar, d0Var);
        this.writeRequestHeaderTookTime = (System.nanoTime() - this.writeRequestHeaderStartTime) + this.writeRequestHeaderTookTime;
    }

    @Override // okhttp3.r
    public void requestHeadersStart(e eVar) {
        super.requestHeadersStart(eVar);
        this.writeRequestHeaderStartTime = System.nanoTime();
        this.writeRequestHeaderStartTimestamp = System.currentTimeMillis();
    }

    @Override // okhttp3.r
    public void responseBodyEnd(e eVar, long j4) {
        super.responseBodyEnd(eVar, j4);
        this.readResponseBodyTookTime = (System.nanoTime() - this.readResponseBodyStartTime) + this.readResponseBodyTookTime;
        this.responseBodyByteCount = j4;
    }

    @Override // okhttp3.r
    public void responseBodyStart(e eVar) {
        super.responseBodyStart(eVar);
        this.readResponseBodyStartTime = System.nanoTime();
        this.readResponseBodyStartTimestamp = System.currentTimeMillis();
    }

    @Override // okhttp3.r
    public void responseHeadersEnd(e eVar, f0 f0Var) {
        super.responseHeadersEnd(eVar, f0Var);
        this.readResponseHeaderTookTime = (System.nanoTime() - this.readResponseHeaderStartTime) + this.readResponseHeaderTookTime;
    }

    @Override // okhttp3.r
    public void responseHeadersStart(e eVar) {
        super.responseHeadersStart(eVar);
        this.readResponseHeaderStartTime = System.nanoTime();
        this.readResponseHeaderStartTimestamp = System.currentTimeMillis();
    }

    @Override // okhttp3.r
    public void secureConnectEnd(e eVar, t tVar) {
        super.secureConnectEnd(eVar, tVar);
        this.secureConnectTookTime = (System.nanoTime() - this.secureConnectStartTime) + this.secureConnectTookTime;
    }

    @Override // okhttp3.r
    public void secureConnectStart(e eVar) {
        super.secureConnectStart(eVar);
        this.secureConnectStartTime = System.nanoTime();
        this.secureConnectStartTimestamp = System.currentTimeMillis();
    }

    @o0
    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("夻\u0001"));
        sb.append(this.dnsStartTimestamp);
        sb.append(ProtectedSandApp.s("夼\u0001"));
        sb.append(this.dnsLookupTookTime);
        sb.append(ProtectedSandApp.s("夽\u0001"));
        sb.append(this.connectStartTimestamp);
        sb.append(ProtectedSandApp.s("夾\u0001"));
        sb.append(this.connectTookTime);
        sb.append(ProtectedSandApp.s("夿\u0001"));
        sb.append(this.secureConnectStartTimestamp);
        sb.append(ProtectedSandApp.s("奀\u0001"));
        sb.append(this.secureConnectTookTime);
        sb.append(ProtectedSandApp.s("奁\u0001"));
        sb.append(this.writeRequestHeaderStartTimestamp);
        sb.append(ProtectedSandApp.s("奂\u0001"));
        sb.append(this.writeRequestHeaderTookTime);
        sb.append(ProtectedSandApp.s("奃\u0001"));
        sb.append(this.writeRequestBodyStartTimestamp);
        sb.append(ProtectedSandApp.s("奄\u0001"));
        sb.append(this.writeRequestBodyTookTime);
        sb.append(ProtectedSandApp.s("奅\u0001"));
        sb.append(this.readResponseHeaderStartTimestamp);
        sb.append(ProtectedSandApp.s("奆\u0001"));
        sb.append(this.readResponseHeaderTookTime);
        sb.append(ProtectedSandApp.s("奇\u0001"));
        sb.append(this.readResponseBodyStartTimestamp);
        sb.append(ProtectedSandApp.s("奈\u0001"));
        sb.append(this.readResponseBodyTookTime);
        sb.append(ProtectedSandApp.s("奉\u0001"));
        sb.append(this.dnsInetAddressList);
        sb.append(ProtectedSandApp.s("奊\u0001"));
        sb.append(this.connectAddress);
        sb.append(ProtectedSandApp.s("奋\u0001"));
        sb.append(this.requestBodyByteCount);
        sb.append(ProtectedSandApp.s("奌\u0001"));
        return y0.a(sb, this.responseBodyByteCount, '}');
    }
}
