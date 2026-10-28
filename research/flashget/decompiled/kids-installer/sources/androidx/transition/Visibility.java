package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.c1;
import androidx.transition.Transition;
import androidx.transition.a;
import androidx.transition.s;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes3.dex */
public abstract class Visibility extends Transition {

    /* renamed from: o0, reason: collision with root package name */
    public static final int f9828o0 = 1;

    /* renamed from: p0, reason: collision with root package name */
    public static final int f9829p0 = 2;

    /* renamed from: k0, reason: collision with root package name */
    private int f9831k0;

    /* renamed from: n0, reason: collision with root package name */
    private static final String f9827n0 = "android:visibility:screenLocation";

    /* renamed from: m0, reason: collision with root package name */
    private static final String f9826m0 = "android:visibility:parent";

    /* renamed from: l0, reason: collision with root package name */
    static final String f9825l0 = "android:visibility:visibility";

    /* renamed from: q0, reason: collision with root package name */
    private static final String[] f9830q0 = {"android:visibility:visibility", "android:visibility:parent"};

    class a extends y {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f9832a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f9833b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f9834c;

        a(ViewGroup viewGroup, View view, View view2) {
            this.f9832a = viewGroup;
            this.f9833b = view;
            this.f9834c = view2;
        }

        @Override // androidx.transition.y, androidx.transition.Transition.h
        public void b(@androidx.annotation.o0 Transition transition) {
            l0.b(this.f9832a).d(this.f9833b);
        }

        @Override // androidx.transition.y, androidx.transition.Transition.h
        public void c(@androidx.annotation.o0 Transition transition) {
            this.f9834c.setTag(s.e.f10028z, null);
            l0.b(this.f9832a).d(this.f9833b);
            transition.u0(this);
        }

        @Override // androidx.transition.y, androidx.transition.Transition.h
        public void e(@androidx.annotation.o0 Transition transition) {
            if (this.f9833b.getParent() == null) {
                l0.b(this.f9832a).c(this.f9833b);
            } else {
                Visibility.this.cancel();
            }
        }
    }

    private static class b extends AnimatorListenerAdapter implements Transition.h, a.InterfaceC0120a {

        /* renamed from: a, reason: collision with root package name */
        private final View f9836a;

        /* renamed from: b, reason: collision with root package name */
        private final int f9837b;

        /* renamed from: c, reason: collision with root package name */
        private final ViewGroup f9838c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f9839d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f9840e;

        /* renamed from: f, reason: collision with root package name */
        boolean f9841f = false;

        b(View view, int i5, boolean z5) {
            this.f9836a = view;
            this.f9837b = i5;
            this.f9838c = (ViewGroup) view.getParent();
            this.f9839d = z5;
            g(true);
        }

        private void f() {
            if (!this.f9841f) {
                q0.i(this.f9836a, this.f9837b);
                ViewGroup viewGroup = this.f9838c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        private void g(boolean z5) {
            ViewGroup viewGroup;
            if (!this.f9839d || this.f9840e == z5 || (viewGroup = this.f9838c) == null) {
                return;
            }
            this.f9840e = z5;
            l0.d(viewGroup, z5);
        }

        @Override // androidx.transition.Transition.h
        public void a(@androidx.annotation.o0 Transition transition) {
        }

        @Override // androidx.transition.Transition.h
        public void b(@androidx.annotation.o0 Transition transition) {
            g(false);
        }

        @Override // androidx.transition.Transition.h
        public void c(@androidx.annotation.o0 Transition transition) {
            f();
            transition.u0(this);
        }

        @Override // androidx.transition.Transition.h
        public void d(@androidx.annotation.o0 Transition transition) {
        }

        @Override // androidx.transition.Transition.h
        public void e(@androidx.annotation.o0 Transition transition) {
            g(true);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f9841f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, androidx.transition.a.InterfaceC0120a
        public void onAnimationPause(Animator animator) {
            if (this.f9841f) {
                return;
            }
            q0.i(this.f9836a, this.f9837b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, androidx.transition.a.InterfaceC0120a
        public void onAnimationResume(Animator animator) {
            if (this.f9841f) {
                return;
            }
            q0.i(this.f9836a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    @SuppressLint({"UniqueConstants"})
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface c {
    }

    /* loaded from: classes.dex */
    private static class d {

        /* renamed from: a, reason: collision with root package name */
        boolean f9842a;

        /* renamed from: b, reason: collision with root package name */
        boolean f9843b;

        /* renamed from: c, reason: collision with root package name */
        int f9844c;

        /* renamed from: d, reason: collision with root package name */
        int f9845d;

        /* renamed from: e, reason: collision with root package name */
        ViewGroup f9846e;

        /* renamed from: f, reason: collision with root package name */
        ViewGroup f9847f;

        d() {
        }
    }

    public Visibility() {
        this.f9831k0 = 3;
    }

    private void P0(d0 d0Var) {
        d0Var.f9859a.put("android:visibility:visibility", Integer.valueOf(d0Var.f9860b.getVisibility()));
        d0Var.f9859a.put("android:visibility:parent", d0Var.f9860b.getParent());
        int[] iArr = new int[2];
        d0Var.f9860b.getLocationOnScreen(iArr);
        d0Var.f9859a.put("android:visibility:screenLocation", iArr);
    }

    private d R0(d0 d0Var, d0 d0Var2) {
        d dVar = new d();
        dVar.f9842a = false;
        dVar.f9843b = false;
        if (d0Var == null || !d0Var.f9859a.containsKey("android:visibility:visibility")) {
            dVar.f9844c = -1;
            dVar.f9846e = null;
        } else {
            dVar.f9844c = ((Integer) d0Var.f9859a.get("android:visibility:visibility")).intValue();
            dVar.f9846e = (ViewGroup) d0Var.f9859a.get("android:visibility:parent");
        }
        if (d0Var2 == null || !d0Var2.f9859a.containsKey("android:visibility:visibility")) {
            dVar.f9845d = -1;
            dVar.f9847f = null;
        } else {
            dVar.f9845d = ((Integer) d0Var2.f9859a.get("android:visibility:visibility")).intValue();
            dVar.f9847f = (ViewGroup) d0Var2.f9859a.get("android:visibility:parent");
        }
        if (d0Var != null && d0Var2 != null) {
            int i5 = dVar.f9844c;
            int i6 = dVar.f9845d;
            if (i5 == i6 && dVar.f9846e == dVar.f9847f) {
                return dVar;
            }
            if (i5 != i6) {
                if (i5 == 0) {
                    dVar.f9843b = false;
                    dVar.f9842a = true;
                } else if (i6 == 0) {
                    dVar.f9843b = true;
                    dVar.f9842a = true;
                }
            } else if (dVar.f9847f == null) {
                dVar.f9843b = false;
                dVar.f9842a = true;
            } else if (dVar.f9846e == null) {
                dVar.f9843b = true;
                dVar.f9842a = true;
            }
        } else if (d0Var == null && dVar.f9845d == 0) {
            dVar.f9843b = true;
            dVar.f9842a = true;
        } else if (d0Var2 == null && dVar.f9844c == 0) {
            dVar.f9843b = false;
            dVar.f9842a = true;
        }
        return dVar;
    }

    public int Q0() {
        return this.f9831k0;
    }

    public boolean S0(d0 d0Var) {
        if (d0Var == null) {
            return false;
        }
        return ((Integer) d0Var.f9859a.get("android:visibility:visibility")).intValue() == 0 && ((View) d0Var.f9859a.get("android:visibility:parent")) != null;
    }

    public Animator U0(ViewGroup viewGroup, View view, d0 d0Var, d0 d0Var2) {
        return null;
    }

    public Animator V0(ViewGroup viewGroup, d0 d0Var, int i5, d0 d0Var2, int i6) {
        if ((this.f9831k0 & 1) != 1 || d0Var2 == null) {
            return null;
        }
        if (d0Var == null) {
            View view = (View) d0Var2.f9860b.getParent();
            if (R0(Q(view, false), g0(view, false)).f9842a) {
                return null;
            }
        }
        return U0(viewGroup, d0Var2.f9860b, d0Var, d0Var2);
    }

    public Animator W0(ViewGroup viewGroup, View view, d0 d0Var, d0 d0Var2) {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0089, code lost:
    
        if (r17.K != false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator X0(android.view.ViewGroup r18, androidx.transition.d0 r19, int r20, androidx.transition.d0 r21, int r22) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Visibility.X0(android.view.ViewGroup, androidx.transition.d0, int, androidx.transition.d0, int):android.animation.Animator");
    }

    public void Y0(int i5) {
        if ((i5 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f9831k0 = i5;
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.q0
    public String[] e0() {
        return f9830q0;
    }

    @Override // androidx.transition.Transition
    public boolean h0(d0 d0Var, d0 d0Var2) {
        if (d0Var == null && d0Var2 == null) {
            return false;
        }
        if (d0Var != null && d0Var2 != null && d0Var2.f9859a.containsKey("android:visibility:visibility") != d0Var.f9859a.containsKey("android:visibility:visibility")) {
            return false;
        }
        d R0 = R0(d0Var, d0Var2);
        if (R0.f9842a) {
            return R0.f9844c == 0 || R0.f9845d == 0;
        }
        return false;
    }

    @Override // androidx.transition.Transition
    public void l(@androidx.annotation.o0 d0 d0Var) {
        P0(d0Var);
    }

    @Override // androidx.transition.Transition
    public void o(@androidx.annotation.o0 d0 d0Var) {
        P0(d0Var);
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.q0
    public Animator u(@androidx.annotation.o0 ViewGroup viewGroup, @androidx.annotation.q0 d0 d0Var, @androidx.annotation.q0 d0 d0Var2) {
        d R0 = R0(d0Var, d0Var2);
        if (!R0.f9842a) {
            return null;
        }
        if (R0.f9846e == null && R0.f9847f == null) {
            return null;
        }
        return R0.f9843b ? V0(viewGroup, d0Var, R0.f9844c, d0Var2, R0.f9845d) : X0(viewGroup, d0Var, R0.f9844c, d0Var2, R0.f9845d);
    }

    @SuppressLint({"RestrictedApi"})
    public Visibility(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9831k0 = 3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w.f10084e);
        int k5 = androidx.core.content.res.p.k(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        obtainStyledAttributes.recycle();
        if (k5 != 0) {
            Y0(k5);
        }
    }
}
