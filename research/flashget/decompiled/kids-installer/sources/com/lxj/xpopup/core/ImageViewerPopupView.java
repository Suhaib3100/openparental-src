package com.lxj.xpopup.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.o0;
import androidx.transition.ChangeBounds;
import androidx.transition.ChangeImageTransform;
import androidx.transition.ChangeTransform;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import androidx.transition.y;
import androidx.transition.z;
import androidx.viewpager.widget.ViewPager;
import c3.h;
import c3.k;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.lxj.xpopup.b;
import com.lxj.xpopup.photoview.PhotoView;
import com.lxj.xpopup.util.XPermission;
import com.lxj.xpopup.widget.BlankView;
import com.lxj.xpopup.widget.HackyViewPager;
import com.lxj.xpopup.widget.PhotoViewContainer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class ImageViewerPopupView extends BasePopupView implements c3.d, View.OnClickListener {
    protected FrameLayout I;
    protected PhotoViewContainer J;
    protected BlankView K;
    protected TextView L;
    protected TextView M;
    protected HackyViewPager N;
    protected ArgbEvaluator O;
    protected List<Object> P;
    protected k Q;
    protected h R;
    protected int S;
    protected Rect T;
    protected ImageView U;
    protected PhotoView V;
    protected boolean W;

    /* renamed from: a0, reason: collision with root package name */
    protected int f21126a0;

    /* renamed from: b0, reason: collision with root package name */
    protected int f21127b0;

    /* renamed from: c0, reason: collision with root package name */
    protected int f21128c0;

    /* renamed from: d0, reason: collision with root package name */
    protected boolean f21129d0;

    /* renamed from: e0, reason: collision with root package name */
    protected boolean f21130e0;

    /* renamed from: f0, reason: collision with root package name */
    protected boolean f21131f0;

    /* renamed from: g0, reason: collision with root package name */
    protected View f21132g0;

    /* renamed from: h0, reason: collision with root package name */
    protected int f21133h0;

    /* renamed from: i0, reason: collision with root package name */
    public c3.e f21134i0;

    /* loaded from: classes5.dex */
    class a implements Runnable {

        /* renamed from: com.lxj.xpopup.core.ImageViewerPopupView$a$a, reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        class C0239a extends y {
            C0239a() {
            }

            @Override // androidx.transition.y, androidx.transition.Transition.h
            public void c(@o0 Transition transition) {
                ImageViewerPopupView.this.N.setVisibility(0);
                ImageViewerPopupView.this.V.setVisibility(4);
                ImageViewerPopupView.this.N0();
                ImageViewerPopupView.this.J.f21409t = false;
            }
        }

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            z.b((ViewGroup) ImageViewerPopupView.this.V.getParent(), new TransitionSet().E0(ImageViewerPopupView.this.K()).V0(new ChangeBounds()).V0(new ChangeTransform()).V0(new ChangeImageTransform()).G0(new androidx.interpolator.view.animation.b()).a(new C0239a()));
            ImageViewerPopupView.this.V.setTranslationY(0.0f);
            ImageViewerPopupView.this.V.setTranslationX(0.0f);
            ImageViewerPopupView.this.V.setScaleType(ImageView.ScaleType.FIT_CENTER);
            ImageViewerPopupView imageViewerPopupView = ImageViewerPopupView.this;
            com.lxj.xpopup.util.h.U(imageViewerPopupView.V, imageViewerPopupView.J.getWidth(), ImageViewerPopupView.this.J.getHeight());
            ImageViewerPopupView imageViewerPopupView2 = ImageViewerPopupView.this;
            imageViewerPopupView2.v0(imageViewerPopupView2.f21133h0);
            View view = ImageViewerPopupView.this.f21132g0;
            if (view != null) {
                view.animate().alpha(1.0f).setDuration(ImageViewerPopupView.this.K()).start();
            }
        }
    }

    /* loaded from: classes5.dex */
    class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f21137a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f21138b;

        b(final int val$endColor, final int val$start) {
            this.f21137a = val$endColor;
            this.f21138b = val$start;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animation) {
            ImageViewerPopupView imageViewerPopupView = ImageViewerPopupView.this;
            imageViewerPopupView.J.setBackgroundColor(((Integer) imageViewerPopupView.O.evaluate(animation.getAnimatedFraction(), Integer.valueOf(this.f21137a), Integer.valueOf(this.f21138b))).intValue());
        }
    }

    /* loaded from: classes5.dex */
    class c implements Runnable {

        /* loaded from: classes6.dex */
        class a extends y {
            a() {
            }

            @Override // androidx.transition.y, androidx.transition.Transition.h
            public void a(@o0 Transition transition) {
                ImageViewerPopupView.this.A();
            }

            @Override // androidx.transition.y, androidx.transition.Transition.h
            public void c(@o0 Transition transition) {
                ImageViewerPopupView.this.N.setScaleX(1.0f);
                ImageViewerPopupView.this.N.setScaleY(1.0f);
                ImageViewerPopupView.this.V.setScaleX(1.0f);
                ImageViewerPopupView.this.V.setScaleY(1.0f);
                ImageViewerPopupView.this.K.setVisibility(4);
                ImageViewerPopupView.this.V.setTranslationX(r3.T.left);
                ImageViewerPopupView.this.V.setTranslationY(r3.T.top);
                ImageViewerPopupView imageViewerPopupView = ImageViewerPopupView.this;
                com.lxj.xpopup.util.h.U(imageViewerPopupView.V, imageViewerPopupView.T.width(), ImageViewerPopupView.this.T.height());
            }
        }

        class b extends AnimatorListenerAdapter {
            b() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);
                View view = ImageViewerPopupView.this.f21132g0;
                if (view != null) {
                    view.setVisibility(4);
                }
            }
        }

        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            z.b((ViewGroup) ImageViewerPopupView.this.V.getParent(), new TransitionSet().E0(ImageViewerPopupView.this.K()).V0(new ChangeBounds()).V0(new ChangeTransform()).V0(new ChangeImageTransform()).G0(new androidx.interpolator.view.animation.b()).a(new a()));
            ImageViewerPopupView.this.V.setScaleX(1.0f);
            ImageViewerPopupView.this.V.setScaleY(1.0f);
            ImageViewerPopupView.this.V.setTranslationX(r0.T.left);
            ImageViewerPopupView.this.V.setTranslationY(r0.T.top);
            ImageViewerPopupView imageViewerPopupView = ImageViewerPopupView.this;
            imageViewerPopupView.V.setScaleType(imageViewerPopupView.U.getScaleType());
            ImageViewerPopupView imageViewerPopupView2 = ImageViewerPopupView.this;
            com.lxj.xpopup.util.h.U(imageViewerPopupView2.V, imageViewerPopupView2.T.width(), ImageViewerPopupView.this.T.height());
            ImageViewerPopupView.this.v0(0);
            View view = ImageViewerPopupView.this.f21132g0;
            if (view != null) {
                view.animate().alpha(0.0f).setDuration(ImageViewerPopupView.this.K()).setListener(new b()).start();
            }
        }
    }

    /* loaded from: classes5.dex */
    class d implements XPermission.d {
        d() {
        }

        @Override // com.lxj.xpopup.util.XPermission.d
        public void a() {
            Context context = ImageViewerPopupView.this.getContext();
            ImageViewerPopupView imageViewerPopupView = ImageViewerPopupView.this;
            com.lxj.xpopup.util.h.R(context, imageViewerPopupView.Q, imageViewerPopupView.P.get(imageViewerPopupView.w0()));
        }

        @Override // com.lxj.xpopup.util.XPermission.d
        public void b() {
        }
    }

    /* loaded from: classes5.dex */
    public class e extends androidx.viewpager.widget.a implements ViewPager.i {
        public e() {
        }

        private FrameLayout y(Context context) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return frameLayout;
        }

        private ProgressBar z(Context context) {
            ProgressBar progressBar = new ProgressBar(context);
            progressBar.setIndeterminate(true);
            int p5 = com.lxj.xpopup.util.h.p(ImageViewerPopupView.this.I.getContext(), 40.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(p5, p5);
            layoutParams.gravity = 17;
            progressBar.setLayoutParams(layoutParams);
            progressBar.setVisibility(8);
            return progressBar;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void a(int position, float positionOffset, int positionOffsetPixels) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void c(int state) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void d(int i5) {
            ImageViewerPopupView imageViewerPopupView = ImageViewerPopupView.this;
            imageViewerPopupView.S = i5;
            imageViewerPopupView.N0();
            ImageViewerPopupView imageViewerPopupView2 = ImageViewerPopupView.this;
            h hVar = imageViewerPopupView2.R;
            if (hVar != null) {
                hVar.a(imageViewerPopupView2, imageViewerPopupView2.w0());
            }
        }

        @Override // androidx.viewpager.widget.a
        public void e(@o0 ViewGroup container, int position, @o0 Object object) {
            container.removeView((View) object);
        }

        @Override // androidx.viewpager.widget.a
        public int h() {
            ImageViewerPopupView imageViewerPopupView = ImageViewerPopupView.this;
            if (imageViewerPopupView.f21131f0) {
                return 100000;
            }
            return imageViewerPopupView.P.size();
        }

        @Override // androidx.viewpager.widget.a
        @o0
        public Object m(@o0 ViewGroup container, final int position) {
            ImageViewerPopupView imageViewerPopupView = ImageViewerPopupView.this;
            if (imageViewerPopupView.f21131f0) {
                position %= imageViewerPopupView.P.size();
            }
            int i5 = position;
            FrameLayout y5 = y(container.getContext());
            ProgressBar z5 = z(container.getContext());
            ImageViewerPopupView imageViewerPopupView2 = ImageViewerPopupView.this;
            k kVar = imageViewerPopupView2.Q;
            Object obj = imageViewerPopupView2.P.get(i5);
            ImageViewerPopupView imageViewerPopupView3 = ImageViewerPopupView.this;
            y5.addView(kVar.c(i5, obj, imageViewerPopupView3, imageViewerPopupView3.V, z5), new FrameLayout.LayoutParams(-1, -1));
            y5.addView(z5);
            container.addView(y5);
            return y5;
        }

        @Override // androidx.viewpager.widget.a
        public boolean n(@o0 View view, @o0 Object o5) {
            return o5 == view;
        }
    }

    public ImageViewerPopupView(@o0 Context context) {
        super(context);
        this.O = new ArgbEvaluator();
        this.P = new ArrayList();
        this.T = null;
        this.W = true;
        this.f21126a0 = Color.parseColor(ProtectedSandApp.s("歯"));
        this.f21127b0 = -1;
        this.f21128c0 = -1;
        this.f21129d0 = true;
        this.f21130e0 = true;
        this.f21131f0 = false;
        this.f21133h0 = Color.rgb(32, 36, 46);
        this.I = (FrameLayout) findViewById(b.h.W0);
        if (M() > 0) {
            View inflate = LayoutInflater.from(getContext()).inflate(M(), (ViewGroup) this.I, false);
            this.f21132g0 = inflate;
            inflate.setVisibility(4);
            this.f21132g0.setAlpha(0.0f);
            this.I.addView(this.f21132g0);
        }
    }

    private void M0() {
        this.K.setVisibility(this.W ? 0 : 4);
        if (this.W) {
            int i5 = this.f21126a0;
            if (i5 != -1) {
                this.K.f21364r = i5;
            }
            int i6 = this.f21128c0;
            if (i6 != -1) {
                this.K.f21363q = i6;
            }
            int i7 = this.f21127b0;
            if (i7 != -1) {
                this.K.f21365s = i7;
            }
            com.lxj.xpopup.util.h.U(this.K, this.T.width(), this.T.height());
            this.K.setTranslationX(this.T.left);
            this.K.setTranslationY(this.T.top);
            this.K.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N0() {
        if (this.P.size() > 1) {
            int w02 = w0();
            this.L.setText((w02 + 1) + ProtectedSandApp.s("歰") + this.P.size());
        }
        if (this.f21129d0) {
            this.M.setVisibility(0);
        }
    }

    private void u0() {
        if (this.U == null) {
            return;
        }
        if (this.V == null) {
            PhotoView photoView = new PhotoView(getContext(), null);
            this.V = photoView;
            photoView.setEnabled(false);
            this.J.addView(this.V);
            this.V.setScaleType(this.U.getScaleType());
            this.V.setTranslationX(this.T.left);
            this.V.setTranslationY(this.T.top);
            com.lxj.xpopup.util.h.U(this.V, this.T.width(), this.T.height());
        }
        int w02 = w0();
        this.V.setTag(Integer.valueOf(w02));
        M0();
        k kVar = this.Q;
        if (kVar != null) {
            kVar.a(this.P.get(w02), this.V, this.U);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v0(final int endColor) {
        int color = ((ColorDrawable) this.J.getBackground()).getColor();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new b(color, endColor));
        ofFloat.setDuration(K()).setInterpolator(new LinearInterpolator());
        ofFloat.start();
    }

    public ImageViewerPopupView A0(boolean isShowSaveBtn) {
        this.f21129d0 = isShowSaveBtn;
        return this;
    }

    protected void B0() {
        XPermission.p(getContext(), ProtectedSandApp.s("歱")).o(new d()).F();
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    public void C() {
        if (this.U != null) {
            this.L.setVisibility(4);
            this.M.setVisibility(4);
            this.N.setVisibility(4);
            this.J.f21409t = true;
            this.V.setVisibility(0);
            this.V.post(new c());
            return;
        }
        this.J.setBackgroundColor(0);
        A();
        this.N.setVisibility(4);
        this.K.setVisibility(4);
        View view = this.f21132g0;
        if (view != null) {
            view.setAlpha(0.0f);
            this.f21132g0.setVisibility(4);
        }
    }

    public ImageViewerPopupView C0(int bgColor) {
        this.f21133h0 = bgColor;
        return this;
    }

    public ImageViewerPopupView D0(List<Object> urls) {
        this.P = urls;
        return this;
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    public void E() {
        if (this.U != null) {
            this.J.f21409t = true;
            View view = this.f21132g0;
            if (view != null) {
                view.setVisibility(0);
            }
            this.V.setVisibility(0);
            B();
            this.V.post(new a());
            return;
        }
        this.J.setBackgroundColor(this.f21133h0);
        this.N.setVisibility(0);
        N0();
        this.J.f21409t = false;
        B();
        View view2 = this.f21132g0;
        if (view2 != null) {
            view2.setAlpha(1.0f);
            this.f21132g0.setVisibility(0);
        }
    }

    public ImageViewerPopupView E0(c3.e longPressListener) {
        this.f21134i0 = longPressListener;
        return this;
    }

    public ImageViewerPopupView F0(int color) {
        this.f21126a0 = color;
        return this;
    }

    public ImageViewerPopupView G0(int radius) {
        this.f21128c0 = radius;
        return this;
    }

    public ImageViewerPopupView H0(int strokeColor) {
        this.f21127b0 = strokeColor;
        return this;
    }

    public ImageViewerPopupView I0(ImageView srcView, Object url) {
        if (this.P == null) {
            this.P = new ArrayList();
        }
        this.P.clear();
        this.P.add(url);
        J0(srcView, 0);
        return this;
    }

    public ImageViewerPopupView J0(ImageView srcView, int position) {
        this.U = srcView;
        this.S = position;
        if (srcView != null) {
            int[] iArr = new int[2];
            srcView.getLocationInWindow(iArr);
            int i5 = iArr[0];
            if (com.lxj.xpopup.util.h.H(getContext())) {
                int i6 = -((com.lxj.xpopup.util.h.t(getContext()) - iArr[0]) - srcView.getWidth());
                this.T = new Rect(i6, iArr[1], srcView.getWidth() + i6, srcView.getHeight() + iArr[1]);
            } else {
                this.T = new Rect(i5, iArr[1], srcView.getWidth() + i5, srcView.getHeight() + iArr[1]);
            }
        }
        return this;
    }

    public ImageViewerPopupView K0(h srcViewUpdateListener) {
        this.R = srcViewUpdateListener;
        return this;
    }

    public ImageViewerPopupView L0(k imageLoader) {
        this.Q = imageLoader;
        return this;
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected final int N() {
        return b.k.f20631o;
    }

    public void O0(ImageView srcView) {
        J0(srcView, this.S);
        u0();
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void d0() {
        this.L = (TextView) findViewById(b.h.m6);
        this.M = (TextView) findViewById(b.h.n6);
        this.K = (BlankView) findViewById(b.h.f20430f4);
        PhotoViewContainer photoViewContainer = (PhotoViewContainer) findViewById(b.h.f20416d4);
        this.J = photoViewContainer;
        photoViewContainer.i(this);
        this.N = (HackyViewPager) findViewById(b.h.T3);
        e eVar = new e();
        this.N.X(eVar);
        this.N.Y(this.S);
        this.N.setVisibility(4);
        u0();
        this.N.d0(2);
        this.N.c(eVar);
        if (!this.f21130e0) {
            this.L.setVisibility(8);
        }
        if (this.f21129d0) {
            this.M.setOnClickListener(this);
        } else {
            this.M.setVisibility(8);
        }
    }

    @Override // c3.d
    public void i() {
        x();
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void i0() {
        this.U = null;
        this.R = null;
    }

    @Override // c3.d
    public void j(int dy, float scale, float fraction) {
        float f6 = 1.0f - fraction;
        this.L.setAlpha(f6);
        View view = this.f21132g0;
        if (view != null) {
            view.setAlpha(f6);
        }
        if (this.f21129d0) {
            this.M.setAlpha(f6);
        }
        this.J.setBackgroundColor(((Integer) this.O.evaluate(fraction * 0.8f, Integer.valueOf(this.f21133h0), 0)).intValue());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v5) {
        if (v5 == this.M) {
            B0();
        }
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    public void v() {
        super.v();
        HackyViewPager hackyViewPager = this.N;
        hackyViewPager.T((e) hackyViewPager.u());
        this.Q = null;
    }

    protected int w0() {
        return this.f21131f0 ? this.S % this.P.size() : this.S;
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    public void x() {
        if (this.f21079t != b3.e.Show) {
            return;
        }
        this.f21079t = b3.e.Dismissing;
        C();
    }

    public ImageViewerPopupView x0(boolean isInfinite) {
        this.f21131f0 = isInfinite;
        return this;
    }

    public ImageViewerPopupView y0(boolean isShow) {
        this.f21130e0 = isShow;
        return this;
    }

    public ImageViewerPopupView z0(boolean isShow) {
        this.W = isShow;
        return this;
    }
}
