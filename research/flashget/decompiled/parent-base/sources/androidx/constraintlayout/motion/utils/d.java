package androidx.constraintlayout.motion.utils;

import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.p;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ViewSpline.java */
/* loaded from: classes.dex */
public abstract class d extends p {

    /* renamed from: g, reason: collision with root package name */
    private static final String f23145g = "ViewSpline";

    /* compiled from: ViewSpline.java */
    static class a extends d {
        a() {
        }

        @Override // androidx.constraintlayout.motion.utils.d
        public void m(View view, float t4) {
            view.setAlpha(a(t4));
        }
    }

    /* compiled from: ViewSpline.java */
    public static class b extends d {

        /* renamed from: h, reason: collision with root package name */
        String f23146h;

        /* renamed from: i, reason: collision with root package name */
        SparseArray<androidx.constraintlayout.widget.a> f23147i;

        /* renamed from: j, reason: collision with root package name */
        float[] f23148j;

        public b(String attribute, SparseArray<androidx.constraintlayout.widget.a> attrList) {
            this.f23146h = attribute.split(",")[1];
            this.f23147i = attrList;
        }

        @Override // androidx.constraintlayout.core.motion.utils.p
        public void g(int position, float value) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // androidx.constraintlayout.core.motion.utils.p
        public void j(int curveType) {
            int size = this.f23147i.size();
            int p4 = this.f23147i.valueAt(0).p();
            double[] dArr = new double[size];
            this.f23148j = new float[p4];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, p4);
            for (int i4 = 0; i4 < size; i4++) {
                int keyAt = this.f23147i.keyAt(i4);
                androidx.constraintlayout.widget.a valueAt = this.f23147i.valueAt(i4);
                dArr[i4] = keyAt * 0.01d;
                valueAt.l(this.f23148j);
                int i5 = 0;
                while (true) {
                    if (i5 < this.f23148j.length) {
                        dArr2[i4][i5] = r6[i5];
                        i5++;
                    }
                }
            }
            this.f22312a = androidx.constraintlayout.core.motion.utils.c.a(curveType, dArr, dArr2);
        }

        @Override // androidx.constraintlayout.motion.utils.d
        public void m(View view, float t4) {
            this.f22312a.e(t4, this.f23148j);
            androidx.constraintlayout.motion.utils.a.b(this.f23147i.valueAt(0), view, this.f23148j);
        }

        public void n(int position, androidx.constraintlayout.widget.a value) {
            this.f23147i.append(position, value);
        }
    }

    /* compiled from: ViewSpline.java */
    static class c extends d {
        c() {
        }

        @Override // androidx.constraintlayout.motion.utils.d
        public void m(View view, float t4) {
            view.setElevation(a(t4));
        }
    }

    /* compiled from: ViewSpline.java */
    /* renamed from: androidx.constraintlayout.motion.utils.d$d, reason: collision with other inner class name */
    public static class C0393d extends d {
        @Override // androidx.constraintlayout.motion.utils.d
        public void m(View view, float t4) {
        }

        public void n(View view, float t4, double dx, double dy) {
            view.setRotation(a(t4) + ((float) Math.toDegrees(Math.atan2(dy, dx))));
        }
    }

    /* compiled from: ViewSpline.java */
    static class e extends d {
        e() {
        }

        @Override // androidx.constraintlayout.motion.utils.d
        public void m(View view, float t4) {
            view.setPivotX(a(t4));
        }
    }

    /* compiled from: ViewSpline.java */
    static class f extends d {
        f() {
        }

        @Override // androidx.constraintlayout.motion.utils.d
        public void m(View view, float t4) {
            view.setPivotY(a(t4));
        }
    }

    /* compiled from: ViewSpline.java */
    static class g extends d {

        /* renamed from: h, reason: collision with root package name */
        boolean f23149h = false;

        g() {
        }

        @Override // androidx.constraintlayout.motion.utils.d
        public void m(View view, float t4) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).F1(a(t4));
                return;
            }
            if (this.f23149h) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f23149h = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(a(t4)));
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            }
        }
    }

    /* compiled from: ViewSpline.java */
    static class h extends d {
        h() {
        }

        @Override // androidx.constraintlayout.motion.utils.d
        public void m(View view, float t4) {
            view.setRotation(a(t4));
        }
    }

    /* compiled from: ViewSpline.java */
    static class i extends d {
        i() {
        }

        @Override // androidx.constraintlayout.motion.utils.d
        public void m(View view, float t4) {
            view.setRotationX(a(t4));
        }
    }

    /* compiled from: ViewSpline.java */
    static class j extends d {
        j() {
        }

        @Override // androidx.constraintlayout.motion.utils.d
        public void m(View view, float t4) {
            view.setRotationY(a(t4));
        }
    }

    /* compiled from: ViewSpline.java */
    static class k extends d {
        k() {
        }

        @Override // androidx.constraintlayout.motion.utils.d
        public void m(View view, float t4) {
            view.setScaleX(a(t4));
        }
    }

    /* compiled from: ViewSpline.java */
    static class l extends d {
        l() {
        }

        @Override // androidx.constraintlayout.motion.utils.d
        public void m(View view, float t4) {
            view.setScaleY(a(t4));
        }
    }

    /* compiled from: ViewSpline.java */
    static class m extends d {
        m() {
        }

        @Override // androidx.constraintlayout.motion.utils.d
        public void m(View view, float t4) {
            view.setTranslationX(a(t4));
        }
    }

    /* compiled from: ViewSpline.java */
    static class n extends d {
        n() {
        }

        @Override // androidx.constraintlayout.motion.utils.d
        public void m(View view, float t4) {
            view.setTranslationY(a(t4));
        }
    }

    /* compiled from: ViewSpline.java */
    static class o extends d {
        o() {
        }

        @Override // androidx.constraintlayout.motion.utils.d
        public void m(View view, float t4) {
            view.setTranslationZ(a(t4));
        }
    }

    public static d k(String str, SparseArray<androidx.constraintlayout.widget.a> attrList) {
        return new b(str, attrList);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static d l(String str) {
        str.getClass();
        char c5 = 65535;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    c5 = 0;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c5 = 1;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c5 = 2;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c5 = 3;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c5 = 4;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c5 = 5;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c5 = 6;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c5 = 7;
                    break;
                }
                break;
            case -797520672:
                if (str.equals("waveVariesBy")) {
                    c5 = '\b';
                    break;
                }
                break;
            case -760884510:
                if (str.equals("transformPivotX")) {
                    c5 = '\t';
                    break;
                }
                break;
            case -760884509:
                if (str.equals("transformPivotY")) {
                    c5 = '\n';
                    break;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    c5 = 11;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c5 = '\f';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c5 = org.apache.commons.lang3.m.f86065d;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c5 = 14;
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c5 = 15;
                    break;
                }
                break;
        }
        switch (c5) {
        }
        return new a();
    }

    public abstract void m(View view, float t4);
}
