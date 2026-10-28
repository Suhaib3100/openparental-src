package com.google.firebase.crashlytics;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.common.b0;
import com.google.firebase.crashlytics.internal.common.d0;
import com.google.firebase.crashlytics.internal.common.m;
import com.google.firebase.crashlytics.internal.common.s;
import com.google.firebase.crashlytics.internal.common.z;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: FirebaseCrashlytics.java */
/* loaded from: classes2.dex */
public class i {

    /* renamed from: b, reason: collision with root package name */
    static final String f15516b = ProtectedSandApp.s("Ꮟ");

    /* renamed from: c, reason: collision with root package name */
    static final String f15517c = ProtectedSandApp.s("Ꮠ");

    /* renamed from: d, reason: collision with root package name */
    static final int f15518d = 500;

    /* renamed from: a, reason: collision with root package name */
    @m1
    final s f15519a;

    /* compiled from: FirebaseCrashlytics.java */
    /* loaded from: classes3.dex */
    class a implements Continuation<Void, Object> {
        a() {
        }

        @Override // com.google.android.gms.tasks.Continuation
        public Object then(@o0 Task<Void> task) throws Exception {
            if (task.isSuccessful()) {
                return null;
            }
            com.google.firebase.crashlytics.internal.g.f().e(ProtectedSandApp.s("⟬"), task.getException());
            return null;
        }
    }

    /* compiled from: FirebaseCrashlytics.java */
    class b implements Callable<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f15520a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ s f15521b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.google.firebase.crashlytics.internal.settings.f f15522c;

        b(boolean z5, s sVar, com.google.firebase.crashlytics.internal.settings.f fVar) {
            this.f15520a = z5;
            this.f15521b = sVar;
            this.f15522c = fVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            if (!this.f15520a) {
                return null;
            }
            this.f15521b.j(this.f15522c);
            return null;
        }
    }

    private i(@o0 s sVar) {
        this.f15519a = sVar;
    }

    @o0
    public static i d() {
        i iVar = (i) com.google.firebase.g.p().l(i.class);
        if (iVar != null) {
            return iVar;
        }
        throw new NullPointerException(ProtectedSandApp.s("Ꮖ"));
    }

    @q0
    static i e(@o0 com.google.firebase.g gVar, @o0 com.google.firebase.installations.k kVar, @o0 o2.a<com.google.firebase.crashlytics.internal.a> aVar, @o0 o2.a<com.google.firebase.analytics.connector.a> aVar2, @o0 o2.a<y2.a> aVar3) {
        Context n5 = gVar.n();
        String packageName = n5.getPackageName();
        com.google.firebase.crashlytics.internal.g.f().g(ProtectedSandApp.s("Ꮗ") + packageName);
        com.google.firebase.crashlytics.internal.persistence.f fVar = new com.google.firebase.crashlytics.internal.persistence.f(n5);
        z zVar = new z(gVar);
        d0 d0Var = new d0(n5, packageName, kVar, zVar);
        com.google.firebase.crashlytics.internal.d dVar = new com.google.firebase.crashlytics.internal.d(aVar);
        d dVar2 = new d(aVar2);
        ExecutorService c6 = b0.c(ProtectedSandApp.s("Ꮘ"));
        m mVar = new m(zVar, fVar);
        com.google.firebase.sessions.api.a.e(mVar);
        s sVar = new s(gVar, d0Var, dVar, zVar, new com.google.firebase.crashlytics.a(dVar2), new com.google.firebase.crashlytics.b(dVar2), fVar, c6, mVar, new com.google.firebase.crashlytics.internal.l(aVar3));
        String j5 = gVar.s().j();
        String n6 = com.google.firebase.crashlytics.internal.common.i.n(n5);
        List<com.google.firebase.crashlytics.internal.common.f> j6 = com.google.firebase.crashlytics.internal.common.i.j(n5);
        com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("Ꮙ") + n6);
        for (com.google.firebase.crashlytics.internal.common.f fVar2 : j6) {
            com.google.firebase.crashlytics.internal.g.f().b(String.format(ProtectedSandApp.s("Ꮚ"), fVar2.c(), fVar2.a(), fVar2.b()));
        }
        try {
            com.google.firebase.crashlytics.internal.common.a a6 = com.google.firebase.crashlytics.internal.common.a.a(n5, d0Var, j5, n6, j6, new com.google.firebase.crashlytics.internal.f(n5));
            com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s("Ꮛ") + a6.f15544d);
            ExecutorService c7 = b0.c(ProtectedSandApp.s("Ꮜ"));
            com.google.firebase.crashlytics.internal.settings.f l5 = com.google.firebase.crashlytics.internal.settings.f.l(n5, j5, d0Var, new d2.b(), a6.f15546f, a6.f15547g, fVar, zVar);
            l5.p(c7).continueWith(c7, new a());
            Tasks.call(c7, new b(sVar.t(a6, l5), sVar, l5));
            return new i(sVar);
        } catch (PackageManager.NameNotFoundException e6) {
            com.google.firebase.crashlytics.internal.g.f().e(ProtectedSandApp.s("Ꮝ"), e6);
            return null;
        }
    }

    @o0
    public Task<Boolean> a() {
        return this.f15519a.e();
    }

    public void b() {
        this.f15519a.f();
    }

    public boolean c() {
        return this.f15519a.g();
    }

    public void f(@o0 String str) {
        this.f15519a.o(str);
    }

    public void g(@o0 Throwable th) {
        if (th == null) {
            com.google.firebase.crashlytics.internal.g.f().m(ProtectedSandApp.s("Ꮞ"));
        } else {
            this.f15519a.p(th);
        }
    }

    public void h() {
        this.f15519a.u();
    }

    public void i(@q0 Boolean bool) {
        this.f15519a.v(bool);
    }

    public void j(boolean z5) {
        this.f15519a.v(Boolean.valueOf(z5));
    }

    public void k(@o0 String str, double d6) {
        this.f15519a.w(str, Double.toString(d6));
    }

    public void l(@o0 String str, float f6) {
        this.f15519a.w(str, Float.toString(f6));
    }

    public void m(@o0 String str, int i5) {
        this.f15519a.w(str, Integer.toString(i5));
    }

    public void n(@o0 String str, long j5) {
        this.f15519a.w(str, Long.toString(j5));
    }

    public void o(@o0 String str, @o0 String str2) {
        this.f15519a.w(str, str2);
    }

    public void p(@o0 String str, boolean z5) {
        this.f15519a.w(str, Boolean.toString(z5));
    }

    public void q(@o0 h hVar) {
        this.f15519a.x(hVar.f15514a);
    }

    public void r(@o0 String str) {
        this.f15519a.z(str);
    }
}
