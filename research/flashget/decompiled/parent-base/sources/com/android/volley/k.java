package com.android.volley;

import android.annotation.TargetApi;
import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import androidx.annotation.m1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.BlockingQueue;

/* compiled from: NetworkDispatcher.java */
/* loaded from: classes3.dex */
public class k extends Thread {

    /* renamed from: b, reason: collision with root package name */
    private final BlockingQueue<n<?>> f40894b;

    /* renamed from: c, reason: collision with root package name */
    private final j f40895c;

    /* renamed from: d, reason: collision with root package name */
    private final e f40896d;

    /* renamed from: e, reason: collision with root package name */
    private final r f40897e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f40898f = false;

    public k(BlockingQueue<n<?>> blockingQueue, j jVar, e eVar, r rVar) {
        this.f40894b = blockingQueue;
        this.f40895c = jVar;
        this.f40896d = eVar;
        this.f40897e = rVar;
    }

    @TargetApi(14)
    private void a(n<?> nVar) {
        TrafficStats.setThreadStatsTag(nVar.getTrafficStatsTag());
    }

    private void b(n<?> nVar, VolleyError volleyError) {
        this.f40897e.c(nVar, nVar.parseNetworkError(volleyError));
    }

    private void c() throws InterruptedException {
        d(this.f40894b.take());
    }

    @m1
    void d(n<?> nVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        nVar.sendEvent(3);
        try {
            try {
                nVar.addMarker(ProtectedSandApp.s("ڍ"));
            } catch (VolleyError e4) {
                e4.b(SystemClock.elapsedRealtime() - elapsedRealtime);
                b(nVar, e4);
                nVar.notifyListenerResponseNotUsable();
            } catch (Exception e5) {
                t.d(e5, ProtectedSandApp.s("ړ"), e5.toString());
                VolleyError volleyError = new VolleyError(e5);
                volleyError.b(SystemClock.elapsedRealtime() - elapsedRealtime);
                this.f40897e.c(nVar, volleyError);
                nVar.notifyListenerResponseNotUsable();
            }
            if (nVar.isCanceled()) {
                nVar.finish(ProtectedSandApp.s("ڎ"));
                nVar.notifyListenerResponseNotUsable();
                return;
            }
            a(nVar);
            l a5 = this.f40895c.a(nVar);
            nVar.addMarker(ProtectedSandApp.s("ڏ"));
            if (a5.f40903e && nVar.hasHadResponseDelivered()) {
                nVar.finish(ProtectedSandApp.s("ڐ"));
                nVar.notifyListenerResponseNotUsable();
                return;
            }
            q<?> parseNetworkResponse = nVar.parseNetworkResponse(a5);
            nVar.addMarker(ProtectedSandApp.s("ڑ"));
            if (nVar.shouldCache() && parseNetworkResponse.f40939b != null) {
                this.f40896d.e(nVar.getCacheKey(), parseNetworkResponse.f40939b);
                nVar.addMarker(ProtectedSandApp.s("ڒ"));
            }
            nVar.markDelivered();
            this.f40897e.a(nVar, parseNetworkResponse);
            nVar.notifyListenerResponseReceived(parseNetworkResponse);
        } finally {
            nVar.sendEvent(4);
        }
    }

    public void e() {
        this.f40898f = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                c();
            } catch (InterruptedException unused) {
                if (this.f40898f) {
                    Thread.currentThread().interrupt();
                    return;
                } else {
                    t.c(ProtectedSandApp.s("ڔ"), new Object[0]);
                }
            }
        }
    }
}
