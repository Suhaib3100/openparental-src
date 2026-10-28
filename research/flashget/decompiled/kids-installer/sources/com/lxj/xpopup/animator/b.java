package com.lxj.xpopup.animator;

import android.view.View;

/* compiled from: EmptyAnimator.java */
/* loaded from: classes5.dex */
public class b extends c {
    public b(View target, int animationDuration) {
        super(target, animationDuration, null);
    }

    @Override // com.lxj.xpopup.animator.c
    public void a() {
        if (this.f19786a) {
            return;
        }
        f(this.f19788c.animate().alpha(0.0f).setDuration(this.f19789d).withLayer()).start();
    }

    @Override // com.lxj.xpopup.animator.c
    public void b() {
        this.f19788c.animate().alpha(1.0f).setDuration(this.f19789d).withLayer().start();
    }

    @Override // com.lxj.xpopup.animator.c
    public void d() {
        this.f19788c.setAlpha(0.0f);
    }
}
