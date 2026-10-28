package androidx.core.view;

import android.annotation.SuppressLint;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.t;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MenuHostHelper.java */
/* loaded from: classes.dex */
public class o0 {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f5613a;

    /* renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList<e1> f5614b = new CopyOnWriteArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private final Map<e1, a> f5615c = new HashMap();

    /* compiled from: MenuHostHelper.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        final android.view.t f5616a;

        /* renamed from: b, reason: collision with root package name */
        private android.view.w f5617b;

        a(@androidx.annotation.o0 android.view.t tVar, @androidx.annotation.o0 android.view.w wVar) {
            this.f5616a = tVar;
            this.f5617b = wVar;
            tVar.a(wVar);
        }

        void a() {
            this.f5616a.c(this.f5617b);
            this.f5617b = null;
        }
    }

    public o0(@androidx.annotation.o0 Runnable runnable) {
        this.f5613a = runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(e1 e1Var, android.view.a0 a0Var, t.b bVar) {
        if (bVar == t.b.ON_DESTROY) {
            l(e1Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(t.c cVar, e1 e1Var, android.view.a0 a0Var, t.b bVar) {
        if (bVar == t.b.upTo(cVar)) {
            c(e1Var);
            return;
        }
        if (bVar == t.b.ON_DESTROY) {
            l(e1Var);
        } else if (bVar == t.b.downFrom(cVar)) {
            this.f5614b.remove(e1Var);
            this.f5613a.run();
        }
    }

    public void c(@androidx.annotation.o0 e1 e1Var) {
        this.f5614b.add(e1Var);
        this.f5613a.run();
    }

    public void d(@androidx.annotation.o0 final e1 e1Var, @androidx.annotation.o0 android.view.a0 a0Var) {
        c(e1Var);
        android.view.t lifecycle = a0Var.getLifecycle();
        a remove = this.f5615c.remove(e1Var);
        if (remove != null) {
            remove.a();
        }
        this.f5615c.put(e1Var, new a(lifecycle, new android.view.w() { // from class: androidx.core.view.m0
            @Override // android.view.w
            public final void h(android.view.a0 a0Var2, t.b bVar) {
                o0.this.f(e1Var, a0Var2, bVar);
            }
        }));
    }

    @SuppressLint({"LambdaLast"})
    public void e(@androidx.annotation.o0 final e1 e1Var, @androidx.annotation.o0 android.view.a0 a0Var, @androidx.annotation.o0 final t.c cVar) {
        android.view.t lifecycle = a0Var.getLifecycle();
        a remove = this.f5615c.remove(e1Var);
        if (remove != null) {
            remove.a();
        }
        this.f5615c.put(e1Var, new a(lifecycle, new android.view.w() { // from class: androidx.core.view.n0
            @Override // android.view.w
            public final void h(android.view.a0 a0Var2, t.b bVar) {
                o0.this.g(cVar, e1Var, a0Var2, bVar);
            }
        }));
    }

    public void h(@androidx.annotation.o0 Menu menu, @androidx.annotation.o0 MenuInflater menuInflater) {
        Iterator<e1> it = this.f5614b.iterator();
        while (it.hasNext()) {
            it.next().c(menu, menuInflater);
        }
    }

    public void i(@androidx.annotation.o0 Menu menu) {
        Iterator<e1> it = this.f5614b.iterator();
        while (it.hasNext()) {
            it.next().b(menu);
        }
    }

    public boolean j(@androidx.annotation.o0 MenuItem menuItem) {
        Iterator<e1> it = this.f5614b.iterator();
        while (it.hasNext()) {
            if (it.next().a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void k(@androidx.annotation.o0 Menu menu) {
        Iterator<e1> it = this.f5614b.iterator();
        while (it.hasNext()) {
            it.next().d(menu);
        }
    }

    public void l(@androidx.annotation.o0 e1 e1Var) {
        this.f5614b.remove(e1Var);
        a remove = this.f5615c.remove(e1Var);
        if (remove != null) {
            remove.a();
        }
        this.f5613a.run();
    }
}
