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
import androidx.core.view.f0;
import androidx.core.view.j3;
import androidx.core.view.x1;
import androidx.customview.view.AbsSavedState;
import com.flashget.parentalcontrol.ProtectedSandApp;
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
import s8.a;

/* loaded from: classes6.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {

    /* renamed from: i3, reason: collision with root package name */
    private static final int f52697i3 = a.n.Pa;

    /* renamed from: j3, reason: collision with root package name */
    private static final long f52698j3 = 300;

    /* renamed from: k3, reason: collision with root package name */
    public static final int f52699k3 = 0;

    /* renamed from: l3, reason: collision with root package name */
    public static final int f52700l3 = 1;

    /* renamed from: m3, reason: collision with root package name */
    public static final int f52701m3 = 0;

    /* renamed from: n3, reason: collision with root package name */
    public static final int f52702n3 = 1;

    /* renamed from: o3, reason: collision with root package name */
    private static final int f52703o3 = 0;
    private final int N2;
    private final com.google.android.material.shape.j O2;

    @q0
    private Animator P2;

    @q0
    private Animator Q2;
    private int R2;
    private int S2;
    private boolean T2;
    private final boolean U2;
    private final boolean V2;
    private final boolean W2;
    private int X2;
    private ArrayList<j> Y2;

    @m0
    private int Z2;

    /* renamed from: a3, reason: collision with root package name */
    private boolean f52704a3;

    /* renamed from: b3, reason: collision with root package name */
    private boolean f52705b3;

    /* renamed from: c3, reason: collision with root package name */
    private Behavior f52706c3;

    /* renamed from: d3, reason: collision with root package name */
    private int f52707d3;

    /* renamed from: e3, reason: collision with root package name */
    private int f52708e3;

    /* renamed from: f3, reason: collision with root package name */
    private int f52709f3;

    /* renamed from: g3, reason: collision with root package name */
    @o0
    AnimatorListenerAdapter f52710g3;

    /* renamed from: h3, reason: collision with root package name */
    @o0
    com.google.android.material.animation.k<FloatingActionButton> f52711h3;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        int f52717d;

        /* renamed from: e, reason: collision with root package name */
        boolean f52718e;

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
            public SavedState[] c(int i4) {
                return new SavedState[i4];
            }

            @Override // android.os.Parcelable.Creator
            @o0
            public Object[] newArray(int i4) {
                return new SavedState[i4];
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
        public void writeToParcel(@o0 Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f52717d);
            parcel.writeInt(this.f52718e ? 1 : 0);
        }

        public SavedState(@o0 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f52717d = parcel.readInt();
            this.f52718e = parcel.readInt() != 0;
        }
    }

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (BottomAppBar.this.f52704a3) {
                return;
            }
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.s2(bottomAppBar.R2, BottomAppBar.this.f52705b3);
        }
    }

    class b implements com.google.android.material.animation.k<FloatingActionButton> {
        b() {
        }

        @Override // com.google.android.material.animation.k
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(@o0 FloatingActionButton floatingActionButton) {
            BottomAppBar.this.O2.q0(floatingActionButton.getVisibility() == 0 ? floatingActionButton.getScaleY() : 0.0f);
        }

        @Override // com.google.android.material.animation.k
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(@o0 FloatingActionButton floatingActionButton) {
            float translationX = floatingActionButton.getTranslationX();
            if (BottomAppBar.this.q2().l() != translationX) {
                BottomAppBar.this.q2().r(translationX);
                BottomAppBar.this.O2.invalidateSelf();
            }
            float max = Math.max(0.0f, -floatingActionButton.getTranslationY());
            if (BottomAppBar.this.q2().e() != max) {
                BottomAppBar.this.q2().m(max);
                BottomAppBar.this.O2.invalidateSelf();
            }
            BottomAppBar.this.O2.q0(floatingActionButton.getVisibility() == 0 ? floatingActionButton.getScaleY() : 0.0f);
        }
    }

    class c implements v.e {
        c() {
        }

        @Override // com.google.android.material.internal.v.e
        @o0
        public j3 a(View view, @o0 j3 j3Var, @o0 v.f fVar) {
            boolean z4;
            if (BottomAppBar.this.U2) {
                BottomAppBar.this.f52707d3 = j3Var.o();
            }
            boolean z5 = false;
            if (BottomAppBar.this.V2) {
                z4 = BottomAppBar.this.f52709f3 != j3Var.p();
                BottomAppBar.this.f52709f3 = j3Var.p();
            } else {
                z4 = false;
            }
            if (BottomAppBar.this.W2) {
                boolean z6 = BottomAppBar.this.f52708e3 != j3Var.q();
                BottomAppBar.this.f52708e3 = j3Var.q();
                z5 = z6;
            }
            if (z4 || z5) {
                BottomAppBar.this.S1();
                BottomAppBar.this.B2();
                BottomAppBar.this.y2();
            }
            return j3Var;
        }
    }

    class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.W1();
            BottomAppBar.this.P2 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.X1();
        }
    }

    class e extends FloatingActionButton.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f52723a;

        class a extends FloatingActionButton.b {
            a() {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
            public void b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.W1();
            }
        }

        e(int i4) {
            this.f52723a = i4;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
        public void a(@o0 FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.l2(this.f52723a));
            floatingActionButton.k0(new a());
        }
    }

    class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.W1();
            BottomAppBar.this.f52704a3 = false;
            BottomAppBar.this.Q2 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.X1();
        }
    }

    class g extends AnimatorListenerAdapter {

        /* renamed from: b, reason: collision with root package name */
        public boolean f52727b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ActionMenuView f52728c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f52729d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f52730e;

        g(ActionMenuView actionMenuView, int i4, boolean z4) {
            this.f52728c = actionMenuView;
            this.f52729d = i4;
            this.f52730e = z4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f52727b = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f52727b) {
                return;
            }
            boolean z4 = BottomAppBar.this.Z2 != 0;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.x2(bottomAppBar.Z2);
            BottomAppBar.this.L2(this.f52728c, this.f52729d, this.f52730e, z4);
        }
    }

    class h implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ActionMenuView f52732b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f52733c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f52734d;

        h(ActionMenuView actionMenuView, int i4, boolean z4) {
            this.f52732b = actionMenuView;
            this.f52733c = i4;
            this.f52734d = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f52732b.setTranslationX(BottomAppBar.this.b2(r0, this.f52733c, this.f52734d));
        }
    }

    class i extends AnimatorListenerAdapter {
        i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.f52710g3.onAnimationStart(animator);
            FloatingActionButton Y1 = BottomAppBar.this.Y1();
            if (Y1 != null) {
                Y1.setTranslationX(BottomAppBar.B1(BottomAppBar.this));
            }
        }
    }

    interface j {
        void a(BottomAppBar bottomAppBar);

        void b(BottomAppBar bottomAppBar);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface k {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface l {
    }

    public BottomAppBar(@o0 Context context) {
        this(context, null, 0);
    }

    static float B1(BottomAppBar bottomAppBar) {
        return bottomAppBar.l2(bottomAppBar.R2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B2() {
        q2().r(l2(this.R2));
        View Z1 = Z1();
        this.O2.q0((this.f52705b3 && r2()) ? 1.0f : 0.0f);
        if (Z1 != null) {
            Z1.setTranslationY(m2());
            Z1.setTranslationX(l2(this.R2));
        }
    }

    static int C1(BottomAppBar bottomAppBar) {
        return bottomAppBar.f52707d3;
    }

    static int D1(BottomAppBar bottomAppBar) {
        return bottomAppBar.f52709f3;
    }

    static int E1(BottomAppBar bottomAppBar) {
        return bottomAppBar.f52708e3;
    }

    private void K2(@o0 ActionMenuView actionMenuView, int i4, boolean z4) {
        L2(actionMenuView, i4, z4, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L2(@o0 ActionMenuView actionMenuView, int i4, boolean z4, boolean z5) {
        h hVar = new h(actionMenuView, i4, z4);
        if (z5) {
            actionMenuView.post(hVar);
        } else {
            hVar.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R1(@o0 FloatingActionButton floatingActionButton) {
        floatingActionButton.l(this.f52710g3);
        floatingActionButton.m(new i());
        floatingActionButton.n(this.f52711h3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S1() {
        Animator animator = this.Q2;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.P2;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    private void U1(int i4, @o0 List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(Y1(), ProtectedSandApp.s("\uf154"), l2(i4));
        ofFloat.setDuration(f52698j3);
        list.add(ofFloat);
    }

    private void V1(int i4, boolean z4, @o0 List<Animator> list) {
        ActionMenuView a22 = a2();
        if (a22 == null) {
            return;
        }
        String s4 = ProtectedSandApp.s("\uf155");
        Animator ofFloat = ObjectAnimator.ofFloat(a22, s4, 1.0f);
        if (Math.abs(a22.getTranslationX() - b2(a22, i4, z4)) <= 1.0f) {
            if (a22.getAlpha() < 1.0f) {
                list.add(ofFloat);
            }
        } else {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(a22, s4, 0.0f);
            ofFloat2.addListener(new g(a22, i4, z4));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(150L);
            animatorSet.playSequentially(ofFloat2, ofFloat);
            list.add(animatorSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W1() {
        ArrayList<j> arrayList;
        int i4 = this.X2 - 1;
        this.X2 = i4;
        if (i4 != 0 || (arrayList = this.Y2) == null) {
            return;
        }
        Iterator<j> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X1() {
        ArrayList<j> arrayList;
        int i4 = this.X2;
        this.X2 = i4 + 1;
        if (i4 != 0 || (arrayList = this.Y2) == null) {
            return;
        }
        Iterator<j> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @q0
    public FloatingActionButton Y1() {
        View Z1 = Z1();
        if (Z1 instanceof FloatingActionButton) {
            return (FloatingActionButton) Z1;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @q0
    public View Z1() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).B(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    @q0
    private ActionMenuView a2() {
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    private int e2() {
        return this.f52707d3;
    }

    private float k2() {
        return l2(this.R2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float l2(int i4) {
        boolean j4 = v.j(this);
        if (i4 == 1) {
            return ((getMeasuredWidth() / 2) - (this.N2 + (j4 ? this.f52709f3 : this.f52708e3))) * (j4 ? -1 : 1);
        }
        return 0.0f;
    }

    private float m2() {
        return -q2().e();
    }

    private int o2() {
        return this.f52709f3;
    }

    private int p2() {
        return this.f52708e3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @o0
    public com.google.android.material.bottomappbar.a q2() {
        return (com.google.android.material.bottomappbar.a) this.O2.e().p();
    }

    private boolean r2() {
        FloatingActionButton Y1 = Y1();
        return Y1 != null && Y1.K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s2(int i4, boolean z4) {
        if (!x1.Y0(this)) {
            this.f52704a3 = false;
            x2(this.Z2);
            return;
        }
        Animator animator = this.Q2;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!r2()) {
            i4 = 0;
            z4 = false;
        }
        V1(i4, z4, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.Q2 = animatorSet;
        animatorSet.addListener(new f());
        this.Q2.start();
    }

    private void t2(int i4) {
        if (this.R2 == i4 || !x1.Y0(this)) {
            return;
        }
        Animator animator = this.P2;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (this.S2 == 1) {
            U1(i4, arrayList);
        } else {
            T1(i4, arrayList);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.P2 = animatorSet;
        animatorSet.addListener(new d());
        this.P2.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y2() {
        ActionMenuView a22 = a2();
        if (a22 == null || this.Q2 != null) {
            return;
        }
        a22.setAlpha(1.0f);
        if (r2()) {
            L2(a22, this.R2, this.f52705b3, false);
        } else {
            L2(a22, 0, false, false);
        }
    }

    public void A2(@r float f4) {
        if (f4 != f2()) {
            q2().m(f4);
            this.O2.invalidateSelf();
            B2();
        }
    }

    public void C2(int i4) {
        D2(i4, 0);
    }

    public void D2(int i4, @m0 int i5) {
        this.Z2 = i5;
        this.f52704a3 = true;
        s2(i4, this.f52705b3);
        t2(i4);
        this.R2 = i4;
    }

    public void E2(int i4) {
        this.S2 = i4;
    }

    void F2(@r float f4) {
        if (f4 != q2().f()) {
            q2().n(f4);
            this.O2.invalidateSelf();
        }
    }

    public void G2(@r float f4) {
        if (f4 != i2()) {
            q2().o(f4);
            this.O2.invalidateSelf();
        }
    }

    public void H2(@r float f4) {
        if (f4 != j2()) {
            q2().p(f4);
            this.O2.invalidateSelf();
        }
    }

    boolean I2(@u0 int i4) {
        float f4 = i4;
        if (f4 == q2().k()) {
            return false;
        }
        q2().q(f4);
        this.O2.invalidateSelf();
        return true;
    }

    public void J2(boolean z4) {
        this.T2 = z4;
    }

    void Q1(@o0 j jVar) {
        if (this.Y2 == null) {
            this.Y2 = new ArrayList<>();
        }
        this.Y2.add(jVar);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void R0(CharSequence charSequence) {
    }

    protected void T1(int i4, List<Animator> list) {
        FloatingActionButton Y1 = Y1();
        if (Y1 == null || Y1.J()) {
            return;
        }
        X1();
        Y1.H(new e(i4));
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void W0(CharSequence charSequence) {
    }

    protected int b2(@o0 ActionMenuView actionMenuView, int i4, boolean z4) {
        if (i4 != 1 || !z4) {
            return 0;
        }
        boolean j4 = v.j(this);
        int measuredWidth = j4 ? getMeasuredWidth() : 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if ((childAt.getLayoutParams() instanceof Toolbar.LayoutParams) && (((Toolbar.LayoutParams) childAt.getLayoutParams()).f658a & f0.f27131d) == 8388611) {
                measuredWidth = j4 ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        return measuredWidth - ((j4 ? actionMenuView.getRight() : actionMenuView.getLeft()) + (j4 ? this.f52708e3 : -this.f52709f3));
    }

    @q0
    public ColorStateList c2() {
        return this.O2.S();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @o0
    /* renamed from: d2, reason: merged with bridge method [inline-methods] */
    public Behavior b() {
        if (this.f52706c3 == null) {
            this.f52706c3 = new Behavior();
        }
        return this.f52706c3;
    }

    @r
    public float f2() {
        return q2().e();
    }

    public int g2() {
        return this.R2;
    }

    public int h2() {
        return this.S2;
    }

    public float i2() {
        return q2().g();
    }

    @r
    public float j2() {
        return q2().i();
    }

    public boolean n2() {
        return this.T2;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.shape.k.f(this, this.O2);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        if (z4) {
            S1();
            B2();
        }
        y2();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        this.R2 = savedState.f52717d;
        this.f52705b3 = savedState.f52718e;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    @o0
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f52717d = this.R2;
        savedState.f52718e = this.f52705b3;
        return savedState;
    }

    @Override // android.view.View
    public void setElevation(float f4) {
        this.O2.o0(f4);
        b().I(this, this.O2.L() - this.O2.K());
    }

    public void u2() {
        b().J(this);
    }

    public void v2() {
        b().K(this);
    }

    void w2(@o0 j jVar) {
        ArrayList<j> arrayList = this.Y2;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(jVar);
    }

    public void x2(@m0 int i4) {
        if (i4 != 0) {
            this.Z2 = 0;
            J().clear();
            f0(i4);
        }
    }

    public void z2(@q0 ColorStateList colorStateList) {
        this.O2.setTintList(colorStateList);
    }

    public BottomAppBar(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.K0);
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: i, reason: collision with root package name */
        @o0
        private final Rect f52712i;

        /* renamed from: j, reason: collision with root package name */
        private WeakReference<BottomAppBar> f52713j;

        /* renamed from: k, reason: collision with root package name */
        private int f52714k;

        /* renamed from: l, reason: collision with root package name */
        private final View.OnLayoutChangeListener f52715l;

        class a implements View.OnLayoutChangeListener {
            a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i10, int i11, int i12, int i13) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f52713j.get();
                if (bottomAppBar == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                floatingActionButton.y(Behavior.this.f52712i);
                int height = Behavior.this.f52712i.height();
                bottomAppBar.I2(height);
                bottomAppBar.F2(floatingActionButton.e().r().a(new RectF(Behavior.this.f52712i)));
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
                if (Behavior.this.f52714k == 0) {
                    ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = BottomAppBar.C1(bottomAppBar) + (bottomAppBar.getResources().getDimensionPixelOffset(a.f.V2) - ((floatingActionButton.getMeasuredHeight() - height) / 2));
                    ((ViewGroup.MarginLayoutParams) fVar).leftMargin = BottomAppBar.D1(bottomAppBar);
                    ((ViewGroup.MarginLayoutParams) fVar).rightMargin = BottomAppBar.E1(bottomAppBar);
                    if (v.j(floatingActionButton)) {
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin += bottomAppBar.N2;
                    } else {
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin += bottomAppBar.N2;
                    }
                }
            }
        }

        public Behavior() {
            this.f52715l = new a();
            this.f52712i = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: O, reason: merged with bridge method [inline-methods] */
        public boolean m(@o0 CoordinatorLayout coordinatorLayout, @o0 BottomAppBar bottomAppBar, int i4) {
            this.f52713j = new WeakReference<>(bottomAppBar);
            View Z1 = bottomAppBar.Z1();
            if (Z1 != null && !x1.Y0(Z1)) {
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) Z1.getLayoutParams();
                fVar.f25332d = 49;
                this.f52714k = ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                if (Z1 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) Z1;
                    floatingActionButton.addOnLayoutChangeListener(this.f52715l);
                    bottomAppBar.R1(floatingActionButton);
                }
                bottomAppBar.B2();
            }
            coordinatorLayout.T(bottomAppBar, i4);
            return super.m(coordinatorLayout, bottomAppBar, i4);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: P, reason: merged with bridge method [inline-methods] */
        public boolean B(@o0 CoordinatorLayout coordinatorLayout, @o0 BottomAppBar bottomAppBar, @o0 View view, @o0 View view2, int i4, int i5) {
            return bottomAppBar.n2() && super.B(coordinatorLayout, bottomAppBar, view, view2, i4, i5);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f52715l = new a();
            this.f52712i = new Rect();
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
            int r6 = com.google.android.material.bottomappbar.BottomAppBar.f52697i3
            android.content.Context r11 = a9.a.c(r11, r12, r13, r6)
            r10.<init>(r11, r12, r13)
            com.google.android.material.shape.j r11 = new com.google.android.material.shape.j
            r11.<init>()
            r10.O2 = r11
            r7 = 0
            r10.X2 = r7
            r10.Z2 = r7
            r10.f52704a3 = r7
            r0 = 1
            r10.f52705b3 = r0
            com.google.android.material.bottomappbar.BottomAppBar$a r0 = new com.google.android.material.bottomappbar.BottomAppBar$a
            r0.<init>()
            r10.f52710g3 = r0
            com.google.android.material.bottomappbar.BottomAppBar$b r0 = new com.google.android.material.bottomappbar.BottomAppBar$b
            r0.<init>()
            r10.f52711h3 = r0
            android.content.Context r8 = r10.getContext()
            int[] r2 = s8.a.o.n4
            int[] r5 = new int[r7]
            r0 = r8
            r1 = r12
            r3 = r13
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.n.j(r0, r1, r2, r3, r4, r5)
            int r1 = s8.a.o.o4
            android.content.res.ColorStateList r1 = com.google.android.material.resources.c.a(r8, r0, r1)
            int r2 = s8.a.o.p4
            int r2 = r0.getDimensionPixelSize(r2, r7)
            int r3 = s8.a.o.s4
            int r3 = r0.getDimensionPixelOffset(r3, r7)
            float r3 = (float) r3
            int r4 = s8.a.o.t4
            int r4 = r0.getDimensionPixelOffset(r4, r7)
            float r4 = (float) r4
            int r5 = s8.a.o.u4
            int r5 = r0.getDimensionPixelOffset(r5, r7)
            float r5 = (float) r5
            int r9 = s8.a.o.q4
            int r9 = r0.getInt(r9, r7)
            r10.R2 = r9
            int r9 = s8.a.o.r4
            int r9 = r0.getInt(r9, r7)
            r10.S2 = r9
            int r9 = s8.a.o.v4
            boolean r9 = r0.getBoolean(r9, r7)
            r10.T2 = r9
            int r9 = s8.a.o.w4
            boolean r9 = r0.getBoolean(r9, r7)
            r10.U2 = r9
            int r9 = s8.a.o.x4
            boolean r9 = r0.getBoolean(r9, r7)
            r10.V2 = r9
            int r9 = s8.a.o.y4
            boolean r7 = r0.getBoolean(r9, r7)
            r10.W2 = r7
            r0.recycle()
            android.content.res.Resources r0 = r10.getResources()
            int r7 = s8.a.f.U2
            int r0 = r0.getDimensionPixelOffset(r7)
            r10.N2 = r0
            com.google.android.material.bottomappbar.a r0 = new com.google.android.material.bottomappbar.a
            r0.<init>(r3, r4, r5)
            com.google.android.material.shape.o$b r3 = com.google.android.material.shape.o.a()
            com.google.android.material.shape.o$b r0 = r3.G(r0)
            com.google.android.material.shape.o r0 = r0.m()
            r11.d(r0)
            r0 = 2
            r11.y0(r0)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r11.s0(r0)
            r11.a0(r8)
            float r0 = (float) r2
            r10.setElevation(r0)
            r11.setTintList(r1)
            androidx.core.view.x1.P1(r10, r11)
            com.google.android.material.bottomappbar.BottomAppBar$c r11 = new com.google.android.material.bottomappbar.BottomAppBar$c
            r11.<init>()
            com.google.android.material.internal.v.c(r10, r12, r13, r6, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
