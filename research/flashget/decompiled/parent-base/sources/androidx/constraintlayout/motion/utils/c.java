package androidx.constraintlayout.motion.utils;

import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ViewOscillator.java */
/* loaded from: classes.dex */
public abstract class c extends androidx.constraintlayout.core.motion.utils.i {

    /* renamed from: i, reason: collision with root package name */
    private static final String f23141i = "ViewOscillator";

    /* compiled from: ViewOscillator.java */
    static class a extends c {
        a() {
        }

        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float t4) {
            view.setAlpha(a(t4));
        }
    }

    /* compiled from: ViewOscillator.java */
    static class b extends c {

        /* renamed from: j, reason: collision with root package name */
        float[] f23142j = new float[1];

        /* renamed from: k, reason: collision with root package name */
        protected androidx.constraintlayout.widget.a f23143k;

        b() {
        }

        @Override // androidx.constraintlayout.core.motion.utils.i
        protected void e(Object custom) {
            this.f23143k = (androidx.constraintlayout.widget.a) custom;
        }

        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float t4) {
            this.f23142j[0] = a(t4);
            androidx.constraintlayout.motion.utils.a.b(this.f23143k, view, this.f23142j);
        }
    }

    /* compiled from: ViewOscillator.java */
    /* renamed from: androidx.constraintlayout.motion.utils.c$c, reason: collision with other inner class name */
    static class C0392c extends c {
        C0392c() {
        }

        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float t4) {
            view.setElevation(a(t4));
        }
    }

    /* compiled from: ViewOscillator.java */
    public static class d extends c {
        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float t4) {
        }

        public void n(View view, float t4, double dx, double dy) {
            view.setRotation(a(t4) + ((float) Math.toDegrees(Math.atan2(dy, dx))));
        }
    }

    /* compiled from: ViewOscillator.java */
    static class e extends c {

        /* renamed from: j, reason: collision with root package name */
        boolean f23144j = false;

        e() {
        }

        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float t4) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).F1(a(t4));
                return;
            }
            if (this.f23144j) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f23144j = true;
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

    /* compiled from: ViewOscillator.java */
    static class f extends c {
        f() {
        }

        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float t4) {
            view.setRotation(a(t4));
        }
    }

    /* compiled from: ViewOscillator.java */
    static class g extends c {
        g() {
        }

        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float t4) {
            view.setRotationX(a(t4));
        }
    }

    /* compiled from: ViewOscillator.java */
    static class h extends c {
        h() {
        }

        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float t4) {
            view.setRotationY(a(t4));
        }
    }

    /* compiled from: ViewOscillator.java */
    static class i extends c {
        i() {
        }

        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float t4) {
            view.setScaleX(a(t4));
        }
    }

    /* compiled from: ViewOscillator.java */
    static class j extends c {
        j() {
        }

        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float t4) {
            view.setScaleY(a(t4));
        }
    }

    /* compiled from: ViewOscillator.java */
    static class k extends c {
        k() {
        }

        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float t4) {
            view.setTranslationX(a(t4));
        }
    }

    /* compiled from: ViewOscillator.java */
    static class l extends c {
        l() {
        }

        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float t4) {
            view.setTranslationY(a(t4));
        }
    }

    /* compiled from: ViewOscillator.java */
    static class m extends c {
        m() {
        }

        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float t4) {
            view.setTranslationZ(a(t4));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static c l(String str) {
        if (str.startsWith("CUSTOM")) {
            return new b();
        }
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
            case -40300674:
                if (str.equals("rotation")) {
                    c5 = '\t';
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c5 = '\n';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c5 = 11;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c5 = '\f';
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c5 = org.apache.commons.lang3.m.f86065d;
                    break;
                }
                break;
        }
        switch (c5) {
            case 0:
                return new g();
            case 1:
                return new h();
            case 2:
                return new k();
            case 3:
                return new l();
            case 4:
                return new m();
            case 5:
                return new e();
            case 6:
                return new i();
            case 7:
                return new j();
            case '\b':
                return new a();
            case '\t':
                return new f();
            case '\n':
                return new C0392c();
            case 11:
                return new d();
            case '\f':
                return new a();
            case '\r':
                return new a();
            default:
                return null;
        }
    }

    public abstract void m(View view, float t4);
}
