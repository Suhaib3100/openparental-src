package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.motion.widget.a0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: ViewTransitionController.java */
/* loaded from: classes.dex */
public class b0 {

    /* renamed from: a, reason: collision with root package name */
    private final MotionLayout f23287a;

    /* renamed from: c, reason: collision with root package name */
    private HashSet<View> f23289c;

    /* renamed from: e, reason: collision with root package name */
    ArrayList<a0.b> f23291e;

    /* renamed from: b, reason: collision with root package name */
    private ArrayList<a0> f23288b = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private String f23290d = "ViewTransitionController";

    /* renamed from: f, reason: collision with root package name */
    ArrayList<a0.b> f23292f = new ArrayList<>();

    /* compiled from: ViewTransitionController.java */
    class a implements h.a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a0 f23293b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f23294c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f23295d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f23296e;

        a(final a0 val$viewTransition, final int val$listen_for_id, final boolean val$isSet, final int val$listen_for_value) {
            this.f23293b = val$viewTransition;
            this.f23294c = val$listen_for_id;
            this.f23295d = val$isSet;
            this.f23296e = val$listen_for_value;
        }

        @Override // androidx.constraintlayout.widget.h.a
        public void a(int id2, int value, int oldValue) {
            int h4 = this.f23293b.h();
            this.f23293b.r(value);
            if (this.f23294c != id2 || h4 == value) {
                return;
            }
            int i4 = 0;
            if (this.f23295d) {
                if (this.f23296e == value) {
                    int childCount = b0.this.f23287a.getChildCount();
                    while (i4 < childCount) {
                        View childAt = b0.this.f23287a.getChildAt(i4);
                        if (this.f23293b.m(childAt)) {
                            int T0 = b0.this.f23287a.T0();
                            androidx.constraintlayout.widget.d Q0 = b0.this.f23287a.Q0(T0);
                            a0 a0Var = this.f23293b;
                            b0 b0Var = b0.this;
                            a0Var.c(b0Var, b0Var.f23287a, T0, Q0, childAt);
                        }
                        i4++;
                    }
                    return;
                }
                return;
            }
            if (this.f23296e != value) {
                int childCount2 = b0.this.f23287a.getChildCount();
                while (i4 < childCount2) {
                    View childAt2 = b0.this.f23287a.getChildAt(i4);
                    if (this.f23293b.m(childAt2)) {
                        int T02 = b0.this.f23287a.T0();
                        androidx.constraintlayout.widget.d Q02 = b0.this.f23287a.Q0(T02);
                        a0 a0Var2 = this.f23293b;
                        b0 b0Var2 = b0.this;
                        a0Var2.c(b0Var2, b0Var2.f23287a, T02, Q02, childAt2);
                    }
                    i4++;
                }
            }
        }
    }

    public b0(MotionLayout layout) {
        this.f23287a = layout;
    }

    private void i(a0 viewTransition, boolean isSet) {
        ConstraintLayout.t().a(viewTransition.i(), new a(viewTransition, viewTransition.i(), isSet, viewTransition.g()));
    }

    private void n(a0 vt, View... view) {
        int T0 = this.f23287a.T0();
        if (vt.f23253f == 2) {
            vt.c(this, this.f23287a, T0, null, view);
            return;
        }
        if (T0 == -1) {
            this.f23287a.toString();
            return;
        }
        androidx.constraintlayout.widget.d Q0 = this.f23287a.Q0(T0);
        if (Q0 == null) {
            return;
        }
        vt.c(this, this.f23287a, T0, Q0, view);
    }

    public void b(a0 viewTransition) {
        this.f23288b.add(viewTransition);
        this.f23289c = null;
        if (viewTransition.j() == 4) {
            i(viewTransition, true);
        } else if (viewTransition.j() == 5) {
            i(viewTransition, false);
        }
    }

    void c(a0.b animation) {
        if (this.f23291e == null) {
            this.f23291e = new ArrayList<>();
        }
        this.f23291e.add(animation);
    }

    void d() {
        ArrayList<a0.b> arrayList = this.f23291e;
        if (arrayList == null) {
            return;
        }
        Iterator<a0.b> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f23291e.removeAll(this.f23292f);
        this.f23292f.clear();
        if (this.f23291e.isEmpty()) {
            this.f23291e = null;
        }
    }

    boolean e(int viewTransitionId, o motionController) {
        Iterator<a0> it = this.f23288b.iterator();
        while (it.hasNext()) {
            a0 next = it.next();
            if (next.e() == viewTransitionId) {
                next.f23254g.a(motionController);
                return true;
            }
        }
        return false;
    }

    void f(int id2, boolean enable) {
        Iterator<a0> it = this.f23288b.iterator();
        while (it.hasNext()) {
            a0 next = it.next();
            if (next.e() == id2) {
                next.o(enable);
                return;
            }
        }
    }

    void g() {
        this.f23287a.invalidate();
    }

    boolean h(int id2) {
        Iterator<a0> it = this.f23288b.iterator();
        while (it.hasNext()) {
            a0 next = it.next();
            if (next.e() == id2) {
                return next.k();
            }
        }
        return false;
    }

    void j(int id2) {
        a0 a0Var;
        Iterator<a0> it = this.f23288b.iterator();
        while (true) {
            if (!it.hasNext()) {
                a0Var = null;
                break;
            } else {
                a0Var = it.next();
                if (a0Var.e() == id2) {
                    break;
                }
            }
        }
        if (a0Var != null) {
            this.f23289c = null;
            this.f23288b.remove(a0Var);
        }
    }

    void k(a0.b animation) {
        this.f23292f.add(animation);
    }

    void l(MotionEvent event) {
        int T0 = this.f23287a.T0();
        if (T0 == -1) {
            return;
        }
        if (this.f23289c == null) {
            this.f23289c = new HashSet<>();
            Iterator<a0> it = this.f23288b.iterator();
            while (it.hasNext()) {
                a0 next = it.next();
                int childCount = this.f23287a.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = this.f23287a.getChildAt(i4);
                    if (next.m(childAt)) {
                        childAt.getId();
                        this.f23289c.add(childAt);
                    }
                }
            }
        }
        float x4 = event.getX();
        float y4 = event.getY();
        Rect rect = new Rect();
        int action = event.getAction();
        ArrayList<a0.b> arrayList = this.f23291e;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<a0.b> it2 = this.f23291e.iterator();
            while (it2.hasNext()) {
                it2.next().d(action, x4, y4);
            }
        }
        if (action == 0 || action == 1) {
            androidx.constraintlayout.widget.d Q0 = this.f23287a.Q0(T0);
            Iterator<a0> it3 = this.f23288b.iterator();
            while (it3.hasNext()) {
                a0 next2 = it3.next();
                if (next2.u(action)) {
                    Iterator<View> it4 = this.f23289c.iterator();
                    while (it4.hasNext()) {
                        View next3 = it4.next();
                        if (next2.m(next3)) {
                            next3.getHitRect(rect);
                            if (rect.contains((int) x4, (int) y4)) {
                                next2.c(this, this.f23287a, T0, Q0, next3);
                            }
                        }
                    }
                }
            }
        }
    }

    void m(int id2, View... views) {
        ArrayList arrayList = new ArrayList();
        Iterator<a0> it = this.f23288b.iterator();
        while (it.hasNext()) {
            a0 next = it.next();
            if (next.e() == id2) {
                for (View view : views) {
                    if (next.d(view)) {
                        arrayList.add(view);
                    }
                }
                if (!arrayList.isEmpty()) {
                    n(next, (View[]) arrayList.toArray(new View[0]));
                    arrayList.clear();
                }
            }
        }
    }
}
