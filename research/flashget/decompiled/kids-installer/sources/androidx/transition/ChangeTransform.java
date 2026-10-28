package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.y1;
import androidx.transition.s;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public class ChangeTransform extends Transition {

    /* renamed from: k0, reason: collision with root package name */
    boolean f9731k0;

    /* renamed from: l0, reason: collision with root package name */
    private boolean f9732l0;

    /* renamed from: m0, reason: collision with root package name */
    private Matrix f9733m0;

    /* renamed from: p0, reason: collision with root package name */
    private static final String f9723p0 = "android:changeTransform:parent";

    /* renamed from: o0, reason: collision with root package name */
    private static final String f9722o0 = "android:changeTransform:transforms";

    /* renamed from: n0, reason: collision with root package name */
    private static final String f9721n0 = "android:changeTransform:matrix";

    /* renamed from: s0, reason: collision with root package name */
    private static final String f9726s0 = "android:changeTransform:intermediateMatrix";

    /* renamed from: r0, reason: collision with root package name */
    private static final String f9725r0 = "android:changeTransform:intermediateParentMatrix";

    /* renamed from: q0, reason: collision with root package name */
    private static final String f9724q0 = "android:changeTransform:parentMatrix";

    /* renamed from: t0, reason: collision with root package name */
    private static final String[] f9727t0 = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};

    /* renamed from: u0, reason: collision with root package name */
    private static final Property<e, float[]> f9728u0 = new a(float[].class, "nonTranslations");

    /* renamed from: v0, reason: collision with root package name */
    private static final Property<e, PointF> f9729v0 = new b(PointF.class, "translations");

    /* renamed from: w0, reason: collision with root package name */
    private static final boolean f9730w0 = true;

    /* loaded from: classes.dex */
    static class a extends Property<e, float[]> {
        a(Class cls, String str) {
            super(cls, str);
        }

        public float[] a(e eVar) {
            return null;
        }

        public void b(e eVar, float[] fArr) {
            eVar.d(fArr);
        }

        @Override // android.util.Property
        public float[] get(e eVar) {
            return null;
        }

        @Override // android.util.Property
        public void set(e eVar, float[] fArr) {
            eVar.d(fArr);
        }
    }

    /* loaded from: classes.dex */
    static class b extends Property<e, PointF> {
        b(Class cls, String str) {
            super(cls, str);
        }

        public PointF a(e eVar) {
            return null;
        }

        public void b(e eVar, PointF pointF) {
            eVar.c(pointF);
        }

        @Override // android.util.Property
        public PointF get(e eVar) {
            return null;
        }

        @Override // android.util.Property
        public void set(e eVar, PointF pointF) {
            eVar.c(pointF);
        }
    }

    /* loaded from: classes.dex */
    class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private boolean f9734a;

        /* renamed from: b, reason: collision with root package name */
        private Matrix f9735b = new Matrix();

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f9736c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Matrix f9737d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ View f9738e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ f f9739f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ e f9740g;

        c(boolean z5, Matrix matrix, View view, f fVar, e eVar) {
            this.f9736c = z5;
            this.f9737d = matrix;
            this.f9738e = view;
            this.f9739f = fVar;
            this.f9740g = eVar;
        }

        private void a(Matrix matrix) {
            this.f9735b.set(matrix);
            this.f9738e.setTag(s.e.L, this.f9735b);
            this.f9739f.a(this.f9738e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f9734a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f9734a) {
                if (this.f9736c && ChangeTransform.this.f9731k0) {
                    a(this.f9737d);
                } else {
                    this.f9738e.setTag(s.e.L, null);
                    this.f9738e.setTag(s.e.f10024v, null);
                }
            }
            q0.f(this.f9738e, null);
            this.f9739f.a(this.f9738e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            a(this.f9740g.a());
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            ChangeTransform.W0(this.f9738e);
        }
    }

    private static class d extends y {

        /* renamed from: a, reason: collision with root package name */
        private View f9742a;

        /* renamed from: b, reason: collision with root package name */
        private h f9743b;

        d(View view, h hVar) {
            this.f9742a = view;
            this.f9743b = hVar;
        }

        @Override // androidx.transition.y, androidx.transition.Transition.h
        public void b(@androidx.annotation.o0 Transition transition) {
            this.f9743b.setVisibility(4);
        }

        @Override // androidx.transition.y, androidx.transition.Transition.h
        public void c(@androidx.annotation.o0 Transition transition) {
            transition.u0(this);
            l.b(this.f9742a);
            this.f9742a.setTag(s.e.L, null);
            this.f9742a.setTag(s.e.f10024v, null);
        }

        @Override // androidx.transition.y, androidx.transition.Transition.h
        public void e(@androidx.annotation.o0 Transition transition) {
            this.f9743b.setVisibility(0);
        }
    }

    /* loaded from: classes.dex */
    private static class e {

        /* renamed from: a, reason: collision with root package name */
        private final Matrix f9744a = new Matrix();

        /* renamed from: b, reason: collision with root package name */
        private final View f9745b;

        /* renamed from: c, reason: collision with root package name */
        private final float[] f9746c;

        /* renamed from: d, reason: collision with root package name */
        private float f9747d;

        /* renamed from: e, reason: collision with root package name */
        private float f9748e;

        e(View view, float[] fArr) {
            this.f9745b = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.f9746c = fArr2;
            this.f9747d = fArr2[2];
            this.f9748e = fArr2[5];
            b();
        }

        private void b() {
            float[] fArr = this.f9746c;
            fArr[2] = this.f9747d;
            fArr[5] = this.f9748e;
            this.f9744a.setValues(fArr);
            q0.f(this.f9745b, this.f9744a);
        }

        Matrix a() {
            return this.f9744a;
        }

        void c(PointF pointF) {
            this.f9747d = pointF.x;
            this.f9748e = pointF.y;
            b();
        }

        void d(float[] fArr) {
            System.arraycopy(fArr, 0, this.f9746c, 0, fArr.length);
            b();
        }
    }

    /* loaded from: classes.dex */
    private static class f {

        /* renamed from: a, reason: collision with root package name */
        final float f9749a;

        /* renamed from: b, reason: collision with root package name */
        final float f9750b;

        /* renamed from: c, reason: collision with root package name */
        final float f9751c;

        /* renamed from: d, reason: collision with root package name */
        final float f9752d;

        /* renamed from: e, reason: collision with root package name */
        final float f9753e;

        /* renamed from: f, reason: collision with root package name */
        final float f9754f;

        /* renamed from: g, reason: collision with root package name */
        final float f9755g;

        /* renamed from: h, reason: collision with root package name */
        final float f9756h;

        f(View view) {
            this.f9749a = view.getTranslationX();
            this.f9750b = view.getTranslationY();
            this.f9751c = y1.A0(view);
            this.f9752d = view.getScaleX();
            this.f9753e = view.getScaleY();
            this.f9754f = view.getRotationX();
            this.f9755g = view.getRotationY();
            this.f9756h = view.getRotation();
        }

        public void a(View view) {
            ChangeTransform.a1(view, this.f9749a, this.f9750b, this.f9751c, this.f9752d, this.f9753e, this.f9754f, this.f9755g, this.f9756h);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return fVar.f9749a == this.f9749a && fVar.f9750b == this.f9750b && fVar.f9751c == this.f9751c && fVar.f9752d == this.f9752d && fVar.f9753e == this.f9753e && fVar.f9754f == this.f9754f && fVar.f9755g == this.f9755g && fVar.f9756h == this.f9756h;
        }

        public int hashCode() {
            float f6 = this.f9749a;
            int floatToIntBits = (f6 != 0.0f ? Float.floatToIntBits(f6) : 0) * 31;
            float f7 = this.f9750b;
            int floatToIntBits2 = (floatToIntBits + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0)) * 31;
            float f8 = this.f9751c;
            int floatToIntBits3 = (floatToIntBits2 + (f8 != 0.0f ? Float.floatToIntBits(f8) : 0)) * 31;
            float f9 = this.f9752d;
            int floatToIntBits4 = (floatToIntBits3 + (f9 != 0.0f ? Float.floatToIntBits(f9) : 0)) * 31;
            float f10 = this.f9753e;
            int floatToIntBits5 = (floatToIntBits4 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
            float f11 = this.f9754f;
            int floatToIntBits6 = (floatToIntBits5 + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0)) * 31;
            float f12 = this.f9755g;
            int floatToIntBits7 = (floatToIntBits6 + (f12 != 0.0f ? Float.floatToIntBits(f12) : 0)) * 31;
            float f13 = this.f9756h;
            return floatToIntBits7 + (f13 != 0.0f ? Float.floatToIntBits(f13) : 0);
        }
    }

    public ChangeTransform() {
        this.f9731k0 = true;
        this.f9732l0 = true;
        this.f9733m0 = new Matrix();
    }

    private void P0(d0 d0Var) {
        View view = d0Var.f9860b;
        if (view.getVisibility() == 8) {
            return;
        }
        d0Var.f9859a.put("android:changeTransform:parent", view.getParent());
        d0Var.f9859a.put("android:changeTransform:transforms", new f(view));
        Matrix matrix = view.getMatrix();
        d0Var.f9859a.put("android:changeTransform:matrix", (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
        if (this.f9732l0) {
            Matrix matrix2 = new Matrix();
            q0.j((ViewGroup) view.getParent(), matrix2);
            matrix2.preTranslate(-r2.getScrollX(), -r2.getScrollY());
            d0Var.f9859a.put("android:changeTransform:parentMatrix", matrix2);
            d0Var.f9859a.put("android:changeTransform:intermediateMatrix", view.getTag(s.e.L));
            d0Var.f9859a.put("android:changeTransform:intermediateParentMatrix", view.getTag(s.e.f10024v));
        }
    }

    private void Q0(ViewGroup viewGroup, d0 d0Var, d0 d0Var2) {
        View view = d0Var2.f9860b;
        Matrix matrix = new Matrix((Matrix) d0Var2.f9859a.get("android:changeTransform:parentMatrix"));
        q0.k(viewGroup, matrix);
        h a6 = l.a(view, viewGroup, matrix);
        if (a6 == null) {
            return;
        }
        a6.a((ViewGroup) d0Var.f9859a.get("android:changeTransform:parent"), d0Var.f9860b);
        Transition transition = this;
        while (true) {
            Transition transition2 = transition.F;
            if (transition2 == null) {
                break;
            } else {
                transition = transition2;
            }
        }
        transition.a(new d(view, a6));
        if (f9730w0) {
            View view2 = d0Var.f9860b;
            if (view2 != d0Var2.f9860b) {
                q0.h(view2, 0.0f);
            }
            q0.h(view, 1.0f);
        }
    }

    private ObjectAnimator R0(d0 d0Var, d0 d0Var2, boolean z5) {
        Matrix matrix = (Matrix) d0Var.f9859a.get("android:changeTransform:matrix");
        Matrix matrix2 = (Matrix) d0Var2.f9859a.get("android:changeTransform:matrix");
        if (matrix == null) {
            matrix = o.f9941a;
        }
        if (matrix2 == null) {
            matrix2 = o.f9941a;
        }
        Matrix matrix3 = matrix2;
        if (matrix.equals(matrix3)) {
            return null;
        }
        f fVar = (f) d0Var2.f9859a.get("android:changeTransform:transforms");
        View view = d0Var2.f9860b;
        W0(view);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = new float[9];
        matrix3.getValues(fArr2);
        e eVar = new e(view, fArr);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(eVar, PropertyValuesHolder.ofObject(f9728u0, new androidx.transition.f(new float[9]), fArr, fArr2), PropertyValuesHolder.ofObject(f9729v0, (TypeConverter) null, T().a(fArr[2], fArr[5], fArr2[2], fArr2[5])));
        c cVar = new c(z5, matrix3, view, fVar, eVar);
        ofPropertyValuesHolder.addListener(cVar);
        ofPropertyValuesHolder.addPauseListener(cVar);
        return ofPropertyValuesHolder;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001a, code lost:
    
        if (r4 == r5) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r5 == r4.f9860b) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        r1 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean V0(android.view.ViewGroup r4, android.view.ViewGroup r5) {
        /*
            r3 = this;
            boolean r0 = r3.j0(r4)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1a
            boolean r0 = r3.j0(r5)
            if (r0 != 0) goto Lf
            goto L1a
        Lf:
            androidx.transition.d0 r4 = r3.Q(r4, r1)
            if (r4 == 0) goto L1f
            android.view.View r4 = r4.f9860b
            if (r5 != r4) goto L1d
            goto L1e
        L1a:
            if (r4 != r5) goto L1d
            goto L1e
        L1d:
            r1 = r2
        L1e:
            r2 = r1
        L1f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.ChangeTransform.V0(android.view.ViewGroup, android.view.ViewGroup):boolean");
    }

    static void W0(View view) {
        a1(view, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f);
    }

    private void X0(d0 d0Var, d0 d0Var2) {
        Matrix matrix = (Matrix) d0Var2.f9859a.get("android:changeTransform:parentMatrix");
        d0Var2.f9860b.setTag(s.e.f10024v, matrix);
        Matrix matrix2 = this.f9733m0;
        matrix2.reset();
        matrix.invert(matrix2);
        Matrix matrix3 = (Matrix) d0Var.f9859a.get("android:changeTransform:matrix");
        if (matrix3 == null) {
            matrix3 = new Matrix();
            d0Var.f9859a.put("android:changeTransform:matrix", matrix3);
        }
        matrix3.postConcat((Matrix) d0Var.f9859a.get("android:changeTransform:parentMatrix"));
        matrix3.postConcat(matrix2);
    }

    static void a1(View view, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13) {
        view.setTranslationX(f6);
        view.setTranslationY(f7);
        y1.w2(view, f8);
        view.setScaleX(f9);
        view.setScaleY(f10);
        view.setRotationX(f11);
        view.setRotationY(f12);
        view.setRotation(f13);
    }

    public boolean S0() {
        return this.f9732l0;
    }

    public boolean U0() {
        return this.f9731k0;
    }

    public void Y0(boolean z5) {
        this.f9732l0 = z5;
    }

    public void Z0(boolean z5) {
        this.f9731k0 = z5;
    }

    @Override // androidx.transition.Transition
    public String[] e0() {
        return f9727t0;
    }

    @Override // androidx.transition.Transition
    public void l(@androidx.annotation.o0 d0 d0Var) {
        P0(d0Var);
    }

    @Override // androidx.transition.Transition
    public void o(@androidx.annotation.o0 d0 d0Var) {
        P0(d0Var);
        if (f9730w0) {
            return;
        }
        ((ViewGroup) d0Var.f9860b.getParent()).startViewTransition(d0Var.f9860b);
    }

    @Override // androidx.transition.Transition
    public Animator u(@androidx.annotation.o0 ViewGroup viewGroup, d0 d0Var, d0 d0Var2) {
        if (d0Var == null || d0Var2 == null || !d0Var.f9859a.containsKey("android:changeTransform:parent") || !d0Var2.f9859a.containsKey("android:changeTransform:parent")) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) d0Var.f9859a.get("android:changeTransform:parent");
        boolean z5 = this.f9732l0 && !V0(viewGroup2, (ViewGroup) d0Var2.f9859a.get("android:changeTransform:parent"));
        Matrix matrix = (Matrix) d0Var.f9859a.get("android:changeTransform:intermediateMatrix");
        if (matrix != null) {
            d0Var.f9859a.put("android:changeTransform:matrix", matrix);
        }
        Matrix matrix2 = (Matrix) d0Var.f9859a.get("android:changeTransform:intermediateParentMatrix");
        if (matrix2 != null) {
            d0Var.f9859a.put("android:changeTransform:parentMatrix", matrix2);
        }
        if (z5) {
            X0(d0Var, d0Var2);
        }
        ObjectAnimator R0 = R0(d0Var, d0Var2, z5);
        if (z5 && R0 != null && this.f9731k0) {
            Q0(viewGroup, d0Var, d0Var2);
        } else if (!f9730w0) {
            viewGroup2.endViewTransition(d0Var.f9860b);
        }
        return R0;
    }

    @SuppressLint({"RestrictedApi"})
    public ChangeTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9731k0 = true;
        this.f9732l0 = true;
        this.f9733m0 = new Matrix();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w.f10086g);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.f9731k0 = androidx.core.content.res.p.e(obtainStyledAttributes, xmlPullParser, "reparentWithOverlay", 1, true);
        this.f9732l0 = androidx.core.content.res.p.e(obtainStyledAttributes, xmlPullParser, "reparent", 0, true);
        obtainStyledAttributes.recycle();
    }
}
