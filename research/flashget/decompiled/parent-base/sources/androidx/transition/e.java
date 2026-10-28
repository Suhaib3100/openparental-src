package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.c1;
import androidx.core.os.f;
import androidx.fragment.app.Fragment;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FragmentTransitionSupport.java */
@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
@SuppressLint({"RestrictedApi"})
/* loaded from: classes3.dex */
public class e extends androidx.fragment.app.p0 {

    /* compiled from: FragmentTransitionSupport.java */
    class a extends Transition.f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f34386a;

        a(Rect rect) {
            this.f34386a = rect;
        }

        @Override // androidx.transition.Transition.f
        public Rect a(@androidx.annotation.o0 Transition transition) {
            return this.f34386a;
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    class b implements Transition.h {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f34388b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f34389c;

        b(View view, ArrayList arrayList) {
            this.f34388b = view;
            this.f34389c = arrayList;
        }

        @Override // androidx.transition.Transition.h
        public void a(@androidx.annotation.o0 Transition transition) {
        }

        @Override // androidx.transition.Transition.h
        public void b(@androidx.annotation.o0 Transition transition) {
            transition.q0(this);
            transition.b(this);
        }

        @Override // androidx.transition.Transition.h
        public void c(@androidx.annotation.o0 Transition transition) {
        }

        @Override // androidx.transition.Transition.h
        public void d(@androidx.annotation.o0 Transition transition) {
            transition.q0(this);
            this.f34388b.setVisibility(8);
            int size = this.f34389c.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((View) this.f34389c.get(i4)).setVisibility(0);
            }
        }

        @Override // androidx.transition.Transition.h
        public void e(@androidx.annotation.o0 Transition transition) {
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    class c extends w {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f34391b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f34392c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f34393d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList f34394e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f34395f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ArrayList f34396g;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f34391b = obj;
            this.f34392c = arrayList;
            this.f34393d = obj2;
            this.f34394e = arrayList2;
            this.f34395f = obj3;
            this.f34396g = arrayList3;
        }

        @Override // androidx.transition.w, androidx.transition.Transition.h
        public void b(@androidx.annotation.o0 Transition transition) {
            Object obj = this.f34391b;
            if (obj != null) {
                e.this.n(obj, this.f34392c, null);
            }
            Object obj2 = this.f34393d;
            if (obj2 != null) {
                e.this.n(obj2, this.f34394e, null);
            }
            Object obj3 = this.f34395f;
            if (obj3 != null) {
                e.this.n(obj3, this.f34396g, null);
            }
        }

        @Override // androidx.transition.w, androidx.transition.Transition.h
        public void d(@androidx.annotation.o0 Transition transition) {
            transition.q0(this);
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    class d implements f.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Transition f34398a;

        d(Transition transition) {
            this.f34398a = transition;
        }

        @Override // androidx.core.os.f.a
        public void onCancel() {
            this.f34398a.cancel();
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    /* renamed from: androidx.transition.e$e, reason: collision with other inner class name */
    class C0630e implements Transition.h {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f34400b;

        C0630e(Runnable runnable) {
            this.f34400b = runnable;
        }

        @Override // androidx.transition.Transition.h
        public void a(@androidx.annotation.o0 Transition transition) {
        }

        @Override // androidx.transition.Transition.h
        public void b(@androidx.annotation.o0 Transition transition) {
        }

        @Override // androidx.transition.Transition.h
        public void c(@androidx.annotation.o0 Transition transition) {
        }

        @Override // androidx.transition.Transition.h
        public void d(@androidx.annotation.o0 Transition transition) {
            this.f34400b.run();
        }

        @Override // androidx.transition.Transition.h
        public void e(@androidx.annotation.o0 Transition transition) {
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    class f extends Transition.f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f34402a;

        f(Rect rect) {
            this.f34402a = rect;
        }

        @Override // androidx.transition.Transition.f
        public Rect a(@androidx.annotation.o0 Transition transition) {
            Rect rect = this.f34402a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f34402a;
        }
    }

    private static boolean x(Transition transition) {
        return (androidx.fragment.app.p0.i(transition.V()) && androidx.fragment.app.p0.i(transition.W()) && androidx.fragment.app.p0.i(transition.Y())) ? false : true;
    }

    @Override // androidx.fragment.app.p0
    public void a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).d(view);
        }
    }

    @Override // androidx.fragment.app.p0
    public void b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i4 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int U0 = transitionSet.U0();
            while (i4 < U0) {
                b(transitionSet.T0(i4), arrayList);
                i4++;
            }
            return;
        }
        if (x(transition) || !androidx.fragment.app.p0.i(transition.Z())) {
            return;
        }
        int size = arrayList.size();
        while (i4 < size) {
            transition.d(arrayList.get(i4));
            i4++;
        }
    }

    @Override // androidx.fragment.app.p0
    public void c(ViewGroup viewGroup, Object obj) {
        x.b(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.p0
    public boolean e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.p0
    public Object f(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.p0
    public Object j(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().Q0(transition).Q0(transition2).d1(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.Q0(transition);
        }
        transitionSet.Q0(transition3);
        return transitionSet;
    }

    @Override // androidx.fragment.app.p0
    public Object k(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.Q0((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.Q0((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.Q0((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.p0
    public void m(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).t0(view);
        }
    }

    @Override // androidx.fragment.app.p0
    public void n(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        Transition transition = (Transition) obj;
        int i4 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int U0 = transitionSet.U0();
            while (i4 < U0) {
                n(transitionSet.T0(i4), arrayList, arrayList2);
                i4++;
            }
            return;
        }
        if (x(transition)) {
            return;
        }
        List<View> Z = transition.Z();
        if (Z.size() == arrayList.size() && Z.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i4 < size) {
                transition.d(arrayList2.get(i4));
                i4++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.t0(arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.p0
    public void o(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).b(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.p0
    public void p(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).b(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.p0
    public void q(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).B0(new f(rect));
        }
    }

    @Override // androidx.fragment.app.p0
    public void r(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            h(view, rect);
            ((Transition) obj).B0(new a(rect));
        }
    }

    @Override // androidx.fragment.app.p0
    public void s(@androidx.annotation.o0 Fragment fragment, @androidx.annotation.o0 Object obj, @androidx.annotation.o0 androidx.core.os.f fVar, @androidx.annotation.o0 Runnable runnable) {
        Transition transition = (Transition) obj;
        fVar.d(new d(transition));
        transition.b(new C0630e(runnable));
    }

    @Override // androidx.fragment.app.p0
    public void u(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> Z = transitionSet.Z();
        Z.clear();
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            androidx.fragment.app.p0.d(Z, arrayList.get(i4));
        }
        Z.add(view);
        arrayList.add(view);
        b(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.p0
    public void v(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.Z().clear();
            transitionSet.Z().addAll(arrayList2);
            n(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.p0
    public Object w(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.Q0((Transition) obj);
        return transitionSet;
    }
}
