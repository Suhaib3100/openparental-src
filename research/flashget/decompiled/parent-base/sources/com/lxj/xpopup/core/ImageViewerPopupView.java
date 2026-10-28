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
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.transition.ChangeBounds;
import androidx.transition.ChangeImageTransform;
import androidx.transition.ChangeTransform;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import androidx.transition.w;
import androidx.transition.x;
import androidx.viewpager.widget.ViewPager;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.lxj.xpopup.b;
import com.lxj.xpopup.photoview.PhotoView;
import com.lxj.xpopup.util.XPermission;
import com.lxj.xpopup.widget.BlankView;
import com.lxj.xpopup.widget.HackyViewPager;
import com.lxj.xpopup.widget.PhotoViewContainer;
import gb.h;
import gb.k;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class ImageViewerPopupView extends BasePopupView implements gb.d, View.OnClickListener {
    protected HackyViewPager A;
    protected ArgbEvaluator B;
    protected List<Object> C;
    protected k D;
    protected h E;
    protected int F;
    protected Rect G;
    protected ImageView H;
    protected PhotoView I;
    protected boolean J;
    protected int K;
    protected int L;
    protected int M;
    protected boolean N;
    protected boolean O;
    protected boolean P;
    protected View Q;
    public gb.e Q1;
    protected int R;

    /* renamed from: v, reason: collision with root package name */
    protected FrameLayout f69603v;

    /* renamed from: w, reason: collision with root package name */
    protected PhotoViewContainer f69604w;

    /* renamed from: x, reason: collision with root package name */
    protected BlankView f69605x;

    /* renamed from: y, reason: collision with root package name */
    protected TextView f69606y;

    /* renamed from: z, reason: collision with root package name */
    protected TextView f69607z;

    class a implements Runnable {

        /* renamed from: com.lxj.xpopup.core.ImageViewerPopupView$a$a, reason: collision with other inner class name */
        class C0979a extends w {
            C0979a() {
            }

            @Override // androidx.transition.w, androidx.transition.Transition.h
            public void d(@o0 Transition transition) {
                ImageViewerPopupView.this.A.setVisibility(0);
                ImageViewerPopupView.this.I.setVisibility(4);
                ImageViewerPopupView.this.J0();
                ImageViewerPopupView.this.f69604w.f69899g = false;
            }
        }

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            x.b((ViewGroup) ImageViewerPopupView.this.I.getParent(), new TransitionSet().A0(ImageViewerPopupView.this.G()).Q0(new ChangeBounds()).Q0(new ChangeTransform()).Q0(new ChangeImageTransform()).C0(new androidx.interpolator.view.animation.b()).b(new C0979a()));
            ImageViewerPopupView.this.I.setTranslationY(0.0f);
            ImageViewerPopupView.this.I.setTranslationX(0.0f);
            ImageViewerPopupView.this.I.setScaleType(ImageView.ScaleType.FIT_CENTER);
            ImageViewerPopupView imageViewerPopupView = ImageViewerPopupView.this;
            com.lxj.xpopup.util.h.U(imageViewerPopupView.I, imageViewerPopupView.f69604w.getWidth(), ImageViewerPopupView.this.f69604w.getHeight());
            ImageViewerPopupView imageViewerPopupView2 = ImageViewerPopupView.this;
            imageViewerPopupView2.r0(imageViewerPopupView2.R);
            View view = ImageViewerPopupView.this.Q;
            if (view != null) {
                view.animate().alpha(1.0f).setDuration(ImageViewerPopupView.this.G()).start();
            }
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f69610b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f69611c;

        b(final int val$endColor, final int val$start) {
            this.f69610b = val$endColor;
            this.f69611c = val$start;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animation) {
            ImageViewerPopupView imageViewerPopupView = ImageViewerPopupView.this;
            imageViewerPopupView.f69604w.setBackgroundColor(((Integer) imageViewerPopupView.B.evaluate(animation.getAnimatedFraction(), Integer.valueOf(this.f69610b), Integer.valueOf(this.f69611c))).intValue());
        }
    }

    class c implements Runnable {

        class a extends w {
            a() {
            }

            @Override // androidx.transition.w, androidx.transition.Transition.h
            public void b(@o0 Transition transition) {
                ImageViewerPopupView.this.w();
            }

            @Override // androidx.transition.w, androidx.transition.Transition.h
            public void d(@o0 Transition transition) {
                ImageViewerPopupView.this.A.setScaleX(1.0f);
                ImageViewerPopupView.this.A.setScaleY(1.0f);
                ImageViewerPopupView.this.I.setScaleX(1.0f);
                ImageViewerPopupView.this.I.setScaleY(1.0f);
                ImageViewerPopupView.this.f69605x.setVisibility(4);
                ImageViewerPopupView.this.I.setTranslationX(r3.G.left);
                ImageViewerPopupView.this.I.setTranslationY(r3.G.top);
                ImageViewerPopupView imageViewerPopupView = ImageViewerPopupView.this;
                com.lxj.xpopup.util.h.U(imageViewerPopupView.I, imageViewerPopupView.G.width(), ImageViewerPopupView.this.G.height());
            }
        }

        class b extends AnimatorListenerAdapter {
            b() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);
                View view = ImageViewerPopupView.this.Q;
                if (view != null) {
                    view.setVisibility(4);
                }
            }
        }

        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            x.b((ViewGroup) ImageViewerPopupView.this.I.getParent(), new TransitionSet().A0(ImageViewerPopupView.this.G()).Q0(new ChangeBounds()).Q0(new ChangeTransform()).Q0(new ChangeImageTransform()).C0(new androidx.interpolator.view.animation.b()).b(new a()));
            ImageViewerPopupView.this.I.setScaleX(1.0f);
            ImageViewerPopupView.this.I.setScaleY(1.0f);
            ImageViewerPopupView.this.I.setTranslationX(r0.G.left);
            ImageViewerPopupView.this.I.setTranslationY(r0.G.top);
            ImageViewerPopupView imageViewerPopupView = ImageViewerPopupView.this;
            imageViewerPopupView.I.setScaleType(imageViewerPopupView.H.getScaleType());
            ImageViewerPopupView imageViewerPopupView2 = ImageViewerPopupView.this;
            com.lxj.xpopup.util.h.U(imageViewerPopupView2.I, imageViewerPopupView2.G.width(), ImageViewerPopupView.this.G.height());
            ImageViewerPopupView.this.r0(0);
            View view = ImageViewerPopupView.this.Q;
            if (view != null) {
                view.animate().alpha(0.0f).setDuration(ImageViewerPopupView.this.G()).setListener(new b()).start();
            }
        }
    }

    class d implements XPermission.d {
        d() {
        }

        @Override // com.lxj.xpopup.util.XPermission.d
        public void onDenied() {
        }

        @Override // com.lxj.xpopup.util.XPermission.d
        public void onGranted() {
            Context context = ImageViewerPopupView.this.getContext();
            ImageViewerPopupView imageViewerPopupView = ImageViewerPopupView.this;
            com.lxj.xpopup.util.h.R(context, imageViewerPopupView.D, imageViewerPopupView.C.get(imageViewerPopupView.s0()));
        }
    }

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
            int p4 = com.lxj.xpopup.util.h.p(ImageViewerPopupView.this.f69603v.getContext(), 40.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(p4, p4);
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
        public void d(int i4) {
            ImageViewerPopupView imageViewerPopupView = ImageViewerPopupView.this;
            imageViewerPopupView.F = i4;
            imageViewerPopupView.J0();
            ImageViewerPopupView imageViewerPopupView2 = ImageViewerPopupView.this;
            h hVar = imageViewerPopupView2.E;
            if (hVar != null) {
                hVar.a(imageViewerPopupView2, imageViewerPopupView2.s0());
            }
        }

        @Override // androidx.viewpager.widget.a
        public void e(@o0 ViewGroup container, int position, @o0 Object object) {
            container.removeView((View) object);
        }

        @Override // androidx.viewpager.widget.a
        public int h() {
            ImageViewerPopupView imageViewerPopupView = ImageViewerPopupView.this;
            return imageViewerPopupView.P ? AndroidComposeViewAccessibilityDelegateCompat.Q2 : imageViewerPopupView.C.size();
        }

        @Override // androidx.viewpager.widget.a
        @o0
        public Object m(@o0 ViewGroup container, final int position) {
            ImageViewerPopupView imageViewerPopupView = ImageViewerPopupView.this;
            if (imageViewerPopupView.P) {
                position %= imageViewerPopupView.C.size();
            }
            int i4 = position;
            FrameLayout y4 = y(container.getContext());
            ProgressBar z4 = z(container.getContext());
            ImageViewerPopupView imageViewerPopupView2 = ImageViewerPopupView.this;
            k kVar = imageViewerPopupView2.D;
            Object obj = imageViewerPopupView2.C.get(i4);
            ImageViewerPopupView imageViewerPopupView3 = ImageViewerPopupView.this;
            y4.addView(kVar.b(i4, obj, imageViewerPopupView3, imageViewerPopupView3.I, z4), new FrameLayout.LayoutParams(-1, -1));
            y4.addView(z4);
            container.addView(y4);
            return y4;
        }

        @Override // androidx.viewpager.widget.a
        public boolean n(@o0 View view, @o0 Object o4) {
            return o4 == view;
        }
    }

    public ImageViewerPopupView(@o0 Context context) {
        super(context);
        this.B = new ArgbEvaluator();
        this.C = new ArrayList();
        this.G = null;
        this.J = true;
        this.K = Color.parseColor(ProtectedSandApp.s("ប\u0001"));
        this.L = -1;
        this.M = -1;
        this.N = true;
        this.O = true;
        this.P = false;
        this.R = Color.rgb(32, 36, 46);
        this.f69603v = (FrameLayout) findViewById(b.h.W0);
        if (I() > 0) {
            View inflate = LayoutInflater.from(getContext()).inflate(I(), (ViewGroup) this.f69603v, false);
            this.Q = inflate;
            inflate.setVisibility(4);
            this.Q.setAlpha(0.0f);
            this.f69603v.addView(this.Q);
        }
    }

    private void I0() {
        this.f69605x.setVisibility(this.J ? 0 : 4);
        if (this.J) {
            int i4 = this.K;
            if (i4 != -1) {
                this.f69605x.f69841e = i4;
            }
            int i5 = this.M;
            if (i5 != -1) {
                this.f69605x.f69840d = i5;
            }
            int i6 = this.L;
            if (i6 != -1) {
                this.f69605x.f69842f = i6;
            }
            com.lxj.xpopup.util.h.U(this.f69605x, this.G.width(), this.G.height());
            this.f69605x.setTranslationX(this.G.left);
            this.f69605x.setTranslationY(this.G.top);
            this.f69605x.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J0() {
        if (this.C.size() > 1) {
            int s02 = s0();
            this.f69606y.setText((s02 + 1) + ProtectedSandApp.s("ផ\u0001") + this.C.size());
        }
        if (this.N) {
            this.f69607z.setVisibility(0);
        }
    }

    private void q0() {
        if (this.H == null) {
            return;
        }
        if (this.I == null) {
            PhotoView photoView = new PhotoView(getContext(), null);
            this.I = photoView;
            photoView.setEnabled(false);
            this.f69604w.addView(this.I);
            this.I.setScaleType(this.H.getScaleType());
            this.I.setTranslationX(this.G.left);
            this.I.setTranslationY(this.G.top);
            com.lxj.xpopup.util.h.U(this.I, this.G.width(), this.G.height());
        }
        int s02 = s0();
        this.I.setTag(Integer.valueOf(s02));
        I0();
        k kVar = this.D;
        if (kVar != null) {
            kVar.a(this.C.get(s02), this.I, this.H);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r0(final int endColor) {
        int color = ((ColorDrawable) this.f69604w.getBackground()).getColor();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new b(color, endColor));
        ofFloat.setDuration(G()).setInterpolator(new LinearInterpolator());
        ofFloat.start();
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    public void A() {
        if (this.H != null) {
            this.f69604w.f69899g = true;
            View view = this.Q;
            if (view != null) {
                view.setVisibility(0);
            }
            this.I.setVisibility(0);
            x();
            this.I.post(new a());
            return;
        }
        this.f69604w.setBackgroundColor(this.R);
        this.A.setVisibility(0);
        J0();
        this.f69604w.f69899g = false;
        x();
        View view2 = this.Q;
        if (view2 != null) {
            view2.setAlpha(1.0f);
            this.Q.setVisibility(0);
        }
    }

    public ImageViewerPopupView A0(gb.e longPressListener) {
        this.Q1 = longPressListener;
        return this;
    }

    public ImageViewerPopupView B0(int color) {
        this.K = color;
        return this;
    }

    public ImageViewerPopupView C0(int radius) {
        this.M = radius;
        return this;
    }

    public ImageViewerPopupView D0(int strokeColor) {
        this.L = strokeColor;
        return this;
    }

    public ImageViewerPopupView E0(ImageView srcView, Object url) {
        if (this.C == null) {
            this.C = new ArrayList();
        }
        this.C.clear();
        this.C.add(url);
        F0(srcView, 0);
        return this;
    }

    public ImageViewerPopupView F0(ImageView srcView, int position) {
        this.H = srcView;
        this.F = position;
        if (srcView != null) {
            int[] iArr = new int[2];
            srcView.getLocationInWindow(iArr);
            int i4 = iArr[0];
            if (com.lxj.xpopup.util.h.H(getContext())) {
                int i5 = -((com.lxj.xpopup.util.h.t(getContext()) - iArr[0]) - srcView.getWidth());
                this.G = new Rect(i5, iArr[1], srcView.getWidth() + i5, srcView.getHeight() + iArr[1]);
            } else {
                this.G = new Rect(i4, iArr[1], srcView.getWidth() + i4, srcView.getHeight() + iArr[1]);
            }
        }
        return this;
    }

    public ImageViewerPopupView G0(h srcViewUpdateListener) {
        this.E = srcViewUpdateListener;
        return this;
    }

    public ImageViewerPopupView H0(k imageLoader) {
        this.D = imageLoader;
        return this;
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected final int J() {
        return b.k.f68826o;
    }

    public void K0(ImageView srcView) {
        F0(srcView, this.F);
        q0();
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void Z() {
        this.f69606y = (TextView) findViewById(b.h.m6);
        this.f69607z = (TextView) findViewById(b.h.n6);
        this.f69605x = (BlankView) findViewById(b.h.f4);
        PhotoViewContainer photoViewContainer = (PhotoViewContainer) findViewById(b.h.f68636d4);
        this.f69604w = photoViewContainer;
        photoViewContainer.i(this);
        this.A = (HackyViewPager) findViewById(b.h.T3);
        e eVar = new e();
        this.A.X(eVar);
        this.A.Y(this.F);
        this.A.setVisibility(4);
        q0();
        this.A.d0(2);
        this.A.c(eVar);
        if (!this.O) {
            this.f69606y.setVisibility(8);
        }
        if (this.N) {
            this.f69607z.setOnClickListener(this);
        } else {
            this.f69607z.setVisibility(8);
        }
    }

    @Override // gb.d
    public void a(int dy, float scale, float fraction) {
        float f4 = 1.0f - fraction;
        this.f69606y.setAlpha(f4);
        View view = this.Q;
        if (view != null) {
            view.setAlpha(f4);
        }
        if (this.N) {
            this.f69607z.setAlpha(f4);
        }
        this.f69604w.setBackgroundColor(((Integer) this.B.evaluate(fraction * 0.8f, Integer.valueOf(this.R), 0)).intValue());
    }

    @Override // gb.d
    public void e() {
        t();
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void e0() {
        this.H = null;
        this.E = null;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v4) {
        if (v4 == this.f69607z) {
            x0();
        }
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    public void r() {
        super.r();
        HackyViewPager hackyViewPager = this.A;
        hackyViewPager.T((e) hackyViewPager.u());
        this.D = null;
    }

    protected int s0() {
        return this.P ? this.F % this.C.size() : this.F;
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    public void t() {
        if (this.f69532g != fb.e.Show) {
            return;
        }
        this.f69532g = fb.e.Dismissing;
        y();
    }

    public ImageViewerPopupView t0(boolean isInfinite) {
        this.P = isInfinite;
        return this;
    }

    public ImageViewerPopupView u0(boolean isShow) {
        this.O = isShow;
        return this;
    }

    public ImageViewerPopupView v0(boolean isShow) {
        this.J = isShow;
        return this;
    }

    public ImageViewerPopupView w0(boolean isShowSaveBtn) {
        this.N = isShowSaveBtn;
        return this;
    }

    protected void x0() {
        XPermission.p(getContext(), ProtectedSandApp.s("ព\u0001")).o(new d()).F();
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    public void y() {
        if (this.H != null) {
            this.f69606y.setVisibility(4);
            this.f69607z.setVisibility(4);
            this.A.setVisibility(4);
            this.f69604w.f69899g = true;
            this.I.setVisibility(0);
            this.I.post(new c());
            return;
        }
        this.f69604w.setBackgroundColor(0);
        w();
        this.A.setVisibility(4);
        this.f69605x.setVisibility(4);
        View view = this.Q;
        if (view != null) {
            view.setAlpha(0.0f);
            this.Q.setVisibility(4);
        }
    }

    public ImageViewerPopupView y0(int bgColor) {
        this.R = bgColor;
        return this;
    }

    public ImageViewerPopupView z0(List<Object> urls) {
        this.C = urls;
        return this;
    }
}
