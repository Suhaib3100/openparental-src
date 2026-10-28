package com.jcodecraeer.xrecyclerview;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.jcodecraeer.xrecyclerview.g;
import com.jcodecraeer.xrecyclerview.progressindicator.AVLoadingIndicatorView;
import com.tencent.mmkv.MMKV;
import java.util.Date;

/* loaded from: classes6.dex */
public class ArrowRefreshHeader extends LinearLayout implements com.jcodecraeer.xrecyclerview.b {

    /* renamed from: n, reason: collision with root package name */
    private static final String f64829n = ProtectedSandApp.s("ᑰ\u0001");

    /* renamed from: o, reason: collision with root package name */
    private static final String f64830o = ProtectedSandApp.s("ᑱ\u0001");

    /* renamed from: p, reason: collision with root package name */
    private static final int f64831p = 180;

    /* renamed from: b, reason: collision with root package name */
    private LinearLayout f64832b;

    /* renamed from: c, reason: collision with root package name */
    private ImageView f64833c;

    /* renamed from: d, reason: collision with root package name */
    private SimpleViewSwitcher f64834d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f64835e;

    /* renamed from: f, reason: collision with root package name */
    private int f64836f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f64837g;

    /* renamed from: h, reason: collision with root package name */
    private LinearLayout f64838h;

    /* renamed from: i, reason: collision with root package name */
    private Animation f64839i;

    /* renamed from: j, reason: collision with root package name */
    private Animation f64840j;

    /* renamed from: k, reason: collision with root package name */
    public int f64841k;

    /* renamed from: l, reason: collision with root package name */
    private AVLoadingIndicatorView f64842l;

    /* renamed from: m, reason: collision with root package name */
    private String f64843m;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrowRefreshHeader.this.k();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrowRefreshHeader.this.q(0);
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ArrowRefreshHeader.this.r(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public ArrowRefreshHeader(Context context) {
        super(context);
        this.f64836f = 0;
        this.f64843m = null;
        j();
    }

    public static String e(long j4) {
        int currentTimeMillis = (int) ((System.currentTimeMillis() - j4) / 1000);
        if (currentTimeMillis == 0) {
            return ProtectedSandApp.s("ᑩ\u0001");
        }
        if (currentTimeMillis > 0 && currentTimeMillis < 60) {
            return currentTimeMillis + ProtectedSandApp.s("ᑪ\u0001");
        }
        if (currentTimeMillis >= 60 && currentTimeMillis < 3600) {
            return Math.max(currentTimeMillis / 60, 1) + ProtectedSandApp.s("ᑫ\u0001");
        }
        if (currentTimeMillis >= 3600 && currentTimeMillis < 86400) {
            return (currentTimeMillis / MMKV.ExpireInHour) + ProtectedSandApp.s("ᑬ\u0001");
        }
        if (currentTimeMillis >= 86400 && currentTimeMillis < 2592000) {
            return (currentTimeMillis / MMKV.ExpireInDay) + ProtectedSandApp.s("ᑭ\u0001");
        }
        if (currentTimeMillis < 2592000 || currentTimeMillis >= 31104000) {
            return (currentTimeMillis / 31104000) + ProtectedSandApp.s("ᑯ\u0001");
        }
        return (currentTimeMillis / MMKV.ExpireInMonth) + ProtectedSandApp.s("ᑮ\u0001");
    }

    public static String f(Date date) {
        return e(date.getTime());
    }

    private long g() {
        String str = this.f64843m;
        if (str == null) {
            str = ProtectedSandApp.s("ᑰ\u0001");
        }
        return getContext().getSharedPreferences(str, 32768).getLong(ProtectedSandApp.s("ᑱ\u0001"), new Date().getTime());
    }

    private void j() {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(getContext()).inflate(g.k.T, (ViewGroup) null);
        this.f64832b = linearLayout;
        this.f64838h = (LinearLayout) linearLayout.findViewById(g.h.L1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, 0);
        setLayoutParams(layoutParams);
        setPadding(0, 0, 0, 0);
        addView(this.f64832b, new LinearLayout.LayoutParams(-1, 0));
        setGravity(80);
        this.f64833c = (ImageView) findViewById(g.h.f65710k2);
        this.f64835e = (TextView) findViewById(g.h.f65776x3);
        this.f64834d = (SimpleViewSwitcher) findViewById(g.h.f65720m2);
        AVLoadingIndicatorView aVLoadingIndicatorView = new AVLoadingIndicatorView(getContext());
        this.f64842l = aVLoadingIndicatorView;
        aVLoadingIndicatorView.h(-4868683);
        this.f64842l.i(22);
        SimpleViewSwitcher simpleViewSwitcher = this.f64834d;
        if (simpleViewSwitcher != null) {
            simpleViewSwitcher.a(this.f64842l);
        }
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
        this.f64839i = rotateAnimation;
        rotateAnimation.setDuration(180L);
        this.f64839i.setFillAfter(true);
        RotateAnimation rotateAnimation2 = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        this.f64840j = rotateAnimation2;
        rotateAnimation2.setDuration(180L);
        this.f64840j.setFillAfter(true);
        this.f64837g = (TextView) findViewById(g.h.f65656a2);
        measure(-2, -2);
        this.f64841k = getMeasuredHeight();
    }

    private void l(long j4) {
        String str = this.f64843m;
        if (str == null) {
            str = ProtectedSandApp.s("ᑰ\u0001");
        }
        getContext().getSharedPreferences(str, 32768).edit().putLong(ProtectedSandApp.s("ᑱ\u0001"), j4).commit();
    }

    private void t(int i4) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i(), i4);
        ofInt.setDuration(300L).start();
        ofInt.addUpdateListener(new c());
        ofInt.start();
    }

    @Override // com.jcodecraeer.xrecyclerview.b
    public void a(float f4) {
        if (i() > 0 || f4 > 0.0f) {
            r(i() + ((int) f4));
            if (this.f64836f <= 1) {
                if (i() > this.f64841k) {
                    q(1);
                } else {
                    q(0);
                }
            }
        }
    }

    @Override // com.jcodecraeer.xrecyclerview.b
    public boolean b() {
        boolean z4;
        i();
        if (i() <= this.f64841k || this.f64836f >= 2) {
            z4 = false;
        } else {
            q(2);
            z4 = true;
        }
        if (this.f64836f != 2) {
            t(0);
        }
        if (this.f64836f == 2) {
            t(this.f64841k);
        }
        return z4;
    }

    @Override // com.jcodecraeer.xrecyclerview.b
    public void c() {
        this.f64837g.setText(e(g()));
        l(System.currentTimeMillis());
        q(3);
        new Handler().postDelayed(new a(), 200L);
    }

    public void d() {
        this.f64834d = null;
        AVLoadingIndicatorView aVLoadingIndicatorView = this.f64842l;
        if (aVLoadingIndicatorView != null) {
            aVLoadingIndicatorView.c();
            this.f64842l = null;
        }
        Animation animation = this.f64839i;
        if (animation != null) {
            animation.cancel();
            this.f64839i = null;
        }
        Animation animation2 = this.f64840j;
        if (animation2 != null) {
            animation2.cancel();
            this.f64840j = null;
        }
    }

    public int h() {
        return this.f64836f;
    }

    public int i() {
        return ((LinearLayout.LayoutParams) this.f64832b.getLayoutParams()).height;
    }

    public void k() {
        t(0);
        new Handler().postDelayed(new b(), 500L);
    }

    public void m(int i4) {
        this.f64833c.setImageResource(i4);
    }

    public void n(int i4) {
        if (i4 == -1) {
            SimpleViewSwitcher simpleViewSwitcher = this.f64834d;
            if (simpleViewSwitcher != null) {
                simpleViewSwitcher.a(new ProgressBar(getContext(), null, R.attr.progressBarStyle));
                return;
            }
            return;
        }
        AVLoadingIndicatorView aVLoadingIndicatorView = new AVLoadingIndicatorView(getContext());
        this.f64842l = aVLoadingIndicatorView;
        aVLoadingIndicatorView.h(-4868683);
        this.f64842l.i(i4);
        this.f64834d.a(this.f64842l);
    }

    public void o(boolean z4) {
        LinearLayout linearLayout = this.f64838h;
        if (linearLayout != null) {
            linearLayout.setVisibility(z4 ? 0 : 8);
        }
    }

    public void p(Boolean bool) {
        LinearLayout linearLayout = (LinearLayout) findViewById(g.h.f65725n2);
        if (bool.booleanValue()) {
            linearLayout.setVisibility(0);
        } else {
            linearLayout.setVisibility(8);
        }
    }

    public void q(int i4) {
        if (i4 == this.f64836f) {
            return;
        }
        if (i4 == 2) {
            this.f64833c.clearAnimation();
            this.f64833c.setVisibility(4);
            SimpleViewSwitcher simpleViewSwitcher = this.f64834d;
            if (simpleViewSwitcher != null) {
                simpleViewSwitcher.setVisibility(0);
            }
            t(this.f64841k);
        } else if (i4 == 3) {
            this.f64833c.setVisibility(4);
            SimpleViewSwitcher simpleViewSwitcher2 = this.f64834d;
            if (simpleViewSwitcher2 != null) {
                simpleViewSwitcher2.setVisibility(4);
            }
        } else {
            this.f64833c.setVisibility(0);
            SimpleViewSwitcher simpleViewSwitcher3 = this.f64834d;
            if (simpleViewSwitcher3 != null) {
                simpleViewSwitcher3.setVisibility(4);
            }
        }
        this.f64837g.setText(e(g()));
        if (i4 == 0) {
            if (this.f64836f == 1) {
                this.f64833c.startAnimation(this.f64840j);
            }
            if (this.f64836f == 2) {
                this.f64833c.clearAnimation();
            }
            this.f64835e.setText(g.m.P);
        } else if (i4 != 1) {
            if (i4 == 2) {
                this.f64835e.setText(g.m.O0);
            } else if (i4 == 3) {
                this.f64835e.setText(g.m.N0);
            }
        } else if (this.f64836f != 1) {
            this.f64833c.clearAnimation();
            this.f64833c.startAnimation(this.f64839i);
            this.f64835e.setText(g.m.Q);
        }
        this.f64836f = i4;
    }

    public void r(int i4) {
        if (i4 < 0) {
            i4 = 0;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f64832b.getLayoutParams();
        layoutParams.height = i4;
        this.f64832b.setLayoutParams(layoutParams);
    }

    public void s(String str) {
        if (str != null) {
            this.f64843m = str;
        }
    }

    public ArrowRefreshHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f64836f = 0;
        this.f64843m = null;
        j();
    }
}
