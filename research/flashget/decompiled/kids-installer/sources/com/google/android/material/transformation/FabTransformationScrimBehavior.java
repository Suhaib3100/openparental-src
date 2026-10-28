package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.o0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.animation.b;
import com.google.android.material.animation.i;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* loaded from: classes4.dex */
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: h, reason: collision with root package name */
    public static final long f14696h = 75;

    /* renamed from: i, reason: collision with root package name */
    public static final long f14697i = 150;

    /* renamed from: j, reason: collision with root package name */
    public static final long f14698j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static final long f14699k = 150;

    /* renamed from: f, reason: collision with root package name */
    private final i f14700f;

    /* renamed from: g, reason: collision with root package name */
    private final i f14701g;

    /* loaded from: classes2.dex */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f14702a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f14703b;

        a(boolean z5, View view) {
            this.f14702a = z5;
            this.f14703b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f14702a) {
                return;
            }
            this.f14703b.setVisibility(4);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f14702a) {
                this.f14703b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
        this.f14700f = new i(75L, 150L);
        this.f14701g = new i(0L, 150L);
    }

    private void N(@o0 View view, boolean z5, boolean z6, @o0 List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofFloat;
        i iVar = z5 ? this.f14700f : this.f14701g;
        if (z5) {
            if (!z6) {
                view.setAlpha(0.0f);
            }
            ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f);
        }
        iVar.a(ofFloat);
        list.add(ofFloat);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean E(@o0 CoordinatorLayout coordinatorLayout, @o0 View view, @o0 MotionEvent motionEvent) {
        return false;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    @o0
    protected AnimatorSet M(@o0 View view, @o0 View view2, boolean z5, boolean z6) {
        ArrayList arrayList = new ArrayList();
        N(view2, z5, z6, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        b.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z5, view2));
        return animatorSet;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean f(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14700f = new i(75L, 150L);
        this.f14701g = new i(0L, 150L);
    }
}
