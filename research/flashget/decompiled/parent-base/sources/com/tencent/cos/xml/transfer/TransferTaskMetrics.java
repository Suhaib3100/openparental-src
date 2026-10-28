package com.tencent.cos.xml.transfer;

import androidx.collection.y0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.net.InetAddress;

/* loaded from: classes7.dex */
public class TransferTaskMetrics {
    InetAddress connectAddress;
    String domain;
    private long firstProgressTookTime;
    long size;
    private long tookTime;
    private long waitTookTime;
    private long startTime = 0;
    private long progressTime = 0;
    private long firstProgressCallbackTime = 0;
    private long completeTime = 0;

    private long tookTime(long j4) {
        return Math.max(-1L, j4 - this.startTime) / 1000000;
    }

    public InetAddress getConnectAddress() {
        return this.connectAddress;
    }

    public String getDomain() {
        return this.domain;
    }

    public long getFirstProgressTookTime() {
        return this.firstProgressTookTime;
    }

    public long getSize() {
        return this.size;
    }

    public long getTookTime() {
        return this.tookTime;
    }

    public long getWaitTookTime() {
        return this.waitTookTime;
    }

    void onComplete() {
        long nanoTime = System.nanoTime();
        this.completeTime = nanoTime;
        this.tookTime = tookTime(nanoTime);
        this.waitTookTime = tookTime(this.progressTime);
        this.firstProgressTookTime = tookTime(this.firstProgressCallbackTime);
    }

    void onFirstProgressCallback() {
        if (this.firstProgressCallbackTime <= this.progressTime) {
            this.firstProgressCallbackTime = System.nanoTime();
        }
    }

    void onInProgress() {
        long nanoTime = System.nanoTime();
        this.progressTime = nanoTime;
        this.firstProgressCallbackTime = nanoTime;
    }

    void onStart() {
        this.startTime = System.nanoTime();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("俈\u0001"));
        sb.append(this.domain);
        sb.append(ProtectedSandApp.s("俉\u0001"));
        sb.append(this.connectAddress);
        sb.append(ProtectedSandApp.s("俊\u0001"));
        sb.append(this.size);
        sb.append(ProtectedSandApp.s("俋\u0001"));
        sb.append(this.tookTime);
        sb.append(ProtectedSandApp.s("俌\u0001"));
        sb.append(this.waitTookTime);
        sb.append(ProtectedSandApp.s("俍\u0001"));
        return y0.a(sb, this.firstProgressTookTime, '}');
    }
}
