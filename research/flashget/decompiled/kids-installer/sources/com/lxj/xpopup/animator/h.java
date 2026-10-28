package com.lxj.xpopup.animator;

import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: TranslateAnimator.java */
/* loaded from: classes5.dex */
public class h extends c {

    /* renamed from: f, reason: collision with root package name */
    public float f19818f;

    /* renamed from: g, reason: collision with root package name */
    public float f19819g;

    /* renamed from: h, reason: collision with root package name */
    public float f19820h;

    /* renamed from: i, reason: collision with root package name */
    public float f19821i;

    /* compiled from: TranslateAnimator.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19822a;

        static {
            int[] iArr = new int[b3.c.values().length];
            f19822a = iArr;
            try {
                iArr[b3.c.TranslateFromLeft.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19822a[b3.c.TranslateFromTop.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19822a[b3.c.TranslateFromRight.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19822a[b3.c.TranslateFromBottom.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public h(View target, int animationDuration, b3.c popupAnimation) {
        super(target, animationDuration, popupAnimation);
    }

    private void g() {
        int i5 = a.f19822a[this.f19790e.ordinal()];
        if (i5 == 1) {
            this.f19788c.setTranslationX(this.f19788c.getTranslationX() + (-r0.getRight()));
            return;
        }
        if (i5 == 2) {
            this.f19788c.setTranslationY(this.f19788c.getTranslationY() + (-r0.getBottom()));
        } else if (i5 == 3) {
            this.f19788c.setTranslationX(this.f19788c.getTranslationX() + (((View) r0.getParent()).getMeasuredWidth() - this.f19788c.getLeft()));
        } else {
            if (i5 != 4) {
                return;
            }
            this.f19788c.setTranslationY(this.f19788c.getTranslationY() + (((View) r0.getParent()).getMeasuredHeight() - this.f19788c.getTop()));
        }
    }

    @Override // com.lxj.xpopup.animator.c
    public void a() {
        ViewPropertyAnimator translationX;
        if (this.f19786a) {
            return;
        }
        int i5 = a.f19822a[this.f19790e.ordinal()];
        if (i5 == 1) {
            this.f19818f = -this.f19788c.getRight();
            translationX = this.f19788c.animate().translationX(this.f19818f);
        } else if (i5 == 2) {
            this.f19819g = -this.f19788c.getBottom();
            translationX = this.f19788c.animate().translationY(this.f19819g);
        } else if (i5 == 3) {
            this.f19818f = ((View) this.f19788c.getParent()).getMeasuredWidth() - this.f19788c.getLeft();
            translationX = this.f19788c.animate().translationX(this.f19818f);
        } else if (i5 != 4) {
            translationX = null;
        } else {
            this.f19819g = ((View) this.f19788c.getParent()).getMeasuredHeight() - this.f19788c.getTop();
            translationX = this.f19788c.animate().translationY(this.f19819g);
        }
        if (translationX != null) {
            f(translationX.setInterpolator(new androidx.interpolator.view.animation.b()).setDuration((long) (this.f19789d * 0.8d)).withLayer()).start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    @Override // com.lxj.xpopup.animator.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b() {
        /*
            r3 = this;
            int[] r0 = com.lxj.xpopup.animator.h.a.f19822a
            b3.c r1 = r3.f19790e
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L25
            r1 = 2
            if (r0 == r1) goto L18
            r1 = 3
            if (r0 == r1) goto L25
            r1 = 4
            if (r0 == r1) goto L18
            r0 = 0
            goto L31
        L18:
            android.view.View r0 = r3.f19788c
            android.view.ViewPropertyAnimator r0 = r0.animate()
            float r1 = r3.f19821i
            android.view.ViewPropertyAnimator r0 = r0.translationY(r1)
            goto L31
        L25:
            android.view.View r0 = r3.f19788c
            android.view.ViewPropertyAnimator r0 = r0.animate()
            float r1 = r3.f19820h
            android.view.ViewPropertyAnimator r0 = r0.translationX(r1)
        L31:
            if (r0 == 0) goto L4a
            androidx.interpolator.view.animation.b r1 = new androidx.interpolator.view.animation.b
            r1.<init>()
            android.view.ViewPropertyAnimator r0 = r0.setInterpolator(r1)
            int r1 = r3.f19789d
            long r1 = (long) r1
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r1)
            android.view.ViewPropertyAnimator r0 = r0.withLayer()
            r0.start()
        L4a:
            android.view.View r0 = r3.f19788c
            r0.getTranslationY()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lxj.xpopup.animator.h.b():void");
    }

    @Override // com.lxj.xpopup.animator.c
    public void d() {
        if (this.f19787b) {
            return;
        }
        this.f19820h = this.f19788c.getTranslationX();
        this.f19821i = this.f19788c.getTranslationY();
        g();
        this.f19818f = this.f19788c.getTranslationX();
        this.f19819g = this.f19788c.getTranslationY();
    }
}
