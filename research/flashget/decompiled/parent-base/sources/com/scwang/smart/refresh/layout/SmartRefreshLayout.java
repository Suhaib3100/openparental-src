package com.scwang.smart.refresh.layout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.n;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.view.b1;
import androidx.core.view.c1;
import androidx.core.view.x1;
import androidx.core.view.y0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.remoteconfig.p;
import rc.b;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes6.dex */
public class SmartRefreshLayout extends ViewGroup implements qc.f, b1 {
    protected static sc.b D3;
    protected static sc.c E3;
    protected static sc.d F3;
    protected static ViewGroup.MarginLayoutParams G3 = new ViewGroup.MarginLayoutParams(-1, -1);
    protected Interpolator A;
    protected MotionEvent A3;
    protected int[] B;
    protected Runnable B3;
    protected boolean C;
    protected ValueAnimator C3;
    protected boolean D;
    protected boolean E;
    protected boolean F;
    protected boolean G;
    protected boolean H;
    protected boolean I;
    protected boolean J;
    protected boolean K;
    protected boolean L;
    protected boolean L2;
    protected boolean M;
    protected boolean M2;
    protected boolean N;
    protected boolean N2;
    protected boolean O;
    protected boolean O2;
    protected boolean P;
    protected boolean P2;
    protected boolean Q;
    protected boolean Q1;
    protected sc.g Q2;
    protected boolean R;
    protected sc.e R2;
    protected sc.f S2;
    protected sc.j T2;
    protected int U2;
    protected boolean V1;
    protected boolean V2;
    protected int[] W2;
    protected y0 X2;
    protected c1 Y2;
    protected int Z2;

    /* renamed from: a3, reason: collision with root package name */
    protected com.scwang.smart.refresh.layout.constant.a f70567a3;

    /* renamed from: b, reason: collision with root package name */
    protected int f70568b;

    /* renamed from: b3, reason: collision with root package name */
    protected int f70569b3;

    /* renamed from: c, reason: collision with root package name */
    protected int f70570c;

    /* renamed from: c3, reason: collision with root package name */
    protected com.scwang.smart.refresh.layout.constant.a f70571c3;

    /* renamed from: d, reason: collision with root package name */
    protected int f70572d;

    /* renamed from: d3, reason: collision with root package name */
    protected int f70573d3;

    /* renamed from: e, reason: collision with root package name */
    protected int f70574e;

    /* renamed from: e3, reason: collision with root package name */
    protected int f70575e3;

    /* renamed from: f, reason: collision with root package name */
    protected int f70576f;

    /* renamed from: f3, reason: collision with root package name */
    protected float f70577f3;

    /* renamed from: g, reason: collision with root package name */
    protected int f70578g;

    /* renamed from: g3, reason: collision with root package name */
    protected float f70579g3;

    /* renamed from: h, reason: collision with root package name */
    protected int f70580h;

    /* renamed from: h3, reason: collision with root package name */
    protected float f70581h3;

    /* renamed from: i, reason: collision with root package name */
    protected float f70582i;

    /* renamed from: i3, reason: collision with root package name */
    protected float f70583i3;

    /* renamed from: j, reason: collision with root package name */
    protected float f70584j;

    /* renamed from: j3, reason: collision with root package name */
    protected float f70585j3;

    /* renamed from: k, reason: collision with root package name */
    protected float f70586k;

    /* renamed from: k3, reason: collision with root package name */
    protected qc.a f70587k3;

    /* renamed from: l, reason: collision with root package name */
    protected float f70588l;

    /* renamed from: l3, reason: collision with root package name */
    protected qc.a f70589l3;

    /* renamed from: m, reason: collision with root package name */
    protected float f70590m;

    /* renamed from: m3, reason: collision with root package name */
    protected qc.b f70591m3;

    /* renamed from: n, reason: collision with root package name */
    protected char f70592n;

    /* renamed from: n3, reason: collision with root package name */
    protected Paint f70593n3;

    /* renamed from: o, reason: collision with root package name */
    protected boolean f70594o;

    /* renamed from: o3, reason: collision with root package name */
    protected Handler f70595o3;

    /* renamed from: p, reason: collision with root package name */
    protected boolean f70596p;

    /* renamed from: p3, reason: collision with root package name */
    protected qc.e f70597p3;

    /* renamed from: q, reason: collision with root package name */
    protected boolean f70598q;

    /* renamed from: q3, reason: collision with root package name */
    protected com.scwang.smart.refresh.layout.constant.b f70599q3;

    /* renamed from: r, reason: collision with root package name */
    protected int f70600r;

    /* renamed from: r3, reason: collision with root package name */
    protected com.scwang.smart.refresh.layout.constant.b f70601r3;

    /* renamed from: s, reason: collision with root package name */
    protected int f70602s;

    /* renamed from: s3, reason: collision with root package name */
    protected long f70603s3;

    /* renamed from: t, reason: collision with root package name */
    protected int f70604t;

    /* renamed from: t3, reason: collision with root package name */
    protected int f70605t3;

    /* renamed from: u, reason: collision with root package name */
    protected int f70606u;

    /* renamed from: u3, reason: collision with root package name */
    protected int f70607u3;

    /* renamed from: v, reason: collision with root package name */
    protected int f70608v;

    /* renamed from: v3, reason: collision with root package name */
    protected boolean f70609v3;

    /* renamed from: w, reason: collision with root package name */
    protected int f70610w;

    /* renamed from: w3, reason: collision with root package name */
    protected boolean f70611w3;

    /* renamed from: x, reason: collision with root package name */
    protected int f70612x;

    /* renamed from: x3, reason: collision with root package name */
    protected boolean f70613x3;

    /* renamed from: y, reason: collision with root package name */
    protected Scroller f70614y;

    /* renamed from: y3, reason: collision with root package name */
    protected boolean f70615y3;

    /* renamed from: z, reason: collision with root package name */
    protected VelocityTracker f70616z;

    /* renamed from: z3, reason: collision with root package name */
    protected boolean f70617z3;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f70620a;

        static {
            int[] iArr = new int[com.scwang.smart.refresh.layout.constant.b.values().length];
            f70620a = iArr;
            try {
                iArr[com.scwang.smart.refresh.layout.constant.b.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f70620a[com.scwang.smart.refresh.layout.constant.b.PullDownToRefresh.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f70620a[com.scwang.smart.refresh.layout.constant.b.PullUpToLoad.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f70620a[com.scwang.smart.refresh.layout.constant.b.PullDownCanceled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f70620a[com.scwang.smart.refresh.layout.constant.b.PullUpCanceled.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f70620a[com.scwang.smart.refresh.layout.constant.b.ReleaseToRefresh.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f70620a[com.scwang.smart.refresh.layout.constant.b.ReleaseToLoad.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f70620a[com.scwang.smart.refresh.layout.constant.b.ReleaseToTwoLevel.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f70620a[com.scwang.smart.refresh.layout.constant.b.RefreshReleased.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f70620a[com.scwang.smart.refresh.layout.constant.b.LoadReleased.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f70620a[com.scwang.smart.refresh.layout.constant.b.Refreshing.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f70620a[com.scwang.smart.refresh.layout.constant.b.Loading.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    class b extends AnimatorListenerAdapter {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f70621b;

        b(boolean z4) {
            this.f70621b = z4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (animator == null || animator.getDuration() != 0) {
                SmartRefreshLayout.this.T0(this.f70621b);
            }
        }
    }

    class c extends AnimatorListenerAdapter {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f70623b;

        c(boolean z4) {
            this.f70623b = z4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (animator == null || animator.getDuration() != 0) {
                SmartRefreshLayout.this.f70603s3 = System.currentTimeMillis();
                SmartRefreshLayout.this.O0(com.scwang.smart.refresh.layout.constant.b.Refreshing);
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                sc.g gVar = smartRefreshLayout.Q2;
                if (gVar != null) {
                    if (this.f70623b) {
                        gVar.t(smartRefreshLayout);
                    }
                } else if (smartRefreshLayout.S2 == null) {
                    smartRefreshLayout.i0(3000);
                }
                SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                qc.a aVar = smartRefreshLayout2.f70587k3;
                if (aVar != null) {
                    float f4 = smartRefreshLayout2.f70577f3;
                    if (f4 < 10.0f) {
                        f4 *= smartRefreshLayout2.Z2;
                    }
                    aVar.r(smartRefreshLayout2, smartRefreshLayout2.Z2, (int) f4);
                }
                SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
                sc.f fVar = smartRefreshLayout3.S2;
                if (fVar == null || !(smartRefreshLayout3.f70587k3 instanceof qc.d)) {
                    return;
                }
                if (this.f70623b) {
                    fVar.t(smartRefreshLayout3);
                }
                SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
                float f5 = smartRefreshLayout4.f70577f3;
                if (f5 < 10.0f) {
                    f5 *= smartRefreshLayout4.Z2;
                }
                smartRefreshLayout4.S2.j((qc.d) smartRefreshLayout4.f70587k3, smartRefreshLayout4.Z2, (int) f5);
            }
        }
    }

    class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            com.scwang.smart.refresh.layout.constant.b bVar;
            com.scwang.smart.refresh.layout.constant.b bVar2;
            if (animator == null || animator.getDuration() != 0) {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                smartRefreshLayout.C3 = null;
                if (smartRefreshLayout.f70570c == 0 && (bVar = smartRefreshLayout.f70599q3) != (bVar2 = com.scwang.smart.refresh.layout.constant.b.None) && !bVar.isOpening && !bVar.isDragging) {
                    smartRefreshLayout.O0(bVar2);
                    return;
                }
                com.scwang.smart.refresh.layout.constant.b bVar3 = smartRefreshLayout.f70599q3;
                if (bVar3 != smartRefreshLayout.f70601r3) {
                    smartRefreshLayout.W0(bVar3);
                }
            }
        }
    }

    class e implements ValueAnimator.AnimatorUpdateListener {
        e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SmartRefreshLayout.this.f70597p3.j(((Integer) valueAnimator.getAnimatedValue()).intValue(), false);
        }
    }

    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            sc.e eVar = smartRefreshLayout.R2;
            if (eVar != null) {
                eVar.m(smartRefreshLayout);
            } else if (smartRefreshLayout.S2 == null) {
                smartRefreshLayout.I(2000);
            }
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            sc.f fVar = smartRefreshLayout2.S2;
            if (fVar != null) {
                fVar.m(smartRefreshLayout2);
            }
        }
    }

    class g implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        int f70628b = 0;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f70629c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Boolean f70630d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f70631e;

        g(int i4, Boolean bool, boolean z4) {
            this.f70629c = i4;
            this.f70630d = bool;
            this.f70631e = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i4 = this.f70628b;
            if (i4 == 0) {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                com.scwang.smart.refresh.layout.constant.b bVar = smartRefreshLayout.f70599q3;
                com.scwang.smart.refresh.layout.constant.b bVar2 = com.scwang.smart.refresh.layout.constant.b.None;
                if (bVar == bVar2 && smartRefreshLayout.f70601r3 == com.scwang.smart.refresh.layout.constant.b.Refreshing) {
                    smartRefreshLayout.f70601r3 = bVar2;
                } else {
                    ValueAnimator valueAnimator = smartRefreshLayout.C3;
                    if (valueAnimator != null && bVar.isHeader && (bVar.isDragging || bVar == com.scwang.smart.refresh.layout.constant.b.RefreshReleased)) {
                        valueAnimator.setDuration(0L);
                        SmartRefreshLayout.this.C3.cancel();
                        SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                        smartRefreshLayout2.C3 = null;
                        if (smartRefreshLayout2.f70597p3.f(0) == null) {
                            SmartRefreshLayout.this.O0(bVar2);
                        } else {
                            SmartRefreshLayout.this.O0(com.scwang.smart.refresh.layout.constant.b.PullDownCanceled);
                        }
                    } else if (bVar == com.scwang.smart.refresh.layout.constant.b.Refreshing && smartRefreshLayout.f70587k3 != null && smartRefreshLayout.f70591m3 != null) {
                        this.f70628b = i4 + 1;
                        smartRefreshLayout.f70595o3.postDelayed(this, this.f70629c);
                        SmartRefreshLayout.this.O0(com.scwang.smart.refresh.layout.constant.b.RefreshFinish);
                        if (this.f70630d == Boolean.FALSE) {
                            SmartRefreshLayout.this.a(false);
                        }
                    }
                }
                if (this.f70630d == Boolean.TRUE) {
                    SmartRefreshLayout.this.a(true);
                    return;
                }
                return;
            }
            SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
            int l4 = smartRefreshLayout3.f70587k3.l(smartRefreshLayout3, this.f70631e);
            SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
            sc.f fVar = smartRefreshLayout4.S2;
            if (fVar != null) {
                qc.a aVar = smartRefreshLayout4.f70587k3;
                if (aVar instanceof qc.d) {
                    fVar.s((qc.d) aVar, this.f70631e);
                }
            }
            if (l4 < Integer.MAX_VALUE) {
                SmartRefreshLayout smartRefreshLayout5 = SmartRefreshLayout.this;
                if (smartRefreshLayout5.f70594o || smartRefreshLayout5.V2) {
                    long currentTimeMillis = System.currentTimeMillis();
                    SmartRefreshLayout smartRefreshLayout6 = SmartRefreshLayout.this;
                    if (smartRefreshLayout6.f70594o) {
                        float f4 = smartRefreshLayout6.f70588l;
                        smartRefreshLayout6.f70584j = f4;
                        smartRefreshLayout6.f70574e = 0;
                        smartRefreshLayout6.f70594o = false;
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 0, smartRefreshLayout6.f70586k, (f4 + smartRefreshLayout6.f70570c) - (smartRefreshLayout6.f70568b * 2), 0));
                        SmartRefreshLayout smartRefreshLayout7 = SmartRefreshLayout.this;
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 2, smartRefreshLayout7.f70586k, smartRefreshLayout7.f70588l + smartRefreshLayout7.f70570c, 0));
                    }
                    SmartRefreshLayout smartRefreshLayout8 = SmartRefreshLayout.this;
                    if (smartRefreshLayout8.V2) {
                        smartRefreshLayout8.U2 = 0;
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 1, smartRefreshLayout8.f70586k, smartRefreshLayout8.f70588l, 0));
                        SmartRefreshLayout smartRefreshLayout9 = SmartRefreshLayout.this;
                        smartRefreshLayout9.V2 = false;
                        smartRefreshLayout9.f70574e = 0;
                    }
                }
                SmartRefreshLayout smartRefreshLayout10 = SmartRefreshLayout.this;
                int i5 = smartRefreshLayout10.f70570c;
                if (i5 <= 0) {
                    if (i5 < 0) {
                        smartRefreshLayout10.I0(0, l4, smartRefreshLayout10.A, smartRefreshLayout10.f70578g);
                        return;
                    } else {
                        smartRefreshLayout10.f70597p3.j(0, false);
                        SmartRefreshLayout.this.f70597p3.o(com.scwang.smart.refresh.layout.constant.b.None);
                        return;
                    }
                }
                ValueAnimator I0 = smartRefreshLayout10.I0(0, l4, smartRefreshLayout10.A, smartRefreshLayout10.f70578g);
                SmartRefreshLayout smartRefreshLayout11 = SmartRefreshLayout.this;
                ValueAnimator.AnimatorUpdateListener h4 = smartRefreshLayout11.P ? smartRefreshLayout11.f70591m3.h(smartRefreshLayout11.f70570c) : null;
                if (I0 == null || h4 == null) {
                    return;
                }
                I0.addUpdateListener(h4);
            }
        }
    }

    class h implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        int f70633b = 0;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f70634c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f70635d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f70636e;

        class a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f70638b;

            /* renamed from: com.scwang.smart.refresh.layout.SmartRefreshLayout$h$a$a, reason: collision with other inner class name */
            class C0990a extends AnimatorListenerAdapter {
                C0990a() {
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (animator == null || animator.getDuration() != 0) {
                        h hVar = h.this;
                        SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                        smartRefreshLayout.f70615y3 = false;
                        if (hVar.f70635d) {
                            smartRefreshLayout.a(true);
                        }
                        SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                        if (smartRefreshLayout2.f70599q3 == com.scwang.smart.refresh.layout.constant.b.LoadFinish) {
                            smartRefreshLayout2.O0(com.scwang.smart.refresh.layout.constant.b.None);
                        }
                    }
                }
            }

            a(int i4) {
                this.f70638b = i4;
            }

            @Override // java.lang.Runnable
            public void run() {
                ValueAnimator.AnimatorUpdateListener animatorUpdateListener;
                ValueAnimator valueAnimator;
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                if (!smartRefreshLayout.O || this.f70638b >= 0) {
                    animatorUpdateListener = null;
                } else {
                    animatorUpdateListener = smartRefreshLayout.f70591m3.h(smartRefreshLayout.f70570c);
                    if (animatorUpdateListener != null) {
                        animatorUpdateListener.onAnimationUpdate(ValueAnimator.ofInt(0, 0));
                    }
                }
                C0990a c0990a = new C0990a();
                h hVar = h.this;
                SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                int i4 = smartRefreshLayout2.f70570c;
                if (i4 > 0) {
                    valueAnimator = smartRefreshLayout2.f70597p3.f(0);
                } else {
                    if (animatorUpdateListener != null || i4 == 0) {
                        ValueAnimator valueAnimator2 = smartRefreshLayout2.C3;
                        if (valueAnimator2 != null) {
                            valueAnimator2.setDuration(0L);
                            SmartRefreshLayout.this.C3.cancel();
                            SmartRefreshLayout.this.C3 = null;
                        }
                        SmartRefreshLayout.this.f70597p3.j(0, false);
                        SmartRefreshLayout.this.f70597p3.o(com.scwang.smart.refresh.layout.constant.b.None);
                    } else if (hVar.f70635d && smartRefreshLayout2.I) {
                        int i5 = smartRefreshLayout2.f70569b3;
                        if (i4 >= (-i5)) {
                            smartRefreshLayout2.O0(com.scwang.smart.refresh.layout.constant.b.None);
                        } else {
                            valueAnimator = smartRefreshLayout2.f70597p3.f(-i5);
                        }
                    } else {
                        valueAnimator = smartRefreshLayout2.f70597p3.f(0);
                    }
                    valueAnimator = null;
                }
                if (valueAnimator != null) {
                    valueAnimator.addListener(c0990a);
                } else {
                    c0990a.onAnimationEnd(null);
                }
            }
        }

        h(int i4, boolean z4, boolean z5) {
            this.f70634c = i4;
            this.f70635d = z4;
            this.f70636e = z5;
        }

        /* JADX WARN: Code restructure failed: missing block: B:48:0x00b0, code lost:
        
            if (r6.f70591m3.m() != false) goto L49;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 329
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scwang.smart.refresh.layout.SmartRefreshLayout.h.run():void");
        }
    }

    class i implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f70641b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f70642c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f70643d;

        class a implements ValueAnimator.AnimatorUpdateListener {
            a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                if (smartRefreshLayout.C3 == null || smartRefreshLayout.f70587k3 == null) {
                    return;
                }
                smartRefreshLayout.f70597p3.j(((Integer) valueAnimator.getAnimatedValue()).intValue(), true);
            }
        }

        class b extends AnimatorListenerAdapter {
            b() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                i iVar = i.this;
                SmartRefreshLayout.this.f70597p3.g(animator, iVar.f70643d);
            }
        }

        i(int i4, float f4, boolean z4) {
            this.f70641b = i4;
            this.f70642c = f4;
            this.f70643d = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.f70601r3 != com.scwang.smart.refresh.layout.constant.b.Refreshing) {
                return;
            }
            ValueAnimator valueAnimator = smartRefreshLayout.C3;
            if (valueAnimator != null) {
                valueAnimator.setDuration(0L);
                SmartRefreshLayout.this.C3.cancel();
                SmartRefreshLayout.this.C3 = null;
            }
            SmartRefreshLayout.this.f70586k = r0.getMeasuredWidth() / 2.0f;
            SmartRefreshLayout.this.f70597p3.o(com.scwang.smart.refresh.layout.constant.b.PullDownToRefresh);
            qc.a aVar = SmartRefreshLayout.this.f70587k3;
            if (aVar == null || !aVar.o(this.f70641b, this.f70642c, this.f70643d)) {
                SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                int i4 = smartRefreshLayout2.Z2;
                float f4 = i4 == 0 ? smartRefreshLayout2.f70581h3 : i4;
                float f5 = this.f70642c;
                if (f5 < 10.0f) {
                    f5 *= f4;
                }
                smartRefreshLayout2.C3 = ValueAnimator.ofInt(smartRefreshLayout2.f70570c, (int) f5);
                SmartRefreshLayout.this.C3.setDuration(this.f70641b);
                SmartRefreshLayout.this.C3.setInterpolator(new com.scwang.smart.refresh.layout.util.b(com.scwang.smart.refresh.layout.util.b.f70701b));
                SmartRefreshLayout.this.C3.addUpdateListener(new a());
                SmartRefreshLayout.this.C3.addListener(new b());
                SmartRefreshLayout.this.C3.start();
            }
        }
    }

    class j implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f70647b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f70648c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f70649d;

        class a implements ValueAnimator.AnimatorUpdateListener {
            a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                if (smartRefreshLayout.C3 == null || smartRefreshLayout.f70589l3 == null) {
                    return;
                }
                smartRefreshLayout.f70597p3.j(((Integer) valueAnimator.getAnimatedValue()).intValue(), true);
            }
        }

        class b extends AnimatorListenerAdapter {
            b() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                j jVar = j.this;
                SmartRefreshLayout.this.f70597p3.l(animator, jVar.f70649d);
            }
        }

        j(int i4, float f4, boolean z4) {
            this.f70647b = i4;
            this.f70648c = f4;
            this.f70649d = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.f70601r3 != com.scwang.smart.refresh.layout.constant.b.Loading) {
                return;
            }
            ValueAnimator valueAnimator = smartRefreshLayout.C3;
            if (valueAnimator != null) {
                valueAnimator.setDuration(0L);
                SmartRefreshLayout.this.C3.cancel();
                SmartRefreshLayout.this.C3 = null;
            }
            SmartRefreshLayout.this.f70586k = r0.getMeasuredWidth() / 2.0f;
            SmartRefreshLayout.this.f70597p3.o(com.scwang.smart.refresh.layout.constant.b.PullUpToLoad);
            qc.a aVar = SmartRefreshLayout.this.f70589l3;
            if (aVar == null || !aVar.o(this.f70647b, this.f70648c, this.f70649d)) {
                SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                int i4 = smartRefreshLayout2.f70569b3;
                float f4 = i4 == 0 ? smartRefreshLayout2.f70583i3 : i4;
                float f5 = this.f70648c;
                if (f5 < 10.0f) {
                    f5 *= f4;
                }
                smartRefreshLayout2.C3 = ValueAnimator.ofInt(smartRefreshLayout2.f70570c, -((int) f5));
                SmartRefreshLayout.this.C3.setDuration(this.f70647b);
                SmartRefreshLayout.this.C3.setInterpolator(new com.scwang.smart.refresh.layout.util.b(com.scwang.smart.refresh.layout.util.b.f70701b));
                SmartRefreshLayout.this.C3.addUpdateListener(new a());
                SmartRefreshLayout.this.C3.addListener(new b());
                SmartRefreshLayout.this.C3.start();
            }
        }
    }

    protected class k implements Runnable {

        /* renamed from: d, reason: collision with root package name */
        int f70655d;

        /* renamed from: g, reason: collision with root package name */
        float f70658g;

        /* renamed from: b, reason: collision with root package name */
        int f70653b = 0;

        /* renamed from: c, reason: collision with root package name */
        int f70654c = 10;

        /* renamed from: f, reason: collision with root package name */
        float f70657f = 0.0f;

        /* renamed from: e, reason: collision with root package name */
        long f70656e = AnimationUtils.currentAnimationTimeMillis();

        k(float f4, int i4) {
            this.f70658g = f4;
            this.f70655d = i4;
            SmartRefreshLayout.this.f70595o3.postDelayed(this, this.f70654c);
            if (f4 > 0.0f) {
                SmartRefreshLayout.this.f70597p3.o(com.scwang.smart.refresh.layout.constant.b.PullDownToRefresh);
            } else {
                SmartRefreshLayout.this.f70597p3.o(com.scwang.smart.refresh.layout.constant.b.PullUpToLoad);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.B3 != this || smartRefreshLayout.f70599q3.isFinishing) {
                return;
            }
            if (Math.abs(smartRefreshLayout.f70570c) < Math.abs(this.f70655d)) {
                double d5 = this.f70658g;
                this.f70653b = this.f70653b + 1;
                this.f70658g = (float) (Math.pow(0.949999988079071d, r2 * 2) * d5);
            } else if (this.f70655d != 0) {
                double d6 = this.f70658g;
                this.f70653b = this.f70653b + 1;
                this.f70658g = (float) (Math.pow(0.44999998807907104d, r2 * 2) * d6);
            } else {
                double d7 = this.f70658g;
                this.f70653b = this.f70653b + 1;
                this.f70658g = (float) (Math.pow(0.8500000238418579d, r2 * 2) * d7);
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float f4 = this.f70658g * (((currentAnimationTimeMillis - this.f70656e) * 1.0f) / 1000.0f);
            if (Math.abs(f4) >= 1.0f) {
                this.f70656e = currentAnimationTimeMillis;
                float f5 = this.f70657f + f4;
                this.f70657f = f5;
                SmartRefreshLayout.this.N0(f5);
                SmartRefreshLayout.this.f70595o3.postDelayed(this, this.f70654c);
                return;
            }
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            com.scwang.smart.refresh.layout.constant.b bVar = smartRefreshLayout2.f70601r3;
            boolean z4 = bVar.isDragging;
            if (z4 && bVar.isHeader) {
                smartRefreshLayout2.f70597p3.o(com.scwang.smart.refresh.layout.constant.b.PullDownCanceled);
            } else if (z4 && bVar.isFooter) {
                smartRefreshLayout2.f70597p3.o(com.scwang.smart.refresh.layout.constant.b.PullUpCanceled);
            }
            SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
            smartRefreshLayout3.B3 = null;
            if (Math.abs(smartRefreshLayout3.f70570c) >= Math.abs(this.f70655d)) {
                int min = Math.min(Math.max((int) com.scwang.smart.refresh.layout.util.b.i(Math.abs(SmartRefreshLayout.this.f70570c - this.f70655d)), 30), 100) * 10;
                SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
                smartRefreshLayout4.I0(this.f70655d, 0, smartRefreshLayout4.A, min);
            }
        }
    }

    protected class l implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        int f70660b;

        /* renamed from: e, reason: collision with root package name */
        float f70663e;

        /* renamed from: c, reason: collision with root package name */
        int f70661c = 0;

        /* renamed from: d, reason: collision with root package name */
        int f70662d = 10;

        /* renamed from: f, reason: collision with root package name */
        float f70664f = 0.98f;

        /* renamed from: g, reason: collision with root package name */
        long f70665g = 0;

        /* renamed from: h, reason: collision with root package name */
        long f70666h = AnimationUtils.currentAnimationTimeMillis();

        l(float f4) {
            this.f70663e = f4;
            this.f70660b = SmartRefreshLayout.this.f70570c;
        }

        /* JADX WARN: Code restructure failed: missing block: B:48:0x0057, code lost:
        
            if (r0.f70570c > r0.Z2) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0049, code lost:
        
            if (r0.f70570c >= (-r0.f70569b3)) goto L29;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Runnable a() {
            /*
                r11 = this;
                com.scwang.smart.refresh.layout.SmartRefreshLayout r0 = com.scwang.smart.refresh.layout.SmartRefreshLayout.this
                com.scwang.smart.refresh.layout.constant.b r1 = r0.f70599q3
                boolean r2 = r1.isFinishing
                r3 = 0
                if (r2 == 0) goto La
                return r3
            La:
                int r2 = r0.f70570c
                if (r2 == 0) goto La7
                boolean r1 = r1.isOpening
                if (r1 != 0) goto L26
                boolean r1 = r0.L2
                if (r1 == 0) goto L59
                boolean r1 = r0.I
                if (r1 == 0) goto L59
                boolean r1 = r0.M2
                if (r1 == 0) goto L59
                boolean r1 = r0.D
                boolean r0 = r0.L0(r1)
                if (r0 == 0) goto L59
            L26:
                com.scwang.smart.refresh.layout.SmartRefreshLayout r0 = com.scwang.smart.refresh.layout.SmartRefreshLayout.this
                com.scwang.smart.refresh.layout.constant.b r1 = r0.f70599q3
                com.scwang.smart.refresh.layout.constant.b r2 = com.scwang.smart.refresh.layout.constant.b.Loading
                if (r1 == r2) goto L42
                boolean r1 = r0.L2
                if (r1 == 0) goto L4b
                boolean r1 = r0.I
                if (r1 == 0) goto L4b
                boolean r1 = r0.M2
                if (r1 == 0) goto L4b
                boolean r1 = r0.D
                boolean r0 = r0.L0(r1)
                if (r0 == 0) goto L4b
            L42:
                com.scwang.smart.refresh.layout.SmartRefreshLayout r0 = com.scwang.smart.refresh.layout.SmartRefreshLayout.this
                int r1 = r0.f70570c
                int r0 = r0.f70569b3
                int r0 = -r0
                if (r1 < r0) goto L59
            L4b:
                com.scwang.smart.refresh.layout.SmartRefreshLayout r0 = com.scwang.smart.refresh.layout.SmartRefreshLayout.this
                com.scwang.smart.refresh.layout.constant.b r1 = r0.f70599q3
                com.scwang.smart.refresh.layout.constant.b r2 = com.scwang.smart.refresh.layout.constant.b.Refreshing
                if (r1 != r2) goto La7
                int r1 = r0.f70570c
                int r0 = r0.Z2
                if (r1 <= r0) goto La7
            L59:
                com.scwang.smart.refresh.layout.SmartRefreshLayout r0 = com.scwang.smart.refresh.layout.SmartRefreshLayout.this
                int r0 = r0.f70570c
                float r1 = r11.f70663e
                r2 = 0
                r4 = r0
            L61:
                int r5 = r0 * r4
                if (r5 <= 0) goto La7
                double r5 = (double) r1
                float r1 = r11.f70664f
                double r7 = (double) r1
                int r2 = r2 + 1
                int r1 = r11.f70662d
                int r1 = r1 * r2
                float r1 = (float) r1
                r9 = 1092616192(0x41200000, float:10.0)
                float r1 = r1 / r9
                double r9 = (double) r1
                double r7 = java.lang.Math.pow(r7, r9)
                double r7 = r7 * r5
                float r1 = (float) r7
                int r5 = r11.f70662d
                float r5 = (float) r5
                r6 = 1065353216(0x3f800000, float:1.0)
                float r5 = r5 * r6
                r7 = 1148846080(0x447a0000, float:1000.0)
                float r5 = r5 / r7
                float r5 = r5 * r1
                float r7 = java.lang.Math.abs(r5)
                int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
                if (r6 >= 0) goto La3
                com.scwang.smart.refresh.layout.SmartRefreshLayout r0 = com.scwang.smart.refresh.layout.SmartRefreshLayout.this
                com.scwang.smart.refresh.layout.constant.b r1 = r0.f70599q3
                boolean r2 = r1.isOpening
                if (r2 == 0) goto La2
                com.scwang.smart.refresh.layout.constant.b r2 = com.scwang.smart.refresh.layout.constant.b.Refreshing
                if (r1 != r2) goto L9b
                int r5 = r0.Z2
                if (r4 > r5) goto La2
            L9b:
                if (r1 == r2) goto La7
                int r0 = r0.f70569b3
                int r0 = -r0
                if (r4 >= r0) goto La7
            La2:
                return r3
            La3:
                float r4 = (float) r4
                float r4 = r4 + r5
                int r4 = (int) r4
                goto L61
            La7:
                long r0 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
                r11.f70665g = r0
                com.scwang.smart.refresh.layout.SmartRefreshLayout r0 = com.scwang.smart.refresh.layout.SmartRefreshLayout.this
                android.os.Handler r0 = r0.f70595o3
                int r1 = r11.f70662d
                long r1 = (long) r1
                r0.postDelayed(r11, r1)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scwang.smart.refresh.layout.SmartRefreshLayout.l.a():java.lang.Runnable");
        }

        @Override // java.lang.Runnable
        public void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.B3 != this || smartRefreshLayout.f70599q3.isFinishing) {
                return;
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            long j4 = currentAnimationTimeMillis - this.f70666h;
            float pow = (float) (Math.pow(this.f70664f, (currentAnimationTimeMillis - this.f70665g) / (1000.0f / this.f70662d)) * this.f70663e);
            this.f70663e = pow;
            float f4 = ((j4 * 1.0f) / 1000.0f) * pow;
            if (Math.abs(f4) <= 1.0f) {
                SmartRefreshLayout.this.B3 = null;
                return;
            }
            this.f70666h = currentAnimationTimeMillis;
            int i4 = (int) (this.f70660b + f4);
            this.f70660b = i4;
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            if (smartRefreshLayout2.f70570c * i4 > 0) {
                smartRefreshLayout2.f70597p3.j(i4, true);
                SmartRefreshLayout.this.f70595o3.postDelayed(this, this.f70662d);
                return;
            }
            smartRefreshLayout2.B3 = null;
            smartRefreshLayout2.f70597p3.j(0, true);
            com.scwang.smart.refresh.layout.util.b.d(SmartRefreshLayout.this.f70591m3.j(), (int) (-this.f70663e));
            SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
            if (!smartRefreshLayout3.f70615y3 || f4 <= 0.0f) {
                return;
            }
            smartRefreshLayout3.f70615y3 = false;
        }
    }

    public class m implements qc.e {

        class a extends AnimatorListenerAdapter {
            a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (animator == null || animator.getDuration() != 0) {
                    SmartRefreshLayout.this.f70597p3.o(com.scwang.smart.refresh.layout.constant.b.TwoLevel);
                }
            }
        }

        public m() {
        }

        @Override // qc.e
        public qc.e a(float f4) {
            SmartRefreshLayout.this.f70585j3 = f4;
            return this;
        }

        @Override // qc.e
        public qc.e b(@o0 qc.a aVar, int i4) {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.f70593n3 == null && i4 != 0) {
                smartRefreshLayout.f70593n3 = new Paint();
            }
            if (aVar.equals(SmartRefreshLayout.this.f70587k3)) {
                SmartRefreshLayout.this.f70605t3 = i4;
            } else if (aVar.equals(SmartRefreshLayout.this.f70589l3)) {
                SmartRefreshLayout.this.f70607u3 = i4;
            }
            return this;
        }

        @Override // qc.e
        public qc.e c(@o0 qc.a aVar, boolean z4) {
            if (aVar.equals(SmartRefreshLayout.this.f70587k3)) {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                if (!smartRefreshLayout.O2) {
                    smartRefreshLayout.O2 = true;
                    smartRefreshLayout.G = z4;
                }
            } else if (aVar.equals(SmartRefreshLayout.this.f70589l3)) {
                SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                if (!smartRefreshLayout2.P2) {
                    smartRefreshLayout2.P2 = true;
                    smartRefreshLayout2.H = z4;
                }
            }
            return this;
        }

        @Override // qc.e
        public qc.e d(@o0 qc.a aVar) {
            if (aVar.equals(SmartRefreshLayout.this.f70587k3)) {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                com.scwang.smart.refresh.layout.constant.a aVar2 = smartRefreshLayout.f70567a3;
                if (aVar2.f70684b) {
                    smartRefreshLayout.f70567a3 = aVar2.c();
                }
            } else if (aVar.equals(SmartRefreshLayout.this.f70589l3)) {
                SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                com.scwang.smart.refresh.layout.constant.a aVar3 = smartRefreshLayout2.f70571c3;
                if (aVar3.f70684b) {
                    smartRefreshLayout2.f70571c3 = aVar3.c();
                }
            }
            return this;
        }

        @Override // qc.e
        public qc.e e() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.f70599q3 == com.scwang.smart.refresh.layout.constant.b.TwoLevel) {
                smartRefreshLayout.f70597p3.o(com.scwang.smart.refresh.layout.constant.b.TwoLevelFinish);
                if (SmartRefreshLayout.this.f70570c == 0) {
                    j(0, false);
                    SmartRefreshLayout.this.O0(com.scwang.smart.refresh.layout.constant.b.None);
                } else {
                    f(0).setDuration(SmartRefreshLayout.this.f70576f);
                }
            }
            return this;
        }

        @Override // qc.e
        public ValueAnimator f(int i4) {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            return smartRefreshLayout.I0(i4, 0, smartRefreshLayout.A, smartRefreshLayout.f70578g);
        }

        @Override // qc.e
        public qc.e g(Animator animator, boolean z4) {
            if (animator != null && animator.getDuration() == 0) {
                return this;
            }
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            smartRefreshLayout.C3 = null;
            if (smartRefreshLayout.f70587k3 != null) {
                com.scwang.smart.refresh.layout.constant.b bVar = smartRefreshLayout.f70599q3;
                com.scwang.smart.refresh.layout.constant.b bVar2 = com.scwang.smart.refresh.layout.constant.b.ReleaseToRefresh;
                if (bVar != bVar2) {
                    o(bVar2);
                }
                SmartRefreshLayout.this.V0(!z4);
            } else {
                o(com.scwang.smart.refresh.layout.constant.b.None);
            }
            return this;
        }

        @Override // qc.e
        public qc.e h(int i4) {
            SmartRefreshLayout.this.f70576f = i4;
            return this;
        }

        @Override // qc.e
        public qc.e i(boolean z4) {
            if (z4) {
                a aVar = new a();
                ValueAnimator f4 = f(SmartRefreshLayout.this.getMeasuredHeight());
                if (f4 != null) {
                    if (f4 == SmartRefreshLayout.this.C3) {
                        f4.setDuration(r1.f70576f);
                        f4.addListener(aVar);
                    }
                }
                aVar.onAnimationEnd(null);
            } else if (f(0) == null) {
                SmartRefreshLayout.this.O0(com.scwang.smart.refresh.layout.constant.b.None);
            }
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:49:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x00b8  */
        @Override // qc.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public qc.e j(int r19, boolean r20) {
            /*
                Method dump skipped, instructions count: 903
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scwang.smart.refresh.layout.SmartRefreshLayout.m.j(int, boolean):qc.e");
        }

        @Override // qc.e
        public qc.e k(@o0 qc.a aVar, boolean z4) {
            if (aVar.equals(SmartRefreshLayout.this.f70587k3)) {
                SmartRefreshLayout.this.f70609v3 = z4;
            } else if (aVar.equals(SmartRefreshLayout.this.f70589l3)) {
                SmartRefreshLayout.this.f70611w3 = z4;
            }
            return this;
        }

        @Override // qc.e
        public qc.e l(Animator animator, boolean z4) {
            if (animator != null && animator.getDuration() == 0) {
                return this;
            }
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            smartRefreshLayout.C3 = null;
            if (smartRefreshLayout.f70589l3 != null) {
                com.scwang.smart.refresh.layout.constant.b bVar = smartRefreshLayout.f70599q3;
                com.scwang.smart.refresh.layout.constant.b bVar2 = com.scwang.smart.refresh.layout.constant.b.ReleaseToLoad;
                if (bVar != bVar2) {
                    o(bVar2);
                }
                SmartRefreshLayout.this.U0(!z4);
            } else {
                o(com.scwang.smart.refresh.layout.constant.b.None);
            }
            return this;
        }

        @Override // qc.e
        @o0
        public qc.b m() {
            return SmartRefreshLayout.this.f70591m3;
        }

        @Override // qc.e
        @o0
        public qc.f n() {
            return SmartRefreshLayout.this;
        }

        @Override // qc.e
        public qc.e o(@o0 com.scwang.smart.refresh.layout.constant.b bVar) {
            switch (a.f70620a[bVar.ordinal()]) {
                case 1:
                    SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                    com.scwang.smart.refresh.layout.constant.b bVar2 = smartRefreshLayout.f70599q3;
                    com.scwang.smart.refresh.layout.constant.b bVar3 = com.scwang.smart.refresh.layout.constant.b.None;
                    if (bVar2 != bVar3 && smartRefreshLayout.f70570c == 0) {
                        smartRefreshLayout.O0(bVar3);
                        break;
                    } else if (smartRefreshLayout.f70570c != 0) {
                        f(0);
                        break;
                    }
                    break;
                case 2:
                    SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout2.f70599q3.isOpening && smartRefreshLayout2.L0(smartRefreshLayout2.C)) {
                        SmartRefreshLayout.this.O0(com.scwang.smart.refresh.layout.constant.b.PullDownToRefresh);
                        break;
                    } else {
                        SmartRefreshLayout.this.W0(com.scwang.smart.refresh.layout.constant.b.PullDownToRefresh);
                        break;
                    }
                    break;
                case 3:
                    SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
                    if (smartRefreshLayout3.L0(smartRefreshLayout3.D)) {
                        SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
                        com.scwang.smart.refresh.layout.constant.b bVar4 = smartRefreshLayout4.f70599q3;
                        if (!bVar4.isOpening && !bVar4.isFinishing && (!smartRefreshLayout4.L2 || !smartRefreshLayout4.I || !smartRefreshLayout4.M2)) {
                            smartRefreshLayout4.O0(com.scwang.smart.refresh.layout.constant.b.PullUpToLoad);
                            break;
                        }
                    }
                    SmartRefreshLayout.this.W0(com.scwang.smart.refresh.layout.constant.b.PullUpToLoad);
                    break;
                case 4:
                    SmartRefreshLayout smartRefreshLayout5 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout5.f70599q3.isOpening && smartRefreshLayout5.L0(smartRefreshLayout5.C)) {
                        SmartRefreshLayout.this.O0(com.scwang.smart.refresh.layout.constant.b.PullDownCanceled);
                        o(com.scwang.smart.refresh.layout.constant.b.None);
                        break;
                    } else {
                        SmartRefreshLayout.this.W0(com.scwang.smart.refresh.layout.constant.b.PullDownCanceled);
                        break;
                    }
                    break;
                case 5:
                    SmartRefreshLayout smartRefreshLayout6 = SmartRefreshLayout.this;
                    if (smartRefreshLayout6.L0(smartRefreshLayout6.D)) {
                        SmartRefreshLayout smartRefreshLayout7 = SmartRefreshLayout.this;
                        if (!smartRefreshLayout7.f70599q3.isOpening && (!smartRefreshLayout7.L2 || !smartRefreshLayout7.I || !smartRefreshLayout7.M2)) {
                            smartRefreshLayout7.O0(com.scwang.smart.refresh.layout.constant.b.PullUpCanceled);
                            o(com.scwang.smart.refresh.layout.constant.b.None);
                            break;
                        }
                    }
                    SmartRefreshLayout.this.W0(com.scwang.smart.refresh.layout.constant.b.PullUpCanceled);
                    break;
                case 6:
                    SmartRefreshLayout smartRefreshLayout8 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout8.f70599q3.isOpening && smartRefreshLayout8.L0(smartRefreshLayout8.C)) {
                        SmartRefreshLayout.this.O0(com.scwang.smart.refresh.layout.constant.b.ReleaseToRefresh);
                        break;
                    } else {
                        SmartRefreshLayout.this.W0(com.scwang.smart.refresh.layout.constant.b.ReleaseToRefresh);
                        break;
                    }
                case 7:
                    SmartRefreshLayout smartRefreshLayout9 = SmartRefreshLayout.this;
                    if (smartRefreshLayout9.L0(smartRefreshLayout9.D)) {
                        SmartRefreshLayout smartRefreshLayout10 = SmartRefreshLayout.this;
                        com.scwang.smart.refresh.layout.constant.b bVar5 = smartRefreshLayout10.f70599q3;
                        if (!bVar5.isOpening && !bVar5.isFinishing && (!smartRefreshLayout10.L2 || !smartRefreshLayout10.I || !smartRefreshLayout10.M2)) {
                            smartRefreshLayout10.O0(com.scwang.smart.refresh.layout.constant.b.ReleaseToLoad);
                            break;
                        }
                    }
                    SmartRefreshLayout.this.W0(com.scwang.smart.refresh.layout.constant.b.ReleaseToLoad);
                    break;
                case 8:
                    SmartRefreshLayout smartRefreshLayout11 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout11.f70599q3.isOpening && smartRefreshLayout11.L0(smartRefreshLayout11.C)) {
                        SmartRefreshLayout.this.O0(com.scwang.smart.refresh.layout.constant.b.ReleaseToTwoLevel);
                        break;
                    } else {
                        SmartRefreshLayout.this.W0(com.scwang.smart.refresh.layout.constant.b.ReleaseToTwoLevel);
                        break;
                    }
                    break;
                case 9:
                    SmartRefreshLayout smartRefreshLayout12 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout12.f70599q3.isOpening && smartRefreshLayout12.L0(smartRefreshLayout12.C)) {
                        SmartRefreshLayout.this.O0(com.scwang.smart.refresh.layout.constant.b.RefreshReleased);
                        break;
                    } else {
                        SmartRefreshLayout.this.W0(com.scwang.smart.refresh.layout.constant.b.RefreshReleased);
                        break;
                    }
                    break;
                case 10:
                    SmartRefreshLayout smartRefreshLayout13 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout13.f70599q3.isOpening && smartRefreshLayout13.L0(smartRefreshLayout13.D)) {
                        SmartRefreshLayout.this.O0(com.scwang.smart.refresh.layout.constant.b.LoadReleased);
                        break;
                    } else {
                        SmartRefreshLayout.this.W0(com.scwang.smart.refresh.layout.constant.b.LoadReleased);
                        break;
                    }
                    break;
                case 11:
                    SmartRefreshLayout.this.V0(true);
                    break;
                case 12:
                    SmartRefreshLayout.this.U0(true);
                    break;
                default:
                    SmartRefreshLayout.this.O0(bVar);
                    break;
            }
            return null;
        }
    }

    public SmartRefreshLayout(Context context) {
        this(context, null);
    }

    public static void Q0(@o0 sc.b bVar) {
        D3 = bVar;
    }

    public static void R0(@o0 sc.c cVar) {
        E3 = cVar;
    }

    public static void S0(@o0 sc.d dVar) {
        F3 = dVar;
    }

    @Override // qc.f
    public boolean A(int i4, int i5, float f4, boolean z4) {
        if (this.f70599q3 != com.scwang.smart.refresh.layout.constant.b.None || !L0(this.C)) {
            return false;
        }
        i iVar = new i(i5, f4, z4);
        W0(com.scwang.smart.refresh.layout.constant.b.Refreshing);
        if (i4 > 0) {
            this.f70595o3.postDelayed(iVar, i4);
            return true;
        }
        iVar.run();
        return true;
    }

    @Override // qc.f
    public qc.f A0(int i4) {
        this.f70604t = i4;
        return this;
    }

    @Override // qc.f
    public qc.f B(float f4) {
        this.f70575e3 = com.scwang.smart.refresh.layout.util.b.c(f4);
        return this;
    }

    @Override // qc.f
    @q0
    public qc.c B0() {
        qc.a aVar = this.f70589l3;
        if (aVar instanceof qc.c) {
            return (qc.c) aVar;
        }
        return null;
    }

    @Override // qc.f
    public qc.f C(float f4) {
        this.f70573d3 = com.scwang.smart.refresh.layout.util.b.c(f4);
        return this;
    }

    @Override // qc.f
    public qc.f D(float f4) {
        this.f70581h3 = f4;
        return this;
    }

    @Override // qc.f
    public qc.f E(boolean z4) {
        this.N = z4;
        return this;
    }

    @Override // qc.f
    public qc.f F(int i4) {
        this.f70602s = i4;
        return this;
    }

    @Override // qc.f
    public qc.f G(int i4) {
        if (i4 == this.Z2) {
            return this;
        }
        com.scwang.smart.refresh.layout.constant.a aVar = this.f70567a3;
        com.scwang.smart.refresh.layout.constant.a aVar2 = com.scwang.smart.refresh.layout.constant.a.f70679l;
        if (aVar.a(aVar2)) {
            this.Z2 = i4;
            qc.a aVar3 = this.f70587k3;
            if (aVar3 != null && this.f70613x3 && this.f70567a3.f70684b) {
                com.scwang.smart.refresh.layout.constant.c p4 = aVar3.p();
                if (p4 != com.scwang.smart.refresh.layout.constant.c.f70689h && !p4.f70693c) {
                    View view = this.f70587k3.getView();
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : G3;
                    view.measure(View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max((this.Z2 - marginLayoutParams.bottomMargin) - marginLayoutParams.topMargin, 0), 1073741824));
                    int i5 = marginLayoutParams.leftMargin;
                    int i6 = (marginLayoutParams.topMargin + this.f70573d3) - (p4 == com.scwang.smart.refresh.layout.constant.c.f70685d ? this.Z2 : 0);
                    view.layout(i5, i6, view.getMeasuredWidth() + i5, view.getMeasuredHeight() + i6);
                }
                float f4 = this.f70577f3;
                if (f4 < 10.0f) {
                    f4 *= this.Z2;
                }
                this.f70567a3 = aVar2;
                this.f70587k3.h(this.f70597p3, this.Z2, (int) f4);
            } else {
                this.f70567a3 = com.scwang.smart.refresh.layout.constant.a.f70678k;
            }
        }
        return this;
    }

    @Override // qc.f
    public qc.f H(@n int... iArr) {
        int[] iArr2 = new int[iArr.length];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            iArr2[i4] = androidx.core.content.d.getColor(getContext(), iArr[i4]);
        }
        d(iArr2);
        return this;
    }

    @Override // qc.f
    public qc.f I(int i4) {
        return u0(i4, true, false);
    }

    protected ValueAnimator I0(int i4, int i5, Interpolator interpolator, int i6) {
        if (this.f70570c == i4) {
            return null;
        }
        ValueAnimator valueAnimator = this.C3;
        if (valueAnimator != null) {
            valueAnimator.setDuration(0L);
            this.C3.cancel();
            this.C3 = null;
        }
        this.B3 = null;
        ValueAnimator ofInt = ValueAnimator.ofInt(this.f70570c, i4);
        this.C3 = ofInt;
        ofInt.setDuration(i6);
        this.C3.setInterpolator(interpolator);
        this.C3.addListener(new d());
        this.C3.addUpdateListener(new e());
        this.C3.setStartDelay(i5);
        this.C3.start();
        return this.C3;
    }

    @Override // qc.f
    public boolean J() {
        return A(this.f70613x3 ? 0 : 400, this.f70578g, (this.f70577f3 + this.f70581h3) / 2.0f, true);
    }

    protected void J0(float f4) {
        com.scwang.smart.refresh.layout.constant.b bVar;
        if (this.C3 == null) {
            if (f4 > 0.0f && ((bVar = this.f70599q3) == com.scwang.smart.refresh.layout.constant.b.Refreshing || bVar == com.scwang.smart.refresh.layout.constant.b.TwoLevel)) {
                this.B3 = new k(f4, this.Z2);
                return;
            }
            if (f4 < 0.0f && (this.f70599q3 == com.scwang.smart.refresh.layout.constant.b.Loading || ((this.I && this.L2 && this.M2 && L0(this.D)) || (this.M && !this.L2 && L0(this.D) && this.f70599q3 != com.scwang.smart.refresh.layout.constant.b.Refreshing)))) {
                this.B3 = new k(f4, -this.f70569b3);
            } else if (this.f70570c == 0 && this.K) {
                this.B3 = new k(f4, 0);
            }
        }
    }

    @Override // qc.f
    public qc.f K(boolean z4) {
        this.G = z4;
        this.O2 = true;
        return this;
    }

    protected boolean K0(int i4) {
        if (i4 == 0) {
            if (this.C3 != null) {
                com.scwang.smart.refresh.layout.constant.b bVar = this.f70599q3;
                if (bVar.isFinishing || bVar == com.scwang.smart.refresh.layout.constant.b.TwoLevelReleased || bVar == com.scwang.smart.refresh.layout.constant.b.RefreshReleased || bVar == com.scwang.smart.refresh.layout.constant.b.LoadReleased) {
                    return true;
                }
                if (bVar == com.scwang.smart.refresh.layout.constant.b.PullDownCanceled) {
                    this.f70597p3.o(com.scwang.smart.refresh.layout.constant.b.PullDownToRefresh);
                } else if (bVar == com.scwang.smart.refresh.layout.constant.b.PullUpCanceled) {
                    this.f70597p3.o(com.scwang.smart.refresh.layout.constant.b.PullUpToLoad);
                }
                this.C3.setDuration(0L);
                this.C3.cancel();
                this.C3 = null;
            }
            this.B3 = null;
        }
        return this.C3 != null;
    }

    @Override // qc.f
    public qc.f L(boolean z4) {
        this.M = z4;
        return this;
    }

    protected boolean L0(boolean z4) {
        return z4 && !this.N;
    }

    @Override // qc.f
    public qc.f M(boolean z4) {
        this.E = z4;
        return this;
    }

    protected boolean M0(boolean z4, @q0 qc.a aVar) {
        return z4 || this.N || aVar == null || aVar.p() == com.scwang.smart.refresh.layout.constant.c.f70687f;
    }

    @Override // qc.f
    public qc.f N(boolean z4) {
        this.O = z4;
        return this;
    }

    protected void N0(float f4) {
        com.scwang.smart.refresh.layout.constant.b bVar;
        float f5 = (!this.V2 || this.Q || f4 >= 0.0f || this.f70591m3.m()) ? f4 : 0.0f;
        if (f5 > this.f70580h * 5 && getTag() == null) {
            int i4 = b.C1383b.f89834f;
            if (getTag(i4) == null) {
                float f6 = this.f70588l;
                int i5 = this.f70580h;
                if (f6 < i5 / 6.0f && this.f70586k < i5 / 16.0f) {
                    Context context = getContext();
                    String s4 = ProtectedSandApp.s("⿉\u0001");
                    Toast.makeText(context, s4, 0).show();
                    setTag(i4, s4);
                }
            }
        }
        com.scwang.smart.refresh.layout.constant.b bVar2 = this.f70599q3;
        if (bVar2 == com.scwang.smart.refresh.layout.constant.b.TwoLevel && f5 > 0.0f) {
            this.f70597p3.j(Math.min((int) f5, getMeasuredHeight()), true);
        } else if (bVar2 == com.scwang.smart.refresh.layout.constant.b.Refreshing && f5 >= 0.0f) {
            int i6 = this.Z2;
            if (f5 < i6) {
                this.f70597p3.j((int) f5, true);
            } else {
                float f7 = this.f70577f3;
                if (f7 < 10.0f) {
                    f7 *= i6;
                }
                double d5 = f7 - i6;
                int max = Math.max((this.f70580h * 4) / 3, getHeight());
                int i7 = this.Z2;
                double d6 = max - i7;
                double max2 = Math.max(0.0f, (f5 - i7) * this.f70590m);
                double d7 = -max2;
                if (d6 == p.f60679p) {
                    d6 = 1.0d;
                }
                this.f70597p3.j(((int) Math.min((1.0d - Math.pow(100.0d, d7 / d6)) * d5, max2)) + this.Z2, true);
            }
        } else if (f5 < 0.0f && (bVar2 == com.scwang.smart.refresh.layout.constant.b.Loading || ((this.I && this.L2 && this.M2 && L0(this.D)) || (this.M && !this.L2 && L0(this.D))))) {
            int i10 = this.f70569b3;
            if (f5 > (-i10)) {
                this.f70597p3.j((int) f5, true);
            } else {
                float f10 = this.f70579g3;
                if (f10 < 10.0f) {
                    f10 *= i10;
                }
                double d10 = f10 - i10;
                int max3 = Math.max((this.f70580h * 4) / 3, getHeight());
                int i11 = this.f70569b3;
                double d11 = max3 - i11;
                double d12 = -Math.min(0.0f, (i11 + f5) * this.f70590m);
                double d13 = -d12;
                if (d11 == p.f60679p) {
                    d11 = 1.0d;
                }
                this.f70597p3.j(((int) (-Math.min((1.0d - Math.pow(100.0d, d13 / d11)) * d10, d12))) - this.f70569b3, true);
            }
        } else if (f5 >= 0.0f) {
            float f11 = this.f70577f3;
            double d14 = f11 < 10.0f ? this.Z2 * f11 : f11;
            double max4 = Math.max(this.f70580h / 2, getHeight());
            double max5 = Math.max(0.0f, this.f70590m * f5);
            double d15 = -max5;
            if (max4 == p.f60679p) {
                max4 = 1.0d;
            }
            this.f70597p3.j((int) Math.min((1.0d - Math.pow(100.0d, d15 / max4)) * d14, max5), true);
        } else {
            float f12 = this.f70579g3;
            double d16 = f12 < 10.0f ? this.f70569b3 * f12 : f12;
            double max6 = Math.max(this.f70580h / 2, getHeight());
            double d17 = -Math.min(0.0f, this.f70590m * f5);
            this.f70597p3.j((int) (-Math.min((1.0d - Math.pow(100.0d, (-d17) / (max6 == p.f60679p ? 1.0d : max6))) * d16, d17)), true);
        }
        if (!this.M || this.L2 || !L0(this.D) || f5 >= 0.0f || (bVar = this.f70599q3) == com.scwang.smart.refresh.layout.constant.b.Refreshing || bVar == com.scwang.smart.refresh.layout.constant.b.Loading || bVar == com.scwang.smart.refresh.layout.constant.b.LoadFinish) {
            return;
        }
        if (this.V1) {
            this.B3 = null;
            this.f70597p3.f(-this.f70569b3);
        }
        T0(false);
        this.f70595o3.postDelayed(new f(), this.f70578g);
    }

    @Override // qc.f
    public qc.f O(boolean z4) {
        this.F = z4;
        return this;
    }

    protected void O0(com.scwang.smart.refresh.layout.constant.b bVar) {
        com.scwang.smart.refresh.layout.constant.b bVar2 = this.f70599q3;
        if (bVar2 == bVar) {
            if (this.f70601r3 != bVar2) {
                this.f70601r3 = bVar2;
                return;
            }
            return;
        }
        this.f70599q3 = bVar;
        this.f70601r3 = bVar;
        qc.a aVar = this.f70587k3;
        qc.a aVar2 = this.f70589l3;
        sc.f fVar = this.S2;
        if (aVar != null) {
            aVar.g(this, bVar2, bVar);
        }
        if (aVar2 != null) {
            aVar2.g(this, bVar2, bVar);
        }
        if (fVar != null) {
            fVar.g(this, bVar2, bVar);
        }
        if (bVar == com.scwang.smart.refresh.layout.constant.b.LoadFinish) {
            this.f70615y3 = false;
        }
    }

    @Override // qc.f
    public qc.f P(boolean z4) {
        this.I = z4;
        return this;
    }

    protected void P0() {
        com.scwang.smart.refresh.layout.constant.b bVar = this.f70599q3;
        if (bVar == com.scwang.smart.refresh.layout.constant.b.TwoLevel) {
            if (this.f70612x <= -1000 || this.f70570c <= getHeight() / 2) {
                if (this.f70594o) {
                    this.f70597p3.e();
                    return;
                }
                return;
            } else {
                ValueAnimator f4 = this.f70597p3.f(getHeight());
                if (f4 != null) {
                    f4.setDuration(this.f70576f);
                    return;
                }
                return;
            }
        }
        com.scwang.smart.refresh.layout.constant.b bVar2 = com.scwang.smart.refresh.layout.constant.b.Loading;
        if (bVar == bVar2 || (this.I && this.L2 && this.M2 && this.f70570c < 0 && L0(this.D))) {
            int i4 = this.f70570c;
            int i5 = this.f70569b3;
            if (i4 < (-i5)) {
                this.f70597p3.f(-i5);
                return;
            } else {
                if (i4 > 0) {
                    this.f70597p3.f(0);
                    return;
                }
                return;
            }
        }
        com.scwang.smart.refresh.layout.constant.b bVar3 = this.f70599q3;
        com.scwang.smart.refresh.layout.constant.b bVar4 = com.scwang.smart.refresh.layout.constant.b.Refreshing;
        if (bVar3 == bVar4) {
            int i6 = this.f70570c;
            int i7 = this.Z2;
            if (i6 > i7) {
                this.f70597p3.f(i7);
                return;
            } else {
                if (i6 < 0) {
                    this.f70597p3.f(0);
                    return;
                }
                return;
            }
        }
        if (bVar3 == com.scwang.smart.refresh.layout.constant.b.PullDownToRefresh) {
            this.f70597p3.o(com.scwang.smart.refresh.layout.constant.b.PullDownCanceled);
            return;
        }
        if (bVar3 == com.scwang.smart.refresh.layout.constant.b.PullUpToLoad) {
            this.f70597p3.o(com.scwang.smart.refresh.layout.constant.b.PullUpCanceled);
            return;
        }
        if (bVar3 == com.scwang.smart.refresh.layout.constant.b.ReleaseToRefresh) {
            this.f70597p3.o(bVar4);
            return;
        }
        if (bVar3 == com.scwang.smart.refresh.layout.constant.b.ReleaseToLoad) {
            this.f70597p3.o(bVar2);
            return;
        }
        if (bVar3 == com.scwang.smart.refresh.layout.constant.b.ReleaseToTwoLevel) {
            this.f70597p3.o(com.scwang.smart.refresh.layout.constant.b.TwoLevelReleased);
            return;
        }
        if (bVar3 == com.scwang.smart.refresh.layout.constant.b.RefreshReleased) {
            if (this.C3 == null) {
                this.f70597p3.f(this.Z2);
            }
        } else if (bVar3 == com.scwang.smart.refresh.layout.constant.b.LoadReleased) {
            if (this.C3 == null) {
                this.f70597p3.f(-this.f70569b3);
            }
        } else {
            if (bVar3 == com.scwang.smart.refresh.layout.constant.b.LoadFinish || this.f70570c == 0) {
                return;
            }
            this.f70597p3.f(0);
        }
    }

    @Override // qc.f
    public qc.f Q(float f4) {
        return G(com.scwang.smart.refresh.layout.util.b.c(f4));
    }

    @Override // qc.f
    public qc.f R(int i4, boolean z4, Boolean bool) {
        int i5 = i4 >> 16;
        int i6 = (i4 << 16) >> 16;
        g gVar = new g(i5, bool, z4);
        if (i6 > 0) {
            this.f70595o3.postDelayed(gVar, i6);
        } else {
            gVar.run();
        }
        return this;
    }

    @Override // qc.f
    public boolean S() {
        return g0(0, this.f70578g, (this.f70579g3 + this.f70583i3) / 2.0f, false);
    }

    @Override // qc.f
    public qc.f T(boolean z4) {
        this.P = z4;
        return this;
    }

    protected void T0(boolean z4) {
        com.scwang.smart.refresh.layout.constant.b bVar = this.f70599q3;
        com.scwang.smart.refresh.layout.constant.b bVar2 = com.scwang.smart.refresh.layout.constant.b.Loading;
        if (bVar != bVar2) {
            this.f70603s3 = System.currentTimeMillis();
            this.f70615y3 = true;
            O0(bVar2);
            sc.e eVar = this.R2;
            if (eVar != null) {
                if (z4) {
                    eVar.m(this);
                }
            } else if (this.S2 == null) {
                I(2000);
            }
            qc.a aVar = this.f70589l3;
            if (aVar != null) {
                float f4 = this.f70579g3;
                if (f4 < 10.0f) {
                    f4 *= this.f70569b3;
                }
                aVar.r(this, this.f70569b3, (int) f4);
            }
            sc.f fVar = this.S2;
            if (fVar == null || !(this.f70589l3 instanceof qc.c)) {
                return;
            }
            if (z4) {
                fVar.m(this);
            }
            float f5 = this.f70579g3;
            if (f5 < 10.0f) {
                f5 *= this.f70569b3;
            }
            this.S2.k((qc.c) this.f70589l3, this.f70569b3, (int) f5);
        }
    }

    @Override // qc.f
    public qc.f U(boolean z4) {
        this.N2 = true;
        this.D = z4;
        return this;
    }

    protected void U0(boolean z4) {
        b bVar = new b(z4);
        O0(com.scwang.smart.refresh.layout.constant.b.LoadReleased);
        ValueAnimator f4 = this.f70597p3.f(-this.f70569b3);
        if (f4 != null) {
            f4.addListener(bVar);
        }
        qc.a aVar = this.f70589l3;
        if (aVar != null) {
            float f5 = this.f70579g3;
            if (f5 < 10.0f) {
                f5 *= this.f70569b3;
            }
            aVar.f(this, this.f70569b3, (int) f5);
        }
        sc.f fVar = this.S2;
        if (fVar != null) {
            qc.a aVar2 = this.f70589l3;
            if (aVar2 instanceof qc.c) {
                float f6 = this.f70579g3;
                if (f6 < 10.0f) {
                    f6 *= this.f70569b3;
                }
                fVar.c((qc.c) aVar2, this.f70569b3, (int) f6);
            }
        }
        if (f4 == null) {
            bVar.onAnimationEnd(null);
        }
    }

    @Override // qc.f
    @q0
    public qc.d V() {
        qc.a aVar = this.f70587k3;
        if (aVar instanceof qc.d) {
            return (qc.d) aVar;
        }
        return null;
    }

    protected void V0(boolean z4) {
        c cVar = new c(z4);
        O0(com.scwang.smart.refresh.layout.constant.b.RefreshReleased);
        ValueAnimator f4 = this.f70597p3.f(this.Z2);
        if (f4 != null) {
            f4.addListener(cVar);
        }
        qc.a aVar = this.f70587k3;
        if (aVar != null) {
            float f5 = this.f70577f3;
            if (f5 < 10.0f) {
                f5 *= this.Z2;
            }
            aVar.f(this, this.Z2, (int) f5);
        }
        sc.f fVar = this.S2;
        if (fVar != null) {
            qc.a aVar2 = this.f70587k3;
            if (aVar2 instanceof qc.d) {
                float f6 = this.f70577f3;
                if (f6 < 10.0f) {
                    f6 *= this.Z2;
                }
                fVar.i((qc.d) aVar2, this.Z2, (int) f6);
            }
        }
        if (f4 == null) {
            cVar.onAnimationEnd(null);
        }
    }

    @Override // qc.f
    public qc.f W(boolean z4) {
        setNestedScrollingEnabled(z4);
        return this;
    }

    protected void W0(com.scwang.smart.refresh.layout.constant.b bVar) {
        com.scwang.smart.refresh.layout.constant.b bVar2 = this.f70599q3;
        if (bVar2.isDragging && bVar2.isHeader != bVar.isHeader) {
            O0(com.scwang.smart.refresh.layout.constant.b.None);
        }
        if (this.f70601r3 != bVar) {
            this.f70601r3 = bVar;
        }
    }

    @Override // qc.f
    public boolean X(int i4) {
        return A(i4, this.f70578g, (this.f70577f3 + this.f70581h3) / 2.0f, false);
    }

    protected boolean X0(float f4) {
        if (f4 == 0.0f) {
            f4 = this.f70612x;
        }
        if (Math.abs(f4) > this.f70608v) {
            int i4 = this.f70570c;
            if (i4 * f4 < 0.0f) {
                com.scwang.smart.refresh.layout.constant.b bVar = this.f70599q3;
                if (bVar == com.scwang.smart.refresh.layout.constant.b.Refreshing || bVar == com.scwang.smart.refresh.layout.constant.b.Loading || (i4 < 0 && this.L2)) {
                    this.B3 = new l(f4).a();
                    return true;
                }
                if (bVar.isReleaseToOpening) {
                    return true;
                }
            }
            if ((f4 < 0.0f && ((this.K && (this.D || this.L)) || ((this.f70599q3 == com.scwang.smart.refresh.layout.constant.b.Loading && i4 >= 0) || (this.M && L0(this.D))))) || (f4 > 0.0f && ((this.K && this.C) || this.L || (this.f70599q3 == com.scwang.smart.refresh.layout.constant.b.Refreshing && this.f70570c <= 0)))) {
                this.f70617z3 = false;
                this.f70614y.fling(0, 0, 0, (int) (-f4), 0, 0, -2147483647, Integer.MAX_VALUE);
                this.f70614y.computeScrollOffset();
                invalidate();
            }
        }
        return false;
    }

    @Override // qc.f
    public qc.f Y(@o0 qc.d dVar, int i4, int i5) {
        qc.a aVar;
        qc.a aVar2 = this.f70587k3;
        if (aVar2 != null) {
            super.removeView(aVar2.getView());
        }
        this.f70587k3 = dVar;
        this.f70605t3 = 0;
        this.f70609v3 = false;
        this.f70567a3 = com.scwang.smart.refresh.layout.constant.a.f70670c;
        if (i4 == 0) {
            i4 = -1;
        }
        if (i5 == 0) {
            i5 = -2;
        }
        LayoutParams layoutParams = new LayoutParams(i4, i5);
        ViewGroup.LayoutParams layoutParams2 = dVar.getView().getLayoutParams();
        if (layoutParams2 instanceof LayoutParams) {
            layoutParams = (LayoutParams) layoutParams2;
        }
        if (this.f70587k3.p().f70692b) {
            super.addView(this.f70587k3.getView(), getChildCount(), layoutParams);
        } else {
            super.addView(this.f70587k3.getView(), 0, layoutParams);
        }
        int[] iArr = this.B;
        if (iArr != null && (aVar = this.f70587k3) != null) {
            aVar.d(iArr);
        }
        return this;
    }

    @Override // qc.f
    public qc.f Z(boolean z4) {
        this.K = z4;
        return this;
    }

    @Override // qc.f
    public qc.f a(boolean z4) {
        com.scwang.smart.refresh.layout.constant.b bVar = this.f70599q3;
        if (bVar == com.scwang.smart.refresh.layout.constant.b.Refreshing && z4) {
            t0();
        } else if (bVar == com.scwang.smart.refresh.layout.constant.b.Loading && z4) {
            k0();
        } else if (this.L2 != z4) {
            this.L2 = z4;
            qc.a aVar = this.f70589l3;
            if (aVar instanceof qc.c) {
                if (((qc.c) aVar).a(z4)) {
                    this.M2 = true;
                    if (this.L2 && this.I && this.f70570c > 0 && this.f70589l3.p() == com.scwang.smart.refresh.layout.constant.c.f70685d && L0(this.D) && M0(this.C, this.f70587k3)) {
                        this.f70589l3.getView().setTranslationY(this.f70570c);
                    }
                } else {
                    this.M2 = false;
                    new RuntimeException(ProtectedSandApp.s("⿊\u0001") + this.f70589l3 + ProtectedSandApp.s("⿋\u0001")).printStackTrace();
                }
            }
        }
        return this;
    }

    @Override // qc.f
    public qc.f a0() {
        return w(true);
    }

    @Override // qc.f
    public qc.f b(boolean z4) {
        this.Q = z4;
        qc.b bVar = this.f70591m3;
        if (bVar != null) {
            bVar.b(z4);
        }
        return this;
    }

    @Override // qc.f
    public qc.f b0(int i4) {
        this.f70606u = i4;
        return this;
    }

    @Override // qc.f
    public boolean c() {
        return this.f70599q3 == com.scwang.smart.refresh.layout.constant.b.Loading;
    }

    @Override // qc.f
    public qc.f c0() {
        com.scwang.smart.refresh.layout.constant.b bVar;
        com.scwang.smart.refresh.layout.constant.b bVar2 = this.f70599q3;
        com.scwang.smart.refresh.layout.constant.b bVar3 = com.scwang.smart.refresh.layout.constant.b.None;
        if (bVar2 == bVar3 && ((bVar = this.f70601r3) == com.scwang.smart.refresh.layout.constant.b.Refreshing || bVar == com.scwang.smart.refresh.layout.constant.b.Loading)) {
            this.f70601r3 = bVar3;
        }
        if (bVar2 == com.scwang.smart.refresh.layout.constant.b.Refreshing) {
            z();
        } else if (bVar2 == com.scwang.smart.refresh.layout.constant.b.Loading) {
            a0();
        } else if (this.f70597p3.f(0) == null) {
            O0(bVar3);
        } else if (this.f70599q3.isHeader) {
            O0(com.scwang.smart.refresh.layout.constant.b.PullDownCanceled);
        } else {
            O0(com.scwang.smart.refresh.layout.constant.b.PullUpCanceled);
        }
        return this;
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f70614y.getCurrY();
        if (this.f70614y.computeScrollOffset()) {
            int finalY = this.f70614y.getFinalY();
            if ((finalY >= 0 || !((this.C || this.L) && this.f70591m3.k())) && (finalY <= 0 || !((this.D || this.L) && this.f70591m3.m()))) {
                this.f70617z3 = true;
                invalidate();
            } else {
                if (this.f70617z3) {
                    J0(finalY > 0 ? -this.f70614y.getCurrVelocity() : this.f70614y.getCurrVelocity());
                }
                this.f70614y.forceFinished(true);
            }
        }
    }

    @Override // qc.f
    public qc.f d(@androidx.annotation.l int... iArr) {
        qc.a aVar = this.f70587k3;
        if (aVar != null) {
            aVar.d(iArr);
        }
        qc.a aVar2 = this.f70589l3;
        if (aVar2 != null) {
            aVar2.d(iArr);
        }
        this.B = iArr;
        return this;
    }

    @Override // qc.f
    public qc.f d0(boolean z4) {
        return z4 ? R(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.f70603s3))), 300) << 16, true, Boolean.FALSE) : R(0, false, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c6, code lost:
    
        if (r2.isFinishing == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ca, code lost:
    
        if (r2.isHeader == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00d8, code lost:
    
        if (r2.isFinishing == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00dc, code lost:
    
        if (r2.isFooter == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0108, code lost:
    
        if (r6 != 3) goto L233;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 867
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scwang.smart.refresh.layout.SmartRefreshLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j4) {
        Paint paint;
        Paint paint2;
        qc.b bVar = this.f70591m3;
        View view2 = bVar != null ? bVar.getView() : null;
        qc.a aVar = this.f70587k3;
        if (aVar != null && aVar.getView() == view) {
            if (!L0(this.C) || (!this.J && isInEditMode())) {
                return true;
            }
            if (view2 != null) {
                int max = Math.max(view2.getPaddingTop() + view2.getTop() + this.f70570c, view.getTop());
                int i4 = this.f70605t3;
                if (i4 != 0 && (paint2 = this.f70593n3) != null) {
                    paint2.setColor(i4);
                    if (this.f70587k3.p().f70693c) {
                        max = view.getBottom();
                    } else if (this.f70587k3.p() == com.scwang.smart.refresh.layout.constant.c.f70685d) {
                        max = view.getBottom() + this.f70570c;
                    }
                    canvas.drawRect(0.0f, view.getTop(), getWidth(), max, this.f70593n3);
                }
                if ((this.E && this.f70587k3.p() == com.scwang.smart.refresh.layout.constant.c.f70687f) || this.f70587k3.p().f70693c) {
                    canvas.save();
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), max);
                    boolean drawChild = super.drawChild(canvas, view, j4);
                    canvas.restore();
                    return drawChild;
                }
            }
        }
        qc.a aVar2 = this.f70589l3;
        if (aVar2 != null && aVar2.getView() == view) {
            if (!L0(this.D) || (!this.J && isInEditMode())) {
                return true;
            }
            if (view2 != null) {
                int min = Math.min((view2.getBottom() - view2.getPaddingBottom()) + this.f70570c, view.getBottom());
                int i5 = this.f70607u3;
                if (i5 != 0 && (paint = this.f70593n3) != null) {
                    paint.setColor(i5);
                    if (this.f70589l3.p().f70693c) {
                        min = view.getTop();
                    } else if (this.f70589l3.p() == com.scwang.smart.refresh.layout.constant.c.f70685d) {
                        min = view.getTop() + this.f70570c;
                    }
                    canvas.drawRect(0.0f, min, getWidth(), view.getBottom(), this.f70593n3);
                }
                if ((this.F && this.f70589l3.p() == com.scwang.smart.refresh.layout.constant.c.f70687f) || this.f70589l3.p().f70693c) {
                    canvas.save();
                    canvas.clipRect(view.getLeft(), min, view.getRight(), view.getBottom());
                    boolean drawChild2 = super.drawChild(canvas, view, j4);
                    canvas.restore();
                    return drawChild2;
                }
            }
        }
        return super.drawChild(canvas, view, j4);
    }

    @Override // qc.f
    public boolean e() {
        return this.f70599q3 == com.scwang.smart.refresh.layout.constant.b.Refreshing;
    }

    @Override // qc.f
    public qc.f e0(int i4) {
        this.f70575e3 = i4;
        return this;
    }

    @Override // qc.f
    public qc.f f(sc.j jVar) {
        this.T2 = jVar;
        qc.b bVar = this.f70591m3;
        if (bVar != null) {
            bVar.f(jVar);
        }
        return this;
    }

    @Override // qc.f
    public qc.f f0(float f4) {
        this.f70579g3 = f4;
        qc.a aVar = this.f70589l3;
        if (aVar == null || !this.f70613x3) {
            this.f70571c3 = this.f70571c3.c();
        } else {
            if (f4 < 10.0f) {
                f4 *= this.f70569b3;
            }
            aVar.h(this.f70597p3, this.f70569b3, (int) f4);
        }
        return this;
    }

    @Override // qc.f
    public boolean g() {
        return g0(0, this.f70578g, (this.f70579g3 + this.f70583i3) / 2.0f, true);
    }

    @Override // qc.f
    public boolean g0(int i4, int i5, float f4, boolean z4) {
        if (this.f70599q3 != com.scwang.smart.refresh.layout.constant.b.None || !L0(this.D) || this.L2) {
            return false;
        }
        j jVar = new j(i5, f4, z4);
        W0(com.scwang.smart.refresh.layout.constant.b.Loading);
        if (i4 > 0) {
            this.f70595o3.postDelayed(jVar, i4);
            return true;
        }
        jVar.run();
        return true;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // qc.f
    @o0
    public ViewGroup getLayout() {
        return this;
    }

    @Override // android.view.ViewGroup, androidx.core.view.b1
    public int getNestedScrollAxes() {
        return this.Y2.a();
    }

    @Override // qc.f
    @o0
    public com.scwang.smart.refresh.layout.constant.b getState() {
        return this.f70599q3;
    }

    @Override // qc.f
    public qc.f h(boolean z4) {
        this.Q1 = z4;
        return this;
    }

    @Override // qc.f
    public qc.f h0(int i4) {
        this.f70578g = i4;
        return this;
    }

    @Override // qc.f
    public qc.f i(@o0 View view) {
        return j0(view, 0, 0);
    }

    @Override // qc.f
    public qc.f i0(int i4) {
        return R(i4, true, Boolean.FALSE);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.R && (this.L || this.C || this.D);
    }

    @Override // qc.f
    public qc.f j(@o0 qc.d dVar) {
        return Y(dVar, 0, 0);
    }

    @Override // qc.f
    public qc.f j0(@o0 View view, int i4, int i5) {
        qc.b bVar = this.f70591m3;
        if (bVar != null) {
            super.removeView(bVar.getView());
        }
        if (i4 == 0) {
            i4 = -1;
        }
        if (i5 == 0) {
            i5 = -1;
        }
        LayoutParams layoutParams = new LayoutParams(i4, i5);
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 instanceof LayoutParams) {
            layoutParams = (LayoutParams) layoutParams2;
        }
        super.addView(view, getChildCount(), layoutParams);
        this.f70591m3 = new com.scwang.smart.refresh.layout.wrapper.a(view);
        if (this.f70613x3) {
            View findViewById = findViewById(this.f70600r);
            View findViewById2 = findViewById(this.f70602s);
            this.f70591m3.f(this.T2);
            this.f70591m3.b(this.Q);
            this.f70591m3.i(this.f70597p3, findViewById, findViewById2);
        }
        qc.a aVar = this.f70587k3;
        if (aVar != null && aVar.p().f70692b) {
            super.bringChildToFront(this.f70587k3.getView());
        }
        qc.a aVar2 = this.f70589l3;
        if (aVar2 != null && aVar2.p().f70692b) {
            super.bringChildToFront(this.f70589l3.getView());
        }
        return this;
    }

    @Override // qc.f
    public qc.f k(float f4) {
        this.f70583i3 = f4;
        return this;
    }

    @Override // qc.f
    public qc.f k0() {
        return u0(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.f70603s3))), 300) << 16, true, true);
    }

    @Override // qc.f
    public boolean l(int i4) {
        return g0(i4, this.f70578g, (this.f70579g3 + this.f70583i3) / 2.0f, false);
    }

    @Override // qc.f
    public qc.f l0(sc.g gVar) {
        this.Q2 = gVar;
        return this;
    }

    @Override // qc.f
    public qc.f m(boolean z4) {
        this.H = z4;
        this.P2 = true;
        return this;
    }

    @Override // qc.f
    public qc.f m0(float f4) {
        this.f70577f3 = f4;
        qc.a aVar = this.f70587k3;
        if (aVar == null || !this.f70613x3) {
            this.f70567a3 = this.f70567a3.c();
        } else {
            if (f4 < 10.0f) {
                f4 *= this.Z2;
            }
            aVar.h(this.f70597p3, this.Z2, (int) f4);
        }
        return this;
    }

    @Override // qc.f
    public qc.f n(float f4) {
        return r(com.scwang.smart.refresh.layout.util.b.c(f4));
    }

    @Override // qc.f
    public boolean n0() {
        return A(this.f70613x3 ? 0 : 400, this.f70578g, (this.f70577f3 + this.f70581h3) / 2.0f, false);
    }

    @Override // qc.f
    public qc.f o(@o0 qc.c cVar, int i4, int i5) {
        qc.a aVar;
        qc.a aVar2 = this.f70589l3;
        if (aVar2 != null) {
            super.removeView(aVar2.getView());
        }
        this.f70589l3 = cVar;
        this.f70615y3 = false;
        this.f70607u3 = 0;
        this.M2 = false;
        this.f70611w3 = false;
        this.f70571c3 = com.scwang.smart.refresh.layout.constant.a.f70670c;
        this.D = !this.N2 || this.D;
        if (i4 == 0) {
            i4 = -1;
        }
        if (i5 == 0) {
            i5 = -2;
        }
        LayoutParams layoutParams = new LayoutParams(i4, i5);
        ViewGroup.LayoutParams layoutParams2 = cVar.getView().getLayoutParams();
        if (layoutParams2 instanceof LayoutParams) {
            layoutParams = (LayoutParams) layoutParams2;
        }
        if (this.f70589l3.p().f70692b) {
            super.addView(this.f70589l3.getView(), getChildCount(), layoutParams);
        } else {
            super.addView(this.f70589l3.getView(), 0, layoutParams);
        }
        int[] iArr = this.B;
        if (iArr != null && (aVar = this.f70589l3) != null) {
            aVar.d(iArr);
        }
        return this;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        qc.a aVar;
        sc.c cVar;
        super.onAttachedToWindow();
        boolean z4 = true;
        this.f70613x3 = true;
        if (!isInEditMode()) {
            if (this.f70587k3 == null && (cVar = E3) != null) {
                qc.d a5 = cVar.a(getContext(), this);
                if (a5 == null) {
                    throw new RuntimeException(ProtectedSandApp.s("⿌\u0001"));
                }
                j(a5);
            }
            if (this.f70589l3 == null) {
                sc.b bVar = D3;
                if (bVar != null) {
                    qc.c a6 = bVar.a(getContext(), this);
                    if (a6 == null) {
                        throw new RuntimeException(ProtectedSandApp.s("⿍\u0001"));
                    }
                    x0(a6);
                }
            } else {
                if (!this.D && this.N2) {
                    z4 = false;
                }
                this.D = z4;
            }
            if (this.f70591m3 == null) {
                int childCount = getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    qc.a aVar2 = this.f70587k3;
                    if ((aVar2 == null || childAt != aVar2.getView()) && ((aVar = this.f70589l3) == null || childAt != aVar.getView())) {
                        this.f70591m3 = new com.scwang.smart.refresh.layout.wrapper.a(childAt);
                    }
                }
            }
            if (this.f70591m3 == null) {
                int c5 = com.scwang.smart.refresh.layout.util.b.c(20.0f);
                TextView textView = new TextView(getContext());
                textView.setTextColor(-39424);
                textView.setGravity(17);
                textView.setTextSize(20.0f);
                textView.setText(b.c.f89836b);
                super.addView(textView, 0, new LayoutParams(-1, -1));
                com.scwang.smart.refresh.layout.wrapper.a aVar3 = new com.scwang.smart.refresh.layout.wrapper.a(textView);
                this.f70591m3 = aVar3;
                aVar3.getView().setPadding(c5, c5, c5, c5);
            }
            View findViewById = findViewById(this.f70600r);
            View findViewById2 = findViewById(this.f70602s);
            this.f70591m3.f(this.T2);
            this.f70591m3.b(this.Q);
            this.f70591m3.i(this.f70597p3, findViewById, findViewById2);
            if (this.f70570c != 0) {
                O0(com.scwang.smart.refresh.layout.constant.b.None);
                qc.b bVar2 = this.f70591m3;
                this.f70570c = 0;
                bVar2.l(0, this.f70604t, this.f70606u);
            }
        }
        int[] iArr = this.B;
        if (iArr != null) {
            qc.a aVar4 = this.f70587k3;
            if (aVar4 != null) {
                aVar4.d(iArr);
            }
            qc.a aVar5 = this.f70589l3;
            if (aVar5 != null) {
                aVar5.d(this.B);
            }
        }
        qc.b bVar3 = this.f70591m3;
        if (bVar3 != null) {
            super.bringChildToFront(bVar3.getView());
        }
        qc.a aVar6 = this.f70587k3;
        if (aVar6 != null && aVar6.p().f70692b) {
            super.bringChildToFront(this.f70587k3.getView());
        }
        qc.a aVar7 = this.f70589l3;
        if (aVar7 == null || !aVar7.p().f70692b) {
            return;
        }
        super.bringChildToFront(this.f70589l3.getView());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f70613x3 = false;
        this.N2 = true;
        this.B3 = null;
        ValueAnimator valueAnimator = this.C3;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.C3.removeAllUpdateListeners();
            this.C3.setDuration(0L);
            this.C3.cancel();
            this.C3 = null;
        }
        qc.a aVar = this.f70587k3;
        if (aVar != null && this.f70599q3 == com.scwang.smart.refresh.layout.constant.b.Refreshing) {
            aVar.l(this, false);
        }
        qc.a aVar2 = this.f70589l3;
        if (aVar2 != null && this.f70599q3 == com.scwang.smart.refresh.layout.constant.b.Loading) {
            aVar2.l(this, false);
        }
        if (this.f70570c != 0) {
            this.f70597p3.j(0, true);
        }
        com.scwang.smart.refresh.layout.constant.b bVar = this.f70599q3;
        com.scwang.smart.refresh.layout.constant.b bVar2 = com.scwang.smart.refresh.layout.constant.b.None;
        if (bVar != bVar2) {
            O0(bVar2);
        }
        Handler handler = this.f70595o3;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f70615y3 = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0052  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onFinishInflate() {
        /*
            r11 = this;
            super.onFinishInflate()
            int r0 = super.getChildCount()
            r1 = 3
            if (r0 > r1) goto L9e
            r2 = -1
            r3 = 0
            r5 = r2
            r4 = r3
            r6 = r4
        Lf:
            r7 = 2
            r8 = 1
            if (r4 >= r0) goto L33
            android.view.View r9 = super.getChildAt(r4)
            boolean r10 = com.scwang.smart.refresh.layout.util.b.e(r9)
            if (r10 == 0) goto L24
            if (r6 < r7) goto L21
            if (r4 != r8) goto L24
        L21:
            r5 = r4
            r6 = r7
            goto L30
        L24:
            boolean r7 = r9 instanceof qc.a
            if (r7 != 0) goto L30
            if (r6 >= r8) goto L30
            if (r4 <= 0) goto L2e
            r6 = r8
            goto L2f
        L2e:
            r6 = r3
        L2f:
            r5 = r4
        L30:
            int r4 = r4 + 1
            goto Lf
        L33:
            if (r5 < 0) goto L4d
            com.scwang.smart.refresh.layout.wrapper.a r4 = new com.scwang.smart.refresh.layout.wrapper.a
            android.view.View r6 = super.getChildAt(r5)
            r4.<init>(r6)
            r11.f70591m3 = r4
            if (r5 != r8) goto L48
            if (r0 != r1) goto L46
        L44:
            r1 = r3
            goto L4f
        L46:
            r7 = r2
            goto L44
        L48:
            if (r0 != r7) goto L4d
            r1 = r2
            r7 = r8
            goto L4f
        L4d:
            r1 = r2
            r7 = r1
        L4f:
            r4 = r3
        L50:
            if (r4 >= r0) goto L9d
            android.view.View r5 = super.getChildAt(r4)
            if (r4 == r1) goto L8b
            if (r4 == r7) goto L65
            if (r1 != r2) goto L65
            qc.a r6 = r11.f70587k3
            if (r6 != 0) goto L65
            boolean r6 = r5 instanceof qc.d
            if (r6 == 0) goto L65
            goto L8b
        L65:
            if (r4 == r7) goto L6d
            if (r7 != r2) goto L9a
            boolean r6 = r5 instanceof qc.c
            if (r6 == 0) goto L9a
        L6d:
            boolean r6 = r11.D
            if (r6 != 0) goto L78
            boolean r6 = r11.N2
            if (r6 != 0) goto L76
            goto L78
        L76:
            r6 = r3
            goto L79
        L78:
            r6 = r8
        L79:
            r11.D = r6
            boolean r6 = r5 instanceof qc.c
            if (r6 == 0) goto L82
            qc.c r5 = (qc.c) r5
            goto L88
        L82:
            com.scwang.smart.refresh.layout.wrapper.b r6 = new com.scwang.smart.refresh.layout.wrapper.b
            r6.<init>(r5)
            r5 = r6
        L88:
            r11.f70589l3 = r5
            goto L9a
        L8b:
            boolean r6 = r5 instanceof qc.d
            if (r6 == 0) goto L92
            qc.d r5 = (qc.d) r5
            goto L98
        L92:
            com.scwang.smart.refresh.layout.wrapper.c r6 = new com.scwang.smart.refresh.layout.wrapper.c
            r6.<init>(r5)
            r5 = r6
        L98:
            r11.f70587k3 = r5
        L9a:
            int r4 = r4 + 1
            goto L50
        L9d:
            return
        L9e:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "⿎\u0001"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scwang.smart.refresh.layout.SmartRefreshLayout.onFinishInflate():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int i10;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        int childCount = super.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = super.getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                if (!ProtectedSandApp.s("⿏\u0001").equals(childAt.getTag(b.C1383b.f89834f))) {
                    qc.b bVar = this.f70591m3;
                    if (bVar != null && bVar.getView() == childAt) {
                        boolean z5 = isInEditMode() && this.J && L0(this.C) && this.f70587k3 != null;
                        View view = this.f70591m3.getView();
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : G3;
                        int i12 = marginLayoutParams.leftMargin + paddingLeft;
                        int i13 = marginLayoutParams.topMargin + paddingTop;
                        int measuredWidth = view.getMeasuredWidth() + i12;
                        int measuredHeight = view.getMeasuredHeight() + i13;
                        if (z5 && M0(this.G, this.f70587k3)) {
                            int i14 = this.Z2;
                            i13 += i14;
                            measuredHeight += i14;
                        }
                        view.layout(i12, i13, measuredWidth, measuredHeight);
                    }
                    qc.a aVar = this.f70587k3;
                    if (aVar != null && aVar.getView() == childAt) {
                        boolean z6 = isInEditMode() && this.J && L0(this.C);
                        View view2 = this.f70587k3.getView();
                        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : G3;
                        int i15 = marginLayoutParams2.leftMargin;
                        int i16 = marginLayoutParams2.topMargin + this.f70573d3;
                        int measuredWidth2 = view2.getMeasuredWidth() + i15;
                        int measuredHeight2 = view2.getMeasuredHeight() + i16;
                        if (!z6 && this.f70587k3.p() == com.scwang.smart.refresh.layout.constant.c.f70685d) {
                            int i17 = this.Z2;
                            i16 -= i17;
                            measuredHeight2 -= i17;
                        }
                        view2.layout(i15, i16, measuredWidth2, measuredHeight2);
                    }
                    qc.a aVar2 = this.f70589l3;
                    if (aVar2 != null && aVar2.getView() == childAt) {
                        boolean z7 = isInEditMode() && this.J && L0(this.D);
                        View view3 = this.f70589l3.getView();
                        ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : G3;
                        com.scwang.smart.refresh.layout.constant.c p4 = this.f70589l3.p();
                        int i18 = marginLayoutParams3.leftMargin;
                        int measuredHeight3 = (getMeasuredHeight() + marginLayoutParams3.topMargin) - this.f70575e3;
                        if (this.L2 && this.M2 && this.I && this.f70591m3 != null && this.f70589l3.p() == com.scwang.smart.refresh.layout.constant.c.f70685d && L0(this.D)) {
                            View view4 = this.f70591m3.getView();
                            ViewGroup.LayoutParams layoutParams4 = view4.getLayoutParams();
                            measuredHeight3 = view4.getMeasuredHeight() + paddingTop + paddingTop + (layoutParams4 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin : 0);
                        }
                        if (p4 == com.scwang.smart.refresh.layout.constant.c.f70689h) {
                            measuredHeight3 = marginLayoutParams3.topMargin - this.f70575e3;
                        } else {
                            if (z7 || p4 == com.scwang.smart.refresh.layout.constant.c.f70688g || p4 == com.scwang.smart.refresh.layout.constant.c.f70687f) {
                                i10 = this.f70569b3;
                            } else if (p4.f70693c && this.f70570c < 0) {
                                i10 = Math.max(L0(this.D) ? -this.f70570c : 0, 0);
                            }
                            measuredHeight3 -= i10;
                        }
                        view3.layout(i18, measuredHeight3, view3.getMeasuredWidth() + i18, view3.getMeasuredHeight() + measuredHeight3);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0266  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r18, int r19) {
        /*
            Method dump skipped, instructions count: 865
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scwang.smart.refresh.layout.SmartRefreshLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.b1
    public boolean onNestedFling(@o0 View view, float f4, float f5, boolean z4) {
        return this.X2.a(f4, f5, z4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.b1
    public boolean onNestedPreFling(@o0 View view, float f4, float f5) {
        return (this.f70615y3 && f5 > 0.0f) || X0(-f5) || this.X2.b(f4, f5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.b1
    public void onNestedPreScroll(@o0 View view, int i4, int i5, @o0 int[] iArr) {
        int i6 = this.U2;
        int i7 = 0;
        if (i5 * i6 > 0) {
            if (Math.abs(i5) > Math.abs(this.U2)) {
                int i10 = this.U2;
                this.U2 = 0;
                i7 = i10;
            } else {
                this.U2 -= i5;
                i7 = i5;
            }
            N0(this.U2);
        } else if (i5 > 0 && this.f70615y3) {
            int i11 = i6 - i5;
            this.U2 = i11;
            N0(i11);
            i7 = i5;
        }
        this.X2.c(i4, i5 - i7, iArr, null);
        iArr[1] = iArr[1] + i7;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.b1
    public void onNestedScroll(@o0 View view, int i4, int i5, int i6, int i7) {
        sc.j jVar;
        ViewParent parent;
        sc.j jVar2;
        boolean f4 = this.X2.f(i4, i5, i6, i7, this.W2);
        int i10 = i7 + this.W2[1];
        if ((i10 < 0 && ((this.C || this.L) && (this.U2 != 0 || (jVar2 = this.T2) == null || jVar2.a(this.f70591m3.getView())))) || (i10 > 0 && ((this.D || this.L) && (this.U2 != 0 || (jVar = this.T2) == null || jVar.b(this.f70591m3.getView()))))) {
            com.scwang.smart.refresh.layout.constant.b bVar = this.f70601r3;
            if (bVar == com.scwang.smart.refresh.layout.constant.b.None || bVar.isOpening) {
                this.f70597p3.o(i10 > 0 ? com.scwang.smart.refresh.layout.constant.b.PullUpToLoad : com.scwang.smart.refresh.layout.constant.b.PullDownToRefresh);
                if (!f4 && (parent = getParent()) != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
            }
            int i11 = this.U2 - i10;
            this.U2 = i11;
            N0(i11);
        }
        if (!this.f70615y3 || i5 >= 0) {
            return;
        }
        this.f70615y3 = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.b1
    public void onNestedScrollAccepted(@o0 View view, @o0 View view2, int i4) {
        this.Y2.b(view, view2, i4);
        this.X2.r(i4 & 2);
        this.U2 = this.f70570c;
        this.V2 = true;
        K0(0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.b1
    public boolean onStartNestedScroll(@o0 View view, @o0 View view2, int i4) {
        return isEnabled() && isNestedScrollingEnabled() && (i4 & 2) != 0 && (this.L || this.C || this.D);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.b1
    public void onStopNestedScroll(@o0 View view) {
        this.Y2.d(view);
        this.V2 = false;
        this.U2 = 0;
        P0();
        this.X2.t();
    }

    @Override // qc.f
    public qc.f p(int i4) {
        this.f70600r = i4;
        return this;
    }

    @Override // qc.f
    public qc.f p0(boolean z4) {
        this.C = z4;
        return this;
    }

    @Override // qc.f
    public qc.f q(boolean z4) {
        this.L = z4;
        return this;
    }

    @Override // qc.f
    public qc.f r(int i4) {
        if (i4 == this.f70569b3) {
            return this;
        }
        com.scwang.smart.refresh.layout.constant.a aVar = this.f70571c3;
        com.scwang.smart.refresh.layout.constant.a aVar2 = com.scwang.smart.refresh.layout.constant.a.f70679l;
        if (aVar.a(aVar2)) {
            this.f70569b3 = i4;
            qc.a aVar3 = this.f70589l3;
            if (aVar3 != null && this.f70613x3 && this.f70571c3.f70684b) {
                com.scwang.smart.refresh.layout.constant.c p4 = aVar3.p();
                if (p4 != com.scwang.smart.refresh.layout.constant.c.f70689h && !p4.f70693c) {
                    View view = this.f70589l3.getView();
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : G3;
                    view.measure(View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max((this.f70569b3 - marginLayoutParams.bottomMargin) - marginLayoutParams.topMargin, 0), 1073741824));
                    int i5 = marginLayoutParams.leftMargin;
                    int measuredHeight = ((getMeasuredHeight() + marginLayoutParams.topMargin) - this.f70575e3) - (p4 != com.scwang.smart.refresh.layout.constant.c.f70685d ? this.f70569b3 : 0);
                    view.layout(i5, measuredHeight, view.getMeasuredWidth() + i5, view.getMeasuredHeight() + measuredHeight);
                }
                float f4 = this.f70579g3;
                if (f4 < 10.0f) {
                    f4 *= this.f70569b3;
                }
                this.f70571c3 = aVar2;
                this.f70589l3.h(this.f70597p3, this.f70569b3, (int) f4);
            } else {
                this.f70571c3 = com.scwang.smart.refresh.layout.constant.a.f70678k;
            }
        }
        return this;
    }

    @Override // qc.f
    public qc.f r0(sc.h hVar) {
        this.Q2 = hVar;
        this.R2 = hVar;
        this.D = this.D || !(this.N2 || hVar == null);
        return this;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z4) {
        if (x1.a1(this.f70591m3.j())) {
            this.f70598q = z4;
            super.requestDisallowInterceptTouchEvent(z4);
        }
    }

    @Override // qc.f
    public qc.f s() {
        return a(false);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z4) {
        this.R = z4;
        this.X2.p(z4);
    }

    @Override // qc.f
    public qc.f t(sc.e eVar) {
        this.R2 = eVar;
        this.D = this.D || !(this.N2 || eVar == null);
        return this;
    }

    @Override // qc.f
    public qc.f t0() {
        return R(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.f70603s3))), 300) << 16, true, Boolean.TRUE);
    }

    @Override // qc.f
    public qc.f u0(int i4, boolean z4, boolean z5) {
        int i5 = i4 >> 16;
        int i6 = (i4 << 16) >> 16;
        h hVar = new h(i5, z5, z4);
        if (i6 > 0) {
            this.f70595o3.postDelayed(hVar, i6);
        } else {
            hVar.run();
        }
        return this;
    }

    @Override // qc.f
    public qc.f v(sc.f fVar) {
        this.S2 = fVar;
        return this;
    }

    @Override // qc.f
    public qc.f v0(@o0 Interpolator interpolator) {
        this.A = interpolator;
        return this;
    }

    @Override // qc.f
    public qc.f w(boolean z4) {
        return u0(z4 ? Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.f70603s3))), 300) << 16 : 0, z4, false);
    }

    @Override // qc.f
    public qc.f w0(boolean z4) {
        this.V1 = z4;
        return this;
    }

    @Override // qc.f
    public qc.f x0(@o0 qc.c cVar) {
        return o(cVar, 0, 0);
    }

    @Override // qc.f
    public qc.f y0(float f4) {
        this.f70590m = f4;
        return this;
    }

    @Override // qc.f
    public qc.f z() {
        return d0(true);
    }

    @Override // qc.f
    public qc.f z0(int i4) {
        this.f70573d3 = i4;
        return this;
    }

    public SmartRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f70576f = 300;
        this.f70578g = 300;
        this.f70590m = 0.5f;
        this.f70592n = 'n';
        this.f70600r = -1;
        this.f70602s = -1;
        this.f70604t = -1;
        this.f70606u = -1;
        this.C = true;
        this.D = false;
        this.E = true;
        this.F = true;
        this.G = true;
        this.H = true;
        this.I = false;
        this.J = true;
        this.K = true;
        this.L = false;
        this.M = true;
        this.N = false;
        this.O = true;
        this.P = true;
        this.Q = true;
        this.R = true;
        this.Q1 = false;
        this.V1 = false;
        this.L2 = false;
        this.M2 = false;
        this.N2 = false;
        this.O2 = false;
        this.P2 = false;
        this.W2 = new int[2];
        this.X2 = new y0(this);
        this.Y2 = new c1();
        com.scwang.smart.refresh.layout.constant.a aVar = com.scwang.smart.refresh.layout.constant.a.f70670c;
        this.f70567a3 = aVar;
        this.f70571c3 = aVar;
        this.f70577f3 = 2.5f;
        this.f70579g3 = 2.5f;
        this.f70581h3 = 1.0f;
        this.f70583i3 = 1.0f;
        this.f70585j3 = 0.16666667f;
        this.f70597p3 = new m();
        com.scwang.smart.refresh.layout.constant.b bVar = com.scwang.smart.refresh.layout.constant.b.None;
        this.f70599q3 = bVar;
        this.f70601r3 = bVar;
        this.f70603s3 = 0L;
        this.f70605t3 = 0;
        this.f70607u3 = 0;
        this.f70615y3 = false;
        this.f70617z3 = false;
        this.A3 = null;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f70595o3 = new Handler(Looper.getMainLooper());
        this.f70614y = new Scroller(context);
        this.f70616z = VelocityTracker.obtain();
        this.f70580h = context.getResources().getDisplayMetrics().heightPixels;
        this.A = new com.scwang.smart.refresh.layout.util.b(com.scwang.smart.refresh.layout.util.b.f70701b);
        this.f70568b = viewConfiguration.getScaledTouchSlop();
        this.f70608v = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f70610w = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f70569b3 = com.scwang.smart.refresh.layout.util.b.c(60.0f);
        this.Z2 = com.scwang.smart.refresh.layout.util.b.c(100.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.e.f89838a);
        if (!obtainStyledAttributes.hasValue(b.e.f89840c)) {
            super.setClipToPadding(false);
        }
        if (!obtainStyledAttributes.hasValue(b.e.f89839b)) {
            super.setClipChildren(false);
        }
        sc.d dVar = F3;
        if (dVar != null) {
            dVar.a(context, this);
        }
        this.f70590m = obtainStyledAttributes.getFloat(b.e.f89844g, this.f70590m);
        this.f70577f3 = obtainStyledAttributes.getFloat(b.e.H, this.f70577f3);
        this.f70579g3 = obtainStyledAttributes.getFloat(b.e.C, this.f70579g3);
        this.f70581h3 = obtainStyledAttributes.getFloat(b.e.J, this.f70581h3);
        this.f70583i3 = obtainStyledAttributes.getFloat(b.e.E, this.f70583i3);
        this.C = obtainStyledAttributes.getBoolean(b.e.f89859v, this.C);
        this.f70578g = obtainStyledAttributes.getInt(b.e.L, this.f70578g);
        int i4 = b.e.f89852o;
        this.D = obtainStyledAttributes.getBoolean(i4, this.D);
        int i5 = b.e.F;
        this.Z2 = obtainStyledAttributes.getDimensionPixelOffset(i5, this.Z2);
        int i6 = b.e.A;
        this.f70569b3 = obtainStyledAttributes.getDimensionPixelOffset(i6, this.f70569b3);
        this.f70573d3 = obtainStyledAttributes.getDimensionPixelOffset(b.e.G, this.f70573d3);
        this.f70575e3 = obtainStyledAttributes.getDimensionPixelOffset(b.e.B, this.f70575e3);
        this.Q1 = obtainStyledAttributes.getBoolean(b.e.f89843f, this.Q1);
        this.V1 = obtainStyledAttributes.getBoolean(b.e.f89842e, this.V1);
        int i7 = b.e.f89851n;
        this.G = obtainStyledAttributes.getBoolean(i7, this.G);
        int i10 = b.e.f89850m;
        this.H = obtainStyledAttributes.getBoolean(i10, this.H);
        this.J = obtainStyledAttributes.getBoolean(b.e.f89857t, this.J);
        this.M = obtainStyledAttributes.getBoolean(b.e.f89845h, this.M);
        this.K = obtainStyledAttributes.getBoolean(b.e.f89855r, this.K);
        this.N = obtainStyledAttributes.getBoolean(b.e.f89858u, this.N);
        this.O = obtainStyledAttributes.getBoolean(b.e.f89860w, this.O);
        this.P = obtainStyledAttributes.getBoolean(b.e.f89861x, this.P);
        this.Q = obtainStyledAttributes.getBoolean(b.e.f89853p, this.Q);
        boolean z4 = obtainStyledAttributes.getBoolean(b.e.f89848k, this.I);
        this.I = z4;
        this.I = obtainStyledAttributes.getBoolean(b.e.f89849l, z4);
        this.E = obtainStyledAttributes.getBoolean(b.e.f89847j, this.E);
        this.F = obtainStyledAttributes.getBoolean(b.e.f89846i, this.F);
        this.L = obtainStyledAttributes.getBoolean(b.e.f89856s, this.L);
        this.f70600r = obtainStyledAttributes.getResourceId(b.e.f89863z, this.f70600r);
        this.f70602s = obtainStyledAttributes.getResourceId(b.e.f89862y, this.f70602s);
        this.f70604t = obtainStyledAttributes.getResourceId(b.e.I, this.f70604t);
        this.f70606u = obtainStyledAttributes.getResourceId(b.e.D, this.f70606u);
        boolean z5 = obtainStyledAttributes.getBoolean(b.e.f89854q, this.R);
        this.R = z5;
        this.X2.p(z5);
        this.N2 = this.N2 || obtainStyledAttributes.hasValue(i4);
        this.O2 = this.O2 || obtainStyledAttributes.hasValue(i7);
        this.P2 = this.P2 || obtainStyledAttributes.hasValue(i10);
        this.f70567a3 = obtainStyledAttributes.hasValue(i5) ? com.scwang.smart.refresh.layout.constant.a.f70676i : this.f70567a3;
        this.f70571c3 = obtainStyledAttributes.hasValue(i6) ? com.scwang.smart.refresh.layout.constant.a.f70676i : this.f70571c3;
        int color = obtainStyledAttributes.getColor(b.e.f89841d, 0);
        int color2 = obtainStyledAttributes.getColor(b.e.K, 0);
        if (color2 != 0) {
            if (color != 0) {
                this.B = new int[]{color2, color};
            } else {
                this.B = new int[]{color2};
            }
        } else if (color != 0) {
            this.B = new int[]{0, color};
        }
        if (this.N && !this.N2 && !this.D) {
            this.D = true;
        }
        obtainStyledAttributes.recycle();
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f70618a;

        /* renamed from: b, reason: collision with root package name */
        public com.scwang.smart.refresh.layout.constant.c f70619b;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f70618a = 0;
            this.f70619b = null;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.e.M);
            this.f70618a = obtainStyledAttributes.getColor(b.e.N, this.f70618a);
            int i4 = b.e.O;
            if (obtainStyledAttributes.hasValue(i4)) {
                this.f70619b = com.scwang.smart.refresh.layout.constant.c.f70690i[obtainStyledAttributes.getInt(i4, com.scwang.smart.refresh.layout.constant.c.f70685d.f70691a)];
            }
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i4, int i5) {
            super(i4, i5);
            this.f70618a = 0;
            this.f70619b = null;
        }
    }
}
