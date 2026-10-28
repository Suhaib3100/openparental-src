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
import androidx.core.view.y1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.animation.h;
import com.google.android.material.animation.i;
import com.google.android.material.animation.j;
import com.google.android.material.circularreveal.c;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import n1.a;

@Deprecated
/* loaded from: classes4.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: f, reason: collision with root package name */
    private final Rect f14677f;

    /* renamed from: g, reason: collision with root package name */
    private final RectF f14678g;

    /* renamed from: h, reason: collision with root package name */
    private final RectF f14679h;

    /* renamed from: i, reason: collision with root package name */
    private final int[] f14680i;

    /* renamed from: j, reason: collision with root package name */
    private float f14681j;

    /* renamed from: k, reason: collision with root package name */
    private float f14682k;

    /* loaded from: classes2.dex */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f14683a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f14684b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f14685c;

        a(boolean z5, View view, View view2) {
            this.f14683a = z5;
            this.f14684b = view;
            this.f14685c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f14683a) {
                return;
            }
            this.f14684b.setVisibility(4);
            this.f14685c.setAlpha(1.0f);
            this.f14685c.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f14683a) {
                this.f14684b.setVisibility(0);
                this.f14685c.setAlpha(0.0f);
                this.f14685c.setVisibility(4);
            }
        }
    }

    /* loaded from: classes2.dex */
    class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f14687a;

        b(View view) {
            this.f14687a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f14687a.invalidate();
        }
    }

    /* loaded from: classes2.dex */
    class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.circularreveal.c f14689a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Drawable f14690b;

        c(com.google.android.material.circularreveal.c cVar, Drawable drawable) {
            this.f14689a = cVar;
            this.f14690b = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f14689a.e(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f14689a.e(this.f14690b);
        }
    }

    /* loaded from: classes2.dex */
    class d extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.circularreveal.c f14692a;

        d(com.google.android.material.circularreveal.c cVar) {
            this.f14692a = cVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            c.e a6 = this.f14692a.a();
            a6.f13283c = Float.MAX_VALUE;
            this.f14692a.c(a6);
        }
    }

    /* loaded from: classes2.dex */
    protected static class e {

        /* renamed from: a, reason: collision with root package name */
        @q0
        public h f14694a;

        /* renamed from: b, reason: collision with root package name */
        public j f14695b;

        protected e() {
        }
    }

    public FabTransformationBehavior() {
        this.f14677f = new Rect();
        this.f14678g = new RectF();
        this.f14679h = new RectF();
        this.f14680i = new int[2];
    }

    @q0
    private ViewGroup N(@o0 View view) {
        View findViewById = view.findViewById(a.h.f29689b3);
        return findViewById != null ? i0(findViewById) : ((view instanceof TransformationChildLayout) || (view instanceof TransformationChildCard)) ? i0(((ViewGroup) view).getChildAt(0)) : i0(view);
    }

    private void O(@o0 View view, @o0 e eVar, @o0 i iVar, @o0 i iVar2, float f6, float f7, float f8, float f9, @o0 RectF rectF) {
        float V = V(eVar, iVar, f6, f8);
        float V2 = V(eVar, iVar2, f7, f9);
        Rect rect = this.f14677f;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f14678g;
        rectF2.set(rect);
        RectF rectF3 = this.f14679h;
        W(view, rectF3);
        rectF3.offset(V, V2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    private void P(@o0 View view, @o0 RectF rectF) {
        W(view, rectF);
        rectF.offset(this.f14681j, this.f14682k);
    }

    @o0
    private Pair<i, i> Q(float f6, float f7, boolean z5, @o0 e eVar) {
        i h5;
        i h6;
        if (f6 == 0.0f || f7 == 0.0f) {
            h5 = eVar.f14694a.h(ProtectedSandApp.s("㍅"));
            h6 = eVar.f14694a.h(ProtectedSandApp.s("㍆"));
        } else if ((!z5 || f7 >= 0.0f) && (z5 || f7 <= 0.0f)) {
            h5 = eVar.f14694a.h(ProtectedSandApp.s("㍃"));
            h6 = eVar.f14694a.h(ProtectedSandApp.s("㍄"));
        } else {
            h5 = eVar.f14694a.h(ProtectedSandApp.s("㍁"));
            h6 = eVar.f14694a.h(ProtectedSandApp.s("㍂"));
        }
        return new Pair<>(h5, h6);
    }

    private float R(@o0 View view, @o0 View view2, @o0 j jVar) {
        RectF rectF = this.f14678g;
        RectF rectF2 = this.f14679h;
        P(view, rectF);
        W(view2, rectF2);
        rectF2.offset(-T(view, view2, jVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    private float S(@o0 View view, @o0 View view2, @o0 j jVar) {
        RectF rectF = this.f14678g;
        RectF rectF2 = this.f14679h;
        P(view, rectF);
        W(view2, rectF2);
        rectF2.offset(0.0f, -U(view, view2, jVar));
        return rectF.centerY() - rectF2.top;
    }

    private float T(@o0 View view, @o0 View view2, @o0 j jVar) {
        float centerX;
        float centerX2;
        float f6;
        RectF rectF = this.f14678g;
        RectF rectF2 = this.f14679h;
        P(view, rectF);
        W(view2, rectF2);
        int i5 = jVar.f12799a & 7;
        if (i5 == 1) {
            centerX = rectF2.centerX();
            centerX2 = rectF.centerX();
        } else if (i5 == 3) {
            centerX = rectF2.left;
            centerX2 = rectF.left;
        } else {
            if (i5 != 5) {
                f6 = 0.0f;
                return f6 + jVar.f12800b;
            }
            centerX = rectF2.right;
            centerX2 = rectF.right;
        }
        f6 = centerX - centerX2;
        return f6 + jVar.f12800b;
    }

    private float U(@o0 View view, @o0 View view2, @o0 j jVar) {
        float centerY;
        float centerY2;
        float f6;
        RectF rectF = this.f14678g;
        RectF rectF2 = this.f14679h;
        P(view, rectF);
        W(view2, rectF2);
        int i5 = jVar.f12799a & 112;
        if (i5 == 16) {
            centerY = rectF2.centerY();
            centerY2 = rectF.centerY();
        } else if (i5 == 48) {
            centerY = rectF2.top;
            centerY2 = rectF.top;
        } else {
            if (i5 != 80) {
                f6 = 0.0f;
                return f6 + jVar.f12801c;
            }
            centerY = rectF2.bottom;
            centerY2 = rectF.bottom;
        }
        f6 = centerY - centerY2;
        return f6 + jVar.f12801c;
    }

    private float V(@o0 e eVar, @o0 i iVar, float f6, float f7) {
        long c6 = iVar.c();
        long d6 = iVar.d();
        i h5 = eVar.f14694a.h(ProtectedSandApp.s("㍇"));
        return com.google.android.material.animation.a.a(f6, f7, iVar.e().getInterpolation((((h5.d() + h5.c()) + 17) - c6) / d6));
    }

    private void W(@o0 View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f14680i);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    private void X(View view, View view2, boolean z5, boolean z6, @o0 e eVar, @o0 List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup N;
        ObjectAnimator ofFloat;
        if (view2 instanceof ViewGroup) {
            if (((view2 instanceof com.google.android.material.circularreveal.c) && com.google.android.material.circularreveal.b.f13265o == 0) || (N = N(view2)) == null) {
                return;
            }
            if (z5) {
                if (!z6) {
                    com.google.android.material.animation.d.f12784a.set(N, Float.valueOf(0.0f));
                }
                ofFloat = ObjectAnimator.ofFloat(N, com.google.android.material.animation.d.f12784a, 1.0f);
            } else {
                ofFloat = ObjectAnimator.ofFloat(N, com.google.android.material.animation.d.f12784a, 0.0f);
            }
            eVar.f14694a.h(ProtectedSandApp.s("㍈")).a(ofFloat);
            list.add(ofFloat);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void Y(@o0 View view, View view2, boolean z5, boolean z6, @o0 e eVar, @o0 List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofInt;
        if (view2 instanceof com.google.android.material.circularreveal.c) {
            com.google.android.material.circularreveal.c cVar = (com.google.android.material.circularreveal.c) view2;
            int g02 = g0(view);
            int i5 = 16777215 & g02;
            if (z5) {
                if (!z6) {
                    cVar.j(g02);
                }
                ofInt = ObjectAnimator.ofInt(cVar, c.d.f13279a, i5);
            } else {
                ofInt = ObjectAnimator.ofInt(cVar, c.d.f13279a, g02);
            }
            ofInt.setEvaluator(com.google.android.material.animation.c.b());
            eVar.f14694a.h(ProtectedSandApp.s("㍉")).a(ofInt);
            list.add(ofInt);
        }
    }

    private void Z(@o0 View view, @o0 View view2, boolean z5, @o0 e eVar, @o0 List<Animator> list) {
        float T = T(view, view2, eVar.f14695b);
        float U = U(view, view2, eVar.f14695b);
        Pair<i, i> Q = Q(T, U, z5, eVar);
        i iVar = (i) Q.first;
        i iVar2 = (i) Q.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z5) {
            T = this.f14681j;
        }
        fArr[0] = T;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z5) {
            U = this.f14682k;
        }
        fArr2[0] = U;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fArr2);
        iVar.a(ofFloat);
        iVar2.a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    @TargetApi(21)
    private void a0(View view, @o0 View view2, boolean z5, boolean z6, @o0 e eVar, @o0 List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofFloat;
        float R = y1.R(view2) - y1.R(view);
        if (z5) {
            if (!z6) {
                view2.setTranslationZ(-R);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -R);
        }
        eVar.f14694a.h(ProtectedSandApp.s("㍊")).a(ofFloat);
        list.add(ofFloat);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void b0(@o0 View view, View view2, boolean z5, boolean z6, @o0 e eVar, float f6, float f7, @o0 List<Animator> list, @o0 List<Animator.AnimatorListener> list2) {
        Animator animator;
        if (view2 instanceof com.google.android.material.circularreveal.c) {
            com.google.android.material.circularreveal.c cVar = (com.google.android.material.circularreveal.c) view2;
            float R = R(view, view2, eVar.f14695b);
            float S = S(view, view2, eVar.f14695b);
            ((FloatingActionButton) view).C(this.f14677f);
            float width = this.f14677f.width() / 2.0f;
            i h5 = eVar.f14694a.h(ProtectedSandApp.s("㍋"));
            if (z5) {
                if (!z6) {
                    cVar.c(new c.e(R, S, width));
                }
                if (z6) {
                    width = cVar.a().f13283c;
                }
                animator = com.google.android.material.circularreveal.a.a(cVar, R, S, u1.a.b(R, S, 0.0f, 0.0f, f6, f7));
                animator.addListener(new d(cVar));
                e0(view2, h5.c(), (int) R, (int) S, width, list);
            } else {
                float f8 = cVar.a().f13283c;
                Animator a6 = com.google.android.material.circularreveal.a.a(cVar, R, S, width);
                int i5 = (int) R;
                int i6 = (int) S;
                e0(view2, h5.c(), i5, i6, f8, list);
                d0(view2, h5.c(), h5.d(), eVar.f14694a.i(), i5, i6, width, list);
                animator = a6;
            }
            h5.a(animator);
            list.add(animator);
            list2.add(com.google.android.material.circularreveal.a.c(cVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void c0(View view, View view2, boolean z5, boolean z6, @o0 e eVar, @o0 List<Animator> list, @o0 List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofInt;
        if ((view2 instanceof com.google.android.material.circularreveal.c) && (view instanceof ImageView)) {
            com.google.android.material.circularreveal.c cVar = (com.google.android.material.circularreveal.c) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                return;
            }
            drawable.mutate();
            if (z5) {
                if (!z6) {
                    drawable.setAlpha(255);
                }
                ofInt = ObjectAnimator.ofInt(drawable, com.google.android.material.animation.e.f12785b, 0);
            } else {
                ofInt = ObjectAnimator.ofInt(drawable, com.google.android.material.animation.e.f12785b, 255);
            }
            ofInt.addUpdateListener(new b(view2));
            eVar.f14694a.h(ProtectedSandApp.s("㍌")).a(ofInt);
            list.add(ofInt);
            list2.add(new c(cVar, drawable));
        }
    }

    private void d0(View view, long j5, long j6, long j7, int i5, int i6, float f6, @o0 List<Animator> list) {
        long j8 = j5 + j6;
        if (j8 < j7) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i5, i6, f6, f6);
            createCircularReveal.setStartDelay(j8);
            createCircularReveal.setDuration(j7 - j8);
            list.add(createCircularReveal);
        }
    }

    private void e0(View view, long j5, int i5, int i6, float f6, @o0 List<Animator> list) {
        if (j5 > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i5, i6, f6, f6);
            createCircularReveal.setStartDelay(0L);
            createCircularReveal.setDuration(j5);
            list.add(createCircularReveal);
        }
    }

    private void f0(@o0 View view, @o0 View view2, boolean z5, boolean z6, @o0 e eVar, @o0 List<Animator> list, List<Animator.AnimatorListener> list2, @o0 RectF rectF) {
        ObjectAnimator ofFloat;
        ObjectAnimator ofFloat2;
        float T = T(view, view2, eVar.f14695b);
        float U = U(view, view2, eVar.f14695b);
        Pair<i, i> Q = Q(T, U, z5, eVar);
        i iVar = (i) Q.first;
        i iVar2 = (i) Q.second;
        if (z5) {
            if (!z6) {
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
        ColorStateList N = y1.N(view);
        if (N != null) {
            return N.getColorForState(view.getDrawableState(), N.getDefaultColor());
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
    protected AnimatorSet M(@o0 View view, @o0 View view2, boolean z5, boolean z6) {
        e h02 = h0(view2.getContext(), z5);
        if (z5) {
            this.f14681j = view.getTranslationX();
            this.f14682k = view.getTranslationY();
        }
        List<Animator> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        a0(view, view2, z5, z6, h02, arrayList, arrayList2);
        RectF rectF = this.f14678g;
        f0(view, view2, z5, z6, h02, arrayList, arrayList2, rectF);
        float width = rectF.width();
        float height = rectF.height();
        Z(view, view2, z5, h02, arrayList);
        c0(view, view2, z5, z6, h02, arrayList, arrayList2);
        b0(view, view2, z5, z6, h02, width, height, arrayList, arrayList2);
        Y(view, view2, z5, z6, h02, arrayList, arrayList2);
        X(view, view2, z5, z6, h02, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        com.google.android.material.animation.b.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z5, view2, view));
        int size = arrayList2.size();
        for (int i5 = 0; i5 < size; i5++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i5));
        }
        return animatorSet;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @androidx.annotation.i
    public boolean f(@o0 CoordinatorLayout coordinatorLayout, @o0 View view, @o0 View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException(ProtectedSandApp.s("㍍"));
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int f6 = ((FloatingActionButton) view2).f();
        return f6 == 0 || f6 == view.getId();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @androidx.annotation.i
    public void h(@o0 CoordinatorLayout.f fVar) {
        if (fVar.f3934h == 0) {
            fVar.f3934h = 80;
        }
    }

    protected abstract e h0(Context context, boolean z5);

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14677f = new Rect();
        this.f14678g = new RectF();
        this.f14679h = new RectF();
        this.f14680i = new int[2];
    }
}
