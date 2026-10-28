package com.lxj.xpopup.animator;

import android.view.View;
import android.view.animation.OvershootInterpolator;

/* compiled from: ScaleAlphaAnimator.java */
/* loaded from: classes5.dex */
public class d extends com.lxj.xpopup.animator.c {

    /* renamed from: f, reason: collision with root package name */
    float f19793f;

    /* compiled from: ScaleAlphaAnimator.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.h();
        }
    }

    /* compiled from: ScaleAlphaAnimator.java */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f19788c.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(d.this.f19789d).setInterpolator(new OvershootInterpolator(1.0f)).start();
        }
    }

    /* compiled from: ScaleAlphaAnimator.java */
    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19796a;

        static {
            int[] iArr = new int[b3.c.values().length];
            f19796a = iArr;
            try {
                iArr[b3.c.ScaleAlphaFromCenter.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19796a[b3.c.ScaleAlphaFromLeftTop.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19796a[b3.c.ScaleAlphaFromRightTop.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19796a[b3.c.ScaleAlphaFromLeftBottom.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19796a[b3.c.ScaleAlphaFromRightBottom.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public d(View target, int animationDuration, b3.c popupAnimation) {
        super(target, animationDuration, popupAnimation);
        this.f19793f = 0.95f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        int i5 = c.f19796a[this.f19790e.ordinal()];
        if (i5 == 1) {
            this.f19788c.setPivotX(r0.getMeasuredWidth() / 2.0f);
            this.f19788c.setPivotY(r0.getMeasuredHeight() / 2.0f);
            return;
        }
        if (i5 == 2) {
            this.f19788c.setPivotX(0.0f);
            this.f19788c.setPivotY(0.0f);
            return;
        }
        if (i5 == 3) {
            this.f19788c.setPivotX(r0.getMeasuredWidth());
            this.f19788c.setPivotY(0.0f);
        } else if (i5 == 4) {
            this.f19788c.setPivotX(0.0f);
            this.f19788c.setPivotY(r0.getMeasuredHeight());
        } else {
            if (i5 != 5) {
                return;
            }
            this.f19788c.setPivotX(r0.getMeasuredWidth());
            this.f19788c.setPivotY(r0.getMeasuredHeight());
        }
    }

    @Override // com.lxj.xpopup.animator.c
    public void a() {
        if (this.f19786a) {
            return;
        }
        f(this.f19788c.animate().scaleX(this.f19793f).scaleY(this.f19793f).alpha(0.0f).setDuration(this.f19789d).setInterpolator(new androidx.interpolator.view.animation.b())).start();
    }

    @Override // com.lxj.xpopup.animator.c
    public void b() {
        this.f19788c.post(new b());
    }

    @Override // com.lxj.xpopup.animator.c
    public void d() {
        this.f19788c.setScaleX(this.f19793f);
        this.f19788c.setScaleY(this.f19793f);
        this.f19788c.setAlpha(0.0f);
        this.f19788c.post(new a());
    }
}
