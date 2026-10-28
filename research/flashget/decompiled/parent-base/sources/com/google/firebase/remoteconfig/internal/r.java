package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import androidx.annotation.b0;
import androidx.annotation.o0;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: ConfigRealtimeHandler.java */
/* loaded from: classes6.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    @b0("this")
    private final Set<com.google.firebase.remoteconfig.d> f60545a;

    /* renamed from: b, reason: collision with root package name */
    @b0("this")
    private final u f60546b;

    /* renamed from: c, reason: collision with root package name */
    private final n f60547c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.g f60548d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.firebase.installations.k f60549e;

    /* renamed from: f, reason: collision with root package name */
    private final g f60550f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f60551g;

    /* renamed from: h, reason: collision with root package name */
    private final String f60552h;

    /* renamed from: i, reason: collision with root package name */
    private final q f60553i;

    /* renamed from: j, reason: collision with root package name */
    private final ScheduledExecutorService f60554j;

    /* compiled from: ConfigRealtimeHandler.java */
    public class a implements com.google.firebase.remoteconfig.e {

        /* renamed from: a, reason: collision with root package name */
        private final com.google.firebase.remoteconfig.d f60555a;

        public a(com.google.firebase.remoteconfig.d dVar) {
            this.f60555a = dVar;
        }

        @Override // com.google.firebase.remoteconfig.e
        public void remove() {
            r.this.d(this.f60555a);
        }
    }

    public r(com.google.firebase.g gVar, com.google.firebase.installations.k kVar, n nVar, g gVar2, Context context, String str, q qVar, ScheduledExecutorService scheduledExecutorService) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f60545a = linkedHashSet;
        this.f60546b = new u(gVar, kVar, nVar, gVar2, context, str, linkedHashSet, qVar, scheduledExecutorService);
        this.f60548d = gVar;
        this.f60547c = nVar;
        this.f60549e = kVar;
        this.f60550f = gVar2;
        this.f60551g = context;
        this.f60552h = str;
        this.f60553i = qVar;
        this.f60554j = scheduledExecutorService;
    }

    private synchronized void c() {
        if (!this.f60545a.isEmpty()) {
            this.f60546b.E();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d(com.google.firebase.remoteconfig.d dVar) {
        this.f60545a.remove(dVar);
    }

    @o0
    public synchronized com.google.firebase.remoteconfig.e b(@o0 com.google.firebase.remoteconfig.d dVar) {
        this.f60545a.add(dVar);
        c();
        return new a(dVar);
    }

    public synchronized void e(boolean z4) {
        this.f60546b.B(z4);
        if (!z4) {
            c();
        }
    }
}
