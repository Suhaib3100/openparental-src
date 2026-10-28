package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.view.AbstractC1450w;
import androidx.view.C1459c;
import androidx.view.C1460d;
import androidx.view.InterfaceC1449v;
import androidx.view.InterfaceC1461e;
import androidx.view.c1;
import androidx.view.k1;
import androidx.view.n1;
import androidx.view.o1;
import androidx.view.z0;
import kotlin.AbstractC1477a;
import kotlin.C1481e;

/* compiled from: FragmentViewLifecycleOwner.java */
/* loaded from: classes3.dex */
class q0 implements InterfaceC1449v, InterfaceC1461e, o1 {

    /* renamed from: b, reason: collision with root package name */
    private final Fragment f30050b;

    /* renamed from: c, reason: collision with root package name */
    private final n1 f30051c;

    /* renamed from: d, reason: collision with root package name */
    private k1.b f30052d;

    /* renamed from: e, reason: collision with root package name */
    private androidx.view.g0 f30053e = null;

    /* renamed from: f, reason: collision with root package name */
    private C1460d f30054f = null;

    q0(@androidx.annotation.o0 Fragment fragment, @androidx.annotation.o0 n1 n1Var) {
        this.f30050b = fragment;
        this.f30051c = n1Var;
    }

    void a(@androidx.annotation.o0 AbstractC1450w.a aVar) {
        this.f30053e.l(aVar);
    }

    void b() {
        if (this.f30053e == null) {
            this.f30053e = new androidx.view.g0(this);
            C1460d a5 = C1460d.a(this);
            this.f30054f = a5;
            a5.c();
        }
    }

    boolean c() {
        return this.f30053e != null;
    }

    void d(@androidx.annotation.q0 Bundle bundle) {
        this.f30054f.d(bundle);
    }

    void e(@androidx.annotation.o0 Bundle bundle) {
        this.f30054f.e(bundle);
    }

    void f(@androidx.annotation.o0 AbstractC1450w.b bVar) {
        this.f30053e.s(bVar);
    }

    @Override // androidx.view.InterfaceC1449v
    @androidx.annotation.i
    @androidx.annotation.o0
    public AbstractC1477a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = this.f30050b.requireContext().getApplicationContext();
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
        C1481e c1481e = new C1481e();
        if (application != null) {
            c1481e.c(k1.a.f30372i, application);
        }
        c1481e.c(z0.f30493c, this.f30050b);
        c1481e.c(z0.f30494d, this);
        if (this.f30050b.getArguments() != null) {
            c1481e.c(z0.f30495e, this.f30050b.getArguments());
        }
        return c1481e;
    }

    @Override // androidx.view.InterfaceC1449v
    @androidx.annotation.o0
    public k1.b getDefaultViewModelProviderFactory() {
        Application application;
        k1.b defaultViewModelProviderFactory = this.f30050b.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.f30050b.mDefaultFactory)) {
            this.f30052d = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f30052d == null) {
            Context applicationContext = this.f30050b.requireContext().getApplicationContext();
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
            Fragment fragment = this.f30050b;
            this.f30052d = new c1(application, fragment, fragment.getArguments());
        }
        return this.f30052d;
    }

    @Override // androidx.view.InterfaceC1423e0
    @androidx.annotation.o0
    public AbstractC1450w getLifecycle() {
        b();
        return this.f30053e;
    }

    @Override // androidx.view.InterfaceC1461e
    @androidx.annotation.o0
    public C1459c getSavedStateRegistry() {
        b();
        return this.f30054f.getSavedStateRegistry();
    }

    @Override // androidx.view.o1
    @androidx.annotation.o0
    public n1 getViewModelStore() {
        b();
        return this.f30051c;
    }
}
