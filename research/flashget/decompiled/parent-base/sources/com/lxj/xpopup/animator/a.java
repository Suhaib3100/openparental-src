package com.lxj.xpopup.animator;

import android.animation.FloatEvaluator;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;

/* compiled from: BlurAnimator.java */
/* loaded from: classes6.dex */
public class a extends c {

    /* renamed from: f, reason: collision with root package name */
    private FloatEvaluator f67860f;

    /* renamed from: g, reason: collision with root package name */
    public int f67861g;

    /* renamed from: h, reason: collision with root package name */
    public Bitmap f67862h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f67863i;

    public a(View target, int shadowColor) {
        super(target, 0, null);
        this.f67860f = new FloatEvaluator();
        this.f67863i = false;
        this.f67861g = shadowColor;
    }

    @Override // com.lxj.xpopup.animator.c
    public void a() {
    }

    @Override // com.lxj.xpopup.animator.c
    public void b() {
    }

    @Override // com.lxj.xpopup.animator.c
    public void d() {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f67866c.getResources(), com.lxj.xpopup.util.h.P(this.f67866c.getContext(), this.f67862h, 10.0f, true));
        if (this.f67863i) {
            bitmapDrawable.setColorFilter(this.f67861g, PorterDuff.Mode.SRC_OVER);
        }
        this.f67866c.setBackground(bitmapDrawable);
    }

    public a() {
        this.f67860f = new FloatEvaluator();
        this.f67863i = false;
    }
}
