package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import androidx.annotation.b0;
import androidx.annotation.o0;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: ConfigRealtimeHandler.java */
/* loaded from: classes2.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    @b0("this")
    private final Set<com.google.firebase.remoteconfig.d> f18012a;

    /* renamed from: b, reason: collision with root package name */
    @b0("this")
    private final u f18013b;

    /* renamed from: c, reason: collision with root package name */
    private final n f18014c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.g f18015d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.firebase.installations.k f18016e;

    /* renamed from: f, reason: collision with root package name */
    private final g f18017f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f18018g;

    /* renamed from: h, reason: collision with root package name */
    private final String f18019h;

    /* renamed from: i, reason: collision with root package name */
    private final q f18020i;

    /* renamed from: j, reason: collision with root package name */
    private final ScheduledExecutorService f18021j;

    /* compiled from: ConfigRealtimeHandler.java */
    /* loaded from: classes3.dex */
    public class a implements com.google.firebase.remoteconfig.e {

        /* renamed from: a, reason: collision with root package name */
        private final com.google.firebase.remoteconfig.d f18022a;

        public a(com.google.firebase.remoteconfig.d dVar) {
            this.f18022a = dVar;
        }

        @Override // com.google.firebase.remoteconfig.e
        public void remove() {
            r.this.d(this.f18022a);
        }
    }

    public r(com.google.firebase.g gVar, com.google.firebase.installations.k kVar, n nVar, g gVar2, Context context, String str, q qVar, ScheduledExecutorService scheduledExecutorService) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f18012a = linkedHashSet;
        this.f18013b = new u(gVar, kVar, nVar, gVar2, context, str, linkedHashSet, qVar, scheduledExecutorService);
        this.f18015d = gVar;
        this.f18014c = nVar;
        this.f18016e = kVar;
        this.f18017f = gVar2;
        this.f18018g = context;
        this.f18019h = str;
        this.f18020i = qVar;
        this.f18021j = scheduledExecutorService;
    }

    private synchronized void c() {
        if (!this.f18012a.isEmpty()) {
            this.f18013b.E();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d(com.google.firebase.remoteconfig.d dVar) {
        this.f18012a.remove(dVar);
    }

    @o0
    public synchronized com.google.firebase.remoteconfig.e b(@o0 com.google.firebase.remoteconfig.d dVar) {
        this.f18012a.add(dVar);
        c();
        return new a(dVar);
    }

    public synchronized void e(boolean z5) {
        this.f18013b.B(z5);
        if (!z5) {
            c();
        }
    }
}
