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
import androidx.core.view.x1;
import androidx.transition.q;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public class ChangeTransform extends Transition {
    private boolean L2;
    private Matrix M2;
    boolean V1;
    private static final String R2 = "android:changeTransform:intermediateParentMatrix";
    private static final String Q2 = "android:changeTransform:parentMatrix";
    private static final String P2 = "android:changeTransform:parent";
    private static final String O2 = "android:changeTransform:transforms";
    private static final String N2 = "android:changeTransform:matrix";
    private static final String S2 = "android:changeTransform:intermediateMatrix";
    private static final String[] T2 = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};
    private static final Property<e, float[]> U2 = new a(float[].class, "nonTranslations");
    private static final Property<e, PointF> V2 = new b(PointF.class, "translations");
    private static final boolean W2 = true;

    class a extends Property<e, float[]> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public float[] get(e eVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(e eVar, float[] fArr) {
            eVar.d(fArr);
        }
    }

    class b extends Property<e, PointF> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(e eVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(e eVar, PointF pointF) {
            eVar.c(pointF);
        }
    }

    class c extends AnimatorListenerAdapter {

        /* renamed from: b, reason: collision with root package name */
        private boolean f34262b;

        /* renamed from: c, reason: collision with root package name */
        private Matrix f34263c = new Matrix();

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f34264d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Matrix f34265e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ View f34266f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ f f34267g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ e f34268h;

        c(boolean z4, Matrix matrix, View view, f fVar, e eVar) {
            this.f34264d = z4;
            this.f34265e = matrix;
            this.f34266f = view;
            this.f34267g = fVar;
            this.f34268h = eVar;
        }

        private void a(Matrix matrix) {
            this.f34263c.set(matrix);
            this.f34266f.setTag(q.g.V1, this.f34263c);
            this.f34267g.a(this.f34266f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f34262b = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f34262b) {
                if (this.f34264d && ChangeTransform.this.V1) {
                    a(this.f34265e);
                } else {
                    this.f34266f.setTag(q.g.V1, null);
                    this.f34266f.setTag(q.g.R0, null);
                }
            }
            o0.f(this.f34266f, null);
            this.f34267g.a(this.f34266f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            a(this.f34268h.a());
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            ChangeTransform.R0(this.f34266f);
        }
    }

    private static class d extends w {

        /* renamed from: b, reason: collision with root package name */
        private View f34270b;

        /* renamed from: c, reason: collision with root package name */
        private androidx.transition.f f34271c;

        d(View view, androidx.transition.f fVar) {
            this.f34270b = view;
            this.f34271c = fVar;
        }

        @Override // androidx.transition.w, androidx.transition.Transition.h
        public void a(@androidx.annotation.o0 Transition transition) {
            this.f34271c.setVisibility(0);
        }

        @Override // androidx.transition.w, androidx.transition.Transition.h
        public void c(@androidx.annotation.o0 Transition transition) {
            this.f34271c.setVisibility(4);
        }

        @Override // androidx.transition.w, androidx.transition.Transition.h
        public void d(@androidx.annotation.o0 Transition transition) {
            transition.q0(this);
            j.b(this.f34270b);
            this.f34270b.setTag(q.g.V1, null);
            this.f34270b.setTag(q.g.R0, null);
        }
    }

    private static class e {

        /* renamed from: a, reason: collision with root package name */
        private final Matrix f34272a = new Matrix();

        /* renamed from: b, reason: collision with root package name */
        private final View f34273b;

        /* renamed from: c, reason: collision with root package name */
        private final float[] f34274c;

        /* renamed from: d, reason: collision with root package name */
        private float f34275d;

        /* renamed from: e, reason: collision with root package name */
        private float f34276e;

        e(View view, float[] fArr) {
            this.f34273b = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.f34274c = fArr2;
            this.f34275d = fArr2[2];
            this.f34276e = fArr2[5];
            b();
        }

        private void b() {
            float[] fArr = this.f34274c;
            fArr[2] = this.f34275d;
            fArr[5] = this.f34276e;
            this.f34272a.setValues(fArr);
            o0.f(this.f34273b, this.f34272a);
        }

        Matrix a() {
            return this.f34272a;
        }

        void c(PointF pointF) {
            this.f34275d = pointF.x;
            this.f34276e = pointF.y;
            b();
        }

        void d(float[] fArr) {
            System.arraycopy(fArr, 0, this.f34274c, 0, fArr.length);
            b();
        }
    }

    private static class f {

        /* renamed from: a, reason: collision with root package name */
        final float f34277a;

        /* renamed from: b, reason: collision with root package name */
        final float f34278b;

        /* renamed from: c, reason: collision with root package name */
        final float f34279c;

        /* renamed from: d, reason: collision with root package name */
        final float f34280d;

        /* renamed from: e, reason: collision with root package name */
        final float f34281e;

        /* renamed from: f, reason: collision with root package name */
        final float f34282f;

        /* renamed from: g, reason: collision with root package name */
        final float f34283g;

        /* renamed from: h, reason: collision with root package name */
        final float f34284h;

        f(View view) {
            this.f34277a = view.getTranslationX();
            this.f34278b = view.getTranslationY();
            this.f34279c = x1.D0(view);
            this.f34280d = view.getScaleX();
            this.f34281e = view.getScaleY();
            this.f34282f = view.getRotationX();
            this.f34283g = view.getRotationY();
            this.f34284h = view.getRotation();
        }

        public void a(View view) {
            ChangeTransform.V0(view, this.f34277a, this.f34278b, this.f34279c, this.f34280d, this.f34281e, this.f34282f, this.f34283g, this.f34284h);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return fVar.f34277a == this.f34277a && fVar.f34278b == this.f34278b && fVar.f34279c == this.f34279c && fVar.f34280d == this.f34280d && fVar.f34281e == this.f34281e && fVar.f34282f == this.f34282f && fVar.f34283g == this.f34283g && fVar.f34284h == this.f34284h;
        }

        public int hashCode() {
            float f4 = this.f34277a;
            int floatToIntBits = (f4 != 0.0f ? Float.floatToIntBits(f4) : 0) * 31;
            float f5 = this.f34278b;
            int floatToIntBits2 = (floatToIntBits + (f5 != 0.0f ? Float.floatToIntBits(f5) : 0)) * 31;
            float f6 = this.f34279c;
            int floatToIntBits3 = (floatToIntBits2 + (f6 != 0.0f ? Float.floatToIntBits(f6) : 0)) * 31;
            float f7 = this.f34280d;
            int floatToIntBits4 = (floatToIntBits3 + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0)) * 31;
            float f10 = this.f34281e;
            int floatToIntBits5 = (floatToIntBits4 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
            float f11 = this.f34282f;
            int floatToIntBits6 = (floatToIntBits5 + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0)) * 31;
            float f12 = this.f34283g;
            int floatToIntBits7 = (floatToIntBits6 + (f12 != 0.0f ? Float.floatToIntBits(f12) : 0)) * 31;
            float f13 = this.f34284h;
            return floatToIntBits7 + (f13 != 0.0f ? Float.floatToIntBits(f13) : 0);
        }
    }

    public ChangeTransform() {
        this.V1 = true;
        this.L2 = true;
        this.M2 = new Matrix();
    }

    private void J0(b0 b0Var) {
        View view = b0Var.f34364b;
        if (view.getVisibility() == 8) {
            return;
        }
        b0Var.f34363a.put("android:changeTransform:parent", view.getParent());
        b0Var.f34363a.put("android:changeTransform:transforms", new f(view));
        Matrix matrix = view.getMatrix();
        b0Var.f34363a.put("android:changeTransform:matrix", (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
        if (this.L2) {
            Matrix matrix2 = new Matrix();
            o0.j((ViewGroup) view.getParent(), matrix2);
            matrix2.preTranslate(-r2.getScrollX(), -r2.getScrollY());
            b0Var.f34363a.put("android:changeTransform:parentMatrix", matrix2);
            b0Var.f34363a.put("android:changeTransform:intermediateMatrix", view.getTag(q.g.V1));
            b0Var.f34363a.put("android:changeTransform:intermediateParentMatrix", view.getTag(q.g.R0));
        }
    }

    private void L0(ViewGroup viewGroup, b0 b0Var, b0 b0Var2) {
        View view = b0Var2.f34364b;
        Matrix matrix = new Matrix((Matrix) b0Var2.f34363a.get("android:changeTransform:parentMatrix"));
        o0.k(viewGroup, matrix);
        androidx.transition.f a5 = j.a(view, viewGroup, matrix);
        if (a5 == null) {
            return;
        }
        a5.a((ViewGroup) b0Var.f34363a.get("android:changeTransform:parent"), b0Var.f34364b);
        Transition transition = this;
        while (true) {
            Transition transition2 = transition.f34311s;
            if (transition2 == null) {
                break;
            } else {
                transition = transition2;
            }
        }
        transition.b(new d(view, a5));
        if (W2) {
            View view2 = b0Var.f34364b;
            if (view2 != b0Var2.f34364b) {
                o0.h(view2, 0.0f);
            }
            o0.h(view, 1.0f);
        }
    }

    private ObjectAnimator M0(b0 b0Var, b0 b0Var2, boolean z4) {
        Matrix matrix = (Matrix) b0Var.f34363a.get("android:changeTransform:matrix");
        Matrix matrix2 = (Matrix) b0Var2.f34363a.get("android:changeTransform:matrix");
        if (matrix == null) {
            matrix = m.f34442a;
        }
        if (matrix2 == null) {
            matrix2 = m.f34442a;
        }
        Matrix matrix3 = matrix2;
        if (matrix.equals(matrix3)) {
            return null;
        }
        f fVar = (f) b0Var2.f34363a.get("android:changeTransform:transforms");
        View view = b0Var2.f34364b;
        R0(view);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = new float[9];
        matrix3.getValues(fArr2);
        e eVar = new e(view, fArr);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(eVar, PropertyValuesHolder.ofObject(U2, new androidx.transition.d(new float[9]), fArr, fArr2), PropertyValuesHolder.ofObject(V2, (TypeConverter) null, R().a(fArr[2], fArr[5], fArr2[2], fArr2[5])));
        c cVar = new c(z4, matrix3, view, fVar, eVar);
        ofPropertyValuesHolder.addListener(cVar);
        ofPropertyValuesHolder.addPauseListener(cVar);
        return ofPropertyValuesHolder;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001d, code lost:
    
        if (r4 == r5) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r5 == r4.f34364b) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        r1 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean Q0(android.view.ViewGroup r4, android.view.ViewGroup r5) {
        /*
            r3 = this;
            boolean r0 = r3.e0(r4)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1d
            boolean r0 = r3.e0(r5)
            if (r0 != 0) goto Lf
            goto L1d
        Lf:
            androidx.transition.b0 r4 = r3.O(r4, r1)
            if (r4 == 0) goto L20
            android.view.View r4 = r4.f34364b
            if (r5 != r4) goto L1a
            goto L1b
        L1a:
            r1 = r2
        L1b:
            r2 = r1
            goto L20
        L1d:
            if (r4 != r5) goto L1a
            goto L1b
        L20:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.ChangeTransform.Q0(android.view.ViewGroup, android.view.ViewGroup):boolean");
    }

    static void R0(View view) {
        V0(view, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f);
    }

    private void S0(b0 b0Var, b0 b0Var2) {
        Matrix matrix = (Matrix) b0Var2.f34363a.get("android:changeTransform:parentMatrix");
        b0Var2.f34364b.setTag(q.g.R0, matrix);
        Matrix matrix2 = this.M2;
        matrix2.reset();
        matrix.invert(matrix2);
        Matrix matrix3 = (Matrix) b0Var.f34363a.get("android:changeTransform:matrix");
        if (matrix3 == null) {
            matrix3 = new Matrix();
            b0Var.f34363a.put("android:changeTransform:matrix", matrix3);
        }
        matrix3.postConcat((Matrix) b0Var.f34363a.get("android:changeTransform:parentMatrix"));
        matrix3.postConcat(matrix2);
    }

    static void V0(View view, float f4, float f5, float f6, float f7, float f10, float f11, float f12, float f13) {
        view.setTranslationX(f4);
        view.setTranslationY(f5);
        x1.G2(view, f6);
        view.setScaleX(f7);
        view.setScaleY(f10);
        view.setRotationX(f11);
        view.setRotationY(f12);
        view.setRotation(f13);
    }

    public boolean N0() {
        return this.L2;
    }

    public boolean P0() {
        return this.V1;
    }

    public void T0(boolean z4) {
        this.L2 = z4;
    }

    public void U0(boolean z4) {
        this.V1 = z4;
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.o0
    public String[] a0() {
        return T2;
    }

    @Override // androidx.transition.Transition
    public void m(@androidx.annotation.o0 b0 b0Var) {
        J0(b0Var);
    }

    @Override // androidx.transition.Transition
    public void p(@androidx.annotation.o0 b0 b0Var) {
        J0(b0Var);
        if (W2) {
            return;
        }
        ((ViewGroup) b0Var.f34364b.getParent()).startViewTransition(b0Var.f34364b);
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.q0
    public Animator t(@androidx.annotation.o0 ViewGroup viewGroup, @androidx.annotation.q0 b0 b0Var, @androidx.annotation.q0 b0 b0Var2) {
        if (b0Var == null || b0Var2 == null || !b0Var.f34363a.containsKey("android:changeTransform:parent") || !b0Var2.f34363a.containsKey("android:changeTransform:parent")) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) b0Var.f34363a.get("android:changeTransform:parent");
        boolean z4 = this.L2 && !Q0(viewGroup2, (ViewGroup) b0Var2.f34363a.get("android:changeTransform:parent"));
        Matrix matrix = (Matrix) b0Var.f34363a.get("android:changeTransform:intermediateMatrix");
        if (matrix != null) {
            b0Var.f34363a.put("android:changeTransform:matrix", matrix);
        }
        Matrix matrix2 = (Matrix) b0Var.f34363a.get("android:changeTransform:intermediateParentMatrix");
        if (matrix2 != null) {
            b0Var.f34363a.put("android:changeTransform:parentMatrix", matrix2);
        }
        if (z4) {
            S0(b0Var, b0Var2);
        }
        ObjectAnimator M0 = M0(b0Var, b0Var2, z4);
        if (z4 && M0 != null && this.V1) {
            L0(viewGroup, b0Var, b0Var2);
        } else if (!W2) {
            viewGroup2.endViewTransition(b0Var.f34364b);
        }
        return M0;
    }

    @SuppressLint({"RestrictedApi"})
    public ChangeTransform(@androidx.annotation.o0 Context context, @androidx.annotation.o0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.V1 = true;
        this.L2 = true;
        this.M2 = new Matrix();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u.f35211g);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.V1 = androidx.core.content.res.n.e(obtainStyledAttributes, xmlPullParser, "reparentWithOverlay", 1, true);
        this.L2 = androidx.core.content.res.n.e(obtainStyledAttributes, xmlPullParser, "reparent", 0, true);
        obtainStyledAttributes.recycle();
    }
}
