package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.y1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TransitionManager.java */
/* loaded from: classes.dex */
public class z {

    /* renamed from: c, reason: collision with root package name */
    private static final String f10121c = "TransitionManager";

    /* renamed from: d, reason: collision with root package name */
    private static Transition f10122d = new AutoTransition();

    /* renamed from: e, reason: collision with root package name */
    private static ThreadLocal<WeakReference<androidx.collection.a<ViewGroup, ArrayList<Transition>>>> f10123e = new ThreadLocal<>();

    /* renamed from: f, reason: collision with root package name */
    static ArrayList<ViewGroup> f10124f = new ArrayList<>();

    /* renamed from: a, reason: collision with root package name */
    private androidx.collection.a<u, Transition> f10125a = new androidx.collection.a<>();

    /* renamed from: b, reason: collision with root package name */
    private androidx.collection.a<u, androidx.collection.a<u, Transition>> f10126b = new androidx.collection.a<>();

    /* compiled from: TransitionManager.java */
    private static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: o, reason: collision with root package name */
        Transition f10127o;

        /* renamed from: p, reason: collision with root package name */
        ViewGroup f10128p;

        /* compiled from: TransitionManager.java */
        /* renamed from: androidx.transition.z$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0121a extends y {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.collection.a f10129a;

            C0121a(androidx.collection.a aVar) {
                this.f10129a = aVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.transition.y, androidx.transition.Transition.h
            public void c(@androidx.annotation.o0 Transition transition) {
                ((ArrayList) this.f10129a.get(a.this.f10128p)).remove(transition);
                transition.u0(this);
            }
        }

        a(Transition transition, ViewGroup viewGroup) {
            this.f10127o = transition;
            this.f10128p = viewGroup;
        }

        private void a() {
            this.f10128p.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f10128p.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!z.f10124f.remove(this.f10128p)) {
                return true;
            }
            androidx.collection.a<ViewGroup, ArrayList<Transition>> e6 = z.e();
            ArrayList<Transition> arrayList = e6.get(this.f10128p);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                e6.put(this.f10128p, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f10127o);
            this.f10127o.a(new C0121a(e6));
            this.f10127o.p(this.f10128p, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).A0(this.f10128p);
                }
            }
            this.f10127o.t0(this.f10128p);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            z.f10124f.remove(this.f10128p);
            ArrayList<Transition> arrayList = z.e().get(this.f10128p);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<Transition> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().A0(this.f10128p);
                }
            }
            this.f10127o.q(true);
        }
    }

    public static void a(@androidx.annotation.o0 ViewGroup viewGroup) {
        b(viewGroup, null);
    }

    public static void b(@androidx.annotation.o0 ViewGroup viewGroup, @androidx.annotation.q0 Transition transition) {
        if (f10124f.contains(viewGroup) || !y1.U0(viewGroup)) {
            return;
        }
        f10124f.add(viewGroup);
        if (transition == null) {
            transition = f10122d;
        }
        Transition clone = transition.clone();
        j(viewGroup, clone);
        u.g(viewGroup, null);
        i(viewGroup, clone);
    }

    private static void c(u uVar, Transition transition) {
        ViewGroup e6 = uVar.e();
        if (f10124f.contains(e6)) {
            return;
        }
        u c6 = u.c(e6);
        if (transition == null) {
            if (c6 != null) {
                c6.b();
            }
            uVar.a();
            return;
        }
        f10124f.add(e6);
        Transition clone = transition.clone();
        clone.K0(e6);
        if (c6 != null && c6.f()) {
            clone.D0(true);
        }
        j(e6, clone);
        uVar.a();
        i(e6, clone);
    }

    public static void d(ViewGroup viewGroup) {
        f10124f.remove(viewGroup);
        ArrayList<Transition> arrayList = e().get(viewGroup);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            ((Transition) arrayList2.get(size)).J(viewGroup);
        }
    }

    static androidx.collection.a<ViewGroup, ArrayList<Transition>> e() {
        androidx.collection.a<ViewGroup, ArrayList<Transition>> aVar;
        WeakReference<androidx.collection.a<ViewGroup, ArrayList<Transition>>> weakReference = f10123e.get();
        if (weakReference != null && (aVar = weakReference.get()) != null) {
            return aVar;
        }
        androidx.collection.a<ViewGroup, ArrayList<Transition>> aVar2 = new androidx.collection.a<>();
        f10123e.set(new WeakReference<>(aVar2));
        return aVar2;
    }

    private Transition f(u uVar) {
        u c6;
        androidx.collection.a<u, Transition> aVar;
        Transition transition;
        ViewGroup e6 = uVar.e();
        if (e6 != null && (c6 = u.c(e6)) != null && (aVar = this.f10126b.get(uVar)) != null && (transition = aVar.get(c6)) != null) {
            return transition;
        }
        Transition transition2 = this.f10125a.get(uVar);
        return transition2 != null ? transition2 : f10122d;
    }

    public static void g(@androidx.annotation.o0 u uVar) {
        c(uVar, f10122d);
    }

    public static void h(@androidx.annotation.o0 u uVar, @androidx.annotation.q0 Transition transition) {
        c(uVar, transition);
    }

    private static void i(ViewGroup viewGroup, Transition transition) {
        if (transition == null || viewGroup == null) {
            return;
        }
        a aVar = new a(transition, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    private static void j(ViewGroup viewGroup, Transition transition) {
        ArrayList<Transition> arrayList = e().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<Transition> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().s0(viewGroup);
            }
        }
        if (transition != null) {
            transition.p(viewGroup, true);
        }
        u c6 = u.c(viewGroup);
        if (c6 != null) {
            c6.b();
        }
    }

    public void k(@androidx.annotation.o0 u uVar, @androidx.annotation.o0 u uVar2, @androidx.annotation.q0 Transition transition) {
        androidx.collection.a<u, Transition> aVar = this.f10126b.get(uVar2);
        if (aVar == null) {
            aVar = new androidx.collection.a<>();
            this.f10126b.put(uVar2, aVar);
        }
        aVar.put(uVar, transition);
    }

    public void l(@androidx.annotation.o0 u uVar, @androidx.annotation.q0 Transition transition) {
        this.f10125a.put(uVar, transition);
    }

    public void m(@androidx.annotation.o0 u uVar) {
        c(uVar, f(uVar));
    }
}
