package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.i;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.y1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import t1.b;

@Deprecated
/* loaded from: classes3.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.Behavior<View> {

    /* renamed from: b, reason: collision with root package name */
    private static final int f14667b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static final int f14668c = 1;

    /* renamed from: d, reason: collision with root package name */
    private static final int f14669d = 2;

    /* renamed from: a, reason: collision with root package name */
    private int f14670a;

    /* loaded from: classes2.dex */
    class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ View f14671o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f14672p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ b f14673q;

        a(View view, int i5, b bVar) {
            this.f14671o = view;
            this.f14672p = i5;
            this.f14673q = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f14671o.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f14670a == this.f14672p) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                b bVar = this.f14673q;
                expandableBehavior.K((View) bVar, this.f14671o, bVar.n(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f14670a = 0;
    }

    private boolean H(boolean z5) {
        if (!z5) {
            return this.f14670a == 1;
        }
        int i5 = this.f14670a;
        return i5 == 0 || i5 == 2;
    }

    @q0
    public static <T extends ExpandableBehavior> T J(@o0 View view, @o0 Class<T> cls) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.f)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("❢"));
        }
        CoordinatorLayout.Behavior f6 = ((CoordinatorLayout.f) layoutParams).f();
        if (f6 instanceof ExpandableBehavior) {
            return cls.cast(f6);
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("❡"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @q0
    protected b I(@o0 CoordinatorLayout coordinatorLayout, @o0 View view) {
        List<View> C = coordinatorLayout.C(view);
        int size = C.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = C.get(i5);
            if (f(coordinatorLayout, view, view2)) {
                return (b) view2;
            }
        }
        return null;
    }

    protected abstract boolean K(View view, View view2, boolean z5, boolean z6);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public abstract boolean f(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @i
    public boolean i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        b bVar = (b) view2;
        if (!H(bVar.n())) {
            return false;
        }
        this.f14670a = bVar.n() ? 1 : 2;
        return K((View) bVar, view, bVar.n(), true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @i
    public boolean m(@o0 CoordinatorLayout coordinatorLayout, @o0 View view, int i5) {
        b I;
        if (y1.U0(view) || (I = I(coordinatorLayout, view)) == null || !H(I.n())) {
            return false;
        }
        int i6 = I.n() ? 1 : 2;
        this.f14670a = i6;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, i6, I));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14670a = 0;
    }
}
