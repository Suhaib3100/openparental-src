package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: FragmentLifecycleCallbacksDispatcher.java */
/* loaded from: classes3.dex */
class s {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.o0
    private final CopyOnWriteArrayList<a> f30066a = new CopyOnWriteArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.o0
    private final FragmentManager f30067b;

    /* compiled from: FragmentLifecycleCallbacksDispatcher.java */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.o0
        final FragmentManager.m f30068a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f30069b;

        a(@androidx.annotation.o0 FragmentManager.m mVar, boolean z4) {
            this.f30068a = mVar;
            this.f30069b = z4;
        }
    }

    s(@androidx.annotation.o0 FragmentManager fragmentManager) {
        this.f30067b = fragmentManager;
    }

    void a(@androidx.annotation.o0 Fragment fragment, @androidx.annotation.q0 Bundle bundle, boolean z4) {
        Fragment M0 = this.f30067b.M0();
        if (M0 != null) {
            M0.getParentFragmentManager().L0().a(fragment, bundle, true);
        }
        Iterator<a> it = this.f30066a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z4 || next.f30069b) {
                next.f30068a.a(this.f30067b, fragment, bundle);
            }
        }
    }

    void b(@androidx.annotation.o0 Fragment fragment, boolean z4) {
        Context f4 = this.f30067b.J0().f();
        Fragment M0 = this.f30067b.M0();
        if (M0 != null) {
            M0.getParentFragmentManager().L0().b(fragment, true);
        }
        Iterator<a> it = this.f30066a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z4 || next.f30069b) {
                next.f30068a.b(this.f30067b, fragment, f4);
            }
        }
    }

    void c(@androidx.annotation.o0 Fragment fragment, @androidx.annotation.q0 Bundle bundle, boolean z4) {
        Fragment M0 = this.f30067b.M0();
        if (M0 != null) {
            M0.getParentFragmentManager().L0().c(fragment, bundle, true);
        }
        Iterator<a> it = this.f30066a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z4 || next.f30069b) {
                next.f30068a.c(this.f30067b, fragment, bundle);
            }
        }
    }

    void d(@androidx.annotation.o0 Fragment fragment, boolean z4) {
        Fragment M0 = this.f30067b.M0();
        if (M0 != null) {
            M0.getParentFragmentManager().L0().d(fragment, true);
        }
        Iterator<a> it = this.f30066a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z4 || next.f30069b) {
                next.f30068a.d(this.f30067b, fragment);
            }
        }
    }

    void e(@androidx.annotation.o0 Fragment fragment, boolean z4) {
        Fragment M0 = this.f30067b.M0();
        if (M0 != null) {
            M0.getParentFragmentManager().L0().e(fragment, true);
        }
        Iterator<a> it = this.f30066a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z4 || next.f30069b) {
                next.f30068a.e(this.f30067b, fragment);
            }
        }
    }

    void f(@androidx.annotation.o0 Fragment fragment, boolean z4) {
        Fragment M0 = this.f30067b.M0();
        if (M0 != null) {
            M0.getParentFragmentManager().L0().f(fragment, true);
        }
        Iterator<a> it = this.f30066a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z4 || next.f30069b) {
                next.f30068a.f(this.f30067b, fragment);
            }
        }
    }

    void g(@androidx.annotation.o0 Fragment fragment, boolean z4) {
        Context f4 = this.f30067b.J0().f();
        Fragment M0 = this.f30067b.M0();
        if (M0 != null) {
            M0.getParentFragmentManager().L0().g(fragment, true);
        }
        Iterator<a> it = this.f30066a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z4 || next.f30069b) {
                next.f30068a.g(this.f30067b, fragment, f4);
            }
        }
    }

    void h(@androidx.annotation.o0 Fragment fragment, @androidx.annotation.q0 Bundle bundle, boolean z4) {
        Fragment M0 = this.f30067b.M0();
        if (M0 != null) {
            M0.getParentFragmentManager().L0().h(fragment, bundle, true);
        }
        Iterator<a> it = this.f30066a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z4 || next.f30069b) {
                next.f30068a.h(this.f30067b, fragment, bundle);
            }
        }
    }

    void i(@androidx.annotation.o0 Fragment fragment, boolean z4) {
        Fragment M0 = this.f30067b.M0();
        if (M0 != null) {
            M0.getParentFragmentManager().L0().i(fragment, true);
        }
        Iterator<a> it = this.f30066a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z4 || next.f30069b) {
                next.f30068a.i(this.f30067b, fragment);
            }
        }
    }

    void j(@androidx.annotation.o0 Fragment fragment, @androidx.annotation.o0 Bundle bundle, boolean z4) {
        Fragment M0 = this.f30067b.M0();
        if (M0 != null) {
            M0.getParentFragmentManager().L0().j(fragment, bundle, true);
        }
        Iterator<a> it = this.f30066a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z4 || next.f30069b) {
                next.f30068a.j(this.f30067b, fragment, bundle);
            }
        }
    }

    void k(@androidx.annotation.o0 Fragment fragment, boolean z4) {
        Fragment M0 = this.f30067b.M0();
        if (M0 != null) {
            M0.getParentFragmentManager().L0().k(fragment, true);
        }
        Iterator<a> it = this.f30066a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z4 || next.f30069b) {
                next.f30068a.k(this.f30067b, fragment);
            }
        }
    }

    void l(@androidx.annotation.o0 Fragment fragment, boolean z4) {
        Fragment M0 = this.f30067b.M0();
        if (M0 != null) {
            M0.getParentFragmentManager().L0().l(fragment, true);
        }
        Iterator<a> it = this.f30066a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z4 || next.f30069b) {
                next.f30068a.l(this.f30067b, fragment);
            }
        }
    }

    void m(@androidx.annotation.o0 Fragment fragment, @androidx.annotation.o0 View view, @androidx.annotation.q0 Bundle bundle, boolean z4) {
        Fragment M0 = this.f30067b.M0();
        if (M0 != null) {
            M0.getParentFragmentManager().L0().m(fragment, view, bundle, true);
        }
        Iterator<a> it = this.f30066a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z4 || next.f30069b) {
                next.f30068a.m(this.f30067b, fragment, view, bundle);
            }
        }
    }

    void n(@androidx.annotation.o0 Fragment fragment, boolean z4) {
        Fragment M0 = this.f30067b.M0();
        if (M0 != null) {
            M0.getParentFragmentManager().L0().n(fragment, true);
        }
        Iterator<a> it = this.f30066a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z4 || next.f30069b) {
                next.f30068a.n(this.f30067b, fragment);
            }
        }
    }

    public void o(@androidx.annotation.o0 FragmentManager.m mVar, boolean z4) {
        this.f30066a.add(new a(mVar, z4));
    }

    public void p(@androidx.annotation.o0 FragmentManager.m mVar) {
        synchronized (this.f30066a) {
            try {
                int size = this.f30066a.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        break;
                    }
                    if (this.f30066a.get(i4).f30068a == mVar) {
                        this.f30066a.remove(i4);
                        break;
                    }
                    i4++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
