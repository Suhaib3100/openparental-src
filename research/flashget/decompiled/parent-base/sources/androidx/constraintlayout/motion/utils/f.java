package androidx.constraintlayout.motion.utils;

import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.u;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.google.firebase.remoteconfig.p;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ViewTimeCycle.java */
/* loaded from: classes.dex */
public abstract class f extends u {

    /* renamed from: p, reason: collision with root package name */
    private static final String f23155p = "ViewTimeCycle";

    /* compiled from: ViewTimeCycle.java */
    static class a extends f {
        a() {
        }

        @Override // androidx.constraintlayout.motion.utils.f
        public boolean j(View view, float t4, long time, androidx.constraintlayout.core.motion.utils.h cache) {
            view.setAlpha(g(t4, time, view, cache));
            return this.f22367h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    public static class b extends f {

        /* renamed from: q, reason: collision with root package name */
        String f23156q;

        /* renamed from: r, reason: collision with root package name */
        SparseArray<androidx.constraintlayout.widget.a> f23157r;

        /* renamed from: s, reason: collision with root package name */
        SparseArray<float[]> f23158s = new SparseArray<>();

        /* renamed from: t, reason: collision with root package name */
        float[] f23159t;

        /* renamed from: u, reason: collision with root package name */
        float[] f23160u;

        public b(String attribute, SparseArray<androidx.constraintlayout.widget.a> attrList) {
            this.f23156q = attribute.split(",")[1];
            this.f23157r = attrList;
        }

        @Override // androidx.constraintlayout.core.motion.utils.u
        public void c(int position, float value, float period, int shape, float offset) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // androidx.constraintlayout.core.motion.utils.u
        public void f(int curveType) {
            int size = this.f23157r.size();
            int p4 = this.f23157r.valueAt(0).p();
            double[] dArr = new double[size];
            int i4 = p4 + 2;
            this.f23159t = new float[i4];
            this.f23160u = new float[p4];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i4);
            for (int i5 = 0; i5 < size; i5++) {
                int keyAt = this.f23157r.keyAt(i5);
                androidx.constraintlayout.widget.a valueAt = this.f23157r.valueAt(i5);
                float[] valueAt2 = this.f23158s.valueAt(i5);
                dArr[i5] = keyAt * 0.01d;
                valueAt.l(this.f23159t);
                int i6 = 0;
                while (true) {
                    if (i6 < this.f23159t.length) {
                        dArr2[i5][i6] = r8[i6];
                        i6++;
                    }
                }
                double[] dArr3 = dArr2[i5];
                dArr3[p4] = valueAt2[0];
                dArr3[p4 + 1] = valueAt2[1];
            }
            this.f22360a = androidx.constraintlayout.core.motion.utils.c.a(curveType, dArr, dArr2);
        }

        @Override // androidx.constraintlayout.motion.utils.f
        public boolean j(View view, float t4, long time, androidx.constraintlayout.core.motion.utils.h cache) {
            this.f22360a.e(t4, this.f23159t);
            float[] fArr = this.f23159t;
            float f4 = fArr[fArr.length - 2];
            float f5 = fArr[fArr.length - 1];
            long j4 = time - this.f22368i;
            if (Float.isNaN(this.f22369j)) {
                float a5 = cache.a(view, this.f23156q, 0);
                this.f22369j = a5;
                if (Float.isNaN(a5)) {
                    this.f22369j = 0.0f;
                }
            }
            float f6 = (float) ((((j4 * 1.0E-9d) * f4) + this.f22369j) % 1.0d);
            this.f22369j = f6;
            this.f22368i = time;
            float a6 = a(f6);
            this.f22367h = false;
            int i4 = 0;
            while (true) {
                float[] fArr2 = this.f23160u;
                if (i4 >= fArr2.length) {
                    break;
                }
                boolean z4 = this.f22367h;
                float f7 = this.f23159t[i4];
                this.f22367h = z4 | (((double) f7) != p.f60679p);
                fArr2[i4] = (f7 * a6) + f5;
                i4++;
            }
            androidx.constraintlayout.motion.utils.a.b(this.f23157r.valueAt(0), view, this.f23160u);
            if (f4 != 0.0f) {
                this.f22367h = true;
            }
            return this.f22367h;
        }

        public void k(int position, androidx.constraintlayout.widget.a value, float period, int shape, float offset) {
            this.f23157r.append(position, value);
            this.f23158s.append(position, new float[]{period, offset});
            this.f22361b = Math.max(this.f22361b, shape);
        }
    }

    /* compiled from: ViewTimeCycle.java */
    static class c extends f {
        c() {
        }

        @Override // androidx.constraintlayout.motion.utils.f
        public boolean j(View view, float t4, long time, androidx.constraintlayout.core.motion.utils.h cache) {
            view.setElevation(g(t4, time, view, cache));
            return this.f22367h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    public static class d extends f {
        @Override // androidx.constraintlayout.motion.utils.f
        public boolean j(View view, float t4, long time, androidx.constraintlayout.core.motion.utils.h cache) {
            return this.f22367h;
        }

        public boolean k(View view, androidx.constraintlayout.core.motion.utils.h cache, float t4, long time, double dx, double dy) {
            view.setRotation(g(t4, time, view, cache) + ((float) Math.toDegrees(Math.atan2(dy, dx))));
            return this.f22367h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    static class e extends f {

        /* renamed from: q, reason: collision with root package name */
        boolean f23161q = false;

        e() {
        }

        @Override // androidx.constraintlayout.motion.utils.f
        public boolean j(View view, float t4, long time, androidx.constraintlayout.core.motion.utils.h cache) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).F1(g(t4, time, view, cache));
            } else {
                if (this.f23161q) {
                    return false;
                }
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f23161q = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(g(t4, time, view, cache)));
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
            return this.f22367h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    /* renamed from: androidx.constraintlayout.motion.utils.f$f, reason: collision with other inner class name */
    static class C0394f extends f {
        C0394f() {
        }

        @Override // androidx.constraintlayout.motion.utils.f
        public boolean j(View view, float t4, long time, androidx.constraintlayout.core.motion.utils.h cache) {
            view.setRotation(g(t4, time, view, cache));
            return this.f22367h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    static class g extends f {
        g() {
        }

        @Override // androidx.constraintlayout.motion.utils.f
        public boolean j(View view, float t4, long time, androidx.constraintlayout.core.motion.utils.h cache) {
            view.setRotationX(g(t4, time, view, cache));
            return this.f22367h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    static class h extends f {
        h() {
        }

        @Override // androidx.constraintlayout.motion.utils.f
        public boolean j(View view, float t4, long time, androidx.constraintlayout.core.motion.utils.h cache) {
            view.setRotationY(g(t4, time, view, cache));
            return this.f22367h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    static class i extends f {
        i() {
        }

        @Override // androidx.constraintlayout.motion.utils.f
        public boolean j(View view, float t4, long time, androidx.constraintlayout.core.motion.utils.h cache) {
            view.setScaleX(g(t4, time, view, cache));
            return this.f22367h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    static class j extends f {
        j() {
        }

        @Override // androidx.constraintlayout.motion.utils.f
        public boolean j(View view, float t4, long time, androidx.constraintlayout.core.motion.utils.h cache) {
            view.setScaleY(g(t4, time, view, cache));
            return this.f22367h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    static class k extends f {
        k() {
        }

        @Override // androidx.constraintlayout.motion.utils.f
        public boolean j(View view, float t4, long time, androidx.constraintlayout.core.motion.utils.h cache) {
            view.setTranslationX(g(t4, time, view, cache));
            return this.f22367h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    static class l extends f {
        l() {
        }

        @Override // androidx.constraintlayout.motion.utils.f
        public boolean j(View view, float t4, long time, androidx.constraintlayout.core.motion.utils.h cache) {
            view.setTranslationY(g(t4, time, view, cache));
            return this.f22367h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    static class m extends f {
        m() {
        }

        @Override // androidx.constraintlayout.motion.utils.f
        public boolean j(View view, float t4, long time, androidx.constraintlayout.core.motion.utils.h cache) {
            view.setTranslationZ(g(t4, time, view, cache));
            return this.f22367h;
        }
    }

    public static f h(String str, SparseArray<androidx.constraintlayout.widget.a> attrList) {
        return new b(str, attrList);
    }

    public static f i(String str, long currentTime) {
        f gVar;
        str.getClass();
        switch (str) {
            case "rotationX":
                gVar = new g();
                break;
            case "rotationY":
                gVar = new h();
                break;
            case "translationX":
                gVar = new k();
                break;
            case "translationY":
                gVar = new l();
                break;
            case "translationZ":
                gVar = new m();
                break;
            case "progress":
                gVar = new e();
                break;
            case "scaleX":
                gVar = new i();
                break;
            case "scaleY":
                gVar = new j();
                break;
            case "rotation":
                gVar = new C0394f();
                break;
            case "elevation":
                gVar = new c();
                break;
            case "transitionPathRotate":
                gVar = new d();
                break;
            case "alpha":
                gVar = new a();
                break;
            default:
                return null;
        }
        gVar.d(currentTime);
        return gVar;
    }

    public float g(float pos, long time, View view, androidx.constraintlayout.core.motion.utils.h cache) {
        this.f22360a.e(pos, this.f22366g);
        float[] fArr = this.f22366g;
        float f4 = fArr[1];
        if (f4 == 0.0f) {
            this.f22367h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f22369j)) {
            float a5 = cache.a(view, this.f22365f, 0);
            this.f22369j = a5;
            if (Float.isNaN(a5)) {
                this.f22369j = 0.0f;
            }
        }
        float f5 = (float) (((((time - this.f22368i) * 1.0E-9d) * f4) + this.f22369j) % 1.0d);
        this.f22369j = f5;
        cache.b(view, this.f22365f, 0, f5);
        this.f22368i = time;
        float f6 = this.f22366g[0];
        float a6 = (a(this.f22369j) * f6) + this.f22366g[2];
        this.f22367h = (f6 == 0.0f && f4 == 0.0f) ? false : true;
        return a6;
    }

    public abstract boolean j(View view, float t4, long time, androidx.constraintlayout.core.motion.utils.h cache);
}
