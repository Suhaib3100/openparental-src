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
import androidx.transition.q;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes3.dex */
public abstract class Visibility extends Transition {
    public static final int O2 = 1;
    public static final int P2 = 2;
    private int V1;
    private static final String N2 = "android:visibility:screenLocation";
    private static final String M2 = "android:visibility:parent";
    static final String L2 = "android:visibility:visibility";
    private static final String[] Q2 = {"android:visibility:visibility", "android:visibility:parent"};

    class a extends w {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f34330b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f34331c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f34332d;

        a(ViewGroup viewGroup, View view, View view2) {
            this.f34330b = viewGroup;
            this.f34331c = view;
            this.f34332d = view2;
        }

        @Override // androidx.transition.w, androidx.transition.Transition.h
        public void a(@androidx.annotation.o0 Transition transition) {
            if (this.f34331c.getParent() == null) {
                j0.b(this.f34330b).c(this.f34331c);
            } else {
                Visibility.this.cancel();
            }
        }

        @Override // androidx.transition.w, androidx.transition.Transition.h
        public void c(@androidx.annotation.o0 Transition transition) {
            j0.b(this.f34330b).d(this.f34331c);
        }

        @Override // androidx.transition.w, androidx.transition.Transition.h
        public void d(@androidx.annotation.o0 Transition transition) {
            this.f34332d.setTag(q.g.Z0, null);
            j0.b(this.f34330b).d(this.f34331c);
            transition.q0(this);
        }
    }

    private static class b extends AnimatorListenerAdapter implements Transition.h, a.InterfaceC0629a {

        /* renamed from: b, reason: collision with root package name */
        private final View f34334b;

        /* renamed from: c, reason: collision with root package name */
        private final int f34335c;

        /* renamed from: d, reason: collision with root package name */
        private final ViewGroup f34336d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f34337e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f34338f;

        /* renamed from: g, reason: collision with root package name */
        boolean f34339g = false;

        b(View view, int i4, boolean z4) {
            this.f34334b = view;
            this.f34335c = i4;
            this.f34336d = (ViewGroup) view.getParent();
            this.f34337e = z4;
            g(true);
        }

        private void f() {
            if (!this.f34339g) {
                o0.i(this.f34334b, this.f34335c);
                ViewGroup viewGroup = this.f34336d;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        private void g(boolean z4) {
            ViewGroup viewGroup;
            if (!this.f34337e || this.f34338f == z4 || (viewGroup = this.f34336d) == null) {
                return;
            }
            this.f34338f = z4;
            j0.d(viewGroup, z4);
        }

        @Override // androidx.transition.Transition.h
        public void a(@androidx.annotation.o0 Transition transition) {
            g(true);
        }

        @Override // androidx.transition.Transition.h
        public void b(@androidx.annotation.o0 Transition transition) {
        }

        @Override // androidx.transition.Transition.h
        public void c(@androidx.annotation.o0 Transition transition) {
            g(false);
        }

        @Override // androidx.transition.Transition.h
        public void d(@androidx.annotation.o0 Transition transition) {
            f();
            transition.q0(this);
        }

        @Override // androidx.transition.Transition.h
        public void e(@androidx.annotation.o0 Transition transition) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f34339g = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, androidx.transition.a.InterfaceC0629a
        public void onAnimationPause(Animator animator) {
            if (this.f34339g) {
                return;
            }
            o0.i(this.f34334b, this.f34335c);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, androidx.transition.a.InterfaceC0629a
        public void onAnimationResume(Animator animator) {
            if (this.f34339g) {
                return;
            }
            o0.i(this.f34334b, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    @SuppressLint({"UniqueConstants"})
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        boolean f34340a;

        /* renamed from: b, reason: collision with root package name */
        boolean f34341b;

        /* renamed from: c, reason: collision with root package name */
        int f34342c;

        /* renamed from: d, reason: collision with root package name */
        int f34343d;

        /* renamed from: e, reason: collision with root package name */
        ViewGroup f34344e;

        /* renamed from: f, reason: collision with root package name */
        ViewGroup f34345f;

        d() {
        }
    }

    public Visibility() {
        this.V1 = 3;
    }

    private void J0(b0 b0Var) {
        b0Var.f34363a.put("android:visibility:visibility", Integer.valueOf(b0Var.f34364b.getVisibility()));
        b0Var.f34363a.put("android:visibility:parent", b0Var.f34364b.getParent());
        int[] iArr = new int[2];
        b0Var.f34364b.getLocationOnScreen(iArr);
        b0Var.f34363a.put("android:visibility:screenLocation", iArr);
    }

    private d M0(b0 b0Var, b0 b0Var2) {
        d dVar = new d();
        dVar.f34340a = false;
        dVar.f34341b = false;
        if (b0Var == null || !b0Var.f34363a.containsKey("android:visibility:visibility")) {
            dVar.f34342c = -1;
            dVar.f34344e = null;
        } else {
            dVar.f34342c = ((Integer) b0Var.f34363a.get("android:visibility:visibility")).intValue();
            dVar.f34344e = (ViewGroup) b0Var.f34363a.get("android:visibility:parent");
        }
        if (b0Var2 == null || !b0Var2.f34363a.containsKey("android:visibility:visibility")) {
            dVar.f34343d = -1;
            dVar.f34345f = null;
        } else {
            dVar.f34343d = ((Integer) b0Var2.f34363a.get("android:visibility:visibility")).intValue();
            dVar.f34345f = (ViewGroup) b0Var2.f34363a.get("android:visibility:parent");
        }
        if (b0Var != null && b0Var2 != null) {
            int i4 = dVar.f34342c;
            int i5 = dVar.f34343d;
            if (i4 == i5 && dVar.f34344e == dVar.f34345f) {
                return dVar;
            }
            if (i4 != i5) {
                if (i4 == 0) {
                    dVar.f34341b = false;
                    dVar.f34340a = true;
                } else if (i5 == 0) {
                    dVar.f34341b = true;
                    dVar.f34340a = true;
                }
            } else if (dVar.f34345f == null) {
                dVar.f34341b = false;
                dVar.f34340a = true;
            } else if (dVar.f34344e == null) {
                dVar.f34341b = true;
                dVar.f34340a = true;
            }
        } else if (b0Var == null && dVar.f34343d == 0) {
            dVar.f34341b = true;
            dVar.f34340a = true;
        } else if (b0Var2 == null && dVar.f34342c == 0) {
            dVar.f34341b = false;
            dVar.f34340a = true;
        }
        return dVar;
    }

    public int L0() {
        return this.V1;
    }

    public boolean N0(b0 b0Var) {
        if (b0Var == null) {
            return false;
        }
        return ((Integer) b0Var.f34363a.get("android:visibility:visibility")).intValue() == 0 && ((View) b0Var.f34363a.get("android:visibility:parent")) != null;
    }

    @androidx.annotation.q0
    public Animator P0(ViewGroup viewGroup, View view, b0 b0Var, b0 b0Var2) {
        return null;
    }

    @androidx.annotation.q0
    public Animator Q0(ViewGroup viewGroup, b0 b0Var, int i4, b0 b0Var2, int i5) {
        if ((this.V1 & 1) != 1 || b0Var2 == null) {
            return null;
        }
        if (b0Var == null) {
            View view = (View) b0Var2.f34364b.getParent();
            if (M0(O(view, false), b0(view, false)).f34340a) {
                return null;
            }
        }
        return P0(viewGroup, b0Var2.f34364b, b0Var, b0Var2);
    }

    @androidx.annotation.q0
    public Animator R0(ViewGroup viewGroup, View view, b0 b0Var, b0 b0Var2) {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x008f, code lost:
    
        if (r17.f34315w != false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004a  */
    @androidx.annotation.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator S0(android.view.ViewGroup r18, androidx.transition.b0 r19, int r20, androidx.transition.b0 r21, int r22) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Visibility.S0(android.view.ViewGroup, androidx.transition.b0, int, androidx.transition.b0, int):android.animation.Animator");
    }

    public void T0(int i4) {
        if ((i4 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.V1 = i4;
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.q0
    public String[] a0() {
        return Q2;
    }

    @Override // androidx.transition.Transition
    public boolean c0(@androidx.annotation.q0 b0 b0Var, @androidx.annotation.q0 b0 b0Var2) {
        if (b0Var == null && b0Var2 == null) {
            return false;
        }
        if (b0Var != null && b0Var2 != null && b0Var2.f34363a.containsKey("android:visibility:visibility") != b0Var.f34363a.containsKey("android:visibility:visibility")) {
            return false;
        }
        d M0 = M0(b0Var, b0Var2);
        if (M0.f34340a) {
            return M0.f34342c == 0 || M0.f34343d == 0;
        }
        return false;
    }

    @Override // androidx.transition.Transition
    public void m(@androidx.annotation.o0 b0 b0Var) {
        J0(b0Var);
    }

    @Override // androidx.transition.Transition
    public void p(@androidx.annotation.o0 b0 b0Var) {
        J0(b0Var);
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.q0
    public Animator t(@androidx.annotation.o0 ViewGroup viewGroup, @androidx.annotation.q0 b0 b0Var, @androidx.annotation.q0 b0 b0Var2) {
        d M0 = M0(b0Var, b0Var2);
        if (!M0.f34340a) {
            return null;
        }
        if (M0.f34344e == null && M0.f34345f == null) {
            return null;
        }
        return M0.f34341b ? Q0(viewGroup, b0Var, M0.f34342c, b0Var2, M0.f34343d) : S0(viewGroup, b0Var, M0.f34342c, b0Var2, M0.f34343d);
    }

    @SuppressLint({"RestrictedApi"})
    public Visibility(@androidx.annotation.o0 Context context, @androidx.annotation.o0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.V1 = 3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u.f35209e);
        int k4 = androidx.core.content.res.n.k(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        obtainStyledAttributes.recycle();
        if (k4 != 0) {
            T0(k4);
        }
    }
}
