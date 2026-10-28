package com.lxj.xpopup.animator;

import android.view.View;

/* compiled from: TranslateAlphaAnimator.java */
/* loaded from: classes5.dex */
public class g extends c {

    /* renamed from: f, reason: collision with root package name */
    private float f19813f;

    /* renamed from: g, reason: collision with root package name */
    private float f19814g;

    /* renamed from: h, reason: collision with root package name */
    private float f19815h;

    /* renamed from: i, reason: collision with root package name */
    private float f19816i;

    /* compiled from: TranslateAlphaAnimator.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19817a;

        static {
            int[] iArr = new int[b3.c.values().length];
            f19817a = iArr;
            try {
                iArr[b3.c.TranslateAlphaFromLeft.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19817a[b3.c.TranslateAlphaFromTop.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19817a[b3.c.TranslateAlphaFromRight.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19817a[b3.c.TranslateAlphaFromBottom.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public g(View target, int animationDuration, b3.c popupAnimation) {
        super(target, animationDuration, popupAnimation);
    }

    private void g() {
        int i5 = a.f19817a[this.f19790e.ordinal()];
        if (i5 == 1) {
            this.f19788c.setTranslationX(-r0.getMeasuredWidth());
            return;
        }
        if (i5 == 2) {
            this.f19788c.setTranslationY(-r0.getMeasuredHeight());
        } else if (i5 == 3) {
            this.f19788c.setTranslationX(r0.getMeasuredWidth());
        } else {
            if (i5 != 4) {
                return;
            }
            this.f19788c.setTranslationY(r0.getMeasuredHeight());
        }
    }

    @Override // com.lxj.xpopup.animator.c
    public void a() {
        if (this.f19786a) {
            return;
        }
        f(this.f19788c.animate().translationX(this.f19813f).translationY(this.f19814g).alpha(0.0f).setInterpolator(new androidx.interpolator.view.animation.b()).setDuration(this.f19789d).withLayer()).start();
    }

    @Override // com.lxj.xpopup.animator.c
    public void b() {
        this.f19788c.animate().translationX(this.f19815h).translationY(this.f19816i).alpha(1.0f).setInterpolator(new androidx.interpolator.view.animation.b()).setDuration(this.f19789d).withLayer().start();
    }

    @Override // com.lxj.xpopup.animator.c
    public void d() {
        this.f19815h = this.f19788c.getTranslationX();
        this.f19816i = this.f19788c.getTranslationY();
        this.f19788c.setAlpha(0.0f);
        g();
        this.f19813f = this.f19788c.getTranslationX();
        this.f19814g = this.f19788c.getTranslationY();
    }
}
