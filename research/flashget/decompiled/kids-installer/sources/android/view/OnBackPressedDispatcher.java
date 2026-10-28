package android.view;

import android.annotation.SuppressLint;
import android.view.a0;
import android.view.t;
import android.view.w;
import androidx.annotation.l0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a, reason: collision with root package name */
    @q0
    private final Runnable f81a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayDeque<g> f82b;

    /* loaded from: classes3.dex */
    private class LifecycleOnBackPressedCancellable implements w, android.view.a {

        /* renamed from: o, reason: collision with root package name */
        private final t f83o;

        /* renamed from: p, reason: collision with root package name */
        private final g f84p;

        /* renamed from: q, reason: collision with root package name */
        @q0
        private android.view.a f85q;

        LifecycleOnBackPressedCancellable(@o0 t tVar, @o0 g gVar) {
            this.f83o = tVar;
            this.f84p = gVar;
            tVar.a(this);
        }

        @Override // android.view.a
        public void cancel() {
            this.f83o.c(this);
            this.f84p.e(this);
            android.view.a aVar = this.f85q;
            if (aVar != null) {
                aVar.cancel();
                this.f85q = null;
            }
        }

        @Override // android.view.w
        public void h(@o0 a0 a0Var, @o0 t.b bVar) {
            if (bVar == t.b.ON_START) {
                this.f85q = OnBackPressedDispatcher.this.c(this.f84p);
                return;
            }
            if (bVar != t.b.ON_STOP) {
                if (bVar == t.b.ON_DESTROY) {
                    cancel();
                }
            } else {
                android.view.a aVar = this.f85q;
                if (aVar != null) {
                    aVar.cancel();
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    private class a implements android.view.a {

        /* renamed from: o, reason: collision with root package name */
        private final g f87o;

        a(g gVar) {
            this.f87o = gVar;
        }

        @Override // android.view.a
        public void cancel() {
            OnBackPressedDispatcher.this.f82b.remove(this.f87o);
            this.f87o.e(this);
        }
    }

    public OnBackPressedDispatcher() {
        this(null);
    }

    @l0
    public void a(@o0 g gVar) {
        c(gVar);
    }

    @SuppressLint({"LambdaLast"})
    @l0
    public void b(@o0 a0 a0Var, @o0 g gVar) {
        t lifecycle = a0Var.getLifecycle();
        if (lifecycle.b() == t.c.DESTROYED) {
            return;
        }
        gVar.a(new LifecycleOnBackPressedCancellable(lifecycle, gVar));
    }

    @o0
    @l0
    android.view.a c(@o0 g gVar) {
        this.f82b.add(gVar);
        a aVar = new a(gVar);
        gVar.a(aVar);
        return aVar;
    }

    @l0
    public boolean d() {
        Iterator<g> descendingIterator = this.f82b.descendingIterator();
        while (descendingIterator.hasNext()) {
            if (descendingIterator.next().c()) {
                return true;
            }
        }
        return false;
    }

    @l0
    public void e() {
        Iterator<g> descendingIterator = this.f82b.descendingIterator();
        while (descendingIterator.hasNext()) {
            g next = descendingIterator.next();
            if (next.c()) {
                next.b();
                return;
            }
        }
        Runnable runnable = this.f81a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public OnBackPressedDispatcher(@q0 Runnable runnable) {
        this.f82b = new ArrayDeque<>();
        this.f81a = runnable;
    }
}
