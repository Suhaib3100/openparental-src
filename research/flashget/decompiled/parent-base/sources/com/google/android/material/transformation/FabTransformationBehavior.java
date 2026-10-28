package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.x1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.animation.h;
import com.google.android.material.animation.i;
import com.google.android.material.animation.j;
import com.google.android.material.circularreveal.c;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import s8.a;

@Deprecated
/* loaded from: classes6.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: f, reason: collision with root package name */
    private final Rect f54516f;

    /* renamed from: g, reason: collision with root package name */
    private final RectF f54517g;

    /* renamed from: h, reason: collision with root package name */
    private final RectF f54518h;

    /* renamed from: i, reason: collision with root package name */
    private final int[] f54519i;

    /* renamed from: j, reason: collision with root package name */
    private float f54520j;

    /* renamed from: k, reason: collision with root package name */
    private float f54521k;

    class a extends AnimatorListenerAdapter {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f54522b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f54523c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f54524d;

        a(boolean z4, View view, View view2) {
            this.f54522b = z4;
            this.f54523c = view;
            this.f54524d = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f54522b) {
                return;
            }
            this.f54523c.setVisibility(4);
            this.f54524d.setAlpha(1.0f);
            this.f54524d.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f54522b) {
                this.f54523c.setVisibility(0);
                this.f54524d.setAlpha(0.0f);
                this.f54524d.setVisibility(4);
            }
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f54526b;

        b(View view) {
            this.f54526b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f54526b.invalidate();
        }
    }

    class c extends AnimatorListenerAdapter {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.circularreveal.c f54528b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Drawable f54529c;

        c(com.google.android.material.circularreveal.c cVar, Drawable drawable) {
            this.f54528b = cVar;
            this.f54529c = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f54528b.c(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f54528b.c(this.f54529c);
        }
    }

    class d extends AnimatorListenerAdapter {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.circularreveal.c f54531b;

        d(com.google.android.material.circularreveal.c cVar) {
            this.f54531b = cVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            c.e a5 = this.f54531b.a();
            a5.f53035c = Float.MAX_VALUE;
            this.f54531b.k(a5);
        }
    }

    protected static class e {

        /* renamed from: a, reason: collision with root package name */
        @q0
        public h f54533a;

        /* renamed from: b, reason: collision with root package name */
        public j f54534b;

        protected e() {
        }
    }

    public FabTransformationBehavior() {
        this.f54516f = new Rect();
        this.f54517g = new RectF();
        this.f54518h = new RectF();
        this.f54519i = new int[2];
    }

    @q0
    private ViewGroup N(@o0 View view) {
        View findViewById = view.findViewById(a.h.f90988b3);
        return findViewById != null ? i0(findViewById) : ((view instanceof TransformationChildLayout) || (view instanceof TransformationChildCard)) ? i0(((ViewGroup) view).getChildAt(0)) : i0(view);
    }

    private void O(@o0 View view, @o0 e eVar, @o0 i iVar, @o0 i iVar2, float f4, float f5, float f6, float f7, @o0 RectF rectF) {
        float V = V(eVar, iVar, f4, f6);
        float V2 = V(eVar, iVar2, f5, f7);
        Rect rect = this.f54516f;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f54517g;
        rectF2.set(rect);
        RectF rectF3 = this.f54518h;
        W(view, rectF3);
        rectF3.offset(V, V2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    private void P(@o0 View view, @o0 RectF rectF) {
        W(view, rectF);
        rectF.offset(this.f54520j, this.f54521k);
    }

    @o0
    private Pair<i, i> Q(float f4, float f5, boolean z4, @o0 e eVar) {
        i h4;
        i h5;
        if (f4 == 0.0f || f5 == 0.0f) {
            h4 = eVar.f54533a.h(ProtectedSandApp.s("\uf27e"));
            h5 = eVar.f54533a.h(ProtectedSandApp.s("\uf27f"));
        } else if ((!z4 || f5 >= 0.0f) && (z4 || f5 <= 0.0f)) {
            h4 = eVar.f54533a.h(ProtectedSandApp.s("\uf27c"));
            h5 = eVar.f54533a.h(ProtectedSandApp.s("\uf27d"));
        } else {
            h4 = eVar.f54533a.h(ProtectedSandApp.s("\uf27a"));
            h5 = eVar.f54533a.h(ProtectedSandApp.s("\uf27b"));
        }
        return new Pair<>(h4, h5);
    }

    private float R(@o0 View view, @o0 View view2, @o0 j jVar) {
        RectF rectF = this.f54517g;
        RectF rectF2 = this.f54518h;
        P(view, rectF);
        W(view2, rectF2);
        rectF2.offset(-T(view, view2, jVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    private float S(@o0 View view, @o0 View view2, @o0 j jVar) {
        RectF rectF = this.f54517g;
        RectF rectF2 = this.f54518h;
        P(view, rectF);
        W(view2, rectF2);
        rectF2.offset(0.0f, -U(view, view2, jVar));
        return rectF.centerY() - rectF2.top;
    }

    private float T(@o0 View view, @o0 View view2, @o0 j jVar) {
        float centerX;
        float centerX2;
        float f4;
        RectF rectF = this.f54517g;
        RectF rectF2 = this.f54518h;
        P(view, rectF);
        W(view2, rectF2);
        int i4 = jVar.f52487a & 7;
        if (i4 == 1) {
            centerX = rectF2.centerX();
            centerX2 = rectF.centerX();
        } else if (i4 == 3) {
            centerX = rectF2.left;
            centerX2 = rectF.left;
        } else {
            if (i4 != 5) {
                f4 = 0.0f;
                return f4 + jVar.f52488b;
            }
            centerX = rectF2.right;
            centerX2 = rectF.right;
        }
        f4 = centerX - centerX2;
        return f4 + jVar.f52488b;
    }

    private float U(@o0 View view, @o0 View view2, @o0 j jVar) {
        float centerY;
        float centerY2;
        float f4;
        RectF rectF = this.f54517g;
        RectF rectF2 = this.f54518h;
        P(view, rectF);
        W(view2, rectF2);
        int i4 = jVar.f52487a & 112;
        if (i4 == 16) {
            centerY = rectF2.centerY();
            centerY2 = rectF.centerY();
        } else if (i4 == 48) {
            centerY = rectF2.top;
            centerY2 = rectF.top;
        } else {
            if (i4 != 80) {
                f4 = 0.0f;
                return f4 + jVar.f52489c;
            }
            centerY = rectF2.bottom;
            centerY2 = rectF.bottom;
        }
        f4 = centerY - centerY2;
        return f4 + jVar.f52489c;
    }

    private float V(@o0 e eVar, @o0 i iVar, float f4, float f5) {
        long c5 = iVar.c();
        long d5 = iVar.d();
        i h4 = eVar.f54533a.h(ProtectedSandApp.s("\uf280"));
        return com.google.android.material.animation.a.a(f4, f5, iVar.e().getInterpolation((((h4.d() + h4.c()) + 17) - c5) / d5));
    }

    private void W(@o0 View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f54519i);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    private void X(View view, View view2, boolean z4, boolean z5, @o0 e eVar, @o0 List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup N;
        ObjectAnimator ofFloat;
        if (view2 instanceof ViewGroup) {
            if (((view2 instanceof com.google.android.material.circularreveal.c) && com.google.android.material.circularreveal.b.f53017o == 0) || (N = N(view2)) == null) {
                return;
            }
            if (z4) {
                if (!z5) {
                    com.google.android.material.animation.d.f52472a.set(N, Float.valueOf(0.0f));
                }
                ofFloat = ObjectAnimator.ofFloat(N, com.google.android.material.animation.d.f52472a, 1.0f);
            } else {
                ofFloat = ObjectAnimator.ofFloat(N, com.google.android.material.animation.d.f52472a, 0.0f);
            }
            eVar.f54533a.h(ProtectedSandApp.s("\uf281")).a(ofFloat);
            list.add(ofFloat);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void Y(@o0 View view, View view2, boolean z4, boolean z5, @o0 e eVar, @o0 List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofInt;
        if (view2 instanceof com.google.android.material.circularreveal.c) {
            com.google.android.material.circularreveal.c cVar = (com.google.android.material.circularreveal.c) view2;
            int g02 = g0(view);
            int i4 = 16777215 & g02;
            if (z4) {
                if (!z5) {
                    cVar.i(g02);
                }
                ofInt = ObjectAnimator.ofInt(cVar, c.d.f53031a, i4);
            } else {
                ofInt = ObjectAnimator.ofInt(cVar, c.d.f53031a, g02);
            }
            ofInt.setEvaluator(com.google.android.material.animation.c.b());
            eVar.f54533a.h(ProtectedSandApp.s("\uf282")).a(ofInt);
            list.add(ofInt);
        }
    }

    private void Z(@o0 View view, @o0 View view2, boolean z4, @o0 e eVar, @o0 List<Animator> list) {
        float T = T(view, view2, eVar.f54534b);
        float U = U(view, view2, eVar.f54534b);
        Pair<i, i> Q = Q(T, U, z4, eVar);
        i iVar = (i) Q.first;
        i iVar2 = (i) Q.second;
        Property property = View.TRANSLATION_X;
        if (!z4) {
            T = this.f54520j;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, T);
        Property property2 = View.TRANSLATION_Y;
        if (!z4) {
            U = this.f54521k;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, U);
        iVar.a(ofFloat);
        iVar2.a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    @TargetApi(21)
    private void a0(View view, @o0 View view2, boolean z4, boolean z5, @o0 e eVar, @o0 List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofFloat;
        float T = x1.T(view2) - x1.T(view);
        if (z4) {
            if (!z5) {
                view2.setTranslationZ(-T);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -T);
        }
        eVar.f54533a.h(ProtectedSandApp.s("\uf283")).a(ofFloat);
        list.add(ofFloat);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void b0(@o0 View view, View view2, boolean z4, boolean z5, @o0 e eVar, float f4, float f5, @o0 List<Animator> list, @o0 List<Animator.AnimatorListener> list2) {
        Animator animator;
        if (view2 instanceof com.google.android.material.circularreveal.c) {
            com.google.android.material.circularreveal.c cVar = (com.google.android.material.circularreveal.c) view2;
            float R = R(view, view2, eVar.f54534b);
            float S = S(view, view2, eVar.f54534b);
            ((FloatingActionButton) view).u(this.f54516f);
            float width = this.f54516f.width() / 2.0f;
            i h4 = eVar.f54533a.h(ProtectedSandApp.s("\uf280"));
            if (z4) {
                if (!z5) {
                    cVar.k(new c.e(R, S, width));
                }
                if (z5) {
                    width = cVar.a().f53035c;
                }
                animator = com.google.android.material.circularreveal.a.a(cVar, R, S, z8.a.b(R, S, 0.0f, 0.0f, f4, f5));
                animator.addListener(new d(cVar));
                e0(view2, h4.c(), (int) R, (int) S, width, list);
            } else {
                float f6 = cVar.a().f53035c;
                Animator a5 = com.google.android.material.circularreveal.a.a(cVar, R, S, width);
                int i4 = (int) R;
                int i5 = (int) S;
                e0(view2, h4.c(), i4, i5, f6, list);
                d0(view2, h4.c(), h4.d(), eVar.f54533a.i(), i4, i5, width, list);
                animator = a5;
            }
            h4.a(animator);
            list.add(animator);
            list2.add(com.google.android.material.circularreveal.a.c(cVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void c0(View view, View view2, boolean z4, boolean z5, @o0 e eVar, @o0 List<Animator> list, @o0 List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofInt;
        if ((view2 instanceof com.google.android.material.circularreveal.c) && (view instanceof ImageView)) {
            com.google.android.material.circularreveal.c cVar = (com.google.android.material.circularreveal.c) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                return;
            }
            drawable.mutate();
            if (z4) {
                if (!z5) {
                    drawable.setAlpha(255);
                }
                ofInt = ObjectAnimator.ofInt(drawable, com.google.android.material.animation.e.f52473b, 0);
            } else {
                ofInt = ObjectAnimator.ofInt(drawable, com.google.android.material.animation.e.f52473b, 255);
            }
            ofInt.addUpdateListener(new b(view2));
            eVar.f54533a.h(ProtectedSandApp.s("\uf284")).a(ofInt);
            list.add(ofInt);
            list2.add(new c(cVar, drawable));
        }
    }

    private void d0(View view, long j4, long j5, long j6, int i4, int i5, float f4, @o0 List<Animator> list) {
        long j7 = j4 + j5;
        if (j7 < j6) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i4, i5, f4, f4);
            createCircularReveal.setStartDelay(j7);
            createCircularReveal.setDuration(j6 - j7);
            list.add(createCircularReveal);
        }
    }

    private void e0(View view, long j4, int i4, int i5, float f4, @o0 List<Animator> list) {
        if (j4 > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i4, i5, f4, f4);
            createCircularReveal.setStartDelay(0L);
            createCircularReveal.setDuration(j4);
            list.add(createCircularReveal);
        }
    }

    private void f0(@o0 View view, @o0 View view2, boolean z4, boolean z5, @o0 e eVar, @o0 List<Animator> list, List<Animator.AnimatorListener> list2, @o0 RectF rectF) {
        ObjectAnimator ofFloat;
        ObjectAnimator ofFloat2;
        float T = T(view, view2, eVar.f54534b);
        float U = U(view, view2, eVar.f54534b);
        Pair<i, i> Q = Q(T, U, z4, eVar);
        i iVar = (i) Q.first;
        i iVar2 = (i) Q.second;
        if (z4) {
            if (!z5) {
                view2.setTranslationX(-T);
                view2.setTranslationY(-U);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            O(view2, eVar, iVar, iVar2, -T, -U, 0.0f, 0.0f, rectF);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -T);
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -U);
        }
        iVar.a(ofFloat);
        iVar2.a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    private int g0(@o0 View view) {
        ColorStateList O = x1.O(view);
        if (O != null) {
            return O.getColorForState(view.getDrawableState(), O.getDefaultColor());
        }
        return 0;
    }

    @q0
    private ViewGroup i0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    @o0
    protected AnimatorSet M(@o0 View view, @o0 View view2, boolean z4, boolean z5) {
        e h02 = h0(view2.getContext(), z4);
        if (z4) {
            this.f54520j = view.getTranslationX();
            this.f54521k = view.getTranslationY();
        }
        List<Animator> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        a0(view, view2, z4, z5, h02, arrayList, arrayList2);
        RectF rectF = this.f54517g;
        f0(view, view2, z4, z5, h02, arrayList, arrayList2, rectF);
        float width = rectF.width();
        float height = rectF.height();
        Z(view, view2, z4, h02, arrayList);
        c0(view, view2, z4, z5, h02, arrayList, arrayList2);
        b0(view, view2, z4, z5, h02, width, height, arrayList, arrayList2);
        Y(view, view2, z4, z5, h02, arrayList, arrayList2);
        X(view, view2, z4, z5, h02, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        com.google.android.material.animation.b.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z4, view2, view));
        int size = arrayList2.size();
        for (int i4 = 0; i4 < size; i4++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i4));
        }
        return animatorSet;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @androidx.annotation.i
    public boolean f(@o0 CoordinatorLayout coordinatorLayout, @o0 View view, @o0 View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException(ProtectedSandApp.s("\uf285"));
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int f4 = ((FloatingActionButton) view2).f();
        return f4 == 0 || f4 == view.getId();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @androidx.annotation.i
    public void h(@o0 CoordinatorLayout.f fVar) {
        if (fVar.f25336h == 0) {
            fVar.f25336h = 80;
        }
    }

    protected abstract e h0(Context context, boolean z4);

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f54516f = new Rect();
        this.f54517g = new RectF();
        this.f54518h = new RectF();
        this.f54519i = new int[2];
    }
}
