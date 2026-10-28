package com.google.firebase.crashlytics.internal.metadata;

import android.view.x;
import androidx.annotation.m1;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.metadata.n;
import com.google.firebase.crashlytics.internal.model.f0;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: UserMetadata.java */
/* loaded from: classes2.dex */
public class n {

    /* renamed from: h, reason: collision with root package name */
    public static final String f15853h = ProtectedSandApp.s("ᔊ");

    /* renamed from: i, reason: collision with root package name */
    public static final String f15854i = ProtectedSandApp.s("ᔋ");

    /* renamed from: j, reason: collision with root package name */
    public static final String f15855j = ProtectedSandApp.s("ᔌ");

    /* renamed from: k, reason: collision with root package name */
    public static final String f15856k = ProtectedSandApp.s("ᔍ");

    /* renamed from: l, reason: collision with root package name */
    @m1
    public static final int f15857l = 64;

    /* renamed from: m, reason: collision with root package name */
    @m1
    public static final int f15858m = 1024;

    /* renamed from: n, reason: collision with root package name */
    @m1
    public static final int f15859n = 8192;

    /* renamed from: o, reason: collision with root package name */
    @m1
    public static final int f15860o = 128;

    /* renamed from: a, reason: collision with root package name */
    private final f f15861a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.common.n f15862b;

    /* renamed from: c, reason: collision with root package name */
    private String f15863c;

    /* renamed from: d, reason: collision with root package name */
    private final a f15864d = new a(false);

    /* renamed from: e, reason: collision with root package name */
    private final a f15865e = new a(true);

    /* renamed from: f, reason: collision with root package name */
    private final j f15866f = new j(128);

    /* renamed from: g, reason: collision with root package name */
    private final AtomicMarkableReference<String> f15867g = new AtomicMarkableReference<>(null, false);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: UserMetadata.java */
    class a {

        /* renamed from: a, reason: collision with root package name */
        final AtomicMarkableReference<d> f15868a;

        /* renamed from: b, reason: collision with root package name */
        private final AtomicReference<Callable<Void>> f15869b = new AtomicReference<>(null);

        /* renamed from: c, reason: collision with root package name */
        private final boolean f15870c;

        public a(boolean z5) {
            this.f15870c = z5;
            this.f15868a = new AtomicMarkableReference<>(new d(64, z5 ? 8192 : 1024), false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Void c() throws Exception {
            this.f15869b.set(null);
            e();
            return null;
        }

        private void d() {
            Callable callable = new Callable() { // from class: com.google.firebase.crashlytics.internal.metadata.m
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Void c6;
                    c6 = n.a.this.c();
                    return c6;
                }
            };
            if (x.a(this.f15869b, null, callable)) {
                n.this.f15862b.h(callable);
            }
        }

        private void e() {
            Map<String, String> map;
            synchronized (this) {
                if (this.f15868a.isMarked()) {
                    map = this.f15868a.getReference().a();
                    AtomicMarkableReference<d> atomicMarkableReference = this.f15868a;
                    atomicMarkableReference.set(atomicMarkableReference.getReference(), false);
                } else {
                    map = null;
                }
            }
            if (map != null) {
                n.this.f15861a.r(n.this.f15863c, map, this.f15870c);
            }
        }

        public Map<String, String> b() {
            return this.f15868a.getReference().a();
        }

        public boolean f(String str, String str2) {
            synchronized (this) {
                if (!this.f15868a.getReference().d(str, str2)) {
                    return false;
                }
                AtomicMarkableReference<d> atomicMarkableReference = this.f15868a;
                atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
                d();
                return true;
            }
        }

        public void g(Map<String, String> map) {
            synchronized (this) {
                this.f15868a.getReference().e(map);
                AtomicMarkableReference<d> atomicMarkableReference = this.f15868a;
                atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
            }
            d();
        }
    }

    public n(String str, com.google.firebase.crashlytics.internal.persistence.f fVar, com.google.firebase.crashlytics.internal.common.n nVar) {
        this.f15863c = str;
        this.f15861a = new f(fVar);
        this.f15862b = nVar;
    }

    public static /* synthetic */ Object a(n nVar) {
        nVar.n();
        return null;
    }

    private /* synthetic */ Object j() throws Exception {
        n();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object k(List list) throws Exception {
        this.f15861a.s(this.f15863c, list);
        return null;
    }

    public static n l(String str, com.google.firebase.crashlytics.internal.persistence.f fVar, com.google.firebase.crashlytics.internal.common.n nVar) {
        f fVar2 = new f(fVar);
        n nVar2 = new n(str, fVar, nVar);
        nVar2.f15864d.f15868a.getReference().e(fVar2.j(str, false));
        nVar2.f15865e.f15868a.getReference().e(fVar2.j(str, true));
        nVar2.f15867g.set(fVar2.l(str), false);
        nVar2.f15866f.c(fVar2.k(str));
        return nVar2;
    }

    @q0
    public static String m(String str, com.google.firebase.crashlytics.internal.persistence.f fVar) {
        return new f(fVar).l(str);
    }

    private void n() {
        boolean z5;
        String str;
        synchronized (this.f15867g) {
            z5 = false;
            if (this.f15867g.isMarked()) {
                str = i();
                this.f15867g.set(str, false);
                z5 = true;
            } else {
                str = null;
            }
        }
        if (z5) {
            this.f15861a.t(this.f15863c, str);
        }
    }

    public Map<String, String> f() {
        return this.f15864d.b();
    }

    public Map<String, String> g() {
        return this.f15865e.b();
    }

    public List<f0.f.d.e> h() {
        return this.f15866f.a();
    }

    @q0
    public String i() {
        return this.f15867g.getReference();
    }

    public boolean o(String str, String str2) {
        return this.f15864d.f(str, str2);
    }

    public void p(Map<String, String> map) {
        this.f15864d.g(map);
    }

    public boolean q(String str, String str2) {
        return this.f15865e.f(str, str2);
    }

    public void r(String str) {
        synchronized (this.f15863c) {
            this.f15863c = str;
            Map<String, String> b6 = this.f15864d.b();
            List<i> b7 = this.f15866f.b();
            if (i() != null) {
                this.f15861a.t(str, i());
            }
            if (!b6.isEmpty()) {
                this.f15861a.q(str, b6);
            }
            if (!b7.isEmpty()) {
                this.f15861a.s(str, b7);
            }
        }
    }

    public void s(String str) {
        String c6 = d.c(str, 1024);
        synchronized (this.f15867g) {
            if (com.google.firebase.crashlytics.internal.common.i.A(c6, this.f15867g.getReference())) {
                return;
            }
            this.f15867g.set(c6, true);
            this.f15862b.h(new Callable() { // from class: com.google.firebase.crashlytics.internal.metadata.k
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return n.a(n.this);
                }
            });
        }
    }

    public boolean t(List<i> list) {
        synchronized (this.f15866f) {
            if (!this.f15866f.c(list)) {
                return false;
            }
            final List<i> b6 = this.f15866f.b();
            this.f15862b.h(new Callable() { // from class: com.google.firebase.crashlytics.internal.metadata.l
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Object k5;
                    k5 = n.this.k(b6);
                    return k5;
                }
            });
            return true;
        }
    }
}
