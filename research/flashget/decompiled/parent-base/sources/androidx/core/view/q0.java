package androidx.core.view;

import android.annotation.SuppressLint;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.view.AbstractC1450w;
import androidx.view.InterfaceC1416b0;
import androidx.view.InterfaceC1423e0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MenuHostHelper.java */
/* loaded from: classes3.dex */
public class q0 {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f27386a;

    /* renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList<t0> f27387b = new CopyOnWriteArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private final Map<t0, a> f27388c = new HashMap();

    /* compiled from: MenuHostHelper.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        final AbstractC1450w f27389a;

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC1416b0 f27390b;

        a(@androidx.annotation.o0 AbstractC1450w abstractC1450w, @androidx.annotation.o0 InterfaceC1416b0 interfaceC1416b0) {
            this.f27389a = abstractC1450w;
            this.f27390b = interfaceC1416b0;
            abstractC1450w.a(interfaceC1416b0);
        }

        void a() {
            this.f27389a.d(this.f27390b);
            this.f27390b = null;
        }
    }

    public q0(@androidx.annotation.o0 Runnable runnable) {
        this.f27386a = runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(t0 t0Var, InterfaceC1423e0 interfaceC1423e0, AbstractC1450w.a aVar) {
        if (aVar == AbstractC1450w.a.ON_DESTROY) {
            l(t0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(AbstractC1450w.b bVar, t0 t0Var, InterfaceC1423e0 interfaceC1423e0, AbstractC1450w.a aVar) {
        if (aVar == AbstractC1450w.a.upTo(bVar)) {
            c(t0Var);
            return;
        }
        if (aVar == AbstractC1450w.a.ON_DESTROY) {
            l(t0Var);
        } else if (aVar == AbstractC1450w.a.downFrom(bVar)) {
            this.f27387b.remove(t0Var);
            this.f27386a.run();
        }
    }

    public void c(@androidx.annotation.o0 t0 t0Var) {
        this.f27387b.add(t0Var);
        this.f27386a.run();
    }

    public void d(@androidx.annotation.o0 final t0 t0Var, @androidx.annotation.o0 InterfaceC1423e0 interfaceC1423e0) {
        c(t0Var);
        AbstractC1450w lifecycle = interfaceC1423e0.getLifecycle();
        a remove = this.f27388c.remove(t0Var);
        if (remove != null) {
            remove.a();
        }
        this.f27388c.put(t0Var, new a(lifecycle, new InterfaceC1416b0() { // from class: androidx.core.view.p0
            @Override // androidx.view.InterfaceC1416b0
            public final void f(InterfaceC1423e0 interfaceC1423e02, AbstractC1450w.a aVar) {
                q0.this.f(t0Var, interfaceC1423e02, aVar);
            }
        }));
    }

    @SuppressLint({"LambdaLast"})
    public void e(@androidx.annotation.o0 final t0 t0Var, @androidx.annotation.o0 InterfaceC1423e0 interfaceC1423e0, @androidx.annotation.o0 final AbstractC1450w.b bVar) {
        AbstractC1450w lifecycle = interfaceC1423e0.getLifecycle();
        a remove = this.f27388c.remove(t0Var);
        if (remove != null) {
            remove.a();
        }
        this.f27388c.put(t0Var, new a(lifecycle, new InterfaceC1416b0() { // from class: androidx.core.view.o0
            @Override // androidx.view.InterfaceC1416b0
            public final void f(InterfaceC1423e0 interfaceC1423e02, AbstractC1450w.a aVar) {
                q0.this.g(bVar, t0Var, interfaceC1423e02, aVar);
            }
        }));
    }

    public void h(@androidx.annotation.o0 Menu menu, @androidx.annotation.o0 MenuInflater menuInflater) {
        Iterator<t0> it = this.f27387b.iterator();
        while (it.hasNext()) {
            it.next().d(menu, menuInflater);
        }
    }

    public void i(@androidx.annotation.o0 Menu menu) {
        Iterator<t0> it = this.f27387b.iterator();
        while (it.hasNext()) {
            it.next().a(menu);
        }
    }

    public boolean j(@androidx.annotation.o0 MenuItem menuItem) {
        Iterator<t0> it = this.f27387b.iterator();
        while (it.hasNext()) {
            if (it.next().c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void k(@androidx.annotation.o0 Menu menu) {
        Iterator<t0> it = this.f27387b.iterator();
        while (it.hasNext()) {
            it.next().b(menu);
        }
    }

    public void l(@androidx.annotation.o0 t0 t0Var) {
        this.f27387b.remove(t0Var);
        a remove = this.f27388c.remove(t0Var);
        if (remove != null) {
            remove.a();
        }
        this.f27386a.run();
    }
}
