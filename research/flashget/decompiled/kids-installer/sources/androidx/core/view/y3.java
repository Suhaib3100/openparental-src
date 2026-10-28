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
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.annotation.c1;
import androidx.core.view.v4;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import k.a;

/* compiled from: WindowInsetsAnimationCompat.java */
/* loaded from: classes.dex */
public final class y3 {

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f5778b = false;

    /* renamed from: c, reason: collision with root package name */
    private static final String f5779c = "WindowInsetsAnimCompat";

    /* renamed from: a, reason: collision with root package name */
    private e f5780a;

    /* compiled from: WindowInsetsAnimationCompat.java */
    public static abstract class b {

        /* renamed from: c, reason: collision with root package name */
        public static final int f5783c = 0;

        /* renamed from: d, reason: collision with root package name */
        public static final int f5784d = 1;

        /* renamed from: a, reason: collision with root package name */
        WindowInsets f5785a;

        /* renamed from: b, reason: collision with root package name */
        private final int f5786b;

        /* compiled from: WindowInsetsAnimationCompat.java */
        @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        public b(int i5) {
            this.f5786b = i5;
        }

        public final int a() {
            return this.f5786b;
        }

        public void b(@androidx.annotation.o0 y3 y3Var) {
        }

        public void c(@androidx.annotation.o0 y3 y3Var) {
        }

        @androidx.annotation.o0
        public abstract v4 d(@androidx.annotation.o0 v4 v4Var, @androidx.annotation.o0 List<y3> list);

        @androidx.annotation.o0
        public a e(@androidx.annotation.o0 y3 y3Var, @androidx.annotation.o0 a aVar) {
            return aVar;
        }
    }

    /* compiled from: WindowInsetsAnimationCompat.java */
    @androidx.annotation.x0(21)
    /* loaded from: classes3.dex */
    private static class c extends e {

        /* compiled from: WindowInsetsAnimationCompat.java */
        @androidx.annotation.x0(21)
        /* loaded from: classes.dex */
        private static class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: c, reason: collision with root package name */
            private static final int f5787c = 160;

            /* renamed from: a, reason: collision with root package name */
            final b f5788a;

            /* renamed from: b, reason: collision with root package name */
            private v4 f5789b;

            /* compiled from: WindowInsetsAnimationCompat.java */
            /* renamed from: androidx.core.view.y3$c$a$a, reason: collision with other inner class name */
            class C0058a implements ValueAnimator.AnimatorUpdateListener {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ y3 f5790a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ v4 f5791b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ v4 f5792c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ int f5793d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ View f5794e;

                C0058a(y3 y3Var, v4 v4Var, v4 v4Var2, int i5, View view) {
                    this.f5790a = y3Var;
                    this.f5791b = v4Var;
                    this.f5792c = v4Var2;
                    this.f5793d = i5;
                    this.f5794e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f5790a.i(valueAnimator.getAnimatedFraction());
                    c.n(this.f5794e, c.r(this.f5791b, this.f5792c, this.f5790a.d(), this.f5793d), Collections.singletonList(this.f5790a));
                }
            }

            /* compiled from: WindowInsetsAnimationCompat.java */
            class b extends AnimatorListenerAdapter {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ y3 f5796a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ View f5797b;

                b(y3 y3Var, View view) {
                    this.f5796a = y3Var;
                    this.f5797b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.f5796a.i(1.0f);
                    c.l(this.f5797b, this.f5796a);
                }
            }

            /* compiled from: WindowInsetsAnimationCompat.java */
            /* renamed from: androidx.core.view.y3$c$a$c, reason: collision with other inner class name */
            class RunnableC0059c implements Runnable {

                /* renamed from: o, reason: collision with root package name */
                final /* synthetic */ View f5799o;

                /* renamed from: p, reason: collision with root package name */
                final /* synthetic */ y3 f5800p;

                /* renamed from: q, reason: collision with root package name */
                final /* synthetic */ a f5801q;

                /* renamed from: r, reason: collision with root package name */
                final /* synthetic */ ValueAnimator f5802r;

                RunnableC0059c(View view, y3 y3Var, a aVar, ValueAnimator valueAnimator) {
                    this.f5799o = view;
                    this.f5800p = y3Var;
                    this.f5801q = aVar;
                    this.f5802r = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    c.o(this.f5799o, this.f5800p, this.f5801q);
                    this.f5802r.start();
                }
            }

            a(@androidx.annotation.o0 View view, @androidx.annotation.o0 b bVar) {
                this.f5788a = bVar;
                v4 o02 = y1.o0(view);
                this.f5789b = o02 != null ? new v4.b(o02).a() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.f5789b = v4.L(windowInsets, view);
                    return c.p(view, windowInsets);
                }
                v4 L = v4.L(windowInsets, view);
                if (this.f5789b == null) {
                    this.f5789b = y1.o0(view);
                }
                if (this.f5789b == null) {
                    this.f5789b = L;
                    return c.p(view, windowInsets);
                }
                b q5 = c.q(view);
                if (q5 != null && Objects.equals(q5.f5785a, windowInsets)) {
                    return c.p(view, windowInsets);
                }
                int i5 = c.i(L, this.f5789b);
                if (i5 == 0) {
                    return c.p(view, windowInsets);
                }
                v4 v4Var = this.f5789b;
                y3 y3Var = new y3(i5, new DecelerateInterpolator(), 160L);
                y3Var.i(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(y3Var.b());
                a j5 = c.j(L, v4Var, i5);
                c.m(view, y3Var, windowInsets, false);
                duration.addUpdateListener(new C0058a(y3Var, L, v4Var, i5, view));
                duration.addListener(new b(y3Var, view));
                r1.a(view, new RunnableC0059c(view, y3Var, j5, duration));
                this.f5789b = L;
                return c.p(view, windowInsets);
            }
        }

        c(int i5, @androidx.annotation.q0 Interpolator interpolator, long j5) {
            super(i5, interpolator, j5);
        }

        @SuppressLint({"WrongConstant"})
        static int i(@androidx.annotation.o0 v4 v4Var, @androidx.annotation.o0 v4 v4Var2) {
            int i5 = 0;
            for (int i6 = 1; i6 <= 256; i6 <<= 1) {
                if (!v4Var.f(i6).equals(v4Var2.f(i6))) {
                    i5 |= i6;
                }
            }
            return i5;
        }

        @androidx.annotation.o0
        static a j(@androidx.annotation.o0 v4 v4Var, @androidx.annotation.o0 v4 v4Var2, int i5) {
            androidx.core.graphics.w1 f6 = v4Var.f(i5);
            androidx.core.graphics.w1 f7 = v4Var2.f(i5);
            return new a(androidx.core.graphics.w1.d(Math.min(f6.f4813a, f7.f4813a), Math.min(f6.f4814b, f7.f4814b), Math.min(f6.f4815c, f7.f4815c), Math.min(f6.f4816d, f7.f4816d)), androidx.core.graphics.w1.d(Math.max(f6.f4813a, f7.f4813a), Math.max(f6.f4814b, f7.f4814b), Math.max(f6.f4815c, f7.f4815c), Math.max(f6.f4816d, f7.f4816d)));
        }

        @androidx.annotation.o0
        private static View.OnApplyWindowInsetsListener k(@androidx.annotation.o0 View view, @androidx.annotation.o0 b bVar) {
            return new a(view, bVar);
        }

        static void l(@androidx.annotation.o0 View view, @androidx.annotation.o0 y3 y3Var) {
            b q5 = q(view);
            if (q5 != null) {
                q5.b(y3Var);
                if (q5.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                    l(viewGroup.getChildAt(i5), y3Var);
                }
            }
        }

        static void m(View view, y3 y3Var, WindowInsets windowInsets, boolean z5) {
            b q5 = q(view);
            if (q5 != null) {
                q5.f5785a = windowInsets;
                if (!z5) {
                    q5.c(y3Var);
                    z5 = q5.a() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                    m(viewGroup.getChildAt(i5), y3Var, windowInsets, z5);
                }
            }
        }

        static void n(@androidx.annotation.o0 View view, @androidx.annotation.o0 v4 v4Var, @androidx.annotation.o0 List<y3> list) {
            b q5 = q(view);
            if (q5 != null) {
                v4Var = q5.d(v4Var, list);
                if (q5.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                    n(viewGroup.getChildAt(i5), v4Var, list);
                }
            }
        }

        static void o(View view, y3 y3Var, a aVar) {
            b q5 = q(view);
            if (q5 != null) {
                q5.e(y3Var, aVar);
                if (q5.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                    o(viewGroup.getChildAt(i5), y3Var, aVar);
                }
            }
        }

        @androidx.annotation.o0
        static WindowInsets p(@androidx.annotation.o0 View view, @androidx.annotation.o0 WindowInsets windowInsets) {
            return view.getTag(a.e.f22988h0) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        @androidx.annotation.q0
        static b q(View view) {
            Object tag = view.getTag(a.e.f23004p0);
            if (tag instanceof a) {
                return ((a) tag).f5788a;
            }
            return null;
        }

        @SuppressLint({"WrongConstant"})
        static v4 r(v4 v4Var, v4 v4Var2, float f6, int i5) {
            v4.b bVar = new v4.b(v4Var);
            for (int i6 = 1; i6 <= 256; i6 <<= 1) {
                if ((i5 & i6) == 0) {
                    bVar.c(i6, v4Var.f(i6));
                } else {
                    androidx.core.graphics.w1 f7 = v4Var.f(i6);
                    androidx.core.graphics.w1 f8 = v4Var2.f(i6);
                    float f9 = 1.0f - f6;
                    bVar.c(i6, v4.z(f7, (int) (((f7.f4813a - f8.f4813a) * f9) + 0.5d), (int) (((f7.f4814b - f8.f4814b) * f9) + 0.5d), (int) (((f7.f4815c - f8.f4815c) * f9) + 0.5d), (int) (((f7.f4816d - f8.f4816d) * f9) + 0.5d)));
                }
            }
            return bVar.a();
        }

        static void s(@androidx.annotation.o0 View view, @androidx.annotation.q0 b bVar) {
            Object tag = view.getTag(a.e.f22988h0);
            if (bVar == null) {
                view.setTag(a.e.f23004p0, null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(null);
                    return;
                }
                return;
            }
            View.OnApplyWindowInsetsListener aVar = new a(view, bVar);
            view.setTag(a.e.f23004p0, aVar);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(aVar);
            }
        }
    }

    /* compiled from: WindowInsetsAnimationCompat.java */
    private static class e {

        /* renamed from: a, reason: collision with root package name */
        private final int f5809a;

        /* renamed from: b, reason: collision with root package name */
        private float f5810b;

        /* renamed from: c, reason: collision with root package name */
        @androidx.annotation.q0
        private final Interpolator f5811c;

        /* renamed from: d, reason: collision with root package name */
        private final long f5812d;

        /* renamed from: e, reason: collision with root package name */
        private float f5813e;

        e(int i5, @androidx.annotation.q0 Interpolator interpolator, long j5) {
            this.f5809a = i5;
            this.f5811c = interpolator;
            this.f5812d = j5;
        }

        public float a() {
            return this.f5813e;
        }

        public long b() {
            return this.f5812d;
        }

        public float c() {
            return this.f5810b;
        }

        public float d() {
            Interpolator interpolator = this.f5811c;
            return interpolator != null ? interpolator.getInterpolation(this.f5810b) : this.f5810b;
        }

        @androidx.annotation.q0
        public Interpolator e() {
            return this.f5811c;
        }

        public int f() {
            return this.f5809a;
        }

        public void g(float f6) {
            this.f5813e = f6;
        }

        public void h(float f6) {
            this.f5810b = f6;
        }
    }

    public y3(int i5, @androidx.annotation.q0 Interpolator interpolator, long j5) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f5780a = new d(i5, interpolator, j5);
        } else {
            this.f5780a = new c(i5, interpolator, j5);
        }
    }

    static void h(@androidx.annotation.o0 View view, @androidx.annotation.q0 b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.l(view, bVar);
        } else {
            c.s(view, bVar);
        }
    }

    @androidx.annotation.x0(30)
    static y3 j(WindowInsetsAnimation windowInsetsAnimation) {
        return new y3(windowInsetsAnimation);
    }

    @androidx.annotation.x(from = com.google.firebase.remoteconfig.p.f18289o, to = 1.0d)
    public float a() {
        return this.f5780a.a();
    }

    public long b() {
        return this.f5780a.b();
    }

    @androidx.annotation.x(from = com.google.firebase.remoteconfig.p.f18289o, to = 1.0d)
    public float c() {
        return this.f5780a.c();
    }

    public float d() {
        return this.f5780a.d();
    }

    @androidx.annotation.q0
    public Interpolator e() {
        return this.f5780a.e();
    }

    public int f() {
        return this.f5780a.f();
    }

    public void g(@androidx.annotation.x(from = 0.0d, to = 1.0d) float f6) {
        this.f5780a.g(f6);
    }

    public void i(@androidx.annotation.x(from = 0.0d, to = 1.0d) float f6) {
        this.f5780a.h(f6);
    }

    /* compiled from: WindowInsetsAnimationCompat.java */
    @androidx.annotation.x0(30)
    /* loaded from: classes3.dex */
    private static class d extends e {

        /* renamed from: f, reason: collision with root package name */
        @androidx.annotation.o0
        private final WindowInsetsAnimation f5804f;

        /* compiled from: WindowInsetsAnimationCompat.java */
        @androidx.annotation.x0(30)
        /* loaded from: classes.dex */
        private static class a extends WindowInsetsAnimation.Callback {

            /* renamed from: a, reason: collision with root package name */
            private final b f5805a;

            /* renamed from: b, reason: collision with root package name */
            private List<y3> f5806b;

            /* renamed from: c, reason: collision with root package name */
            private ArrayList<y3> f5807c;

            /* renamed from: d, reason: collision with root package name */
            private final HashMap<WindowInsetsAnimation, y3> f5808d;

            a(@androidx.annotation.o0 b bVar) {
                super(bVar.a());
                this.f5808d = new HashMap<>();
                this.f5805a = bVar;
            }

            @androidx.annotation.o0
            private y3 a(@androidx.annotation.o0 WindowInsetsAnimation windowInsetsAnimation) {
                y3 y3Var = this.f5808d.get(windowInsetsAnimation);
                if (y3Var != null) {
                    return y3Var;
                }
                y3 j5 = y3.j(windowInsetsAnimation);
                this.f5808d.put(windowInsetsAnimation, j5);
                return j5;
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public void onEnd(@androidx.annotation.o0 WindowInsetsAnimation windowInsetsAnimation) {
                this.f5805a.b(a(windowInsetsAnimation));
                this.f5808d.remove(windowInsetsAnimation);
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public void onPrepare(@androidx.annotation.o0 WindowInsetsAnimation windowInsetsAnimation) {
                this.f5805a.c(a(windowInsetsAnimation));
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            @androidx.annotation.o0
            public WindowInsets onProgress(@androidx.annotation.o0 WindowInsets windowInsets, @androidx.annotation.o0 List<WindowInsetsAnimation> list) {
                float fraction;
                ArrayList<y3> arrayList = this.f5807c;
                if (arrayList == null) {
                    ArrayList<y3> arrayList2 = new ArrayList<>(list.size());
                    this.f5807c = arrayList2;
                    this.f5806b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimation = list.get(size);
                    y3 a6 = a(windowInsetsAnimation);
                    fraction = windowInsetsAnimation.getFraction();
                    a6.i(fraction);
                    this.f5807c.add(a6);
                }
                return this.f5805a.d(v4.K(windowInsets), this.f5806b).J();
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            @androidx.annotation.o0
            public WindowInsetsAnimation.Bounds onStart(@androidx.annotation.o0 WindowInsetsAnimation windowInsetsAnimation, @androidx.annotation.o0 WindowInsetsAnimation.Bounds bounds) {
                a e6 = this.f5805a.e(a(windowInsetsAnimation), a.e(bounds));
                e6.getClass();
                return d.i(e6);
            }
        }

        d(@androidx.annotation.o0 WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f5804f = windowInsetsAnimation;
        }

        @androidx.annotation.o0
        public static WindowInsetsAnimation.Bounds i(@androidx.annotation.o0 a aVar) {
            return new WindowInsetsAnimation.Bounds(aVar.a().h(), aVar.b().h());
        }

        @androidx.annotation.o0
        public static androidx.core.graphics.w1 j(@androidx.annotation.o0 WindowInsetsAnimation.Bounds bounds) {
            Insets upperBound;
            upperBound = bounds.getUpperBound();
            return androidx.core.graphics.w1.g(upperBound);
        }

        @androidx.annotation.o0
        public static androidx.core.graphics.w1 k(@androidx.annotation.o0 WindowInsetsAnimation.Bounds bounds) {
            Insets lowerBound;
            lowerBound = bounds.getLowerBound();
            return androidx.core.graphics.w1.g(lowerBound);
        }

        public static void l(@androidx.annotation.o0 View view, @androidx.annotation.q0 b bVar) {
            view.setWindowInsetsAnimationCallback(bVar != null ? new a(bVar) : null);
        }

        @Override // androidx.core.view.y3.e
        public long b() {
            long durationMillis;
            durationMillis = this.f5804f.getDurationMillis();
            return durationMillis;
        }

        @Override // androidx.core.view.y3.e
        public float c() {
            float fraction;
            fraction = this.f5804f.getFraction();
            return fraction;
        }

        @Override // androidx.core.view.y3.e
        public float d() {
            float interpolatedFraction;
            interpolatedFraction = this.f5804f.getInterpolatedFraction();
            return interpolatedFraction;
        }

        @Override // androidx.core.view.y3.e
        @androidx.annotation.q0
        public Interpolator e() {
            Interpolator interpolator;
            interpolator = this.f5804f.getInterpolator();
            return interpolator;
        }

        @Override // androidx.core.view.y3.e
        public int f() {
            int typeMask;
            typeMask = this.f5804f.getTypeMask();
            return typeMask;
        }

        @Override // androidx.core.view.y3.e
        public void h(float f6) {
            this.f5804f.setFraction(f6);
        }

        d(int i5, Interpolator interpolator, long j5) {
            this(new WindowInsetsAnimation(i5, interpolator, j5));
        }
    }

    /* compiled from: WindowInsetsAnimationCompat.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final androidx.core.graphics.w1 f5781a;

        /* renamed from: b, reason: collision with root package name */
        private final androidx.core.graphics.w1 f5782b;

        public a(@androidx.annotation.o0 androidx.core.graphics.w1 w1Var, @androidx.annotation.o0 androidx.core.graphics.w1 w1Var2) {
            this.f5781a = w1Var;
            this.f5782b = w1Var2;
        }

        @androidx.annotation.o0
        @androidx.annotation.x0(30)
        public static a e(@androidx.annotation.o0 WindowInsetsAnimation.Bounds bounds) {
            return new a(bounds);
        }

        @androidx.annotation.o0
        public androidx.core.graphics.w1 a() {
            return this.f5781a;
        }

        @androidx.annotation.o0
        public androidx.core.graphics.w1 b() {
            return this.f5782b;
        }

        @androidx.annotation.o0
        public a c(@androidx.annotation.o0 androidx.core.graphics.w1 w1Var) {
            return new a(v4.z(this.f5781a, w1Var.f4813a, w1Var.f4814b, w1Var.f4815c, w1Var.f4816d), v4.z(this.f5782b, w1Var.f4813a, w1Var.f4814b, w1Var.f4815c, w1Var.f4816d));
        }

        @androidx.annotation.o0
        @androidx.annotation.x0(30)
        public WindowInsetsAnimation.Bounds d() {
            return d.i(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.f5781a + " upper=" + this.f5782b + "}";
        }

        @androidx.annotation.x0(30)
        private a(@androidx.annotation.o0 WindowInsetsAnimation.Bounds bounds) {
            this.f5781a = d.k(bounds);
            this.f5782b = d.j(bounds);
        }
    }

    @androidx.annotation.x0(30)
    private y3(@androidx.annotation.o0 WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f5780a = new d(windowInsetsAnimation);
        }
    }
}
