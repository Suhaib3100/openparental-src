package com.google.firebase.crashlytics.internal.metadata;

import androidx.annotation.m1;
import androidx.annotation.q0;
import androidx.compose.animation.core.k1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.metadata.o;
import com.google.firebase.crashlytics.internal.model.g0;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: UserMetadata.java */
/* loaded from: classes6.dex */
public class o {

    /* renamed from: h, reason: collision with root package name */
    public static final String f58959h = ProtectedSandApp.s("﵀");

    /* renamed from: i, reason: collision with root package name */
    public static final String f58960i = ProtectedSandApp.s("﵁");

    /* renamed from: j, reason: collision with root package name */
    public static final String f58961j = ProtectedSandApp.s("﵂");

    /* renamed from: k, reason: collision with root package name */
    public static final String f58962k = ProtectedSandApp.s("﵃");

    /* renamed from: l, reason: collision with root package name */
    @m1
    public static final int f58963l = 64;

    /* renamed from: m, reason: collision with root package name */
    @m1
    public static final int f58964m = 1024;

    /* renamed from: n, reason: collision with root package name */
    @m1
    public static final int f58965n = 8192;

    /* renamed from: o, reason: collision with root package name */
    @m1
    public static final int f58966o = 128;

    /* renamed from: a, reason: collision with root package name */
    private final f f58967a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.concurrency.k f58968b;

    /* renamed from: c, reason: collision with root package name */
    private String f58969c;

    /* renamed from: d, reason: collision with root package name */
    private final a f58970d = new a(false);

    /* renamed from: e, reason: collision with root package name */
    private final a f58971e = new a(true);

    /* renamed from: f, reason: collision with root package name */
    private final j f58972f = new j(128);

    /* renamed from: g, reason: collision with root package name */
    private final AtomicMarkableReference<String> f58973g = new AtomicMarkableReference<>(null, false);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: UserMetadata.java */
    class a {

        /* renamed from: a, reason: collision with root package name */
        final AtomicMarkableReference<d> f58974a;

        /* renamed from: b, reason: collision with root package name */
        private final AtomicReference<Runnable> f58975b = new AtomicReference<>(null);

        /* renamed from: c, reason: collision with root package name */
        private final boolean f58976c;

        public a(boolean z4) {
            this.f58976c = z4;
            this.f58974a = new AtomicMarkableReference<>(new d(64, z4 ? 8192 : 1024), false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() {
            this.f58975b.set(null);
            e();
        }

        private void d() {
            Runnable runnable = new Runnable() { // from class: com.google.firebase.crashlytics.internal.metadata.n
                @Override // java.lang.Runnable
                public final void run() {
                    o.a.this.c();
                }
            };
            if (k1.a(this.f58975b, null, runnable)) {
                o.this.f58968b.diskWrite.q(runnable);
            }
        }

        private void e() {
            Map<String, String> map;
            synchronized (this) {
                try {
                    if (this.f58974a.isMarked()) {
                        map = this.f58974a.getReference().a();
                        AtomicMarkableReference<d> atomicMarkableReference = this.f58974a;
                        atomicMarkableReference.set(atomicMarkableReference.getReference(), false);
                    } else {
                        map = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (map != null) {
                o.this.f58967a.r(o.this.f58969c, map, this.f58976c);
            }
        }

        public Map<String, String> b() {
            return this.f58974a.getReference().a();
        }

        public boolean f(String str, String str2) {
            synchronized (this) {
                try {
                    if (!this.f58974a.getReference().d(str, str2)) {
                        return false;
                    }
                    AtomicMarkableReference<d> atomicMarkableReference = this.f58974a;
                    atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
                    d();
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void g(Map<String, String> map) {
            synchronized (this) {
                this.f58974a.getReference().e(map);
                AtomicMarkableReference<d> atomicMarkableReference = this.f58974a;
                atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
            }
            d();
        }
    }

    public o(String str, com.google.firebase.crashlytics.internal.persistence.g gVar, com.google.firebase.crashlytics.internal.concurrency.k kVar) {
        this.f58969c = str;
        this.f58967a = new f(gVar);
        this.f58968b = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(String str, Map map, List list) {
        if (j() != null) {
            this.f58967a.t(str, j());
        }
        if (!map.isEmpty()) {
            this.f58967a.q(str, map);
        }
        if (list.isEmpty()) {
            return;
        }
        this.f58967a.s(str, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(List list) {
        this.f58967a.s(this.f58969c, list);
    }

    public static o m(String str, com.google.firebase.crashlytics.internal.persistence.g gVar, com.google.firebase.crashlytics.internal.concurrency.k kVar) {
        f fVar = new f(gVar);
        o oVar = new o(str, gVar, kVar);
        oVar.f58970d.f58974a.getReference().e(fVar.j(str, false));
        oVar.f58971e.f58974a.getReference().e(fVar.j(str, true));
        oVar.f58973g.set(fVar.l(str), false);
        oVar.f58972f.c(fVar.k(str));
        return oVar;
    }

    @q0
    public static String n(String str, com.google.firebase.crashlytics.internal.persistence.g gVar) {
        return new f(gVar).l(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        boolean z4;
        String str;
        synchronized (this.f58973g) {
            try {
                z4 = false;
                if (this.f58973g.isMarked()) {
                    str = j();
                    this.f58973g.set(str, false);
                    z4 = true;
                } else {
                    str = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z4) {
            this.f58967a.t(this.f58969c, str);
        }
    }

    public Map<String, String> g() {
        return this.f58970d.b();
    }

    public Map<String, String> h() {
        return this.f58971e.b();
    }

    public List<g0.f.d.e> i() {
        return this.f58972f.a();
    }

    @q0
    public String j() {
        return this.f58973g.getReference();
    }

    public boolean p(String str, String str2) {
        return this.f58970d.f(str, str2);
    }

    public void q(Map<String, String> map) {
        this.f58970d.g(map);
    }

    public boolean r(String str, String str2) {
        return this.f58971e.f(str, str2);
    }

    public void s(final String str) {
        synchronized (this.f58969c) {
            this.f58969c = str;
            final Map<String, String> b5 = this.f58970d.b();
            final List<i> b6 = this.f58972f.b();
            this.f58968b.diskWrite.q(new Runnable() { // from class: com.google.firebase.crashlytics.internal.metadata.l
                @Override // java.lang.Runnable
                public final void run() {
                    o.this.k(str, b5, b6);
                }
            });
        }
    }

    public void t(String str) {
        String c5 = d.c(str, 1024);
        synchronized (this.f58973g) {
            try {
                if (com.google.firebase.crashlytics.internal.common.i.A(c5, this.f58973g.getReference())) {
                    return;
                }
                this.f58973g.set(c5, true);
                this.f58968b.diskWrite.q(new Runnable() { // from class: com.google.firebase.crashlytics.internal.metadata.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        o.this.o();
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @f9.a
    public boolean u(List<i> list) {
        synchronized (this.f58972f) {
            try {
                if (!this.f58972f.c(list)) {
                    return false;
                }
                final List<i> b5 = this.f58972f.b();
                this.f58968b.diskWrite.q(new Runnable() { // from class: com.google.firebase.crashlytics.internal.metadata.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        o.this.l(b5);
                    }
                });
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
