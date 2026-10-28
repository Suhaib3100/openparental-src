package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.m0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.r;
import androidx.annotation.u0;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.d0;
import androidx.core.view.v4;
import androidx.core.view.y1;
import androidx.customview.view.AbsSavedState;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.v;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n1.a;

/* loaded from: classes3.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {
    private static final int C0 = a.n.Pa;
    private static final long D0 = 300;
    public static final int E0 = 0;
    public static final int F0 = 1;
    public static final int G0 = 0;
    public static final int H0 = 1;
    private static final int I0 = 0;

    @o0
    AnimatorListenerAdapter A0;

    @o0
    com.google.android.material.animation.k<FloatingActionButton> B0;

    /* renamed from: h0, reason: collision with root package name */
    private final int f12973h0;

    /* renamed from: i0, reason: collision with root package name */
    private final com.google.android.material.shape.j f12974i0;

    /* renamed from: j0, reason: collision with root package name */
    @q0
    private Animator f12975j0;

    /* renamed from: k0, reason: collision with root package name */
    @q0
    private Animator f12976k0;

    /* renamed from: l0, reason: collision with root package name */
    private int f12977l0;

    /* renamed from: m0, reason: collision with root package name */
    private int f12978m0;

    /* renamed from: n0, reason: collision with root package name */
    private boolean f12979n0;

    /* renamed from: o0, reason: collision with root package name */
    private final boolean f12980o0;

    /* renamed from: p0, reason: collision with root package name */
    private final boolean f12981p0;

    /* renamed from: q0, reason: collision with root package name */
    private final boolean f12982q0;

    /* renamed from: r0, reason: collision with root package name */
    private int f12983r0;

    /* renamed from: s0, reason: collision with root package name */
    private ArrayList<j> f12984s0;

    /* renamed from: t0, reason: collision with root package name */
    @m0
    private int f12985t0;

    /* renamed from: u0, reason: collision with root package name */
    private boolean f12986u0;

    /* renamed from: v0, reason: collision with root package name */
    private boolean f12987v0;

    /* renamed from: w0, reason: collision with root package name */
    private Behavior f12988w0;

    /* renamed from: x0, reason: collision with root package name */
    private int f12989x0;

    /* renamed from: y0, reason: collision with root package name */
    private int f12990y0;

    /* renamed from: z0, reason: collision with root package name */
    private int f12991z0;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: q, reason: collision with root package name */
        int f12997q;

        /* renamed from: r, reason: collision with root package name */
        boolean f12998r;

        /* loaded from: classes2.dex */
        static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            @q0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@o0 Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @o0
            public SavedState b(@o0 Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @o0
            public SavedState[] c(int i5) {
                return new SavedState[i5];
            }

            @Override // android.os.Parcelable.Creator
            @o0
            public Object[] newArray(int i5) {
                return new SavedState[i5];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @o0
            public SavedState createFromParcel(@o0 Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@o0 Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            parcel.writeInt(this.f12997q);
            parcel.writeInt(this.f12998r ? 1 : 0);
        }

        public SavedState(@o0 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f12997q = parcel.readInt();
            this.f12998r = parcel.readInt() != 0;
        }
    }

    /* loaded from: classes2.dex */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (BottomAppBar.this.f12986u0) {
                return;
            }
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.m2(bottomAppBar.f12977l0, BottomAppBar.this.f12987v0);
        }
    }

    class b implements com.google.android.material.animation.k<FloatingActionButton> {
        b() {
        }

        @Override // com.google.android.material.animation.k
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(@o0 FloatingActionButton floatingActionButton) {
            BottomAppBar.this.f12974i0.q0(floatingActionButton.getVisibility() == 0 ? floatingActionButton.getScaleY() : 0.0f);
        }

        @Override // com.google.android.material.animation.k
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(@o0 FloatingActionButton floatingActionButton) {
            float translationX = floatingActionButton.getTranslationX();
            if (BottomAppBar.this.k2().k() != translationX) {
                BottomAppBar.this.k2().q(translationX);
                BottomAppBar.this.f12974i0.invalidateSelf();
            }
            float max = Math.max(0.0f, -floatingActionButton.getTranslationY());
            if (BottomAppBar.this.k2().d() != max) {
                BottomAppBar.this.k2().l(max);
                BottomAppBar.this.f12974i0.invalidateSelf();
            }
            BottomAppBar.this.f12974i0.q0(floatingActionButton.getVisibility() == 0 ? floatingActionButton.getScaleY() : 0.0f);
        }
    }

    class c implements v.e {
        c() {
        }

        @Override // com.google.android.material.internal.v.e
        @o0
        public v4 a(View view, @o0 v4 v4Var, @o0 v.f fVar) {
            boolean z5;
            if (BottomAppBar.this.f12980o0) {
                BottomAppBar.this.f12989x0 = v4Var.o();
            }
            boolean z6 = false;
            if (BottomAppBar.this.f12981p0) {
                z5 = BottomAppBar.this.f12991z0 != v4Var.p();
                BottomAppBar.this.f12991z0 = v4Var.p();
            } else {
                z5 = false;
            }
            if (BottomAppBar.this.f12982q0) {
                boolean z7 = BottomAppBar.this.f12990y0 != v4Var.q();
                BottomAppBar.this.f12990y0 = v4Var.q();
                z6 = z7;
            }
            if (z5 || z6) {
                BottomAppBar.this.M1();
                BottomAppBar.this.v2();
                BottomAppBar.this.s2();
            }
            return v4Var;
        }
    }

    /* loaded from: classes2.dex */
    class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.Q1();
            BottomAppBar.this.f12975j0 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.R1();
        }
    }

    class e extends FloatingActionButton.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f13003a;

        class a extends FloatingActionButton.b {
            a() {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
            public void b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.Q1();
            }
        }

        e(int i5) {
            this.f13003a = i5;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
        public void a(@o0 FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.f2(this.f13003a));
            floatingActionButton.s0(new a());
        }
    }

    /* loaded from: classes2.dex */
    class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.Q1();
            BottomAppBar.this.f12986u0 = false;
            BottomAppBar.this.f12976k0 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.R1();
        }
    }

    /* loaded from: classes2.dex */
    class g extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public boolean f13007a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ActionMenuView f13008b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f13009c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f13010d;

        g(ActionMenuView actionMenuView, int i5, boolean z5) {
            this.f13008b = actionMenuView;
            this.f13009c = i5;
            this.f13010d = z5;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f13007a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f13007a) {
                return;
            }
            boolean z5 = BottomAppBar.this.f12985t0 != 0;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.r2(bottomAppBar.f12985t0);
            BottomAppBar.this.F2(this.f13008b, this.f13009c, this.f13010d, z5);
        }
    }

    /* loaded from: classes2.dex */
    class h implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ ActionMenuView f13012o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f13013p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ boolean f13014q;

        h(ActionMenuView actionMenuView, int i5, boolean z5) {
            this.f13012o = actionMenuView;
            this.f13013p = i5;
            this.f13014q = z5;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f13012o.setTranslationX(BottomAppBar.this.V1(r0, this.f13013p, this.f13014q));
        }
    }

    /* loaded from: classes2.dex */
    class i extends AnimatorListenerAdapter {
        i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.A0.onAnimationStart(animator);
            FloatingActionButton S1 = BottomAppBar.this.S1();
            if (S1 != null) {
                S1.setTranslationX(BottomAppBar.this.e2());
            }
        }
    }

    /* loaded from: classes2.dex */
    interface j {
        void a(BottomAppBar bottomAppBar);

        void b(BottomAppBar bottomAppBar);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface k {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface l {
    }

    public BottomAppBar(@o0 Context context) {
        this(context, null, 0);
    }

    private void E2(@o0 ActionMenuView actionMenuView, int i5, boolean z5) {
        F2(actionMenuView, i5, z5, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F2(@o0 ActionMenuView actionMenuView, int i5, boolean z5, boolean z6) {
        h hVar = new h(actionMenuView, i5, z5);
        if (z6) {
            actionMenuView.post(hVar);
        } else {
            hVar.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L1(@o0 FloatingActionButton floatingActionButton) {
        floatingActionButton.t(this.A0);
        floatingActionButton.u(new i());
        floatingActionButton.v(this.B0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M1() {
        Animator animator = this.f12976k0;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f12975j0;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    private void O1(int i5, @o0 List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(S1(), ProtectedSandApp.s("⚌"), f2(i5));
        ofFloat.setDuration(D0);
        list.add(ofFloat);
    }

    private void P1(int i5, boolean z5, @o0 List<Animator> list) {
        ActionMenuView U1 = U1();
        if (U1 == null) {
            return;
        }
        String s5 = ProtectedSandApp.s("⚍");
        Animator ofFloat = ObjectAnimator.ofFloat(U1, s5, 1.0f);
        if (Math.abs(U1.getTranslationX() - V1(U1, i5, z5)) <= 1.0f) {
            if (U1.getAlpha() < 1.0f) {
                list.add(ofFloat);
            }
        } else {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(U1, s5, 0.0f);
            ofFloat2.addListener(new g(U1, i5, z5));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(150L);
            animatorSet.playSequentially(ofFloat2, ofFloat);
            list.add(animatorSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q1() {
        ArrayList<j> arrayList;
        int i5 = this.f12983r0 - 1;
        this.f12983r0 = i5;
        if (i5 != 0 || (arrayList = this.f12984s0) == null) {
            return;
        }
        Iterator<j> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R1() {
        ArrayList<j> arrayList;
        int i5 = this.f12983r0;
        this.f12983r0 = i5 + 1;
        if (i5 != 0 || (arrayList = this.f12984s0) == null) {
            return;
        }
        Iterator<j> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @q0
    public FloatingActionButton S1() {
        View T1 = T1();
        if (T1 instanceof FloatingActionButton) {
            return (FloatingActionButton) T1;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @q0
    public View T1() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).E(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    @q0
    private ActionMenuView U1() {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    private int Y1() {
        return this.f12989x0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float e2() {
        return f2(this.f12977l0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float f2(int i5) {
        boolean j5 = v.j(this);
        if (i5 == 1) {
            return ((getMeasuredWidth() / 2) - (this.f12973h0 + (j5 ? this.f12991z0 : this.f12990y0))) * (j5 ? -1 : 1);
        }
        return 0.0f;
    }

    private float g2() {
        return -k2().d();
    }

    private int i2() {
        return this.f12991z0;
    }

    private int j2() {
        return this.f12990y0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @o0
    public com.google.android.material.bottomappbar.a k2() {
        return (com.google.android.material.bottomappbar.a) this.f12974i0.l().p();
    }

    private boolean l2() {
        FloatingActionButton S1 = S1();
        return S1 != null && S1.S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m2(int i5, boolean z5) {
        if (!y1.U0(this)) {
            this.f12986u0 = false;
            r2(this.f12985t0);
            return;
        }
        Animator animator = this.f12976k0;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!l2()) {
            i5 = 0;
            z5 = false;
        }
        P1(i5, z5, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.f12976k0 = animatorSet;
        animatorSet.addListener(new f());
        this.f12976k0.start();
    }

    private void n2(int i5) {
        if (this.f12977l0 == i5 || !y1.U0(this)) {
            return;
        }
        Animator animator = this.f12975j0;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (this.f12978m0 == 1) {
            O1(i5, arrayList);
        } else {
            N1(i5, arrayList);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.f12975j0 = animatorSet;
        animatorSet.addListener(new d());
        this.f12975j0.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s2() {
        ActionMenuView U1 = U1();
        if (U1 == null || this.f12976k0 != null) {
            return;
        }
        U1.setAlpha(1.0f);
        if (l2()) {
            F2(U1, this.f12977l0, this.f12987v0, false);
        } else {
            F2(U1, 0, false, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v2() {
        k2().q(e2());
        View T1 = T1();
        this.f12974i0.q0((this.f12987v0 && l2()) ? 1.0f : 0.0f);
        if (T1 != null) {
            T1.setTranslationY(g2());
            T1.setTranslationX(e2());
        }
    }

    static int w1(BottomAppBar bottomAppBar) {
        return bottomAppBar.f12989x0;
    }

    static int x1(BottomAppBar bottomAppBar) {
        return bottomAppBar.f12991z0;
    }

    static int y1(BottomAppBar bottomAppBar) {
        return bottomAppBar.f12990y0;
    }

    public void A2(@r float f6) {
        if (f6 != c2()) {
            k2().n(f6);
            this.f12974i0.invalidateSelf();
        }
    }

    public void B2(@r float f6) {
        if (f6 != d2()) {
            k2().o(f6);
            this.f12974i0.invalidateSelf();
        }
    }

    boolean C2(@u0 int i5) {
        float f6 = i5;
        if (f6 == k2().j()) {
            return false;
        }
        k2().p(f6);
        this.f12974i0.invalidateSelf();
        return true;
    }

    public void D2(boolean z5) {
        this.f12979n0 = z5;
    }

    void K1(@o0 j jVar) {
        if (this.f12984s0 == null) {
            this.f12984s0 = new ArrayList<>();
        }
        this.f12984s0.add(jVar);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void M0(CharSequence charSequence) {
    }

    protected void N1(int i5, List<Animator> list) {
        FloatingActionButton S1 = S1();
        if (S1 == null || S1.R()) {
            return;
        }
        R1();
        S1.P(new e(i5));
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void R0(CharSequence charSequence) {
    }

    protected int V1(@o0 ActionMenuView actionMenuView, int i5, boolean z5) {
        if (i5 != 1 || !z5) {
            return 0;
        }
        boolean j5 = v.j(this);
        int measuredWidth = j5 ? getMeasuredWidth() : 0;
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            View childAt = getChildAt(i6);
            if ((childAt.getLayoutParams() instanceof Toolbar.LayoutParams) && (((Toolbar.LayoutParams) childAt.getLayoutParams()).f165a & d0.f5466d) == 8388611) {
                measuredWidth = j5 ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        return measuredWidth - ((j5 ? actionMenuView.getRight() : actionMenuView.getLeft()) + (j5 ? this.f12990y0 : -this.f12991z0));
    }

    @q0
    public ColorStateList W1() {
        return this.f12974i0.S();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @o0
    /* renamed from: X1, reason: merged with bridge method [inline-methods] */
    public Behavior k() {
        if (this.f12988w0 == null) {
            this.f12988w0 = new Behavior();
        }
        return this.f12988w0;
    }

    @r
    public float Z1() {
        return k2().d();
    }

    public int a2() {
        return this.f12977l0;
    }

    public int b2() {
        return this.f12978m0;
    }

    public float c2() {
        return k2().f();
    }

    @r
    public float d2() {
        return k2().i();
    }

    public boolean h2() {
        return this.f12979n0;
    }

    public void o2() {
        k().J(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.shape.k.f(this, this.f12974i0);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        super.onLayout(z5, i5, i6, i7, i8);
        if (z5) {
            M1();
            v2();
        }
        s2();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        this.f12977l0 = savedState.f12997q;
        this.f12987v0 = savedState.f12998r;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    @o0
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f12997q = this.f12977l0;
        savedState.f12998r = this.f12987v0;
        return savedState;
    }

    public void p2() {
        k().K(this);
    }

    void q2(@o0 j jVar) {
        ArrayList<j> arrayList = this.f12984s0;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(jVar);
    }

    public void r2(@m0 int i5) {
        if (i5 != 0) {
            this.f12985t0 = 0;
            I().clear();
            d0(i5);
        }
    }

    @Override // android.view.View
    public void setElevation(float f6) {
        this.f12974i0.o0(f6);
        k().I(this, this.f12974i0.L() - this.f12974i0.K());
    }

    public void t2(@q0 ColorStateList colorStateList) {
        androidx.core.graphics.drawable.d.o(this.f12974i0, colorStateList);
    }

    public void u2(@r float f6) {
        if (f6 != Z1()) {
            k2().l(f6);
            this.f12974i0.invalidateSelf();
            v2();
        }
    }

    public void w2(int i5) {
        x2(i5, 0);
    }

    public void x2(int i5, @m0 int i6) {
        this.f12985t0 = i6;
        this.f12986u0 = true;
        m2(i5, this.f12987v0);
        n2(i5);
        this.f12977l0 = i5;
    }

    public void y2(int i5) {
        this.f12978m0 = i5;
    }

    void z2(@r float f6) {
        if (f6 != k2().e()) {
            k2().m(f6);
            this.f12974i0.invalidateSelf();
        }
    }

    public BottomAppBar(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.L0);
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: i, reason: collision with root package name */
        @o0
        private final Rect f12992i;

        /* renamed from: j, reason: collision with root package name */
        private WeakReference<BottomAppBar> f12993j;

        /* renamed from: k, reason: collision with root package name */
        private int f12994k;

        /* renamed from: l, reason: collision with root package name */
        private final View.OnLayoutChangeListener f12995l;

        /* loaded from: classes2.dex */
        class a implements View.OnLayoutChangeListener {
            a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f12993j.get();
                if (bottomAppBar == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                floatingActionButton.G(Behavior.this.f12992i);
                int height = Behavior.this.f12992i.height();
                bottomAppBar.C2(height);
                bottomAppBar.z2(floatingActionButton.l().r().a(new RectF(Behavior.this.f12992i)));
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
                if (Behavior.this.f12994k == 0) {
                    ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = BottomAppBar.w1(bottomAppBar) + (bottomAppBar.getResources().getDimensionPixelOffset(a.f.V2) - ((floatingActionButton.getMeasuredHeight() - height) / 2));
                    ((ViewGroup.MarginLayoutParams) fVar).leftMargin = BottomAppBar.x1(bottomAppBar);
                    ((ViewGroup.MarginLayoutParams) fVar).rightMargin = BottomAppBar.y1(bottomAppBar);
                    if (v.j(floatingActionButton)) {
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin += bottomAppBar.f12973h0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin += bottomAppBar.f12973h0;
                    }
                }
            }
        }

        public Behavior() {
            this.f12995l = new a();
            this.f12992i = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: O, reason: merged with bridge method [inline-methods] */
        public boolean m(@o0 CoordinatorLayout coordinatorLayout, @o0 BottomAppBar bottomAppBar, int i5) {
            this.f12993j = new WeakReference<>(bottomAppBar);
            View T1 = bottomAppBar.T1();
            if (T1 != null && !y1.U0(T1)) {
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) T1.getLayoutParams();
                fVar.f3930d = 49;
                this.f12994k = ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                if (T1 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) T1;
                    floatingActionButton.addOnLayoutChangeListener(this.f12995l);
                    bottomAppBar.L1(floatingActionButton);
                }
                bottomAppBar.v2();
            }
            coordinatorLayout.W(bottomAppBar, i5);
            return super.m(coordinatorLayout, bottomAppBar, i5);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: P, reason: merged with bridge method [inline-methods] */
        public boolean B(@o0 CoordinatorLayout coordinatorLayout, @o0 BottomAppBar bottomAppBar, @o0 View view, @o0 View view2, int i5, int i6) {
            return bottomAppBar.h2() && super.B(coordinatorLayout, bottomAppBar, view, view2, i5, i6);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f12995l = new a();
            this.f12992i = new Rect();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BottomAppBar(@androidx.annotation.o0 android.content.Context r11, @androidx.annotation.q0 android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            int r6 = com.google.android.material.bottomappbar.BottomAppBar.C0
            android.content.Context r11 = v1.a.c(r11, r12, r13, r6)
            r10.<init>(r11, r12, r13)
            com.google.android.material.shape.j r11 = new com.google.android.material.shape.j
            r11.<init>()
            r10.f12974i0 = r11
            r7 = 0
            r10.f12983r0 = r7
            r10.f12985t0 = r7
            r10.f12986u0 = r7
            r0 = 1
            r10.f12987v0 = r0
            com.google.android.material.bottomappbar.BottomAppBar$a r0 = new com.google.android.material.bottomappbar.BottomAppBar$a
            r0.<init>()
            r10.A0 = r0
            com.google.android.material.bottomappbar.BottomAppBar$b r0 = new com.google.android.material.bottomappbar.BottomAppBar$b
            r0.<init>()
            r10.B0 = r0
            android.content.Context r8 = r10.getContext()
            int[] r2 = n1.a.o.f30236m4
            int[] r5 = new int[r7]
            r0 = r8
            r1 = r12
            r3 = r13
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.n.j(r0, r1, r2, r3, r4, r5)
            int r1 = n1.a.o.f30242n4
            android.content.res.ColorStateList r1 = com.google.android.material.resources.c.a(r8, r0, r1)
            int r2 = n1.a.o.f30248o4
            int r2 = r0.getDimensionPixelSize(r2, r7)
            int r3 = n1.a.o.f30266r4
            int r3 = r0.getDimensionPixelOffset(r3, r7)
            float r3 = (float) r3
            int r4 = n1.a.o.f30272s4
            int r4 = r0.getDimensionPixelOffset(r4, r7)
            float r4 = (float) r4
            int r5 = n1.a.o.f30278t4
            int r5 = r0.getDimensionPixelOffset(r5, r7)
            float r5 = (float) r5
            int r9 = n1.a.o.f30254p4
            int r9 = r0.getInt(r9, r7)
            r10.f12977l0 = r9
            int r9 = n1.a.o.f30260q4
            int r9 = r0.getInt(r9, r7)
            r10.f12978m0 = r9
            int r9 = n1.a.o.f30284u4
            boolean r9 = r0.getBoolean(r9, r7)
            r10.f12979n0 = r9
            int r9 = n1.a.o.f30290v4
            boolean r9 = r0.getBoolean(r9, r7)
            r10.f12980o0 = r9
            int r9 = n1.a.o.f30296w4
            boolean r9 = r0.getBoolean(r9, r7)
            r10.f12981p0 = r9
            int r9 = n1.a.o.f30302x4
            boolean r7 = r0.getBoolean(r9, r7)
            r10.f12982q0 = r7
            r0.recycle()
            android.content.res.Resources r0 = r10.getResources()
            int r7 = n1.a.f.U2
            int r0 = r0.getDimensionPixelOffset(r7)
            r10.f12973h0 = r0
            com.google.android.material.bottomappbar.a r0 = new com.google.android.material.bottomappbar.a
            r0.<init>(r3, r4, r5)
            com.google.android.material.shape.o$b r3 = com.google.android.material.shape.o.a()
            com.google.android.material.shape.o$b r0 = r3.G(r0)
            com.google.android.material.shape.o r0 = r0.m()
            r11.g(r0)
            r0 = 2
            r11.y0(r0)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r11.s0(r0)
            r11.a0(r8)
            float r0 = (float) r2
            r10.setElevation(r0)
            androidx.core.graphics.drawable.d.o(r11, r1)
            androidx.core.view.y1.I1(r10, r11)
            com.google.android.material.bottomappbar.BottomAppBar$c r11 = new com.google.android.material.bottomappbar.BottomAppBar$c
            r11.<init>()
            com.google.android.material.internal.v.c(r10, r12, r13, r6, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
