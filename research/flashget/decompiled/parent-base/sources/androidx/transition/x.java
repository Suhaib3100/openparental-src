package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.x1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TransitionManager.java */
/* loaded from: classes3.dex */
public class x {

    /* renamed from: c, reason: collision with root package name */
    private static final String f35247c = "TransitionManager";

    /* renamed from: d, reason: collision with root package name */
    private static Transition f35248d = new AutoTransition();

    /* renamed from: e, reason: collision with root package name */
    private static ThreadLocal<WeakReference<androidx.collection.a<ViewGroup, ArrayList<Transition>>>> f35249e = new ThreadLocal<>();

    /* renamed from: f, reason: collision with root package name */
    static ArrayList<ViewGroup> f35250f = new ArrayList<>();

    /* renamed from: a, reason: collision with root package name */
    private androidx.collection.a<s, Transition> f35251a = new androidx.collection.a<>();

    /* renamed from: b, reason: collision with root package name */
    private androidx.collection.a<s, androidx.collection.a<s, Transition>> f35252b = new androidx.collection.a<>();

    /* compiled from: TransitionManager.java */
    private static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: b, reason: collision with root package name */
        Transition f35253b;

        /* renamed from: c, reason: collision with root package name */
        ViewGroup f35254c;

        /* compiled from: TransitionManager.java */
        /* renamed from: androidx.transition.x$a$a, reason: collision with other inner class name */
        class C0631a extends w {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.collection.a f35255b;

            C0631a(androidx.collection.a aVar) {
                this.f35255b = aVar;
            }

            @Override // androidx.transition.w, androidx.transition.Transition.h
            public void d(@androidx.annotation.o0 Transition transition) {
                ((ArrayList) this.f35255b.get(a.this.f35254c)).remove(transition);
                transition.q0(this);
            }
        }

        a(Transition transition, ViewGroup viewGroup) {
            this.f35253b = transition;
            this.f35254c = viewGroup;
        }

        private void a() {
            this.f35254c.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f35254c.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!x.f35250f.remove(this.f35254c)) {
                return true;
            }
            androidx.collection.a<ViewGroup, ArrayList<Transition>> e4 = x.e();
            ArrayList<Transition> arrayList = e4.get(this.f35254c);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                e4.put(this.f35254c, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f35253b);
            this.f35253b.b(new C0631a(e4));
            this.f35253b.q(this.f35254c, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).w0(this.f35254c);
                }
            }
            this.f35253b.p0(this.f35254c);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            x.f35250f.remove(this.f35254c);
            ArrayList<Transition> arrayList = x.e().get(this.f35254c);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<Transition> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().w0(this.f35254c);
                }
            }
            this.f35253b.r(true);
        }
    }

    public static void a(@androidx.annotation.o0 ViewGroup viewGroup) {
        b(viewGroup, null);
    }

    public static void b(@androidx.annotation.o0 ViewGroup viewGroup, @androidx.annotation.q0 Transition transition) {
        if (f35250f.contains(viewGroup) || !x1.Y0(viewGroup)) {
            return;
        }
        f35250f.add(viewGroup);
        if (transition == null) {
            transition = f35248d;
        }
        Transition clone = transition.clone();
        j(viewGroup, clone);
        s.g(viewGroup, null);
        i(viewGroup, clone);
    }

    private static void c(s sVar, Transition transition) {
        ViewGroup e4 = sVar.e();
        if (f35250f.contains(e4)) {
            return;
        }
        s c5 = s.c(e4);
        if (transition == null) {
            if (c5 != null) {
                c5.b();
            }
            sVar.a();
            return;
        }
        f35250f.add(e4);
        Transition clone = transition.clone();
        if (c5 != null && c5.f()) {
            clone.z0(true);
        }
        j(e4, clone);
        sVar.a();
        i(e4, clone);
    }

    public static void d(ViewGroup viewGroup) {
        f35250f.remove(viewGroup);
        ArrayList<Transition> arrayList = e().get(viewGroup);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            ((Transition) arrayList2.get(size)).I(viewGroup);
        }
    }

    static androidx.collection.a<ViewGroup, ArrayList<Transition>> e() {
        androidx.collection.a<ViewGroup, ArrayList<Transition>> aVar;
        WeakReference<androidx.collection.a<ViewGroup, ArrayList<Transition>>> weakReference = f35249e.get();
        if (weakReference != null && (aVar = weakReference.get()) != null) {
            return aVar;
        }
        androidx.collection.a<ViewGroup, ArrayList<Transition>> aVar2 = new androidx.collection.a<>();
        f35249e.set(new WeakReference<>(aVar2));
        return aVar2;
    }

    private Transition f(s sVar) {
        s c5;
        androidx.collection.a<s, Transition> aVar;
        Transition transition;
        ViewGroup e4 = sVar.e();
        if (e4 != null && (c5 = s.c(e4)) != null && (aVar = this.f35252b.get(sVar)) != null && (transition = aVar.get(c5)) != null) {
            return transition;
        }
        Transition transition2 = this.f35251a.get(sVar);
        return transition2 != null ? transition2 : f35248d;
    }

    public static void g(@androidx.annotation.o0 s sVar) {
        c(sVar, f35248d);
    }

    public static void h(@androidx.annotation.o0 s sVar, @androidx.annotation.q0 Transition transition) {
        c(sVar, transition);
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
                it.next().o0(viewGroup);
            }
        }
        if (transition != null) {
            transition.q(viewGroup, true);
        }
        s c5 = s.c(viewGroup);
        if (c5 != null) {
            c5.b();
        }
    }

    public void k(@androidx.annotation.o0 s sVar, @androidx.annotation.o0 s sVar2, @androidx.annotation.q0 Transition transition) {
        androidx.collection.a<s, Transition> aVar = this.f35252b.get(sVar2);
        if (aVar == null) {
            aVar = new androidx.collection.a<>();
            this.f35252b.put(sVar2, aVar);
        }
        aVar.put(sVar, transition);
    }

    public void l(@androidx.annotation.o0 s sVar, @androidx.annotation.q0 Transition transition) {
        this.f35251a.put(sVar, transition);
    }

    public void m(@androidx.annotation.o0 s sVar) {
        c(sVar, f(sVar));
    }
}
