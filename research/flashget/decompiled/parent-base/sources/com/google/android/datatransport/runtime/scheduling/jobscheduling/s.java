package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.c1;
import androidx.annotation.m1;
import com.flashget.parentalcontrol.ProtectedSandApp;
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
import p8.a;

/* compiled from: Uploader.java */
/* loaded from: classes5.dex */
public class s {

    /* renamed from: j, reason: collision with root package name */
    private static final String f52168j = ProtectedSandApp.s("옳");

    /* renamed from: k, reason: collision with root package name */
    private static final String f52169k = ProtectedSandApp.s("옰");

    /* renamed from: a, reason: collision with root package name */
    private final Context f52170a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.backends.e f52171b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.scheduling.persistence.d f52172c;

    /* renamed from: d, reason: collision with root package name */
    private final y f52173d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f52174e;

    /* renamed from: f, reason: collision with root package name */
    private final p8.a f52175f;

    /* renamed from: g, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f52176g;

    /* renamed from: h, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f52177h;

    /* renamed from: i, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.scheduling.persistence.c f52178i;

    @cd.a
    public s(Context context, com.google.android.datatransport.runtime.backends.e eVar, com.google.android.datatransport.runtime.scheduling.persistence.d dVar, y yVar, Executor executor, p8.a aVar, @com.google.android.datatransport.runtime.time.h com.google.android.datatransport.runtime.time.a aVar2, @com.google.android.datatransport.runtime.time.b com.google.android.datatransport.runtime.time.a aVar3, com.google.android.datatransport.runtime.scheduling.persistence.c cVar) {
        this.f52170a = context;
        this.f52171b = eVar;
        this.f52172c = dVar;
        this.f52173d = yVar;
        this.f52174e = executor;
        this.f52175f = aVar;
        this.f52176g = aVar2;
        this.f52177h = aVar3;
        this.f52178i = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean l(com.google.android.datatransport.runtime.s sVar) {
        return Boolean.valueOf(this.f52172c.A1(sVar));
    }

    private /* synthetic */ Iterable m(com.google.android.datatransport.runtime.s sVar) {
        return this.f52172c.j2(sVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object n(Iterable iterable, com.google.android.datatransport.runtime.s sVar, long j4) {
        this.f52172c.E1(iterable);
        this.f52172c.l0(sVar, this.f52176g.a() + j4);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object o(Iterable iterable) {
        this.f52172c.U(iterable);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object p() {
        this.f52178i.a();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object q(Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            this.f52178i.d(((Integer) r0.getValue()).intValue(), c.b.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object r(com.google.android.datatransport.runtime.s sVar, long j4) {
        this.f52172c.l0(sVar, this.f52176g.a() + j4);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object s(com.google.android.datatransport.runtime.s sVar, int i4) {
        this.f52173d.a(sVar, i4 + 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(final com.google.android.datatransport.runtime.s sVar, final int i4, Runnable runnable) {
        try {
            try {
                p8.a aVar = this.f52175f;
                final com.google.android.datatransport.runtime.scheduling.persistence.d dVar = this.f52172c;
                Objects.requireNonNull(dVar);
                aVar.b(new a.InterfaceC1373a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.h
                    @Override // p8.a.InterfaceC1373a
                    public final Object j() {
                        return Integer.valueOf(com.google.android.datatransport.runtime.scheduling.persistence.d.this.p());
                    }
                });
                if (k()) {
                    u(sVar, i4);
                } else {
                    this.f52175f.b(new a.InterfaceC1373a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.j
                        @Override // p8.a.InterfaceC1373a
                        public final Object j() {
                            Object s4;
                            s4 = s.this.s(sVar, i4);
                            return s4;
                        }
                    });
                }
            } catch (SynchronizationException unused) {
                this.f52173d.a(sVar, i4 + 1);
            }
            runnable.run();
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }

    @m1
    public com.google.android.datatransport.runtime.k j(com.google.android.datatransport.runtime.backends.n nVar) {
        p8.a aVar = this.f52175f;
        final com.google.android.datatransport.runtime.scheduling.persistence.c cVar = this.f52178i;
        Objects.requireNonNull(cVar);
        com.google.android.datatransport.runtime.firebase.transport.a aVar2 = (com.google.android.datatransport.runtime.firebase.transport.a) aVar.b(new a.InterfaceC1373a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.l
            @Override // p8.a.InterfaceC1373a
            public final Object j() {
                return com.google.android.datatransport.runtime.scheduling.persistence.c.this.c();
            }
        });
        k.a n4 = com.google.android.datatransport.runtime.k.a().i(this.f52176g.a()).o(this.f52177h.a()).n(ProtectedSandApp.s("옰"));
        com.google.android.datatransport.e b5 = com.google.android.datatransport.e.b(ProtectedSandApp.s("옱"));
        aVar2.getClass();
        return nVar.a(n4.h(new com.google.android.datatransport.runtime.j(b5, com.google.android.datatransport.runtime.o.b(aVar2))).d());
    }

    boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f52170a.getSystemService(ProtectedSandApp.s("옲"))).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @c1({c1.a.LIBRARY_GROUP})
    @f9.a
    public com.google.android.datatransport.runtime.backends.h u(final com.google.android.datatransport.runtime.s sVar, int i4) {
        com.google.android.datatransport.runtime.backends.h b5;
        com.google.android.datatransport.runtime.backends.n nVar = this.f52171b.get(sVar.b());
        long j4 = 0;
        com.google.android.datatransport.runtime.backends.h e4 = com.google.android.datatransport.runtime.backends.h.e(0L);
        while (true) {
            final long j5 = j4;
            while (((Boolean) this.f52175f.b(new a.InterfaceC1373a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.m
                @Override // p8.a.InterfaceC1373a
                public final Object j() {
                    Boolean l4;
                    l4 = s.this.l(sVar);
                    return l4;
                }
            })).booleanValue()) {
                final Iterable iterable = (Iterable) this.f52175f.b(new a.InterfaceC1373a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.n
                    @Override // p8.a.InterfaceC1373a
                    public final Object j() {
                        Iterable j22;
                        j22 = s.this.f52172c.j2(sVar);
                        return j22;
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return e4;
                }
                if (nVar == null) {
                    n8.a.c(ProtectedSandApp.s("옳"), ProtectedSandApp.s("옴"), sVar);
                    b5 = com.google.android.datatransport.runtime.backends.h.a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((com.google.android.datatransport.runtime.scheduling.persistence.k) it.next()).b());
                    }
                    if (sVar.e()) {
                        arrayList.add(j(nVar));
                    }
                    b5 = nVar.b(com.google.android.datatransport.runtime.backends.g.a().b(arrayList).c(sVar.c()).a());
                }
                e4 = b5;
                if (e4.c() == h.a.TRANSIENT_ERROR) {
                    this.f52175f.b(new a.InterfaceC1373a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.o
                        @Override // p8.a.InterfaceC1373a
                        public final Object j() {
                            Object n4;
                            n4 = s.this.n(iterable, sVar, j5);
                            return n4;
                        }
                    });
                    this.f52173d.b(sVar, i4 + 1, true);
                    return e4;
                }
                this.f52175f.b(new a.InterfaceC1373a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.p
                    @Override // p8.a.InterfaceC1373a
                    public final Object j() {
                        Object o4;
                        o4 = s.this.o(iterable);
                        return o4;
                    }
                });
                if (e4.c() == h.a.OK) {
                    j4 = Math.max(j5, e4.b());
                    if (sVar.e()) {
                        this.f52175f.b(new a.InterfaceC1373a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.q
                            @Override // p8.a.InterfaceC1373a
                            public final Object j() {
                                Object p4;
                                p4 = s.this.p();
                                return p4;
                            }
                        });
                    }
                } else if (e4.c() == h.a.INVALID_PAYLOAD) {
                    final HashMap hashMap = new HashMap();
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        String p4 = ((com.google.android.datatransport.runtime.scheduling.persistence.k) it2.next()).b().p();
                        if (hashMap.containsKey(p4)) {
                            hashMap.put(p4, Integer.valueOf(((Integer) hashMap.get(p4)).intValue() + 1));
                        } else {
                            hashMap.put(p4, 1);
                        }
                    }
                    this.f52175f.b(new a.InterfaceC1373a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.r
                        @Override // p8.a.InterfaceC1373a
                        public final Object j() {
                            Object q4;
                            q4 = s.this.q(hashMap);
                            return q4;
                        }
                    });
                }
            }
            this.f52175f.b(new a.InterfaceC1373a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.i
                @Override // p8.a.InterfaceC1373a
                public final Object j() {
                    Object r4;
                    r4 = s.this.r(sVar, j5);
                    return r4;
                }
            });
            return e4;
        }
    }

    public void v(final com.google.android.datatransport.runtime.s sVar, final int i4, final Runnable runnable) {
        this.f52174e.execute(new Runnable() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.k
            @Override // java.lang.Runnable
            public final void run() {
                s.this.t(sVar, i4, runnable);
            }
        });
    }
}
