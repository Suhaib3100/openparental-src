package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.c1;
import androidx.core.view.j3;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import z0.a;

/* compiled from: WindowInsetsAnimationCompat.java */
/* loaded from: classes3.dex */
public final class o2 {

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f27345b = false;

    /* renamed from: c, reason: collision with root package name */
    private static final String f27346c = "WindowInsetsAnimCompat";

    /* renamed from: a, reason: collision with root package name */
    private e f27347a;

    /* compiled from: WindowInsetsAnimationCompat.java */
    public static abstract class b {

        /* renamed from: d, reason: collision with root package name */
        public static final int f27350d = 0;

        /* renamed from: e, reason: collision with root package name */
        public static final int f27351e = 1;

        /* renamed from: b, reason: collision with root package name */
        WindowInsets f27352b;

        /* renamed from: c, reason: collision with root package name */
        private final int f27353c;

        /* compiled from: WindowInsetsAnimationCompat.java */
        @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        public b(int i4) {
            this.f27353c = i4;
        }

        public final int b() {
            return this.f27353c;
        }

        public void c(@androidx.annotation.o0 o2 o2Var) {
        }

        public void d(@androidx.annotation.o0 o2 o2Var) {
        }

        @androidx.annotation.o0
        public abstract j3 e(@androidx.annotation.o0 j3 j3Var, @androidx.annotation.o0 List<o2> list);

        @androidx.annotation.o0
        public a f(@androidx.annotation.o0 o2 o2Var, @androidx.annotation.o0 a aVar) {
            return aVar;
        }
    }

    /* compiled from: WindowInsetsAnimationCompat.java */
    @androidx.annotation.x0(21)
    private static class c extends e {

        /* renamed from: f, reason: collision with root package name */
        private static final Interpolator f27354f = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* renamed from: g, reason: collision with root package name */
        private static final Interpolator f27355g = new androidx.interpolator.view.animation.a();

        /* renamed from: h, reason: collision with root package name */
        private static final Interpolator f27356h = new DecelerateInterpolator();

        /* compiled from: WindowInsetsAnimationCompat.java */
        @androidx.annotation.x0(21)
        private static class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: c, reason: collision with root package name */
            private static final int f27357c = 160;

            /* renamed from: a, reason: collision with root package name */
            final b f27358a;

            /* renamed from: b, reason: collision with root package name */
            private j3 f27359b;

            /* compiled from: WindowInsetsAnimationCompat.java */
            /* renamed from: androidx.core.view.o2$c$a$a, reason: collision with other inner class name */
            class C0441a implements ValueAnimator.AnimatorUpdateListener {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ o2 f27360b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ j3 f27361c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ j3 f27362d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ int f27363e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ View f27364f;

                C0441a(o2 o2Var, j3 j3Var, j3 j3Var2, int i4, View view) {
                    this.f27360b = o2Var;
                    this.f27361c = j3Var;
                    this.f27362d = j3Var2;
                    this.f27363e = i4;
                    this.f27364f = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f27360b.i(valueAnimator.getAnimatedFraction());
                    c.o(this.f27364f, c.s(this.f27361c, this.f27362d, this.f27360b.d(), this.f27363e), Collections.singletonList(this.f27360b));
                }
            }

            /* compiled from: WindowInsetsAnimationCompat.java */
            class b extends AnimatorListenerAdapter {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ o2 f27366b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ View f27367c;

                b(o2 o2Var, View view) {
                    this.f27366b = o2Var;
                    this.f27367c = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.f27366b.i(1.0f);
                    c.m(this.f27367c, this.f27366b);
                }
            }

            /* compiled from: WindowInsetsAnimationCompat.java */
            /* renamed from: androidx.core.view.o2$c$a$c, reason: collision with other inner class name */
            class RunnableC0442c implements Runnable {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ View f27369b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ o2 f27370c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ a f27371d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ ValueAnimator f27372e;

                RunnableC0442c(View view, o2 o2Var, a aVar, ValueAnimator valueAnimator) {
                    this.f27369b = view;
                    this.f27370c = o2Var;
                    this.f27371d = aVar;
                    this.f27372e = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    c.p(this.f27369b, this.f27370c, this.f27371d);
                    this.f27372e.start();
                }
            }

            a(@androidx.annotation.o0 View view, @androidx.annotation.o0 b bVar) {
                this.f27358a = bVar;
                j3 r02 = x1.r0(view);
                this.f27359b = r02 != null ? new j3.b(r02).a() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.f27359b = j3.L(windowInsets, view);
                    return c.q(view, windowInsets);
                }
                j3 L = j3.L(windowInsets, view);
                if (this.f27359b == null) {
                    this.f27359b = x1.r0(view);
                }
                if (this.f27359b == null) {
                    this.f27359b = L;
                    return c.q(view, windowInsets);
                }
                b r4 = c.r(view);
                if (r4 != null && Objects.equals(r4.f27352b, windowInsets)) {
                    return c.q(view, windowInsets);
                }
                int i4 = c.i(L, this.f27359b);
                if (i4 == 0) {
                    return c.q(view, windowInsets);
                }
                j3 j3Var = this.f27359b;
                o2 o2Var = new o2(i4, c.k(i4, L, j3Var), 160L);
                o2Var.i(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(o2Var.b());
                a j4 = c.j(L, j3Var, i4);
                c.n(view, o2Var, windowInsets, false);
                duration.addUpdateListener(new C0441a(o2Var, L, j3Var, i4, view));
                duration.addListener(new b(o2Var, view));
                g1.a(view, new RunnableC0442c(view, o2Var, j4, duration));
                this.f27359b = L;
                return c.q(view, windowInsets);
            }
        }

        c(int i4, @androidx.annotation.q0 Interpolator interpolator, long j4) {
            super(i4, interpolator, j4);
        }

        @SuppressLint({"WrongConstant"})
        static int i(@androidx.annotation.o0 j3 j3Var, @androidx.annotation.o0 j3 j3Var2) {
            int i4 = 0;
            for (int i5 = 1; i5 <= 256; i5 <<= 1) {
                if (!j3Var.f(i5).equals(j3Var2.f(i5))) {
                    i4 |= i5;
                }
            }
            return i4;
        }

        @androidx.annotation.o0
        static a j(@androidx.annotation.o0 j3 j3Var, @androidx.annotation.o0 j3 j3Var2, int i4) {
            androidx.core.graphics.e0 f4 = j3Var.f(i4);
            androidx.core.graphics.e0 f5 = j3Var2.f(i4);
            return new a(androidx.core.graphics.e0.d(Math.min(f4.f26245a, f5.f26245a), Math.min(f4.f26246b, f5.f26246b), Math.min(f4.f26247c, f5.f26247c), Math.min(f4.f26248d, f5.f26248d)), androidx.core.graphics.e0.d(Math.max(f4.f26245a, f5.f26245a), Math.max(f4.f26246b, f5.f26246b), Math.max(f4.f26247c, f5.f26247c), Math.max(f4.f26248d, f5.f26248d)));
        }

        static Interpolator k(int i4, j3 j3Var, j3 j3Var2) {
            return (i4 & 8) != 0 ? j3Var.f(8).f26248d > j3Var2.f(8).f26248d ? f27354f : f27355g : f27356h;
        }

        @androidx.annotation.o0
        private static View.OnApplyWindowInsetsListener l(@androidx.annotation.o0 View view, @androidx.annotation.o0 b bVar) {
            return new a(view, bVar);
        }

        static void m(@androidx.annotation.o0 View view, @androidx.annotation.o0 o2 o2Var) {
            b r4 = r(view);
            if (r4 != null) {
                r4.c(o2Var);
                if (r4.b() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                    m(viewGroup.getChildAt(i4), o2Var);
                }
            }
        }

        static void n(View view, o2 o2Var, WindowInsets windowInsets, boolean z4) {
            b r4 = r(view);
            if (r4 != null) {
                r4.f27352b = windowInsets;
                if (!z4) {
                    r4.d(o2Var);
                    z4 = r4.b() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                    n(viewGroup.getChildAt(i4), o2Var, windowInsets, z4);
                }
            }
        }

        static void o(@androidx.annotation.o0 View view, @androidx.annotation.o0 j3 j3Var, @androidx.annotation.o0 List<o2> list) {
            b r4 = r(view);
            if (r4 != null) {
                j3Var = r4.e(j3Var, list);
                if (r4.b() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                    o(viewGroup.getChildAt(i4), j3Var, list);
                }
            }
        }

        static void p(View view, o2 o2Var, a aVar) {
            b r4 = r(view);
            if (r4 != null) {
                r4.f(o2Var, aVar);
                if (r4.b() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                    p(viewGroup.getChildAt(i4), o2Var, aVar);
                }
            }
        }

        @androidx.annotation.o0
        static WindowInsets q(@androidx.annotation.o0 View view, @androidx.annotation.o0 WindowInsets windowInsets) {
            return view.getTag(a.e.f93575j0) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        @androidx.annotation.q0
        static b r(View view) {
            Object tag = view.getTag(a.e.f93591r0);
            if (tag instanceof a) {
                return ((a) tag).f27358a;
            }
            return null;
        }

        @SuppressLint({"WrongConstant"})
        static j3 s(j3 j3Var, j3 j3Var2, float f4, int i4) {
            j3.b bVar = new j3.b(j3Var);
            for (int i5 = 1; i5 <= 256; i5 <<= 1) {
                if ((i4 & i5) == 0) {
                    bVar.c(i5, j3Var.f(i5));
                } else {
                    androidx.core.graphics.e0 f5 = j3Var.f(i5);
                    androidx.core.graphics.e0 f6 = j3Var2.f(i5);
                    float f7 = 1.0f - f4;
                    bVar.c(i5, j3.z(f5, (int) (((f5.f26245a - f6.f26245a) * f7) + 0.5d), (int) (((f5.f26246b - f6.f26246b) * f7) + 0.5d), (int) (((f5.f26247c - f6.f26247c) * f7) + 0.5d), (int) (((f5.f26248d - f6.f26248d) * f7) + 0.5d)));
                }
            }
            return bVar.a();
        }

        static void t(@androidx.annotation.o0 View view, @androidx.annotation.q0 b bVar) {
            Object tag = view.getTag(a.e.f93575j0);
            if (bVar == null) {
                view.setTag(a.e.f93591r0, null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(null);
                    return;
                }
                return;
            }
            View.OnApplyWindowInsetsListener aVar = new a(view, bVar);
            view.setTag(a.e.f93591r0, aVar);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(aVar);
            }
        }
    }

    /* compiled from: WindowInsetsAnimationCompat.java */
    private static class e {

        /* renamed from: a, reason: collision with root package name */
        private final int f27379a;

        /* renamed from: b, reason: collision with root package name */
        private float f27380b;

        /* renamed from: c, reason: collision with root package name */
        @androidx.annotation.q0
        private final Interpolator f27381c;

        /* renamed from: d, reason: collision with root package name */
        private final long f27382d;

        /* renamed from: e, reason: collision with root package name */
        private float f27383e;

        e(int i4, @androidx.annotation.q0 Interpolator interpolator, long j4) {
            this.f27379a = i4;
            this.f27381c = interpolator;
            this.f27382d = j4;
        }

        public float a() {
            return this.f27383e;
        }

        public long b() {
            return this.f27382d;
        }

        public float c() {
            return this.f27380b;
        }

        public float d() {
            Interpolator interpolator = this.f27381c;
            return interpolator != null ? interpolator.getInterpolation(this.f27380b) : this.f27380b;
        }

        @androidx.annotation.q0
        public Interpolator e() {
            return this.f27381c;
        }

        public int f() {
            return this.f27379a;
        }

        public void g(float f4) {
            this.f27383e = f4;
        }

        public void h(float f4) {
            this.f27380b = f4;
        }
    }

    public o2(int i4, @androidx.annotation.q0 Interpolator interpolator, long j4) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f27347a = new d(i4, interpolator, j4);
        } else {
            this.f27347a = new c(i4, interpolator, j4);
        }
    }

    static void h(@androidx.annotation.o0 View view, @androidx.annotation.q0 b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.l(view, bVar);
        } else {
            c.t(view, bVar);
        }
    }

    @androidx.annotation.x0(30)
    static o2 j(WindowInsetsAnimation windowInsetsAnimation) {
        return new o2(windowInsetsAnimation);
    }

    @androidx.annotation.x(from = com.google.firebase.remoteconfig.p.f60679p, to = 1.0d)
    public float a() {
        return this.f27347a.a();
    }

    public long b() {
        return this.f27347a.b();
    }

    @androidx.annotation.x(from = com.google.firebase.remoteconfig.p.f60679p, to = 1.0d)
    public float c() {
        return this.f27347a.c();
    }

    public float d() {
        return this.f27347a.d();
    }

    @androidx.annotation.q0
    public Interpolator e() {
        return this.f27347a.e();
    }

    public int f() {
        return this.f27347a.f();
    }

    public void g(@androidx.annotation.x(from = 0.0d, to = 1.0d) float f4) {
        this.f27347a.g(f4);
    }

    public void i(@androidx.annotation.x(from = 0.0d, to = 1.0d) float f4) {
        this.f27347a.h(f4);
    }

    /* compiled from: WindowInsetsAnimationCompat.java */
    @androidx.annotation.x0(30)
    private static class d extends e {

        /* renamed from: f, reason: collision with root package name */
        @androidx.annotation.o0
        private final WindowInsetsAnimation f27374f;

        /* compiled from: WindowInsetsAnimationCompat.java */
        @androidx.annotation.x0(30)
        private static class a extends WindowInsetsAnimation$Callback {

            /* renamed from: a, reason: collision with root package name */
            private final b f27375a;

            /* renamed from: b, reason: collision with root package name */
            private List<o2> f27376b;

            /* renamed from: c, reason: collision with root package name */
            private ArrayList<o2> f27377c;

            /* renamed from: d, reason: collision with root package name */
            private final HashMap<WindowInsetsAnimation, o2> f27378d;

            a(@androidx.annotation.o0 b bVar) {
                super(bVar.b());
                this.f27378d = new HashMap<>();
                this.f27375a = bVar;
            }

            @androidx.annotation.o0
            private o2 a(@androidx.annotation.o0 WindowInsetsAnimation windowInsetsAnimation) {
                o2 o2Var = this.f27378d.get(windowInsetsAnimation);
                if (o2Var != null) {
                    return o2Var;
                }
                o2 j4 = o2.j(windowInsetsAnimation);
                this.f27378d.put(windowInsetsAnimation, j4);
                return j4;
            }

            public void onEnd(@androidx.annotation.o0 WindowInsetsAnimation windowInsetsAnimation) {
                this.f27375a.c(a(windowInsetsAnimation));
                this.f27378d.remove(windowInsetsAnimation);
            }

            public void onPrepare(@androidx.annotation.o0 WindowInsetsAnimation windowInsetsAnimation) {
                this.f27375a.d(a(windowInsetsAnimation));
            }

            @androidx.annotation.o0
            public WindowInsets onProgress(@androidx.annotation.o0 WindowInsets windowInsets, @androidx.annotation.o0 List<WindowInsetsAnimation> list) {
                float fraction;
                ArrayList<o2> arrayList = this.f27377c;
                if (arrayList == null) {
                    ArrayList<o2> arrayList2 = new ArrayList<>(list.size());
                    this.f27377c = arrayList2;
                    this.f27376b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation a5 = b3.a(list.get(size));
                    o2 a6 = a(a5);
                    fraction = a5.getFraction();
                    a6.i(fraction);
                    this.f27377c.add(a6);
                }
                return this.f27375a.e(j3.K(windowInsets), this.f27376b).J();
            }

            @androidx.annotation.o0
            public WindowInsetsAnimation.Bounds onStart(@androidx.annotation.o0 WindowInsetsAnimation windowInsetsAnimation, @androidx.annotation.o0 WindowInsetsAnimation.Bounds bounds) {
                a f4 = this.f27375a.f(a(windowInsetsAnimation), a.e(bounds));
                f4.getClass();
                return d.i(f4);
            }
        }

        d(@androidx.annotation.o0 WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f27374f = windowInsetsAnimation;
        }

        @androidx.annotation.o0
        public static WindowInsetsAnimation.Bounds i(@androidx.annotation.o0 a aVar) {
            r2.a();
            return q2.a(aVar.a().h(), aVar.b().h());
        }

        @androidx.annotation.o0
        public static androidx.core.graphics.e0 j(@androidx.annotation.o0 WindowInsetsAnimation.Bounds bounds) {
            Insets upperBound;
            upperBound = bounds.getUpperBound();
            return androidx.core.graphics.e0.g(upperBound);
        }

        @androidx.annotation.o0
        public static androidx.core.graphics.e0 k(@androidx.annotation.o0 WindowInsetsAnimation.Bounds bounds) {
            Insets lowerBound;
            lowerBound = bounds.getLowerBound();
            return androidx.core.graphics.e0.g(lowerBound);
        }

        public static void l(@androidx.annotation.o0 View view, @androidx.annotation.q0 b bVar) {
            view.setWindowInsetsAnimationCallback(bVar != null ? new a(bVar) : null);
        }

        @Override // androidx.core.view.o2.e
        public long b() {
            long durationMillis;
            durationMillis = this.f27374f.getDurationMillis();
            return durationMillis;
        }

        @Override // androidx.core.view.o2.e
        public float c() {
            float fraction;
            fraction = this.f27374f.getFraction();
            return fraction;
        }

        @Override // androidx.core.view.o2.e
        public float d() {
            float interpolatedFraction;
            interpolatedFraction = this.f27374f.getInterpolatedFraction();
            return interpolatedFraction;
        }

        @Override // androidx.core.view.o2.e
        @androidx.annotation.q0
        public Interpolator e() {
            Interpolator interpolator;
            interpolator = this.f27374f.getInterpolator();
            return interpolator;
        }

        @Override // androidx.core.view.o2.e
        public int f() {
            int typeMask;
            typeMask = this.f27374f.getTypeMask();
            return typeMask;
        }

        @Override // androidx.core.view.o2.e
        public void h(float f4) {
            this.f27374f.setFraction(f4);
        }

        d(int i4, Interpolator interpolator, long j4) {
            this(a3.a(i4, interpolator, j4));
        }
    }

    /* compiled from: WindowInsetsAnimationCompat.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final androidx.core.graphics.e0 f27348a;

        /* renamed from: b, reason: collision with root package name */
        private final androidx.core.graphics.e0 f27349b;

        public a(@androidx.annotation.o0 androidx.core.graphics.e0 e0Var, @androidx.annotation.o0 androidx.core.graphics.e0 e0Var2) {
            this.f27348a = e0Var;
            this.f27349b = e0Var2;
        }

        @androidx.annotation.o0
        @androidx.annotation.x0(30)
        public static a e(@androidx.annotation.o0 WindowInsetsAnimation.Bounds bounds) {
            return new a(bounds);
        }

        @androidx.annotation.o0
        public androidx.core.graphics.e0 a() {
            return this.f27348a;
        }

        @androidx.annotation.o0
        public androidx.core.graphics.e0 b() {
            return this.f27349b;
        }

        @androidx.annotation.o0
        public a c(@androidx.annotation.o0 androidx.core.graphics.e0 e0Var) {
            return new a(j3.z(this.f27348a, e0Var.f26245a, e0Var.f26246b, e0Var.f26247c, e0Var.f26248d), j3.z(this.f27349b, e0Var.f26245a, e0Var.f26246b, e0Var.f26247c, e0Var.f26248d));
        }

        @androidx.annotation.o0
        @androidx.annotation.x0(30)
        public WindowInsetsAnimation.Bounds d() {
            return d.i(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.f27348a + " upper=" + this.f27349b + "}";
        }

        @androidx.annotation.x0(30)
        private a(@androidx.annotation.o0 WindowInsetsAnimation.Bounds bounds) {
            this.f27348a = d.k(bounds);
            this.f27349b = d.j(bounds);
        }
    }

    @androidx.annotation.x0(30)
    private o2(@androidx.annotation.o0 WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f27347a = new d(windowInsetsAnimation);
        }
    }
}
