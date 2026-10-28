package com.lxj.xpopup.animator;

import android.view.View;

/* compiled from: EmptyAnimator.java */
/* loaded from: classes6.dex */
public class b extends c {
    public b(View target, int animationDuration) {
        super(target, animationDuration, null);
    }

    @Override // com.lxj.xpopup.animator.c
    public void a() {
        if (this.f67864a) {
            return;
        }
        f(this.f67866c.animate().alpha(0.0f).setDuration(this.f67867d).withLayer()).start();
    }

    @Override // com.lxj.xpopup.animator.c
    public void b() {
        this.f67866c.animate().alpha(1.0f).setDuration(this.f67867d).withLayer().start();
    }

    @Override // com.lxj.xpopup.animator.c
    public void d() {
        this.f67866c.setAlpha(0.0f);
    }
}
