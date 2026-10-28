package com.lxj.xpopup.animator;

import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: TranslateAnimator.java */
/* loaded from: classes6.dex */
public class h extends c {

    /* renamed from: f, reason: collision with root package name */
    public float f67896f;

    /* renamed from: g, reason: collision with root package name */
    public float f67897g;

    /* renamed from: h, reason: collision with root package name */
    public float f67898h;

    /* renamed from: i, reason: collision with root package name */
    public float f67899i;

    /* compiled from: TranslateAnimator.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f67900a;

        static {
            int[] iArr = new int[fb.c.values().length];
            f67900a = iArr;
            try {
                iArr[fb.c.TranslateFromLeft.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f67900a[fb.c.TranslateFromTop.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f67900a[fb.c.TranslateFromRight.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f67900a[fb.c.TranslateFromBottom.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public h(View target, int animationDuration, fb.c popupAnimation) {
        super(target, animationDuration, popupAnimation);
    }

    private void g() {
        int i4 = a.f67900a[this.f67868e.ordinal()];
        if (i4 == 1) {
            this.f67866c.setTranslationX(this.f67866c.getTranslationX() + (-r0.getRight()));
            return;
        }
        if (i4 == 2) {
            this.f67866c.setTranslationY(this.f67866c.getTranslationY() + (-r0.getBottom()));
        } else if (i4 == 3) {
            this.f67866c.setTranslationX(this.f67866c.getTranslationX() + (((View) r0.getParent()).getMeasuredWidth() - this.f67866c.getLeft()));
        } else {
            if (i4 != 4) {
                return;
            }
            this.f67866c.setTranslationY(this.f67866c.getTranslationY() + (((View) r0.getParent()).getMeasuredHeight() - this.f67866c.getTop()));
        }
    }

    @Override // com.lxj.xpopup.animator.c
    public void a() {
        ViewPropertyAnimator translationX;
        if (this.f67864a) {
            return;
        }
        int i4 = a.f67900a[this.f67868e.ordinal()];
        if (i4 == 1) {
            this.f67896f = -this.f67866c.getRight();
            translationX = this.f67866c.animate().translationX(this.f67896f);
        } else if (i4 == 2) {
            this.f67897g = -this.f67866c.getBottom();
            translationX = this.f67866c.animate().translationY(this.f67897g);
        } else if (i4 == 3) {
            this.f67896f = ((View) this.f67866c.getParent()).getMeasuredWidth() - this.f67866c.getLeft();
            translationX = this.f67866c.animate().translationX(this.f67896f);
        } else if (i4 != 4) {
            translationX = null;
        } else {
            this.f67897g = ((View) this.f67866c.getParent()).getMeasuredHeight() - this.f67866c.getTop();
            translationX = this.f67866c.animate().translationY(this.f67897g);
        }
        if (translationX != null) {
            f(translationX.setInterpolator(new androidx.interpolator.view.animation.b()).setDuration((long) (this.f67867d * 0.8d)).withLayer()).start();
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
            int[] r0 = com.lxj.xpopup.animator.h.a.f67900a
            fb.c r1 = r3.f67868e
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
            android.view.View r0 = r3.f67866c
            android.view.ViewPropertyAnimator r0 = r0.animate()
            float r1 = r3.f67899i
            android.view.ViewPropertyAnimator r0 = r0.translationY(r1)
            goto L31
        L25:
            android.view.View r0 = r3.f67866c
            android.view.ViewPropertyAnimator r0 = r0.animate()
            float r1 = r3.f67898h
            android.view.ViewPropertyAnimator r0 = r0.translationX(r1)
        L31:
            if (r0 == 0) goto L4a
            androidx.interpolator.view.animation.b r1 = new androidx.interpolator.view.animation.b
            r1.<init>()
            android.view.ViewPropertyAnimator r0 = r0.setInterpolator(r1)
            int r1 = r3.f67867d
            long r1 = (long) r1
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r1)
            android.view.ViewPropertyAnimator r0 = r0.withLayer()
            r0.start()
        L4a:
            android.view.View r0 = r3.f67866c
            r0.getTranslationY()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lxj.xpopup.animator.h.b():void");
    }

    @Override // com.lxj.xpopup.animator.c
    public void d() {
        if (this.f67865b) {
            return;
        }
        this.f67898h = this.f67866c.getTranslationX();
        this.f67899i = this.f67866c.getTranslationY();
        g();
        this.f67896f = this.f67866c.getTranslationX();
        this.f67897g = this.f67866c.getTranslationY();
    }
}
