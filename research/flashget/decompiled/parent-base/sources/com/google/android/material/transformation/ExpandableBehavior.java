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
import androidx.core.view.x1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import y8.b;

@Deprecated
/* loaded from: classes6.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.Behavior<View> {

    /* renamed from: b, reason: collision with root package name */
    private static final int f54506b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static final int f54507c = 1;

    /* renamed from: d, reason: collision with root package name */
    private static final int f54508d = 2;

    /* renamed from: a, reason: collision with root package name */
    private int f54509a;

    class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f54510b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f54511c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ b f54512d;

        a(View view, int i4, b bVar) {
            this.f54510b = view;
            this.f54511c = i4;
            this.f54512d = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f54510b.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f54509a == this.f54511c) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                b bVar = this.f54512d;
                expandableBehavior.K((View) bVar, this.f54510b, bVar.g(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f54509a = 0;
    }

    private boolean H(boolean z4) {
        if (!z4) {
            return this.f54509a == 1;
        }
        int i4 = this.f54509a;
        return i4 == 0 || i4 == 2;
    }

    @q0
    public static <T extends ExpandableBehavior> T J(@o0 View view, @o0 Class<T> cls) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.f)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\uf279"));
        }
        CoordinatorLayout.Behavior f4 = ((CoordinatorLayout.f) layoutParams).f();
        if (f4 instanceof ExpandableBehavior) {
            return cls.cast(f4);
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("\uf278"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @q0
    protected b I(@o0 CoordinatorLayout coordinatorLayout, @o0 View view) {
        List<View> z4 = coordinatorLayout.z(view);
        int size = z4.size();
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = z4.get(i4);
            if (f(coordinatorLayout, view, view2)) {
                return (b) view2;
            }
        }
        return null;
    }

    protected abstract boolean K(View view, View view2, boolean z4, boolean z5);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public abstract boolean f(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @i
    public boolean i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        b bVar = (b) view2;
        if (!H(bVar.g())) {
            return false;
        }
        this.f54509a = bVar.g() ? 1 : 2;
        return K((View) bVar, view, bVar.g(), true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @i
    public boolean m(@o0 CoordinatorLayout coordinatorLayout, @o0 View view, int i4) {
        b I;
        if (x1.Y0(view) || (I = I(coordinatorLayout, view)) == null || !H(I.g())) {
            return false;
        }
        int i5 = I.g() ? 1 : 2;
        this.f54509a = i5;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, i5, I));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f54509a = 0;
    }
}
