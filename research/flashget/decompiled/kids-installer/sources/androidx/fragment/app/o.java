package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.q0;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: FragmentLifecycleCallbacksDispatcher.java */
/* loaded from: classes.dex */
class o {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.o0
    private final CopyOnWriteArrayList<a> f8349a = new CopyOnWriteArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.o0
    private final FragmentManager f8350b;

    /* compiled from: FragmentLifecycleCallbacksDispatcher.java */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.o0
        final FragmentManager.m f8351a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f8352b;

        a(@androidx.annotation.o0 FragmentManager.m mVar, boolean z5) {
            this.f8351a = mVar;
            this.f8352b = z5;
        }
    }

    o(@androidx.annotation.o0 FragmentManager fragmentManager) {
        this.f8350b = fragmentManager;
    }

    void a(@androidx.annotation.o0 Fragment fragment, @q0 Bundle bundle, boolean z5) {
        Fragment M0 = this.f8350b.M0();
        if (M0 != null) {
            M0.getParentFragmentManager().L0().a(fragment, bundle, true);
        }
        Iterator<a> it = this.f8349a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z5 || next.f8352b) {
                next.f8351a.a(this.f8350b, fragment, bundle);
            }
        }
    }

    void b(@androidx.annotation.o0 Fragment fragment, boolean z5) {
        Context j5 = this.f8350b.J0().j();
        Fragment M0 = this.f8350b.M0();
        if (M0 != null) {
            M0.getParentFragmentManager().L0().b(fragment, true);
        }
        Iterator<a> it = this.f8349a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z5 || next.f8352b) {
                next.f8351a.b(this.f8350b, fragment, j5);
            }
        }
    }

    void c(@androidx.annotation.o0 Fragment fragment, @q0 Bundle bundle, boolean z5) {
        Fragment M0 = this.f8350b.M0();
        if (M0 != null) {
            M0.getParentFragmentManager().L0().c(fragment, bundle, true);
        }
        Iterator<a> it = this.f8349a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z5 || next.f8352b) {
                next.f8351a.c(this.f8350b, fragment, bundle);
            }
        }
    }

    void d(@androidx.annotation.o0 Fragment fragment, boolean z5) {
        Fragment M0 = this.f8350b.M0();
        if (M0 != null) {
            M0.getParentFragmentManager().L0().d(fragment, true);
        }
        Iterator<a> it = this.f8349a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z5 || next.f8352b) {
                next.f8351a.d(this.f8350b, fragment);
            }
        }
    }

    void e(@androidx.annotation.o0 Fragment fragment, boolean z5) {
        Fragment M0 = this.f8350b.M0();
        if (M0 != null) {
            M0.getParentFragmentManager().L0().e(fragment, true);
        }
        Iterator<a> it = this.f8349a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z5 || next.f8352b) {
                next.f8351a.e(this.f8350b, fragment);
            }
        }
    }

    void f(@androidx.annotation.o0 Fragment fragment, boolean z5) {
        Fragment M0 = this.f8350b.M0();
        if (M0 != null) {
            M0.getParentFragmentManager().L0().f(fragment, true);
        }
        Iterator<a> it = this.f8349a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z5 || next.f8352b) {
                next.f8351a.f(this.f8350b, fragment);
            }
        }
    }

    void g(@androidx.annotation.o0 Fragment fragment, boolean z5) {
        Context j5 = this.f8350b.J0().j();
        Fragment M0 = this.f8350b.M0();
        if (M0 != null) {
            M0.getParentFragmentManager().L0().g(fragment, true);
        }
        Iterator<a> it = this.f8349a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z5 || next.f8352b) {
                next.f8351a.g(this.f8350b, fragment, j5);
            }
        }
    }

    void h(@androidx.annotation.o0 Fragment fragment, @q0 Bundle bundle, boolean z5) {
        Fragment M0 = this.f8350b.M0();
        if (M0 != null) {
            M0.getParentFragmentManager().L0().h(fragment, bundle, true);
        }
        Iterator<a> it = this.f8349a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z5 || next.f8352b) {
                next.f8351a.h(this.f8350b, fragment, bundle);
            }
        }
    }

    void i(@androidx.annotation.o0 Fragment fragment, boolean z5) {
        Fragment M0 = this.f8350b.M0();
        if (M0 != null) {
            M0.getParentFragmentManager().L0().i(fragment, true);
        }
        Iterator<a> it = this.f8349a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z5 || next.f8352b) {
                next.f8351a.i(this.f8350b, fragment);
            }
        }
    }

    void j(@androidx.annotation.o0 Fragment fragment, @androidx.annotation.o0 Bundle bundle, boolean z5) {
        Fragment M0 = this.f8350b.M0();
        if (M0 != null) {
            M0.getParentFragmentManager().L0().j(fragment, bundle, true);
        }
        Iterator<a> it = this.f8349a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z5 || next.f8352b) {
                next.f8351a.j(this.f8350b, fragment, bundle);
            }
        }
    }

    void k(@androidx.annotation.o0 Fragment fragment, boolean z5) {
        Fragment M0 = this.f8350b.M0();
        if (M0 != null) {
            M0.getParentFragmentManager().L0().k(fragment, true);
        }
        Iterator<a> it = this.f8349a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z5 || next.f8352b) {
                next.f8351a.k(this.f8350b, fragment);
            }
        }
    }

    void l(@androidx.annotation.o0 Fragment fragment, boolean z5) {
        Fragment M0 = this.f8350b.M0();
        if (M0 != null) {
            M0.getParentFragmentManager().L0().l(fragment, true);
        }
        Iterator<a> it = this.f8349a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z5 || next.f8352b) {
                next.f8351a.l(this.f8350b, fragment);
            }
        }
    }

    void m(@androidx.annotation.o0 Fragment fragment, @androidx.annotation.o0 View view, @q0 Bundle bundle, boolean z5) {
        Fragment M0 = this.f8350b.M0();
        if (M0 != null) {
            M0.getParentFragmentManager().L0().m(fragment, view, bundle, true);
        }
        Iterator<a> it = this.f8349a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z5 || next.f8352b) {
                next.f8351a.m(this.f8350b, fragment, view, bundle);
            }
        }
    }

    void n(@androidx.annotation.o0 Fragment fragment, boolean z5) {
        Fragment M0 = this.f8350b.M0();
        if (M0 != null) {
            M0.getParentFragmentManager().L0().n(fragment, true);
        }
        Iterator<a> it = this.f8349a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z5 || next.f8352b) {
                next.f8351a.n(this.f8350b, fragment);
            }
        }
    }

    public void o(@androidx.annotation.o0 FragmentManager.m mVar, boolean z5) {
        this.f8349a.add(new a(mVar, z5));
    }

    public void p(@androidx.annotation.o0 FragmentManager.m mVar) {
        synchronized (this.f8349a) {
            int size = this.f8349a.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    break;
                }
                if (this.f8349a.get(i5).f8351a == mVar) {
                    this.f8349a.remove(i5);
                    break;
                }
                i5++;
            }
        }
    }
}
