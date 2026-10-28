package com.android.volley;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.android.volley.e;
import com.android.volley.n;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* compiled from: WaitingRequestManager.java */
/* loaded from: classes3.dex */
class u implements n.c {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, List<n<?>>> f41083a;

    /* renamed from: b, reason: collision with root package name */
    private final r f41084b;

    /* renamed from: c, reason: collision with root package name */
    @q0
    private final o f41085c;

    /* renamed from: d, reason: collision with root package name */
    @q0
    private final f f41086d;

    /* renamed from: e, reason: collision with root package name */
    @q0
    private final BlockingQueue<n<?>> f41087e;

    u(@o0 o oVar) {
        this.f41083a = new HashMap();
        this.f41085c = oVar;
        this.f41084b = oVar.i();
        this.f41086d = null;
        this.f41087e = null;
    }

    @Override // com.android.volley.n.c
    public void a(n<?> nVar, q<?> qVar) {
        List<n<?>> remove;
        e.a aVar = qVar.f40939b;
        if (aVar == null || aVar.a()) {
            b(nVar);
            return;
        }
        String cacheKey = nVar.getCacheKey();
        synchronized (this) {
            remove = this.f41083a.remove(cacheKey);
        }
        if (remove != null) {
            if (t.f40943b) {
                t.f(ProtectedSandApp.s("܅"), Integer.valueOf(remove.size()), cacheKey);
            }
            Iterator<n<?>> it = remove.iterator();
            while (it.hasNext()) {
                this.f41084b.a(it.next(), qVar);
            }
        }
    }

    @Override // com.android.volley.n.c
    public synchronized void b(n<?> nVar) {
        BlockingQueue<n<?>> blockingQueue;
        try {
            String cacheKey = nVar.getCacheKey();
            List<n<?>> remove = this.f41083a.remove(cacheKey);
            if (remove != null && !remove.isEmpty()) {
                if (t.f40943b) {
                    t.f(ProtectedSandApp.s("܆"), Integer.valueOf(remove.size()), cacheKey);
                }
                n<?> remove2 = remove.remove(0);
                this.f41083a.put(cacheKey, remove);
                remove2.setNetworkRequestCompleteListener(this);
                o oVar = this.f41085c;
                if (oVar != null) {
                    oVar.n(remove2);
                } else if (this.f41086d != null && (blockingQueue = this.f41087e) != null) {
                    try {
                        blockingQueue.put(remove2);
                    } catch (InterruptedException e4) {
                        t.c(ProtectedSandApp.s("܇"), e4.toString());
                        Thread.currentThread().interrupt();
                        this.f41086d.d();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized boolean c(n<?> nVar) {
        try {
            String cacheKey = nVar.getCacheKey();
            if (!this.f41083a.containsKey(cacheKey)) {
                this.f41083a.put(cacheKey, null);
                nVar.setNetworkRequestCompleteListener(this);
                if (t.f40943b) {
                    t.b(ProtectedSandApp.s("܊"), cacheKey);
                }
                return false;
            }
            List<n<?>> list = this.f41083a.get(cacheKey);
            if (list == null) {
                list = new ArrayList<>();
            }
            nVar.addMarker(ProtectedSandApp.s("܈"));
            list.add(nVar);
            this.f41083a.put(cacheKey, list);
            if (t.f40943b) {
                t.b(ProtectedSandApp.s("܉"), cacheKey);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    u(@o0 f fVar, @o0 BlockingQueue<n<?>> blockingQueue, r rVar) {
        this.f41083a = new HashMap();
        this.f41085c = null;
        this.f41084b = rVar;
        this.f41086d = fVar;
        this.f41087e = blockingQueue;
    }
}
