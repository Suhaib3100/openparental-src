package com.nostra13.universalimageloader.core.display;

import android.graphics.Bitmap;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.DecelerateInterpolator;

/* compiled from: FadeInBitmapDisplayer.java */
/* loaded from: classes6.dex */
public class c implements a {

    /* renamed from: a, reason: collision with root package name */
    private final int f70378a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f70379b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f70380c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f70381d;

    public c(int i4) {
        this(i4, true, true, true);
    }

    public static void b(View view, int i4) {
        if (view != null) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(i4);
            alphaAnimation.setInterpolator(new DecelerateInterpolator());
            view.startAnimation(alphaAnimation);
        }
    }

    @Override // com.nostra13.universalimageloader.core.display.a
    public void a(Bitmap bitmap, com.nostra13.universalimageloader.core.imageaware.a aVar, com.nostra13.universalimageloader.core.assist.f fVar) {
        aVar.f(bitmap);
        if ((this.f70379b && fVar == com.nostra13.universalimageloader.core.assist.f.NETWORK) || ((this.f70380c && fVar == com.nostra13.universalimageloader.core.assist.f.DISC_CACHE) || (this.f70381d && fVar == com.nostra13.universalimageloader.core.assist.f.MEMORY_CACHE))) {
            b(aVar.b(), this.f70378a);
        }
    }

    public c(int i4, boolean z4, boolean z5, boolean z6) {
        this.f70378a = i4;
        this.f70379b = z4;
        this.f70380c = z5;
        this.f70381d = z6;
    }
}
