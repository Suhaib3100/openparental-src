package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.C0536c;
import android.view.C0537d;
import android.view.InterfaceC0538e;
import android.view.f1;
import android.view.h1;
import android.view.i1;
import android.view.t;
import android.view.t0;
import android.view.w0;
import androidx.annotation.q0;
import kotlin.AbstractC0540a;
import kotlin.C0542e;

/* compiled from: FragmentViewLifecycleOwner.java */
/* loaded from: classes3.dex */
class j0 implements android.view.s, InterfaceC0538e, i1 {

    /* renamed from: o, reason: collision with root package name */
    private final Fragment f8297o;

    /* renamed from: p, reason: collision with root package name */
    private final h1 f8298p;

    /* renamed from: q, reason: collision with root package name */
    private f1.b f8299q;

    /* renamed from: r, reason: collision with root package name */
    private android.view.c0 f8300r = null;

    /* renamed from: s, reason: collision with root package name */
    private C0537d f8301s = null;

    j0(@androidx.annotation.o0 Fragment fragment, @androidx.annotation.o0 h1 h1Var) {
        this.f8297o = fragment;
        this.f8298p = h1Var;
    }

    void a(@androidx.annotation.o0 t.b bVar) {
        this.f8300r.j(bVar);
    }

    void b() {
        if (this.f8300r == null) {
            this.f8300r = new android.view.c0(this);
            C0537d a6 = C0537d.a(this);
            this.f8301s = a6;
            a6.c();
            t0.c(this);
        }
    }

    boolean c() {
        return this.f8300r != null;
    }

    void d(@q0 Bundle bundle) {
        this.f8301s.d(bundle);
    }

    void e(@androidx.annotation.o0 Bundle bundle) {
        this.f8301s.e(bundle);
    }

    void f(@androidx.annotation.o0 t.c cVar) {
        this.f8300r.q(cVar);
    }

    @Override // android.view.s
    @androidx.annotation.i
    @androidx.annotation.o0
    public AbstractC0540a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = this.f8297o.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        C0542e c0542e = new C0542e();
        if (application != null) {
            c0542e.c(f1.a.f8548i, application);
        }
        c0542e.c(t0.f8663c, this);
        c0542e.c(t0.f8664d, this);
        if (this.f8297o.getArguments() != null) {
            c0542e.c(t0.f8665e, this.f8297o.getArguments());
        }
        return c0542e;
    }

    @Override // android.view.s
    @androidx.annotation.o0
    public f1.b getDefaultViewModelProviderFactory() {
        Application application;
        f1.b defaultViewModelProviderFactory = this.f8297o.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.f8297o.mDefaultFactory)) {
            this.f8299q = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f8299q == null) {
            Context applicationContext = this.f8297o.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.f8299q = new w0(application, this, this.f8297o.getArguments());
        }
        return this.f8299q;
    }

    @Override // android.view.a0
    @androidx.annotation.o0
    public android.view.t getLifecycle() {
        b();
        return this.f8300r;
    }

    @Override // android.view.InterfaceC0538e
    @androidx.annotation.o0
    public C0536c getSavedStateRegistry() {
        b();
        return this.f8301s.getSavedStateRegistry();
    }

    @Override // android.view.i1
    @androidx.annotation.o0
    public h1 getViewModelStore() {
        b();
        return this.f8298p;
    }
}
