package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.c1;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FragmentTransitionSupport.java */
@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
@SuppressLint({"RestrictedApi"})
/* loaded from: classes3.dex */
public class g extends androidx.fragment.app.i0 {

    /* compiled from: FragmentTransitionSupport.java */
    class a extends Transition.f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f9888a;

        a(Rect rect) {
            this.f9888a = rect;
        }

        @Override // androidx.transition.Transition.f
        public Rect a(@androidx.annotation.o0 Transition transition) {
            return this.f9888a;
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    class b implements Transition.h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f9890a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f9891b;

        b(View view, ArrayList arrayList) {
            this.f9890a = view;
            this.f9891b = arrayList;
        }

        @Override // androidx.transition.Transition.h
        public void a(@androidx.annotation.o0 Transition transition) {
        }

        @Override // androidx.transition.Transition.h
        public void b(@androidx.annotation.o0 Transition transition) {
        }

        @Override // androidx.transition.Transition.h
        public void c(@androidx.annotation.o0 Transition transition) {
            transition.u0(this);
            this.f9890a.setVisibility(8);
            int size = this.f9891b.size();
            for (int i5 = 0; i5 < size; i5++) {
                ((View) this.f9891b.get(i5)).setVisibility(0);
            }
        }

        @Override // androidx.transition.Transition.h
        public void d(@androidx.annotation.o0 Transition transition) {
        }

        @Override // androidx.transition.Transition.h
        public void e(@androidx.annotation.o0 Transition transition) {
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    class c extends y {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f9893a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f9894b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f9895c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f9896d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f9897e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f9898f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f9893a = obj;
            this.f9894b = arrayList;
            this.f9895c = obj2;
            this.f9896d = arrayList2;
            this.f9897e = obj3;
            this.f9898f = arrayList3;
        }

        @Override // androidx.transition.y, androidx.transition.Transition.h
        public void a(@androidx.annotation.o0 Transition transition) {
            Object obj = this.f9893a;
            if (obj != null) {
                g.this.n(obj, this.f9894b, null);
            }
            Object obj2 = this.f9895c;
            if (obj2 != null) {
                g.this.n(obj2, this.f9896d, null);
            }
            Object obj3 = this.f9897e;
            if (obj3 != null) {
                g.this.n(obj3, this.f9898f, null);
            }
        }

        @Override // androidx.transition.y, androidx.transition.Transition.h
        public void c(@androidx.annotation.o0 Transition transition) {
            transition.u0(this);
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    class d extends Transition.f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f9900a;

        d(Rect rect) {
            this.f9900a = rect;
        }

        @Override // androidx.transition.Transition.f
        public Rect a(@androidx.annotation.o0 Transition transition) {
            Rect rect = this.f9900a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f9900a;
        }
    }

    private static boolean x(Transition transition) {
        return (androidx.fragment.app.i0.i(transition.a0()) && androidx.fragment.app.i0.i(transition.b0()) && androidx.fragment.app.i0.i(transition.c0())) ? false : true;
    }

    @Override // androidx.fragment.app.i0
    public void a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).c(view);
        }
    }

    @Override // androidx.fragment.app.i0
    public void b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i5 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int Z0 = transitionSet.Z0();
            while (i5 < Z0) {
                b(transitionSet.Y0(i5), arrayList);
                i5++;
            }
            return;
        }
        if (x(transition) || !androidx.fragment.app.i0.i(transition.d0())) {
            return;
        }
        int size = arrayList.size();
        while (i5 < size) {
            transition.c(arrayList.get(i5));
            i5++;
        }
    }

    @Override // androidx.fragment.app.i0
    public void c(ViewGroup viewGroup, Object obj) {
        z.b(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.i0
    public boolean e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.i0
    public Object f(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.i0
    public Object j(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().V0(transition).V0(transition2).j1(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.V0(transition);
        }
        transitionSet.V0(transition3);
        return transitionSet;
    }

    @Override // androidx.fragment.app.i0
    public Object k(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.V0((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.V0((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.V0((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.i0
    public void m(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).w0(view);
        }
    }

    @Override // androidx.fragment.app.i0
    public void n(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        Transition transition = (Transition) obj;
        int i5 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int Z0 = transitionSet.Z0();
            while (i5 < Z0) {
                n(transitionSet.Y0(i5), arrayList, arrayList2);
                i5++;
            }
            return;
        }
        if (x(transition)) {
            return;
        }
        List<View> d02 = transition.d0();
        if (d02.size() == arrayList.size() && d02.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i5 < size) {
                transition.c(arrayList2.get(i5));
                i5++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.w0(arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.i0
    public void o(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).a(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.i0
    public void p(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).a(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.i0
    public void q(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).F0(new d(rect));
        }
    }

    @Override // androidx.fragment.app.i0
    public void r(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            h(view, rect);
            ((Transition) obj).F0(new a(rect));
        }
    }

    @Override // androidx.fragment.app.i0
    public void u(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> d02 = transitionSet.d0();
        d02.clear();
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            androidx.fragment.app.i0.d(d02, arrayList.get(i5));
        }
        d02.add(view);
        arrayList.add(view);
        b(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.i0
    public void v(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.d0().clear();
            transitionSet.d0().addAll(arrayList2);
            n(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.i0
    public Object w(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.V0((Transition) obj);
        return transitionSet;
    }
}
