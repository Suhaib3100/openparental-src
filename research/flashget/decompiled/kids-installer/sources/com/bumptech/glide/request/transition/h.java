package com.bumptech.glide.request.transition;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.bumptech.glide.request.transition.k;

/* compiled from: ViewAnimationFactory.java */
/* loaded from: classes3.dex */
public class h<R> implements g<R> {

    /* renamed from: a, reason: collision with root package name */
    private final k.a f12119a;

    /* renamed from: b, reason: collision with root package name */
    private f<R> f12120b;

    /* compiled from: ViewAnimationFactory.java */
    private static class a implements k.a {

        /* renamed from: a, reason: collision with root package name */
        private final Animation f12121a;

        a(Animation animation) {
            this.f12121a = animation;
        }

        @Override // com.bumptech.glide.request.transition.k.a
        public Animation a(Context context) {
            return this.f12121a;
        }
    }

    /* compiled from: ViewAnimationFactory.java */
    private static class b implements k.a {

        /* renamed from: a, reason: collision with root package name */
        private final int f12122a;

        b(int i5) {
            this.f12122a = i5;
        }

        @Override // com.bumptech.glide.request.transition.k.a
        public Animation a(Context context) {
            return AnimationUtils.loadAnimation(context, this.f12122a);
        }
    }

    public h(Animation animation) {
        this(new a(animation));
    }

    @Override // com.bumptech.glide.request.transition.g
    public f<R> a(com.bumptech.glide.load.a aVar, boolean z5) {
        if (aVar == com.bumptech.glide.load.a.MEMORY_CACHE || !z5) {
            return e.b();
        }
        if (this.f12120b == null) {
            this.f12120b = new k(this.f12119a);
        }
        return this.f12120b;
    }

    public h(int i5) {
        this(new b(i5));
    }

    h(k.a aVar) {
        this.f12119a = aVar;
    }
}
