package com.lxj.xpopup.animator;

import android.view.View;
import android.view.animation.OvershootInterpolator;

/* compiled from: ScaleAlphaAnimator.java */
/* loaded from: classes6.dex */
public class d extends com.lxj.xpopup.animator.c {

    /* renamed from: f, reason: collision with root package name */
    float f67871f;

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
            d.this.f67866c.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(d.this.f67867d).setInterpolator(new OvershootInterpolator(1.0f)).start();
        }
    }

    /* compiled from: ScaleAlphaAnimator.java */
    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f67874a;

        static {
            int[] iArr = new int[fb.c.values().length];
            f67874a = iArr;
            try {
                iArr[fb.c.ScaleAlphaFromCenter.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f67874a[fb.c.ScaleAlphaFromLeftTop.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f67874a[fb.c.ScaleAlphaFromRightTop.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f67874a[fb.c.ScaleAlphaFromLeftBottom.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f67874a[fb.c.ScaleAlphaFromRightBottom.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public d(View target, int animationDuration, fb.c popupAnimation) {
        super(target, animationDuration, popupAnimation);
        this.f67871f = 0.95f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        int i4 = c.f67874a[this.f67868e.ordinal()];
        if (i4 == 1) {
            this.f67866c.setPivotX(r0.getMeasuredWidth() / 2.0f);
            this.f67866c.setPivotY(r0.getMeasuredHeight() / 2.0f);
            return;
        }
        if (i4 == 2) {
            this.f67866c.setPivotX(0.0f);
            this.f67866c.setPivotY(0.0f);
            return;
        }
        if (i4 == 3) {
            this.f67866c.setPivotX(r0.getMeasuredWidth());
            this.f67866c.setPivotY(0.0f);
        } else if (i4 == 4) {
            this.f67866c.setPivotX(0.0f);
            this.f67866c.setPivotY(r0.getMeasuredHeight());
        } else {
            if (i4 != 5) {
                return;
            }
            this.f67866c.setPivotX(r0.getMeasuredWidth());
            this.f67866c.setPivotY(r0.getMeasuredHeight());
        }
    }

    @Override // com.lxj.xpopup.animator.c
    public void a() {
        if (this.f67864a) {
            return;
        }
        f(this.f67866c.animate().scaleX(this.f67871f).scaleY(this.f67871f).alpha(0.0f).setDuration(this.f67867d).setInterpolator(new androidx.interpolator.view.animation.b())).start();
    }

    @Override // com.lxj.xpopup.animator.c
    public void b() {
        this.f67866c.post(new b());
    }

    @Override // com.lxj.xpopup.animator.c
    public void d() {
        this.f67866c.setScaleX(this.f67871f);
        this.f67866c.setScaleY(this.f67871f);
        this.f67866c.setAlpha(0.0f);
        this.f67866c.post(new a());
    }
}
