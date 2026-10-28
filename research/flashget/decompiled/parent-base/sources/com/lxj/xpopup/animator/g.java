package com.lxj.xpopup.animator;

import android.view.View;

/* compiled from: TranslateAlphaAnimator.java */
/* loaded from: classes6.dex */
public class g extends c {

    /* renamed from: f, reason: collision with root package name */
    private float f67891f;

    /* renamed from: g, reason: collision with root package name */
    private float f67892g;

    /* renamed from: h, reason: collision with root package name */
    private float f67893h;

    /* renamed from: i, reason: collision with root package name */
    private float f67894i;

    /* compiled from: TranslateAlphaAnimator.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f67895a;

        static {
            int[] iArr = new int[fb.c.values().length];
            f67895a = iArr;
            try {
                iArr[fb.c.TranslateAlphaFromLeft.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f67895a[fb.c.TranslateAlphaFromTop.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f67895a[fb.c.TranslateAlphaFromRight.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f67895a[fb.c.TranslateAlphaFromBottom.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public g(View target, int animationDuration, fb.c popupAnimation) {
        super(target, animationDuration, popupAnimation);
    }

    private void g() {
        int i4 = a.f67895a[this.f67868e.ordinal()];
        if (i4 == 1) {
            this.f67866c.setTranslationX(-r0.getMeasuredWidth());
            return;
        }
        if (i4 == 2) {
            this.f67866c.setTranslationY(-r0.getMeasuredHeight());
        } else if (i4 == 3) {
            this.f67866c.setTranslationX(r0.getMeasuredWidth());
        } else {
            if (i4 != 4) {
                return;
            }
            this.f67866c.setTranslationY(r0.getMeasuredHeight());
        }
    }

    @Override // com.lxj.xpopup.animator.c
    public void a() {
        if (this.f67864a) {
            return;
        }
        f(this.f67866c.animate().translationX(this.f67891f).translationY(this.f67892g).alpha(0.0f).setInterpolator(new androidx.interpolator.view.animation.b()).setDuration(this.f67867d).withLayer()).start();
    }

    @Override // com.lxj.xpopup.animator.c
    public void b() {
        this.f67866c.animate().translationX(this.f67893h).translationY(this.f67894i).alpha(1.0f).setInterpolator(new androidx.interpolator.view.animation.b()).setDuration(this.f67867d).withLayer().start();
    }

    @Override // com.lxj.xpopup.animator.c
    public void d() {
        this.f67893h = this.f67866c.getTranslationX();
        this.f67894i = this.f67866c.getTranslationY();
        this.f67866c.setAlpha(0.0f);
        g();
        this.f67891f = this.f67866c.getTranslationX();
        this.f67892g = this.f67866c.getTranslationY();
    }
}
