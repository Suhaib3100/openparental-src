package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.c1;
import androidx.annotation.m1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.datatransport.runtime.backends.h;
import com.google.android.datatransport.runtime.firebase.transport.c;
import com.google.android.datatransport.runtime.k;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import l1.a;

/* compiled from: Uploader.java */
/* loaded from: classes2.dex */
public class s {

    /* renamed from: j, reason: collision with root package name */
    private static final String f12638j = ProtectedSandApp.s("ॏ");

    /* renamed from: k, reason: collision with root package name */
    private static final String f12639k = ProtectedSandApp.s("ॐ");

    /* renamed from: a, reason: collision with root package name */
    private final Context f12640a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.backends.e f12641b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.scheduling.persistence.d f12642c;

    /* renamed from: d, reason: collision with root package name */
    private final y f12643d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f12644e;

    /* renamed from: f, reason: collision with root package name */
    private final l1.a f12645f;

    /* renamed from: g, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f12646g;

    /* renamed from: h, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f12647h;

    /* renamed from: i, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.scheduling.persistence.c f12648i;

    @h3.a
    public s(Context context, com.google.android.datatransport.runtime.backends.e eVar, com.google.android.datatransport.runtime.scheduling.persistence.d dVar, y yVar, Executor executor, l1.a aVar, @com.google.android.datatransport.runtime.time.h com.google.android.datatransport.runtime.time.a aVar2, @com.google.android.datatransport.runtime.time.b com.google.android.datatransport.runtime.time.a aVar3, com.google.android.datatransport.runtime.scheduling.persistence.c cVar) {
        this.f12640a = context;
        this.f12641b = eVar;
        this.f12642c = dVar;
        this.f12643d = yVar;
        this.f12644e = executor;
        this.f12645f = aVar;
        this.f12646g = aVar2;
        this.f12647h = aVar3;
        this.f12648i = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean l(com.google.android.datatransport.runtime.s sVar) {
        return Boolean.valueOf(this.f12642c.a1(sVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Iterable m(com.google.android.datatransport.runtime.s sVar) {
        return this.f12642c.C(sVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object n(Iterable iterable, com.google.android.datatransport.runtime.s sVar, long j5) {
        this.f12642c.c1(iterable);
        this.f12642c.J(sVar, this.f12646g.a() + j5);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object o(Iterable iterable) {
        this.f12642c.s(iterable);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object p() {
        this.f12648i.a();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object q(Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            this.f12648i.c(((Integer) r0.getValue()).intValue(), c.b.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object r(com.google.android.datatransport.runtime.s sVar, long j5) {
        this.f12642c.J(sVar, this.f12646g.a() + j5);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object s(com.google.android.datatransport.runtime.s sVar, int i5) {
        this.f12643d.a(sVar, i5 + 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(final com.google.android.datatransport.runtime.s sVar, final int i5, Runnable runnable) {
        try {
            try {
                l1.a aVar = this.f12645f;
                final com.google.android.datatransport.runtime.scheduling.persistence.d dVar = this.f12642c;
                Objects.requireNonNull(dVar);
                aVar.d(new a.InterfaceC0460a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.k
                    @Override // l1.a.InterfaceC0460a
                    public final Object execute() {
                        return Integer.valueOf(com.google.android.datatransport.runtime.scheduling.persistence.d.this.p());
                    }
                });
                if (k()) {
                    u(sVar, i5);
                } else {
                    this.f12645f.d(new a.InterfaceC0460a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.l
                        @Override // l1.a.InterfaceC0460a
                        public final Object execute() {
                            Object s5;
                            s5 = s.this.s(sVar, i5);
                            return s5;
                        }
                    });
                }
            } catch (SynchronizationException unused) {
                this.f12643d.a(sVar, i5 + 1);
            }
        } finally {
            runnable.run();
        }
    }

    @m1
    public com.google.android.datatransport.runtime.k j(com.google.android.datatransport.runtime.backends.n nVar) {
        l1.a aVar = this.f12645f;
        final com.google.android.datatransport.runtime.scheduling.persistence.c cVar = this.f12648i;
        Objects.requireNonNull(cVar);
        com.google.android.datatransport.runtime.firebase.transport.a aVar2 = (com.google.android.datatransport.runtime.firebase.transport.a) aVar.d(new a.InterfaceC0460a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.h
            @Override // l1.a.InterfaceC0460a
            public final Object execute() {
                return com.google.android.datatransport.runtime.scheduling.persistence.c.this.b();
            }
        });
        k.a j5 = com.google.android.datatransport.runtime.k.a().i(this.f12646g.a()).k(this.f12647h.a()).j(ProtectedSandApp.s("ॊ"));
        com.google.android.datatransport.c b6 = com.google.android.datatransport.c.b(ProtectedSandApp.s("ो"));
        aVar2.getClass();
        return nVar.b(j5.h(new com.google.android.datatransport.runtime.j(b6, com.google.android.datatransport.runtime.o.b(aVar2))).d());
    }

    boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f12640a.getSystemService(ProtectedSandApp.s("ौ"))).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @c1({c1.a.LIBRARY_GROUP})
    public com.google.android.datatransport.runtime.backends.h u(final com.google.android.datatransport.runtime.s sVar, int i5) {
        com.google.android.datatransport.runtime.backends.h a6;
        com.google.android.datatransport.runtime.backends.n c6 = this.f12641b.c(sVar.b());
        long j5 = 0;
        com.google.android.datatransport.runtime.backends.h e6 = com.google.android.datatransport.runtime.backends.h.e(0L);
        while (true) {
            final long j6 = j5;
            while (((Boolean) this.f12645f.d(new a.InterfaceC0460a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.m
                @Override // l1.a.InterfaceC0460a
                public final Object execute() {
                    Boolean l5;
                    l5 = s.this.l(sVar);
                    return l5;
                }
            })).booleanValue()) {
                final Iterable iterable = (Iterable) this.f12645f.d(new a.InterfaceC0460a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.n
                    @Override // l1.a.InterfaceC0460a
                    public final Object execute() {
                        Iterable m5;
                        m5 = s.this.m(sVar);
                        return m5;
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return e6;
                }
                if (c6 == null) {
                    j1.a.c(ProtectedSandApp.s("्"), ProtectedSandApp.s("ॎ"), sVar);
                    a6 = com.google.android.datatransport.runtime.backends.h.a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((com.google.android.datatransport.runtime.scheduling.persistence.k) it.next()).b());
                    }
                    if (sVar.e()) {
                        arrayList.add(j(c6));
                    }
                    a6 = c6.a(com.google.android.datatransport.runtime.backends.g.a().b(arrayList).c(sVar.c()).a());
                }
                e6 = a6;
                if (e6.c() == h.a.TRANSIENT_ERROR) {
                    this.f12645f.d(new a.InterfaceC0460a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.o
                        @Override // l1.a.InterfaceC0460a
                        public final Object execute() {
                            Object n5;
                            n5 = s.this.n(iterable, sVar, j6);
                            return n5;
                        }
                    });
                    this.f12643d.b(sVar, i5 + 1, true);
                    return e6;
                }
                this.f12645f.d(new a.InterfaceC0460a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.p
                    @Override // l1.a.InterfaceC0460a
                    public final Object execute() {
                        Object o5;
                        o5 = s.this.o(iterable);
                        return o5;
                    }
                });
                if (e6.c() == h.a.OK) {
                    j5 = Math.max(j6, e6.b());
                    if (sVar.e()) {
                        this.f12645f.d(new a.InterfaceC0460a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.q
                            @Override // l1.a.InterfaceC0460a
                            public final Object execute() {
                                Object p5;
                                p5 = s.this.p();
                                return p5;
                            }
                        });
                    }
                } else if (e6.c() == h.a.INVALID_PAYLOAD) {
                    final HashMap hashMap = new HashMap();
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        String l5 = ((com.google.android.datatransport.runtime.scheduling.persistence.k) it2.next()).b().l();
                        if (hashMap.containsKey(l5)) {
                            hashMap.put(l5, Integer.valueOf(((Integer) hashMap.get(l5)).intValue() + 1));
                        } else {
                            hashMap.put(l5, 1);
                        }
                    }
                    this.f12645f.d(new a.InterfaceC0460a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.r
                        @Override // l1.a.InterfaceC0460a
                        public final Object execute() {
                            Object q5;
                            q5 = s.this.q(hashMap);
                            return q5;
                        }
                    });
                }
            }
            this.f12645f.d(new a.InterfaceC0460a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.i
                @Override // l1.a.InterfaceC0460a
                public final Object execute() {
                    Object r5;
                    r5 = s.this.r(sVar, j6);
                    return r5;
                }
            });
            return e6;
        }
    }

    public void v(final com.google.android.datatransport.runtime.s sVar, final int i5, final Runnable runnable) {
        this.f12644e.execute(new Runnable() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.j
            @Override // java.lang.Runnable
            public final void run() {
                s.this.t(sVar, i5, runnable);
            }
        });
    }
}
