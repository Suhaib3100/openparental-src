package com.lxj.xpopup.animator;

import android.animation.FloatEvaluator;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;

/* compiled from: BlurAnimator.java */
/* loaded from: classes5.dex */
public class a extends c {

    /* renamed from: f, reason: collision with root package name */
    private FloatEvaluator f19782f;

    /* renamed from: g, reason: collision with root package name */
    public int f19783g;

    /* renamed from: h, reason: collision with root package name */
    public Bitmap f19784h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f19785i;

    public a(View target, int shadowColor) {
        super(target, 0, null);
        this.f19782f = new FloatEvaluator();
        this.f19785i = false;
        this.f19783g = shadowColor;
    }

    @Override // com.lxj.xpopup.animator.c
    public void a() {
    }

    @Override // com.lxj.xpopup.animator.c
    public void b() {
    }

    @Override // com.lxj.xpopup.animator.c
    public void d() {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f19788c.getResources(), com.lxj.xpopup.util.h.P(this.f19788c.getContext(), this.f19784h, 10.0f, true));
        if (this.f19785i) {
            bitmapDrawable.setColorFilter(this.f19783g, PorterDuff.Mode.SRC_OVER);
        }
        this.f19788c.setBackground(bitmapDrawable);
    }

    public a() {
        this.f19782f = new FloatEvaluator();
        this.f19785i = false;
    }
}
