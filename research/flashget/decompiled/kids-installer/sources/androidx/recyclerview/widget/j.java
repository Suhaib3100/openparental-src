package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.annotation.o0;
import androidx.core.view.y1;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: DefaultItemAnimator.java */
/* loaded from: classes3.dex */
public class j extends d0 {
    private static TimeInterpolator A;

    /* renamed from: z, reason: collision with root package name */
    private static final boolean f9283z = false;

    /* renamed from: o, reason: collision with root package name */
    private ArrayList<RecyclerView.d0> f9284o = new ArrayList<>();

    /* renamed from: p, reason: collision with root package name */
    private ArrayList<RecyclerView.d0> f9285p = new ArrayList<>();

    /* renamed from: q, reason: collision with root package name */
    private ArrayList<C0113j> f9286q = new ArrayList<>();

    /* renamed from: r, reason: collision with root package name */
    private ArrayList<i> f9287r = new ArrayList<>();

    /* renamed from: s, reason: collision with root package name */
    ArrayList<ArrayList<RecyclerView.d0>> f9288s = new ArrayList<>();

    /* renamed from: t, reason: collision with root package name */
    ArrayList<ArrayList<C0113j>> f9289t = new ArrayList<>();

    /* renamed from: u, reason: collision with root package name */
    ArrayList<ArrayList<i>> f9290u = new ArrayList<>();

    /* renamed from: v, reason: collision with root package name */
    ArrayList<RecyclerView.d0> f9291v = new ArrayList<>();

    /* renamed from: w, reason: collision with root package name */
    ArrayList<RecyclerView.d0> f9292w = new ArrayList<>();

    /* renamed from: x, reason: collision with root package name */
    ArrayList<RecyclerView.d0> f9293x = new ArrayList<>();

    /* renamed from: y, reason: collision with root package name */
    ArrayList<RecyclerView.d0> f9294y = new ArrayList<>();

    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ ArrayList f9295o;

        a(ArrayList arrayList) {
            this.f9295o = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f9295o.iterator();
            while (it.hasNext()) {
                C0113j c0113j = (C0113j) it.next();
                j.this.b0(c0113j.f9329a, c0113j.f9330b, c0113j.f9331c, c0113j.f9332d, c0113j.f9333e);
            }
            this.f9295o.clear();
            j.this.f9289t.remove(this.f9295o);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ ArrayList f9297o;

        b(ArrayList arrayList) {
            this.f9297o = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f9297o.iterator();
            while (it.hasNext()) {
                j.this.a0((i) it.next());
            }
            this.f9297o.clear();
            j.this.f9290u.remove(this.f9297o);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ ArrayList f9299o;

        c(ArrayList arrayList) {
            this.f9299o = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f9299o.iterator();
            while (it.hasNext()) {
                j.this.Z((RecyclerView.d0) it.next());
            }
            this.f9299o.clear();
            j.this.f9288s.remove(this.f9299o);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    class d extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.d0 f9301a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f9302b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f9303c;

        d(RecyclerView.d0 d0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f9301a = d0Var;
            this.f9302b = viewPropertyAnimator;
            this.f9303c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f9302b.setListener(null);
            this.f9303c.setAlpha(1.0f);
            j.this.N(this.f9301a);
            j.this.f9293x.remove(this.f9301a);
            j.this.e0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            j.this.O(this.f9301a);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    class e extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.d0 f9305a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f9306b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f9307c;

        e(RecyclerView.d0 d0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f9305a = d0Var;
            this.f9306b = view;
            this.f9307c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f9306b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f9307c.setListener(null);
            j.this.H(this.f9305a);
            j.this.f9291v.remove(this.f9305a);
            j.this.e0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            j.this.I(this.f9305a);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    class f extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.d0 f9309a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f9310b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f9311c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f9312d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f9313e;

        f(RecyclerView.d0 d0Var, int i5, View view, int i6, ViewPropertyAnimator viewPropertyAnimator) {
            this.f9309a = d0Var;
            this.f9310b = i5;
            this.f9311c = view;
            this.f9312d = i6;
            this.f9313e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f9310b != 0) {
                this.f9311c.setTranslationX(0.0f);
            }
            if (this.f9312d != 0) {
                this.f9311c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f9313e.setListener(null);
            j.this.L(this.f9309a);
            j.this.f9292w.remove(this.f9309a);
            j.this.e0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            j.this.M(this.f9309a);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    class g extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f9315a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f9316b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f9317c;

        g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f9315a = iVar;
            this.f9316b = viewPropertyAnimator;
            this.f9317c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f9316b.setListener(null);
            this.f9317c.setAlpha(1.0f);
            this.f9317c.setTranslationX(0.0f);
            this.f9317c.setTranslationY(0.0f);
            j.this.J(this.f9315a.f9323a, true);
            j.this.f9294y.remove(this.f9315a.f9323a);
            j.this.e0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            j.this.K(this.f9315a.f9323a, true);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    class h extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f9319a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f9320b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f9321c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f9319a = iVar;
            this.f9320b = viewPropertyAnimator;
            this.f9321c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f9320b.setListener(null);
            this.f9321c.setAlpha(1.0f);
            this.f9321c.setTranslationX(0.0f);
            this.f9321c.setTranslationY(0.0f);
            j.this.J(this.f9319a.f9324b, false);
            j.this.f9294y.remove(this.f9319a.f9324b);
            j.this.e0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            j.this.K(this.f9319a.f9324b, false);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* renamed from: androidx.recyclerview.widget.j$j, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0113j {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.d0 f9329a;

        /* renamed from: b, reason: collision with root package name */
        public int f9330b;

        /* renamed from: c, reason: collision with root package name */
        public int f9331c;

        /* renamed from: d, reason: collision with root package name */
        public int f9332d;

        /* renamed from: e, reason: collision with root package name */
        public int f9333e;

        C0113j(RecyclerView.d0 d0Var, int i5, int i6, int i7, int i8) {
            this.f9329a = d0Var;
            this.f9330b = i5;
            this.f9331c = i6;
            this.f9332d = i7;
            this.f9333e = i8;
        }
    }

    private void c0(RecyclerView.d0 d0Var) {
        View view = d0Var.f9003a;
        ViewPropertyAnimator animate = view.animate();
        this.f9293x.add(d0Var);
        animate.setDuration(p()).alpha(0.0f).setListener(new d(d0Var, animate, view)).start();
    }

    private void f0(List<i> list, RecyclerView.d0 d0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (h0(iVar, d0Var) && iVar.f9323a == null && iVar.f9324b == null) {
                list.remove(iVar);
            }
        }
    }

    private void g0(i iVar) {
        RecyclerView.d0 d0Var = iVar.f9323a;
        if (d0Var != null) {
            h0(iVar, d0Var);
        }
        RecyclerView.d0 d0Var2 = iVar.f9324b;
        if (d0Var2 != null) {
            h0(iVar, d0Var2);
        }
    }

    private boolean h0(i iVar, RecyclerView.d0 d0Var) {
        boolean z5 = false;
        if (iVar.f9324b == d0Var) {
            iVar.f9324b = null;
        } else {
            if (iVar.f9323a != d0Var) {
                return false;
            }
            iVar.f9323a = null;
            z5 = true;
        }
        d0Var.f9003a.setAlpha(1.0f);
        d0Var.f9003a.setTranslationX(0.0f);
        d0Var.f9003a.setTranslationY(0.0f);
        J(d0Var, z5);
        return true;
    }

    private void i0(RecyclerView.d0 d0Var) {
        if (A == null) {
            A = new ValueAnimator().getInterpolator();
        }
        d0Var.f9003a.animate().setInterpolator(A);
        k(d0Var);
    }

    @Override // androidx.recyclerview.widget.d0
    public boolean D(RecyclerView.d0 d0Var) {
        i0(d0Var);
        d0Var.f9003a.setAlpha(0.0f);
        this.f9285p.add(d0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.d0
    public boolean E(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, int i5, int i6, int i7, int i8) {
        if (d0Var == d0Var2) {
            return F(d0Var, i5, i6, i7, i8);
        }
        float translationX = d0Var.f9003a.getTranslationX();
        float translationY = d0Var.f9003a.getTranslationY();
        float alpha = d0Var.f9003a.getAlpha();
        i0(d0Var);
        int i9 = (int) ((i7 - i5) - translationX);
        int i10 = (int) ((i8 - i6) - translationY);
        d0Var.f9003a.setTranslationX(translationX);
        d0Var.f9003a.setTranslationY(translationY);
        d0Var.f9003a.setAlpha(alpha);
        if (d0Var2 != null) {
            i0(d0Var2);
            d0Var2.f9003a.setTranslationX(-i9);
            d0Var2.f9003a.setTranslationY(-i10);
            d0Var2.f9003a.setAlpha(0.0f);
        }
        this.f9287r.add(new i(d0Var, d0Var2, i5, i6, i7, i8));
        return true;
    }

    @Override // androidx.recyclerview.widget.d0
    public boolean F(RecyclerView.d0 d0Var, int i5, int i6, int i7, int i8) {
        View view = d0Var.f9003a;
        int translationX = i5 + ((int) view.getTranslationX());
        int translationY = i6 + ((int) d0Var.f9003a.getTranslationY());
        i0(d0Var);
        int i9 = i7 - translationX;
        int i10 = i8 - translationY;
        if (i9 == 0 && i10 == 0) {
            L(d0Var);
            return false;
        }
        if (i9 != 0) {
            view.setTranslationX(-i9);
        }
        if (i10 != 0) {
            view.setTranslationY(-i10);
        }
        this.f9286q.add(new C0113j(d0Var, translationX, translationY, i7, i8));
        return true;
    }

    @Override // androidx.recyclerview.widget.d0
    public boolean G(RecyclerView.d0 d0Var) {
        i0(d0Var);
        this.f9284o.add(d0Var);
        return true;
    }

    void Z(RecyclerView.d0 d0Var) {
        View view = d0Var.f9003a;
        ViewPropertyAnimator animate = view.animate();
        this.f9291v.add(d0Var);
        animate.alpha(1.0f).setDuration(m()).setListener(new e(d0Var, view, animate)).start();
    }

    void a0(i iVar) {
        RecyclerView.d0 d0Var = iVar.f9323a;
        View view = d0Var == null ? null : d0Var.f9003a;
        RecyclerView.d0 d0Var2 = iVar.f9324b;
        View view2 = d0Var2 != null ? d0Var2.f9003a : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(n());
            this.f9294y.add(iVar.f9323a);
            duration.translationX(iVar.f9327e - iVar.f9325c);
            duration.translationY(iVar.f9328f - iVar.f9326d);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.f9294y.add(iVar.f9324b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(n()).alpha(1.0f).setListener(new h(iVar, animate, view2)).start();
        }
    }

    void b0(RecyclerView.d0 d0Var, int i5, int i6, int i7, int i8) {
        View view = d0Var.f9003a;
        int i9 = i7 - i5;
        int i10 = i8 - i6;
        if (i9 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i10 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f9292w.add(d0Var);
        animate.setDuration(o()).setListener(new f(d0Var, i9, view, i10, animate)).start();
    }

    void d0(List<RecyclerView.d0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).f9003a.animate().cancel();
        }
    }

    void e0() {
        if (q()) {
            return;
        }
        j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean g(@o0 RecyclerView.d0 d0Var, @o0 List<Object> list) {
        return !list.isEmpty() || f(d0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void k(RecyclerView.d0 d0Var) {
        View view = d0Var.f9003a;
        view.animate().cancel();
        int size = this.f9286q.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.f9286q.get(size).f9329a == d0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                L(d0Var);
                this.f9286q.remove(size);
            }
        }
        f0(this.f9287r, d0Var);
        if (this.f9284o.remove(d0Var)) {
            view.setAlpha(1.0f);
            N(d0Var);
        }
        if (this.f9285p.remove(d0Var)) {
            view.setAlpha(1.0f);
            H(d0Var);
        }
        for (int size2 = this.f9290u.size() - 1; size2 >= 0; size2--) {
            ArrayList<i> arrayList = this.f9290u.get(size2);
            f0(arrayList, d0Var);
            if (arrayList.isEmpty()) {
                this.f9290u.remove(size2);
            }
        }
        for (int size3 = this.f9289t.size() - 1; size3 >= 0; size3--) {
            ArrayList<C0113j> arrayList2 = this.f9289t.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (arrayList2.get(size4).f9329a == d0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    L(d0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f9289t.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f9288s.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.d0> arrayList3 = this.f9288s.get(size5);
            if (arrayList3.remove(d0Var)) {
                view.setAlpha(1.0f);
                H(d0Var);
                if (arrayList3.isEmpty()) {
                    this.f9288s.remove(size5);
                }
            }
        }
        this.f9293x.remove(d0Var);
        this.f9291v.remove(d0Var);
        this.f9294y.remove(d0Var);
        this.f9292w.remove(d0Var);
        e0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void l() {
        int size = this.f9286q.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0113j c0113j = this.f9286q.get(size);
            View view = c0113j.f9329a.f9003a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            L(c0113j.f9329a);
            this.f9286q.remove(size);
        }
        for (int size2 = this.f9284o.size() - 1; size2 >= 0; size2--) {
            N(this.f9284o.get(size2));
            this.f9284o.remove(size2);
        }
        int size3 = this.f9285p.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.d0 d0Var = this.f9285p.get(size3);
            d0Var.f9003a.setAlpha(1.0f);
            H(d0Var);
            this.f9285p.remove(size3);
        }
        for (int size4 = this.f9287r.size() - 1; size4 >= 0; size4--) {
            g0(this.f9287r.get(size4));
        }
        this.f9287r.clear();
        if (q()) {
            for (int size5 = this.f9289t.size() - 1; size5 >= 0; size5--) {
                ArrayList<C0113j> arrayList = this.f9289t.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C0113j c0113j2 = arrayList.get(size6);
                    View view2 = c0113j2.f9329a.f9003a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    L(c0113j2.f9329a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f9289t.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f9288s.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.d0> arrayList2 = this.f9288s.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.d0 d0Var2 = arrayList2.get(size8);
                    d0Var2.f9003a.setAlpha(1.0f);
                    H(d0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f9288s.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f9290u.size() - 1; size9 >= 0; size9--) {
                ArrayList<i> arrayList3 = this.f9290u.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    g0(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f9290u.remove(arrayList3);
                    }
                }
            }
            d0(this.f9293x);
            d0(this.f9292w);
            d0(this.f9291v);
            d0(this.f9294y);
            j();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean q() {
        return (this.f9285p.isEmpty() && this.f9287r.isEmpty() && this.f9286q.isEmpty() && this.f9284o.isEmpty() && this.f9292w.isEmpty() && this.f9293x.isEmpty() && this.f9291v.isEmpty() && this.f9294y.isEmpty() && this.f9289t.isEmpty() && this.f9288s.isEmpty() && this.f9290u.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void x() {
        boolean z5 = !this.f9284o.isEmpty();
        boolean z6 = !this.f9286q.isEmpty();
        boolean z7 = !this.f9287r.isEmpty();
        boolean z8 = !this.f9285p.isEmpty();
        if (z5 || z6 || z8 || z7) {
            Iterator<RecyclerView.d0> it = this.f9284o.iterator();
            while (it.hasNext()) {
                c0(it.next());
            }
            this.f9284o.clear();
            if (z6) {
                ArrayList<C0113j> arrayList = new ArrayList<>();
                arrayList.addAll(this.f9286q);
                this.f9289t.add(arrayList);
                this.f9286q.clear();
                a aVar = new a(arrayList);
                if (z5) {
                    y1.q1(arrayList.get(0).f9329a.f9003a, aVar, p());
                } else {
                    aVar.run();
                }
            }
            if (z7) {
                ArrayList<i> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.f9287r);
                this.f9290u.add(arrayList2);
                this.f9287r.clear();
                b bVar = new b(arrayList2);
                if (z5) {
                    y1.q1(arrayList2.get(0).f9323a.f9003a, bVar, p());
                } else {
                    bVar.run();
                }
            }
            if (z8) {
                ArrayList<RecyclerView.d0> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.f9285p);
                this.f9288s.add(arrayList3);
                this.f9285p.clear();
                c cVar = new c(arrayList3);
                if (z5 || z6 || z7) {
                    y1.q1(arrayList3.get(0).f9003a, cVar, Math.max(z6 ? o() : 0L, z7 ? n() : 0L) + (z5 ? p() : 0L));
                } else {
                    cVar.run();
                }
            }
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    private static class i {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.d0 f9323a;

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView.d0 f9324b;

        /* renamed from: c, reason: collision with root package name */
        public int f9325c;

        /* renamed from: d, reason: collision with root package name */
        public int f9326d;

        /* renamed from: e, reason: collision with root package name */
        public int f9327e;

        /* renamed from: f, reason: collision with root package name */
        public int f9328f;

        private i(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2) {
            this.f9323a = d0Var;
            this.f9324b = d0Var2;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f9323a + ", newHolder=" + this.f9324b + ", fromX=" + this.f9325c + ", fromY=" + this.f9326d + ", toX=" + this.f9327e + ", toY=" + this.f9328f + '}';
        }

        i(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, int i5, int i6, int i7, int i8) {
            this(d0Var, d0Var2);
            this.f9325c = i5;
            this.f9326d = i6;
            this.f9327e = i7;
            this.f9328f = i8;
        }
    }
}
