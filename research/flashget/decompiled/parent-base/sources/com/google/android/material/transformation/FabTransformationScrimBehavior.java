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
/* loaded from: classes6.dex */
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: h, reason: collision with root package name */
    public static final long f54535h = 75;

    /* renamed from: i, reason: collision with root package name */
    public static final long f54536i = 150;

    /* renamed from: j, reason: collision with root package name */
    public static final long f54537j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static final long f54538k = 150;

    /* renamed from: f, reason: collision with root package name */
    private final i f54539f;

    /* renamed from: g, reason: collision with root package name */
    private final i f54540g;

    class a extends AnimatorListenerAdapter {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f54541b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f54542c;

        a(boolean z4, View view) {
            this.f54541b = z4;
            this.f54542c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f54541b) {
                return;
            }
            this.f54542c.setVisibility(4);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f54541b) {
                this.f54542c.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
        this.f54539f = new i(75L, 150L);
        this.f54540g = new i(0L, 150L);
    }

    private void N(@o0 View view, boolean z4, boolean z5, @o0 List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofFloat;
        i iVar = z4 ? this.f54539f : this.f54540g;
        if (z4) {
            if (!z5) {
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
    protected AnimatorSet M(@o0 View view, @o0 View view2, boolean z4, boolean z5) {
        ArrayList arrayList = new ArrayList();
        N(view2, z4, z5, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        b.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z4, view2));
        return animatorSet;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean f(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f54539f = new i(75L, 150L);
        this.f54540g = new i(0L, 150L);
    }
}
