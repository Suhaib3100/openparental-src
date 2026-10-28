package com.devspark.progressfragment.states;

import android.view.View;
import android.view.animation.Animation;

/* compiled from: AbstractShowState.java */
/* loaded from: classes3.dex */
public abstract class a implements g {

    /* renamed from: a, reason: collision with root package name */
    protected View f48393a;

    /* renamed from: b, reason: collision with root package name */
    protected Animation f48394b;

    /* renamed from: c, reason: collision with root package name */
    protected Animation f48395c;

    @Override // com.devspark.progressfragment.states.g
    public void b(Animation animation) {
        this.f48395c = animation;
    }

    @Override // com.devspark.progressfragment.states.g
    public void d(Animation animation) {
        this.f48394b = animation;
    }

    @Override // com.devspark.progressfragment.states.g
    public void e(View view) {
        this.f48393a = view;
    }

    protected void f(int i4, boolean z4) {
        View findViewById = this.f48393a.findViewById(i4);
        if (z4) {
            this.f48395c.reset();
            findViewById.startAnimation(this.f48395c);
        } else {
            findViewById.clearAnimation();
        }
        findViewById.setVisibility(8);
    }

    protected void g(int i4, boolean z4) {
        View findViewById = this.f48393a.findViewById(i4);
        if (z4) {
            this.f48394b.reset();
            findViewById.startAnimation(this.f48394b);
        } else {
            findViewById.clearAnimation();
        }
        findViewById.setVisibility(0);
    }
}
